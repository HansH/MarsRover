/*
 * generated by Xtext
 */
package nl.marsrover.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import nl.marsrover.ui.internal.DSLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DSLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DSLActivator.getInstance().getInjector(DSLActivator.NL_MARSROVER_DSL);
	}
	
}