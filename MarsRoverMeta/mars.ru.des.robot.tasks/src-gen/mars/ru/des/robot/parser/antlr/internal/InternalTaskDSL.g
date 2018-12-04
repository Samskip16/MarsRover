/*
 * generated by Xtext 2.15.0
 */
grammar InternalTaskDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package mars.ru.des.robot.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTask
entryRuleTask returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskRule()); }
	iv_ruleTask=ruleTask
	{ $current=$iv_ruleTask.current; }
	EOF;

// Rule Task
ruleTask returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Task:'
		{
			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTaskAccess().getActionActionParserRuleCall_2_0());
				}
				lv_action_2_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTaskRule());
					}
					set(
						$current,
						"action",
						lv_action_2_0,
						"mars.ru.des.robot.TaskDSL.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTaskAccess().getDetectorDetectorsParserRuleCall_3_0());
				}
				lv_detector_3_0=ruleDetectors
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTaskRule());
					}
					set(
						$current,
						"detector",
						lv_detector_3_0,
						"mars.ru.des.robot.TaskDSL.Detectors");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='action:'
			{
				newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getActionAccess().getDriveUntilParserRuleCall_0_1());
			}
			this_DriveUntil_1=ruleDriveUntil
			{
				$current = $this_DriveUntil_1.current;
				afterParserOrEnumRuleCall();
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getInvestigateParserRuleCall_1());
		}
		this_Investigate_2=ruleInvestigate
		{
			$current = $this_Investigate_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getSpeakParserRuleCall_2());
		}
		this_Speak_3=ruleSpeak
		{
			$current = $this_Speak_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getFollowLineParserRuleCall_3());
		}
		this_FollowLine_4=ruleFollowLine
		{
			$current = $this_FollowLine_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDetectors
entryRuleDetectors returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDetectorsRule()); }
	iv_ruleDetectors=ruleDetectors
	{ $current=$iv_ruleDetectors.current; }
	EOF;

// Rule Detectors
ruleDetectors returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='detectors:'
		{
			newLeafNode(otherlv_0, grammarAccess.getDetectorsAccess().getDetectorsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDetectorsAccess().getAvoidsAvoidParserRuleCall_1_0());
				}
				lv_avoids_1_0=ruleAvoid
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDetectorsRule());
					}
					add(
						$current,
						"avoids",
						lv_avoids_1_0,
						"mars.ru.des.robot.TaskDSL.Avoid");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleDriveUntil
entryRuleDriveUntil returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDriveUntilRule()); }
	iv_ruleDriveUntil=ruleDriveUntil
	{ $current=$iv_ruleDriveUntil.current; }
	EOF;

// Rule DriveUntil
ruleDriveUntil returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Drive'
		{
			newLeafNode(otherlv_0, grammarAccess.getDriveUntilAccess().getDriveKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDriveUntilAccess().getSpeedSpeedEnumRuleCall_1_0());
				}
				lv_speed_1_0=ruleSpeed
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDriveUntilRule());
					}
					set(
						$current,
						"speed",
						lv_speed_1_0,
						"mars.ru.des.robot.TaskDSL.Speed");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_2='Until'
		{
			newLeafNode(otherlv_2, grammarAccess.getDriveUntilAccess().getUntilKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDriveUntilAccess().getColorColorEnumRuleCall_3_0());
				}
				lv_color_3_0=ruleColor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDriveUntilRule());
					}
					set(
						$current,
						"color",
						lv_color_3_0,
						"mars.ru.des.robot.TaskDSL.Color");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getDriveUntilAccess().getObjectObjectEnumRuleCall_4_0());
				}
				lv_object_4_0=ruleObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDriveUntilRule());
					}
					set(
						$current,
						"object",
						lv_object_4_0,
						"mars.ru.des.robot.TaskDSL.Object");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='Found'
		{
			newLeafNode(otherlv_5, grammarAccess.getDriveUntilAccess().getFoundKeyword_5());
		}
	)
;

// Entry rule entryRuleInvestigate
entryRuleInvestigate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInvestigateRule()); }
	iv_ruleInvestigate=ruleInvestigate
	{ $current=$iv_ruleInvestigate.current; }
	EOF;

// Rule Investigate
ruleInvestigate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Investigate'
		{
			newLeafNode(otherlv_0, grammarAccess.getInvestigateAccess().getInvestigateKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInvestigateAccess().getSpeedSpeedEnumRuleCall_1_0());
				}
				lv_speed_1_0=ruleSpeed
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInvestigateRule());
					}
					set(
						$current,
						"speed",
						lv_speed_1_0,
						"mars.ru.des.robot.TaskDSL.Speed");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSpeak
entryRuleSpeak returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpeakRule()); }
	iv_ruleSpeak=ruleSpeak
	{ $current=$iv_ruleSpeak.current; }
	EOF;

