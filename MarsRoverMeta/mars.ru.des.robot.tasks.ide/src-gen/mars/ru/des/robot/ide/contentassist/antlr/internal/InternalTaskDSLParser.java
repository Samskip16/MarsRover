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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ROCK'", "'LAKE'", "'FAST'", "'NORMAL'", "'SLOW'", "'RED'", "'GREEN'", "'BLUE'", "'Mission:'", "'tasks:'", "'Task:'", "'action:'", "'detectors:'", "'Drive'", "'Until'", "'Found'", "'Investigate'", "'Speak'", "'FindAndFollowLineFor'", "'meters'", "'Avoid'", "'By'", "'and'", "'MoveBackwards'", "'TurnLeft'", "'degrees'", "'TurnRight'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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



    // $ANTLR start "entryRuleDSL"
    // InternalTaskDSL.g:53:1: entryRuleDSL : ruleDSL EOF ;
    public final void entryRuleDSL() throws RecognitionException {
        try {
            // InternalTaskDSL.g:54:1: ( ruleDSL EOF )
            // InternalTaskDSL.g:55:1: ruleDSL EOF
            {
             before(grammarAccess.getDSLRule()); 
            pushFollow(FOLLOW_1);
            ruleDSL();

            state._fsp--;

             after(grammarAccess.getDSLRule()); 
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
    // $ANTLR end "entryRuleDSL"


    // $ANTLR start "ruleDSL"
    // InternalTaskDSL.g:62:1: ruleDSL : ( ( rule__DSL__Group__0 ) ) ;
    public final void ruleDSL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:66:2: ( ( ( rule__DSL__Group__0 ) ) )
            // InternalTaskDSL.g:67:2: ( ( rule__DSL__Group__0 ) )
            {
            // InternalTaskDSL.g:67:2: ( ( rule__DSL__Group__0 ) )
            // InternalTaskDSL.g:68:3: ( rule__DSL__Group__0 )
            {
             before(grammarAccess.getDSLAccess().getGroup()); 
            // InternalTaskDSL.g:69:3: ( rule__DSL__Group__0 )
            // InternalTaskDSL.g:69:4: rule__DSL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLAccess().getGroup()); 

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
    // $ANTLR end "ruleDSL"


    // $ANTLR start "entryRuleMission"
    // InternalTaskDSL.g:78:1: entryRuleMission : ruleMission EOF ;
    public final void entryRuleMission() throws RecognitionException {
        try {
            // InternalTaskDSL.g:79:1: ( ruleMission EOF )
            // InternalTaskDSL.g:80:1: ruleMission EOF
            {
             before(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getMissionRule()); 
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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalTaskDSL.g:87:1: ruleMission : ( ( rule__Mission__Group__0 ) ) ;
    public final void ruleMission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:91:2: ( ( ( rule__Mission__Group__0 ) ) )
            // InternalTaskDSL.g:92:2: ( ( rule__Mission__Group__0 ) )
            {
            // InternalTaskDSL.g:92:2: ( ( rule__Mission__Group__0 ) )
            // InternalTaskDSL.g:93:3: ( rule__Mission__Group__0 )
            {
             before(grammarAccess.getMissionAccess().getGroup()); 
            // InternalTaskDSL.g:94:3: ( rule__Mission__Group__0 )
            // InternalTaskDSL.g:94:4: rule__Mission__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getGroup()); 

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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleTask"
    // InternalTaskDSL.g:103:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalTaskDSL.g:104:1: ( ruleTask EOF )
            // InternalTaskDSL.g:105:1: ruleTask EOF
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
    // InternalTaskDSL.g:112:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:116:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalTaskDSL.g:117:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalTaskDSL.g:117:2: ( ( rule__Task__Group__0 ) )
            // InternalTaskDSL.g:118:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalTaskDSL.g:119:3: ( rule__Task__Group__0 )
            // InternalTaskDSL.g:119:4: rule__Task__Group__0
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
    // InternalTaskDSL.g:128:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:129:1: ( ruleAction EOF )
            // InternalTaskDSL.g:130:1: ruleAction EOF
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
    // InternalTaskDSL.g:137:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:141:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalTaskDSL.g:142:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalTaskDSL.g:142:2: ( ( rule__Action__Alternatives ) )
            // InternalTaskDSL.g:143:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalTaskDSL.g:144:3: ( rule__Action__Alternatives )
            // InternalTaskDSL.g:144:4: rule__Action__Alternatives
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


    // $ANTLR start "entryRuleDetector"
    // InternalTaskDSL.g:153:1: entryRuleDetector : ruleDetector EOF ;
    public final void entryRuleDetector() throws RecognitionException {
        try {
            // InternalTaskDSL.g:154:1: ( ruleDetector EOF )
            // InternalTaskDSL.g:155:1: ruleDetector EOF
            {
             before(grammarAccess.getDetectorRule()); 
            pushFollow(FOLLOW_1);
            ruleDetector();

            state._fsp--;

             after(grammarAccess.getDetectorRule()); 
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
    // $ANTLR end "entryRuleDetector"


    // $ANTLR start "ruleDetector"
    // InternalTaskDSL.g:162:1: ruleDetector : ( ( rule__Detector__Group__0 ) ) ;
    public final void ruleDetector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:166:2: ( ( ( rule__Detector__Group__0 ) ) )
            // InternalTaskDSL.g:167:2: ( ( rule__Detector__Group__0 ) )
            {
            // InternalTaskDSL.g:167:2: ( ( rule__Detector__Group__0 ) )
            // InternalTaskDSL.g:168:3: ( rule__Detector__Group__0 )
            {
             before(grammarAccess.getDetectorAccess().getGroup()); 
            // InternalTaskDSL.g:169:3: ( rule__Detector__Group__0 )
            // InternalTaskDSL.g:169:4: rule__Detector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Detector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDetectorAccess().getGroup()); 

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
    // $ANTLR end "ruleDetector"


    // $ANTLR start "entryRuleDriveUntil"
    // InternalTaskDSL.g:178:1: entryRuleDriveUntil : ruleDriveUntil EOF ;
    public final void entryRuleDriveUntil() throws RecognitionException {
        try {
            // InternalTaskDSL.g:179:1: ( ruleDriveUntil EOF )
            // InternalTaskDSL.g:180:1: ruleDriveUntil EOF
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
    // InternalTaskDSL.g:187:1: ruleDriveUntil : ( ( rule__DriveUntil__Group__0 ) ) ;
    public final void ruleDriveUntil() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:191:2: ( ( ( rule__DriveUntil__Group__0 ) ) )
            // InternalTaskDSL.g:192:2: ( ( rule__DriveUntil__Group__0 ) )
            {
            // InternalTaskDSL.g:192:2: ( ( rule__DriveUntil__Group__0 ) )
            // InternalTaskDSL.g:193:3: ( rule__DriveUntil__Group__0 )
            {
             before(grammarAccess.getDriveUntilAccess().getGroup()); 
            // InternalTaskDSL.g:194:3: ( rule__DriveUntil__Group__0 )
            // InternalTaskDSL.g:194:4: rule__DriveUntil__Group__0
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
    // InternalTaskDSL.g:203:1: entryRuleInvestigate : ruleInvestigate EOF ;
    public final void entryRuleInvestigate() throws RecognitionException {
        try {
            // InternalTaskDSL.g:204:1: ( ruleInvestigate EOF )
            // InternalTaskDSL.g:205:1: ruleInvestigate EOF
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
    // InternalTaskDSL.g:212:1: ruleInvestigate : ( ( rule__Investigate__Group__0 ) ) ;
    public final void ruleInvestigate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:216:2: ( ( ( rule__Investigate__Group__0 ) ) )
            // InternalTaskDSL.g:217:2: ( ( rule__Investigate__Group__0 ) )
            {
            // InternalTaskDSL.g:217:2: ( ( rule__Investigate__Group__0 ) )
            // InternalTaskDSL.g:218:3: ( rule__Investigate__Group__0 )
            {
             before(grammarAccess.getInvestigateAccess().getGroup()); 
            // InternalTaskDSL.g:219:3: ( rule__Investigate__Group__0 )
            // InternalTaskDSL.g:219:4: rule__Investigate__Group__0
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
    // InternalTaskDSL.g:228:1: entryRuleSpeak : ruleSpeak EOF ;
    public final void entryRuleSpeak() throws RecognitionException {
        try {
            // InternalTaskDSL.g:229:1: ( ruleSpeak EOF )
            // InternalTaskDSL.g:230:1: ruleSpeak EOF
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
    // InternalTaskDSL.g:237:1: ruleSpeak : ( ( rule__Speak__Group__0 ) ) ;
    public final void ruleSpeak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:241:2: ( ( ( rule__Speak__Group__0 ) ) )
            // InternalTaskDSL.g:242:2: ( ( rule__Speak__Group__0 ) )
            {
            // InternalTaskDSL.g:242:2: ( ( rule__Speak__Group__0 ) )
            // InternalTaskDSL.g:243:3: ( rule__Speak__Group__0 )
            {
             before(grammarAccess.getSpeakAccess().getGroup()); 
            // InternalTaskDSL.g:244:3: ( rule__Speak__Group__0 )
            // InternalTaskDSL.g:244:4: rule__Speak__Group__0
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
    // InternalTaskDSL.g:253:1: entryRuleFollowLine : ruleFollowLine EOF ;
    public final void entryRuleFollowLine() throws RecognitionException {
        try {
            // InternalTaskDSL.g:254:1: ( ruleFollowLine EOF )
            // InternalTaskDSL.g:255:1: ruleFollowLine EOF
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
    // InternalTaskDSL.g:262:1: ruleFollowLine : ( ( rule__FollowLine__Group__0 ) ) ;
    public final void ruleFollowLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:266:2: ( ( ( rule__FollowLine__Group__0 ) ) )
            // InternalTaskDSL.g:267:2: ( ( rule__FollowLine__Group__0 ) )
            {
            // InternalTaskDSL.g:267:2: ( ( rule__FollowLine__Group__0 ) )
            // InternalTaskDSL.g:268:3: ( rule__FollowLine__Group__0 )
            {
             before(grammarAccess.getFollowLineAccess().getGroup()); 
            // InternalTaskDSL.g:269:3: ( rule__FollowLine__Group__0 )
            // InternalTaskDSL.g:269:4: rule__FollowLine__Group__0
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
    // InternalTaskDSL.g:278:1: entryRuleAvoid : ruleAvoid EOF ;
    public final void entryRuleAvoid() throws RecognitionException {
        try {
            // InternalTaskDSL.g:279:1: ( ruleAvoid EOF )
            // InternalTaskDSL.g:280:1: ruleAvoid EOF
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
    // InternalTaskDSL.g:287:1: ruleAvoid : ( ( rule__Avoid__Group__0 ) ) ;
    public final void ruleAvoid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:291:2: ( ( ( rule__Avoid__Group__0 ) ) )
            // InternalTaskDSL.g:292:2: ( ( rule__Avoid__Group__0 ) )
            {
            // InternalTaskDSL.g:292:2: ( ( rule__Avoid__Group__0 ) )
            // InternalTaskDSL.g:293:3: ( rule__Avoid__Group__0 )
            {
             before(grammarAccess.getAvoidAccess().getGroup()); 
            // InternalTaskDSL.g:294:3: ( rule__Avoid__Group__0 )
            // InternalTaskDSL.g:294:4: rule__Avoid__Group__0
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


    // $ANTLR start "entryRuleDriveAction"
    // InternalTaskDSL.g:303:1: entryRuleDriveAction : ruleDriveAction EOF ;
    public final void entryRuleDriveAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:304:1: ( ruleDriveAction EOF )
            // InternalTaskDSL.g:305:1: ruleDriveAction EOF
            {
             before(grammarAccess.getDriveActionRule()); 
            pushFollow(FOLLOW_1);
            ruleDriveAction();

            state._fsp--;

             after(grammarAccess.getDriveActionRule()); 
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
    // $ANTLR end "entryRuleDriveAction"


    // $ANTLR start "ruleDriveAction"
    // InternalTaskDSL.g:312:1: ruleDriveAction : ( ( rule__DriveAction__Group__0 ) ) ;
    public final void ruleDriveAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:316:2: ( ( ( rule__DriveAction__Group__0 ) ) )
            // InternalTaskDSL.g:317:2: ( ( rule__DriveAction__Group__0 ) )
            {
            // InternalTaskDSL.g:317:2: ( ( rule__DriveAction__Group__0 ) )
            // InternalTaskDSL.g:318:3: ( rule__DriveAction__Group__0 )
            {
             before(grammarAccess.getDriveActionAccess().getGroup()); 
            // InternalTaskDSL.g:319:3: ( rule__DriveAction__Group__0 )
            // InternalTaskDSL.g:319:4: rule__DriveAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DriveAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDriveActionAccess().getGroup()); 

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
    // $ANTLR end "ruleDriveAction"


    // $ANTLR start "entryRuleMoveBack"
    // InternalTaskDSL.g:328:1: entryRuleMoveBack : ruleMoveBack EOF ;
    public final void entryRuleMoveBack() throws RecognitionException {
        try {
            // InternalTaskDSL.g:329:1: ( ruleMoveBack EOF )
            // InternalTaskDSL.g:330:1: ruleMoveBack EOF
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
    // InternalTaskDSL.g:337:1: ruleMoveBack : ( ( rule__MoveBack__Group__0 ) ) ;
    public final void ruleMoveBack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:341:2: ( ( ( rule__MoveBack__Group__0 ) ) )
            // InternalTaskDSL.g:342:2: ( ( rule__MoveBack__Group__0 ) )
            {
            // InternalTaskDSL.g:342:2: ( ( rule__MoveBack__Group__0 ) )
            // InternalTaskDSL.g:343:3: ( rule__MoveBack__Group__0 )
            {
             before(grammarAccess.getMoveBackAccess().getGroup()); 
            // InternalTaskDSL.g:344:3: ( rule__MoveBack__Group__0 )
            // InternalTaskDSL.g:344:4: rule__MoveBack__Group__0
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


    // $ANTLR start "entryRuleTurnLeft"
    // InternalTaskDSL.g:353:1: entryRuleTurnLeft : ruleTurnLeft EOF ;
    public final void entryRuleTurnLeft() throws RecognitionException {
        try {
            // InternalTaskDSL.g:354:1: ( ruleTurnLeft EOF )
            // InternalTaskDSL.g:355:1: ruleTurnLeft EOF
            {
             before(grammarAccess.getTurnLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnLeft();

            state._fsp--;

             after(grammarAccess.getTurnLeftRule()); 
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
    // $ANTLR end "entryRuleTurnLeft"


    // $ANTLR start "ruleTurnLeft"
    // InternalTaskDSL.g:362:1: ruleTurnLeft : ( ( rule__TurnLeft__Group__0 ) ) ;
    public final void ruleTurnLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:366:2: ( ( ( rule__TurnLeft__Group__0 ) ) )
            // InternalTaskDSL.g:367:2: ( ( rule__TurnLeft__Group__0 ) )
            {
            // InternalTaskDSL.g:367:2: ( ( rule__TurnLeft__Group__0 ) )
            // InternalTaskDSL.g:368:3: ( rule__TurnLeft__Group__0 )
            {
             before(grammarAccess.getTurnLeftAccess().getGroup()); 
            // InternalTaskDSL.g:369:3: ( rule__TurnLeft__Group__0 )
            // InternalTaskDSL.g:369:4: rule__TurnLeft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnLeftAccess().getGroup()); 

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
    // $ANTLR end "ruleTurnLeft"


    // $ANTLR start "entryRuleTurnRight"
    // InternalTaskDSL.g:378:1: entryRuleTurnRight : ruleTurnRight EOF ;
    public final void entryRuleTurnRight() throws RecognitionException {
        try {
            // InternalTaskDSL.g:379:1: ( ruleTurnRight EOF )
            // InternalTaskDSL.g:380:1: ruleTurnRight EOF
            {
             before(grammarAccess.getTurnRightRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnRight();

            state._fsp--;

             after(grammarAccess.getTurnRightRule()); 
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
    // $ANTLR end "entryRuleTurnRight"


    // $ANTLR start "ruleTurnRight"
    // InternalTaskDSL.g:387:1: ruleTurnRight : ( ( rule__TurnRight__Group__0 ) ) ;
    public final void ruleTurnRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:391:2: ( ( ( rule__TurnRight__Group__0 ) ) )
            // InternalTaskDSL.g:392:2: ( ( rule__TurnRight__Group__0 ) )
            {
            // InternalTaskDSL.g:392:2: ( ( rule__TurnRight__Group__0 ) )
            // InternalTaskDSL.g:393:3: ( rule__TurnRight__Group__0 )
            {
             before(grammarAccess.getTurnRightAccess().getGroup()); 
            // InternalTaskDSL.g:394:3: ( rule__TurnRight__Group__0 )
            // InternalTaskDSL.g:394:4: rule__TurnRight__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnRightAccess().getGroup()); 

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
    // $ANTLR end "ruleTurnRight"


    // $ANTLR start "ruleObject"
    // InternalTaskDSL.g:403:1: ruleObject : ( ( rule__Object__Alternatives ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:407:1: ( ( ( rule__Object__Alternatives ) ) )
            // InternalTaskDSL.g:408:2: ( ( rule__Object__Alternatives ) )
            {
            // InternalTaskDSL.g:408:2: ( ( rule__Object__Alternatives ) )
            // InternalTaskDSL.g:409:3: ( rule__Object__Alternatives )
            {
             before(grammarAccess.getObjectAccess().getAlternatives()); 
            // InternalTaskDSL.g:410:3: ( rule__Object__Alternatives )
            // InternalTaskDSL.g:410:4: rule__Object__Alternatives
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
    // InternalTaskDSL.g:419:1: ruleSpeed : ( ( rule__Speed__Alternatives ) ) ;
    public final void ruleSpeed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:423:1: ( ( ( rule__Speed__Alternatives ) ) )
            // InternalTaskDSL.g:424:2: ( ( rule__Speed__Alternatives ) )
            {
            // InternalTaskDSL.g:424:2: ( ( rule__Speed__Alternatives ) )
            // InternalTaskDSL.g:425:3: ( rule__Speed__Alternatives )
            {
             before(grammarAccess.getSpeedAccess().getAlternatives()); 
            // InternalTaskDSL.g:426:3: ( rule__Speed__Alternatives )
            // InternalTaskDSL.g:426:4: rule__Speed__Alternatives
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
    // InternalTaskDSL.g:435:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:439:1: ( ( ( rule__Color__Alternatives ) ) )
            // InternalTaskDSL.g:440:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalTaskDSL.g:440:2: ( ( rule__Color__Alternatives ) )
            // InternalTaskDSL.g:441:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalTaskDSL.g:442:3: ( rule__Color__Alternatives )
            // InternalTaskDSL.g:442:4: rule__Color__Alternatives
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
    // InternalTaskDSL.g:450:1: rule__Action__Alternatives : ( ( ( rule__Action__Group_0__0 ) ) | ( ruleInvestigate ) | ( ruleSpeak ) | ( ruleFollowLine ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:454:1: ( ( ( rule__Action__Group_0__0 ) ) | ( ruleInvestigate ) | ( ruleSpeak ) | ( ruleFollowLine ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 29:
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
                    // InternalTaskDSL.g:455:2: ( ( rule__Action__Group_0__0 ) )
                    {
                    // InternalTaskDSL.g:455:2: ( ( rule__Action__Group_0__0 ) )
                    // InternalTaskDSL.g:456:3: ( rule__Action__Group_0__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_0()); 
                    // InternalTaskDSL.g:457:3: ( rule__Action__Group_0__0 )
                    // InternalTaskDSL.g:457:4: rule__Action__Group_0__0
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
                    // InternalTaskDSL.g:461:2: ( ruleInvestigate )
                    {
                    // InternalTaskDSL.g:461:2: ( ruleInvestigate )
                    // InternalTaskDSL.g:462:3: ruleInvestigate
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
                    // InternalTaskDSL.g:467:2: ( ruleSpeak )
                    {
                    // InternalTaskDSL.g:467:2: ( ruleSpeak )
                    // InternalTaskDSL.g:468:3: ruleSpeak
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
                    // InternalTaskDSL.g:473:2: ( ruleFollowLine )
                    {
                    // InternalTaskDSL.g:473:2: ( ruleFollowLine )
                    // InternalTaskDSL.g:474:3: ruleFollowLine
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


    // $ANTLR start "rule__DriveAction__Alternatives_0"
    // InternalTaskDSL.g:483:1: rule__DriveAction__Alternatives_0 : ( ( ruleMoveBack ) | ( ruleTurnLeft ) | ( ruleTurnRight ) );
    public final void rule__DriveAction__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:487:1: ( ( ruleMoveBack ) | ( ruleTurnLeft ) | ( ruleTurnRight ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTaskDSL.g:488:2: ( ruleMoveBack )
                    {
                    // InternalTaskDSL.g:488:2: ( ruleMoveBack )
                    // InternalTaskDSL.g:489:3: ruleMoveBack
                    {
                     before(grammarAccess.getDriveActionAccess().getMoveBackParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveBack();

                    state._fsp--;

                     after(grammarAccess.getDriveActionAccess().getMoveBackParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:494:2: ( ruleTurnLeft )
                    {
                    // InternalTaskDSL.g:494:2: ( ruleTurnLeft )
                    // InternalTaskDSL.g:495:3: ruleTurnLeft
                    {
                     before(grammarAccess.getDriveActionAccess().getTurnLeftParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnLeft();

                    state._fsp--;

                     after(grammarAccess.getDriveActionAccess().getTurnLeftParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:500:2: ( ruleTurnRight )
                    {
                    // InternalTaskDSL.g:500:2: ( ruleTurnRight )
                    // InternalTaskDSL.g:501:3: ruleTurnRight
                    {
                     before(grammarAccess.getDriveActionAccess().getTurnRightParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnRight();

                    state._fsp--;

                     after(grammarAccess.getDriveActionAccess().getTurnRightParserRuleCall_0_2()); 

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
    // $ANTLR end "rule__DriveAction__Alternatives_0"


    // $ANTLR start "rule__Object__Alternatives"
    // InternalTaskDSL.g:510:1: rule__Object__Alternatives : ( ( ( 'ROCK' ) ) | ( ( 'LAKE' ) ) );
    public final void rule__Object__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:514:1: ( ( ( 'ROCK' ) ) | ( ( 'LAKE' ) ) )
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
                    // InternalTaskDSL.g:515:2: ( ( 'ROCK' ) )
                    {
                    // InternalTaskDSL.g:515:2: ( ( 'ROCK' ) )
                    // InternalTaskDSL.g:516:3: ( 'ROCK' )
                    {
                     before(grammarAccess.getObjectAccess().getROCKEnumLiteralDeclaration_0()); 
                    // InternalTaskDSL.g:517:3: ( 'ROCK' )
                    // InternalTaskDSL.g:517:4: 'ROCK'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getObjectAccess().getROCKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:521:2: ( ( 'LAKE' ) )
                    {
                    // InternalTaskDSL.g:521:2: ( ( 'LAKE' ) )
                    // InternalTaskDSL.g:522:3: ( 'LAKE' )
                    {
                     before(grammarAccess.getObjectAccess().getLAKEEnumLiteralDeclaration_1()); 
                    // InternalTaskDSL.g:523:3: ( 'LAKE' )
                    // InternalTaskDSL.g:523:4: 'LAKE'
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
    // InternalTaskDSL.g:531:1: rule__Speed__Alternatives : ( ( ( 'FAST' ) ) | ( ( 'NORMAL' ) ) | ( ( 'SLOW' ) ) );
    public final void rule__Speed__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:535:1: ( ( ( 'FAST' ) ) | ( ( 'NORMAL' ) ) | ( ( 'SLOW' ) ) )
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
                    // InternalTaskDSL.g:536:2: ( ( 'FAST' ) )
                    {
                    // InternalTaskDSL.g:536:2: ( ( 'FAST' ) )
                    // InternalTaskDSL.g:537:3: ( 'FAST' )
                    {
                     before(grammarAccess.getSpeedAccess().getFASTEnumLiteralDeclaration_0()); 
                    // InternalTaskDSL.g:538:3: ( 'FAST' )
                    // InternalTaskDSL.g:538:4: 'FAST'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSpeedAccess().getFASTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:542:2: ( ( 'NORMAL' ) )
                    {
                    // InternalTaskDSL.g:542:2: ( ( 'NORMAL' ) )
                    // InternalTaskDSL.g:543:3: ( 'NORMAL' )
                    {
                     before(grammarAccess.getSpeedAccess().getNORMALEnumLiteralDeclaration_1()); 
                    // InternalTaskDSL.g:544:3: ( 'NORMAL' )
                    // InternalTaskDSL.g:544:4: 'NORMAL'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSpeedAccess().getNORMALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:548:2: ( ( 'SLOW' ) )
                    {
                    // InternalTaskDSL.g:548:2: ( ( 'SLOW' ) )
                    // InternalTaskDSL.g:549:3: ( 'SLOW' )
                    {
                     before(grammarAccess.getSpeedAccess().getSLOWEnumLiteralDeclaration_2()); 
                    // InternalTaskDSL.g:550:3: ( 'SLOW' )
                    // InternalTaskDSL.g:550:4: 'SLOW'
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
    // InternalTaskDSL.g:558:1: rule__Color__Alternatives : ( ( ( 'RED' ) ) | ( ( 'GREEN' ) ) | ( ( 'BLUE' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:562:1: ( ( ( 'RED' ) ) | ( ( 'GREEN' ) ) | ( ( 'BLUE' ) ) )
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
                    // InternalTaskDSL.g:563:2: ( ( 'RED' ) )
                    {
                    // InternalTaskDSL.g:563:2: ( ( 'RED' ) )
                    // InternalTaskDSL.g:564:3: ( 'RED' )
                    {
                     before(grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0()); 
                    // InternalTaskDSL.g:565:3: ( 'RED' )
                    // InternalTaskDSL.g:565:4: 'RED'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:569:2: ( ( 'GREEN' ) )
                    {
                    // InternalTaskDSL.g:569:2: ( ( 'GREEN' ) )
                    // InternalTaskDSL.g:570:3: ( 'GREEN' )
                    {
                     before(grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_1()); 
                    // InternalTaskDSL.g:571:3: ( 'GREEN' )
                    // InternalTaskDSL.g:571:4: 'GREEN'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:575:2: ( ( 'BLUE' ) )
                    {
                    // InternalTaskDSL.g:575:2: ( ( 'BLUE' ) )
                    // InternalTaskDSL.g:576:3: ( 'BLUE' )
                    {
                     before(grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_2()); 
                    // InternalTaskDSL.g:577:3: ( 'BLUE' )
                    // InternalTaskDSL.g:577:4: 'BLUE'
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


    // $ANTLR start "rule__DSL__Group__0"
    // InternalTaskDSL.g:585:1: rule__DSL__Group__0 : rule__DSL__Group__0__Impl rule__DSL__Group__1 ;
    public final void rule__DSL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:589:1: ( rule__DSL__Group__0__Impl rule__DSL__Group__1 )
            // InternalTaskDSL.g:590:2: rule__DSL__Group__0__Impl rule__DSL__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DSL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSL__Group__1();

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
    // $ANTLR end "rule__DSL__Group__0"


    // $ANTLR start "rule__DSL__Group__0__Impl"
    // InternalTaskDSL.g:597:1: rule__DSL__Group__0__Impl : ( ( rule__DSL__MissionsAssignment_0 )* ) ;
    public final void rule__DSL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:601:1: ( ( ( rule__DSL__MissionsAssignment_0 )* ) )
            // InternalTaskDSL.g:602:1: ( ( rule__DSL__MissionsAssignment_0 )* )
            {
            // InternalTaskDSL.g:602:1: ( ( rule__DSL__MissionsAssignment_0 )* )
            // InternalTaskDSL.g:603:2: ( rule__DSL__MissionsAssignment_0 )*
            {
             before(grammarAccess.getDSLAccess().getMissionsAssignment_0()); 
            // InternalTaskDSL.g:604:2: ( rule__DSL__MissionsAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTaskDSL.g:604:3: rule__DSL__MissionsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DSL__MissionsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDSLAccess().getMissionsAssignment_0()); 

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
    // $ANTLR end "rule__DSL__Group__0__Impl"


    // $ANTLR start "rule__DSL__Group__1"
    // InternalTaskDSL.g:612:1: rule__DSL__Group__1 : rule__DSL__Group__1__Impl ;
    public final void rule__DSL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:616:1: ( rule__DSL__Group__1__Impl )
            // InternalTaskDSL.g:617:2: rule__DSL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSL__Group__1__Impl();

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
    // $ANTLR end "rule__DSL__Group__1"


    // $ANTLR start "rule__DSL__Group__1__Impl"
    // InternalTaskDSL.g:623:1: rule__DSL__Group__1__Impl : ( ( rule__DSL__TasksAssignment_1 )* ) ;
    public final void rule__DSL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:627:1: ( ( ( rule__DSL__TasksAssignment_1 )* ) )
            // InternalTaskDSL.g:628:1: ( ( rule__DSL__TasksAssignment_1 )* )
            {
            // InternalTaskDSL.g:628:1: ( ( rule__DSL__TasksAssignment_1 )* )
            // InternalTaskDSL.g:629:2: ( rule__DSL__TasksAssignment_1 )*
            {
             before(grammarAccess.getDSLAccess().getTasksAssignment_1()); 
            // InternalTaskDSL.g:630:2: ( rule__DSL__TasksAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTaskDSL.g:630:3: rule__DSL__TasksAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__DSL__TasksAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDSLAccess().getTasksAssignment_1()); 

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
    // $ANTLR end "rule__DSL__Group__1__Impl"


    // $ANTLR start "rule__Mission__Group__0"
    // InternalTaskDSL.g:639:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:643:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalTaskDSL.g:644:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Mission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__1();

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
    // $ANTLR end "rule__Mission__Group__0"


    // $ANTLR start "rule__Mission__Group__0__Impl"
    // InternalTaskDSL.g:651:1: rule__Mission__Group__0__Impl : ( 'Mission:' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:655:1: ( ( 'Mission:' ) )
            // InternalTaskDSL.g:656:1: ( 'Mission:' )
            {
            // InternalTaskDSL.g:656:1: ( 'Mission:' )
            // InternalTaskDSL.g:657:2: 'Mission:'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getMissionKeyword_0()); 

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
    // $ANTLR end "rule__Mission__Group__0__Impl"


    // $ANTLR start "rule__Mission__Group__1"
    // InternalTaskDSL.g:666:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:670:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalTaskDSL.g:671:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__2();

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
    // $ANTLR end "rule__Mission__Group__1"


    // $ANTLR start "rule__Mission__Group__1__Impl"
    // InternalTaskDSL.g:678:1: rule__Mission__Group__1__Impl : ( ( rule__Mission__NameAssignment_1 ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:682:1: ( ( ( rule__Mission__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:683:1: ( ( rule__Mission__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:683:1: ( ( rule__Mission__NameAssignment_1 ) )
            // InternalTaskDSL.g:684:2: ( rule__Mission__NameAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getNameAssignment_1()); 
            // InternalTaskDSL.g:685:2: ( rule__Mission__NameAssignment_1 )
            // InternalTaskDSL.g:685:3: rule__Mission__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Mission__Group__1__Impl"


    // $ANTLR start "rule__Mission__Group__2"
    // InternalTaskDSL.g:693:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:697:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalTaskDSL.g:698:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Mission__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__3();

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
    // $ANTLR end "rule__Mission__Group__2"


    // $ANTLR start "rule__Mission__Group__2__Impl"
    // InternalTaskDSL.g:705:1: rule__Mission__Group__2__Impl : ( 'tasks:' ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:709:1: ( ( 'tasks:' ) )
            // InternalTaskDSL.g:710:1: ( 'tasks:' )
            {
            // InternalTaskDSL.g:710:1: ( 'tasks:' )
            // InternalTaskDSL.g:711:2: 'tasks:'
            {
             before(grammarAccess.getMissionAccess().getTasksKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTasksKeyword_2()); 

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
    // $ANTLR end "rule__Mission__Group__2__Impl"


    // $ANTLR start "rule__Mission__Group__3"
    // InternalTaskDSL.g:720:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:724:1: ( rule__Mission__Group__3__Impl )
            // InternalTaskDSL.g:725:2: rule__Mission__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__3__Impl();

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
    // $ANTLR end "rule__Mission__Group__3"


    // $ANTLR start "rule__Mission__Group__3__Impl"
    // InternalTaskDSL.g:731:1: rule__Mission__Group__3__Impl : ( ( ( rule__Mission__TasksAssignment_3 ) ) ( ( rule__Mission__TasksAssignment_3 )* ) ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:735:1: ( ( ( ( rule__Mission__TasksAssignment_3 ) ) ( ( rule__Mission__TasksAssignment_3 )* ) ) )
            // InternalTaskDSL.g:736:1: ( ( ( rule__Mission__TasksAssignment_3 ) ) ( ( rule__Mission__TasksAssignment_3 )* ) )
            {
            // InternalTaskDSL.g:736:1: ( ( ( rule__Mission__TasksAssignment_3 ) ) ( ( rule__Mission__TasksAssignment_3 )* ) )
            // InternalTaskDSL.g:737:2: ( ( rule__Mission__TasksAssignment_3 ) ) ( ( rule__Mission__TasksAssignment_3 )* )
            {
            // InternalTaskDSL.g:737:2: ( ( rule__Mission__TasksAssignment_3 ) )
            // InternalTaskDSL.g:738:3: ( rule__Mission__TasksAssignment_3 )
            {
             before(grammarAccess.getMissionAccess().getTasksAssignment_3()); 
            // InternalTaskDSL.g:739:3: ( rule__Mission__TasksAssignment_3 )
            // InternalTaskDSL.g:739:4: rule__Mission__TasksAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__Mission__TasksAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTasksAssignment_3()); 

            }

            // InternalTaskDSL.g:742:2: ( ( rule__Mission__TasksAssignment_3 )* )
            // InternalTaskDSL.g:743:3: ( rule__Mission__TasksAssignment_3 )*
            {
             before(grammarAccess.getMissionAccess().getTasksAssignment_3()); 
            // InternalTaskDSL.g:744:3: ( rule__Mission__TasksAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTaskDSL.g:744:4: rule__Mission__TasksAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Mission__TasksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getTasksAssignment_3()); 

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
    // $ANTLR end "rule__Mission__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalTaskDSL.g:754:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:758:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalTaskDSL.g:759:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalTaskDSL.g:766:1: rule__Task__Group__0__Impl : ( 'Task:' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:770:1: ( ( 'Task:' ) )
            // InternalTaskDSL.g:771:1: ( 'Task:' )
            {
            // InternalTaskDSL.g:771:1: ( 'Task:' )
            // InternalTaskDSL.g:772:2: 'Task:'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalTaskDSL.g:781:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:785:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalTaskDSL.g:786:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalTaskDSL.g:793:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:797:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:798:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:798:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalTaskDSL.g:799:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalTaskDSL.g:800:2: ( rule__Task__NameAssignment_1 )
            // InternalTaskDSL.g:800:3: rule__Task__NameAssignment_1
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
    // InternalTaskDSL.g:808:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:812:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalTaskDSL.g:813:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalTaskDSL.g:820:1: rule__Task__Group__2__Impl : ( ( rule__Task__ActionAssignment_2 ) ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:824:1: ( ( ( rule__Task__ActionAssignment_2 ) ) )
            // InternalTaskDSL.g:825:1: ( ( rule__Task__ActionAssignment_2 ) )
            {
            // InternalTaskDSL.g:825:1: ( ( rule__Task__ActionAssignment_2 ) )
            // InternalTaskDSL.g:826:2: ( rule__Task__ActionAssignment_2 )
            {
             before(grammarAccess.getTaskAccess().getActionAssignment_2()); 
            // InternalTaskDSL.g:827:2: ( rule__Task__ActionAssignment_2 )
            // InternalTaskDSL.g:827:3: rule__Task__ActionAssignment_2
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
    // InternalTaskDSL.g:835:1: rule__Task__Group__3 : rule__Task__Group__3__Impl ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:839:1: ( rule__Task__Group__3__Impl )
            // InternalTaskDSL.g:840:2: rule__Task__Group__3__Impl
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
    // InternalTaskDSL.g:846:1: rule__Task__Group__3__Impl : ( ( rule__Task__DetectorAssignment_3 )? ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:850:1: ( ( ( rule__Task__DetectorAssignment_3 )? ) )
            // InternalTaskDSL.g:851:1: ( ( rule__Task__DetectorAssignment_3 )? )
            {
            // InternalTaskDSL.g:851:1: ( ( rule__Task__DetectorAssignment_3 )? )
            // InternalTaskDSL.g:852:2: ( rule__Task__DetectorAssignment_3 )?
            {
             before(grammarAccess.getTaskAccess().getDetectorAssignment_3()); 
            // InternalTaskDSL.g:853:2: ( rule__Task__DetectorAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTaskDSL.g:853:3: rule__Task__DetectorAssignment_3
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
    // InternalTaskDSL.g:862:1: rule__Action__Group_0__0 : rule__Action__Group_0__0__Impl rule__Action__Group_0__1 ;
    public final void rule__Action__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:866:1: ( rule__Action__Group_0__0__Impl rule__Action__Group_0__1 )
            // InternalTaskDSL.g:867:2: rule__Action__Group_0__0__Impl rule__Action__Group_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalTaskDSL.g:874:1: rule__Action__Group_0__0__Impl : ( 'action:' ) ;
    public final void rule__Action__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:878:1: ( ( 'action:' ) )
            // InternalTaskDSL.g:879:1: ( 'action:' )
            {
            // InternalTaskDSL.g:879:1: ( 'action:' )
            // InternalTaskDSL.g:880:2: 'action:'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTaskDSL.g:889:1: rule__Action__Group_0__1 : rule__Action__Group_0__1__Impl ;
    public final void rule__Action__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:893:1: ( rule__Action__Group_0__1__Impl )
            // InternalTaskDSL.g:894:2: rule__Action__Group_0__1__Impl
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
    // InternalTaskDSL.g:900:1: rule__Action__Group_0__1__Impl : ( ruleDriveUntil ) ;
    public final void rule__Action__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:904:1: ( ( ruleDriveUntil ) )
            // InternalTaskDSL.g:905:1: ( ruleDriveUntil )
            {
            // InternalTaskDSL.g:905:1: ( ruleDriveUntil )
            // InternalTaskDSL.g:906:2: ruleDriveUntil
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


    // $ANTLR start "rule__Detector__Group__0"
    // InternalTaskDSL.g:916:1: rule__Detector__Group__0 : rule__Detector__Group__0__Impl rule__Detector__Group__1 ;
    public final void rule__Detector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:920:1: ( rule__Detector__Group__0__Impl rule__Detector__Group__1 )
            // InternalTaskDSL.g:921:2: rule__Detector__Group__0__Impl rule__Detector__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Detector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detector__Group__1();

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
    // $ANTLR end "rule__Detector__Group__0"


    // $ANTLR start "rule__Detector__Group__0__Impl"
    // InternalTaskDSL.g:928:1: rule__Detector__Group__0__Impl : ( 'detectors:' ) ;
    public final void rule__Detector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:932:1: ( ( 'detectors:' ) )
            // InternalTaskDSL.g:933:1: ( 'detectors:' )
            {
            // InternalTaskDSL.g:933:1: ( 'detectors:' )
            // InternalTaskDSL.g:934:2: 'detectors:'
            {
             before(grammarAccess.getDetectorAccess().getDetectorsKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDetectorAccess().getDetectorsKeyword_0()); 

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
    // $ANTLR end "rule__Detector__Group__0__Impl"


    // $ANTLR start "rule__Detector__Group__1"
    // InternalTaskDSL.g:943:1: rule__Detector__Group__1 : rule__Detector__Group__1__Impl ;
    public final void rule__Detector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:947:1: ( rule__Detector__Group__1__Impl )
            // InternalTaskDSL.g:948:2: rule__Detector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Detector__Group__1__Impl();

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
    // $ANTLR end "rule__Detector__Group__1"


    // $ANTLR start "rule__Detector__Group__1__Impl"
    // InternalTaskDSL.g:954:1: rule__Detector__Group__1__Impl : ( ( ( rule__Detector__AvoidersAssignment_1 ) ) ( ( rule__Detector__AvoidersAssignment_1 )* ) ) ;
    public final void rule__Detector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:958:1: ( ( ( ( rule__Detector__AvoidersAssignment_1 ) ) ( ( rule__Detector__AvoidersAssignment_1 )* ) ) )
            // InternalTaskDSL.g:959:1: ( ( ( rule__Detector__AvoidersAssignment_1 ) ) ( ( rule__Detector__AvoidersAssignment_1 )* ) )
            {
            // InternalTaskDSL.g:959:1: ( ( ( rule__Detector__AvoidersAssignment_1 ) ) ( ( rule__Detector__AvoidersAssignment_1 )* ) )
            // InternalTaskDSL.g:960:2: ( ( rule__Detector__AvoidersAssignment_1 ) ) ( ( rule__Detector__AvoidersAssignment_1 )* )
            {
            // InternalTaskDSL.g:960:2: ( ( rule__Detector__AvoidersAssignment_1 ) )
            // InternalTaskDSL.g:961:3: ( rule__Detector__AvoidersAssignment_1 )
            {
             before(grammarAccess.getDetectorAccess().getAvoidersAssignment_1()); 
            // InternalTaskDSL.g:962:3: ( rule__Detector__AvoidersAssignment_1 )
            // InternalTaskDSL.g:962:4: rule__Detector__AvoidersAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__Detector__AvoidersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDetectorAccess().getAvoidersAssignment_1()); 

            }

            // InternalTaskDSL.g:965:2: ( ( rule__Detector__AvoidersAssignment_1 )* )
            // InternalTaskDSL.g:966:3: ( rule__Detector__AvoidersAssignment_1 )*
            {
             before(grammarAccess.getDetectorAccess().getAvoidersAssignment_1()); 
            // InternalTaskDSL.g:967:3: ( rule__Detector__AvoidersAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTaskDSL.g:967:4: rule__Detector__AvoidersAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Detector__AvoidersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDetectorAccess().getAvoidersAssignment_1()); 

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
    // $ANTLR end "rule__Detector__Group__1__Impl"


    // $ANTLR start "rule__DriveUntil__Group__0"
    // InternalTaskDSL.g:977:1: rule__DriveUntil__Group__0 : rule__DriveUntil__Group__0__Impl rule__DriveUntil__Group__1 ;
    public final void rule__DriveUntil__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:981:1: ( rule__DriveUntil__Group__0__Impl rule__DriveUntil__Group__1 )
            // InternalTaskDSL.g:982:2: rule__DriveUntil__Group__0__Impl rule__DriveUntil__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalTaskDSL.g:989:1: rule__DriveUntil__Group__0__Impl : ( 'Drive' ) ;
    public final void rule__DriveUntil__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:993:1: ( ( 'Drive' ) )
            // InternalTaskDSL.g:994:1: ( 'Drive' )
            {
            // InternalTaskDSL.g:994:1: ( 'Drive' )
            // InternalTaskDSL.g:995:2: 'Drive'
            {
             before(grammarAccess.getDriveUntilAccess().getDriveKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTaskDSL.g:1004:1: rule__DriveUntil__Group__1 : rule__DriveUntil__Group__1__Impl rule__DriveUntil__Group__2 ;
    public final void rule__DriveUntil__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1008:1: ( rule__DriveUntil__Group__1__Impl rule__DriveUntil__Group__2 )
            // InternalTaskDSL.g:1009:2: rule__DriveUntil__Group__1__Impl rule__DriveUntil__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalTaskDSL.g:1016:1: rule__DriveUntil__Group__1__Impl : ( ( rule__DriveUntil__SpeedAssignment_1 )? ) ;
    public final void rule__DriveUntil__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1020:1: ( ( ( rule__DriveUntil__SpeedAssignment_1 )? ) )
            // InternalTaskDSL.g:1021:1: ( ( rule__DriveUntil__SpeedAssignment_1 )? )
            {
            // InternalTaskDSL.g:1021:1: ( ( rule__DriveUntil__SpeedAssignment_1 )? )
            // InternalTaskDSL.g:1022:2: ( rule__DriveUntil__SpeedAssignment_1 )?
            {
             before(grammarAccess.getDriveUntilAccess().getSpeedAssignment_1()); 
            // InternalTaskDSL.g:1023:2: ( rule__DriveUntil__SpeedAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=13 && LA11_0<=15)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTaskDSL.g:1023:3: rule__DriveUntil__SpeedAssignment_1
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
    // InternalTaskDSL.g:1031:1: rule__DriveUntil__Group__2 : rule__DriveUntil__Group__2__Impl rule__DriveUntil__Group__3 ;
    public final void rule__DriveUntil__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1035:1: ( rule__DriveUntil__Group__2__Impl rule__DriveUntil__Group__3 )
            // InternalTaskDSL.g:1036:2: rule__DriveUntil__Group__2__Impl rule__DriveUntil__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalTaskDSL.g:1043:1: rule__DriveUntil__Group__2__Impl : ( 'Until' ) ;
    public final void rule__DriveUntil__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1047:1: ( ( 'Until' ) )
            // InternalTaskDSL.g:1048:1: ( 'Until' )
            {
            // InternalTaskDSL.g:1048:1: ( 'Until' )
            // InternalTaskDSL.g:1049:2: 'Until'
            {
             before(grammarAccess.getDriveUntilAccess().getUntilKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTaskDSL.g:1058:1: rule__DriveUntil__Group__3 : rule__DriveUntil__Group__3__Impl rule__DriveUntil__Group__4 ;
    public final void rule__DriveUntil__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1062:1: ( rule__DriveUntil__Group__3__Impl rule__DriveUntil__Group__4 )
            // InternalTaskDSL.g:1063:2: rule__DriveUntil__Group__3__Impl rule__DriveUntil__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalTaskDSL.g:1070:1: rule__DriveUntil__Group__3__Impl : ( ( rule__DriveUntil__ColorAssignment_3 )? ) ;
    public final void rule__DriveUntil__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1074:1: ( ( ( rule__DriveUntil__ColorAssignment_3 )? ) )
            // InternalTaskDSL.g:1075:1: ( ( rule__DriveUntil__ColorAssignment_3 )? )
            {
            // InternalTaskDSL.g:1075:1: ( ( rule__DriveUntil__ColorAssignment_3 )? )
            // InternalTaskDSL.g:1076:2: ( rule__DriveUntil__ColorAssignment_3 )?
            {
             before(grammarAccess.getDriveUntilAccess().getColorAssignment_3()); 
            // InternalTaskDSL.g:1077:2: ( rule__DriveUntil__ColorAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=16 && LA12_0<=18)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTaskDSL.g:1077:3: rule__DriveUntil__ColorAssignment_3
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
    // InternalTaskDSL.g:1085:1: rule__DriveUntil__Group__4 : rule__DriveUntil__Group__4__Impl rule__DriveUntil__Group__5 ;
    public final void rule__DriveUntil__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1089:1: ( rule__DriveUntil__Group__4__Impl rule__DriveUntil__Group__5 )
            // InternalTaskDSL.g:1090:2: rule__DriveUntil__Group__4__Impl rule__DriveUntil__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalTaskDSL.g:1097:1: rule__DriveUntil__Group__4__Impl : ( ( rule__DriveUntil__ObjectAssignment_4 ) ) ;
    public final void rule__DriveUntil__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1101:1: ( ( ( rule__DriveUntil__ObjectAssignment_4 ) ) )
            // InternalTaskDSL.g:1102:1: ( ( rule__DriveUntil__ObjectAssignment_4 ) )
            {
            // InternalTaskDSL.g:1102:1: ( ( rule__DriveUntil__ObjectAssignment_4 ) )
            // InternalTaskDSL.g:1103:2: ( rule__DriveUntil__ObjectAssignment_4 )
            {
             before(grammarAccess.getDriveUntilAccess().getObjectAssignment_4()); 
            // InternalTaskDSL.g:1104:2: ( rule__DriveUntil__ObjectAssignment_4 )
            // InternalTaskDSL.g:1104:3: rule__DriveUntil__ObjectAssignment_4
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
    // InternalTaskDSL.g:1112:1: rule__DriveUntil__Group__5 : rule__DriveUntil__Group__5__Impl ;
    public final void rule__DriveUntil__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1116:1: ( rule__DriveUntil__Group__5__Impl )
            // InternalTaskDSL.g:1117:2: rule__DriveUntil__Group__5__Impl
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
    // InternalTaskDSL.g:1123:1: rule__DriveUntil__Group__5__Impl : ( 'Found' ) ;
    public final void rule__DriveUntil__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1127:1: ( ( 'Found' ) )
            // InternalTaskDSL.g:1128:1: ( 'Found' )
            {
            // InternalTaskDSL.g:1128:1: ( 'Found' )
            // InternalTaskDSL.g:1129:2: 'Found'
            {
             before(grammarAccess.getDriveUntilAccess().getFoundKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalTaskDSL.g:1139:1: rule__Investigate__Group__0 : rule__Investigate__Group__0__Impl rule__Investigate__Group__1 ;
    public final void rule__Investigate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1143:1: ( rule__Investigate__Group__0__Impl rule__Investigate__Group__1 )
            // InternalTaskDSL.g:1144:2: rule__Investigate__Group__0__Impl rule__Investigate__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalTaskDSL.g:1151:1: rule__Investigate__Group__0__Impl : ( 'Investigate' ) ;
    public final void rule__Investigate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1155:1: ( ( 'Investigate' ) )
            // InternalTaskDSL.g:1156:1: ( 'Investigate' )
            {
            // InternalTaskDSL.g:1156:1: ( 'Investigate' )
            // InternalTaskDSL.g:1157:2: 'Investigate'
            {
             before(grammarAccess.getInvestigateAccess().getInvestigateKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalTaskDSL.g:1166:1: rule__Investigate__Group__1 : rule__Investigate__Group__1__Impl ;
    public final void rule__Investigate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1170:1: ( rule__Investigate__Group__1__Impl )
            // InternalTaskDSL.g:1171:2: rule__Investigate__Group__1__Impl
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
    // InternalTaskDSL.g:1177:1: rule__Investigate__Group__1__Impl : ( ( rule__Investigate__SpeedAssignment_1 ) ) ;
    public final void rule__Investigate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1181:1: ( ( ( rule__Investigate__SpeedAssignment_1 ) ) )
            // InternalTaskDSL.g:1182:1: ( ( rule__Investigate__SpeedAssignment_1 ) )
            {
            // InternalTaskDSL.g:1182:1: ( ( rule__Investigate__SpeedAssignment_1 ) )
            // InternalTaskDSL.g:1183:2: ( rule__Investigate__SpeedAssignment_1 )
            {
             before(grammarAccess.getInvestigateAccess().getSpeedAssignment_1()); 
            // InternalTaskDSL.g:1184:2: ( rule__Investigate__SpeedAssignment_1 )
            // InternalTaskDSL.g:1184:3: rule__Investigate__SpeedAssignment_1
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
    // InternalTaskDSL.g:1193:1: rule__Speak__Group__0 : rule__Speak__Group__0__Impl rule__Speak__Group__1 ;
    public final void rule__Speak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1197:1: ( rule__Speak__Group__0__Impl rule__Speak__Group__1 )
            // InternalTaskDSL.g:1198:2: rule__Speak__Group__0__Impl rule__Speak__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalTaskDSL.g:1205:1: rule__Speak__Group__0__Impl : ( 'Speak' ) ;
    public final void rule__Speak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1209:1: ( ( 'Speak' ) )
            // InternalTaskDSL.g:1210:1: ( 'Speak' )
            {
            // InternalTaskDSL.g:1210:1: ( 'Speak' )
            // InternalTaskDSL.g:1211:2: 'Speak'
            {
             before(grammarAccess.getSpeakAccess().getSpeakKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalTaskDSL.g:1220:1: rule__Speak__Group__1 : rule__Speak__Group__1__Impl ;
    public final void rule__Speak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1224:1: ( rule__Speak__Group__1__Impl )
            // InternalTaskDSL.g:1225:2: rule__Speak__Group__1__Impl
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
    // InternalTaskDSL.g:1231:1: rule__Speak__Group__1__Impl : ( ( rule__Speak__TextAssignment_1 ) ) ;
    public final void rule__Speak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1235:1: ( ( ( rule__Speak__TextAssignment_1 ) ) )
            // InternalTaskDSL.g:1236:1: ( ( rule__Speak__TextAssignment_1 ) )
            {
            // InternalTaskDSL.g:1236:1: ( ( rule__Speak__TextAssignment_1 ) )
            // InternalTaskDSL.g:1237:2: ( rule__Speak__TextAssignment_1 )
            {
             before(grammarAccess.getSpeakAccess().getTextAssignment_1()); 
            // InternalTaskDSL.g:1238:2: ( rule__Speak__TextAssignment_1 )
            // InternalTaskDSL.g:1238:3: rule__Speak__TextAssignment_1
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
    // InternalTaskDSL.g:1247:1: rule__FollowLine__Group__0 : rule__FollowLine__Group__0__Impl rule__FollowLine__Group__1 ;
    public final void rule__FollowLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1251:1: ( rule__FollowLine__Group__0__Impl rule__FollowLine__Group__1 )
            // InternalTaskDSL.g:1252:2: rule__FollowLine__Group__0__Impl rule__FollowLine__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTaskDSL.g:1259:1: rule__FollowLine__Group__0__Impl : ( 'FindAndFollowLineFor' ) ;
    public final void rule__FollowLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1263:1: ( ( 'FindAndFollowLineFor' ) )
            // InternalTaskDSL.g:1264:1: ( 'FindAndFollowLineFor' )
            {
            // InternalTaskDSL.g:1264:1: ( 'FindAndFollowLineFor' )
            // InternalTaskDSL.g:1265:2: 'FindAndFollowLineFor'
            {
             before(grammarAccess.getFollowLineAccess().getFindAndFollowLineForKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalTaskDSL.g:1274:1: rule__FollowLine__Group__1 : rule__FollowLine__Group__1__Impl rule__FollowLine__Group__2 ;
    public final void rule__FollowLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1278:1: ( rule__FollowLine__Group__1__Impl rule__FollowLine__Group__2 )
            // InternalTaskDSL.g:1279:2: rule__FollowLine__Group__1__Impl rule__FollowLine__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalTaskDSL.g:1286:1: rule__FollowLine__Group__1__Impl : ( ( rule__FollowLine__DistanceAssignment_1 ) ) ;
    public final void rule__FollowLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1290:1: ( ( ( rule__FollowLine__DistanceAssignment_1 ) ) )
            // InternalTaskDSL.g:1291:1: ( ( rule__FollowLine__DistanceAssignment_1 ) )
            {
            // InternalTaskDSL.g:1291:1: ( ( rule__FollowLine__DistanceAssignment_1 ) )
            // InternalTaskDSL.g:1292:2: ( rule__FollowLine__DistanceAssignment_1 )
            {
             before(grammarAccess.getFollowLineAccess().getDistanceAssignment_1()); 
            // InternalTaskDSL.g:1293:2: ( rule__FollowLine__DistanceAssignment_1 )
            // InternalTaskDSL.g:1293:3: rule__FollowLine__DistanceAssignment_1
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
    // InternalTaskDSL.g:1301:1: rule__FollowLine__Group__2 : rule__FollowLine__Group__2__Impl ;
    public final void rule__FollowLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1305:1: ( rule__FollowLine__Group__2__Impl )
            // InternalTaskDSL.g:1306:2: rule__FollowLine__Group__2__Impl
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
    // InternalTaskDSL.g:1312:1: rule__FollowLine__Group__2__Impl : ( 'meters' ) ;
    public final void rule__FollowLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1316:1: ( ( 'meters' ) )
            // InternalTaskDSL.g:1317:1: ( 'meters' )
            {
            // InternalTaskDSL.g:1317:1: ( 'meters' )
            // InternalTaskDSL.g:1318:2: 'meters'
            {
             before(grammarAccess.getFollowLineAccess().getMetersKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalTaskDSL.g:1328:1: rule__Avoid__Group__0 : rule__Avoid__Group__0__Impl rule__Avoid__Group__1 ;
    public final void rule__Avoid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1332:1: ( rule__Avoid__Group__0__Impl rule__Avoid__Group__1 )
            // InternalTaskDSL.g:1333:2: rule__Avoid__Group__0__Impl rule__Avoid__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalTaskDSL.g:1340:1: rule__Avoid__Group__0__Impl : ( 'Avoid' ) ;
    public final void rule__Avoid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1344:1: ( ( 'Avoid' ) )
            // InternalTaskDSL.g:1345:1: ( 'Avoid' )
            {
            // InternalTaskDSL.g:1345:1: ( 'Avoid' )
            // InternalTaskDSL.g:1346:2: 'Avoid'
            {
             before(grammarAccess.getAvoidAccess().getAvoidKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalTaskDSL.g:1355:1: rule__Avoid__Group__1 : rule__Avoid__Group__1__Impl rule__Avoid__Group__2 ;
    public final void rule__Avoid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1359:1: ( rule__Avoid__Group__1__Impl rule__Avoid__Group__2 )
            // InternalTaskDSL.g:1360:2: rule__Avoid__Group__1__Impl rule__Avoid__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTaskDSL.g:1367:1: rule__Avoid__Group__1__Impl : ( ( rule__Avoid__ColorAssignment_1 )? ) ;
    public final void rule__Avoid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1371:1: ( ( ( rule__Avoid__ColorAssignment_1 )? ) )
            // InternalTaskDSL.g:1372:1: ( ( rule__Avoid__ColorAssignment_1 )? )
            {
            // InternalTaskDSL.g:1372:1: ( ( rule__Avoid__ColorAssignment_1 )? )
            // InternalTaskDSL.g:1373:2: ( rule__Avoid__ColorAssignment_1 )?
            {
             before(grammarAccess.getAvoidAccess().getColorAssignment_1()); 
            // InternalTaskDSL.g:1374:2: ( rule__Avoid__ColorAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=16 && LA13_0<=18)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTaskDSL.g:1374:3: rule__Avoid__ColorAssignment_1
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
    // InternalTaskDSL.g:1382:1: rule__Avoid__Group__2 : rule__Avoid__Group__2__Impl rule__Avoid__Group__3 ;
    public final void rule__Avoid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1386:1: ( rule__Avoid__Group__2__Impl rule__Avoid__Group__3 )
            // InternalTaskDSL.g:1387:2: rule__Avoid__Group__2__Impl rule__Avoid__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalTaskDSL.g:1394:1: rule__Avoid__Group__2__Impl : ( ( rule__Avoid__ObjectAssignment_2 ) ) ;
    public final void rule__Avoid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1398:1: ( ( ( rule__Avoid__ObjectAssignment_2 ) ) )
            // InternalTaskDSL.g:1399:1: ( ( rule__Avoid__ObjectAssignment_2 ) )
            {
            // InternalTaskDSL.g:1399:1: ( ( rule__Avoid__ObjectAssignment_2 ) )
            // InternalTaskDSL.g:1400:2: ( rule__Avoid__ObjectAssignment_2 )
            {
             before(grammarAccess.getAvoidAccess().getObjectAssignment_2()); 
            // InternalTaskDSL.g:1401:2: ( rule__Avoid__ObjectAssignment_2 )
            // InternalTaskDSL.g:1401:3: rule__Avoid__ObjectAssignment_2
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
    // InternalTaskDSL.g:1409:1: rule__Avoid__Group__3 : rule__Avoid__Group__3__Impl rule__Avoid__Group__4 ;
    public final void rule__Avoid__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1413:1: ( rule__Avoid__Group__3__Impl rule__Avoid__Group__4 )
            // InternalTaskDSL.g:1414:2: rule__Avoid__Group__3__Impl rule__Avoid__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalTaskDSL.g:1421:1: rule__Avoid__Group__3__Impl : ( 'By' ) ;
    public final void rule__Avoid__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1425:1: ( ( 'By' ) )
            // InternalTaskDSL.g:1426:1: ( 'By' )
            {
            // InternalTaskDSL.g:1426:1: ( 'By' )
            // InternalTaskDSL.g:1427:2: 'By'
            {
             before(grammarAccess.getAvoidAccess().getByKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTaskDSL.g:1436:1: rule__Avoid__Group__4 : rule__Avoid__Group__4__Impl ;
    public final void rule__Avoid__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1440:1: ( rule__Avoid__Group__4__Impl )
            // InternalTaskDSL.g:1441:2: rule__Avoid__Group__4__Impl
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
    // InternalTaskDSL.g:1447:1: rule__Avoid__Group__4__Impl : ( ( ( rule__Avoid__DriveActionsAssignment_4 ) ) ( ( rule__Avoid__DriveActionsAssignment_4 )* ) ) ;
    public final void rule__Avoid__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1451:1: ( ( ( ( rule__Avoid__DriveActionsAssignment_4 ) ) ( ( rule__Avoid__DriveActionsAssignment_4 )* ) ) )
            // InternalTaskDSL.g:1452:1: ( ( ( rule__Avoid__DriveActionsAssignment_4 ) ) ( ( rule__Avoid__DriveActionsAssignment_4 )* ) )
            {
            // InternalTaskDSL.g:1452:1: ( ( ( rule__Avoid__DriveActionsAssignment_4 ) ) ( ( rule__Avoid__DriveActionsAssignment_4 )* ) )
            // InternalTaskDSL.g:1453:2: ( ( rule__Avoid__DriveActionsAssignment_4 ) ) ( ( rule__Avoid__DriveActionsAssignment_4 )* )
            {
            // InternalTaskDSL.g:1453:2: ( ( rule__Avoid__DriveActionsAssignment_4 ) )
            // InternalTaskDSL.g:1454:3: ( rule__Avoid__DriveActionsAssignment_4 )
            {
             before(grammarAccess.getAvoidAccess().getDriveActionsAssignment_4()); 
            // InternalTaskDSL.g:1455:3: ( rule__Avoid__DriveActionsAssignment_4 )
            // InternalTaskDSL.g:1455:4: rule__Avoid__DriveActionsAssignment_4
            {
            pushFollow(FOLLOW_23);
            rule__Avoid__DriveActionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAvoidAccess().getDriveActionsAssignment_4()); 

            }

            // InternalTaskDSL.g:1458:2: ( ( rule__Avoid__DriveActionsAssignment_4 )* )
            // InternalTaskDSL.g:1459:3: ( rule__Avoid__DriveActionsAssignment_4 )*
            {
             before(grammarAccess.getAvoidAccess().getDriveActionsAssignment_4()); 
            // InternalTaskDSL.g:1460:3: ( rule__Avoid__DriveActionsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=34 && LA14_0<=35)||LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTaskDSL.g:1460:4: rule__Avoid__DriveActionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Avoid__DriveActionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAvoidAccess().getDriveActionsAssignment_4()); 

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


    // $ANTLR start "rule__DriveAction__Group__0"
    // InternalTaskDSL.g:1470:1: rule__DriveAction__Group__0 : rule__DriveAction__Group__0__Impl rule__DriveAction__Group__1 ;
    public final void rule__DriveAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1474:1: ( rule__DriveAction__Group__0__Impl rule__DriveAction__Group__1 )
            // InternalTaskDSL.g:1475:2: rule__DriveAction__Group__0__Impl rule__DriveAction__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__DriveAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DriveAction__Group__1();

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
    // $ANTLR end "rule__DriveAction__Group__0"


    // $ANTLR start "rule__DriveAction__Group__0__Impl"
    // InternalTaskDSL.g:1482:1: rule__DriveAction__Group__0__Impl : ( ( rule__DriveAction__Alternatives_0 ) ) ;
    public final void rule__DriveAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1486:1: ( ( ( rule__DriveAction__Alternatives_0 ) ) )
            // InternalTaskDSL.g:1487:1: ( ( rule__DriveAction__Alternatives_0 ) )
            {
            // InternalTaskDSL.g:1487:1: ( ( rule__DriveAction__Alternatives_0 ) )
            // InternalTaskDSL.g:1488:2: ( rule__DriveAction__Alternatives_0 )
            {
             before(grammarAccess.getDriveActionAccess().getAlternatives_0()); 
            // InternalTaskDSL.g:1489:2: ( rule__DriveAction__Alternatives_0 )
            // InternalTaskDSL.g:1489:3: rule__DriveAction__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__DriveAction__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDriveActionAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__DriveAction__Group__0__Impl"


    // $ANTLR start "rule__DriveAction__Group__1"
    // InternalTaskDSL.g:1497:1: rule__DriveAction__Group__1 : rule__DriveAction__Group__1__Impl ;
    public final void rule__DriveAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1501:1: ( rule__DriveAction__Group__1__Impl )
            // InternalTaskDSL.g:1502:2: rule__DriveAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DriveAction__Group__1__Impl();

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
    // $ANTLR end "rule__DriveAction__Group__1"


    // $ANTLR start "rule__DriveAction__Group__1__Impl"
    // InternalTaskDSL.g:1508:1: rule__DriveAction__Group__1__Impl : ( ( 'and' )? ) ;
    public final void rule__DriveAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1512:1: ( ( ( 'and' )? ) )
            // InternalTaskDSL.g:1513:1: ( ( 'and' )? )
            {
            // InternalTaskDSL.g:1513:1: ( ( 'and' )? )
            // InternalTaskDSL.g:1514:2: ( 'and' )?
            {
             before(grammarAccess.getDriveActionAccess().getAndKeyword_1()); 
            // InternalTaskDSL.g:1515:2: ( 'and' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTaskDSL.g:1515:3: 'and'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDriveActionAccess().getAndKeyword_1()); 

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
    // $ANTLR end "rule__DriveAction__Group__1__Impl"


    // $ANTLR start "rule__MoveBack__Group__0"
    // InternalTaskDSL.g:1524:1: rule__MoveBack__Group__0 : rule__MoveBack__Group__0__Impl rule__MoveBack__Group__1 ;
    public final void rule__MoveBack__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1528:1: ( rule__MoveBack__Group__0__Impl rule__MoveBack__Group__1 )
            // InternalTaskDSL.g:1529:2: rule__MoveBack__Group__0__Impl rule__MoveBack__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTaskDSL.g:1536:1: rule__MoveBack__Group__0__Impl : ( 'MoveBackwards' ) ;
    public final void rule__MoveBack__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1540:1: ( ( 'MoveBackwards' ) )
            // InternalTaskDSL.g:1541:1: ( 'MoveBackwards' )
            {
            // InternalTaskDSL.g:1541:1: ( 'MoveBackwards' )
            // InternalTaskDSL.g:1542:2: 'MoveBackwards'
            {
             before(grammarAccess.getMoveBackAccess().getMoveBackwardsKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTaskDSL.g:1551:1: rule__MoveBack__Group__1 : rule__MoveBack__Group__1__Impl rule__MoveBack__Group__2 ;
    public final void rule__MoveBack__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1555:1: ( rule__MoveBack__Group__1__Impl rule__MoveBack__Group__2 )
            // InternalTaskDSL.g:1556:2: rule__MoveBack__Group__1__Impl rule__MoveBack__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalTaskDSL.g:1563:1: rule__MoveBack__Group__1__Impl : ( ( rule__MoveBack__MetersAssignment_1 ) ) ;
    public final void rule__MoveBack__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1567:1: ( ( ( rule__MoveBack__MetersAssignment_1 ) ) )
            // InternalTaskDSL.g:1568:1: ( ( rule__MoveBack__MetersAssignment_1 ) )
            {
            // InternalTaskDSL.g:1568:1: ( ( rule__MoveBack__MetersAssignment_1 ) )
            // InternalTaskDSL.g:1569:2: ( rule__MoveBack__MetersAssignment_1 )
            {
             before(grammarAccess.getMoveBackAccess().getMetersAssignment_1()); 
            // InternalTaskDSL.g:1570:2: ( rule__MoveBack__MetersAssignment_1 )
            // InternalTaskDSL.g:1570:3: rule__MoveBack__MetersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveBack__MetersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveBackAccess().getMetersAssignment_1()); 

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
    // InternalTaskDSL.g:1578:1: rule__MoveBack__Group__2 : rule__MoveBack__Group__2__Impl ;
    public final void rule__MoveBack__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1582:1: ( rule__MoveBack__Group__2__Impl )
            // InternalTaskDSL.g:1583:2: rule__MoveBack__Group__2__Impl
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
    // InternalTaskDSL.g:1589:1: rule__MoveBack__Group__2__Impl : ( 'meters' ) ;
    public final void rule__MoveBack__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1593:1: ( ( 'meters' ) )
            // InternalTaskDSL.g:1594:1: ( 'meters' )
            {
            // InternalTaskDSL.g:1594:1: ( 'meters' )
            // InternalTaskDSL.g:1595:2: 'meters'
            {
             before(grammarAccess.getMoveBackAccess().getMetersKeyword_2()); 
            match(input,30,FOLLOW_2); 
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


    // $ANTLR start "rule__TurnLeft__Group__0"
    // InternalTaskDSL.g:1605:1: rule__TurnLeft__Group__0 : rule__TurnLeft__Group__0__Impl rule__TurnLeft__Group__1 ;
    public final void rule__TurnLeft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1609:1: ( rule__TurnLeft__Group__0__Impl rule__TurnLeft__Group__1 )
            // InternalTaskDSL.g:1610:2: rule__TurnLeft__Group__0__Impl rule__TurnLeft__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__TurnLeft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__1();

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
    // $ANTLR end "rule__TurnLeft__Group__0"


    // $ANTLR start "rule__TurnLeft__Group__0__Impl"
    // InternalTaskDSL.g:1617:1: rule__TurnLeft__Group__0__Impl : ( 'TurnLeft' ) ;
    public final void rule__TurnLeft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1621:1: ( ( 'TurnLeft' ) )
            // InternalTaskDSL.g:1622:1: ( 'TurnLeft' )
            {
            // InternalTaskDSL.g:1622:1: ( 'TurnLeft' )
            // InternalTaskDSL.g:1623:2: 'TurnLeft'
            {
             before(grammarAccess.getTurnLeftAccess().getTurnLeftKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTurnLeftAccess().getTurnLeftKeyword_0()); 

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
    // $ANTLR end "rule__TurnLeft__Group__0__Impl"


    // $ANTLR start "rule__TurnLeft__Group__1"
    // InternalTaskDSL.g:1632:1: rule__TurnLeft__Group__1 : rule__TurnLeft__Group__1__Impl rule__TurnLeft__Group__2 ;
    public final void rule__TurnLeft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1636:1: ( rule__TurnLeft__Group__1__Impl rule__TurnLeft__Group__2 )
            // InternalTaskDSL.g:1637:2: rule__TurnLeft__Group__1__Impl rule__TurnLeft__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__TurnLeft__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__2();

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
    // $ANTLR end "rule__TurnLeft__Group__1"


    // $ANTLR start "rule__TurnLeft__Group__1__Impl"
    // InternalTaskDSL.g:1644:1: rule__TurnLeft__Group__1__Impl : ( ( rule__TurnLeft__DegreesAssignment_1 ) ) ;
    public final void rule__TurnLeft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1648:1: ( ( ( rule__TurnLeft__DegreesAssignment_1 ) ) )
            // InternalTaskDSL.g:1649:1: ( ( rule__TurnLeft__DegreesAssignment_1 ) )
            {
            // InternalTaskDSL.g:1649:1: ( ( rule__TurnLeft__DegreesAssignment_1 ) )
            // InternalTaskDSL.g:1650:2: ( rule__TurnLeft__DegreesAssignment_1 )
            {
             before(grammarAccess.getTurnLeftAccess().getDegreesAssignment_1()); 
            // InternalTaskDSL.g:1651:2: ( rule__TurnLeft__DegreesAssignment_1 )
            // InternalTaskDSL.g:1651:3: rule__TurnLeft__DegreesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TurnLeft__DegreesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnLeftAccess().getDegreesAssignment_1()); 

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
    // $ANTLR end "rule__TurnLeft__Group__1__Impl"


    // $ANTLR start "rule__TurnLeft__Group__2"
    // InternalTaskDSL.g:1659:1: rule__TurnLeft__Group__2 : rule__TurnLeft__Group__2__Impl ;
    public final void rule__TurnLeft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1663:1: ( rule__TurnLeft__Group__2__Impl )
            // InternalTaskDSL.g:1664:2: rule__TurnLeft__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__2__Impl();

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
    // $ANTLR end "rule__TurnLeft__Group__2"


    // $ANTLR start "rule__TurnLeft__Group__2__Impl"
    // InternalTaskDSL.g:1670:1: rule__TurnLeft__Group__2__Impl : ( 'degrees' ) ;
    public final void rule__TurnLeft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1674:1: ( ( 'degrees' ) )
            // InternalTaskDSL.g:1675:1: ( 'degrees' )
            {
            // InternalTaskDSL.g:1675:1: ( 'degrees' )
            // InternalTaskDSL.g:1676:2: 'degrees'
            {
             before(grammarAccess.getTurnLeftAccess().getDegreesKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTurnLeftAccess().getDegreesKeyword_2()); 

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
    // $ANTLR end "rule__TurnLeft__Group__2__Impl"


    // $ANTLR start "rule__TurnRight__Group__0"
    // InternalTaskDSL.g:1686:1: rule__TurnRight__Group__0 : rule__TurnRight__Group__0__Impl rule__TurnRight__Group__1 ;
    public final void rule__TurnRight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1690:1: ( rule__TurnRight__Group__0__Impl rule__TurnRight__Group__1 )
            // InternalTaskDSL.g:1691:2: rule__TurnRight__Group__0__Impl rule__TurnRight__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__TurnRight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__1();

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
    // $ANTLR end "rule__TurnRight__Group__0"


    // $ANTLR start "rule__TurnRight__Group__0__Impl"
    // InternalTaskDSL.g:1698:1: rule__TurnRight__Group__0__Impl : ( 'TurnRight' ) ;
    public final void rule__TurnRight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1702:1: ( ( 'TurnRight' ) )
            // InternalTaskDSL.g:1703:1: ( 'TurnRight' )
            {
            // InternalTaskDSL.g:1703:1: ( 'TurnRight' )
            // InternalTaskDSL.g:1704:2: 'TurnRight'
            {
             before(grammarAccess.getTurnRightAccess().getTurnRightKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTurnRightAccess().getTurnRightKeyword_0()); 

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
    // $ANTLR end "rule__TurnRight__Group__0__Impl"


    // $ANTLR start "rule__TurnRight__Group__1"
    // InternalTaskDSL.g:1713:1: rule__TurnRight__Group__1 : rule__TurnRight__Group__1__Impl rule__TurnRight__Group__2 ;
    public final void rule__TurnRight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1717:1: ( rule__TurnRight__Group__1__Impl rule__TurnRight__Group__2 )
            // InternalTaskDSL.g:1718:2: rule__TurnRight__Group__1__Impl rule__TurnRight__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__TurnRight__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__2();

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
    // $ANTLR end "rule__TurnRight__Group__1"


    // $ANTLR start "rule__TurnRight__Group__1__Impl"
    // InternalTaskDSL.g:1725:1: rule__TurnRight__Group__1__Impl : ( ( rule__TurnRight__DegreesAssignment_1 ) ) ;
    public final void rule__TurnRight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1729:1: ( ( ( rule__TurnRight__DegreesAssignment_1 ) ) )
            // InternalTaskDSL.g:1730:1: ( ( rule__TurnRight__DegreesAssignment_1 ) )
            {
            // InternalTaskDSL.g:1730:1: ( ( rule__TurnRight__DegreesAssignment_1 ) )
            // InternalTaskDSL.g:1731:2: ( rule__TurnRight__DegreesAssignment_1 )
            {
             before(grammarAccess.getTurnRightAccess().getDegreesAssignment_1()); 
            // InternalTaskDSL.g:1732:2: ( rule__TurnRight__DegreesAssignment_1 )
            // InternalTaskDSL.g:1732:3: rule__TurnRight__DegreesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TurnRight__DegreesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnRightAccess().getDegreesAssignment_1()); 

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
    // $ANTLR end "rule__TurnRight__Group__1__Impl"


    // $ANTLR start "rule__TurnRight__Group__2"
    // InternalTaskDSL.g:1740:1: rule__TurnRight__Group__2 : rule__TurnRight__Group__2__Impl ;
    public final void rule__TurnRight__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1744:1: ( rule__TurnRight__Group__2__Impl )
            // InternalTaskDSL.g:1745:2: rule__TurnRight__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__2__Impl();

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
    // $ANTLR end "rule__TurnRight__Group__2"


    // $ANTLR start "rule__TurnRight__Group__2__Impl"
    // InternalTaskDSL.g:1751:1: rule__TurnRight__Group__2__Impl : ( 'degrees' ) ;
    public final void rule__TurnRight__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1755:1: ( ( 'degrees' ) )
            // InternalTaskDSL.g:1756:1: ( 'degrees' )
            {
            // InternalTaskDSL.g:1756:1: ( 'degrees' )
            // InternalTaskDSL.g:1757:2: 'degrees'
            {
             before(grammarAccess.getTurnRightAccess().getDegreesKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTurnRightAccess().getDegreesKeyword_2()); 

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
    // $ANTLR end "rule__TurnRight__Group__2__Impl"


    // $ANTLR start "rule__DSL__MissionsAssignment_0"
    // InternalTaskDSL.g:1767:1: rule__DSL__MissionsAssignment_0 : ( ruleMission ) ;
    public final void rule__DSL__MissionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1771:1: ( ( ruleMission ) )
            // InternalTaskDSL.g:1772:2: ( ruleMission )
            {
            // InternalTaskDSL.g:1772:2: ( ruleMission )
            // InternalTaskDSL.g:1773:3: ruleMission
            {
             before(grammarAccess.getDSLAccess().getMissionsMissionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getDSLAccess().getMissionsMissionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DSL__MissionsAssignment_0"


    // $ANTLR start "rule__DSL__TasksAssignment_1"
    // InternalTaskDSL.g:1782:1: rule__DSL__TasksAssignment_1 : ( ruleTask ) ;
    public final void rule__DSL__TasksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1786:1: ( ( ruleTask ) )
            // InternalTaskDSL.g:1787:2: ( ruleTask )
            {
            // InternalTaskDSL.g:1787:2: ( ruleTask )
            // InternalTaskDSL.g:1788:3: ruleTask
            {
             before(grammarAccess.getDSLAccess().getTasksTaskParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getDSLAccess().getTasksTaskParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DSL__TasksAssignment_1"


    // $ANTLR start "rule__Mission__NameAssignment_1"
    // InternalTaskDSL.g:1797:1: rule__Mission__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mission__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1801:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:1802:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:1802:2: ( RULE_ID )
            // InternalTaskDSL.g:1803:3: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Mission__NameAssignment_1"


    // $ANTLR start "rule__Mission__TasksAssignment_3"
    // InternalTaskDSL.g:1812:1: rule__Mission__TasksAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Mission__TasksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1816:1: ( ( ( RULE_ID ) ) )
            // InternalTaskDSL.g:1817:2: ( ( RULE_ID ) )
            {
            // InternalTaskDSL.g:1817:2: ( ( RULE_ID ) )
            // InternalTaskDSL.g:1818:3: ( RULE_ID )
            {
             before(grammarAccess.getMissionAccess().getTasksTaskCrossReference_3_0()); 
            // InternalTaskDSL.g:1819:3: ( RULE_ID )
            // InternalTaskDSL.g:1820:4: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getTasksTaskIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTasksTaskIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMissionAccess().getTasksTaskCrossReference_3_0()); 

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
    // $ANTLR end "rule__Mission__TasksAssignment_3"


    // $ANTLR start "rule__Task__NameAssignment_1"
    // InternalTaskDSL.g:1831:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1835:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:1836:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:1836:2: ( RULE_ID )
            // InternalTaskDSL.g:1837:3: RULE_ID
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
    // InternalTaskDSL.g:1846:1: rule__Task__ActionAssignment_2 : ( ruleAction ) ;
    public final void rule__Task__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1850:1: ( ( ruleAction ) )
            // InternalTaskDSL.g:1851:2: ( ruleAction )
            {
            // InternalTaskDSL.g:1851:2: ( ruleAction )
            // InternalTaskDSL.g:1852:3: ruleAction
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
    // InternalTaskDSL.g:1861:1: rule__Task__DetectorAssignment_3 : ( ruleDetector ) ;
    public final void rule__Task__DetectorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1865:1: ( ( ruleDetector ) )
            // InternalTaskDSL.g:1866:2: ( ruleDetector )
            {
            // InternalTaskDSL.g:1866:2: ( ruleDetector )
            // InternalTaskDSL.g:1867:3: ruleDetector
            {
             before(grammarAccess.getTaskAccess().getDetectorDetectorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDetector();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDetectorDetectorParserRuleCall_3_0()); 

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


    // $ANTLR start "rule__Detector__AvoidersAssignment_1"
    // InternalTaskDSL.g:1876:1: rule__Detector__AvoidersAssignment_1 : ( ruleAvoid ) ;
    public final void rule__Detector__AvoidersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1880:1: ( ( ruleAvoid ) )
            // InternalTaskDSL.g:1881:2: ( ruleAvoid )
            {
            // InternalTaskDSL.g:1881:2: ( ruleAvoid )
            // InternalTaskDSL.g:1882:3: ruleAvoid
            {
             before(grammarAccess.getDetectorAccess().getAvoidersAvoidParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAvoid();

            state._fsp--;

             after(grammarAccess.getDetectorAccess().getAvoidersAvoidParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Detector__AvoidersAssignment_1"


    // $ANTLR start "rule__DriveUntil__SpeedAssignment_1"
    // InternalTaskDSL.g:1891:1: rule__DriveUntil__SpeedAssignment_1 : ( ruleSpeed ) ;
    public final void rule__DriveUntil__SpeedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1895:1: ( ( ruleSpeed ) )
            // InternalTaskDSL.g:1896:2: ( ruleSpeed )
            {
            // InternalTaskDSL.g:1896:2: ( ruleSpeed )
            // InternalTaskDSL.g:1897:3: ruleSpeed
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
    // InternalTaskDSL.g:1906:1: rule__DriveUntil__ColorAssignment_3 : ( ruleColor ) ;
    public final void rule__DriveUntil__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1910:1: ( ( ruleColor ) )
            // InternalTaskDSL.g:1911:2: ( ruleColor )
            {
            // InternalTaskDSL.g:1911:2: ( ruleColor )
            // InternalTaskDSL.g:1912:3: ruleColor
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
    // InternalTaskDSL.g:1921:1: rule__DriveUntil__ObjectAssignment_4 : ( ruleObject ) ;
    public final void rule__DriveUntil__ObjectAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1925:1: ( ( ruleObject ) )
            // InternalTaskDSL.g:1926:2: ( ruleObject )
            {
            // InternalTaskDSL.g:1926:2: ( ruleObject )
            // InternalTaskDSL.g:1927:3: ruleObject
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
    // InternalTaskDSL.g:1936:1: rule__Investigate__SpeedAssignment_1 : ( ruleSpeed ) ;
    public final void rule__Investigate__SpeedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1940:1: ( ( ruleSpeed ) )
            // InternalTaskDSL.g:1941:2: ( ruleSpeed )
            {
            // InternalTaskDSL.g:1941:2: ( ruleSpeed )
            // InternalTaskDSL.g:1942:3: ruleSpeed
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
    // InternalTaskDSL.g:1951:1: rule__Speak__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Speak__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1955:1: ( ( RULE_STRING ) )
            // InternalTaskDSL.g:1956:2: ( RULE_STRING )
            {
            // InternalTaskDSL.g:1956:2: ( RULE_STRING )
            // InternalTaskDSL.g:1957:3: RULE_STRING
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
    // InternalTaskDSL.g:1966:1: rule__FollowLine__DistanceAssignment_1 : ( RULE_INT ) ;
    public final void rule__FollowLine__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1970:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:1971:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:1971:2: ( RULE_INT )
            // InternalTaskDSL.g:1972:3: RULE_INT
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
    // InternalTaskDSL.g:1981:1: rule__Avoid__ColorAssignment_1 : ( ruleColor ) ;
    public final void rule__Avoid__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1985:1: ( ( ruleColor ) )
            // InternalTaskDSL.g:1986:2: ( ruleColor )
            {
            // InternalTaskDSL.g:1986:2: ( ruleColor )
            // InternalTaskDSL.g:1987:3: ruleColor
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
    // InternalTaskDSL.g:1996:1: rule__Avoid__ObjectAssignment_2 : ( ruleObject ) ;
    public final void rule__Avoid__ObjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2000:1: ( ( ruleObject ) )
            // InternalTaskDSL.g:2001:2: ( ruleObject )
            {
            // InternalTaskDSL.g:2001:2: ( ruleObject )
            // InternalTaskDSL.g:2002:3: ruleObject
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


    // $ANTLR start "rule__Avoid__DriveActionsAssignment_4"
    // InternalTaskDSL.g:2011:1: rule__Avoid__DriveActionsAssignment_4 : ( ruleDriveAction ) ;
    public final void rule__Avoid__DriveActionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2015:1: ( ( ruleDriveAction ) )
            // InternalTaskDSL.g:2016:2: ( ruleDriveAction )
            {
            // InternalTaskDSL.g:2016:2: ( ruleDriveAction )
            // InternalTaskDSL.g:2017:3: ruleDriveAction
            {
             before(grammarAccess.getAvoidAccess().getDriveActionsDriveActionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDriveAction();

            state._fsp--;

             after(grammarAccess.getAvoidAccess().getDriveActionsDriveActionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Avoid__DriveActionsAssignment_4"


    // $ANTLR start "rule__MoveBack__MetersAssignment_1"
    // InternalTaskDSL.g:2026:1: rule__MoveBack__MetersAssignment_1 : ( RULE_INT ) ;
    public final void rule__MoveBack__MetersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2030:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:2031:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:2031:2: ( RULE_INT )
            // InternalTaskDSL.g:2032:3: RULE_INT
            {
             before(grammarAccess.getMoveBackAccess().getMetersINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMoveBackAccess().getMetersINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MoveBack__MetersAssignment_1"


    // $ANTLR start "rule__TurnLeft__DegreesAssignment_1"
    // InternalTaskDSL.g:2041:1: rule__TurnLeft__DegreesAssignment_1 : ( RULE_INT ) ;
    public final void rule__TurnLeft__DegreesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2045:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:2046:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:2046:2: ( RULE_INT )
            // InternalTaskDSL.g:2047:3: RULE_INT
            {
             before(grammarAccess.getTurnLeftAccess().getDegreesINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTurnLeftAccess().getDegreesINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TurnLeft__DegreesAssignment_1"


    // $ANTLR start "rule__TurnRight__DegreesAssignment_1"
    // InternalTaskDSL.g:2056:1: rule__TurnRight__DegreesAssignment_1 : ( RULE_INT ) ;
    public final void rule__TurnRight__DegreesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2060:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:2061:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:2061:2: ( RULE_INT )
            // InternalTaskDSL.g:2062:3: RULE_INT
            {
             before(grammarAccess.getTurnRightAccess().getDegreesINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTurnRightAccess().getDegreesINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TurnRight__DegreesAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000038400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000200E000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000071800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002C00000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002C00000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});

}