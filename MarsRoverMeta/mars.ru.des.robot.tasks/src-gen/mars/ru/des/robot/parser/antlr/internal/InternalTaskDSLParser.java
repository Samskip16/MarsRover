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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission:'", "'tasks:'", "'action:'", "'detectors:'", "'Drive'", "'Until'", "'Found'", "'Investigate'", "'Speak'", "'FindAndFollowLineFor'", "'meters'", "'Avoid'", "'By'", "'and'", "'MoveBackwards'", "'Turn'", "'degrees'", "'ROCK'", "'LAKE'", "'FAST'", "'NORMAL'", "'SLOW'", "'RED'", "'GREEN'", "'BLUE'"
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
    public static final int T__35=35;
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
        	return "Mission";
       	}

       	@Override
       	protected TaskDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMission"
    // InternalTaskDSL.g:65:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalTaskDSL.g:65:48: (iv_ruleMission= ruleMission EOF )
            // InternalTaskDSL.g:66:2: iv_ruleMission= ruleMission EOF
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
    // InternalTaskDSL.g:72:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'tasks:' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:78:2: ( (otherlv_0= 'Mission:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'tasks:' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalTaskDSL.g:79:2: (otherlv_0= 'Mission:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'tasks:' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalTaskDSL.g:79:2: (otherlv_0= 'Mission:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'tasks:' ( (otherlv_3= RULE_ID ) ) )
            // InternalTaskDSL.g:80:3: otherlv_0= 'Mission:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'tasks:' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalTaskDSL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDSL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDSL.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getTasksKeyword_2());
            		
            // InternalTaskDSL.g:106:3: ( (otherlv_3= RULE_ID ) )
            // InternalTaskDSL.g:107:4: (otherlv_3= RULE_ID )
            {
            // InternalTaskDSL.g:107:4: (otherlv_3= RULE_ID )
            // InternalTaskDSL.g:108:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getTasksTaskCrossReference_3_0());
            				

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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleAction"
    // InternalTaskDSL.g:123:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalTaskDSL.g:123:47: (iv_ruleAction= ruleAction EOF )
            // InternalTaskDSL.g:124:2: iv_ruleAction= ruleAction EOF
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
    // InternalTaskDSL.g:130:1: ruleAction returns [EObject current=null] : ( (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil ) | this_Investigate_2= ruleInvestigate | this_Speak_3= ruleSpeak | this_FollowLine_4= ruleFollowLine ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DriveUntil_1 = null;

        EObject this_Investigate_2 = null;

        EObject this_Speak_3 = null;

        EObject this_FollowLine_4 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:136:2: ( ( (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil ) | this_Investigate_2= ruleInvestigate | this_Speak_3= ruleSpeak | this_FollowLine_4= ruleFollowLine ) )
            // InternalTaskDSL.g:137:2: ( (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil ) | this_Investigate_2= ruleInvestigate | this_Speak_3= ruleSpeak | this_FollowLine_4= ruleFollowLine )
            {
            // InternalTaskDSL.g:137:2: ( (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil ) | this_Investigate_2= ruleInvestigate | this_Speak_3= ruleSpeak | this_FollowLine_4= ruleFollowLine )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 20:
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
                    // InternalTaskDSL.g:138:3: (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil )
                    {
                    // InternalTaskDSL.g:138:3: (otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil )
                    // InternalTaskDSL.g:139:4: otherlv_0= 'action:' this_DriveUntil_1= ruleDriveUntil
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_5); 

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
                    // InternalTaskDSL.g:153:3: this_Investigate_2= ruleInvestigate
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
                    // InternalTaskDSL.g:162:3: this_Speak_3= ruleSpeak
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
                    // InternalTaskDSL.g:171:3: this_FollowLine_4= ruleFollowLine
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
    // InternalTaskDSL.g:183:1: entryRuleDetector returns [EObject current=null] : iv_ruleDetector= ruleDetector EOF ;
    public final EObject entryRuleDetector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetector = null;


        try {
            // InternalTaskDSL.g:183:49: (iv_ruleDetector= ruleDetector EOF )
            // InternalTaskDSL.g:184:2: iv_ruleDetector= ruleDetector EOF
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
    // InternalTaskDSL.g:190:1: ruleDetector returns [EObject current=null] : (otherlv_0= 'detectors:' ( (lv_avoiders_1_0= ruleAvoid ) )+ ) ;
    public final EObject ruleDetector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_avoiders_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:196:2: ( (otherlv_0= 'detectors:' ( (lv_avoiders_1_0= ruleAvoid ) )+ ) )
            // InternalTaskDSL.g:197:2: (otherlv_0= 'detectors:' ( (lv_avoiders_1_0= ruleAvoid ) )+ )
            {
            // InternalTaskDSL.g:197:2: (otherlv_0= 'detectors:' ( (lv_avoiders_1_0= ruleAvoid ) )+ )
            // InternalTaskDSL.g:198:3: otherlv_0= 'detectors:' ( (lv_avoiders_1_0= ruleAvoid ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDetectorAccess().getDetectorsKeyword_0());
            		
            // InternalTaskDSL.g:202:3: ( (lv_avoiders_1_0= ruleAvoid ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTaskDSL.g:203:4: (lv_avoiders_1_0= ruleAvoid )
            	    {
            	    // InternalTaskDSL.g:203:4: (lv_avoiders_1_0= ruleAvoid )
            	    // InternalTaskDSL.g:204:5: lv_avoiders_1_0= ruleAvoid
            	    {

            	    					newCompositeNode(grammarAccess.getDetectorAccess().getAvoidersAvoidParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // InternalTaskDSL.g:225:1: entryRuleDriveUntil returns [EObject current=null] : iv_ruleDriveUntil= ruleDriveUntil EOF ;
    public final EObject entryRuleDriveUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriveUntil = null;


        try {
            // InternalTaskDSL.g:225:51: (iv_ruleDriveUntil= ruleDriveUntil EOF )
            // InternalTaskDSL.g:226:2: iv_ruleDriveUntil= ruleDriveUntil EOF
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
    // InternalTaskDSL.g:232:1: ruleDriveUntil returns [EObject current=null] : (otherlv_0= 'Drive' ( (lv_speed_1_0= ruleSpeed ) )? otherlv_2= 'Until' ( (lv_color_3_0= ruleColor ) )? ( (lv_object_4_0= ruleObject ) ) otherlv_5= 'Found' ) ;
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
            // InternalTaskDSL.g:238:2: ( (otherlv_0= 'Drive' ( (lv_speed_1_0= ruleSpeed ) )? otherlv_2= 'Until' ( (lv_color_3_0= ruleColor ) )? ( (lv_object_4_0= ruleObject ) ) otherlv_5= 'Found' ) )
            // InternalTaskDSL.g:239:2: (otherlv_0= 'Drive' ( (lv_speed_1_0= ruleSpeed ) )? otherlv_2= 'Until' ( (lv_color_3_0= ruleColor ) )? ( (lv_object_4_0= ruleObject ) ) otherlv_5= 'Found' )
            {
            // InternalTaskDSL.g:239:2: (otherlv_0= 'Drive' ( (lv_speed_1_0= ruleSpeed ) )? otherlv_2= 'Until' ( (lv_color_3_0= ruleColor ) )? ( (lv_object_4_0= ruleObject ) ) otherlv_5= 'Found' )
            // InternalTaskDSL.g:240:3: otherlv_0= 'Drive' ( (lv_speed_1_0= ruleSpeed ) )? otherlv_2= 'Until' ( (lv_color_3_0= ruleColor ) )? ( (lv_object_4_0= ruleObject ) ) otherlv_5= 'Found'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDriveUntilAccess().getDriveKeyword_0());
            		
            // InternalTaskDSL.g:244:3: ( (lv_speed_1_0= ruleSpeed ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=30 && LA3_0<=32)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTaskDSL.g:245:4: (lv_speed_1_0= ruleSpeed )
                    {
                    // InternalTaskDSL.g:245:4: (lv_speed_1_0= ruleSpeed )
                    // InternalTaskDSL.g:246:5: lv_speed_1_0= ruleSpeed
                    {

                    					newCompositeNode(grammarAccess.getDriveUntilAccess().getSpeedSpeedEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_9);
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

            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDriveUntilAccess().getUntilKeyword_2());
            		
            // InternalTaskDSL.g:267:3: ( (lv_color_3_0= ruleColor ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=33 && LA4_0<=35)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTaskDSL.g:268:4: (lv_color_3_0= ruleColor )
                    {
                    // InternalTaskDSL.g:268:4: (lv_color_3_0= ruleColor )
                    // InternalTaskDSL.g:269:5: lv_color_3_0= ruleColor
                    {

                    					newCompositeNode(grammarAccess.getDriveUntilAccess().getColorColorEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
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

            // InternalTaskDSL.g:286:3: ( (lv_object_4_0= ruleObject ) )
            // InternalTaskDSL.g:287:4: (lv_object_4_0= ruleObject )
            {
            // InternalTaskDSL.g:287:4: (lv_object_4_0= ruleObject )
            // InternalTaskDSL.g:288:5: lv_object_4_0= ruleObject
            {

            					newCompositeNode(grammarAccess.getDriveUntilAccess().getObjectObjectEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

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
    // InternalTaskDSL.g:313:1: entryRuleInvestigate returns [EObject current=null] : iv_ruleInvestigate= ruleInvestigate EOF ;
    public final EObject entryRuleInvestigate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvestigate = null;


        try {
            // InternalTaskDSL.g:313:52: (iv_ruleInvestigate= ruleInvestigate EOF )
            // InternalTaskDSL.g:314:2: iv_ruleInvestigate= ruleInvestigate EOF
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
    // InternalTaskDSL.g:320:1: ruleInvestigate returns [EObject current=null] : (otherlv_0= 'Investigate' ( (lv_speed_1_0= ruleSpeed ) ) ) ;
    public final EObject ruleInvestigate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_speed_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:326:2: ( (otherlv_0= 'Investigate' ( (lv_speed_1_0= ruleSpeed ) ) ) )
            // InternalTaskDSL.g:327:2: (otherlv_0= 'Investigate' ( (lv_speed_1_0= ruleSpeed ) ) )
            {
            // InternalTaskDSL.g:327:2: (otherlv_0= 'Investigate' ( (lv_speed_1_0= ruleSpeed ) ) )
            // InternalTaskDSL.g:328:3: otherlv_0= 'Investigate' ( (lv_speed_1_0= ruleSpeed ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getInvestigateAccess().getInvestigateKeyword_0());
            		
            // InternalTaskDSL.g:332:3: ( (lv_speed_1_0= ruleSpeed ) )
            // InternalTaskDSL.g:333:4: (lv_speed_1_0= ruleSpeed )
            {
            // InternalTaskDSL.g:333:4: (lv_speed_1_0= ruleSpeed )
            // InternalTaskDSL.g:334:5: lv_speed_1_0= ruleSpeed
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
    // InternalTaskDSL.g:355:1: entryRuleSpeak returns [EObject current=null] : iv_ruleSpeak= ruleSpeak EOF ;
    public final EObject entryRuleSpeak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeak = null;


        try {
            // InternalTaskDSL.g:355:46: (iv_ruleSpeak= ruleSpeak EOF )
            // InternalTaskDSL.g:356:2: iv_ruleSpeak= ruleSpeak EOF
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
    // InternalTaskDSL.g:362:1: ruleSpeak returns [EObject current=null] : (otherlv_0= 'Speak' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSpeak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:368:2: ( (otherlv_0= 'Speak' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalTaskDSL.g:369:2: (otherlv_0= 'Speak' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalTaskDSL.g:369:2: (otherlv_0= 'Speak' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalTaskDSL.g:370:3: otherlv_0= 'Speak' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSpeakAccess().getSpeakKeyword_0());
            		
            // InternalTaskDSL.g:374:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalTaskDSL.g:375:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalTaskDSL.g:375:4: (lv_text_1_0= RULE_STRING )
            // InternalTaskDSL.g:376:5: lv_text_1_0= RULE_STRING
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
    // InternalTaskDSL.g:396:1: entryRuleFollowLine returns [EObject current=null] : iv_ruleFollowLine= ruleFollowLine EOF ;
    public final EObject entryRuleFollowLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowLine = null;


        try {
            // InternalTaskDSL.g:396:51: (iv_ruleFollowLine= ruleFollowLine EOF )
            // InternalTaskDSL.g:397:2: iv_ruleFollowLine= ruleFollowLine EOF
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
    // InternalTaskDSL.g:403:1: ruleFollowLine returns [EObject current=null] : (otherlv_0= 'FindAndFollowLineFor' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' ) ;
    public final EObject ruleFollowLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_distance_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:409:2: ( (otherlv_0= 'FindAndFollowLineFor' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' ) )
            // InternalTaskDSL.g:410:2: (otherlv_0= 'FindAndFollowLineFor' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' )
            {
            // InternalTaskDSL.g:410:2: (otherlv_0= 'FindAndFollowLineFor' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters' )
            // InternalTaskDSL.g:411:3: otherlv_0= 'FindAndFollowLineFor' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= 'meters'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getFollowLineAccess().getFindAndFollowLineForKeyword_0());
            		
            // InternalTaskDSL.g:415:3: ( (lv_distance_1_0= RULE_INT ) )
            // InternalTaskDSL.g:416:4: (lv_distance_1_0= RULE_INT )
            {
            // InternalTaskDSL.g:416:4: (lv_distance_1_0= RULE_INT )
            // InternalTaskDSL.g:417:5: lv_distance_1_0= RULE_INT
            {
            lv_distance_1_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTaskDSL.g:441:1: entryRuleAvoid returns [EObject current=null] : iv_ruleAvoid= ruleAvoid EOF ;
    public final EObject entryRuleAvoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvoid = null;


        try {
            // InternalTaskDSL.g:441:46: (iv_ruleAvoid= ruleAvoid EOF )
            // InternalTaskDSL.g:442:2: iv_ruleAvoid= ruleAvoid EOF
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
    // InternalTaskDSL.g:448:1: ruleAvoid returns [EObject current=null] : (otherlv_0= 'Avoid' ( (lv_color_1_0= ruleColor ) )? ( (lv_object_2_0= ruleObject ) ) otherlv_3= 'By' ( (lv_avoidActions_4_0= ruleDriveAction ) )+ ) ;
    public final EObject ruleAvoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_color_1_0 = null;

        Enumerator lv_object_2_0 = null;

        EObject lv_avoidActions_4_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:454:2: ( (otherlv_0= 'Avoid' ( (lv_color_1_0= ruleColor ) )? ( (lv_object_2_0= ruleObject ) ) otherlv_3= 'By' ( (lv_avoidActions_4_0= ruleDriveAction ) )+ ) )
            // InternalTaskDSL.g:455:2: (otherlv_0= 'Avoid' ( (lv_color_1_0= ruleColor ) )? ( (lv_object_2_0= ruleObject ) ) otherlv_3= 'By' ( (lv_avoidActions_4_0= ruleDriveAction ) )+ )
            {
            // InternalTaskDSL.g:455:2: (otherlv_0= 'Avoid' ( (lv_color_1_0= ruleColor ) )? ( (lv_object_2_0= ruleObject ) ) otherlv_3= 'By' ( (lv_avoidActions_4_0= ruleDriveAction ) )+ )
            // InternalTaskDSL.g:456:3: otherlv_0= 'Avoid' ( (lv_color_1_0= ruleColor ) )? ( (lv_object_2_0= ruleObject ) ) otherlv_3= 'By' ( (lv_avoidActions_4_0= ruleDriveAction ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAvoidAccess().getAvoidKeyword_0());
            		
            // InternalTaskDSL.g:460:3: ( (lv_color_1_0= ruleColor ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=33 && LA5_0<=35)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTaskDSL.g:461:4: (lv_color_1_0= ruleColor )
                    {
                    // InternalTaskDSL.g:461:4: (lv_color_1_0= ruleColor )
                    // InternalTaskDSL.g:462:5: lv_color_1_0= ruleColor
                    {

                    					newCompositeNode(grammarAccess.getAvoidAccess().getColorColorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_10);
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

            // InternalTaskDSL.g:479:3: ( (lv_object_2_0= ruleObject ) )
            // InternalTaskDSL.g:480:4: (lv_object_2_0= ruleObject )
            {
            // InternalTaskDSL.g:480:4: (lv_object_2_0= ruleObject )
            // InternalTaskDSL.g:481:5: lv_object_2_0= ruleObject
            {

            					newCompositeNode(grammarAccess.getAvoidAccess().getObjectObjectEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_3=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getAvoidAccess().getByKeyword_3());
            		
            // InternalTaskDSL.g:502:3: ( (lv_avoidActions_4_0= ruleDriveAction ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=25 && LA6_0<=26)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTaskDSL.g:503:4: (lv_avoidActions_4_0= ruleDriveAction )
            	    {
            	    // InternalTaskDSL.g:503:4: (lv_avoidActions_4_0= ruleDriveAction )
            	    // InternalTaskDSL.g:504:5: lv_avoidActions_4_0= ruleDriveAction
            	    {

            	    					newCompositeNode(grammarAccess.getAvoidAccess().getAvoidActionsDriveActionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_avoidActions_4_0=ruleDriveAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAvoidRule());
            	    					}
            	    					add(
            	    						current,
            	    						"avoidActions",
            	    						lv_avoidActions_4_0,
            	    						"mars.ru.des.robot.TaskDSL.DriveAction");
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
    // $ANTLR end "ruleAvoid"


    // $ANTLR start "entryRuleDriveAction"
    // InternalTaskDSL.g:525:1: entryRuleDriveAction returns [EObject current=null] : iv_ruleDriveAction= ruleDriveAction EOF ;
    public final EObject entryRuleDriveAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriveAction = null;


        try {
            // InternalTaskDSL.g:525:52: (iv_ruleDriveAction= ruleDriveAction EOF )
            // InternalTaskDSL.g:526:2: iv_ruleDriveAction= ruleDriveAction EOF
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
    // InternalTaskDSL.g:532:1: ruleDriveAction returns [EObject current=null] : ( (this_MoveBack_0= ruleMoveBack | this_Turn_1= ruleTurn ) (otherlv_2= 'and' )? ) ;
    public final EObject ruleDriveAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_MoveBack_0 = null;

        EObject this_Turn_1 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:538:2: ( ( (this_MoveBack_0= ruleMoveBack | this_Turn_1= ruleTurn ) (otherlv_2= 'and' )? ) )
            // InternalTaskDSL.g:539:2: ( (this_MoveBack_0= ruleMoveBack | this_Turn_1= ruleTurn ) (otherlv_2= 'and' )? )
            {
            // InternalTaskDSL.g:539:2: ( (this_MoveBack_0= ruleMoveBack | this_Turn_1= ruleTurn ) (otherlv_2= 'and' )? )
            // InternalTaskDSL.g:540:3: (this_MoveBack_0= ruleMoveBack | this_Turn_1= ruleTurn ) (otherlv_2= 'and' )?
            {
            // InternalTaskDSL.g:540:3: (this_MoveBack_0= ruleMoveBack | this_Turn_1= ruleTurn )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTaskDSL.g:541:4: this_MoveBack_0= ruleMoveBack
                    {

                    				newCompositeNode(grammarAccess.getDriveActionAccess().getMoveBackParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_19);
                    this_MoveBack_0=ruleMoveBack();

                    state._fsp--;


                    				current = this_MoveBack_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:550:4: this_Turn_1= ruleTurn
                    {

                    				newCompositeNode(grammarAccess.getDriveActionAccess().getTurnParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_Turn_1=ruleTurn();

                    state._fsp--;


                    				current = this_Turn_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTaskDSL.g:559:3: (otherlv_2= 'and' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTaskDSL.g:560:4: otherlv_2= 'and'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getDriveActionAccess().getAndKeyword_1());
                    			

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
    // InternalTaskDSL.g:569:1: entryRuleMoveBack returns [EObject current=null] : iv_ruleMoveBack= ruleMoveBack EOF ;
    public final EObject entryRuleMoveBack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveBack = null;


        try {
            // InternalTaskDSL.g:569:49: (iv_ruleMoveBack= ruleMoveBack EOF )
            // InternalTaskDSL.g:570:2: iv_ruleMoveBack= ruleMoveBack EOF
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
    // InternalTaskDSL.g:576:1: ruleMoveBack returns [EObject current=null] : (otherlv_0= 'MoveBackwards' ( (lv_meters_1_0= RULE_INT ) ) otherlv_2= 'meters' ) ;
    public final EObject ruleMoveBack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_meters_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:582:2: ( (otherlv_0= 'MoveBackwards' ( (lv_meters_1_0= RULE_INT ) ) otherlv_2= 'meters' ) )
            // InternalTaskDSL.g:583:2: (otherlv_0= 'MoveBackwards' ( (lv_meters_1_0= RULE_INT ) ) otherlv_2= 'meters' )
            {
            // InternalTaskDSL.g:583:2: (otherlv_0= 'MoveBackwards' ( (lv_meters_1_0= RULE_INT ) ) otherlv_2= 'meters' )
            // InternalTaskDSL.g:584:3: otherlv_0= 'MoveBackwards' ( (lv_meters_1_0= RULE_INT ) ) otherlv_2= 'meters'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveBackAccess().getMoveBackwardsKeyword_0());
            		
            // InternalTaskDSL.g:588:3: ( (lv_meters_1_0= RULE_INT ) )
            // InternalTaskDSL.g:589:4: (lv_meters_1_0= RULE_INT )
            {
            // InternalTaskDSL.g:589:4: (lv_meters_1_0= RULE_INT )
            // InternalTaskDSL.g:590:5: lv_meters_1_0= RULE_INT
            {
            lv_meters_1_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTaskDSL.g:614:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalTaskDSL.g:614:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalTaskDSL.g:615:2: iv_ruleTurn= ruleTurn EOF
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
    // InternalTaskDSL.g:621:1: ruleTurn returns [EObject current=null] : (otherlv_0= 'Turn' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_degrees_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:627:2: ( (otherlv_0= 'Turn' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' ) )
            // InternalTaskDSL.g:628:2: (otherlv_0= 'Turn' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' )
            {
            // InternalTaskDSL.g:628:2: (otherlv_0= 'Turn' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees' )
            // InternalTaskDSL.g:629:3: otherlv_0= 'Turn' ( (lv_degrees_1_0= RULE_INT ) ) otherlv_2= 'degrees'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getTurnKeyword_0());
            		
            // InternalTaskDSL.g:633:3: ( (lv_degrees_1_0= RULE_INT ) )
            // InternalTaskDSL.g:634:4: (lv_degrees_1_0= RULE_INT )
            {
            // InternalTaskDSL.g:634:4: (lv_degrees_1_0= RULE_INT )
            // InternalTaskDSL.g:635:5: lv_degrees_1_0= RULE_INT
            {
            lv_degrees_1_0=(Token)match(input,RULE_INT,FOLLOW_20); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

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
    // InternalTaskDSL.g:659:1: ruleObject returns [Enumerator current=null] : ( (enumLiteral_0= 'ROCK' ) | (enumLiteral_1= 'LAKE' ) ) ;
    public final Enumerator ruleObject() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:665:2: ( ( (enumLiteral_0= 'ROCK' ) | (enumLiteral_1= 'LAKE' ) ) )
            // InternalTaskDSL.g:666:2: ( (enumLiteral_0= 'ROCK' ) | (enumLiteral_1= 'LAKE' ) )
            {
            // InternalTaskDSL.g:666:2: ( (enumLiteral_0= 'ROCK' ) | (enumLiteral_1= 'LAKE' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==29) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTaskDSL.g:667:3: (enumLiteral_0= 'ROCK' )
                    {
                    // InternalTaskDSL.g:667:3: (enumLiteral_0= 'ROCK' )
                    // InternalTaskDSL.g:668:4: enumLiteral_0= 'ROCK'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getObjectAccess().getROCKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getObjectAccess().getROCKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:675:3: (enumLiteral_1= 'LAKE' )
                    {
                    // InternalTaskDSL.g:675:3: (enumLiteral_1= 'LAKE' )
                    // InternalTaskDSL.g:676:4: enumLiteral_1= 'LAKE'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

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
    // InternalTaskDSL.g:686:1: ruleSpeed returns [Enumerator current=null] : ( (enumLiteral_0= 'FAST' ) | (enumLiteral_1= 'NORMAL' ) | (enumLiteral_2= 'SLOW' ) ) ;
    public final Enumerator ruleSpeed() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:692:2: ( ( (enumLiteral_0= 'FAST' ) | (enumLiteral_1= 'NORMAL' ) | (enumLiteral_2= 'SLOW' ) ) )
            // InternalTaskDSL.g:693:2: ( (enumLiteral_0= 'FAST' ) | (enumLiteral_1= 'NORMAL' ) | (enumLiteral_2= 'SLOW' ) )
            {
            // InternalTaskDSL.g:693:2: ( (enumLiteral_0= 'FAST' ) | (enumLiteral_1= 'NORMAL' ) | (enumLiteral_2= 'SLOW' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalTaskDSL.g:694:3: (enumLiteral_0= 'FAST' )
                    {
                    // InternalTaskDSL.g:694:3: (enumLiteral_0= 'FAST' )
                    // InternalTaskDSL.g:695:4: enumLiteral_0= 'FAST'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getSpeedAccess().getFASTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSpeedAccess().getFASTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:702:3: (enumLiteral_1= 'NORMAL' )
                    {
                    // InternalTaskDSL.g:702:3: (enumLiteral_1= 'NORMAL' )
                    // InternalTaskDSL.g:703:4: enumLiteral_1= 'NORMAL'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSpeedAccess().getNORMALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSpeedAccess().getNORMALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:710:3: (enumLiteral_2= 'SLOW' )
                    {
                    // InternalTaskDSL.g:710:3: (enumLiteral_2= 'SLOW' )
                    // InternalTaskDSL.g:711:4: enumLiteral_2= 'SLOW'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

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
    // InternalTaskDSL.g:721:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'GREEN' ) | (enumLiteral_2= 'BLUE' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:727:2: ( ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'GREEN' ) | (enumLiteral_2= 'BLUE' ) ) )
            // InternalTaskDSL.g:728:2: ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'GREEN' ) | (enumLiteral_2= 'BLUE' ) )
            {
            // InternalTaskDSL.g:728:2: ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'GREEN' ) | (enumLiteral_2= 'BLUE' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt11=1;
                }
                break;
            case 34:
                {
                alt11=2;
                }
                break;
            case 35:
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
                    // InternalTaskDSL.g:729:3: (enumLiteral_0= 'RED' )
                    {
                    // InternalTaskDSL.g:729:3: (enumLiteral_0= 'RED' )
                    // InternalTaskDSL.g:730:4: enumLiteral_0= 'RED'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:737:3: (enumLiteral_1= 'GREEN' )
                    {
                    // InternalTaskDSL.g:737:3: (enumLiteral_1= 'GREEN' )
                    // InternalTaskDSL.g:738:4: enumLiteral_1= 'GREEN'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:745:3: (enumLiteral_2= 'BLUE' )
                    {
                    // InternalTaskDSL.g:745:3: (enumLiteral_2= 'BLUE' )
                    // InternalTaskDSL.g:746:4: enumLiteral_2= 'BLUE'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000001C0010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000E30000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});

}