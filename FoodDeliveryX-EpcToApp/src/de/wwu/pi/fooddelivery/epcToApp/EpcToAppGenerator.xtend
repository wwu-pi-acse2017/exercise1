package de.wwu.pi.fooddelivery.epcToApp

import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class EpcToAppGenerator implements IGenerator {
	def static isModel(Resource input) {
		input.getURI.path.endsWith(".epc")
	}

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		System::out.print("EpcToAppGenerator.doGenerate called with resource " + input.getURI)
		if (isModel(input)) {
			System::out.println(" - Generating ...")
			input.contents.filter(typeof(Epc)).forEach[doGenerate(fsa)]
		} else
			System::out.println(" - Skipped.")
	}

	def doGenerate(Epc model, IFileSystemAccess fsa) {
		// starting point for generator
		
		// Generate backing bean for process
		EpcToAppGenerator::createAndGenerateFile(fsa, model.name.toCamelCase + ".java", BackingBeanGen::generateBackingBean(model))
		
		// Generate views for process
		model.nodes.filter(typeof(Function)).forEach[step | 
			EpcToAppGenerator::createAndGenerateFile(fsa, /* ...  */ + ".xhtml", ViewGen::generateView(step))
		]
	}
		
	/**
	 * workaround to prevent "ERROR Resource.generic.XMLEncodingProvider  - Error detecting encoding"
	 */
	def static createAndGenerateFile(IFileSystemAccess fsa, String fileName, CharSequence contents) {
		var targetFile = new File("src-gen" + File.separator + fileName) //@TODO ATTENTION be careful: src-gen is specified in EpcToAppGenerator 
		var parent = targetFile.parentFile
		if (!parent.exists() && !parent.mkdirs()) {
			throw new IllegalStateException("Couldn't create dir: " + parent);
		}
		targetFile.createNewFile
		fsa.generateFile(fileName, contents)
	}
}
