/*
* generated by Xtext
*/
package nl.marsrover;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DSLStandaloneSetup extends DSLStandaloneSetupGenerated{

	public static void doSetup() {
		new DSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
