package de.wwu.pi.fooddelivery.epcToApp.workflow;

import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class EpcToAppGeneratorSetup implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		return Guice.createInjector(new EpcToAppGeneratorModule());
	}

}
