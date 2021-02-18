/*
 * generated by Xtext 2.22.0
 */
package csc498;

import com.google.inject.Guice;
import com.google.inject.Injector;
import csc498.dsl3.Dsl3Package;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

@SuppressWarnings("all")
public class Dsl3StandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new Dsl3RuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.Dsl3.csc498")) {
			EPackage.Registry.INSTANCE.put("http://www.Dsl3.csc498", Dsl3Package.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("dsl3", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("dsl3", serviceProvider);
	}
}