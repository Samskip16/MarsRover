package mars.ru.des.robot.parser.antlr.internal;

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
import mars.ru.des.robot.services.TaskDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Task:'", "'action:'", "'detectors:'", "'Drive'", "'Until'", "'Found'", "'Investigate'", "'Speak'", "'FindAndFollowLineFor'", "'meters'", "'Avoid'", "'By'", "'and'", "'MoveBackwards'", "'Turn'", "'degrees'", "'ROCK'", "'LAKE'", "'FAST'", "'NORMAL'", "'SLOW'", "'RED'", "'GREEN'", "'BLUE'"
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

        public InternalTaskDSLParser(TokenStream input, TaskDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Task";
       	}

       	@Override
       	protected TaskDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTask"
    // InternalTaskDSL.g:65:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalTaskDSL.g:65:45: (iv_ruleTask= ruleTask EOF )
            // InternalTaskDSL.g:66:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalTaskDSL.g:72:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_action_2_0= ruleAction ) ) ( (lv_detector_3_0= ruleDetectors ) )? ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_action_2_0 = null;

        EObject lv_detector_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:78:2: ( (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_action_2_0= ruleAction ) ) ( (lv_detector_3_0= ruleDetectors ) )? ) )
            // InternalTaskDSL.g:79:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_action_2_0= ruleAction ) ) ( (lv_detector_3_0= ruleDetectors ) )? )
            {
            // InternalTaskDSL.g:79:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_action_2_0= ruleAction ) ) ( (lv_detector_3_0= ruleDetectors ) )? )
            // InternalTaskDSL.g:80:3: otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_action_2_0= ruleAction ) ) ( (lv_detector_3_0= ruleDetectors ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalTaskDSL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDSL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDSL.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTaskDSL.g:102:3: ( (lv_action_2_0= ruleAction ) )
            // InternalTaskDSL.g:103:4: (lv_action_2_0= ruleAction )
            {
            // InternalTaskDSL.g:103:4: (lv_action_2_0= ruleAction )
            // InternalTaskDSL.g:104:5: lv_action_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getActionActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_action_2_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_2_0,
            						"mars.ru.des.robot.TaskDSL.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTaskDSL.g:121:3: ( (lv_detector_3_0= ruleDetectors ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTaskDSL.g:122:4: (lv_detector_3_0= ruleDetectors )
                    {
                    // InternalTaskDSL.g:122:4: (lv_detector_3_0= ruleDetectors )
                    // InternalTaskDSL.g:123:5: lv_detector_3_0= ruleDetectors
                    {

                    					newCompositeNode(grammarAccess.getTaskAccess().getDetectorDetectorsParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_detector_3_0=ruleDetectors();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskRule());
                    					}
                    					set(
                    						current,
                    						"detector",
                    						lv_detector_3_0,
                    						"mars.ru.des.robot.TaskDSL.Detectors");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleAction"
    // InternalTaskDSL.g:144:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalTaskDSL.g:144:47: (iv_ruleAction= ruleAction EOF )
            // InternalTaskDSL.g:145:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalTaskDSL.g:151:1: ruleAction returns [EObject current=null] : ( (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil ) | this_Investigate_2= ruleInvestigate | this_Speak_3= ruleSpeak | this_FollowLine_4= ruleFollowLine ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DriveUntil_1 = null;

        EObject this_Investigate_2 = null;

        EObject this_Speak_3 = null;

        EObject this_FollowLine_4 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:157:2: ( ( (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil ) | this_Investigate_2= ruleInvestigate | this_Speak_3= ruleSpeak | this_FollowLine_4= ruleFollowLine ) )
            // InternalTaskDSL.g:158:2: ( (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil ) | this_Investigate_2= ruleInvestigate | this_Speak_3= ruleSpeak | this_FollowLine_4= ruleFollowLine )
            {
            // InternalTaskDSL.g:158:2: ( (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil ) | this_Investigate_2= ruleInvestigate | this_Speak_3= ruleSpeak | this_FollowLine_4= ruleFollowLine )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTaskDSL.g:159:3: (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil )
                    {
                    // InternalTaskDSL.g:159:3: (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil )
                    // InternalTaskDSL.g:160:4: otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getActionAccess().getDriveUntilParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_DriveUntil_1=ruleDriveUntil();

                    state._fsp--;


                    				current = this_DriveUntil_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:174:3: this_Investigate_2= ruleInvestigate
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getInvestigateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Investigate_2=ruleInvestigate();

                    state._fsp--;


                    			current = this_Investigate_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:183:3: this_Speak_3= ruleSpeak
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSpeakParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Speak_3=ruleSpeak();

                    state._fsp--;


                    			current = this_Speak_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:192:3: this_FollowLine_4= ruleFollowLine
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getFollowLineParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FollowLine_4=ruleFollowLine();

                    state._fsp--;


                    			current = this_FollowLine_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleDetectors"
    // InternalTaskDSL.g:204:1: entryRuleDetectors returns [EObject current=null] : iv_ruleDetectors= ruleDetectors EOF ;
    public final EObject entryRuleDetectors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetectors = null;


        try {
            // InternalTaskDSL.g:204:50: (iv_ruleDetectors= ruleDetectors EOF )
            // InternalTaskDSL.g:205:2: iv_ruleDetectors= ruleDetectors EOF
            {
             newCompositeNode(grammarAccess.getDetectorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDetectors=ruleDetectors();

            state._fsp--;

             current =iv_ruleDetectors; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDetectors"


    // $ANTLR start "ruleDetectors"
    // InternalTaskDSL.g:211:1: ruleDetectors returns [EObject current=null] : (otherlv_0= 'detectors:' ( (lv_avoids_1_0= ruleAvoid ) )+ ) ;
    public final EObject ruleDetectors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_avoids_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:217:2: ( (otherlv_0= 'detectors:' ( (lv_avoids_1_0= ruleAvoid ) )+ ) )
            // InternalTaskDSL.g:218:2: (otherlv_0= 'detectors:' ( (lv_avoids_1_0= ruleAvoid ) )+ )
            {
            // InternalTaskDSL.g:218:2: (otherlv_0= 'detectors:' ( (lv_avoids_1_0= ruleAvoid ) )+ )
            // InternalTaskDSL.g:219:3: otherlv_0= 'detectors:' ( (lv_avoids_1_0= ruleAvoid ) )+
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDetectorsAccess().getDetectorsKeyword_0());
            		
            // InternalTaskDSL.g:223:3: ( (lv_avoids_1_0= ruleAvoid ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTaskDSL.g:224:4: (lv_avoids_1_0= ruleAvoid )
            	    {
            	    // InternalTaskDSL.g:224:4: (lv_avoids_1_0= ruleAvoid )
            	    // InternalTaskDSL.g:225:5: lv_avoids_1_0= ruleAvoid
            	    {

            	    					newCompositeNode(grammarAccess.getDetectorsAccess().getAvoidsAvoidParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_avoids_1_0=ruleAvoid();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDetectorsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"avoids",
            	    						lv_avoids_1_0,
            	    						"mars.ru.des.robot.TaskDSL.Avoid");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDetectors"


    // $ANTLR start "entryRuleDriveUntil"
    // InternalTaskDSL.g:246:1: entryRuleDriveUntil returns [EObject current=null] : iv_ruleDriveUntil= ruleDriveUntil EOF ;
    public final EObject entryRuleDriveUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriveUntil = null;


        try {
            // InternalTaskDSL.g:246:51: (iv_ruleDriveUntil= ruleDriveUntil EOF )
            // InternalTaskDSL.g:247:2: iv_ruleDriveUntil= ruleDriveUntil EOF
            {
             newCompositeNode(grammarAccess.getDriveUntilRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDriveUntil=ruleDriveUntil();

            state._fsp--;

             current =iv_ruleDriveUntil; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDriveUntil"


    // $ANTLR start "ruleDriveUntil"
    // InternalTaskDSL.g:253:1: ruleDriveUntil returns [EObject current=null] : (otherlv_0= 'Drive' ( (lv_speed_1_0= ruleSpeed ) )? otherlv_2= 'Until' ( (lv_color_3_0= ruleColor ) )? ( (lv_object_4_0= ruleObject ) ) otherlv_5= 'Found' ) ;
    public final EObject ruleDriveUntil() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Enumerator lv_speed_1_0 = null;

        Enumerator lv_color_3_0 = null;

        Enumerator lv_object_4_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:259:2: ( (otherlv_0= 'Drive' ( (lv_speed_1_0= ruleSpeed ) )? otherlv_2= 'Until' ( (lv_color_3_0= ruleColor ) )? ( (lv_object_4_0= ruleObject ) ) otherlv_5= 'Found' ) )
            // InternalTaskDSL.g:260:2: (otherlv_0= 'Drive' ( (lv_speed_1_0= ruleSpeed ) )? otherlv_2= 'Until' ( (lv_color_3_0= ruleColor ) )? ( (lv_object_4_0= ruleObject ) ) otherlv_5= 'Found' )
            {
            // InternalTaskDSL.g:260:2: (otherlv_0= 'Drive' ( (lv_speed_1_0= ruleSpeed ) )? otherlv_2= 'Until' ( (lv_color_3_0= ruleColor ) )? ( (lv_object_4_0= ruleObject ) ) otherlv_5= 'Found' )
            // InternalTaskDSL.g:261:3: otherlv_0= 'Drive' ( (lv_speed_1_0= ruleSpeed ) )? otherlv_2= 'Until' ( (lv_color_3_0= ruleColor ) )? ( (lv_object_4_0= ruleObject ) ) otherlv_5= 'Found'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDriveUntilAccess().getDriveKeyword_0());
            		
            // InternalTaskDSL.g:265:3: ( (lv_speed_1_0= ruleSpeed ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=29 && LA4_0<=31)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTaskDSL.g:266:4: (lv_speed_1_0= ruleSpeed )
                    {
                    // InternalTaskDSL.g:266:4: (lv_speed_1_0= ruleSpeed )
                    // InternalTaskDSL.g:267:5: lv_speed_1_0= ruleSpeed
                    {

                    					newCompositeNode(grammarAccess.getDriveUntilAccess().getSpeedSpeedEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_speed_1_0=ruleSpeed();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDriveUntilRule());
                    					}
                    					set(
                    						current,
                    						"speed",
                    						lv_speed_1_0,
                    						"mars.ru.des.robot.TaskDSL.Speed");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDriveUntilAccess().getUntilKeyword_2());
            		
            // InternalTaskDSL.g:288:3: ( (lv_color_3_0= ruleColor ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=32 && LA5_0<=34)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTaskDSL.g:289:4: (lv_color_3_0= ruleColor )
                    {
                    // InternalTaskDSL.g:289:4: (lv_color_3_0= ruleColor )
                    // InternalTaskDSL.g:290:5: lv_color_3_0= ruleColor
                    {

                    					newCompositeNode(grammarAccess.getDriveUntilAccess().getColorColorEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_color_3_0=ruleColor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDriveUntilRule());
                    					}
                    					set(
                    						current,
                    						"color",
                    						lv_color_3_0,
                    						"mars.ru.des.robot.TaskDSL.Color");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTaskDSL.g:307:3: ( (lv_object_4_0= ruleObject ) )
            // InternalTaskDSL.g:308:4: (lv_object_4_0= ruleObject )
            {
            // InternalTaskDSL.g:308:4: (lv_object_4_0= ruleObject )
            // InternalTaskDSL.g:309:5: lv_object_4_0= ruleObject
            {

            					newCompositeNode(grammarAccess.getDriveUntilAccess().getObjectObjectEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_object_4_0=ruleObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDriveUntilRule());
            					}
            					set(
            						current,
            						"object",
            						lv_object_4_0,
            						"mars.ru.des.robot.TaskDSL.Object");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDriveUntilAccess().getFoundKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDriveUntil"


    // $ANTLR start "entryRuleInvestigate"
    // InternalTaskDSL.g:334:1: entryRuleInvestigate returns [EObject current=null] : iv_ruleInvestigate= ruleInvestigate EOF ;
    public final EObject entryRuleInvestigate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvestigate = null;


        try {
            // InternalTaskDSL.g:334:52: (iv_ruleInvestigate= ruleInvestigate EOF )
            // InternalTaskDSL.g:335:2: iv_ruleInvestigate= ruleInvestigate EOF
            {
             newCompositeNode(grammarAccess.getInvestigateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvestigate=ruleInvestigate();

            state._fsp--;

             current =iv_ruleInvestigate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvestigate"


    // $ANTLR start "ruleInvestigate"
    // InternalTaskDSL.g:341:1: ruleInvestigate returns [EObject current=null] : (otherlv_0= 'Investigate' ( (lv_speed_1_0= ruleSpeed ) ) ) ;
    public final EObject ruleInvestigate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_speed_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:347:2: ( (otherlv_0= 'Investigate' ( (lv_speed_1_0= ruleSpeed ) ) ) )
            // InternalTaskDSL.g:348:2: (otherlv_0= 'Investigate' ( (lv_speed_1_0= ruleSpeed ) ) )
            {
            // InternalTaskDSL.g:348:2: (otherlv_0= 'Investigate' ( (lv_speed_1_0= ruleSpeed ) ) )
            // InternalTaskDSL.g:349:3: otherlv_0= 'Investigate' ( (lv_speed_1_0= ruleSpeed ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getInvestigateAccess().getInvestigateKeyword_0());
            		
            // InternalTaskDSL.g:353:3: ( (lv_speed_1_0= ruleSpeed ) )
            // InternalTaskDSL.g:354:4: (lv_speed_1_0= ruleSpeed )
            {
            // InternalTaskDSL.g:354:4: (lv_speed_1_0= ruleSpeed )
            // InternalTaskDSL.g:355:5: lv_speed_1_0= ruleSpeed
            {

            					newCompositeNode(grammarAccess.getInvestigateAccess().getSpeedSpeedEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_speed_1_0=ruleSpeed();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInvestigateRule());
            					}
            					set(
            						current,
            						"speed",
            						lv_speed_1_0,
            						"mars.ru.des.robot.TaskDSL.Speed");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvestigate"


    // $ANTLR start "entryRuleSpeak"
    // InternalTaskDSL.g:376:1: entryRuleSpeak returns [EObject current=null] : iv_ruleSpeak= ruleSpeak EOF ;
    public final EObject entryRuleSpeak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeak = null;


        try {
            // InternalTaskDSL.g:376:46: (iv_ruleSpeak= ruleSpeak EOF )
            // InternalTaskDSL.g:377:2: iv_ruleSpeak= ruleSpeak EOF
            {
             newCompositeNode(grammarAccess.getSpeakRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpeak=ruleSpeak();

            state._fsp--;

             current =iv_ruleSpeak; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpeak"


    // $ANTLR start "ruleSpeak"
    // InternalTaskDSL.g:383:1: ruleSpeak returns [EObject current=null] : (otherlv_0= 'Speak' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSpeak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:389:2: ( (otherlv_0= 'Speak' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalTaskDSL.g:390:2: (otherlv_0= 'Speak' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalTaskDSL.g:390:2: (otherlv_0= 'Speak' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalTaskDSL.g:391:3: otherlv_0= 'Speak' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSpeakAccess().getSpeakKeyword_0());
            		
            // InternalTaskDSL.g:395:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalTaskDSL.g:396:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalTaskDSL.g:396:4: (lv_text_1_0= RULE_STRING )
            // InternalTaskDSL.g:397:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getSpeakAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpeakRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpeak"


    // $ANTLR start "entryRuleFollowLine"
    // InternalTaskDSL.g:417:1: entryRuleFollowLine returns [EObject current=null] : iv_ruleFollowLine= ruleFollowLine EOF ;
    public final EObject entryRuleFollowLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowLine = null;


        try {
            // InternalTaskDSL.g:417:51: (iv_ruleFollowLine= ruleFollowLine EOF )
            // InternalTaskDSL.g:418:2: iv_ruleFollowLine= ruleFollowLine EOF
            {
             newCompositeNode(grammarAccess.getFollowLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFollowLine=ruleFollowLine();

            state._fsp--;

             current =iv_ruleFollowLine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFollowLine"


    // $ANTLR start "ruleFollowLine"
    // InternalTaskDSL.g:424:1: ruleFollowLine returns [EObject current=null] : (otherlv_0= 'FindAndFollowLineFor' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' ) ;
    public final EObject ruleFollowLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_distance_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:430:2: ( (otherlv_0= 'FindAndFollowLineFor' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' ) )
            // InternalTaskDSL.g:431:2: (otherlv_0= 'FindAndFollowLineFor' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' )
            {
            // InternalTaskDSL.g:431:2: (otherlv_0= 'FindAndFollowLineFor' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' )
            // InternalTaskDSL.g:432:3: otherlv_0= 'FindAndFollowLineFor' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getFollowLineAccess().getFindAndFollowLineForKeyword_0());
            		
            // InternalTaskDSL.g:436:3: ( (lv_distance_1_0= RULE_INT ) )
            // InternalTaskDSL.g:437:4: (lv_distance_1_0= RULE_INT )
            {
            // InternalTaskDSL.g:437:4: (lv_distance_1_0= RULE_INT )
            // InternalTaskDSL.g:438:5: lv_distance_1_0= RULE_INT
            {
            lv_distance_1_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_distance_1_0, grammarAccess.getFollowLineAccess().getDistanceINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFollowLineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFollowLineAccess().getMetersKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFollowLine"


    // $ANTLR start "entryRuleAvoid"
    // InternalTaskDSL.g:462:1: entryRuleAvoid returns [EObject current=null] : iv_ruleAvoid= ruleAvoid EOF ;
    public final EObject entryRuleAvoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvoid = null;


        try {
            // InternalTaskDSL.g:462:46: (iv_ruleAvoid= ruleAvoid EOF )
            // InternalTaskDSL.g:463:2: iv_ruleAvoid= ruleAvoid EOF
            {
             newCompositeNode(grammarAccess.getAvoidRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAvoid=ruleAvoid();

            state._fsp--;

             current =iv_ruleAvoid; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAvoid"


    // $ANTLR start "ruleAvoid"
    // InternalTaskDSL.g:469:1: ruleAvoid returns [EObject current=null] : (otherlv_0= 'Avoid' ( (lv_color_1_0= ruleColor ) )? ( (lv_object_2_0= ruleObject ) ) otherlv_3= 'By' ( (lv_avoidActions_4_0= ruleAvoidAction ) )+ ) ;
    public final EObject ruleAvoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_color_1_0 = null;

        Enumerator lv_object_2_0 = null;

        EObject lv_avoidActions_4_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:475:2: ( (otherlv_0= 'Avoid' ( (lv_color_1_0= ruleColor ) )? ( (lv_object_2_0= ruleObject ) ) otherlv_3= 'By' ( (lv_avoidActions_4_0= ruleAvoidAction ) )+ ) )
            // InternalTaskDSL.g:476:2: (otherlv_0= 'Avoid' ( (lv_color_1_0= ruleColor ) )? ( (lv_object_2_0= ruleObject ) ) otherlv_3= 'By' ( (lv_avoidActions_4_0= ruleAvoidAction ) )+ )
            {
            // InternalTaskDSL.g:476:2: (otherlv_0= 'Avoid' ( (lv_color_1_0= ruleColor ) )? ( (lv_object_2_0= ruleObject ) ) otherlv_3= 'By' ( (lv_avoidActions_4_0= ruleAvoidAction ) )+ )
            // InternalTaskDSL.g:477:3: otherlv_0= 'Avoid' ( (lv_color_1_0= ruleColor ) )? ( (lv_object_2_0= ruleObject ) ) otherlv_3= 'By' ( (lv_avoidActions_4_0= ruleAvoidAction ) )+
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAvoidAccess().getAvoidKeyword_0());
            		
            // InternalTaskDSL.g:481:3: ( (lv_color_1_0= ruleColor ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=32 && LA6_0<=34)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTaskDSL.g:482:4: (lv_color_1_0= ruleColor )
                    {
                    // InternalTaskDSL.g:482:4: (lv_color_1_0= ruleColor )
                    // InternalTaskDSL.g:483:5: lv_color_1_0= ruleColor
                    {

                    					newCompositeNode(grammarAccess.getAvoidAccess().getColorColorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_color_1_0=ruleColor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAvoidRule());
                    					}
                    					set(
                    						current,
                    						"color",
                    						lv_color_1_0,
                    						"mars.ru.des.robot.TaskDSL.Color");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTaskDSL.g:500:3: ( (lv_object_2_0= ruleObject ) )
            // InternalTaskDSL.g:501:4: (lv_object_2_0= ruleObject )
            {
            // InternalTaskDSL.g:501:4: (lv_object_2_0= ruleObject )
            // InternalTaskDSL.g:502:5: lv_object_2_0= ruleObject
            {

            					newCompositeNode(grammarAccess.getAvoidAccess().getObjectObjectEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_object_2_0=ruleObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAvoidRule());
            					}
            					set(
            						current,
            						"object",
            						lv_object_2_0,
            						"mars.ru.des.robot.TaskDSL.Object");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getAvoidAccess().getByKeyword_3());
            		
            // InternalTaskDSL.g:523:3: ( (lv_avoidActions_4_0= ruleAvoidAction ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=24 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTaskDSL.g:524:4: (lv_avoidActions_4_0= ruleAvoidAction )
            	    {
            	    // InternalTaskDSL.g:524:4: (lv_avoidActions_4_0= ruleAvoidAction )
            	    // InternalTaskDSL.g:525:5: lv_avoidActions_4_0= ruleAvoidAction
            	    {

            	    					newCompositeNode(grammarAccess.getAvoidAccess().getAvoidActionsAvoidActionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_avoidActions_4_0=ruleAvoidAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAvoidRule());
            	    					}
            	    					add(
            	    						current,
            	    						"avoidActions",
            	    						lv_avoidActions_4_0,
            	    						"mars.ru.des.robot.TaskDSL.AvoidAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAvoid"


    // $ANTLR start "entryRuleAvoidAction"
    // InternalTaskDSL.g:546:1: entryRuleAvoidAction returns [EObject current=null] : iv_ruleAvoidAction= ruleAvoidAction EOF ;
    public final EObject entryRuleAvoidAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvoidAction = null;


        try {
            // InternalTaskDSL.g:546:52: (iv_ruleAvoidAction= ruleAvoidAction EOF )
            // InternalTaskDSL.g:547:2: iv_ruleAvoidAction= ruleAvoidAction EOF
            {
             newCompositeNode(grammarAccess.getAvoidActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAvoidAction=ruleAvoidAction();

            state._fsp--;

             current =iv_ruleAvoidAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAvoidAction"


    // $ANTLR start "ruleAvoidAction"
    // InternalTaskDSL.g:553:1: ruleAvoidAction returns [EObject current=null] : ( (this_MoveBack_0= ruleMoveBack | this_Turn_1= ruleTurn ) (otherlv_2= 'and' )? ) ;
    public final EObject ruleAvoidAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_MoveBack_0 = null;

        EObject this_Turn_1 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:559:2: ( ( (this_MoveBack_0= ruleMoveBack | this_Turn_1= ruleTurn ) (otherlv_2= 'and' )? ) )
            // InternalTaskDSL.g:560:2: ( (this_MoveBack_0= ruleMoveBack | this_Turn_1= ruleTurn ) (otherlv_2= 'and' )? )
            {
            // InternalTaskDSL.g:560:2: ( (this_MoveBack_0= ruleMoveBack | this_Turn_1= ruleTurn ) (otherlv_2= 'and' )? )
            // InternalTaskDSL.g:561:3: (this_MoveBack_0= ruleMoveBack | this_Turn_1= ruleTurn ) (otherlv_2= 'and' )?
            {
            // InternalTaskDSL.g:561:3: (this_MoveBack_0= ruleMoveBack | this_Turn_1= ruleTurn )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTaskDSL.g:562:4: this_MoveBack_0= ruleMoveBack
                    {

                    				newCompositeNode(grammarAccess.getAvoidActionAccess().getMoveBackParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_20);
                    this_MoveBack_0=ruleMoveBack();

                    state._fsp--;


                    				current = this_MoveBack_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:571:4: this_Turn_1= ruleTurn
                    {

                    				newCompositeNode(grammarAccess.getAvoidActionAccess().getTurnParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_20);
                    this_Turn_1=ruleTurn();

                    state._fsp--;


                    				current = this_Turn_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTaskDSL.g:580:3: (otherlv_2= 'and' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTaskDSL.g:581:4: otherlv_2= 'and'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getAvoidActionAccess().getAndKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAvoidAction"


    // $ANTLR start "entryRuleMoveBack"
    // InternalTaskDSL.g:590:1: entryRuleMoveBack returns [EObject current=null] : iv_ruleMoveBack= ruleMoveBack EOF ;
    public final EObject entryRuleMoveBack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveBack = null;


        try {
            // InternalTaskDSL.g:590:49: (iv_ruleMoveBack= ruleMoveBack EOF )
            // InternalTaskDSL.g:591:2: iv_ruleMoveBack= ruleMoveBack EOF
            {
             newCompositeNode(grammarAccess.getMoveBackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveBack=ruleMoveBack();

            state._fsp--;

             current =iv_ruleMoveBack; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoveBack"


    // $ANTLR start "ruleMoveBack"
    // InternalTaskDSL.g:597:1: ruleMoveBack returns [EObject current=null] : (otherlv_0= 'MoveBackwards' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' ) ;
    public final EObject ruleMoveBack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_distance_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:603:2: ( (otherlv_0= 'MoveBackwards' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' ) )
            // InternalTaskDSL.g:604:2: (otherlv_0= 'MoveBackwards' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' )
            {
            // InternalTaskDSL.g:604:2: (otherlv_0= 'MoveBackwards' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' )
            // InternalTaskDSL.g:605:3: otherlv_0= 'MoveBackwards' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveBackAccess().getMoveBackwardsKeyword_0());
            		
            // InternalTaskDSL.g:609:3: ( (lv_distance_1_0= RULE_INT ) )
            // InternalTaskDSL.g:610:4: (lv_distance_1_0= RULE_INT )
            {
            // InternalTaskDSL.g:610:4: (lv_distance_1_0= RULE_INT )
            // InternalTaskDSL.g:611:5: lv_distance_1_0= RULE_INT
            {
            lv_distance_1_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_distance_1_0, grammarAccess.getMoveBackAccess().getDistanceINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveBackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveBackAccess().getMetersKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoveBack"


    // $ANTLR start "entryRuleTurn"
    // InternalTaskDSL.g:635:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalTaskDSL.g:635:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalTaskDSL.g:636:2: iv_ruleTurn= ruleTurn EOF
            {
             newCompositeNode(grammarAccess.getTurnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurn=ruleTurn();

            state._fsp--;

             current =iv_ruleTurn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalTaskDSL.g:642:1: ruleTurn returns [EObject current=null] : (otherlv_0= 'Turn' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_degrees_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:648:2: ( (otherlv_0= 'Turn' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' ) )
            // InternalTaskDSL.g:649:2: (otherlv_0= 'Turn' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' )
            {
            // InternalTaskDSL.g:649:2: (otherlv_0= 'Turn' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' )
            // InternalTaskDSL.g:650:3: otherlv_0= 'Turn' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getTurnKeyword_0());
            		
            // InternalTaskDSL.g:654:3: ( (lv_degrees_1_0= RULE_INT ) )
            // InternalTaskDSL.g:655:4: (lv_degrees_1_0= RULE_INT )
            {
            // InternalTaskDSL.g:655:4: (lv_degrees_1_0= RULE_INT )
            // InternalTaskDSL.g:656:5: lv_degrees_1_0= RULE_INT
            {
            lv_degrees_1_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_degrees_1_0, grammarAccess.getTurnAccess().getDegreesINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"degrees",
            						lv_degrees_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnAccess().getDegreesKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurn"


    // $ANTLR start "ruleObject"
    // InternalTaskDSL.g:680:1: ruleObject returns [Enumerator current=null] : ( (enumLiteral_0= 'ROCK' ) | (enumLiteral_1= 'LAKE' ) ) ;
    public final Enumerator ruleObject() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:686:2: ( ( (enumLiteral_0= 'ROCK' ) | (enumLiteral_1= 'LAKE' ) ) )
            // InternalTaskDSL.g:687:2: ( (enumLiteral_0= 'ROCK' ) | (enumLiteral_1= 'LAKE' ) )
            {
            // InternalTaskDSL.g:687:2: ( (enumLiteral_0= 'ROCK' ) | (enumLiteral_1= 'LAKE' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTaskDSL.g:688:3: (enumLiteral_0= 'ROCK' )
                    {
                    // InternalTaskDSL.g:688:3: (enumLiteral_0= 'ROCK' )
                    // InternalTaskDSL.g:689:4: enumLiteral_0= 'ROCK'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getObjectAccess().getROCKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getObjectAccess().getROCKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:696:3: (enumLiteral_1= 'LAKE' )
                    {
                    // InternalTaskDSL.g:696:3: (enumLiteral_1= 'LAKE' )
                    // InternalTaskDSL.g:697:4: enumLiteral_1= 'LAKE'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getObjectAccess().getLAKEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getObjectAccess().getLAKEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "ruleSpeed"
    // InternalTaskDSL.g:707:1: ruleSpeed returns [Enumerator current=null] : ( (enumLiteral_0= 'FAST' ) | (enumLiteral_1= 'NORMAL' ) | (enumLiteral_2= 'SLOW' ) ) ;
    public final Enumerator ruleSpeed() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:713:2: ( ( (enumLiteral_0= 'FAST' ) | (enumLiteral_1= 'NORMAL' ) | (enumLiteral_2= 'SLOW' ) ) )
            // InternalTaskDSL.g:714:2: ( (enumLiteral_0= 'FAST' ) | (enumLiteral_1= 'NORMAL' ) | (enumLiteral_2= 'SLOW' ) )
            {
            // InternalTaskDSL.g:714:2: ( (enumLiteral_0= 'FAST' ) | (enumLiteral_1= 'NORMAL' ) | (enumLiteral_2= 'SLOW' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTaskDSL.g:715:3: (enumLiteral_0= 'FAST' )
                    {
                    // InternalTaskDSL.g:715:3: (enumLiteral_0= 'FAST' )
                    // InternalTaskDSL.g:716:4: enumLiteral_0= 'FAST'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getSpeedAccess().getFASTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSpeedAccess().getFASTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:723:3: (enumLiteral_1= 'NORMAL' )
                    {
                    // InternalTaskDSL.g:723:3: (enumLiteral_1= 'NORMAL' )
                    // InternalTaskDSL.g:724:4: enumLiteral_1= 'NORMAL'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getSpeedAccess().getNORMALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSpeedAccess().getNORMALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:731:3: (enumLiteral_2= 'SLOW' )
                    {
                    // InternalTaskDSL.g:731:3: (enumLiteral_2= 'SLOW' )
                    // InternalTaskDSL.g:732:4: enumLiteral_2= 'SLOW'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSpeedAccess().getSLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSpeedAccess().getSLOWEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpeed"


    // $ANTLR start "ruleColor"
    // InternalTaskDSL.g:742:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'GREEN' ) | (enumLiteral_2= 'BLUE' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:748:2: ( ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'GREEN' ) | (enumLiteral_2= 'BLUE' ) ) )
            // InternalTaskDSL.g:749:2: ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'GREEN' ) | (enumLiteral_2= 'BLUE' ) )
            {
            // InternalTaskDSL.g:749:2: ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'GREEN' ) | (enumLiteral_2= 'BLUE' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 33:
                {
                alt12=2;
                }
                break;
            case 34:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTaskDSL.g:750:3: (enumLiteral_0= 'RED' )
                    {
                    // InternalTaskDSL.g:750:3: (enumLiteral_0= 'RED' )
                    // InternalTaskDSL.g:751:4: enumLiteral_0= 'RED'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:758:3: (enumLiteral_1= 'GREEN' )
                    {
                    // InternalTaskDSL.g:758:3: (enumLiteral_1= 'GREEN' )
                    // InternalTaskDSL.g:759:4: enumLiteral_1= 'GREEN'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:766:3: (enumLiteral_2= 'BLUE' )
                    {
                    // InternalTaskDSL.g:766:3: (enumLiteral_2= 'BLUE' )
                    // InternalTaskDSL.g:767:4: enumLiteral_2= 'BLUE'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000E1000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000E0008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000718000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});

}