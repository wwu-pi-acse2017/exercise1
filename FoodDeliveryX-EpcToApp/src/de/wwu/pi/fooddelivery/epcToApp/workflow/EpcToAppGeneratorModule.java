package de.wwu.pi.fooddelivery.epcToApp.workflow;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

import de.wwu.pi.fooddelivery.epcToApp.EpcToAppGenerator;

public class EpcToAppGeneratorModule extends
		AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "de.wwu.pi.epc.presentation.EpcEditorID";
	}

	@Override
	protected String getFileExtensions() {
		return "epc";
	}
	
	public Class<? extends IGenerator> bindIGenerator() {
		return EpcToAppGenerator.class;
	}
	
	public Class<? extends ResourceSet> bindResourceSet() {
		return ResourceSetImpl.class;
	}
}
