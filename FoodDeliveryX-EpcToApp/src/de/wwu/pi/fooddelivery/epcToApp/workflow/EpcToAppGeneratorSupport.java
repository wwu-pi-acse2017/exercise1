package de.wwu.pi.fooddelivery.epcToApp.workflow;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class EpcToAppGeneratorSupport extends AbstractGenericResourceSupport {

	@Override
	protected Module createGuiceModule() {
		return new EpcToAppGeneratorModule();
	}

}