// Rule Speak
ruleSpeak returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Speak'
		{
			newLeafNode(otherlv_0, grammarAccess.getSpeakAccess().getSpeakKeyword_0());
		}
		(
			(
				lv_text_1_0=RULE_STRING
				{
					newLeafNode(lv_text_1_0, grammarAccess.getSpeakAccess().getTextSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSpeakRule());
					}
					setWithLastConsumed(
						$current,
						"text",
						lv_text_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleFollowLine
entryRuleFollowLine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFollowLineRule()); }
	iv_ruleFollowLine=ruleFollowLine
	{ $current=$iv_ruleFollowLine.current; }
	EOF;

// Rule FollowLine
ruleFollowLine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='FindAndFollowLineFor'
		{
			newLeafNode(otherlv_0, grammarAccess.getFollowLineAccess().getFindAndFollowLineForKeyword_0());
		}
		(
			(
				lv_distance_1_0=RULE_INT
				{
					newLeafNode(lv_distance_1_0, grammarAccess.getFollowLineAccess().getDistanceINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFollowLineRule());
					}
					setWithLastConsumed(
						$current,
						"distance",
						lv_distance_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2='meters'
		{
			newLeafNode(otherlv_2, grammarAccess.getFollowLineAccess().getMetersKeyword_2());
		}
	)
;

// Entry rule entryRuleAvoid
entryRuleAvoid returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAvoidRule()); }
	iv_ruleAvoid=ruleAvoid
	{ $current=$iv_ruleAvoid.current; }
	EOF;

// Rule Avoid
ruleAvoid returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Avoid'
		{
			newLeafNode(otherlv_0, grammarAccess.getAvoidAccess().getAvoidKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAvoidAccess().getColorColorEnumRuleCall_1_0());
				}
				lv_color_1_0=ruleColor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAvoidRule());
					}
					set(
						$current,
						"color",
						lv_color_1_0,
						"mars.ru.des.robot.TaskDSL.Color");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getAvoidAccess().getObjectObjectEnumRuleCall_2_0());
				}
				lv_object_2_0=ruleObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAvoidRule());
					}
					set(
						$current,
						"object",
						lv_object_2_0,
						"mars.ru.des.robot.TaskDSL.Object");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='By'
		{
			newLeafNode(otherlv_3, grammarAccess.getAvoidAccess().getByKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAvoidAccess().getAvoidActionsAvoidActionParserRuleCall_4_0());
				}
				lv_avoidActions_4_0=ruleAvoidAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAvoidRule());
					}
					add(
						$current,
						"avoidActions",
						lv_avoidActions_4_0,
						"mars.ru.des.robot.TaskDSL.AvoidAction");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleAvoidAction
entryRuleAvoidAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAvoidActionRule()); }
	iv_ruleAvoidAction=ruleAvoidAction
	{ $current=$iv_ruleAvoidAction.current; }
	EOF;

// Rule AvoidAction
ruleAvoidAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getAvoidActionAccess().getMoveBackParserRuleCall_0_0());
			}
			this_MoveBack_0=ruleMoveBack
			{
				$current = $this_MoveBack_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getAvoidActionAccess().getTurnParserRuleCall_0_1());
			}
			this_Turn_1=ruleTurn
			{
				$current = $this_Turn_1.current;
				afterParserOrEnumRuleCall();
			}
		)
		(
			otherlv_2='and'
			{
				newLeafNode(otherlv_2, grammarAccess.getAvoidActionAccess().getAndKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleMoveBack
entryRuleMoveBack returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMoveBackRule()); }
	iv_ruleMoveBack=ruleMoveBack
	{ $current=$iv_ruleMoveBack.current; }
	EOF;

// Rule MoveBack
ruleMoveBack returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='MoveBackwards'
		{
			newLeafNode(otherlv_0, grammarAccess.getMoveBackAccess().getMoveBackwardsKeyword_0());
		}
		(
			(
				lv_distance_1_0=RULE_INT
				{
					newLeafNode(lv_distance_1_0, grammarAccess.getMoveBackAccess().getDistanceINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMoveBackRule());
					}
					setWithLastConsumed(
						$current,
						"distance",
						lv_distance_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2='meters'
		{
			newLeafNode(otherlv_2, grammarAccess.getMoveBackAccess().getMetersKeyword_2());
		}
	)
;

// Entry rule entryRuleTurn
entryRuleTurn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTurnRule()); }
	iv_ruleTurn=ruleTurn
	{ $current=$iv_ruleTurn.current; }
	EOF;

// Rule Turn
ruleTurn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Turn'
		{
			newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getTurnKeyword_0());
		}
		(
			(
				lv_degrees_1_0=RULE_INT
				{
					newLeafNode(lv_degrees_1_0, grammarAccess.getTurnAccess().getDegreesINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTurnRule());
					}
					setWithLastConsumed(
						$current,
						"degrees",
						lv_degrees_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2='degrees'
		{
			newLeafNode(otherlv_2, grammarAccess.getTurnAccess().getDegreesKeyword_2());
		}
	)
;

// Rule Object
ruleObject returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='ROCK'
			{
				$current = grammarAccess.getObjectAccess().getROCKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getObjectAccess().getROCKEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='LAKE'
			{
				$current = grammarAccess.getObjectAccess().getLAKEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getObjectAccess().getLAKEEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule Speed
ruleSpeed returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='FAST'
			{
				$current = grammarAccess.getSpeedAccess().getFASTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSpeedAccess().getFASTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='NORMAL'
			{
				$current = grammarAccess.getSpeedAccess().getNORMALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSpeedAccess().getNORMALEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='SLOW'
			{
				$current = grammarAccess.getSpeedAccess().getSLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getSpeedAccess().getSLOWEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Color
ruleColor returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='RED'
			{
				$current = grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='GREEN'
			{
				$current = grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='BLUE'
			{
				$current = grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;