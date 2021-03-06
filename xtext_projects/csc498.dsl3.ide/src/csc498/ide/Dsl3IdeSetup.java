/*
 * generated by Xtext 2.22.0
 */
package csc498.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import csc498.Dsl3RuntimeModule;
import csc498.Dsl3StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class Dsl3IdeSetup extends Dsl3StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new Dsl3RuntimeModule(), new Dsl3IdeModule()));
	}
	
}
