package de.wwu.pi.fooddelivery.epcToApp

import static extension de.wwu.pi.fooddelivery.epcToApp.GeneratorUtil.*

import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import Epc.Model
import Epc.Function

class EpcToAppGenerator implements IGenerator {
	def static isModel(Resource input) {
		input.getURI.path.endsWith(".epc")
	}

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		System::out.print("EpcToAppGenerator.doGenerate called with resource " + input.getURI)
		if (isModel(input)) {
			System::out.println(" - Generating ...")
			input.contents.filter(typeof(Model)).forEach[doGenerate(fsa)]
		} else
			System::out.println(" - Skipped.")
	}

	def doGenerate(Model model, IFileSystemAccess fsa) {
		// Starting point for generator
		
		// Generate backing bean for process
		createAndGenerateFile(fsa, model.name.toCamelCase + ".java", new BackingBeanGen().generateBackingBean(model))
		
		// Generate views for process
		model.nodes.filter(typeof(Function)).forEach[/* fsa, "some.xhtml", ViewGen::generateView(step) */]
		
		// Generate navigation
		// ...
	}
		
	/**
	 * workaround to prevent "ERROR Resource.generic.XMLEncodingProvider  - Error detecting encoding"
	 */
	def createAndGenerateFile(IFileSystemAccess fsa, String fileName, CharSequence contents) {
		var targetFile = new File("src-gen" + File.separator + fileName) //@TODO ATTENTION be careful: src-gen is specified in EpcToAppGenerator 
		var parent = targetFile.parentFile
		if (!parent.exists() && !parent.mkdirs()) {
			throw new IllegalStateException("Couldn't create dir: " + parent);
		}
		targetFile.createNewFile
		fsa.generateFile(fileName, contents)
	}
}
