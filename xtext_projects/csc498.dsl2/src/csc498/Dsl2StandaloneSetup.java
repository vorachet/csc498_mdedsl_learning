/*
 * generated by Xtext 2.22.0
 */
package csc498;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class Dsl2StandaloneSetup extends Dsl2StandaloneSetupGenerated {

	public static void doSetup() {
		new Dsl2StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
