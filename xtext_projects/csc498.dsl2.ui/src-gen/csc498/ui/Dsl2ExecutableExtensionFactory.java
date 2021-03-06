/*
 * generated by Xtext 2.22.0
 */
package csc498.ui;

import com.google.inject.Injector;
import csc498.dsl2.ui.internal.Dsl2Activator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Dsl2ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(Dsl2Activator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		Dsl2Activator activator = Dsl2Activator.getInstance();
		return activator != null ? activator.getInjector(Dsl2Activator.CSC498_DSL2) : null;
	}

}
