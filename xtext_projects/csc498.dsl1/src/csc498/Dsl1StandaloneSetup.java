/*
 * generated by Xtext 2.22.0
 */
package csc498;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class Dsl1StandaloneSetup extends Dsl1StandaloneSetupGenerated {

	public static void doSetup() {
		new Dsl1StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}