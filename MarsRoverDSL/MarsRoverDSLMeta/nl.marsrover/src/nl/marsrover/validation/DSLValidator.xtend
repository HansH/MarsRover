/*
 * generated by Xtext
 */
package nl.marsrover.validation

import nl.marsrover.dSL.Rule
import org.eclipse.xtext.validation.Check

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class DSLValidator extends AbstractDSLValidator {

	@Check
	def checkProbeOnlyAtLake(Rule rule) {
		if(rule.actionList.actions.exists[action | action.probeLake]
			&& !rule.conditionList.conditions.exists[condition | condition.atLake]) {
			
			error("'probe lake' can only be used in combination with 'at lake' condition", rule, null);
		}
		
		if(rule.conditionList.conditions.exists[condition | condition.isIsNotProbed]
			&& !rule.conditionList.conditions.exists[condition | condition.atLake]) {
			
			error("'lake has not been probed' can only be used in combination with 'at lake' condition", rule, null);
		}
	}
}
