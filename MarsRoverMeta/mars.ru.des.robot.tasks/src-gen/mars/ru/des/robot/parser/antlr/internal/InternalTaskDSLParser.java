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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission:'", "'tasks:'", "'Task:'", "'action:'", "'detectors:'", "'Drive'", "'Until'", "'Found'", "'Investigate'", "'Speak'", "'FindAndFollowLineFor'", "'meters'", "'Avoid'", "'By'", "'and'", "'MoveBackwards'", "'TurnLeft'", "'degrees'", "'TurnRight'", "'ROCK'", "'LAKE'", "'FAST'", "'NORMAL'", "'SLOW'", "'RED'", "'GREEN'", "'BLUE'"
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

        public InternalTaskDSLParser(TokenStream input, TaskDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DSL";
       	}

       	@Override
       	protected TaskDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDSL"
    // InternalTaskDSL.g:65:1: entryRuleDSL returns [EObject current=null] : iv_ruleDSL= ruleDSL EOF ;
    public final EObject entryRuleDSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL = null;


        try {
            // InternalTaskDSL.g:65:44: (iv_ruleDSL= ruleDSL EOF )
            // InternalTaskDSL.g:66:2: iv_ruleDSL= ruleDSL EOF
            {
             newCompositeNode(grammarAccess.getDSLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSL=ruleDSL();

            state._fsp--;

             current =iv_ruleDSL; 
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
    // $ANTLR end "entryRuleDSL"


    // $ANTLR start "ruleDSL"
    // InternalTaskDSL.g:72:1: ruleDSL returns [EObject current=null] : ( ( (lv_missions_0_0= ruleMission ) )* ( (lv_tasks_1_0= ruleTask ) )* ) ;
    public final EObject ruleDSL() throws RecognitionException {
        EObject current = null;

        EObject lv_missions_0_0 = null;

        EObject lv_tasks_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:78:2: ( ( ( (lv_missions_0_0= ruleMission ) )* ( (lv_tasks_1_0= ruleTask ) )* ) )
            // InternalTaskDSL.g:79:2: ( ( (lv_missions_0_0= ruleMission ) )* ( (lv_tasks_1_0= ruleTask ) )* )
            {
            // InternalTaskDSL.g:79:2: ( ( (lv_missions_0_0= ruleMission ) )* ( (lv_tasks_1_0= ruleTask ) )* )
            // InternalTaskDSL.g:80:3: ( (lv_missions_0_0= ruleMission ) )* ( (lv_tasks_1_0= ruleTask ) )*
            {
            // InternalTaskDSL.g:80:3: ( (lv_missions_0_0= ruleMission ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTaskDSL.g:81:4: (lv_missions_0_0= ruleMission )
            	    {
            	    // InternalTaskDSL.g:81:4: (lv_missions_0_0= ruleMission )
            	    // InternalTaskDSL.g:82:5: lv_missions_0_0= ruleMission
            	    {

            	    					newCompositeNode(grammarAccess.getDSLAccess().getMissionsMissionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_missions_0_0=ruleMission();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSLRule());
            	    					}
            	    					add(
            	    						current,
            	    						"missions",
            	    						lv_missions_0_0,
            	    						"mars.ru.des.robot.TaskDSL.Mission");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTaskDSL.g:99:3: ( (lv_tasks_1_0= ruleTask ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTaskDSL.g:100:4: (lv_tasks_1_0= ruleTask )
            	    {
            	    // InternalTaskDSL.g:100:4: (lv_tasks_1_0= ruleTask )
            	    // InternalTaskDSL.g:101:5: lv_tasks_1_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getDSLAccess().getTasksTaskParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_tasks_1_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSLRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_1_0,
            	    						"mars.ru.des.robot.TaskDSL.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
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
    // $ANTLR end "ruleDSL"


    // $ANTLR start "entryRuleMission"
    // InternalTaskDSL.g:122:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalTaskDSL.g:122:48: (iv_ruleMission= ruleMission EOF )
            // InternalTaskDSL.g:123:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalTaskDSL.g:129:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'tasks:' ( (otherlv_3= RULE_ID ) )+ ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:135:2: ( (otherlv_0= 'Mission:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'tasks:' ( (otherlv_3= RULE_ID ) )+ ) )
            // InternalTaskDSL.g:136:2: (otherlv_0= 'Mission:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'tasks:' ( (otherlv_3= RULE_ID ) )+ )
            {
            // InternalTaskDSL.g:136:2: (otherlv_0= 'Mission:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'tasks:' ( (otherlv_3= RULE_ID ) )+ )
            // InternalTaskDSL.g:137:3: otherlv_0= 'Mission:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'tasks:' ( (otherlv_3= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalTaskDSL.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDSL.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDSL.g:143:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getTasksKeyword_2());
            		
            // InternalTaskDSL.g:163:3: ( (otherlv_3= RULE_ID ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTaskDSL.g:164:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalTaskDSL.g:164:4: (otherlv_3= RULE_ID )
            	    // InternalTaskDSL.g:165:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMissionRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    					newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getTasksTaskCrossReference_3_0());
            	    				

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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleTask"
    // InternalTaskDSL.g:180:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalTaskDSL.g:180:45: (iv_ruleTask= ruleTask EOF )
            // InternalTaskDSL.g:181:2: iv_ruleTask= ruleTask EOF
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
    // InternalTaskDSL.g:187:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_action_2_0= ruleAction ) ) ( (lv_detector_3_0= ruleDetector ) )? ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_action_2_0 = null;

        EObject lv_detector_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:193:2: ( (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_action_2_0= ruleAction ) ) ( (lv_detector_3_0= ruleDetector ) )? ) )
            // InternalTaskDSL.g:194:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_action_2_0= ruleAction ) ) ( (lv_detector_3_0= ruleDetector ) )? )
            {
            // InternalTaskDSL.g:194:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_action_2_0= ruleAction ) ) ( (lv_detector_3_0= ruleDetector ) )? )
            // InternalTaskDSL.g:195:3: otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_action_2_0= ruleAction ) ) ( (lv_detector_3_0= ruleDetector ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalTaskDSL.g:199:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDSL.g:200:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:200:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDSL.g:201:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalTaskDSL.g:217:3: ( (lv_action_2_0= ruleAction ) )
            // InternalTaskDSL.g:218:4: (lv_action_2_0= ruleAction )
            {
            // InternalTaskDSL.g:218:4: (lv_action_2_0= ruleAction )
            // InternalTaskDSL.g:219:5: lv_action_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getActionActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalTaskDSL.g:236:3: ( (lv_detector_3_0= ruleDetector ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTaskDSL.g:237:4: (lv_detector_3_0= ruleDetector )
                    {
                    // InternalTaskDSL.g:237:4: (lv_detector_3_0= ruleDetector )
                    // InternalTaskDSL.g:238:5: lv_detector_3_0= ruleDetector
                    {

                    					newCompositeNode(grammarAccess.getTaskAccess().getDetectorDetectorParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_detector_3_0=ruleDetector();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskRule());
                    					}
                    					set(
                    						current,
                    						"detector",
                    						lv_detector_3_0,
                    						"mars.ru.des.robot.TaskDSL.Detector");
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
    // InternalTaskDSL.g:259:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalTaskDSL.g:259:47: (iv_ruleAction= ruleAction EOF )
            // InternalTaskDSL.g:260:2: iv_ruleAction= ruleAction EOF
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
    // InternalTaskDSL.g:266:1: ruleAction returns [EObject current=null] : ( (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil ) | this_Investigate_2= ruleInvestigate | this_Speak_3= ruleSpeak | this_FollowLine_4= ruleFollowLine ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DriveUntil_1 = null;

        EObject this_Investigate_2 = null;

        EObject this_Speak_3 = null;

        EObject this_FollowLine_4 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:272:2: ( ( (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil ) | this_Investigate_2= ruleInvestigate | this_Speak_3= ruleSpeak | this_FollowLine_4= ruleFollowLine ) )
            // InternalTaskDSL.g:273:2: ( (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil ) | this_Investigate_2= ruleInvestigate | this_Speak_3= ruleSpeak | this_FollowLine_4= ruleFollowLine )
            {
            // InternalTaskDSL.g:273:2: ( (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil ) | this_Investigate_2= ruleInvestigate | this_Speak_3= ruleSpeak | this_FollowLine_4= ruleFollowLine )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTaskDSL.g:274:3: (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil )
                    {
                    // InternalTaskDSL.g:274:3: (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil )
                    // InternalTaskDSL.g:275:4: otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_10); 

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
                    // InternalTaskDSL.g:289:3: this_Investigate_2= ruleInvestigate
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
                    // InternalTaskDSL.g:298:3: this_Speak_3= ruleSpeak
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
                    // InternalTaskDSL.g:307:3: this_FollowLine_4= ruleFollowLine
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


    // $ANTLR start "entryRuleDetector"
    // InternalTaskDSL.g:319:1: entryRuleDetector returns [EObject current=null] : iv_ruleDetector= ruleDetector EOF ;
    public final EObject entryRuleDetector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetector = null;


        try {
            // InternalTaskDSL.g:319:49: (iv_ruleDetector= ruleDetector EOF )
            // InternalTaskDSL.g:320:2: iv_ruleDetector= ruleDetector EOF
            {
             newCompositeNode(grammarAccess.getDetectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDetector=ruleDetector();

            state._fsp--;

             current =iv_ruleDetector; 
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
    // $ANTLR end "entryRuleDetector"


    // $ANTLR start "ruleDetector"
    // InternalTaskDSL.g:326:1: ruleDetector returns [EObject current=null] : (otherlv_0= 'detectors:' ( (lv_avoiders_1_0= ruleAvoid ) )+ ) ;
    public final EObject ruleDetector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_avoiders_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:332:2: ( (otherlv_0= 'detectors:' ( (lv_avoiders_1_0= ruleAvoid ) )+ ) )
            // InternalTaskDSL.g:333:2: (otherlv_0= 'detectors:' ( (lv_avoiders_1_0= ruleAvoid ) )+ )
            {
            // InternalTaskDSL.g:333:2: (otherlv_0= 'detectors:' ( (lv_avoiders_1_0= ruleAvoid ) )+ )
            // InternalTaskDSL.g:334:3: otherlv_0= 'detectors:' ( (lv_avoiders_1_0= ruleAvoid ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDetectorAccess().getDetectorsKeyword_0());
            		
            // InternalTaskDSL.g:338:3: ( (lv_avoiders_1_0= ruleAvoid ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTaskDSL.g:339:4: (lv_avoiders_1_0= ruleAvoid )
            	    {
            	    // InternalTaskDSL.g:339:4: (lv_avoiders_1_0= ruleAvoid )
            	    // InternalTaskDSL.g:340:5: lv_avoiders_1_0= ruleAvoid
            	    {

            	    					newCompositeNode(grammarAccess.getDetectorAccess().getAvoidersAvoidParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_avoiders_1_0=ruleAvoid();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDetectorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"avoiders",
            	    						lv_avoiders_1_0,
            	    						"mars.ru.des.robot.TaskDSL.Avoid");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // $ANTLR end "ruleDetector"


    // $ANTLR start "entryRuleDriveUntil"
    // InternalTaskDSL.g:361:1: entryRuleDriveUntil returns [EObject current=null] : iv_ruleDriveUntil= ruleDriveUntil EOF ;
    public final EObject entryRuleDriveUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriveUntil = null;


        try {
            // InternalTaskDSL.g:361:51: (iv_ruleDriveUntil= ruleDriveUntil EOF )
            // InternalTaskDSL.g:362:2: iv_ruleDriveUntil= ruleDriveUntil EOF
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
    // InternalTaskDSL.g:368:1: ruleDriveUntil returns [EObject current=null] : (otherlv_0= 'Drive' ( (lv_speed_1_0= ruleSpeed ) )? otherlv_2= 'Until' ( (lv_color_3_0= ruleColor ) )? ( (lv_object_4_0= ruleObject ) ) otherlv_5= 'Found' ) ;
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
            // InternalTaskDSL.g:374:2: ( (otherlv_0= 'Drive' ( (lv_speed_1_0= ruleSpeed ) )? otherlv_2= 'Until' ( (lv_color_3_0= ruleColor ) )? ( (lv_object_4_0= ruleObject ) ) otherlv_5= 'Found' ) )
            // InternalTaskDSL.g:375:2: (otherlv_0= 'Drive' ( (lv_speed_1_0= ruleSpeed ) )? otherlv_2= 'Until' ( (lv_color_3_0= ruleColor ) )? ( (lv_object_4_0= ruleObject ) ) otherlv_5= 'Found' )
            {
            // InternalTaskDSL.g:375:2: (otherlv_0= 'Drive' ( (lv_speed_1_0= ruleSpeed ) )? otherlv_2= 'Until' ( (lv_color_3_0= ruleColor ) )? ( (lv_object_4_0= ruleObject ) ) otherlv_5= 'Found' )
            // InternalTaskDSL.g:376:3: otherlv_0= 'Drive' ( (lv_speed_1_0= ruleSpeed ) )? otherlv_2= 'Until' ( (lv_color_3_0= ruleColor ) )? ( (lv_object_4_0= ruleObject ) ) otherlv_5= 'Found'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDriveUntilAccess().getDriveKeyword_0());
            		
            // InternalTaskDSL.g:380:3: ( (lv_speed_1_0= ruleSpeed ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=32 && LA7_0<=34)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTaskDSL.g:381:4: (lv_speed_1_0= ruleSpeed )
                    {
                    // InternalTaskDSL.g:381:4: (lv_speed_1_0= ruleSpeed )
                    // InternalTaskDSL.g:382:5: lv_speed_1_0= ruleSpeed
                    {

                    					newCompositeNode(grammarAccess.getDriveUntilAccess().getSpeedSpeedEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getDriveUntilAccess().getUntilKeyword_2());
            		
            // InternalTaskDSL.g:403:3: ( (lv_color_3_0= ruleColor ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=35 && LA8_0<=37)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTaskDSL.g:404:4: (lv_color_3_0= ruleColor )
                    {
                    // InternalTaskDSL.g:404:4: (lv_color_3_0= ruleColor )
                    // InternalTaskDSL.g:405:5: lv_color_3_0= ruleColor
                    {

                    					newCompositeNode(grammarAccess.getDriveUntilAccess().getColorColorEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_15);
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

            // InternalTaskDSL.g:422:3: ( (lv_object_4_0= ruleObject ) )
            // InternalTaskDSL.g:423:4: (lv_object_4_0= ruleObject )
            {
            // InternalTaskDSL.g:423:4: (lv_object_4_0= ruleObject )
            // InternalTaskDSL.g:424:5: lv_object_4_0= ruleObject
            {

            					newCompositeNode(grammarAccess.getDriveUntilAccess().getObjectObjectEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

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
    // InternalTaskDSL.g:449:1: entryRuleInvestigate returns [EObject current=null] : iv_ruleInvestigate= ruleInvestigate EOF ;
    public final EObject entryRuleInvestigate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvestigate = null;


        try {
            // InternalTaskDSL.g:449:52: (iv_ruleInvestigate= ruleInvestigate EOF )
            // InternalTaskDSL.g:450:2: iv_ruleInvestigate= ruleInvestigate EOF
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
    // InternalTaskDSL.g:456:1: ruleInvestigate returns [EObject current=null] : (otherlv_0= 'Investigate' ( (lv_speed_1_0= ruleSpeed ) ) ) ;
    public final EObject ruleInvestigate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_speed_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:462:2: ( (otherlv_0= 'Investigate' ( (lv_speed_1_0= ruleSpeed ) ) ) )
            // InternalTaskDSL.g:463:2: (otherlv_0= 'Investigate' ( (lv_speed_1_0= ruleSpeed ) ) )
            {
            // InternalTaskDSL.g:463:2: (otherlv_0= 'Investigate' ( (lv_speed_1_0= ruleSpeed ) ) )
            // InternalTaskDSL.g:464:3: otherlv_0= 'Investigate' ( (lv_speed_1_0= ruleSpeed ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getInvestigateAccess().getInvestigateKeyword_0());
            		
            // InternalTaskDSL.g:468:3: ( (lv_speed_1_0= ruleSpeed ) )
            // InternalTaskDSL.g:469:4: (lv_speed_1_0= ruleSpeed )
            {
            // InternalTaskDSL.g:469:4: (lv_speed_1_0= ruleSpeed )
            // InternalTaskDSL.g:470:5: lv_speed_1_0= ruleSpeed
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
    // InternalTaskDSL.g:491:1: entryRuleSpeak returns [EObject current=null] : iv_ruleSpeak= ruleSpeak EOF ;
    public final EObject entryRuleSpeak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeak = null;


        try {
            // InternalTaskDSL.g:491:46: (iv_ruleSpeak= ruleSpeak EOF )
            // InternalTaskDSL.g:492:2: iv_ruleSpeak= ruleSpeak EOF
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
    // InternalTaskDSL.g:498:1: ruleSpeak returns [EObject current=null] : (otherlv_0= 'Speak' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSpeak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:504:2: ( (otherlv_0= 'Speak' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalTaskDSL.g:505:2: (otherlv_0= 'Speak' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalTaskDSL.g:505:2: (otherlv_0= 'Speak' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalTaskDSL.g:506:3: otherlv_0= 'Speak' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSpeakAccess().getSpeakKeyword_0());
            		
            // InternalTaskDSL.g:510:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalTaskDSL.g:511:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalTaskDSL.g:511:4: (lv_text_1_0= RULE_STRING )
            // InternalTaskDSL.g:512:5: lv_text_1_0= RULE_STRING
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
    // InternalTaskDSL.g:532:1: entryRuleFollowLine returns [EObject current=null] : iv_ruleFollowLine= ruleFollowLine EOF ;
    public final EObject entryRuleFollowLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowLine = null;


        try {
            // InternalTaskDSL.g:532:51: (iv_ruleFollowLine= ruleFollowLine EOF )
            // InternalTaskDSL.g:533:2: iv_ruleFollowLine= ruleFollowLine EOF
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
    // InternalTaskDSL.g:539:1: ruleFollowLine returns [EObject current=null] : (otherlv_0= 'FindAndFollowLineFor' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' ) ;
    public final EObject ruleFollowLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_distance_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:545:2: ( (otherlv_0= 'FindAndFollowLineFor' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' ) )
            // InternalTaskDSL.g:546:2: (otherlv_0= 'FindAndFollowLineFor' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' )
            {
            // InternalTaskDSL.g:546:2: (otherlv_0= 'FindAndFollowLineFor' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' )
            // InternalTaskDSL.g:547:3: otherlv_0= 'FindAndFollowLineFor' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getFollowLineAccess().getFindAndFollowLineForKeyword_0());
            		
            // InternalTaskDSL.g:551:3: ( (lv_distance_1_0= RULE_INT ) )
            // InternalTaskDSL.g:552:4: (lv_distance_1_0= RULE_INT )
            {
            // InternalTaskDSL.g:552:4: (lv_distance_1_0= RULE_INT )
            // InternalTaskDSL.g:553:5: lv_distance_1_0= RULE_INT
            {
            lv_distance_1_0=(Token)match(input,RULE_INT,FOLLOW_20); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

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
    // InternalTaskDSL.g:577:1: entryRuleAvoid returns [EObject current=null] : iv_ruleAvoid= ruleAvoid EOF ;
    public final EObject entryRuleAvoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvoid = null;


        try {
            // InternalTaskDSL.g:577:46: (iv_ruleAvoid= ruleAvoid EOF )
            // InternalTaskDSL.g:578:2: iv_ruleAvoid= ruleAvoid EOF
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
    // InternalTaskDSL.g:584:1: ruleAvoid returns [EObject current=null] : (otherlv_0= 'Avoid' ( (lv_color_1_0= ruleColor ) )? ( (lv_object_2_0= ruleObject ) ) otherlv_3= 'By' ( (lv_driveActions_4_0= ruleDriveAction ) )+ ) ;
    public final EObject ruleAvoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_color_1_0 = null;

        Enumerator lv_object_2_0 = null;

        EObject lv_driveActions_4_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:590:2: ( (otherlv_0= 'Avoid' ( (lv_color_1_0= ruleColor ) )? ( (lv_object_2_0= ruleObject ) ) otherlv_3= 'By' ( (lv_driveActions_4_0= ruleDriveAction ) )+ ) )
            // InternalTaskDSL.g:591:2: (otherlv_0= 'Avoid' ( (lv_color_1_0= ruleColor ) )? ( (lv_object_2_0= ruleObject ) ) otherlv_3= 'By' ( (lv_driveActions_4_0= ruleDriveAction ) )+ )
            {
            // InternalTaskDSL.g:591:2: (otherlv_0= 'Avoid' ( (lv_color_1_0= ruleColor ) )? ( (lv_object_2_0= ruleObject ) ) otherlv_3= 'By' ( (lv_driveActions_4_0= ruleDriveAction ) )+ )
            // InternalTaskDSL.g:592:3: otherlv_0= 'Avoid' ( (lv_color_1_0= ruleColor ) )? ( (lv_object_2_0= ruleObject ) ) otherlv_3= 'By' ( (lv_driveActions_4_0= ruleDriveAction ) )+
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAvoidAccess().getAvoidKeyword_0());
            		
            // InternalTaskDSL.g:596:3: ( (lv_color_1_0= ruleColor ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=35 && LA9_0<=37)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTaskDSL.g:597:4: (lv_color_1_0= ruleColor )
                    {
                    // InternalTaskDSL.g:597:4: (lv_color_1_0= ruleColor )
                    // InternalTaskDSL.g:598:5: lv_color_1_0= ruleColor
                    {

                    					newCompositeNode(grammarAccess.getAvoidAccess().getColorColorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_15);
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

            // InternalTaskDSL.g:615:3: ( (lv_object_2_0= ruleObject ) )
            // InternalTaskDSL.g:616:4: (lv_object_2_0= ruleObject )
            {
            // InternalTaskDSL.g:616:4: (lv_object_2_0= ruleObject )
            // InternalTaskDSL.g:617:5: lv_object_2_0= ruleObject
            {

            					newCompositeNode(grammarAccess.getAvoidAccess().getObjectObjectEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_3=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getAvoidAccess().getByKeyword_3());
            		
            // InternalTaskDSL.g:638:3: ( (lv_driveActions_4_0= ruleDriveAction ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=26 && LA10_0<=27)||LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTaskDSL.g:639:4: (lv_driveActions_4_0= ruleDriveAction )
            	    {
            	    // InternalTaskDSL.g:639:4: (lv_driveActions_4_0= ruleDriveAction )
            	    // InternalTaskDSL.g:640:5: lv_driveActions_4_0= ruleDriveAction
            	    {

            	    					newCompositeNode(grammarAccess.getAvoidAccess().getDriveActionsDriveActionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_driveActions_4_0=ruleDriveAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAvoidRule());
            	    					}
            	    					add(
            	    						current,
            	    						"driveActions",
            	    						lv_driveActions_4_0,
            	    						"mars.ru.des.robot.TaskDSL.DriveAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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


    // $ANTLR start "entryRuleDriveAction"
    // InternalTaskDSL.g:661:1: entryRuleDriveAction returns [EObject current=null] : iv_ruleDriveAction= ruleDriveAction EOF ;
    public final EObject entryRuleDriveAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriveAction = null;


        try {
            // InternalTaskDSL.g:661:52: (iv_ruleDriveAction= ruleDriveAction EOF )
            // InternalTaskDSL.g:662:2: iv_ruleDriveAction= ruleDriveAction EOF
            {
             newCompositeNode(grammarAccess.getDriveActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDriveAction=ruleDriveAction();

            state._fsp--;

             current =iv_ruleDriveAction; 
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
    // $ANTLR end "entryRuleDriveAction"


    // $ANTLR start "ruleDriveAction"
    // InternalTaskDSL.g:668:1: ruleDriveAction returns [EObject current=null] : ( (this_MoveBack_0= ruleMoveBack | this_TurnLeft_1= ruleTurnLeft | this_TurnRight_2= ruleTurnRight ) (otherlv_3= 'and' )? ) ;
    public final EObject ruleDriveAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_MoveBack_0 = null;

        EObject this_TurnLeft_1 = null;

        EObject this_TurnRight_2 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:674:2: ( ( (this_MoveBack_0= ruleMoveBack | this_TurnLeft_1= ruleTurnLeft | this_TurnRight_2= ruleTurnRight ) (otherlv_3= 'and' )? ) )
            // InternalTaskDSL.g:675:2: ( (this_MoveBack_0= ruleMoveBack | this_TurnLeft_1= ruleTurnLeft | this_TurnRight_2= ruleTurnRight ) (otherlv_3= 'and' )? )
            {
            // InternalTaskDSL.g:675:2: ( (this_MoveBack_0= ruleMoveBack | this_TurnLeft_1= ruleTurnLeft | this_TurnRight_2= ruleTurnRight ) (otherlv_3= 'and' )? )
            // InternalTaskDSL.g:676:3: (this_MoveBack_0= ruleMoveBack | this_TurnLeft_1= ruleTurnLeft | this_TurnRight_2= ruleTurnRight ) (otherlv_3= 'and' )?
            {
            // InternalTaskDSL.g:676:3: (this_MoveBack_0= ruleMoveBack | this_TurnLeft_1= ruleTurnLeft | this_TurnRight_2= ruleTurnRight )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 29:
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
                    // InternalTaskDSL.g:677:4: this_MoveBack_0= ruleMoveBack
                    {

                    				newCompositeNode(grammarAccess.getDriveActionAccess().getMoveBackParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_24);
                    this_MoveBack_0=ruleMoveBack();

                    state._fsp--;


                    				current = this_MoveBack_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:686:4: this_TurnLeft_1= ruleTurnLeft
                    {

                    				newCompositeNode(grammarAccess.getDriveActionAccess().getTurnLeftParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_24);
                    this_TurnLeft_1=ruleTurnLeft();

                    state._fsp--;


                    				current = this_TurnLeft_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:695:4: this_TurnRight_2= ruleTurnRight
                    {

                    				newCompositeNode(grammarAccess.getDriveActionAccess().getTurnRightParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_24);
                    this_TurnRight_2=ruleTurnRight();

                    state._fsp--;


                    				current = this_TurnRight_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTaskDSL.g:704:3: (otherlv_3= 'and' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTaskDSL.g:705:4: otherlv_3= 'and'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDriveActionAccess().getAndKeyword_1());
                    			

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
    // $ANTLR end "ruleDriveAction"


    // $ANTLR start "entryRuleMoveBack"
    // InternalTaskDSL.g:714:1: entryRuleMoveBack returns [EObject current=null] : iv_ruleMoveBack= ruleMoveBack EOF ;
    public final EObject entryRuleMoveBack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveBack = null;


        try {
            // InternalTaskDSL.g:714:49: (iv_ruleMoveBack= ruleMoveBack EOF )
            // InternalTaskDSL.g:715:2: iv_ruleMoveBack= ruleMoveBack EOF
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
    // InternalTaskDSL.g:721:1: ruleMoveBack returns [EObject current=null] : (otherlv_0= 'MoveBackwards' ( (lv_meters_1_0= RULE_INT ) ) otherlv_2= 'meters' ) ;
    public final EObject ruleMoveBack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_meters_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:727:2: ( (otherlv_0= 'MoveBackwards' ( (lv_meters_1_0= RULE_INT ) ) otherlv_2= 'meters' ) )
            // InternalTaskDSL.g:728:2: (otherlv_0= 'MoveBackwards' ( (lv_meters_1_0= RULE_INT ) ) otherlv_2= 'meters' )
            {
            // InternalTaskDSL.g:728:2: (otherlv_0= 'MoveBackwards' ( (lv_meters_1_0= RULE_INT ) ) otherlv_2= 'meters' )
            // InternalTaskDSL.g:729:3: otherlv_0= 'MoveBackwards' ( (lv_meters_1_0= RULE_INT ) ) otherlv_2= 'meters'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveBackAccess().getMoveBackwardsKeyword_0());
            		
            // InternalTaskDSL.g:733:3: ( (lv_meters_1_0= RULE_INT ) )
            // InternalTaskDSL.g:734:4: (lv_meters_1_0= RULE_INT )
            {
            // InternalTaskDSL.g:734:4: (lv_meters_1_0= RULE_INT )
            // InternalTaskDSL.g:735:5: lv_meters_1_0= RULE_INT
            {
            lv_meters_1_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_meters_1_0, grammarAccess.getMoveBackAccess().getMetersINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveBackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"meters",
            						lv_meters_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTurnLeft"
    // InternalTaskDSL.g:759:1: entryRuleTurnLeft returns [EObject current=null] : iv_ruleTurnLeft= ruleTurnLeft EOF ;
    public final EObject entryRuleTurnLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnLeft = null;


        try {
            // InternalTaskDSL.g:759:49: (iv_ruleTurnLeft= ruleTurnLeft EOF )
            // InternalTaskDSL.g:760:2: iv_ruleTurnLeft= ruleTurnLeft EOF
            {
             newCompositeNode(grammarAccess.getTurnLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnLeft=ruleTurnLeft();

            state._fsp--;

             current =iv_ruleTurnLeft; 
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
    // $ANTLR end "entryRuleTurnLeft"


    // $ANTLR start "ruleTurnLeft"
    // InternalTaskDSL.g:766:1: ruleTurnLeft returns [EObject current=null] : (otherlv_0= 'TurnLeft' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' ) ;
    public final EObject ruleTurnLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_degrees_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:772:2: ( (otherlv_0= 'TurnLeft' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' ) )
            // InternalTaskDSL.g:773:2: (otherlv_0= 'TurnLeft' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' )
            {
            // InternalTaskDSL.g:773:2: (otherlv_0= 'TurnLeft' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' )
            // InternalTaskDSL.g:774:3: otherlv_0= 'TurnLeft' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnLeftAccess().getTurnLeftKeyword_0());
            		
            // InternalTaskDSL.g:778:3: ( (lv_degrees_1_0= RULE_INT ) )
            // InternalTaskDSL.g:779:4: (lv_degrees_1_0= RULE_INT )
            {
            // InternalTaskDSL.g:779:4: (lv_degrees_1_0= RULE_INT )
            // InternalTaskDSL.g:780:5: lv_degrees_1_0= RULE_INT
            {
            lv_degrees_1_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_degrees_1_0, grammarAccess.getTurnLeftAccess().getDegreesINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurnLeftRule());
            					}
            					setWithLastConsumed(
            						current,
            						"degrees",
            						lv_degrees_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnLeftAccess().getDegreesKeyword_2());
            		

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
    // $ANTLR end "ruleTurnLeft"


    // $ANTLR start "entryRuleTurnRight"
    // InternalTaskDSL.g:804:1: entryRuleTurnRight returns [EObject current=null] : iv_ruleTurnRight= ruleTurnRight EOF ;
    public final EObject entryRuleTurnRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnRight = null;


        try {
            // InternalTaskDSL.g:804:50: (iv_ruleTurnRight= ruleTurnRight EOF )
            // InternalTaskDSL.g:805:2: iv_ruleTurnRight= ruleTurnRight EOF
            {
             newCompositeNode(grammarAccess.getTurnRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnRight=ruleTurnRight();

            state._fsp--;

             current =iv_ruleTurnRight; 
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
    // $ANTLR end "entryRuleTurnRight"


    // $ANTLR start "ruleTurnRight"
    // InternalTaskDSL.g:811:1: ruleTurnRight returns [EObject current=null] : (otherlv_0= 'TurnRight' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' ) ;
    public final EObject ruleTurnRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_degrees_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:817:2: ( (otherlv_0= 'TurnRight' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' ) )
            // InternalTaskDSL.g:818:2: (otherlv_0= 'TurnRight' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' )
            {
            // InternalTaskDSL.g:818:2: (otherlv_0= 'TurnRight' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' )
            // InternalTaskDSL.g:819:3: otherlv_0= 'TurnRight' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnRightAccess().getTurnRightKeyword_0());
            		
            // InternalTaskDSL.g:823:3: ( (lv_degrees_1_0= RULE_INT ) )
            // InternalTaskDSL.g:824:4: (lv_degrees_1_0= RULE_INT )
            {
            // InternalTaskDSL.g:824:4: (lv_degrees_1_0= RULE_INT )
            // InternalTaskDSL.g:825:5: lv_degrees_1_0= RULE_INT
            {
            lv_degrees_1_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_degrees_1_0, grammarAccess.getTurnRightAccess().getDegreesINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurnRightRule());
            					}
            					setWithLastConsumed(
            						current,
            						"degrees",
            						lv_degrees_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnRightAccess().getDegreesKeyword_2());
            		

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
    // $ANTLR end "ruleTurnRight"


    // $ANTLR start "ruleObject"
    // InternalTaskDSL.g:849:1: ruleObject returns [Enumerator current=null] : ( (enumLiteral_0= 'ROCK' ) | (enumLiteral_1= 'LAKE' ) ) ;
    public final Enumerator ruleObject() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:855:2: ( ( (enumLiteral_0= 'ROCK' ) | (enumLiteral_1= 'LAKE' ) ) )
            // InternalTaskDSL.g:856:2: ( (enumLiteral_0= 'ROCK' ) | (enumLiteral_1= 'LAKE' ) )
            {
            // InternalTaskDSL.g:856:2: ( (enumLiteral_0= 'ROCK' ) | (enumLiteral_1= 'LAKE' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            else if ( (LA13_0==31) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalTaskDSL.g:857:3: (enumLiteral_0= 'ROCK' )
                    {
                    // InternalTaskDSL.g:857:3: (enumLiteral_0= 'ROCK' )
                    // InternalTaskDSL.g:858:4: enumLiteral_0= 'ROCK'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getObjectAccess().getROCKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getObjectAccess().getROCKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:865:3: (enumLiteral_1= 'LAKE' )
                    {
                    // InternalTaskDSL.g:865:3: (enumLiteral_1= 'LAKE' )
                    // InternalTaskDSL.g:866:4: enumLiteral_1= 'LAKE'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

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
    // InternalTaskDSL.g:876:1: ruleSpeed returns [Enumerator current=null] : ( (enumLiteral_0= 'FAST' ) | (enumLiteral_1= 'NORMAL' ) | (enumLiteral_2= 'SLOW' ) ) ;
    public final Enumerator ruleSpeed() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:882:2: ( ( (enumLiteral_0= 'FAST' ) | (enumLiteral_1= 'NORMAL' ) | (enumLiteral_2= 'SLOW' ) ) )
            // InternalTaskDSL.g:883:2: ( (enumLiteral_0= 'FAST' ) | (enumLiteral_1= 'NORMAL' ) | (enumLiteral_2= 'SLOW' ) )
            {
            // InternalTaskDSL.g:883:2: ( (enumLiteral_0= 'FAST' ) | (enumLiteral_1= 'NORMAL' ) | (enumLiteral_2= 'SLOW' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt14=1;
                }
                break;
            case 33:
                {
                alt14=2;
                }
                break;
            case 34:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalTaskDSL.g:884:3: (enumLiteral_0= 'FAST' )
                    {
                    // InternalTaskDSL.g:884:3: (enumLiteral_0= 'FAST' )
                    // InternalTaskDSL.g:885:4: enumLiteral_0= 'FAST'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getSpeedAccess().getFASTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSpeedAccess().getFASTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:892:3: (enumLiteral_1= 'NORMAL' )
                    {
                    // InternalTaskDSL.g:892:3: (enumLiteral_1= 'NORMAL' )
                    // InternalTaskDSL.g:893:4: enumLiteral_1= 'NORMAL'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getSpeedAccess().getNORMALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSpeedAccess().getNORMALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:900:3: (enumLiteral_2= 'SLOW' )
                    {
                    // InternalTaskDSL.g:900:3: (enumLiteral_2= 'SLOW' )
                    // InternalTaskDSL.g:901:4: enumLiteral_2= 'SLOW'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

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
    // InternalTaskDSL.g:911:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'GREEN' ) | (enumLiteral_2= 'BLUE' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:917:2: ( ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'GREEN' ) | (enumLiteral_2= 'BLUE' ) ) )
            // InternalTaskDSL.g:918:2: ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'GREEN' ) | (enumLiteral_2= 'BLUE' ) )
            {
            // InternalTaskDSL.g:918:2: ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'GREEN' ) | (enumLiteral_2= 'BLUE' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt15=1;
                }
                break;
            case 36:
                {
                alt15=2;
                }
                break;
            case 37:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalTaskDSL.g:919:3: (enumLiteral_0= 'RED' )
                    {
                    // InternalTaskDSL.g:919:3: (enumLiteral_0= 'RED' )
                    // InternalTaskDSL.g:920:4: enumLiteral_0= 'RED'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:927:3: (enumLiteral_1= 'GREEN' )
                    {
                    // InternalTaskDSL.g:927:3: (enumLiteral_1= 'GREEN' )
                    // InternalTaskDSL.g:928:4: enumLiteral_1= 'GREEN'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:935:3: (enumLiteral_2= 'BLUE' )
                    {
                    // InternalTaskDSL.g:935:3: (enumLiteral_2= 'BLUE' )
                    // InternalTaskDSL.g:936:4: enumLiteral_2= 'BLUE'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000384000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000700020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000038C0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000002C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000002C000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});

}