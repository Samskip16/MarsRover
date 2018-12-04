package mars.ru.des.robot.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import mars.ru.des.robot.services.TaskDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ROCK'", "'LAKE'", "'FAST'", "'NORMAL'", "'SLOW'", "'RED'", "'GREEN'", "'BLUE'", "'Task:'", "'action:'", "'detectors:'", "'Drive'", "'Until'", "'Found'", "'Investigate'", "'Speak'", "'FindAndFollowLineFor'", "'meters'", "'Avoid'", "'By'", "'and'", "'MoveBackwards'", "'Turn'", "'degrees'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTaskDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaskDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaskDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTaskDSL.g"; }


    	private TaskDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(TaskDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTask"
    // InternalTaskDSL.g:53:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalTaskDSL.g:54:1: ( ruleTask EOF )
            // InternalTaskDSL.g:55:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalTaskDSL.g:62:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:66:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalTaskDSL.g:67:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalTaskDSL.g:67:2: ( ( rule__Task__Group__0 ) )
            // InternalTaskDSL.g:68:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalTaskDSL.g:69:3: ( rule__Task__Group__0 )
            // InternalTaskDSL.g:69:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleAction"
    // InternalTaskDSL.g:78:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:79:1: ( ruleAction EOF )
            // InternalTaskDSL.g:80:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalTaskDSL.g:87:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:91:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalTaskDSL.g:92:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalTaskDSL.g:92:2: ( ( rule__Action__Alternatives ) )
            // InternalTaskDSL.g:93:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalTaskDSL.g:94:3: ( rule__Action__Alternatives )
            // InternalTaskDSL.g:94:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleDetectors"
    // InternalTaskDSL.g:103:1: entryRuleDetectors : ruleDetectors EOF ;
    public final void entryRuleDetectors() throws RecognitionException {
        try {
            // InternalTaskDSL.g:104:1: ( ruleDetectors EOF )
            // InternalTaskDSL.g:105:1: ruleDetectors EOF
            {
             before(grammarAccess.getDetectorsRule()); 
            pushFollow(FOLLOW_1);
            ruleDetectors();

            state._fsp--;

             after(grammarAccess.getDetectorsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDetectors"


    // $ANTLR start "ruleDetectors"
    // InternalTaskDSL.g:112:1: ruleDetectors : ( ( rule__Detectors__Group__0 ) ) ;
    public final void ruleDetectors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:116:2: ( ( ( rule__Detectors__Group__0 ) ) )
            // InternalTaskDSL.g:117:2: ( ( rule__Detectors__Group__0 ) )
            {
            // InternalTaskDSL.g:117:2: ( ( rule__Detectors__Group__0 ) )
            // InternalTaskDSL.g:118:3: ( rule__Detectors__Group__0 )
            {
             before(grammarAccess.getDetectorsAccess().getGroup()); 
            // InternalTaskDSL.g:119:3: ( rule__Detectors__Group__0 )
            // InternalTaskDSL.g:119:4: rule__Detectors__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Detectors__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDetectorsAccess().getGroup()); 

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
    // $ANTLR end "ruleDetectors"


    // $ANTLR start "entryRuleDriveUntil"
    // InternalTaskDSL.g:128:1: entryRuleDriveUntil : ruleDriveUntil EOF ;
    public final void entryRuleDriveUntil() throws RecognitionException {
        try {
            // InternalTaskDSL.g:129:1: ( ruleDriveUntil EOF )
            // InternalTaskDSL.g:130:1: ruleDriveUntil EOF
            {
             before(grammarAccess.getDriveUntilRule()); 
            pushFollow(FOLLOW_1);
            ruleDriveUntil();

            state._fsp--;

             after(grammarAccess.getDriveUntilRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDriveUntil"


    // $ANTLR start "ruleDriveUntil"
    // InternalTaskDSL.g:137:1: ruleDriveUntil : ( ( rule__DriveUntil__Group__0 ) ) ;
    public final void ruleDriveUntil() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:141:2: ( ( ( rule__DriveUntil__Group__0 ) ) )
            // InternalTaskDSL.g:142:2: ( ( rule__DriveUntil__Group__0 ) )
            {
            // InternalTaskDSL.g:142:2: ( ( rule__DriveUntil__Group__0 ) )
            // InternalTaskDSL.g:143:3: ( rule__DriveUntil__Group__0 )
            {
             before(grammarAccess.getDriveUntilAccess().getGroup()); 
            // InternalTaskDSL.g:144:3: ( rule__DriveUntil__Group__0 )
            // InternalTaskDSL.g:144:4: rule__DriveUntil__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DriveUntil__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDriveUntilAccess().getGroup()); 

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
    // $ANTLR end "ruleDriveUntil"


    // $ANTLR start "entryRuleInvestigate"
    // InternalTaskDSL.g:153:1: entryRuleInvestigate : ruleInvestigate EOF ;
    public final void entryRuleInvestigate() throws RecognitionException {
        try {
            // InternalTaskDSL.g:154:1: ( ruleInvestigate EOF )
            // InternalTaskDSL.g:155:1: ruleInvestigate EOF
            {
             before(grammarAccess.getInvestigateRule()); 
            pushFollow(FOLLOW_1);
            ruleInvestigate();

            state._fsp--;

             after(grammarAccess.getInvestigateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInvestigate"


    // $ANTLR start "ruleInvestigate"
    // InternalTaskDSL.g:162:1: ruleInvestigate : ( ( rule__Investigate__Group__0 ) ) ;
    public final void ruleInvestigate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:166:2: ( ( ( rule__Investigate__Group__0 ) ) )
            // InternalTaskDSL.g:167:2: ( ( rule__Investigate__Group__0 ) )
            {
            // InternalTaskDSL.g:167:2: ( ( rule__Investigate__Group__0 ) )
            // InternalTaskDSL.g:168:3: ( rule__Investigate__Group__0 )
            {
             before(grammarAccess.getInvestigateAccess().getGroup()); 
            // InternalTaskDSL.g:169:3: ( rule__Investigate__Group__0 )
            // InternalTaskDSL.g:169:4: rule__Investigate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Investigate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInvestigateAccess().getGroup()); 

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
    // $ANTLR end "ruleInvestigate"


    // $ANTLR start "entryRuleSpeak"
    // InternalTaskDSL.g:178:1: entryRuleSpeak : ruleSpeak EOF ;
    public final void entryRuleSpeak() throws RecognitionException {
        try {
            // InternalTaskDSL.g:179:1: ( ruleSpeak EOF )
            // InternalTaskDSL.g:180:1: ruleSpeak EOF
            {
             before(grammarAccess.getSpeakRule()); 
            pushFollow(FOLLOW_1);
            ruleSpeak();

            state._fsp--;

             after(grammarAccess.getSpeakRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpeak"


    // $ANTLR start "ruleSpeak"
    // InternalTaskDSL.g:187:1: ruleSpeak : ( ( rule__Speak__Group__0 ) ) ;
    public final void ruleSpeak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:191:2: ( ( ( rule__Speak__Group__0 ) ) )
            // InternalTaskDSL.g:192:2: ( ( rule__Speak__Group__0 ) )
            {
            // InternalTaskDSL.g:192:2: ( ( rule__Speak__Group__0 ) )
            // InternalTaskDSL.g:193:3: ( rule__Speak__Group__0 )
            {
             before(grammarAccess.getSpeakAccess().getGroup()); 
            // InternalTaskDSL.g:194:3: ( rule__Speak__Group__0 )
            // InternalTaskDSL.g:194:4: rule__Speak__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Speak__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpeakAccess().getGroup()); 

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
    // $ANTLR end "ruleSpeak"


    // $ANTLR start "entryRuleFollowLine"
    // InternalTaskDSL.g:203:1: entryRuleFollowLine : ruleFollowLine EOF ;
    public final void entryRuleFollowLine() throws RecognitionException {
        try {
            // InternalTaskDSL.g:204:1: ( ruleFollowLine EOF )
            // InternalTaskDSL.g:205:1: ruleFollowLine EOF
            {
             before(grammarAccess.getFollowLineRule()); 
            pushFollow(FOLLOW_1);
            ruleFollowLine();

            state._fsp--;

             after(grammarAccess.getFollowLineRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFollowLine"


    // $ANTLR start "ruleFollowLine"
    // InternalTaskDSL.g:212:1: ruleFollowLine : ( ( rule__FollowLine__Group__0 ) ) ;
    public final void ruleFollowLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:216:2: ( ( ( rule__FollowLine__Group__0 ) ) )
            // InternalTaskDSL.g:217:2: ( ( rule__FollowLine__Group__0 ) )
            {
            // InternalTaskDSL.g:217:2: ( ( rule__FollowLine__Group__0 ) )
            // InternalTaskDSL.g:218:3: ( rule__FollowLine__Group__0 )
            {
             before(grammarAccess.getFollowLineAccess().getGroup()); 
            // InternalTaskDSL.g:219:3: ( rule__FollowLine__Group__0 )
            // InternalTaskDSL.g:219:4: rule__FollowLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FollowLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFollowLineAccess().getGroup()); 

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
    // $ANTLR end "ruleFollowLine"


    // $ANTLR start "entryRuleAvoid"
    // InternalTaskDSL.g:228:1: entryRuleAvoid : ruleAvoid EOF ;
    public final void entryRuleAvoid() throws RecognitionException {
        try {
            // InternalTaskDSL.g:229:1: ( ruleAvoid EOF )
            // InternalTaskDSL.g:230:1: ruleAvoid EOF
            {
             before(grammarAccess.getAvoidRule()); 
            pushFollow(FOLLOW_1);
            ruleAvoid();

            state._fsp--;

             after(grammarAccess.getAvoidRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAvoid"


    // $ANTLR start "ruleAvoid"
    // InternalTaskDSL.g:237:1: ruleAvoid : ( ( rule__Avoid__Group__0 ) ) ;
    public final void ruleAvoid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:241:2: ( ( ( rule__Avoid__Group__0 ) ) )
            // InternalTaskDSL.g:242:2: ( ( rule__Avoid__Group__0 ) )
            {
            // InternalTaskDSL.g:242:2: ( ( rule__Avoid__Group__0 ) )
            // InternalTaskDSL.g:243:3: ( rule__Avoid__Group__0 )
            {
             before(grammarAccess.getAvoidAccess().getGroup()); 
            // InternalTaskDSL.g:244:3: ( rule__Avoid__Group__0 )
            // InternalTaskDSL.g:244:4: rule__Avoid__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Avoid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAvoidAccess().getGroup()); 

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
    // $ANTLR end "ruleAvoid"


    // $ANTLR start "entryRuleAvoidAction"
    // InternalTaskDSL.g:253:1: entryRuleAvoidAction : ruleAvoidAction EOF ;
    public final void entryRuleAvoidAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:254:1: ( ruleAvoidAction EOF )
            // InternalTaskDSL.g:255:1: ruleAvoidAction EOF
            {
             before(grammarAccess.getAvoidActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAvoidAction();

            state._fsp--;

             after(grammarAccess.getAvoidActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAvoidAction"


    // $ANTLR start "ruleAvoidAction"
    // InternalTaskDSL.g:262:1: ruleAvoidAction : ( ( rule__AvoidAction__Group__0 ) ) ;
    public final void ruleAvoidAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:266:2: ( ( ( rule__AvoidAction__Group__0 ) ) )
            // InternalTaskDSL.g:267:2: ( ( rule__AvoidAction__Group__0 ) )
            {
            // InternalTaskDSL.g:267:2: ( ( rule__AvoidAction__Group__0 ) )
            // InternalTaskDSL.g:268:3: ( rule__AvoidAction__Group__0 )
            {
             before(grammarAccess.getAvoidActionAccess().getGroup()); 
            // InternalTaskDSL.g:269:3: ( rule__AvoidAction__Group__0 )
            // InternalTaskDSL.g:269:4: rule__AvoidAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AvoidAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAvoidActionAccess().getGroup()); 

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
    // $ANTLR end "ruleAvoidAction"


    // $ANTLR start "entryRuleMoveBack"
    // InternalTaskDSL.g:278:1: entryRuleMoveBack : ruleMoveBack EOF ;
    public final void entryRuleMoveBack() throws RecognitionException {
        try {
            // InternalTaskDSL.g:279:1: ( ruleMoveBack EOF )
            // InternalTaskDSL.g:280:1: ruleMoveBack EOF
            {
             before(grammarAccess.getMoveBackRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveBack();

            state._fsp--;

             after(grammarAccess.getMoveBackRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMoveBack"


    // $ANTLR start "ruleMoveBack"
    // InternalTaskDSL.g:287:1: ruleMoveBack : ( ( rule__MoveBack__Group__0 ) ) ;
    public final void ruleMoveBack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:291:2: ( ( ( rule__MoveBack__Group__0 ) ) )
            // InternalTaskDSL.g:292:2: ( ( rule__MoveBack__Group__0 ) )
            {
            // InternalTaskDSL.g:292:2: ( ( rule__MoveBack__Group__0 ) )
            // InternalTaskDSL.g:293:3: ( rule__MoveBack__Group__0 )
            {
             before(grammarAccess.getMoveBackAccess().getGroup()); 
            // InternalTaskDSL.g:294:3: ( rule__MoveBack__Group__0 )
            // InternalTaskDSL.g:294:4: rule__MoveBack__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveBack__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveBackAccess().getGroup()); 

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
    // $ANTLR end "ruleMoveBack"


    // $ANTLR start "entryRuleTurn"
    // InternalTaskDSL.g:303:1: entryRuleTurn : ruleTurn EOF ;
    public final void entryRuleTurn() throws RecognitionException {
        try {
            // InternalTaskDSL.g:304:1: ( ruleTurn EOF )
            // InternalTaskDSL.g:305:1: ruleTurn EOF
            {
             before(grammarAccess.getTurnRule()); 
            pushFollow(FOLLOW_1);
            ruleTurn();

            state._fsp--;

             after(grammarAccess.getTurnRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalTaskDSL.g:312:1: ruleTurn : ( ( rule__Turn__Group__0 ) ) ;
    public final void ruleTurn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:316:2: ( ( ( rule__Turn__Group__0 ) ) )
            // InternalTaskDSL.g:317:2: ( ( rule__Turn__Group__0 ) )
            {
            // InternalTaskDSL.g:317:2: ( ( rule__Turn__Group__0 ) )
            // InternalTaskDSL.g:318:3: ( rule__Turn__Group__0 )
            {
             before(grammarAccess.getTurnAccess().getGroup()); 
            // InternalTaskDSL.g:319:3: ( rule__Turn__Group__0 )
            // InternalTaskDSL.g:319:4: rule__Turn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnAccess().getGroup()); 

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
    // $ANTLR end "ruleTurn"


    // $ANTLR start "ruleObject"
    // InternalTaskDSL.g:328:1: ruleObject : ( ( rule__Object__Alternatives ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:332:1: ( ( ( rule__Object__Alternatives ) ) )
            // InternalTaskDSL.g:333:2: ( ( rule__Object__Alternatives ) )
            {
            // InternalTaskDSL.g:333:2: ( ( rule__Object__Alternatives ) )
            // InternalTaskDSL.g:334:3: ( rule__Object__Alternatives )
            {
             before(grammarAccess.getObjectAccess().getAlternatives()); 
            // InternalTaskDSL.g:335:3: ( rule__Object__Alternatives )
            // InternalTaskDSL.g:335:4: rule__Object__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Object__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getAlternatives()); 

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "ruleSpeed"
    // InternalTaskDSL.g:344:1: ruleSpeed : ( ( rule__Speed__Alternatives ) ) ;
    public final void ruleSpeed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:348:1: ( ( ( rule__Speed__Alternatives ) ) )
            // InternalTaskDSL.g:349:2: ( ( rule__Speed__Alternatives ) )
            {
            // InternalTaskDSL.g:349:2: ( ( rule__Speed__Alternatives ) )
            // InternalTaskDSL.g:350:3: ( rule__Speed__Alternatives )
            {
             before(grammarAccess.getSpeedAccess().getAlternatives()); 
            // InternalTaskDSL.g:351:3: ( rule__Speed__Alternatives )
            // InternalTaskDSL.g:351:4: rule__Speed__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Speed__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSpeedAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSpeed"


    // $ANTLR start "ruleColor"
    // InternalTaskDSL.g:360:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:364:1: ( ( ( rule__Color__Alternatives ) ) )
            // InternalTaskDSL.g:365:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalTaskDSL.g:365:2: ( ( rule__Color__Alternatives ) )
            // InternalTaskDSL.g:366:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalTaskDSL.g:367:3: ( rule__Color__Alternatives )
            // InternalTaskDSL.g:367:4: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalTaskDSL.g:375:1: rule__Action__Alternatives : ( ( ( rule__Action__Group_0__0 ) ) | ( ruleInvestigate ) | ( ruleSpeak ) | ( ruleFollowLine ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:379:1: ( ( ( rule__Action__Group_0__0 ) ) | ( ruleInvestigate ) | ( ruleSpeak ) | ( ruleFollowLine ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case 27:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTaskDSL.g:380:2: ( ( rule__Action__Group_0__0 ) )
                    {
                    // InternalTaskDSL.g:380:2: ( ( rule__Action__Group_0__0 ) )
                    // InternalTaskDSL.g:381:3: ( rule__Action__Group_0__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_0()); 
                    // InternalTaskDSL.g:382:3: ( rule__Action__Group_0__0 )
                    // InternalTaskDSL.g:382:4: rule__Action__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:386:2: ( ruleInvestigate )
                    {
                    // InternalTaskDSL.g:386:2: ( ruleInvestigate )
                    // InternalTaskDSL.g:387:3: ruleInvestigate
                    {
                     before(grammarAccess.getActionAccess().getInvestigateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInvestigate();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getInvestigateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:392:2: ( ruleSpeak )
                    {
                    // InternalTaskDSL.g:392:2: ( ruleSpeak )
                    // InternalTaskDSL.g:393:3: ruleSpeak
                    {
                     before(grammarAccess.getActionAccess().getSpeakParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSpeak();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getSpeakParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:398:2: ( ruleFollowLine )
                    {
                    // InternalTaskDSL.g:398:2: ( ruleFollowLine )
                    // InternalTaskDSL.g:399:3: ruleFollowLine
                    {
                     before(grammarAccess.getActionAccess().getFollowLineParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFollowLine();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getFollowLineParserRuleCall_3()); 

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


    // $ANTLR start "rule__AvoidAction__Alternatives_0"
    // InternalTaskDSL.g:408:1: rule__AvoidAction__Alternatives_0 : ( ( ruleMoveBack ) | ( ruleTurn ) );
    public final void rule__AvoidAction__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:412:1: ( ( ruleMoveBack ) | ( ruleTurn ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==32) ) {
                alt2=1;
            }
            else if ( (LA2_0==33) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTaskDSL.g:413:2: ( ruleMoveBack )
                    {
                    // InternalTaskDSL.g:413:2: ( ruleMoveBack )
                    // InternalTaskDSL.g:414:3: ruleMoveBack
                    {
                     before(grammarAccess.getAvoidActionAccess().getMoveBackParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveBack();

                    state._fsp--;

                     after(grammarAccess.getAvoidActionAccess().getMoveBackParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:419:2: ( ruleTurn )
                    {
                    // InternalTaskDSL.g:419:2: ( ruleTurn )
                    // InternalTaskDSL.g:420:3: ruleTurn
                    {
                     before(grammarAccess.getAvoidActionAccess().getTurnParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTurn();

                    state._fsp--;

                     after(grammarAccess.getAvoidActionAccess().getTurnParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__AvoidAction__Alternatives_0"


    // $ANTLR start "rule__Object__Alternatives"
    // InternalTaskDSL.g:429:1: rule__Object__Alternatives : ( ( ( 'ROCK' ) ) | ( ( 'LAKE' ) ) );
    public final void rule__Object__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:433:1: ( ( ( 'ROCK' ) ) | ( ( 'LAKE' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTaskDSL.g:434:2: ( ( 'ROCK' ) )
                    {
                    // InternalTaskDSL.g:434:2: ( ( 'ROCK' ) )
                    // InternalTaskDSL.g:435:3: ( 'ROCK' )
                    {
                     before(grammarAccess.getObjectAccess().getROCKEnumLiteralDeclaration_0()); 
                    // InternalTaskDSL.g:436:3: ( 'ROCK' )
                    // InternalTaskDSL.g:436:4: 'ROCK'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getObjectAccess().getROCKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:440:2: ( ( 'LAKE' ) )
                    {
                    // InternalTaskDSL.g:440:2: ( ( 'LAKE' ) )
                    // InternalTaskDSL.g:441:3: ( 'LAKE' )
                    {
                     before(grammarAccess.getObjectAccess().getLAKEEnumLiteralDeclaration_1()); 
                    // InternalTaskDSL.g:442:3: ( 'LAKE' )
                    // InternalTaskDSL.g:442:4: 'LAKE'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getObjectAccess().getLAKEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Object__Alternatives"


    // $ANTLR start "rule__Speed__Alternatives"
    // InternalTaskDSL.g:450:1: rule__Speed__Alternatives : ( ( ( 'FAST' ) ) | ( ( 'NORMAL' ) ) | ( ( 'SLOW' ) ) );
    public final void rule__Speed__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:454:1: ( ( ( 'FAST' ) ) | ( ( 'NORMAL' ) ) | ( ( 'SLOW' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTaskDSL.g:455:2: ( ( 'FAST' ) )
                    {
                    // InternalTaskDSL.g:455:2: ( ( 'FAST' ) )
                    // InternalTaskDSL.g:456:3: ( 'FAST' )
                    {
                     before(grammarAccess.getSpeedAccess().getFASTEnumLiteralDeclaration_0()); 
                    // InternalTaskDSL.g:457:3: ( 'FAST' )
                    // InternalTaskDSL.g:457:4: 'FAST'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSpeedAccess().getFASTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:461:2: ( ( 'NORMAL' ) )
                    {
                    // InternalTaskDSL.g:461:2: ( ( 'NORMAL' ) )
                    // InternalTaskDSL.g:462:3: ( 'NORMAL' )
                    {
                     before(grammarAccess.getSpeedAccess().getNORMALEnumLiteralDeclaration_1()); 
                    // InternalTaskDSL.g:463:3: ( 'NORMAL' )
                    // InternalTaskDSL.g:463:4: 'NORMAL'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSpeedAccess().getNORMALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:467:2: ( ( 'SLOW' ) )
                    {
                    // InternalTaskDSL.g:467:2: ( ( 'SLOW' ) )
                    // InternalTaskDSL.g:468:3: ( 'SLOW' )
                    {
                     before(grammarAccess.getSpeedAccess().getSLOWEnumLiteralDeclaration_2()); 
                    // InternalTaskDSL.g:469:3: ( 'SLOW' )
                    // InternalTaskDSL.g:469:4: 'SLOW'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSpeedAccess().getSLOWEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Speed__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // InternalTaskDSL.g:477:1: rule__Color__Alternatives : ( ( ( 'RED' ) ) | ( ( 'GREEN' ) ) | ( ( 'BLUE' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:481:1: ( ( ( 'RED' ) ) | ( ( 'GREEN' ) ) | ( ( 'BLUE' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTaskDSL.g:482:2: ( ( 'RED' ) )
                    {
                    // InternalTaskDSL.g:482:2: ( ( 'RED' ) )
                    // InternalTaskDSL.g:483:3: ( 'RED' )
                    {
                     before(grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0()); 
                    // InternalTaskDSL.g:484:3: ( 'RED' )
                    // InternalTaskDSL.g:484:4: 'RED'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:488:2: ( ( 'GREEN' ) )
                    {
                    // InternalTaskDSL.g:488:2: ( ( 'GREEN' ) )
                    // InternalTaskDSL.g:489:3: ( 'GREEN' )
                    {
                     before(grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_1()); 
                    // InternalTaskDSL.g:490:3: ( 'GREEN' )
                    // InternalTaskDSL.g:490:4: 'GREEN'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:494:2: ( ( 'BLUE' ) )
                    {
                    // InternalTaskDSL.g:494:2: ( ( 'BLUE' ) )
                    // InternalTaskDSL.g:495:3: ( 'BLUE' )
                    {
                     before(grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_2()); 
                    // InternalTaskDSL.g:496:3: ( 'BLUE' )
                    // InternalTaskDSL.g:496:4: 'BLUE'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__Task__Group__0"
    // InternalTaskDSL.g:504:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:508:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalTaskDSL.g:509:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

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
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalTaskDSL.g:516:1: rule__Task__Group__0__Impl : ( 'Task:' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:520:1: ( ( 'Task:' ) )
            // InternalTaskDSL.g:521:1: ( 'Task:' )
            {
            // InternalTaskDSL.g:521:1: ( 'Task:' )
            // InternalTaskDSL.g:522:2: 'Task:'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

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
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalTaskDSL.g:531:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:535:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalTaskDSL.g:536:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

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
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalTaskDSL.g:543:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:547:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:548:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:548:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalTaskDSL.g:549:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalTaskDSL.g:550:2: ( rule__Task__NameAssignment_1 )
            // InternalTaskDSL.g:550:3: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalTaskDSL.g:558:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:562:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalTaskDSL.g:563:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

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
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalTaskDSL.g:570:1: rule__Task__Group__2__Impl : ( ( rule__Task__ActionAssignment_2 ) ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:574:1: ( ( ( rule__Task__ActionAssignment_2 ) ) )
            // InternalTaskDSL.g:575:1: ( ( rule__Task__ActionAssignment_2 ) )
            {
            // InternalTaskDSL.g:575:1: ( ( rule__Task__ActionAssignment_2 ) )
            // InternalTaskDSL.g:576:2: ( rule__Task__ActionAssignment_2 )
            {
             before(grammarAccess.getTaskAccess().getActionAssignment_2()); 
            // InternalTaskDSL.g:577:2: ( rule__Task__ActionAssignment_2 )
            // InternalTaskDSL.g:577:3: rule__Task__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__ActionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getActionAssignment_2()); 

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
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalTaskDSL.g:585:1: rule__Task__Group__3 : rule__Task__Group__3__Impl ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:589:1: ( rule__Task__Group__3__Impl )
            // InternalTaskDSL.g:590:2: rule__Task__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__3__Impl();

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
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalTaskDSL.g:596:1: rule__Task__Group__3__Impl : ( ( rule__Task__DetectorAssignment_3 )? ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:600:1: ( ( ( rule__Task__DetectorAssignment_3 )? ) )
            // InternalTaskDSL.g:601:1: ( ( rule__Task__DetectorAssignment_3 )? )
            {
            // InternalTaskDSL.g:601:1: ( ( rule__Task__DetectorAssignment_3 )? )
            // InternalTaskDSL.g:602:2: ( rule__Task__DetectorAssignment_3 )?
            {
             before(grammarAccess.getTaskAccess().getDetectorAssignment_3()); 
            // InternalTaskDSL.g:603:2: ( rule__Task__DetectorAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTaskDSL.g:603:3: rule__Task__DetectorAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__DetectorAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getDetectorAssignment_3()); 

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
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Action__Group_0__0"
    // InternalTaskDSL.g:612:1: rule__Action__Group_0__0 : rule__Action__Group_0__0__Impl rule__Action__Group_0__1 ;
    public final void rule__Action__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:616:1: ( rule__Action__Group_0__0__Impl rule__Action__Group_0__1 )
            // InternalTaskDSL.g:617:2: rule__Action__Group_0__0__Impl rule__Action__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Action__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_0__1();

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
    // $ANTLR end "rule__Action__Group_0__0"


    // $ANTLR start "rule__Action__Group_0__0__Impl"
    // InternalTaskDSL.g:624:1: rule__Action__Group_0__0__Impl : ( 'action:' ) ;
    public final void rule__Action__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:628:1: ( ( 'action:' ) )
            // InternalTaskDSL.g:629:1: ( 'action:' )
            {
            // InternalTaskDSL.g:629:1: ( 'action:' )
            // InternalTaskDSL.g:630:2: 'action:'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionKeyword_0_0()); 

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
    // $ANTLR end "rule__Action__Group_0__0__Impl"


    // $ANTLR start "rule__Action__Group_0__1"
    // InternalTaskDSL.g:639:1: rule__Action__Group_0__1 : rule__Action__Group_0__1__Impl ;
    public final void rule__Action__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:643:1: ( rule__Action__Group_0__1__Impl )
            // InternalTaskDSL.g:644:2: rule__Action__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_0__1__Impl();

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
    // $ANTLR end "rule__Action__Group_0__1"


    // $ANTLR start "rule__Action__Group_0__1__Impl"
    // InternalTaskDSL.g:650:1: rule__Action__Group_0__1__Impl : ( ruleDriveUntil ) ;
    public final void rule__Action__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:654:1: ( ( ruleDriveUntil ) )
            // InternalTaskDSL.g:655:1: ( ruleDriveUntil )
            {
            // InternalTaskDSL.g:655:1: ( ruleDriveUntil )
            // InternalTaskDSL.g:656:2: ruleDriveUntil
            {
             before(grammarAccess.getActionAccess().getDriveUntilParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleDriveUntil();

            state._fsp--;

             after(grammarAccess.getActionAccess().getDriveUntilParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Action__Group_0__1__Impl"


    // $ANTLR start "rule__Detectors__Group__0"
    // InternalTaskDSL.g:666:1: rule__Detectors__Group__0 : rule__Detectors__Group__0__Impl rule__Detectors__Group__1 ;
    public final void rule__Detectors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:670:1: ( rule__Detectors__Group__0__Impl rule__Detectors__Group__1 )
            // InternalTaskDSL.g:671:2: rule__Detectors__Group__0__Impl rule__Detectors__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Detectors__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detectors__Group__1();

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
    // $ANTLR end "rule__Detectors__Group__0"


    // $ANTLR start "rule__Detectors__Group__0__Impl"
    // InternalTaskDSL.g:678:1: rule__Detectors__Group__0__Impl : ( 'detectors:' ) ;
    public final void rule__Detectors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:682:1: ( ( 'detectors:' ) )
            // InternalTaskDSL.g:683:1: ( 'detectors:' )
            {
            // InternalTaskDSL.g:683:1: ( 'detectors:' )
            // InternalTaskDSL.g:684:2: 'detectors:'
            {
             before(grammarAccess.getDetectorsAccess().getDetectorsKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDetectorsAccess().getDetectorsKeyword_0()); 

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
    // $ANTLR end "rule__Detectors__Group__0__Impl"


    // $ANTLR start "rule__Detectors__Group__1"
    // InternalTaskDSL.g:693:1: rule__Detectors__Group__1 : rule__Detectors__Group__1__Impl ;
    public final void rule__Detectors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:697:1: ( rule__Detectors__Group__1__Impl )
            // InternalTaskDSL.g:698:2: rule__Detectors__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Detectors__Group__1__Impl();

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
    // $ANTLR end "rule__Detectors__Group__1"


    // $ANTLR start "rule__Detectors__Group__1__Impl"
    // InternalTaskDSL.g:704:1: rule__Detectors__Group__1__Impl : ( ( ( rule__Detectors__AvoidsAssignment_1 ) ) ( ( rule__Detectors__AvoidsAssignment_1 )* ) ) ;
    public final void rule__Detectors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:708:1: ( ( ( ( rule__Detectors__AvoidsAssignment_1 ) ) ( ( rule__Detectors__AvoidsAssignment_1 )* ) ) )
            // InternalTaskDSL.g:709:1: ( ( ( rule__Detectors__AvoidsAssignment_1 ) ) ( ( rule__Detectors__AvoidsAssignment_1 )* ) )
            {
            // InternalTaskDSL.g:709:1: ( ( ( rule__Detectors__AvoidsAssignment_1 ) ) ( ( rule__Detectors__AvoidsAssignment_1 )* ) )
            // InternalTaskDSL.g:710:2: ( ( rule__Detectors__AvoidsAssignment_1 ) ) ( ( rule__Detectors__AvoidsAssignment_1 )* )
            {
            // InternalTaskDSL.g:710:2: ( ( rule__Detectors__AvoidsAssignment_1 ) )
            // InternalTaskDSL.g:711:3: ( rule__Detectors__AvoidsAssignment_1 )
            {
             before(grammarAccess.getDetectorsAccess().getAvoidsAssignment_1()); 
            // InternalTaskDSL.g:712:3: ( rule__Detectors__AvoidsAssignment_1 )
            // InternalTaskDSL.g:712:4: rule__Detectors__AvoidsAssignment_1
            {
            pushFollow(FOLLOW_8);
            rule__Detectors__AvoidsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDetectorsAccess().getAvoidsAssignment_1()); 

            }

            // InternalTaskDSL.g:715:2: ( ( rule__Detectors__AvoidsAssignment_1 )* )
            // InternalTaskDSL.g:716:3: ( rule__Detectors__AvoidsAssignment_1 )*
            {
             before(grammarAccess.getDetectorsAccess().getAvoidsAssignment_1()); 
            // InternalTaskDSL.g:717:3: ( rule__Detectors__AvoidsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTaskDSL.g:717:4: rule__Detectors__AvoidsAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Detectors__AvoidsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDetectorsAccess().getAvoidsAssignment_1()); 

            }


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
    // $ANTLR end "rule__Detectors__Group__1__Impl"


    // $ANTLR start "rule__DriveUntil__Group__0"
    // InternalTaskDSL.g:727:1: rule__DriveUntil__Group__0 : rule__DriveUntil__Group__0__Impl rule__DriveUntil__Group__1 ;
    public final void rule__DriveUntil__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:731:1: ( rule__DriveUntil__Group__0__Impl rule__DriveUntil__Group__1 )
            // InternalTaskDSL.g:732:2: rule__DriveUntil__Group__0__Impl rule__DriveUntil__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DriveUntil__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DriveUntil__Group__1();

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
    // $ANTLR end "rule__DriveUntil__Group__0"


    // $ANTLR start "rule__DriveUntil__Group__0__Impl"
    // InternalTaskDSL.g:739:1: rule__DriveUntil__Group__0__Impl : ( 'Drive' ) ;
    public final void rule__DriveUntil__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:743:1: ( ( 'Drive' ) )
            // InternalTaskDSL.g:744:1: ( 'Drive' )
            {
            // InternalTaskDSL.g:744:1: ( 'Drive' )
            // InternalTaskDSL.g:745:2: 'Drive'
            {
             before(grammarAccess.getDriveUntilAccess().getDriveKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDriveUntilAccess().getDriveKeyword_0()); 

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
    // $ANTLR end "rule__DriveUntil__Group__0__Impl"


    // $ANTLR start "rule__DriveUntil__Group__1"
    // InternalTaskDSL.g:754:1: rule__DriveUntil__Group__1 : rule__DriveUntil__Group__1__Impl rule__DriveUntil__Group__2 ;
    public final void rule__DriveUntil__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:758:1: ( rule__DriveUntil__Group__1__Impl rule__DriveUntil__Group__2 )
            // InternalTaskDSL.g:759:2: rule__DriveUntil__Group__1__Impl rule__DriveUntil__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__DriveUntil__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DriveUntil__Group__2();

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
    // $ANTLR end "rule__DriveUntil__Group__1"


    // $ANTLR start "rule__DriveUntil__Group__1__Impl"
    // InternalTaskDSL.g:766:1: rule__DriveUntil__Group__1__Impl : ( ( rule__DriveUntil__SpeedAssignment_1 )? ) ;
    public final void rule__DriveUntil__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:770:1: ( ( ( rule__DriveUntil__SpeedAssignment_1 )? ) )
            // InternalTaskDSL.g:771:1: ( ( rule__DriveUntil__SpeedAssignment_1 )? )
            {
            // InternalTaskDSL.g:771:1: ( ( rule__DriveUntil__SpeedAssignment_1 )? )
            // InternalTaskDSL.g:772:2: ( rule__DriveUntil__SpeedAssignment_1 )?
            {
             before(grammarAccess.getDriveUntilAccess().getSpeedAssignment_1()); 
            // InternalTaskDSL.g:773:2: ( rule__DriveUntil__SpeedAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=13 && LA8_0<=15)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTaskDSL.g:773:3: rule__DriveUntil__SpeedAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DriveUntil__SpeedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDriveUntilAccess().getSpeedAssignment_1()); 

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
    // $ANTLR end "rule__DriveUntil__Group__1__Impl"


    // $ANTLR start "rule__DriveUntil__Group__2"
    // InternalTaskDSL.g:781:1: rule__DriveUntil__Group__2 : rule__DriveUntil__Group__2__Impl rule__DriveUntil__Group__3 ;
    public final void rule__DriveUntil__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:785:1: ( rule__DriveUntil__Group__2__Impl rule__DriveUntil__Group__3 )
            // InternalTaskDSL.g:786:2: rule__DriveUntil__Group__2__Impl rule__DriveUntil__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__DriveUntil__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DriveUntil__Group__3();

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
    // $ANTLR end "rule__DriveUntil__Group__2"


    // $ANTLR start "rule__DriveUntil__Group__2__Impl"
    // InternalTaskDSL.g:793:1: rule__DriveUntil__Group__2__Impl : ( 'Until' ) ;
    public final void rule__DriveUntil__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:797:1: ( ( 'Until' ) )
            // InternalTaskDSL.g:798:1: ( 'Until' )
            {
            // InternalTaskDSL.g:798:1: ( 'Until' )
            // InternalTaskDSL.g:799:2: 'Until'
            {
             before(grammarAccess.getDriveUntilAccess().getUntilKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDriveUntilAccess().getUntilKeyword_2()); 

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
    // $ANTLR end "rule__DriveUntil__Group__2__Impl"


    // $ANTLR start "rule__DriveUntil__Group__3"
    // InternalTaskDSL.g:808:1: rule__DriveUntil__Group__3 : rule__DriveUntil__Group__3__Impl rule__DriveUntil__Group__4 ;
    public final void rule__DriveUntil__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:812:1: ( rule__DriveUntil__Group__3__Impl rule__DriveUntil__Group__4 )
            // InternalTaskDSL.g:813:2: rule__DriveUntil__Group__3__Impl rule__DriveUntil__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__DriveUntil__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DriveUntil__Group__4();

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
    // $ANTLR end "rule__DriveUntil__Group__3"


    // $ANTLR start "rule__DriveUntil__Group__3__Impl"
    // InternalTaskDSL.g:820:1: rule__DriveUntil__Group__3__Impl : ( ( rule__DriveUntil__ColorAssignment_3 )? ) ;
    public final void rule__DriveUntil__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:824:1: ( ( ( rule__DriveUntil__ColorAssignment_3 )? ) )
            // InternalTaskDSL.g:825:1: ( ( rule__DriveUntil__ColorAssignment_3 )? )
            {
            // InternalTaskDSL.g:825:1: ( ( rule__DriveUntil__ColorAssignment_3 )? )
            // InternalTaskDSL.g:826:2: ( rule__DriveUntil__ColorAssignment_3 )?
            {
             before(grammarAccess.getDriveUntilAccess().getColorAssignment_3()); 
            // InternalTaskDSL.g:827:2: ( rule__DriveUntil__ColorAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=16 && LA9_0<=18)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTaskDSL.g:827:3: rule__DriveUntil__ColorAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DriveUntil__ColorAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDriveUntilAccess().getColorAssignment_3()); 

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
    // $ANTLR end "rule__DriveUntil__Group__3__Impl"


    // $ANTLR start "rule__DriveUntil__Group__4"
    // InternalTaskDSL.g:835:1: rule__DriveUntil__Group__4 : rule__DriveUntil__Group__4__Impl rule__DriveUntil__Group__5 ;
    public final void rule__DriveUntil__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:839:1: ( rule__DriveUntil__Group__4__Impl rule__DriveUntil__Group__5 )
            // InternalTaskDSL.g:840:2: rule__DriveUntil__Group__4__Impl rule__DriveUntil__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__DriveUntil__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DriveUntil__Group__5();

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
    // $ANTLR end "rule__DriveUntil__Group__4"


    // $ANTLR start "rule__DriveUntil__Group__4__Impl"
    // InternalTaskDSL.g:847:1: rule__DriveUntil__Group__4__Impl : ( ( rule__DriveUntil__ObjectAssignment_4 ) ) ;
    public final void rule__DriveUntil__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:851:1: ( ( ( rule__DriveUntil__ObjectAssignment_4 ) ) )
            // InternalTaskDSL.g:852:1: ( ( rule__DriveUntil__ObjectAssignment_4 ) )
            {
            // InternalTaskDSL.g:852:1: ( ( rule__DriveUntil__ObjectAssignment_4 ) )
            // InternalTaskDSL.g:853:2: ( rule__DriveUntil__ObjectAssignment_4 )
            {
             before(grammarAccess.getDriveUntilAccess().getObjectAssignment_4()); 
            // InternalTaskDSL.g:854:2: ( rule__DriveUntil__ObjectAssignment_4 )
            // InternalTaskDSL.g:854:3: rule__DriveUntil__ObjectAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DriveUntil__ObjectAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDriveUntilAccess().getObjectAssignment_4()); 

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
    // $ANTLR end "rule__DriveUntil__Group__4__Impl"


    // $ANTLR start "rule__DriveUntil__Group__5"
    // InternalTaskDSL.g:862:1: rule__DriveUntil__Group__5 : rule__DriveUntil__Group__5__Impl ;
    public final void rule__DriveUntil__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:866:1: ( rule__DriveUntil__Group__5__Impl )
            // InternalTaskDSL.g:867:2: rule__DriveUntil__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DriveUntil__Group__5__Impl();

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
    // $ANTLR end "rule__DriveUntil__Group__5"


    // $ANTLR start "rule__DriveUntil__Group__5__Impl"
    // InternalTaskDSL.g:873:1: rule__DriveUntil__Group__5__Impl : ( 'Found' ) ;
    public final void rule__DriveUntil__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:877:1: ( ( 'Found' ) )
            // InternalTaskDSL.g:878:1: ( 'Found' )
            {
            // InternalTaskDSL.g:878:1: ( 'Found' )
            // InternalTaskDSL.g:879:2: 'Found'
            {
             before(grammarAccess.getDriveUntilAccess().getFoundKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDriveUntilAccess().getFoundKeyword_5()); 

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
    // $ANTLR end "rule__DriveUntil__Group__5__Impl"


    // $ANTLR start "rule__Investigate__Group__0"
    // InternalTaskDSL.g:889:1: rule__Investigate__Group__0 : rule__Investigate__Group__0__Impl rule__Investigate__Group__1 ;
    public final void rule__Investigate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:893:1: ( rule__Investigate__Group__0__Impl rule__Investigate__Group__1 )
            // InternalTaskDSL.g:894:2: rule__Investigate__Group__0__Impl rule__Investigate__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Investigate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Investigate__Group__1();

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
    // $ANTLR end "rule__Investigate__Group__0"


    // $ANTLR start "rule__Investigate__Group__0__Impl"
    // InternalTaskDSL.g:901:1: rule__Investigate__Group__0__Impl : ( 'Investigate' ) ;
    public final void rule__Investigate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:905:1: ( ( 'Investigate' ) )
            // InternalTaskDSL.g:906:1: ( 'Investigate' )
            {
            // InternalTaskDSL.g:906:1: ( 'Investigate' )
            // InternalTaskDSL.g:907:2: 'Investigate'
            {
             before(grammarAccess.getInvestigateAccess().getInvestigateKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInvestigateAccess().getInvestigateKeyword_0()); 

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
    // $ANTLR end "rule__Investigate__Group__0__Impl"


    // $ANTLR start "rule__Investigate__Group__1"
    // InternalTaskDSL.g:916:1: rule__Investigate__Group__1 : rule__Investigate__Group__1__Impl ;
    public final void rule__Investigate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:920:1: ( rule__Investigate__Group__1__Impl )
            // InternalTaskDSL.g:921:2: rule__Investigate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Investigate__Group__1__Impl();

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
    // $ANTLR end "rule__Investigate__Group__1"


    // $ANTLR start "rule__Investigate__Group__1__Impl"
    // InternalTaskDSL.g:927:1: rule__Investigate__Group__1__Impl : ( ( rule__Investigate__SpeedAssignment_1 ) ) ;
    public final void rule__Investigate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:931:1: ( ( ( rule__Investigate__SpeedAssignment_1 ) ) )
            // InternalTaskDSL.g:932:1: ( ( rule__Investigate__SpeedAssignment_1 ) )
            {
            // InternalTaskDSL.g:932:1: ( ( rule__Investigate__SpeedAssignment_1 ) )
            // InternalTaskDSL.g:933:2: ( rule__Investigate__SpeedAssignment_1 )
            {
             before(grammarAccess.getInvestigateAccess().getSpeedAssignment_1()); 
            // InternalTaskDSL.g:934:2: ( rule__Investigate__SpeedAssignment_1 )
            // InternalTaskDSL.g:934:3: rule__Investigate__SpeedAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Investigate__SpeedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInvestigateAccess().getSpeedAssignment_1()); 

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
    // $ANTLR end "rule__Investigate__Group__1__Impl"


    // $ANTLR start "rule__Speak__Group__0"
    // InternalTaskDSL.g:943:1: rule__Speak__Group__0 : rule__Speak__Group__0__Impl rule__Speak__Group__1 ;
    public final void rule__Speak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:947:1: ( rule__Speak__Group__0__Impl rule__Speak__Group__1 )
            // InternalTaskDSL.g:948:2: rule__Speak__Group__0__Impl rule__Speak__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Speak__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Speak__Group__1();

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
    // $ANTLR end "rule__Speak__Group__0"


    // $ANTLR start "rule__Speak__Group__0__Impl"
    // InternalTaskDSL.g:955:1: rule__Speak__Group__0__Impl : ( 'Speak' ) ;
    public final void rule__Speak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:959:1: ( ( 'Speak' ) )
            // InternalTaskDSL.g:960:1: ( 'Speak' )
            {
            // InternalTaskDSL.g:960:1: ( 'Speak' )
            // InternalTaskDSL.g:961:2: 'Speak'
            {
             before(grammarAccess.getSpeakAccess().getSpeakKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSpeakAccess().getSpeakKeyword_0()); 

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
    // $ANTLR end "rule__Speak__Group__0__Impl"


    // $ANTLR start "rule__Speak__Group__1"
    // InternalTaskDSL.g:970:1: rule__Speak__Group__1 : rule__Speak__Group__1__Impl ;
    public final void rule__Speak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:974:1: ( rule__Speak__Group__1__Impl )
            // InternalTaskDSL.g:975:2: rule__Speak__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Speak__Group__1__Impl();

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
    // $ANTLR end "rule__Speak__Group__1"


    // $ANTLR start "rule__Speak__Group__1__Impl"
    // InternalTaskDSL.g:981:1: rule__Speak__Group__1__Impl : ( ( rule__Speak__TextAssignment_1 ) ) ;
    public final void rule__Speak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:985:1: ( ( ( rule__Speak__TextAssignment_1 ) ) )
            // InternalTaskDSL.g:986:1: ( ( rule__Speak__TextAssignment_1 ) )
            {
            // InternalTaskDSL.g:986:1: ( ( rule__Speak__TextAssignment_1 ) )
            // InternalTaskDSL.g:987:2: ( rule__Speak__TextAssignment_1 )
            {
             before(grammarAccess.getSpeakAccess().getTextAssignment_1()); 
            // InternalTaskDSL.g:988:2: ( rule__Speak__TextAssignment_1 )
            // InternalTaskDSL.g:988:3: rule__Speak__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Speak__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpeakAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__Speak__Group__1__Impl"


    // $ANTLR start "rule__FollowLine__Group__0"
    // InternalTaskDSL.g:997:1: rule__FollowLine__Group__0 : rule__FollowLine__Group__0__Impl rule__FollowLine__Group__1 ;
    public final void rule__FollowLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1001:1: ( rule__FollowLine__Group__0__Impl rule__FollowLine__Group__1 )
            // InternalTaskDSL.g:1002:2: rule__FollowLine__Group__0__Impl rule__FollowLine__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FollowLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowLine__Group__1();

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
    // $ANTLR end "rule__FollowLine__Group__0"


    // $ANTLR start "rule__FollowLine__Group__0__Impl"
    // InternalTaskDSL.g:1009:1: rule__FollowLine__Group__0__Impl : ( 'FindAndFollowLineFor' ) ;
    public final void rule__FollowLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1013:1: ( ( 'FindAndFollowLineFor' ) )
            // InternalTaskDSL.g:1014:1: ( 'FindAndFollowLineFor' )
            {
            // InternalTaskDSL.g:1014:1: ( 'FindAndFollowLineFor' )
            // InternalTaskDSL.g:1015:2: 'FindAndFollowLineFor'
            {
             before(grammarAccess.getFollowLineAccess().getFindAndFollowLineForKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFollowLineAccess().getFindAndFollowLineForKeyword_0()); 

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
    // $ANTLR end "rule__FollowLine__Group__0__Impl"


    // $ANTLR start "rule__FollowLine__Group__1"
    // InternalTaskDSL.g:1024:1: rule__FollowLine__Group__1 : rule__FollowLine__Group__1__Impl rule__FollowLine__Group__2 ;
    public final void rule__FollowLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1028:1: ( rule__FollowLine__Group__1__Impl rule__FollowLine__Group__2 )
            // InternalTaskDSL.g:1029:2: rule__FollowLine__Group__1__Impl rule__FollowLine__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__FollowLine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowLine__Group__2();

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
    // $ANTLR end "rule__FollowLine__Group__1"


    // $ANTLR start "rule__FollowLine__Group__1__Impl"
    // InternalTaskDSL.g:1036:1: rule__FollowLine__Group__1__Impl : ( ( rule__FollowLine__DistanceAssignment_1 ) ) ;
    public final void rule__FollowLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1040:1: ( ( ( rule__FollowLine__DistanceAssignment_1 ) ) )
            // InternalTaskDSL.g:1041:1: ( ( rule__FollowLine__DistanceAssignment_1 ) )
            {
            // InternalTaskDSL.g:1041:1: ( ( rule__FollowLine__DistanceAssignment_1 ) )
            // InternalTaskDSL.g:1042:2: ( rule__FollowLine__DistanceAssignment_1 )
            {
             before(grammarAccess.getFollowLineAccess().getDistanceAssignment_1()); 
            // InternalTaskDSL.g:1043:2: ( rule__FollowLine__DistanceAssignment_1 )
            // InternalTaskDSL.g:1043:3: rule__FollowLine__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FollowLine__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFollowLineAccess().getDistanceAssignment_1()); 

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
    // $ANTLR end "rule__FollowLine__Group__1__Impl"


    // $ANTLR start "rule__FollowLine__Group__2"
    // InternalTaskDSL.g:1051:1: rule__FollowLine__Group__2 : rule__FollowLine__Group__2__Impl ;
    public final void rule__FollowLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1055:1: ( rule__FollowLine__Group__2__Impl )
            // InternalTaskDSL.g:1056:2: rule__FollowLine__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FollowLine__Group__2__Impl();

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
    // $ANTLR end "rule__FollowLine__Group__2"


    // $ANTLR start "rule__FollowLine__Group__2__Impl"
    // InternalTaskDSL.g:1062:1: rule__FollowLine__Group__2__Impl : ( 'meters' ) ;
    public final void rule__FollowLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1066:1: ( ( 'meters' ) )
            // InternalTaskDSL.g:1067:1: ( 'meters' )
            {
            // InternalTaskDSL.g:1067:1: ( 'meters' )
            // InternalTaskDSL.g:1068:2: 'meters'
            {
             before(grammarAccess.getFollowLineAccess().getMetersKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFollowLineAccess().getMetersKeyword_2()); 

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
    // $ANTLR end "rule__FollowLine__Group__2__Impl"


    // $ANTLR start "rule__Avoid__Group__0"
    // InternalTaskDSL.g:1078:1: rule__Avoid__Group__0 : rule__Avoid__Group__0__Impl rule__Avoid__Group__1 ;
    public final void rule__Avoid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1082:1: ( rule__Avoid__Group__0__Impl rule__Avoid__Group__1 )
            // InternalTaskDSL.g:1083:2: rule__Avoid__Group__0__Impl rule__Avoid__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Avoid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Avoid__Group__1();

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
    // $ANTLR end "rule__Avoid__Group__0"


    // $ANTLR start "rule__Avoid__Group__0__Impl"
    // InternalTaskDSL.g:1090:1: rule__Avoid__Group__0__Impl : ( 'Avoid' ) ;
    public final void rule__Avoid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1094:1: ( ( 'Avoid' ) )
            // InternalTaskDSL.g:1095:1: ( 'Avoid' )
            {
            // InternalTaskDSL.g:1095:1: ( 'Avoid' )
            // InternalTaskDSL.g:1096:2: 'Avoid'
            {
             before(grammarAccess.getAvoidAccess().getAvoidKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAvoidAccess().getAvoidKeyword_0()); 

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
    // $ANTLR end "rule__Avoid__Group__0__Impl"


    // $ANTLR start "rule__Avoid__Group__1"
    // InternalTaskDSL.g:1105:1: rule__Avoid__Group__1 : rule__Avoid__Group__1__Impl rule__Avoid__Group__2 ;
    public final void rule__Avoid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1109:1: ( rule__Avoid__Group__1__Impl rule__Avoid__Group__2 )
            // InternalTaskDSL.g:1110:2: rule__Avoid__Group__1__Impl rule__Avoid__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Avoid__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Avoid__Group__2();

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
    // $ANTLR end "rule__Avoid__Group__1"


    // $ANTLR start "rule__Avoid__Group__1__Impl"
    // InternalTaskDSL.g:1117:1: rule__Avoid__Group__1__Impl : ( ( rule__Avoid__ColorAssignment_1 )? ) ;
    public final void rule__Avoid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1121:1: ( ( ( rule__Avoid__ColorAssignment_1 )? ) )
            // InternalTaskDSL.g:1122:1: ( ( rule__Avoid__ColorAssignment_1 )? )
            {
            // InternalTaskDSL.g:1122:1: ( ( rule__Avoid__ColorAssignment_1 )? )
            // InternalTaskDSL.g:1123:2: ( rule__Avoid__ColorAssignment_1 )?
            {
             before(grammarAccess.getAvoidAccess().getColorAssignment_1()); 
            // InternalTaskDSL.g:1124:2: ( rule__Avoid__ColorAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=16 && LA10_0<=18)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTaskDSL.g:1124:3: rule__Avoid__ColorAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Avoid__ColorAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAvoidAccess().getColorAssignment_1()); 

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
    // $ANTLR end "rule__Avoid__Group__1__Impl"


    // $ANTLR start "rule__Avoid__Group__2"
    // InternalTaskDSL.g:1132:1: rule__Avoid__Group__2 : rule__Avoid__Group__2__Impl rule__Avoid__Group__3 ;
    public final void rule__Avoid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1136:1: ( rule__Avoid__Group__2__Impl rule__Avoid__Group__3 )
            // InternalTaskDSL.g:1137:2: rule__Avoid__Group__2__Impl rule__Avoid__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Avoid__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Avoid__Group__3();

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
    // $ANTLR end "rule__Avoid__Group__2"


    // $ANTLR start "rule__Avoid__Group__2__Impl"
    // InternalTaskDSL.g:1144:1: rule__Avoid__Group__2__Impl : ( ( rule__Avoid__ObjectAssignment_2 ) ) ;
    public final void rule__Avoid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1148:1: ( ( ( rule__Avoid__ObjectAssignment_2 ) ) )
            // InternalTaskDSL.g:1149:1: ( ( rule__Avoid__ObjectAssignment_2 ) )
            {
            // InternalTaskDSL.g:1149:1: ( ( rule__Avoid__ObjectAssignment_2 ) )
            // InternalTaskDSL.g:1150:2: ( rule__Avoid__ObjectAssignment_2 )
            {
             before(grammarAccess.getAvoidAccess().getObjectAssignment_2()); 
            // InternalTaskDSL.g:1151:2: ( rule__Avoid__ObjectAssignment_2 )
            // InternalTaskDSL.g:1151:3: rule__Avoid__ObjectAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Avoid__ObjectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAvoidAccess().getObjectAssignment_2()); 

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
    // $ANTLR end "rule__Avoid__Group__2__Impl"


    // $ANTLR start "rule__Avoid__Group__3"
    // InternalTaskDSL.g:1159:1: rule__Avoid__Group__3 : rule__Avoid__Group__3__Impl rule__Avoid__Group__4 ;
    public final void rule__Avoid__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1163:1: ( rule__Avoid__Group__3__Impl rule__Avoid__Group__4 )
            // InternalTaskDSL.g:1164:2: rule__Avoid__Group__3__Impl rule__Avoid__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Avoid__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Avoid__Group__4();

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
    // $ANTLR end "rule__Avoid__Group__3"


    // $ANTLR start "rule__Avoid__Group__3__Impl"
    // InternalTaskDSL.g:1171:1: rule__Avoid__Group__3__Impl : ( 'By' ) ;
    public final void rule__Avoid__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1175:1: ( ( 'By' ) )
            // InternalTaskDSL.g:1176:1: ( 'By' )
            {
            // InternalTaskDSL.g:1176:1: ( 'By' )
            // InternalTaskDSL.g:1177:2: 'By'
            {
             before(grammarAccess.getAvoidAccess().getByKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAvoidAccess().getByKeyword_3()); 

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
    // $ANTLR end "rule__Avoid__Group__3__Impl"


    // $ANTLR start "rule__Avoid__Group__4"
    // InternalTaskDSL.g:1186:1: rule__Avoid__Group__4 : rule__Avoid__Group__4__Impl ;
    public final void rule__Avoid__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1190:1: ( rule__Avoid__Group__4__Impl )
            // InternalTaskDSL.g:1191:2: rule__Avoid__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Avoid__Group__4__Impl();

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
    // $ANTLR end "rule__Avoid__Group__4"


    // $ANTLR start "rule__Avoid__Group__4__Impl"
    // InternalTaskDSL.g:1197:1: rule__Avoid__Group__4__Impl : ( ( ( rule__Avoid__AvoidActionsAssignment_4 ) ) ( ( rule__Avoid__AvoidActionsAssignment_4 )* ) ) ;
    public final void rule__Avoid__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1201:1: ( ( ( ( rule__Avoid__AvoidActionsAssignment_4 ) ) ( ( rule__Avoid__AvoidActionsAssignment_4 )* ) ) )
            // InternalTaskDSL.g:1202:1: ( ( ( rule__Avoid__AvoidActionsAssignment_4 ) ) ( ( rule__Avoid__AvoidActionsAssignment_4 )* ) )
            {
            // InternalTaskDSL.g:1202:1: ( ( ( rule__Avoid__AvoidActionsAssignment_4 ) ) ( ( rule__Avoid__AvoidActionsAssignment_4 )* ) )
            // InternalTaskDSL.g:1203:2: ( ( rule__Avoid__AvoidActionsAssignment_4 ) ) ( ( rule__Avoid__AvoidActionsAssignment_4 )* )
            {
            // InternalTaskDSL.g:1203:2: ( ( rule__Avoid__AvoidActionsAssignment_4 ) )
            // InternalTaskDSL.g:1204:3: ( rule__Avoid__AvoidActionsAssignment_4 )
            {
             before(grammarAccess.getAvoidAccess().getAvoidActionsAssignment_4()); 
            // InternalTaskDSL.g:1205:3: ( rule__Avoid__AvoidActionsAssignment_4 )
            // InternalTaskDSL.g:1205:4: rule__Avoid__AvoidActionsAssignment_4
            {
            pushFollow(FOLLOW_18);
            rule__Avoid__AvoidActionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAvoidAccess().getAvoidActionsAssignment_4()); 

            }

            // InternalTaskDSL.g:1208:2: ( ( rule__Avoid__AvoidActionsAssignment_4 )* )
            // InternalTaskDSL.g:1209:3: ( rule__Avoid__AvoidActionsAssignment_4 )*
            {
             before(grammarAccess.getAvoidAccess().getAvoidActionsAssignment_4()); 
            // InternalTaskDSL.g:1210:3: ( rule__Avoid__AvoidActionsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=32 && LA11_0<=33)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTaskDSL.g:1210:4: rule__Avoid__AvoidActionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Avoid__AvoidActionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAvoidAccess().getAvoidActionsAssignment_4()); 

            }


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
    // $ANTLR end "rule__Avoid__Group__4__Impl"


    // $ANTLR start "rule__AvoidAction__Group__0"
    // InternalTaskDSL.g:1220:1: rule__AvoidAction__Group__0 : rule__AvoidAction__Group__0__Impl rule__AvoidAction__Group__1 ;
    public final void rule__AvoidAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1224:1: ( rule__AvoidAction__Group__0__Impl rule__AvoidAction__Group__1 )
            // InternalTaskDSL.g:1225:2: rule__AvoidAction__Group__0__Impl rule__AvoidAction__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AvoidAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AvoidAction__Group__1();

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
    // $ANTLR end "rule__AvoidAction__Group__0"


    // $ANTLR start "rule__AvoidAction__Group__0__Impl"
    // InternalTaskDSL.g:1232:1: rule__AvoidAction__Group__0__Impl : ( ( rule__AvoidAction__Alternatives_0 ) ) ;
    public final void rule__AvoidAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1236:1: ( ( ( rule__AvoidAction__Alternatives_0 ) ) )
            // InternalTaskDSL.g:1237:1: ( ( rule__AvoidAction__Alternatives_0 ) )
            {
            // InternalTaskDSL.g:1237:1: ( ( rule__AvoidAction__Alternatives_0 ) )
            // InternalTaskDSL.g:1238:2: ( rule__AvoidAction__Alternatives_0 )
            {
             before(grammarAccess.getAvoidActionAccess().getAlternatives_0()); 
            // InternalTaskDSL.g:1239:2: ( rule__AvoidAction__Alternatives_0 )
            // InternalTaskDSL.g:1239:3: rule__AvoidAction__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__AvoidAction__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAvoidActionAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__AvoidAction__Group__0__Impl"


    // $ANTLR start "rule__AvoidAction__Group__1"
    // InternalTaskDSL.g:1247:1: rule__AvoidAction__Group__1 : rule__AvoidAction__Group__1__Impl ;
    public final void rule__AvoidAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1251:1: ( rule__AvoidAction__Group__1__Impl )
            // InternalTaskDSL.g:1252:2: rule__AvoidAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AvoidAction__Group__1__Impl();

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
    // $ANTLR end "rule__AvoidAction__Group__1"


    // $ANTLR start "rule__AvoidAction__Group__1__Impl"
    // InternalTaskDSL.g:1258:1: rule__AvoidAction__Group__1__Impl : ( ( 'and' )? ) ;
    public final void rule__AvoidAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1262:1: ( ( ( 'and' )? ) )
            // InternalTaskDSL.g:1263:1: ( ( 'and' )? )
            {
            // InternalTaskDSL.g:1263:1: ( ( 'and' )? )
            // InternalTaskDSL.g:1264:2: ( 'and' )?
            {
             before(grammarAccess.getAvoidActionAccess().getAndKeyword_1()); 
            // InternalTaskDSL.g:1265:2: ( 'and' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTaskDSL.g:1265:3: 'and'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAvoidActionAccess().getAndKeyword_1()); 

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
    // $ANTLR end "rule__AvoidAction__Group__1__Impl"


    // $ANTLR start "rule__MoveBack__Group__0"
    // InternalTaskDSL.g:1274:1: rule__MoveBack__Group__0 : rule__MoveBack__Group__0__Impl rule__MoveBack__Group__1 ;
    public final void rule__MoveBack__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1278:1: ( rule__MoveBack__Group__0__Impl rule__MoveBack__Group__1 )
            // InternalTaskDSL.g:1279:2: rule__MoveBack__Group__0__Impl rule__MoveBack__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__MoveBack__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveBack__Group__1();

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
    // $ANTLR end "rule__MoveBack__Group__0"


    // $ANTLR start "rule__MoveBack__Group__0__Impl"
    // InternalTaskDSL.g:1286:1: rule__MoveBack__Group__0__Impl : ( 'MoveBackwards' ) ;
    public final void rule__MoveBack__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1290:1: ( ( 'MoveBackwards' ) )
            // InternalTaskDSL.g:1291:1: ( 'MoveBackwards' )
            {
            // InternalTaskDSL.g:1291:1: ( 'MoveBackwards' )
            // InternalTaskDSL.g:1292:2: 'MoveBackwards'
            {
             before(grammarAccess.getMoveBackAccess().getMoveBackwardsKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMoveBackAccess().getMoveBackwardsKeyword_0()); 

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
    // $ANTLR end "rule__MoveBack__Group__0__Impl"


    // $ANTLR start "rule__MoveBack__Group__1"
    // InternalTaskDSL.g:1301:1: rule__MoveBack__Group__1 : rule__MoveBack__Group__1__Impl rule__MoveBack__Group__2 ;
    public final void rule__MoveBack__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1305:1: ( rule__MoveBack__Group__1__Impl rule__MoveBack__Group__2 )
            // InternalTaskDSL.g:1306:2: rule__MoveBack__Group__1__Impl rule__MoveBack__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__MoveBack__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveBack__Group__2();

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
    // $ANTLR end "rule__MoveBack__Group__1"


    // $ANTLR start "rule__MoveBack__Group__1__Impl"
    // InternalTaskDSL.g:1313:1: rule__MoveBack__Group__1__Impl : ( ( rule__MoveBack__DistanceAssignment_1 ) ) ;
    public final void rule__MoveBack__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1317:1: ( ( ( rule__MoveBack__DistanceAssignment_1 ) ) )
            // InternalTaskDSL.g:1318:1: ( ( rule__MoveBack__DistanceAssignment_1 ) )
            {
            // InternalTaskDSL.g:1318:1: ( ( rule__MoveBack__DistanceAssignment_1 ) )
            // InternalTaskDSL.g:1319:2: ( rule__MoveBack__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveBackAccess().getDistanceAssignment_1()); 
            // InternalTaskDSL.g:1320:2: ( rule__MoveBack__DistanceAssignment_1 )
            // InternalTaskDSL.g:1320:3: rule__MoveBack__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveBack__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveBackAccess().getDistanceAssignment_1()); 

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
    // $ANTLR end "rule__MoveBack__Group__1__Impl"


    // $ANTLR start "rule__MoveBack__Group__2"
    // InternalTaskDSL.g:1328:1: rule__MoveBack__Group__2 : rule__MoveBack__Group__2__Impl ;
    public final void rule__MoveBack__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1332:1: ( rule__MoveBack__Group__2__Impl )
            // InternalTaskDSL.g:1333:2: rule__MoveBack__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveBack__Group__2__Impl();

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
    // $ANTLR end "rule__MoveBack__Group__2"


    // $ANTLR start "rule__MoveBack__Group__2__Impl"
    // InternalTaskDSL.g:1339:1: rule__MoveBack__Group__2__Impl : ( 'meters' ) ;
    public final void rule__MoveBack__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1343:1: ( ( 'meters' ) )
            // InternalTaskDSL.g:1344:1: ( 'meters' )
            {
            // InternalTaskDSL.g:1344:1: ( 'meters' )
            // InternalTaskDSL.g:1345:2: 'meters'
            {
             before(grammarAccess.getMoveBackAccess().getMetersKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMoveBackAccess().getMetersKeyword_2()); 

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
    // $ANTLR end "rule__MoveBack__Group__2__Impl"


    // $ANTLR start "rule__Turn__Group__0"
    // InternalTaskDSL.g:1355:1: rule__Turn__Group__0 : rule__Turn__Group__0__Impl rule__Turn__Group__1 ;
    public final void rule__Turn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1359:1: ( rule__Turn__Group__0__Impl rule__Turn__Group__1 )
            // InternalTaskDSL.g:1360:2: rule__Turn__Group__0__Impl rule__Turn__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Turn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Turn__Group__1();

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
    // $ANTLR end "rule__Turn__Group__0"


    // $ANTLR start "rule__Turn__Group__0__Impl"
    // InternalTaskDSL.g:1367:1: rule__Turn__Group__0__Impl : ( 'Turn' ) ;
    public final void rule__Turn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1371:1: ( ( 'Turn' ) )
            // InternalTaskDSL.g:1372:1: ( 'Turn' )
            {
            // InternalTaskDSL.g:1372:1: ( 'Turn' )
            // InternalTaskDSL.g:1373:2: 'Turn'
            {
             before(grammarAccess.getTurnAccess().getTurnKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTurnAccess().getTurnKeyword_0()); 

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
    // $ANTLR end "rule__Turn__Group__0__Impl"


    // $ANTLR start "rule__Turn__Group__1"
    // InternalTaskDSL.g:1382:1: rule__Turn__Group__1 : rule__Turn__Group__1__Impl rule__Turn__Group__2 ;
    public final void rule__Turn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1386:1: ( rule__Turn__Group__1__Impl rule__Turn__Group__2 )
            // InternalTaskDSL.g:1387:2: rule__Turn__Group__1__Impl rule__Turn__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Turn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Turn__Group__2();

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
    // $ANTLR end "rule__Turn__Group__1"


    // $ANTLR start "rule__Turn__Group__1__Impl"
    // InternalTaskDSL.g:1394:1: rule__Turn__Group__1__Impl : ( ( rule__Turn__DegreesAssignment_1 ) ) ;
    public final void rule__Turn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1398:1: ( ( ( rule__Turn__DegreesAssignment_1 ) ) )
            // InternalTaskDSL.g:1399:1: ( ( rule__Turn__DegreesAssignment_1 ) )
            {
            // InternalTaskDSL.g:1399:1: ( ( rule__Turn__DegreesAssignment_1 ) )
            // InternalTaskDSL.g:1400:2: ( rule__Turn__DegreesAssignment_1 )
            {
             before(grammarAccess.getTurnAccess().getDegreesAssignment_1()); 
            // InternalTaskDSL.g:1401:2: ( rule__Turn__DegreesAssignment_1 )
            // InternalTaskDSL.g:1401:3: rule__Turn__DegreesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Turn__DegreesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnAccess().getDegreesAssignment_1()); 

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
    // $ANTLR end "rule__Turn__Group__1__Impl"


    // $ANTLR start "rule__Turn__Group__2"
    // InternalTaskDSL.g:1409:1: rule__Turn__Group__2 : rule__Turn__Group__2__Impl ;
    public final void rule__Turn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1413:1: ( rule__Turn__Group__2__Impl )
            // InternalTaskDSL.g:1414:2: rule__Turn__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group__2__Impl();

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
    // $ANTLR end "rule__Turn__Group__2"


    // $ANTLR start "rule__Turn__Group__2__Impl"
    // InternalTaskDSL.g:1420:1: rule__Turn__Group__2__Impl : ( 'degrees' ) ;
    public final void rule__Turn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1424:1: ( ( 'degrees' ) )
            // InternalTaskDSL.g:1425:1: ( 'degrees' )
            {
            // InternalTaskDSL.g:1425:1: ( 'degrees' )
            // InternalTaskDSL.g:1426:2: 'degrees'
            {
             before(grammarAccess.getTurnAccess().getDegreesKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTurnAccess().getDegreesKeyword_2()); 

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
    // $ANTLR end "rule__Turn__Group__2__Impl"


    // $ANTLR start "rule__Task__NameAssignment_1"
    // InternalTaskDSL.g:1436:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1440:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:1441:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:1441:2: ( RULE_ID )
            // InternalTaskDSL.g:1442:3: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Task__NameAssignment_1"


    // $ANTLR start "rule__Task__ActionAssignment_2"
    // InternalTaskDSL.g:1451:1: rule__Task__ActionAssignment_2 : ( ruleAction ) ;
    public final void rule__Task__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1455:1: ( ( ruleAction ) )
            // InternalTaskDSL.g:1456:2: ( ruleAction )
            {
            // InternalTaskDSL.g:1456:2: ( ruleAction )
            // InternalTaskDSL.g:1457:3: ruleAction
            {
             before(grammarAccess.getTaskAccess().getActionActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getActionActionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Task__ActionAssignment_2"


    // $ANTLR start "rule__Task__DetectorAssignment_3"
    // InternalTaskDSL.g:1466:1: rule__Task__DetectorAssignment_3 : ( ruleDetectors ) ;
    public final void rule__Task__DetectorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1470:1: ( ( ruleDetectors ) )
            // InternalTaskDSL.g:1471:2: ( ruleDetectors )
            {
            // InternalTaskDSL.g:1471:2: ( ruleDetectors )
            // InternalTaskDSL.g:1472:3: ruleDetectors
            {
             before(grammarAccess.getTaskAccess().getDetectorDetectorsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDetectors();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDetectorDetectorsParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Task__DetectorAssignment_3"


    // $ANTLR start "rule__Detectors__AvoidsAssignment_1"
    // InternalTaskDSL.g:1481:1: rule__Detectors__AvoidsAssignment_1 : ( ruleAvoid ) ;
    public final void rule__Detectors__AvoidsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1485:1: ( ( ruleAvoid ) )
            // InternalTaskDSL.g:1486:2: ( ruleAvoid )
            {
            // InternalTaskDSL.g:1486:2: ( ruleAvoid )
            // InternalTaskDSL.g:1487:3: ruleAvoid
            {
             before(grammarAccess.getDetectorsAccess().getAvoidsAvoidParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAvoid();

            state._fsp--;

             after(grammarAccess.getDetectorsAccess().getAvoidsAvoidParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Detectors__AvoidsAssignment_1"


    // $ANTLR start "rule__DriveUntil__SpeedAssignment_1"
    // InternalTaskDSL.g:1496:1: rule__DriveUntil__SpeedAssignment_1 : ( ruleSpeed ) ;
    public final void rule__DriveUntil__SpeedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1500:1: ( ( ruleSpeed ) )
            // InternalTaskDSL.g:1501:2: ( ruleSpeed )
            {
            // InternalTaskDSL.g:1501:2: ( ruleSpeed )
            // InternalTaskDSL.g:1502:3: ruleSpeed
            {
             before(grammarAccess.getDriveUntilAccess().getSpeedSpeedEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpeed();

            state._fsp--;

             after(grammarAccess.getDriveUntilAccess().getSpeedSpeedEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__DriveUntil__SpeedAssignment_1"


    // $ANTLR start "rule__DriveUntil__ColorAssignment_3"
    // InternalTaskDSL.g:1511:1: rule__DriveUntil__ColorAssignment_3 : ( ruleColor ) ;
    public final void rule__DriveUntil__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1515:1: ( ( ruleColor ) )
            // InternalTaskDSL.g:1516:2: ( ruleColor )
            {
            // InternalTaskDSL.g:1516:2: ( ruleColor )
            // InternalTaskDSL.g:1517:3: ruleColor
            {
             before(grammarAccess.getDriveUntilAccess().getColorColorEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getDriveUntilAccess().getColorColorEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__DriveUntil__ColorAssignment_3"


    // $ANTLR start "rule__DriveUntil__ObjectAssignment_4"
    // InternalTaskDSL.g:1526:1: rule__DriveUntil__ObjectAssignment_4 : ( ruleObject ) ;
    public final void rule__DriveUntil__ObjectAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1530:1: ( ( ruleObject ) )
            // InternalTaskDSL.g:1531:2: ( ruleObject )
            {
            // InternalTaskDSL.g:1531:2: ( ruleObject )
            // InternalTaskDSL.g:1532:3: ruleObject
            {
             before(grammarAccess.getDriveUntilAccess().getObjectObjectEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getDriveUntilAccess().getObjectObjectEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__DriveUntil__ObjectAssignment_4"


    // $ANTLR start "rule__Investigate__SpeedAssignment_1"
    // InternalTaskDSL.g:1541:1: rule__Investigate__SpeedAssignment_1 : ( ruleSpeed ) ;
    public final void rule__Investigate__SpeedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1545:1: ( ( ruleSpeed ) )
            // InternalTaskDSL.g:1546:2: ( ruleSpeed )
            {
            // InternalTaskDSL.g:1546:2: ( ruleSpeed )
            // InternalTaskDSL.g:1547:3: ruleSpeed
            {
             before(grammarAccess.getInvestigateAccess().getSpeedSpeedEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpeed();

            state._fsp--;

             after(grammarAccess.getInvestigateAccess().getSpeedSpeedEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Investigate__SpeedAssignment_1"


    // $ANTLR start "rule__Speak__TextAssignment_1"
    // InternalTaskDSL.g:1556:1: rule__Speak__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Speak__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1560:1: ( ( RULE_STRING ) )
            // InternalTaskDSL.g:1561:2: ( RULE_STRING )
            {
            // InternalTaskDSL.g:1561:2: ( RULE_STRING )
            // InternalTaskDSL.g:1562:3: RULE_STRING
            {
             before(grammarAccess.getSpeakAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSpeakAccess().getTextSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Speak__TextAssignment_1"


    // $ANTLR start "rule__FollowLine__DistanceAssignment_1"
    // InternalTaskDSL.g:1571:1: rule__FollowLine__DistanceAssignment_1 : ( RULE_INT ) ;
    public final void rule__FollowLine__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1575:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:1576:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:1576:2: ( RULE_INT )
            // InternalTaskDSL.g:1577:3: RULE_INT
            {
             before(grammarAccess.getFollowLineAccess().getDistanceINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFollowLineAccess().getDistanceINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FollowLine__DistanceAssignment_1"


    // $ANTLR start "rule__Avoid__ColorAssignment_1"
    // InternalTaskDSL.g:1586:1: rule__Avoid__ColorAssignment_1 : ( ruleColor ) ;
    public final void rule__Avoid__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1590:1: ( ( ruleColor ) )
            // InternalTaskDSL.g:1591:2: ( ruleColor )
            {
            // InternalTaskDSL.g:1591:2: ( ruleColor )
            // InternalTaskDSL.g:1592:3: ruleColor
            {
             before(grammarAccess.getAvoidAccess().getColorColorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getAvoidAccess().getColorColorEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Avoid__ColorAssignment_1"


    // $ANTLR start "rule__Avoid__ObjectAssignment_2"
    // InternalTaskDSL.g:1601:1: rule__Avoid__ObjectAssignment_2 : ( ruleObject ) ;
    public final void rule__Avoid__ObjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1605:1: ( ( ruleObject ) )
            // InternalTaskDSL.g:1606:2: ( ruleObject )
            {
            // InternalTaskDSL.g:1606:2: ( ruleObject )
            // InternalTaskDSL.g:1607:3: ruleObject
            {
             before(grammarAccess.getAvoidAccess().getObjectObjectEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getAvoidAccess().getObjectObjectEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Avoid__ObjectAssignment_2"


    // $ANTLR start "rule__Avoid__AvoidActionsAssignment_4"
    // InternalTaskDSL.g:1616:1: rule__Avoid__AvoidActionsAssignment_4 : ( ruleAvoidAction ) ;
    public final void rule__Avoid__AvoidActionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1620:1: ( ( ruleAvoidAction ) )
            // InternalTaskDSL.g:1621:2: ( ruleAvoidAction )
            {
            // InternalTaskDSL.g:1621:2: ( ruleAvoidAction )
            // InternalTaskDSL.g:1622:3: ruleAvoidAction
            {
             before(grammarAccess.getAvoidAccess().getAvoidActionsAvoidActionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAvoidAction();

            state._fsp--;

             after(grammarAccess.getAvoidAccess().getAvoidActionsAvoidActionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Avoid__AvoidActionsAssignment_4"


    // $ANTLR start "rule__MoveBack__DistanceAssignment_1"
    // InternalTaskDSL.g:1631:1: rule__MoveBack__DistanceAssignment_1 : ( RULE_INT ) ;
    public final void rule__MoveBack__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1635:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:1636:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:1636:2: ( RULE_INT )
            // InternalTaskDSL.g:1637:3: RULE_INT
            {
             before(grammarAccess.getMoveBackAccess().getDistanceINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMoveBackAccess().getDistanceINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MoveBack__DistanceAssignment_1"


    // $ANTLR start "rule__Turn__DegreesAssignment_1"
    // InternalTaskDSL.g:1646:1: rule__Turn__DegreesAssignment_1 : ( RULE_INT ) ;
    public final void rule__Turn__DegreesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1650:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:1651:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:1651:2: ( RULE_INT )
            // InternalTaskDSL.g:1652:3: RULE_INT
            {
             before(grammarAccess.getTurnAccess().getDegreesINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTurnAccess().getDegreesINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Turn__DegreesAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000E100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000080E000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000071800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});

}