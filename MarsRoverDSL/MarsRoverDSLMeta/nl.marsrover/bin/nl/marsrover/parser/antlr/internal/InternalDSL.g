/*
* generated by Xtext
*/
grammar InternalDSL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package nl.marsrover.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package nl.marsrover.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.marsrover.services.DSLGrammarAccess;

}

@parser::members {

 	private DSLGrammarAccess grammarAccess;
 	
    public InternalDSLParser(TokenStream input, DSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Specification";	
   	}
   	
   	@Override
   	protected DSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSpecification
entryRuleSpecification returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSpecificationRule()); }
	 iv_ruleSpecification=ruleSpecification 
	 { $current=$iv_ruleSpecification.current; } 
	 EOF 
;

// Rule Specification
ruleSpecification returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getSpecificationAccess().getRuleRuleParserRuleCall_0()); 
	    }
		lv_rule_0_0=ruleRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSpecificationRule());
	        }
       		add(
       			$current, 
       			"rule",
        		lv_rule_0_0, 
        		"Rule");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	 iv_ruleRule=ruleRule 
	 { $current=$iv_ruleRule.current; } 
	 EOF 
;

// Rule Rule
ruleRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='if' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIfKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getConditionListConditionListParserRuleCall_1_0()); 
	    }
		lv_conditionList_1_0=ruleConditionList		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		set(
       			$current, 
       			"conditionList",
        		lv_conditionList_1_0, 
        		"ConditionList");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getCommaKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getActionListActionListParserRuleCall_3_0()); 
	    }
		lv_actionList_3_0=ruleActionList		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		set(
       			$current, 
       			"actionList",
        		lv_actionList_3_0, 
        		"ActionList");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleConditionList
entryRuleConditionList returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConditionListRule()); }
	 iv_ruleConditionList=ruleConditionList 
	 { $current=$iv_ruleConditionList.current; } 
	 EOF 
;

// Rule ConditionList
ruleConditionList returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getConditionListAccess().getConditionsConditionParserRuleCall_0_0()); 
	    }
		lv_conditions_0_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConditionListRule());
	        }
       		add(
       			$current, 
       			"conditions",
        		lv_conditions_0_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_1='and' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConditionListAccess().getAndKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConditionListAccess().getConditionsConditionParserRuleCall_1_1_0()); 
	    }
		lv_conditions_2_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConditionListRule());
	        }
       		add(
       			$current, 
       			"conditions",
        		lv_conditions_2_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	 iv_ruleCondition=ruleCondition 
	 { $current=$iv_ruleCondition.current; } 
	 EOF 
;

// Rule Condition
ruleCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		lv_not_0_0=	'not' 
    {
        newLeafNode(lv_not_0_0, grammarAccess.getConditionAccess().getNotNotKeyword_0_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConditionRule());
	        }
       		setWithLastConsumed($current, "not", true, "not");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getConditionAccess().getConditionConditionParserRuleCall_0_1_0()); 
	    }
		lv_condition_1_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConditionRule());
	        }
       		set(
       			$current, 
       			"condition",
        		lv_condition_1_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |(
(
		lv_allLakes_2_0=	'all lakes are found' 
    {
        newLeafNode(lv_allLakes_2_0, grammarAccess.getConditionAccess().getAllLakesAllLakesAreFoundKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConditionRule());
	        }
       		setWithLastConsumed($current, "allLakes", true, "all lakes are found");
	    }

)
)
    |((
(
		lv_collision_3_0=	'collision in less than' 
    {
        newLeafNode(lv_collision_3_0, grammarAccess.getConditionAccess().getCollisionCollisionInLessThanKeyword_2_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConditionRule());
	        }
       		setWithLastConsumed($current, "collision", true, "collision in less than");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getConditionAccess().getDistanceDistanceParserRuleCall_2_1_0()); 
	    }
		lv_distance_4_0=ruleDistance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConditionRule());
	        }
       		set(
       			$current, 
       			"distance",
        		lv_distance_4_0, 
        		"Distance");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |(
(
		lv_atLake_5_0=	'at lake' 
    {
        newLeafNode(lv_atLake_5_0, grammarAccess.getConditionAccess().getAtLakeAtLakeKeyword_3_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConditionRule());
	        }
       		setWithLastConsumed($current, "atLake", true, "at lake");
	    }

)
)
    |(
(
		lv_isProbed_6_0=	'lake has not been probed' 
    {
        newLeafNode(lv_isProbed_6_0, grammarAccess.getConditionAccess().getIsProbedLakeHasNotBeenProbedKeyword_4_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConditionRule());
	        }
       		setWithLastConsumed($current, "isProbed", true, "lake has not been probed");
	    }

)
))
;





// Entry rule entryRuleActionList
entryRuleActionList returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActionListRule()); }
	 iv_ruleActionList=ruleActionList 
	 { $current=$iv_ruleActionList.current; } 
	 EOF 
;

