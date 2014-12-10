package nl.marsrover.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import nl.marsrover.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'forward'", "'backward'", "'if'", "','", "'and'", "'cm'", "'degrees'", "'not'", "'all lakes are found'", "'collision in less than'", "'at lake'", "'lake has not been probed'", "'show lakes'", "'drive'", "'steer'", "'probe lake'", "'blink lights'", "'away from obstacles'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g"; }


     
     	private DSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSpecification"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:60:1: entryRuleSpecification : ruleSpecification EOF ;
    public final void entryRuleSpecification() throws RecognitionException {
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:61:1: ( ruleSpecification EOF )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:62:1: ruleSpecification EOF
            {
             before(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_ruleSpecification_in_entryRuleSpecification61);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecification68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:69:1: ruleSpecification : ( ( rule__Specification__RuleAssignment )* ) ;
    public final void ruleSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:73:2: ( ( ( rule__Specification__RuleAssignment )* ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:74:1: ( ( rule__Specification__RuleAssignment )* )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:74:1: ( ( rule__Specification__RuleAssignment )* )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:75:1: ( rule__Specification__RuleAssignment )*
            {
             before(grammarAccess.getSpecificationAccess().getRuleAssignment()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:76:1: ( rule__Specification__RuleAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:76:2: rule__Specification__RuleAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Specification__RuleAssignment_in_ruleSpecification94);
            	    rule__Specification__RuleAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSpecificationAccess().getRuleAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleRule"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:88:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:89:1: ( ruleRule EOF )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:90:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule122);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:97:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:101:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:102:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:102:1: ( ( rule__Rule__Group__0 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:103:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:104:1: ( rule__Rule__Group__0 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:104:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule155);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleConditionList"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:116:1: entryRuleConditionList : ruleConditionList EOF ;
    public final void entryRuleConditionList() throws RecognitionException {
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:117:1: ( ruleConditionList EOF )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:118:1: ruleConditionList EOF
            {
             before(grammarAccess.getConditionListRule()); 
            pushFollow(FOLLOW_ruleConditionList_in_entryRuleConditionList182);
            ruleConditionList();

            state._fsp--;

             after(grammarAccess.getConditionListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionList189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionList"


    // $ANTLR start "ruleConditionList"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:125:1: ruleConditionList : ( ( rule__ConditionList__Group__0 ) ) ;
    public final void ruleConditionList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:129:2: ( ( ( rule__ConditionList__Group__0 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:130:1: ( ( rule__ConditionList__Group__0 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:130:1: ( ( rule__ConditionList__Group__0 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:131:1: ( rule__ConditionList__Group__0 )
            {
             before(grammarAccess.getConditionListAccess().getGroup()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:132:1: ( rule__ConditionList__Group__0 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:132:2: rule__ConditionList__Group__0
            {
            pushFollow(FOLLOW_rule__ConditionList__Group__0_in_ruleConditionList215);
            rule__ConditionList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionList"


    // $ANTLR start "entryRuleCondition"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:144:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:145:1: ( ruleCondition EOF )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:146:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition242);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:153:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:157:2: ( ( ( rule__Condition__Alternatives ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:158:1: ( ( rule__Condition__Alternatives ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:158:1: ( ( rule__Condition__Alternatives ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:159:1: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:160:1: ( rule__Condition__Alternatives )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:160:2: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_rule__Condition__Alternatives_in_ruleCondition275);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleActionList"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:172:1: entryRuleActionList : ruleActionList EOF ;
    public final void entryRuleActionList() throws RecognitionException {
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:173:1: ( ruleActionList EOF )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:174:1: ruleActionList EOF
            {
             before(grammarAccess.getActionListRule()); 
            pushFollow(FOLLOW_ruleActionList_in_entryRuleActionList302);
            ruleActionList();

            state._fsp--;

             after(grammarAccess.getActionListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionList309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionList"


    // $ANTLR start "ruleActionList"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:181:1: ruleActionList : ( ( rule__ActionList__Group__0 ) ) ;
    public final void ruleActionList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:185:2: ( ( ( rule__ActionList__Group__0 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:186:1: ( ( rule__ActionList__Group__0 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:186:1: ( ( rule__ActionList__Group__0 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:187:1: ( rule__ActionList__Group__0 )
            {
             before(grammarAccess.getActionListAccess().getGroup()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:188:1: ( rule__ActionList__Group__0 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:188:2: rule__ActionList__Group__0
            {
            pushFollow(FOLLOW_rule__ActionList__Group__0_in_ruleActionList335);
            rule__ActionList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionList"


    // $ANTLR start "entryRuleAction"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:200:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:201:1: ( ruleAction EOF )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:202:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction362);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:209:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:213:2: ( ( ( rule__Action__Alternatives ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:214:1: ( ( rule__Action__Alternatives ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:214:1: ( ( rule__Action__Alternatives ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:215:1: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:216:1: ( rule__Action__Alternatives )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:216:2: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_rule__Action__Alternatives_in_ruleAction395);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleDistance"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:228:1: entryRuleDistance : ruleDistance EOF ;
    public final void entryRuleDistance() throws RecognitionException {
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:229:1: ( ruleDistance EOF )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:230:1: ruleDistance EOF
            {
             before(grammarAccess.getDistanceRule()); 
            pushFollow(FOLLOW_ruleDistance_in_entryRuleDistance422);
            ruleDistance();

            state._fsp--;

             after(grammarAccess.getDistanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistance429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDistance"


    // $ANTLR start "ruleDistance"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:237:1: ruleDistance : ( ( rule__Distance__Group__0 ) ) ;
    public final void ruleDistance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:241:2: ( ( ( rule__Distance__Group__0 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:242:1: ( ( rule__Distance__Group__0 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:242:1: ( ( rule__Distance__Group__0 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:243:1: ( rule__Distance__Group__0 )
            {
             before(grammarAccess.getDistanceAccess().getGroup()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:244:1: ( rule__Distance__Group__0 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:244:2: rule__Distance__Group__0
            {
            pushFollow(FOLLOW_rule__Distance__Group__0_in_ruleDistance455);
            rule__Distance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDistance"


    // $ANTLR start "entryRuleAngle"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:256:1: entryRuleAngle : ruleAngle EOF ;
    public final void entryRuleAngle() throws RecognitionException {
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:257:1: ( ruleAngle EOF )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:258:1: ruleAngle EOF
            {
             before(grammarAccess.getAngleRule()); 
            pushFollow(FOLLOW_ruleAngle_in_entryRuleAngle482);
            ruleAngle();

            state._fsp--;

             after(grammarAccess.getAngleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAngle489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAngle"


    // $ANTLR start "ruleAngle"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:265:1: ruleAngle : ( ( rule__Angle__Alternatives ) ) ;
    public final void ruleAngle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:269:2: ( ( ( rule__Angle__Alternatives ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:270:1: ( ( rule__Angle__Alternatives ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:270:1: ( ( rule__Angle__Alternatives ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:271:1: ( rule__Angle__Alternatives )
            {
             before(grammarAccess.getAngleAccess().getAlternatives()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:272:1: ( rule__Angle__Alternatives )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:272:2: rule__Angle__Alternatives
            {
            pushFollow(FOLLOW_rule__Angle__Alternatives_in_ruleAngle515);
            rule__Angle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAngleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAngle"


    // $ANTLR start "ruleDirection"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:285:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:289:1: ( ( ( rule__Direction__Alternatives ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:290:1: ( ( rule__Direction__Alternatives ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:290:1: ( ( rule__Direction__Alternatives ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:291:1: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:292:1: ( rule__Direction__Alternatives )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:292:2: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_rule__Direction__Alternatives_in_ruleDirection552);
            rule__Direction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "rule__Condition__Alternatives"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:303:1: rule__Condition__Alternatives : ( ( ( rule__Condition__Group_0__0 ) ) | ( ( rule__Condition__AllLakesAssignment_1 ) ) | ( ( rule__Condition__Group_2__0 ) ) | ( ( rule__Condition__AtLakeAssignment_3 ) ) | ( ( rule__Condition__IsProbedAssignment_4 ) ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:307:1: ( ( ( rule__Condition__Group_0__0 ) ) | ( ( rule__Condition__AllLakesAssignment_1 ) ) | ( ( rule__Condition__Group_2__0 ) ) | ( ( rule__Condition__AtLakeAssignment_3 ) ) | ( ( rule__Condition__IsProbedAssignment_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case 22:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:308:1: ( ( rule__Condition__Group_0__0 ) )
                    {
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:308:1: ( ( rule__Condition__Group_0__0 ) )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:309:1: ( rule__Condition__Group_0__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0()); 
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:310:1: ( rule__Condition__Group_0__0 )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:310:2: rule__Condition__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Condition__Group_0__0_in_rule__Condition__Alternatives587);
                    rule__Condition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:314:6: ( ( rule__Condition__AllLakesAssignment_1 ) )
                    {
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:314:6: ( ( rule__Condition__AllLakesAssignment_1 ) )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:315:1: ( rule__Condition__AllLakesAssignment_1 )
                    {
                     before(grammarAccess.getConditionAccess().getAllLakesAssignment_1()); 
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:316:1: ( rule__Condition__AllLakesAssignment_1 )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:316:2: rule__Condition__AllLakesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Condition__AllLakesAssignment_1_in_rule__Condition__Alternatives605);
                    rule__Condition__AllLakesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getAllLakesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:320:6: ( ( rule__Condition__Group_2__0 ) )
                    {
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:320:6: ( ( rule__Condition__Group_2__0 ) )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:321:1: ( rule__Condition__Group_2__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_2()); 
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:322:1: ( rule__Condition__Group_2__0 )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:322:2: rule__Condition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Condition__Group_2__0_in_rule__Condition__Alternatives623);
                    rule__Condition__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:326:6: ( ( rule__Condition__AtLakeAssignment_3 ) )
                    {
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:326:6: ( ( rule__Condition__AtLakeAssignment_3 ) )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:327:1: ( rule__Condition__AtLakeAssignment_3 )
                    {
                     before(grammarAccess.getConditionAccess().getAtLakeAssignment_3()); 
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:328:1: ( rule__Condition__AtLakeAssignment_3 )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:328:2: rule__Condition__AtLakeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Condition__AtLakeAssignment_3_in_rule__Condition__Alternatives641);
                    rule__Condition__AtLakeAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getAtLakeAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:332:6: ( ( rule__Condition__IsProbedAssignment_4 ) )
                    {
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:332:6: ( ( rule__Condition__IsProbedAssignment_4 ) )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:333:1: ( rule__Condition__IsProbedAssignment_4 )
                    {
                     before(grammarAccess.getConditionAccess().getIsProbedAssignment_4()); 
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:334:1: ( rule__Condition__IsProbedAssignment_4 )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:334:2: rule__Condition__IsProbedAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Condition__IsProbedAssignment_4_in_rule__Condition__Alternatives659);
                    rule__Condition__IsProbedAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getIsProbedAssignment_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:343:1: rule__Action__Alternatives : ( ( ( rule__Action__ShowLakesAssignment_0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) | ( ( rule__Action__Group_3__0 ) ) | ( ( rule__Action__ProbeLakeAssignment_4 ) ) | ( ( rule__Action__BlinkLightsAssignment_5 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:347:1: ( ( ( rule__Action__ShowLakesAssignment_0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) | ( ( rule__Action__Group_3__0 ) ) | ( ( rule__Action__ProbeLakeAssignment_4 ) ) | ( ( rule__Action__BlinkLightsAssignment_5 ) ) )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:348:1: ( ( rule__Action__ShowLakesAssignment_0 ) )
                    {
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:348:1: ( ( rule__Action__ShowLakesAssignment_0 ) )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:349:1: ( rule__Action__ShowLakesAssignment_0 )
                    {
                     before(grammarAccess.getActionAccess().getShowLakesAssignment_0()); 
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:350:1: ( rule__Action__ShowLakesAssignment_0 )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:350:2: rule__Action__ShowLakesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Action__ShowLakesAssignment_0_in_rule__Action__Alternatives692);
                    rule__Action__ShowLakesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getShowLakesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:354:6: ( ( rule__Action__Group_1__0 ) )
                    {
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:354:6: ( ( rule__Action__Group_1__0 ) )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:355:1: ( rule__Action__Group_1__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_1()); 
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:356:1: ( rule__Action__Group_1__0 )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:356:2: rule__Action__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_1__0_in_rule__Action__Alternatives710);
                    rule__Action__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:360:6: ( ( rule__Action__Group_2__0 ) )
                    {
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:360:6: ( ( rule__Action__Group_2__0 ) )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:361:1: ( rule__Action__Group_2__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_2()); 
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:362:1: ( rule__Action__Group_2__0 )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:362:2: rule__Action__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_2__0_in_rule__Action__Alternatives728);
                    rule__Action__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:366:6: ( ( rule__Action__Group_3__0 ) )
                    {
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:366:6: ( ( rule__Action__Group_3__0 ) )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:367:1: ( rule__Action__Group_3__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_3()); 
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:368:1: ( rule__Action__Group_3__0 )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:368:2: rule__Action__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_3__0_in_rule__Action__Alternatives746);
                    rule__Action__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:372:6: ( ( rule__Action__ProbeLakeAssignment_4 ) )
                    {
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:372:6: ( ( rule__Action__ProbeLakeAssignment_4 ) )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:373:1: ( rule__Action__ProbeLakeAssignment_4 )
                    {
                     before(grammarAccess.getActionAccess().getProbeLakeAssignment_4()); 
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:374:1: ( rule__Action__ProbeLakeAssignment_4 )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:374:2: rule__Action__ProbeLakeAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Action__ProbeLakeAssignment_4_in_rule__Action__Alternatives764);
                    rule__Action__ProbeLakeAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getProbeLakeAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:378:6: ( ( rule__Action__BlinkLightsAssignment_5 ) )
                    {
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:378:6: ( ( rule__Action__BlinkLightsAssignment_5 ) )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:379:1: ( rule__Action__BlinkLightsAssignment_5 )
                    {
                     before(grammarAccess.getActionAccess().getBlinkLightsAssignment_5()); 
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:380:1: ( rule__Action__BlinkLightsAssignment_5 )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:380:2: rule__Action__BlinkLightsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Action__BlinkLightsAssignment_5_in_rule__Action__Alternatives782);
                    rule__Action__BlinkLightsAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getBlinkLightsAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Angle__Alternatives"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:389:1: rule__Angle__Alternatives : ( ( ( rule__Angle__Group_0__0 ) ) | ( ( rule__Angle__AwayAssignment_1 ) ) );
    public final void rule__Angle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:393:1: ( ( ( rule__Angle__Group_0__0 ) ) | ( ( rule__Angle__AwayAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==28) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:394:1: ( ( rule__Angle__Group_0__0 ) )
                    {
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:394:1: ( ( rule__Angle__Group_0__0 ) )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:395:1: ( rule__Angle__Group_0__0 )
                    {
                     before(grammarAccess.getAngleAccess().getGroup_0()); 
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:396:1: ( rule__Angle__Group_0__0 )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:396:2: rule__Angle__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Angle__Group_0__0_in_rule__Angle__Alternatives815);
                    rule__Angle__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAngleAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:400:6: ( ( rule__Angle__AwayAssignment_1 ) )
                    {
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:400:6: ( ( rule__Angle__AwayAssignment_1 ) )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:401:1: ( rule__Angle__AwayAssignment_1 )
                    {
                     before(grammarAccess.getAngleAccess().getAwayAssignment_1()); 
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:402:1: ( rule__Angle__AwayAssignment_1 )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:402:2: rule__Angle__AwayAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Angle__AwayAssignment_1_in_rule__Angle__Alternatives833);
                    rule__Angle__AwayAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAngleAccess().getAwayAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Angle__Alternatives"


    // $ANTLR start "rule__Direction__Alternatives"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:411:1: rule__Direction__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:415:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:416:1: ( ( 'forward' ) )
                    {
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:416:1: ( ( 'forward' ) )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:417:1: ( 'forward' )
                    {
                     before(grammarAccess.getDirectionAccess().getFORWARDEnumLiteralDeclaration_0()); 
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:418:1: ( 'forward' )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:418:3: 'forward'
                    {
                    match(input,11,FOLLOW_11_in_rule__Direction__Alternatives867); 

                    }

                     after(grammarAccess.getDirectionAccess().getFORWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:423:6: ( ( 'backward' ) )
                    {
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:423:6: ( ( 'backward' ) )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:424:1: ( 'backward' )
                    {
                     before(grammarAccess.getDirectionAccess().getBACKWARDEnumLiteralDeclaration_1()); 
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:425:1: ( 'backward' )
                    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:425:3: 'backward'
                    {
                    match(input,12,FOLLOW_12_in_rule__Direction__Alternatives888); 

                    }

                     after(grammarAccess.getDirectionAccess().getBACKWARDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__Rule__Group__0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:437:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:441:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:442:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__0921);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__0924);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:449:1: rule__Rule__Group__0__Impl : ( 'if' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:453:1: ( ( 'if' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:454:1: ( 'if' )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:454:1: ( 'if' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:455:1: 'if'
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Rule__Group__0__Impl952); 
             after(grammarAccess.getRuleAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:468:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:472:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:473:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__1983);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__1986);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:480:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ConditionListAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:484:1: ( ( ( rule__Rule__ConditionListAssignment_1 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:485:1: ( ( rule__Rule__ConditionListAssignment_1 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:485:1: ( ( rule__Rule__ConditionListAssignment_1 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:486:1: ( rule__Rule__ConditionListAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getConditionListAssignment_1()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:487:1: ( rule__Rule__ConditionListAssignment_1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:487:2: rule__Rule__ConditionListAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__ConditionListAssignment_1_in_rule__Rule__Group__1__Impl1013);
            rule__Rule__ConditionListAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionListAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:497:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:501:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:502:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21043);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21046);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:509:1: rule__Rule__Group__2__Impl : ( ',' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:513:1: ( ( ',' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:514:1: ( ',' )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:514:1: ( ',' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:515:1: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Rule__Group__2__Impl1074); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:528:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:532:1: ( rule__Rule__Group__3__Impl )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:533:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31105);
            rule__Rule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:539:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__ActionListAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:543:1: ( ( ( rule__Rule__ActionListAssignment_3 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:544:1: ( ( rule__Rule__ActionListAssignment_3 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:544:1: ( ( rule__Rule__ActionListAssignment_3 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:545:1: ( rule__Rule__ActionListAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getActionListAssignment_3()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:546:1: ( rule__Rule__ActionListAssignment_3 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:546:2: rule__Rule__ActionListAssignment_3
            {
            pushFollow(FOLLOW_rule__Rule__ActionListAssignment_3_in_rule__Rule__Group__3__Impl1132);
            rule__Rule__ActionListAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionListAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__ConditionList__Group__0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:564:1: rule__ConditionList__Group__0 : rule__ConditionList__Group__0__Impl rule__ConditionList__Group__1 ;
    public final void rule__ConditionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:568:1: ( rule__ConditionList__Group__0__Impl rule__ConditionList__Group__1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:569:2: rule__ConditionList__Group__0__Impl rule__ConditionList__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionList__Group__0__Impl_in_rule__ConditionList__Group__01170);
            rule__ConditionList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionList__Group__1_in_rule__ConditionList__Group__01173);
            rule__ConditionList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionList__Group__0"


    // $ANTLR start "rule__ConditionList__Group__0__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:576:1: rule__ConditionList__Group__0__Impl : ( ( rule__ConditionList__ConditionsAssignment_0 ) ) ;
    public final void rule__ConditionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:580:1: ( ( ( rule__ConditionList__ConditionsAssignment_0 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:581:1: ( ( rule__ConditionList__ConditionsAssignment_0 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:581:1: ( ( rule__ConditionList__ConditionsAssignment_0 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:582:1: ( rule__ConditionList__ConditionsAssignment_0 )
            {
             before(grammarAccess.getConditionListAccess().getConditionsAssignment_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:583:1: ( rule__ConditionList__ConditionsAssignment_0 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:583:2: rule__ConditionList__ConditionsAssignment_0
            {
            pushFollow(FOLLOW_rule__ConditionList__ConditionsAssignment_0_in_rule__ConditionList__Group__0__Impl1200);
            rule__ConditionList__ConditionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionListAccess().getConditionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionList__Group__0__Impl"


    // $ANTLR start "rule__ConditionList__Group__1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:593:1: rule__ConditionList__Group__1 : rule__ConditionList__Group__1__Impl ;
    public final void rule__ConditionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:597:1: ( rule__ConditionList__Group__1__Impl )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:598:2: rule__ConditionList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionList__Group__1__Impl_in_rule__ConditionList__Group__11230);
            rule__ConditionList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionList__Group__1"


    // $ANTLR start "rule__ConditionList__Group__1__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:604:1: rule__ConditionList__Group__1__Impl : ( ( rule__ConditionList__Group_1__0 )* ) ;
    public final void rule__ConditionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:608:1: ( ( ( rule__ConditionList__Group_1__0 )* ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:609:1: ( ( rule__ConditionList__Group_1__0 )* )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:609:1: ( ( rule__ConditionList__Group_1__0 )* )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:610:1: ( rule__ConditionList__Group_1__0 )*
            {
             before(grammarAccess.getConditionListAccess().getGroup_1()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:611:1: ( rule__ConditionList__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:611:2: rule__ConditionList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ConditionList__Group_1__0_in_rule__ConditionList__Group__1__Impl1257);
            	    rule__ConditionList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getConditionListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionList__Group__1__Impl"


    // $ANTLR start "rule__ConditionList__Group_1__0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:625:1: rule__ConditionList__Group_1__0 : rule__ConditionList__Group_1__0__Impl rule__ConditionList__Group_1__1 ;
    public final void rule__ConditionList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:629:1: ( rule__ConditionList__Group_1__0__Impl rule__ConditionList__Group_1__1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:630:2: rule__ConditionList__Group_1__0__Impl rule__ConditionList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConditionList__Group_1__0__Impl_in_rule__ConditionList__Group_1__01292);
            rule__ConditionList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionList__Group_1__1_in_rule__ConditionList__Group_1__01295);
            rule__ConditionList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionList__Group_1__0"


    // $ANTLR start "rule__ConditionList__Group_1__0__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:637:1: rule__ConditionList__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__ConditionList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:641:1: ( ( 'and' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:642:1: ( 'and' )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:642:1: ( 'and' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:643:1: 'and'
            {
             before(grammarAccess.getConditionListAccess().getAndKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__ConditionList__Group_1__0__Impl1323); 
             after(grammarAccess.getConditionListAccess().getAndKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionList__Group_1__0__Impl"


    // $ANTLR start "rule__ConditionList__Group_1__1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:656:1: rule__ConditionList__Group_1__1 : rule__ConditionList__Group_1__1__Impl ;
    public final void rule__ConditionList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:660:1: ( rule__ConditionList__Group_1__1__Impl )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:661:2: rule__ConditionList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionList__Group_1__1__Impl_in_rule__ConditionList__Group_1__11354);
            rule__ConditionList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionList__Group_1__1"


    // $ANTLR start "rule__ConditionList__Group_1__1__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:667:1: rule__ConditionList__Group_1__1__Impl : ( ( rule__ConditionList__ConditionsAssignment_1_1 ) ) ;
    public final void rule__ConditionList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:671:1: ( ( ( rule__ConditionList__ConditionsAssignment_1_1 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:672:1: ( ( rule__ConditionList__ConditionsAssignment_1_1 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:672:1: ( ( rule__ConditionList__ConditionsAssignment_1_1 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:673:1: ( rule__ConditionList__ConditionsAssignment_1_1 )
            {
             before(grammarAccess.getConditionListAccess().getConditionsAssignment_1_1()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:674:1: ( rule__ConditionList__ConditionsAssignment_1_1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:674:2: rule__ConditionList__ConditionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConditionList__ConditionsAssignment_1_1_in_rule__ConditionList__Group_1__1__Impl1381);
            rule__ConditionList__ConditionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionListAccess().getConditionsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionList__Group_1__1__Impl"


    // $ANTLR start "rule__Condition__Group_0__0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:688:1: rule__Condition__Group_0__0 : rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 ;
    public final void rule__Condition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:692:1: ( rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:693:2: rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1
            {
            pushFollow(FOLLOW_rule__Condition__Group_0__0__Impl_in_rule__Condition__Group_0__01415);
            rule__Condition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group_0__1_in_rule__Condition__Group_0__01418);
            rule__Condition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__0"


    // $ANTLR start "rule__Condition__Group_0__0__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:700:1: rule__Condition__Group_0__0__Impl : ( ( rule__Condition__NotAssignment_0_0 ) ) ;
    public final void rule__Condition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:704:1: ( ( ( rule__Condition__NotAssignment_0_0 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:705:1: ( ( rule__Condition__NotAssignment_0_0 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:705:1: ( ( rule__Condition__NotAssignment_0_0 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:706:1: ( rule__Condition__NotAssignment_0_0 )
            {
             before(grammarAccess.getConditionAccess().getNotAssignment_0_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:707:1: ( rule__Condition__NotAssignment_0_0 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:707:2: rule__Condition__NotAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Condition__NotAssignment_0_0_in_rule__Condition__Group_0__0__Impl1445);
            rule__Condition__NotAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getNotAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__0__Impl"


    // $ANTLR start "rule__Condition__Group_0__1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:717:1: rule__Condition__Group_0__1 : rule__Condition__Group_0__1__Impl ;
    public final void rule__Condition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:721:1: ( rule__Condition__Group_0__1__Impl )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:722:2: rule__Condition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group_0__1__Impl_in_rule__Condition__Group_0__11475);
            rule__Condition__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__1"


    // $ANTLR start "rule__Condition__Group_0__1__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:728:1: rule__Condition__Group_0__1__Impl : ( ( rule__Condition__ConditionAssignment_0_1 ) ) ;
    public final void rule__Condition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:732:1: ( ( ( rule__Condition__ConditionAssignment_0_1 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:733:1: ( ( rule__Condition__ConditionAssignment_0_1 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:733:1: ( ( rule__Condition__ConditionAssignment_0_1 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:734:1: ( rule__Condition__ConditionAssignment_0_1 )
            {
             before(grammarAccess.getConditionAccess().getConditionAssignment_0_1()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:735:1: ( rule__Condition__ConditionAssignment_0_1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:735:2: rule__Condition__ConditionAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Condition__ConditionAssignment_0_1_in_rule__Condition__Group_0__1__Impl1502);
            rule__Condition__ConditionAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getConditionAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__1__Impl"


    // $ANTLR start "rule__Condition__Group_2__0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:749:1: rule__Condition__Group_2__0 : rule__Condition__Group_2__0__Impl rule__Condition__Group_2__1 ;
    public final void rule__Condition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:753:1: ( rule__Condition__Group_2__0__Impl rule__Condition__Group_2__1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:754:2: rule__Condition__Group_2__0__Impl rule__Condition__Group_2__1
            {
            pushFollow(FOLLOW_rule__Condition__Group_2__0__Impl_in_rule__Condition__Group_2__01536);
            rule__Condition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group_2__1_in_rule__Condition__Group_2__01539);
            rule__Condition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_2__0"


    // $ANTLR start "rule__Condition__Group_2__0__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:761:1: rule__Condition__Group_2__0__Impl : ( ( rule__Condition__CollisionAssignment_2_0 ) ) ;
    public final void rule__Condition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:765:1: ( ( ( rule__Condition__CollisionAssignment_2_0 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:766:1: ( ( rule__Condition__CollisionAssignment_2_0 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:766:1: ( ( rule__Condition__CollisionAssignment_2_0 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:767:1: ( rule__Condition__CollisionAssignment_2_0 )
            {
             before(grammarAccess.getConditionAccess().getCollisionAssignment_2_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:768:1: ( rule__Condition__CollisionAssignment_2_0 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:768:2: rule__Condition__CollisionAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Condition__CollisionAssignment_2_0_in_rule__Condition__Group_2__0__Impl1566);
            rule__Condition__CollisionAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getCollisionAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_2__0__Impl"


    // $ANTLR start "rule__Condition__Group_2__1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:778:1: rule__Condition__Group_2__1 : rule__Condition__Group_2__1__Impl ;
    public final void rule__Condition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:782:1: ( rule__Condition__Group_2__1__Impl )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:783:2: rule__Condition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group_2__1__Impl_in_rule__Condition__Group_2__11596);
            rule__Condition__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_2__1"


    // $ANTLR start "rule__Condition__Group_2__1__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:789:1: rule__Condition__Group_2__1__Impl : ( ( rule__Condition__DistanceAssignment_2_1 ) ) ;
    public final void rule__Condition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:793:1: ( ( ( rule__Condition__DistanceAssignment_2_1 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:794:1: ( ( rule__Condition__DistanceAssignment_2_1 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:794:1: ( ( rule__Condition__DistanceAssignment_2_1 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:795:1: ( rule__Condition__DistanceAssignment_2_1 )
            {
             before(grammarAccess.getConditionAccess().getDistanceAssignment_2_1()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:796:1: ( rule__Condition__DistanceAssignment_2_1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:796:2: rule__Condition__DistanceAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Condition__DistanceAssignment_2_1_in_rule__Condition__Group_2__1__Impl1623);
            rule__Condition__DistanceAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getDistanceAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_2__1__Impl"


    // $ANTLR start "rule__ActionList__Group__0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:810:1: rule__ActionList__Group__0 : rule__ActionList__Group__0__Impl rule__ActionList__Group__1 ;
    public final void rule__ActionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:814:1: ( rule__ActionList__Group__0__Impl rule__ActionList__Group__1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:815:2: rule__ActionList__Group__0__Impl rule__ActionList__Group__1
            {
            pushFollow(FOLLOW_rule__ActionList__Group__0__Impl_in_rule__ActionList__Group__01657);
            rule__ActionList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionList__Group__1_in_rule__ActionList__Group__01660);
            rule__ActionList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionList__Group__0"


    // $ANTLR start "rule__ActionList__Group__0__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:822:1: rule__ActionList__Group__0__Impl : ( ( rule__ActionList__ActionsAssignment_0 ) ) ;
    public final void rule__ActionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:826:1: ( ( ( rule__ActionList__ActionsAssignment_0 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:827:1: ( ( rule__ActionList__ActionsAssignment_0 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:827:1: ( ( rule__ActionList__ActionsAssignment_0 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:828:1: ( rule__ActionList__ActionsAssignment_0 )
            {
             before(grammarAccess.getActionListAccess().getActionsAssignment_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:829:1: ( rule__ActionList__ActionsAssignment_0 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:829:2: rule__ActionList__ActionsAssignment_0
            {
            pushFollow(FOLLOW_rule__ActionList__ActionsAssignment_0_in_rule__ActionList__Group__0__Impl1687);
            rule__ActionList__ActionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActionListAccess().getActionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionList__Group__0__Impl"


    // $ANTLR start "rule__ActionList__Group__1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:839:1: rule__ActionList__Group__1 : rule__ActionList__Group__1__Impl ;
    public final void rule__ActionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:843:1: ( rule__ActionList__Group__1__Impl )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:844:2: rule__ActionList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionList__Group__1__Impl_in_rule__ActionList__Group__11717);
            rule__ActionList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionList__Group__1"


    // $ANTLR start "rule__ActionList__Group__1__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:850:1: rule__ActionList__Group__1__Impl : ( ( rule__ActionList__Group_1__0 )* ) ;
    public final void rule__ActionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:854:1: ( ( ( rule__ActionList__Group_1__0 )* ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:855:1: ( ( rule__ActionList__Group_1__0 )* )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:855:1: ( ( rule__ActionList__Group_1__0 )* )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:856:1: ( rule__ActionList__Group_1__0 )*
            {
             before(grammarAccess.getActionListAccess().getGroup_1()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:857:1: ( rule__ActionList__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:857:2: rule__ActionList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ActionList__Group_1__0_in_rule__ActionList__Group__1__Impl1744);
            	    rule__ActionList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getActionListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionList__Group__1__Impl"


    // $ANTLR start "rule__ActionList__Group_1__0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:871:1: rule__ActionList__Group_1__0 : rule__ActionList__Group_1__0__Impl rule__ActionList__Group_1__1 ;
    public final void rule__ActionList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:875:1: ( rule__ActionList__Group_1__0__Impl rule__ActionList__Group_1__1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:876:2: rule__ActionList__Group_1__0__Impl rule__ActionList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ActionList__Group_1__0__Impl_in_rule__ActionList__Group_1__01779);
            rule__ActionList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionList__Group_1__1_in_rule__ActionList__Group_1__01782);
            rule__ActionList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionList__Group_1__0"


    // $ANTLR start "rule__ActionList__Group_1__0__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:883:1: rule__ActionList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ActionList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:887:1: ( ( ',' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:888:1: ( ',' )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:888:1: ( ',' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:889:1: ','
            {
             before(grammarAccess.getActionListAccess().getCommaKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__ActionList__Group_1__0__Impl1810); 
             after(grammarAccess.getActionListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionList__Group_1__0__Impl"


    // $ANTLR start "rule__ActionList__Group_1__1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:902:1: rule__ActionList__Group_1__1 : rule__ActionList__Group_1__1__Impl ;
    public final void rule__ActionList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:906:1: ( rule__ActionList__Group_1__1__Impl )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:907:2: rule__ActionList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionList__Group_1__1__Impl_in_rule__ActionList__Group_1__11841);
            rule__ActionList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionList__Group_1__1"


    // $ANTLR start "rule__ActionList__Group_1__1__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:913:1: rule__ActionList__Group_1__1__Impl : ( ( rule__ActionList__ActionsAssignment_1_1 ) ) ;
    public final void rule__ActionList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:917:1: ( ( ( rule__ActionList__ActionsAssignment_1_1 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:918:1: ( ( rule__ActionList__ActionsAssignment_1_1 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:918:1: ( ( rule__ActionList__ActionsAssignment_1_1 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:919:1: ( rule__ActionList__ActionsAssignment_1_1 )
            {
             before(grammarAccess.getActionListAccess().getActionsAssignment_1_1()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:920:1: ( rule__ActionList__ActionsAssignment_1_1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:920:2: rule__ActionList__ActionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ActionList__ActionsAssignment_1_1_in_rule__ActionList__Group_1__1__Impl1868);
            rule__ActionList__ActionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActionListAccess().getActionsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionList__Group_1__1__Impl"


    // $ANTLR start "rule__Action__Group_1__0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:934:1: rule__Action__Group_1__0 : rule__Action__Group_1__0__Impl rule__Action__Group_1__1 ;
    public final void rule__Action__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:938:1: ( rule__Action__Group_1__0__Impl rule__Action__Group_1__1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:939:2: rule__Action__Group_1__0__Impl rule__Action__Group_1__1
            {
            pushFollow(FOLLOW_rule__Action__Group_1__0__Impl_in_rule__Action__Group_1__01902);
            rule__Action__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group_1__1_in_rule__Action__Group_1__01905);
            rule__Action__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_1__0"


    // $ANTLR start "rule__Action__Group_1__0__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:946:1: rule__Action__Group_1__0__Impl : ( ( rule__Action__DriveDirectionAssignment_1_0 ) ) ;
    public final void rule__Action__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:950:1: ( ( ( rule__Action__DriveDirectionAssignment_1_0 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:951:1: ( ( rule__Action__DriveDirectionAssignment_1_0 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:951:1: ( ( rule__Action__DriveDirectionAssignment_1_0 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:952:1: ( rule__Action__DriveDirectionAssignment_1_0 )
            {
             before(grammarAccess.getActionAccess().getDriveDirectionAssignment_1_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:953:1: ( rule__Action__DriveDirectionAssignment_1_0 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:953:2: rule__Action__DriveDirectionAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Action__DriveDirectionAssignment_1_0_in_rule__Action__Group_1__0__Impl1932);
            rule__Action__DriveDirectionAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getDriveDirectionAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_1__0__Impl"


    // $ANTLR start "rule__Action__Group_1__1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:963:1: rule__Action__Group_1__1 : rule__Action__Group_1__1__Impl ;
    public final void rule__Action__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:967:1: ( rule__Action__Group_1__1__Impl )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:968:2: rule__Action__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_1__1__Impl_in_rule__Action__Group_1__11962);
            rule__Action__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_1__1"


    // $ANTLR start "rule__Action__Group_1__1__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:974:1: rule__Action__Group_1__1__Impl : ( ( rule__Action__DirectionAssignment_1_1 ) ) ;
    public final void rule__Action__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:978:1: ( ( ( rule__Action__DirectionAssignment_1_1 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:979:1: ( ( rule__Action__DirectionAssignment_1_1 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:979:1: ( ( rule__Action__DirectionAssignment_1_1 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:980:1: ( rule__Action__DirectionAssignment_1_1 )
            {
             before(grammarAccess.getActionAccess().getDirectionAssignment_1_1()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:981:1: ( rule__Action__DirectionAssignment_1_1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:981:2: rule__Action__DirectionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Action__DirectionAssignment_1_1_in_rule__Action__Group_1__1__Impl1989);
            rule__Action__DirectionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getDirectionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_1__1__Impl"


    // $ANTLR start "rule__Action__Group_2__0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:995:1: rule__Action__Group_2__0 : rule__Action__Group_2__0__Impl rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:999:1: ( rule__Action__Group_2__0__Impl rule__Action__Group_2__1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1000:2: rule__Action__Group_2__0__Impl rule__Action__Group_2__1
            {
            pushFollow(FOLLOW_rule__Action__Group_2__0__Impl_in_rule__Action__Group_2__02023);
            rule__Action__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group_2__1_in_rule__Action__Group_2__02026);
            rule__Action__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__0"


    // $ANTLR start "rule__Action__Group_2__0__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1007:1: rule__Action__Group_2__0__Impl : ( ( rule__Action__DriveDistanceAssignment_2_0 ) ) ;
    public final void rule__Action__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1011:1: ( ( ( rule__Action__DriveDistanceAssignment_2_0 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1012:1: ( ( rule__Action__DriveDistanceAssignment_2_0 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1012:1: ( ( rule__Action__DriveDistanceAssignment_2_0 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1013:1: ( rule__Action__DriveDistanceAssignment_2_0 )
            {
             before(grammarAccess.getActionAccess().getDriveDistanceAssignment_2_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1014:1: ( rule__Action__DriveDistanceAssignment_2_0 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1014:2: rule__Action__DriveDistanceAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Action__DriveDistanceAssignment_2_0_in_rule__Action__Group_2__0__Impl2053);
            rule__Action__DriveDistanceAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getDriveDistanceAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__0__Impl"


    // $ANTLR start "rule__Action__Group_2__1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1024:1: rule__Action__Group_2__1 : rule__Action__Group_2__1__Impl rule__Action__Group_2__2 ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1028:1: ( rule__Action__Group_2__1__Impl rule__Action__Group_2__2 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1029:2: rule__Action__Group_2__1__Impl rule__Action__Group_2__2
            {
            pushFollow(FOLLOW_rule__Action__Group_2__1__Impl_in_rule__Action__Group_2__12083);
            rule__Action__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group_2__2_in_rule__Action__Group_2__12086);
            rule__Action__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__1"


    // $ANTLR start "rule__Action__Group_2__1__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1036:1: rule__Action__Group_2__1__Impl : ( ( rule__Action__DirectionAssignment_2_1 ) ) ;
    public final void rule__Action__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1040:1: ( ( ( rule__Action__DirectionAssignment_2_1 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1041:1: ( ( rule__Action__DirectionAssignment_2_1 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1041:1: ( ( rule__Action__DirectionAssignment_2_1 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1042:1: ( rule__Action__DirectionAssignment_2_1 )
            {
             before(grammarAccess.getActionAccess().getDirectionAssignment_2_1()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1043:1: ( rule__Action__DirectionAssignment_2_1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1043:2: rule__Action__DirectionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Action__DirectionAssignment_2_1_in_rule__Action__Group_2__1__Impl2113);
            rule__Action__DirectionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getDirectionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__1__Impl"


    // $ANTLR start "rule__Action__Group_2__2"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1053:1: rule__Action__Group_2__2 : rule__Action__Group_2__2__Impl ;
    public final void rule__Action__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1057:1: ( rule__Action__Group_2__2__Impl )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1058:2: rule__Action__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_2__2__Impl_in_rule__Action__Group_2__22143);
            rule__Action__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__2"


    // $ANTLR start "rule__Action__Group_2__2__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1064:1: rule__Action__Group_2__2__Impl : ( ( rule__Action__DistanceAssignment_2_2 ) ) ;
    public final void rule__Action__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1068:1: ( ( ( rule__Action__DistanceAssignment_2_2 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1069:1: ( ( rule__Action__DistanceAssignment_2_2 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1069:1: ( ( rule__Action__DistanceAssignment_2_2 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1070:1: ( rule__Action__DistanceAssignment_2_2 )
            {
             before(grammarAccess.getActionAccess().getDistanceAssignment_2_2()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1071:1: ( rule__Action__DistanceAssignment_2_2 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1071:2: rule__Action__DistanceAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Action__DistanceAssignment_2_2_in_rule__Action__Group_2__2__Impl2170);
            rule__Action__DistanceAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getDistanceAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__2__Impl"


    // $ANTLR start "rule__Action__Group_3__0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1087:1: rule__Action__Group_3__0 : rule__Action__Group_3__0__Impl rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1091:1: ( rule__Action__Group_3__0__Impl rule__Action__Group_3__1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1092:2: rule__Action__Group_3__0__Impl rule__Action__Group_3__1
            {
            pushFollow(FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__02206);
            rule__Action__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__02209);
            rule__Action__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__0"


    // $ANTLR start "rule__Action__Group_3__0__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1099:1: rule__Action__Group_3__0__Impl : ( ( rule__Action__SteerAssignment_3_0 ) ) ;
    public final void rule__Action__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1103:1: ( ( ( rule__Action__SteerAssignment_3_0 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1104:1: ( ( rule__Action__SteerAssignment_3_0 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1104:1: ( ( rule__Action__SteerAssignment_3_0 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1105:1: ( rule__Action__SteerAssignment_3_0 )
            {
             before(grammarAccess.getActionAccess().getSteerAssignment_3_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1106:1: ( rule__Action__SteerAssignment_3_0 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1106:2: rule__Action__SteerAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Action__SteerAssignment_3_0_in_rule__Action__Group_3__0__Impl2236);
            rule__Action__SteerAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getSteerAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__0__Impl"


    // $ANTLR start "rule__Action__Group_3__1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1116:1: rule__Action__Group_3__1 : rule__Action__Group_3__1__Impl ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1120:1: ( rule__Action__Group_3__1__Impl )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1121:2: rule__Action__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__12266);
            rule__Action__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__1"


    // $ANTLR start "rule__Action__Group_3__1__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1127:1: rule__Action__Group_3__1__Impl : ( ( rule__Action__AngleAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1131:1: ( ( ( rule__Action__AngleAssignment_3_1 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1132:1: ( ( rule__Action__AngleAssignment_3_1 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1132:1: ( ( rule__Action__AngleAssignment_3_1 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1133:1: ( rule__Action__AngleAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getAngleAssignment_3_1()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1134:1: ( rule__Action__AngleAssignment_3_1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1134:2: rule__Action__AngleAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Action__AngleAssignment_3_1_in_rule__Action__Group_3__1__Impl2293);
            rule__Action__AngleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAngleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__1__Impl"


    // $ANTLR start "rule__Distance__Group__0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1148:1: rule__Distance__Group__0 : rule__Distance__Group__0__Impl rule__Distance__Group__1 ;
    public final void rule__Distance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1152:1: ( rule__Distance__Group__0__Impl rule__Distance__Group__1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1153:2: rule__Distance__Group__0__Impl rule__Distance__Group__1
            {
            pushFollow(FOLLOW_rule__Distance__Group__0__Impl_in_rule__Distance__Group__02327);
            rule__Distance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Distance__Group__1_in_rule__Distance__Group__02330);
            rule__Distance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__0"


    // $ANTLR start "rule__Distance__Group__0__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1160:1: rule__Distance__Group__0__Impl : ( ( rule__Distance__ValueAssignment_0 ) ) ;
    public final void rule__Distance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1164:1: ( ( ( rule__Distance__ValueAssignment_0 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1165:1: ( ( rule__Distance__ValueAssignment_0 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1165:1: ( ( rule__Distance__ValueAssignment_0 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1166:1: ( rule__Distance__ValueAssignment_0 )
            {
             before(grammarAccess.getDistanceAccess().getValueAssignment_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1167:1: ( rule__Distance__ValueAssignment_0 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1167:2: rule__Distance__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__Distance__ValueAssignment_0_in_rule__Distance__Group__0__Impl2357);
            rule__Distance__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__0__Impl"


    // $ANTLR start "rule__Distance__Group__1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1177:1: rule__Distance__Group__1 : rule__Distance__Group__1__Impl ;
    public final void rule__Distance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1181:1: ( rule__Distance__Group__1__Impl )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1182:2: rule__Distance__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Distance__Group__1__Impl_in_rule__Distance__Group__12387);
            rule__Distance__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__1"


    // $ANTLR start "rule__Distance__Group__1__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1188:1: rule__Distance__Group__1__Impl : ( 'cm' ) ;
    public final void rule__Distance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1192:1: ( ( 'cm' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1193:1: ( 'cm' )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1193:1: ( 'cm' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1194:1: 'cm'
            {
             before(grammarAccess.getDistanceAccess().getCmKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Distance__Group__1__Impl2415); 
             after(grammarAccess.getDistanceAccess().getCmKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__1__Impl"


    // $ANTLR start "rule__Angle__Group_0__0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1211:1: rule__Angle__Group_0__0 : rule__Angle__Group_0__0__Impl rule__Angle__Group_0__1 ;
    public final void rule__Angle__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1215:1: ( rule__Angle__Group_0__0__Impl rule__Angle__Group_0__1 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1216:2: rule__Angle__Group_0__0__Impl rule__Angle__Group_0__1
            {
            pushFollow(FOLLOW_rule__Angle__Group_0__0__Impl_in_rule__Angle__Group_0__02450);
            rule__Angle__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Angle__Group_0__1_in_rule__Angle__Group_0__02453);
            rule__Angle__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Angle__Group_0__0"


    // $ANTLR start "rule__Angle__Group_0__0__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1223:1: rule__Angle__Group_0__0__Impl : ( ( rule__Angle__ValueAssignment_0_0 ) ) ;
    public final void rule__Angle__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1227:1: ( ( ( rule__Angle__ValueAssignment_0_0 ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1228:1: ( ( rule__Angle__ValueAssignment_0_0 ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1228:1: ( ( rule__Angle__ValueAssignment_0_0 ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1229:1: ( rule__Angle__ValueAssignment_0_0 )
            {
             before(grammarAccess.getAngleAccess().getValueAssignment_0_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1230:1: ( rule__Angle__ValueAssignment_0_0 )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1230:2: rule__Angle__ValueAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Angle__ValueAssignment_0_0_in_rule__Angle__Group_0__0__Impl2480);
            rule__Angle__ValueAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAngleAccess().getValueAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Angle__Group_0__0__Impl"


    // $ANTLR start "rule__Angle__Group_0__1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1240:1: rule__Angle__Group_0__1 : rule__Angle__Group_0__1__Impl ;
    public final void rule__Angle__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1244:1: ( rule__Angle__Group_0__1__Impl )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1245:2: rule__Angle__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Angle__Group_0__1__Impl_in_rule__Angle__Group_0__12510);
            rule__Angle__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Angle__Group_0__1"


    // $ANTLR start "rule__Angle__Group_0__1__Impl"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1251:1: rule__Angle__Group_0__1__Impl : ( 'degrees' ) ;
    public final void rule__Angle__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1255:1: ( ( 'degrees' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1256:1: ( 'degrees' )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1256:1: ( 'degrees' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1257:1: 'degrees'
            {
             before(grammarAccess.getAngleAccess().getDegreesKeyword_0_1()); 
            match(input,17,FOLLOW_17_in_rule__Angle__Group_0__1__Impl2538); 
             after(grammarAccess.getAngleAccess().getDegreesKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Angle__Group_0__1__Impl"


    // $ANTLR start "rule__Specification__RuleAssignment"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1275:1: rule__Specification__RuleAssignment : ( ruleRule ) ;
    public final void rule__Specification__RuleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1279:1: ( ( ruleRule ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1280:1: ( ruleRule )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1280:1: ( ruleRule )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1281:1: ruleRule
            {
             before(grammarAccess.getSpecificationAccess().getRuleRuleParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Specification__RuleAssignment2578);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getRuleRuleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__RuleAssignment"


    // $ANTLR start "rule__Rule__ConditionListAssignment_1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1290:1: rule__Rule__ConditionListAssignment_1 : ( ruleConditionList ) ;
    public final void rule__Rule__ConditionListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1294:1: ( ( ruleConditionList ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1295:1: ( ruleConditionList )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1295:1: ( ruleConditionList )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1296:1: ruleConditionList
            {
             before(grammarAccess.getRuleAccess().getConditionListConditionListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConditionList_in_rule__Rule__ConditionListAssignment_12609);
            ruleConditionList();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionListConditionListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionListAssignment_1"


    // $ANTLR start "rule__Rule__ActionListAssignment_3"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1305:1: rule__Rule__ActionListAssignment_3 : ( ruleActionList ) ;
    public final void rule__Rule__ActionListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1309:1: ( ( ruleActionList ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1310:1: ( ruleActionList )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1310:1: ( ruleActionList )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1311:1: ruleActionList
            {
             before(grammarAccess.getRuleAccess().getActionListActionListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleActionList_in_rule__Rule__ActionListAssignment_32640);
            ruleActionList();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getActionListActionListParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionListAssignment_3"


    // $ANTLR start "rule__ConditionList__ConditionsAssignment_0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1320:1: rule__ConditionList__ConditionsAssignment_0 : ( ruleCondition ) ;
    public final void rule__ConditionList__ConditionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1324:1: ( ( ruleCondition ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1325:1: ( ruleCondition )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1325:1: ( ruleCondition )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1326:1: ruleCondition
            {
             before(grammarAccess.getConditionListAccess().getConditionsConditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__ConditionList__ConditionsAssignment_02671);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionListAccess().getConditionsConditionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionList__ConditionsAssignment_0"


    // $ANTLR start "rule__ConditionList__ConditionsAssignment_1_1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1335:1: rule__ConditionList__ConditionsAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__ConditionList__ConditionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1339:1: ( ( ruleCondition ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1340:1: ( ruleCondition )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1340:1: ( ruleCondition )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1341:1: ruleCondition
            {
             before(grammarAccess.getConditionListAccess().getConditionsConditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__ConditionList__ConditionsAssignment_1_12702);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionListAccess().getConditionsConditionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionList__ConditionsAssignment_1_1"


    // $ANTLR start "rule__Condition__NotAssignment_0_0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1350:1: rule__Condition__NotAssignment_0_0 : ( ( 'not' ) ) ;
    public final void rule__Condition__NotAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1354:1: ( ( ( 'not' ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1355:1: ( ( 'not' ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1355:1: ( ( 'not' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1356:1: ( 'not' )
            {
             before(grammarAccess.getConditionAccess().getNotNotKeyword_0_0_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1357:1: ( 'not' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1358:1: 'not'
            {
             before(grammarAccess.getConditionAccess().getNotNotKeyword_0_0_0()); 
            match(input,18,FOLLOW_18_in_rule__Condition__NotAssignment_0_02738); 
             after(grammarAccess.getConditionAccess().getNotNotKeyword_0_0_0()); 

            }

             after(grammarAccess.getConditionAccess().getNotNotKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__NotAssignment_0_0"


    // $ANTLR start "rule__Condition__ConditionAssignment_0_1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1373:1: rule__Condition__ConditionAssignment_0_1 : ( ruleCondition ) ;
    public final void rule__Condition__ConditionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1377:1: ( ( ruleCondition ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1378:1: ( ruleCondition )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1378:1: ( ruleCondition )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1379:1: ruleCondition
            {
             before(grammarAccess.getConditionAccess().getConditionConditionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Condition__ConditionAssignment_0_12777);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getConditionConditionParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ConditionAssignment_0_1"


    // $ANTLR start "rule__Condition__AllLakesAssignment_1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1388:1: rule__Condition__AllLakesAssignment_1 : ( ( 'all lakes are found' ) ) ;
    public final void rule__Condition__AllLakesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1392:1: ( ( ( 'all lakes are found' ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1393:1: ( ( 'all lakes are found' ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1393:1: ( ( 'all lakes are found' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1394:1: ( 'all lakes are found' )
            {
             before(grammarAccess.getConditionAccess().getAllLakesAllLakesAreFoundKeyword_1_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1395:1: ( 'all lakes are found' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1396:1: 'all lakes are found'
            {
             before(grammarAccess.getConditionAccess().getAllLakesAllLakesAreFoundKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Condition__AllLakesAssignment_12813); 
             after(grammarAccess.getConditionAccess().getAllLakesAllLakesAreFoundKeyword_1_0()); 

            }

             after(grammarAccess.getConditionAccess().getAllLakesAllLakesAreFoundKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__AllLakesAssignment_1"


    // $ANTLR start "rule__Condition__CollisionAssignment_2_0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1411:1: rule__Condition__CollisionAssignment_2_0 : ( ( 'collision in less than' ) ) ;
    public final void rule__Condition__CollisionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1415:1: ( ( ( 'collision in less than' ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1416:1: ( ( 'collision in less than' ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1416:1: ( ( 'collision in less than' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1417:1: ( 'collision in less than' )
            {
             before(grammarAccess.getConditionAccess().getCollisionCollisionInLessThanKeyword_2_0_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1418:1: ( 'collision in less than' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1419:1: 'collision in less than'
            {
             before(grammarAccess.getConditionAccess().getCollisionCollisionInLessThanKeyword_2_0_0()); 
            match(input,20,FOLLOW_20_in_rule__Condition__CollisionAssignment_2_02857); 
             after(grammarAccess.getConditionAccess().getCollisionCollisionInLessThanKeyword_2_0_0()); 

            }

             after(grammarAccess.getConditionAccess().getCollisionCollisionInLessThanKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__CollisionAssignment_2_0"


    // $ANTLR start "rule__Condition__DistanceAssignment_2_1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1434:1: rule__Condition__DistanceAssignment_2_1 : ( ruleDistance ) ;
    public final void rule__Condition__DistanceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1438:1: ( ( ruleDistance ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1439:1: ( ruleDistance )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1439:1: ( ruleDistance )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1440:1: ruleDistance
            {
             before(grammarAccess.getConditionAccess().getDistanceDistanceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDistance_in_rule__Condition__DistanceAssignment_2_12896);
            ruleDistance();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getDistanceDistanceParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__DistanceAssignment_2_1"


    // $ANTLR start "rule__Condition__AtLakeAssignment_3"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1449:1: rule__Condition__AtLakeAssignment_3 : ( ( 'at lake' ) ) ;
    public final void rule__Condition__AtLakeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1453:1: ( ( ( 'at lake' ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1454:1: ( ( 'at lake' ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1454:1: ( ( 'at lake' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1455:1: ( 'at lake' )
            {
             before(grammarAccess.getConditionAccess().getAtLakeAtLakeKeyword_3_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1456:1: ( 'at lake' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1457:1: 'at lake'
            {
             before(grammarAccess.getConditionAccess().getAtLakeAtLakeKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Condition__AtLakeAssignment_32932); 
             after(grammarAccess.getConditionAccess().getAtLakeAtLakeKeyword_3_0()); 

            }

             after(grammarAccess.getConditionAccess().getAtLakeAtLakeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__AtLakeAssignment_3"


    // $ANTLR start "rule__Condition__IsProbedAssignment_4"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1472:1: rule__Condition__IsProbedAssignment_4 : ( ( 'lake has not been probed' ) ) ;
    public final void rule__Condition__IsProbedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1476:1: ( ( ( 'lake has not been probed' ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1477:1: ( ( 'lake has not been probed' ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1477:1: ( ( 'lake has not been probed' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1478:1: ( 'lake has not been probed' )
            {
             before(grammarAccess.getConditionAccess().getIsProbedLakeHasNotBeenProbedKeyword_4_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1479:1: ( 'lake has not been probed' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1480:1: 'lake has not been probed'
            {
             before(grammarAccess.getConditionAccess().getIsProbedLakeHasNotBeenProbedKeyword_4_0()); 
            match(input,22,FOLLOW_22_in_rule__Condition__IsProbedAssignment_42976); 
             after(grammarAccess.getConditionAccess().getIsProbedLakeHasNotBeenProbedKeyword_4_0()); 

            }

             after(grammarAccess.getConditionAccess().getIsProbedLakeHasNotBeenProbedKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__IsProbedAssignment_4"


    // $ANTLR start "rule__ActionList__ActionsAssignment_0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1495:1: rule__ActionList__ActionsAssignment_0 : ( ruleAction ) ;
    public final void rule__ActionList__ActionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1499:1: ( ( ruleAction ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1500:1: ( ruleAction )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1500:1: ( ruleAction )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1501:1: ruleAction
            {
             before(grammarAccess.getActionListAccess().getActionsActionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__ActionList__ActionsAssignment_03015);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionListAccess().getActionsActionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionList__ActionsAssignment_0"


    // $ANTLR start "rule__ActionList__ActionsAssignment_1_1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1510:1: rule__ActionList__ActionsAssignment_1_1 : ( ruleAction ) ;
    public final void rule__ActionList__ActionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1514:1: ( ( ruleAction ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1515:1: ( ruleAction )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1515:1: ( ruleAction )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1516:1: ruleAction
            {
             before(grammarAccess.getActionListAccess().getActionsActionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__ActionList__ActionsAssignment_1_13046);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionListAccess().getActionsActionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionList__ActionsAssignment_1_1"


    // $ANTLR start "rule__Action__ShowLakesAssignment_0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1525:1: rule__Action__ShowLakesAssignment_0 : ( ( 'show lakes' ) ) ;
    public final void rule__Action__ShowLakesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1529:1: ( ( ( 'show lakes' ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1530:1: ( ( 'show lakes' ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1530:1: ( ( 'show lakes' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1531:1: ( 'show lakes' )
            {
             before(grammarAccess.getActionAccess().getShowLakesShowLakesKeyword_0_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1532:1: ( 'show lakes' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1533:1: 'show lakes'
            {
             before(grammarAccess.getActionAccess().getShowLakesShowLakesKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Action__ShowLakesAssignment_03082); 
             after(grammarAccess.getActionAccess().getShowLakesShowLakesKeyword_0_0()); 

            }

             after(grammarAccess.getActionAccess().getShowLakesShowLakesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ShowLakesAssignment_0"


    // $ANTLR start "rule__Action__DriveDirectionAssignment_1_0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1548:1: rule__Action__DriveDirectionAssignment_1_0 : ( ( 'drive' ) ) ;
    public final void rule__Action__DriveDirectionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1552:1: ( ( ( 'drive' ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1553:1: ( ( 'drive' ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1553:1: ( ( 'drive' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1554:1: ( 'drive' )
            {
             before(grammarAccess.getActionAccess().getDriveDirectionDriveKeyword_1_0_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1555:1: ( 'drive' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1556:1: 'drive'
            {
             before(grammarAccess.getActionAccess().getDriveDirectionDriveKeyword_1_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Action__DriveDirectionAssignment_1_03126); 
             after(grammarAccess.getActionAccess().getDriveDirectionDriveKeyword_1_0_0()); 

            }

             after(grammarAccess.getActionAccess().getDriveDirectionDriveKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__DriveDirectionAssignment_1_0"


    // $ANTLR start "rule__Action__DirectionAssignment_1_1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1571:1: rule__Action__DirectionAssignment_1_1 : ( ruleDirection ) ;
    public final void rule__Action__DirectionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1575:1: ( ( ruleDirection ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1576:1: ( ruleDirection )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1576:1: ( ruleDirection )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1577:1: ruleDirection
            {
             before(grammarAccess.getActionAccess().getDirectionDirectionEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDirection_in_rule__Action__DirectionAssignment_1_13165);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getActionAccess().getDirectionDirectionEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__DirectionAssignment_1_1"


    // $ANTLR start "rule__Action__DriveDistanceAssignment_2_0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1586:1: rule__Action__DriveDistanceAssignment_2_0 : ( ( 'drive' ) ) ;
    public final void rule__Action__DriveDistanceAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1590:1: ( ( ( 'drive' ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1591:1: ( ( 'drive' ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1591:1: ( ( 'drive' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1592:1: ( 'drive' )
            {
             before(grammarAccess.getActionAccess().getDriveDistanceDriveKeyword_2_0_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1593:1: ( 'drive' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1594:1: 'drive'
            {
             before(grammarAccess.getActionAccess().getDriveDistanceDriveKeyword_2_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Action__DriveDistanceAssignment_2_03201); 
             after(grammarAccess.getActionAccess().getDriveDistanceDriveKeyword_2_0_0()); 

            }

             after(grammarAccess.getActionAccess().getDriveDistanceDriveKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__DriveDistanceAssignment_2_0"


    // $ANTLR start "rule__Action__DirectionAssignment_2_1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1609:1: rule__Action__DirectionAssignment_2_1 : ( ruleDirection ) ;
    public final void rule__Action__DirectionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1613:1: ( ( ruleDirection ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1614:1: ( ruleDirection )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1614:1: ( ruleDirection )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1615:1: ruleDirection
            {
             before(grammarAccess.getActionAccess().getDirectionDirectionEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDirection_in_rule__Action__DirectionAssignment_2_13240);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getActionAccess().getDirectionDirectionEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__DirectionAssignment_2_1"


    // $ANTLR start "rule__Action__DistanceAssignment_2_2"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1624:1: rule__Action__DistanceAssignment_2_2 : ( ruleDistance ) ;
    public final void rule__Action__DistanceAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1628:1: ( ( ruleDistance ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1629:1: ( ruleDistance )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1629:1: ( ruleDistance )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1630:1: ruleDistance
            {
             before(grammarAccess.getActionAccess().getDistanceDistanceParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleDistance_in_rule__Action__DistanceAssignment_2_23271);
            ruleDistance();

            state._fsp--;

             after(grammarAccess.getActionAccess().getDistanceDistanceParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__DistanceAssignment_2_2"


    // $ANTLR start "rule__Action__SteerAssignment_3_0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1639:1: rule__Action__SteerAssignment_3_0 : ( ( 'steer' ) ) ;
    public final void rule__Action__SteerAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1643:1: ( ( ( 'steer' ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1644:1: ( ( 'steer' ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1644:1: ( ( 'steer' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1645:1: ( 'steer' )
            {
             before(grammarAccess.getActionAccess().getSteerSteerKeyword_3_0_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1646:1: ( 'steer' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1647:1: 'steer'
            {
             before(grammarAccess.getActionAccess().getSteerSteerKeyword_3_0_0()); 
            match(input,25,FOLLOW_25_in_rule__Action__SteerAssignment_3_03307); 
             after(grammarAccess.getActionAccess().getSteerSteerKeyword_3_0_0()); 

            }

             after(grammarAccess.getActionAccess().getSteerSteerKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__SteerAssignment_3_0"


    // $ANTLR start "rule__Action__AngleAssignment_3_1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1662:1: rule__Action__AngleAssignment_3_1 : ( ruleAngle ) ;
    public final void rule__Action__AngleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1666:1: ( ( ruleAngle ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1667:1: ( ruleAngle )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1667:1: ( ruleAngle )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1668:1: ruleAngle
            {
             before(grammarAccess.getActionAccess().getAngleAngleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAngle_in_rule__Action__AngleAssignment_3_13346);
            ruleAngle();

            state._fsp--;

             after(grammarAccess.getActionAccess().getAngleAngleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__AngleAssignment_3_1"


    // $ANTLR start "rule__Action__ProbeLakeAssignment_4"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1677:1: rule__Action__ProbeLakeAssignment_4 : ( ( 'probe lake' ) ) ;
    public final void rule__Action__ProbeLakeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1681:1: ( ( ( 'probe lake' ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1682:1: ( ( 'probe lake' ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1682:1: ( ( 'probe lake' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1683:1: ( 'probe lake' )
            {
             before(grammarAccess.getActionAccess().getProbeLakeProbeLakeKeyword_4_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1684:1: ( 'probe lake' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1685:1: 'probe lake'
            {
             before(grammarAccess.getActionAccess().getProbeLakeProbeLakeKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Action__ProbeLakeAssignment_43382); 
             after(grammarAccess.getActionAccess().getProbeLakeProbeLakeKeyword_4_0()); 

            }

             after(grammarAccess.getActionAccess().getProbeLakeProbeLakeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ProbeLakeAssignment_4"


    // $ANTLR start "rule__Action__BlinkLightsAssignment_5"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1700:1: rule__Action__BlinkLightsAssignment_5 : ( ( 'blink lights' ) ) ;
    public final void rule__Action__BlinkLightsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1704:1: ( ( ( 'blink lights' ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1705:1: ( ( 'blink lights' ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1705:1: ( ( 'blink lights' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1706:1: ( 'blink lights' )
            {
             before(grammarAccess.getActionAccess().getBlinkLightsBlinkLightsKeyword_5_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1707:1: ( 'blink lights' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1708:1: 'blink lights'
            {
             before(grammarAccess.getActionAccess().getBlinkLightsBlinkLightsKeyword_5_0()); 
            match(input,27,FOLLOW_27_in_rule__Action__BlinkLightsAssignment_53426); 
             after(grammarAccess.getActionAccess().getBlinkLightsBlinkLightsKeyword_5_0()); 

            }

             after(grammarAccess.getActionAccess().getBlinkLightsBlinkLightsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__BlinkLightsAssignment_5"


    // $ANTLR start "rule__Distance__ValueAssignment_0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1723:1: rule__Distance__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Distance__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1727:1: ( ( RULE_INT ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1728:1: ( RULE_INT )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1728:1: ( RULE_INT )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1729:1: RULE_INT
            {
             before(grammarAccess.getDistanceAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Distance__ValueAssignment_03465); 
             after(grammarAccess.getDistanceAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__ValueAssignment_0"


    // $ANTLR start "rule__Angle__ValueAssignment_0_0"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1738:1: rule__Angle__ValueAssignment_0_0 : ( RULE_INT ) ;
    public final void rule__Angle__ValueAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1742:1: ( ( RULE_INT ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1743:1: ( RULE_INT )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1743:1: ( RULE_INT )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1744:1: RULE_INT
            {
             before(grammarAccess.getAngleAccess().getValueINTTerminalRuleCall_0_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Angle__ValueAssignment_0_03496); 
             after(grammarAccess.getAngleAccess().getValueINTTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Angle__ValueAssignment_0_0"


    // $ANTLR start "rule__Angle__AwayAssignment_1"
    // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1753:1: rule__Angle__AwayAssignment_1 : ( ( 'away from obstacles' ) ) ;
    public final void rule__Angle__AwayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1757:1: ( ( ( 'away from obstacles' ) ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1758:1: ( ( 'away from obstacles' ) )
            {
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1758:1: ( ( 'away from obstacles' ) )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1759:1: ( 'away from obstacles' )
            {
             before(grammarAccess.getAngleAccess().getAwayAwayFromObstaclesKeyword_1_0()); 
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1760:1: ( 'away from obstacles' )
            // ../nl.marsrover.ui/src-gen/nl/marsrover/ui/contentassist/antlr/internal/InternalDSL.g:1761:1: 'away from obstacles'
            {
             before(grammarAccess.getAngleAccess().getAwayAwayFromObstaclesKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Angle__AwayAssignment_13532); 
             after(grammarAccess.getAngleAccess().getAwayAwayFromObstaclesKeyword_1_0()); 

            }

             after(grammarAccess.getAngleAccess().getAwayAwayFromObstaclesKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Angle__AwayAssignment_1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\12\uffff";
    static final String DFA3_eofS =
        "\6\uffff\2\11\2\uffff";
    static final String DFA3_minS =
        "\1\27\1\uffff\1\13\3\uffff\2\4\2\uffff";
    static final String DFA3_maxS =
        "\1\33\1\uffff\1\14\3\uffff\2\16\2\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\2\uffff\1\3\1\2";
    static final String DFA3_specialS =
        "\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5",
            "",
            "\1\6\1\7",
            "",
            "",
            "",
            "\1\10\10\uffff\2\11",
            "\1\10\10\uffff\2\11",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "343:1: rule__Action__Alternatives : ( ( ( rule__Action__ShowLakesAssignment_0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) | ( ( rule__Action__Group_3__0 ) ) | ( ( rule__Action__ProbeLakeAssignment_4 ) ) | ( ( rule__Action__BlinkLightsAssignment_5 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleSpecification_in_entryRuleSpecification61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecification68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Specification__RuleAssignment_in_ruleSpecification94 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionList_in_entryRuleConditionList182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionList189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionList__Group__0_in_ruleConditionList215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Alternatives_in_ruleCondition275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionList_in_entryRuleActionList302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionList309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionList__Group__0_in_ruleActionList335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Alternatives_in_ruleAction395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistance_in_entryRuleDistance422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistance429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distance__Group__0_in_ruleDistance455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAngle_in_entryRuleAngle482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAngle489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Angle__Alternatives_in_ruleAngle515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__Alternatives_in_ruleDirection552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_0__0_in_rule__Condition__Alternatives587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__AllLakesAssignment_1_in_rule__Condition__Alternatives605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_2__0_in_rule__Condition__Alternatives623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__AtLakeAssignment_3_in_rule__Condition__Alternatives641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__IsProbedAssignment_4_in_rule__Condition__Alternatives659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__ShowLakesAssignment_0_in_rule__Action__Alternatives692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_1__0_in_rule__Action__Alternatives710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_2__0_in_rule__Action__Alternatives728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0_in_rule__Action__Alternatives746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__ProbeLakeAssignment_4_in_rule__Action__Alternatives764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__BlinkLightsAssignment_5_in_rule__Action__Alternatives782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Angle__Group_0__0_in_rule__Angle__Alternatives815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Angle__AwayAssignment_1_in_rule__Angle__Alternatives833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Direction__Alternatives867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Direction__Alternatives888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__0921 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__0924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Rule__Group__0__Impl952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__1983 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ConditionListAssignment_1_in_rule__Rule__Group__1__Impl1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21043 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Rule__Group__2__Impl1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ActionListAssignment_3_in_rule__Rule__Group__3__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionList__Group__0__Impl_in_rule__ConditionList__Group__01170 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ConditionList__Group__1_in_rule__ConditionList__Group__01173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionList__ConditionsAssignment_0_in_rule__ConditionList__Group__0__Impl1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionList__Group__1__Impl_in_rule__ConditionList__Group__11230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionList__Group_1__0_in_rule__ConditionList__Group__1__Impl1257 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ConditionList__Group_1__0__Impl_in_rule__ConditionList__Group_1__01292 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_rule__ConditionList__Group_1__1_in_rule__ConditionList__Group_1__01295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ConditionList__Group_1__0__Impl1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionList__Group_1__1__Impl_in_rule__ConditionList__Group_1__11354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionList__ConditionsAssignment_1_1_in_rule__ConditionList__Group_1__1__Impl1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_0__0__Impl_in_rule__Condition__Group_0__01415 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_rule__Condition__Group_0__1_in_rule__Condition__Group_0__01418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__NotAssignment_0_0_in_rule__Condition__Group_0__0__Impl1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_0__1__Impl_in_rule__Condition__Group_0__11475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ConditionAssignment_0_1_in_rule__Condition__Group_0__1__Impl1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_2__0__Impl_in_rule__Condition__Group_2__01536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Condition__Group_2__1_in_rule__Condition__Group_2__01539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__CollisionAssignment_2_0_in_rule__Condition__Group_2__0__Impl1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_2__1__Impl_in_rule__Condition__Group_2__11596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__DistanceAssignment_2_1_in_rule__Condition__Group_2__1__Impl1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionList__Group__0__Impl_in_rule__ActionList__Group__01657 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ActionList__Group__1_in_rule__ActionList__Group__01660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionList__ActionsAssignment_0_in_rule__ActionList__Group__0__Impl1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionList__Group__1__Impl_in_rule__ActionList__Group__11717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionList__Group_1__0_in_rule__ActionList__Group__1__Impl1744 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__ActionList__Group_1__0__Impl_in_rule__ActionList__Group_1__01779 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_rule__ActionList__Group_1__1_in_rule__ActionList__Group_1__01782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ActionList__Group_1__0__Impl1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionList__Group_1__1__Impl_in_rule__ActionList__Group_1__11841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionList__ActionsAssignment_1_1_in_rule__ActionList__Group_1__1__Impl1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_1__0__Impl_in_rule__Action__Group_1__01902 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Action__Group_1__1_in_rule__Action__Group_1__01905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DriveDirectionAssignment_1_0_in_rule__Action__Group_1__0__Impl1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_1__1__Impl_in_rule__Action__Group_1__11962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DirectionAssignment_1_1_in_rule__Action__Group_1__1__Impl1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_2__0__Impl_in_rule__Action__Group_2__02023 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Action__Group_2__1_in_rule__Action__Group_2__02026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DriveDistanceAssignment_2_0_in_rule__Action__Group_2__0__Impl2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_2__1__Impl_in_rule__Action__Group_2__12083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group_2__2_in_rule__Action__Group_2__12086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DirectionAssignment_2_1_in_rule__Action__Group_2__1__Impl2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_2__2__Impl_in_rule__Action__Group_2__22143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DistanceAssignment_2_2_in_rule__Action__Group_2__2__Impl2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__02206 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__02209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__SteerAssignment_3_0_in_rule__Action__Group_3__0__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__12266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__AngleAssignment_3_1_in_rule__Action__Group_3__1__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distance__Group__0__Impl_in_rule__Distance__Group__02327 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Distance__Group__1_in_rule__Distance__Group__02330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distance__ValueAssignment_0_in_rule__Distance__Group__0__Impl2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distance__Group__1__Impl_in_rule__Distance__Group__12387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Distance__Group__1__Impl2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Angle__Group_0__0__Impl_in_rule__Angle__Group_0__02450 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Angle__Group_0__1_in_rule__Angle__Group_0__02453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Angle__ValueAssignment_0_0_in_rule__Angle__Group_0__0__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Angle__Group_0__1__Impl_in_rule__Angle__Group_0__12510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Angle__Group_0__1__Impl2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Specification__RuleAssignment2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionList_in_rule__Rule__ConditionListAssignment_12609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionList_in_rule__Rule__ActionListAssignment_32640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__ConditionList__ConditionsAssignment_02671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__ConditionList__ConditionsAssignment_1_12702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Condition__NotAssignment_0_02738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Condition__ConditionAssignment_0_12777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Condition__AllLakesAssignment_12813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Condition__CollisionAssignment_2_02857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistance_in_rule__Condition__DistanceAssignment_2_12896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Condition__AtLakeAssignment_32932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Condition__IsProbedAssignment_42976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__ActionList__ActionsAssignment_03015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__ActionList__ActionsAssignment_1_13046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Action__ShowLakesAssignment_03082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Action__DriveDirectionAssignment_1_03126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_rule__Action__DirectionAssignment_1_13165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Action__DriveDistanceAssignment_2_03201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_rule__Action__DirectionAssignment_2_13240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistance_in_rule__Action__DistanceAssignment_2_23271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Action__SteerAssignment_3_03307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAngle_in_rule__Action__AngleAssignment_3_13346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Action__ProbeLakeAssignment_43382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Action__BlinkLightsAssignment_53426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Distance__ValueAssignment_03465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Angle__ValueAssignment_0_03496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Angle__AwayAssignment_13532 = new BitSet(new long[]{0x0000000000000002L});

}