// Rule ActionList
ruleActionList returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getActionListAccess().getActionsActionParserRuleCall_0_0()); 
	    }
		lv_actions_0_0=ruleAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActionListRule());
	        }
       		add(
       			$current, 
       			"actions",
        		lv_actions_0_0, 
        		"Action");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getActionListAccess().getCommaKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActionListAccess().getActionsActionParserRuleCall_1_1_0()); 
	    }
		lv_actions_2_0=ruleAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActionListRule());
	        }
       		add(
       			$current, 
       			"actions",
        		lv_actions_2_0, 
        		"Action");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	 iv_ruleAction=ruleAction 
	 { $current=$iv_ruleAction.current; } 
	 EOF 
;

// Rule Action
ruleAction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_showLakes_0_0=	'show lakes' 
    {
        newLeafNode(lv_showLakes_0_0, grammarAccess.getActionAccess().getShowLakesShowLakesKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActionRule());
	        }
       		setWithLastConsumed($current, "showLakes", true, "show lakes");
	    }

)
)
    |((
(
		lv_driveDirection_1_0=	'drive' 
    {
        newLeafNode(lv_driveDirection_1_0, grammarAccess.getActionAccess().getDriveDirectionDriveKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActionRule());
	        }
       		setWithLastConsumed($current, "driveDirection", true, "drive");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getActionAccess().getDirectionDirectionEnumRuleCall_1_1_0()); 
	    }
		lv_direction_2_0=ruleDirection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActionRule());
	        }
       		set(
       			$current, 
       			"direction",
        		lv_direction_2_0, 
        		"Direction");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |((
(
		lv_driveDistance_3_0=	'drive' 
    {
        newLeafNode(lv_driveDistance_3_0, grammarAccess.getActionAccess().getDriveDistanceDriveKeyword_2_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActionRule());
	        }
       		setWithLastConsumed($current, "driveDistance", true, "drive");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getActionAccess().getDirectionDirectionEnumRuleCall_2_1_0()); 
	    }
		lv_direction_4_0=ruleDirection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActionRule());
	        }
       		set(
       			$current, 
       			"direction",
        		lv_direction_4_0, 
        		"Direction");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getActionAccess().getDistanceDistanceParserRuleCall_2_2_0()); 
	    }
		lv_distance_5_0=ruleDistance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActionRule());
	        }
       		set(
       			$current, 
       			"distance",
        		lv_distance_5_0, 
        		"Distance");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |((
(
		lv_steer_6_0=	'steer' 
    {
        newLeafNode(lv_steer_6_0, grammarAccess.getActionAccess().getSteerSteerKeyword_3_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActionRule());
	        }
       		setWithLastConsumed($current, "steer", true, "steer");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getActionAccess().getAngleAngleParserRuleCall_3_1_0()); 
	    }
		lv_angle_7_0=ruleAngle		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActionRule());
	        }
       		set(
       			$current, 
       			"angle",
        		lv_angle_7_0, 
        		"Angle");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |(
(
		lv_probeLake_8_0=	'probe lake' 
    {
        newLeafNode(lv_probeLake_8_0, grammarAccess.getActionAccess().getProbeLakeProbeLakeKeyword_4_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActionRule());
	        }
       		setWithLastConsumed($current, "probeLake", true, "probe lake");
	    }

)
)
    |(
(
		lv_blinkLights_9_0=	'blink lights' 
    {
        newLeafNode(lv_blinkLights_9_0, grammarAccess.getActionAccess().getBlinkLightsBlinkLightsKeyword_5_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActionRule());
	        }
       		setWithLastConsumed($current, "blinkLights", true, "blink lights");
	    }

)
))
;





// Entry rule entryRuleDistance
entryRuleDistance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDistanceRule()); }
	 iv_ruleDistance=ruleDistance 
	 { $current=$iv_ruleDistance.current; } 
	 EOF 
;

// Rule Distance
ruleDistance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_value_0_0=RULE_INT
		{
			newLeafNode(lv_value_0_0, grammarAccess.getDistanceAccess().getValueINTTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDistanceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"INT");
	    }

)
)	otherlv_1='cm' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDistanceAccess().getCmKeyword_1());
    }
)
;





// Entry rule entryRuleAngle
entryRuleAngle returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAngleRule()); }
	 iv_ruleAngle=ruleAngle 
	 { $current=$iv_ruleAngle.current; } 
	 EOF 
;

// Rule Angle
ruleAngle returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		lv_value_0_0=RULE_INT
		{
			newLeafNode(lv_value_0_0, grammarAccess.getAngleAccess().getValueINTTerminalRuleCall_0_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAngleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"INT");
	    }

)
)	otherlv_1='degrees' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAngleAccess().getDegreesKeyword_0_1());
    }
)
    |(
(
		lv_away_2_0=	'away from obstacles' 
    {
        newLeafNode(lv_away_2_0, grammarAccess.getAngleAccess().getAwayAwayFromObstaclesKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAngleRule());
	        }
       		setWithLastConsumed($current, "away", true, "away from obstacles");
	    }

)
))
;





// Rule Direction
ruleDirection returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='forward' 
	{
        $current = grammarAccess.getDirectionAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getFORWARDEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='backward' 
	{
        $current = grammarAccess.getDirectionAccess().getBACKWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getBACKWARDEnumLiteralDeclaration_1()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

