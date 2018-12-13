/*
 * generated by Xtext 2.15.0
 */
grammar InternalTaskDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package mars.ru.des.robot.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleDSL
entryRuleDSL
:
{ before(grammarAccess.getDSLRule()); }
	 ruleDSL
{ after(grammarAccess.getDSLRule()); } 
	 EOF 
;

// Rule DSL
ruleDSL 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDSLAccess().getGroup()); }
		(rule__DSL__Group__0)
		{ after(grammarAccess.getDSLAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMission
entryRuleMission
:
{ before(grammarAccess.getMissionRule()); }
	 ruleMission
{ after(grammarAccess.getMissionRule()); } 
	 EOF 
;

// Rule Mission
ruleMission 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMissionAccess().getGroup()); }
		(rule__Mission__Group__0)
		{ after(grammarAccess.getMissionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTask
entryRuleTask
:
{ before(grammarAccess.getTaskRule()); }
	 ruleTask
{ after(grammarAccess.getTaskRule()); } 
	 EOF 
;

// Rule Task
ruleTask 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTaskAccess().getGroup()); }
		(rule__Task__Group__0)
		{ after(grammarAccess.getTaskAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAction
entryRuleAction
:
{ before(grammarAccess.getActionRule()); }
	 ruleAction
{ after(grammarAccess.getActionRule()); } 
	 EOF 
;

// Rule Action
ruleAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActionAccess().getAlternatives()); }
		(rule__Action__Alternatives)
		{ after(grammarAccess.getActionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDetector
entryRuleDetector
:
{ before(grammarAccess.getDetectorRule()); }
	 ruleDetector
{ after(grammarAccess.getDetectorRule()); } 
	 EOF 
;

// Rule Detector
ruleDetector 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDetectorAccess().getGroup()); }
		(rule__Detector__Group__0)
		{ after(grammarAccess.getDetectorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDriveUntil
entryRuleDriveUntil
:
{ before(grammarAccess.getDriveUntilRule()); }
	 ruleDriveUntil
{ after(grammarAccess.getDriveUntilRule()); } 
	 EOF 
;

// Rule DriveUntil
ruleDriveUntil 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDriveUntilAccess().getGroup()); }
		(rule__DriveUntil__Group__0)
		{ after(grammarAccess.getDriveUntilAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInvestigate
entryRuleInvestigate
:
{ before(grammarAccess.getInvestigateRule()); }
	 ruleInvestigate
{ after(grammarAccess.getInvestigateRule()); } 
	 EOF 
;

// Rule Investigate
ruleInvestigate 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInvestigateAccess().getGroup()); }
		(rule__Investigate__Group__0)
		{ after(grammarAccess.getInvestigateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSpeak
entryRuleSpeak
:
{ before(grammarAccess.getSpeakRule()); }
	 ruleSpeak
{ after(grammarAccess.getSpeakRule()); } 
	 EOF 
;

// Rule Speak
ruleSpeak 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSpeakAccess().getGroup()); }
		(rule__Speak__Group__0)
		{ after(grammarAccess.getSpeakAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFollowLine
entryRuleFollowLine
:
{ before(grammarAccess.getFollowLineRule()); }
	 ruleFollowLine
{ after(grammarAccess.getFollowLineRule()); } 
	 EOF 
;

// Rule FollowLine
ruleFollowLine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFollowLineAccess().getGroup()); }
		(rule__FollowLine__Group__0)
		{ after(grammarAccess.getFollowLineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAvoid
entryRuleAvoid
:
{ before(grammarAccess.getAvoidRule()); }
	 ruleAvoid
{ after(grammarAccess.getAvoidRule()); } 
	 EOF 
;

// Rule Avoid
ruleAvoid 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAvoidAccess().getGroup()); }
		(rule__Avoid__Group__0)
		{ after(grammarAccess.getAvoidAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDriveAction
entryRuleDriveAction
:
{ before(grammarAccess.getDriveActionRule()); }
	 ruleDriveAction
{ after(grammarAccess.getDriveActionRule()); } 
	 EOF 
;

// Rule DriveAction
ruleDriveAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDriveActionAccess().getGroup()); }
		(rule__DriveAction__Group__0)
		{ after(grammarAccess.getDriveActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMoveBack
entryRuleMoveBack
:
{ before(grammarAccess.getMoveBackRule()); }
	 ruleMoveBack
{ after(grammarAccess.getMoveBackRule()); } 
	 EOF 
;

// Rule MoveBack
ruleMoveBack 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMoveBackAccess().getGroup()); }
		(rule__MoveBack__Group__0)
		{ after(grammarAccess.getMoveBackAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTurnLeft
entryRuleTurnLeft
:
{ before(grammarAccess.getTurnLeftRule()); }
	 ruleTurnLeft
{ after(grammarAccess.getTurnLeftRule()); } 
	 EOF 
;

// Rule TurnLeft
ruleTurnLeft 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTurnLeftAccess().getGroup()); }
		(rule__TurnLeft__Group__0)
		{ after(grammarAccess.getTurnLeftAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTurnRight
entryRuleTurnRight
:
{ before(grammarAccess.getTurnRightRule()); }
	 ruleTurnRight
{ after(grammarAccess.getTurnRightRule()); } 
	 EOF 
;

// Rule TurnRight
ruleTurnRight 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTurnRightAccess().getGroup()); }
		(rule__TurnRight__Group__0)
		{ after(grammarAccess.getTurnRightAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Object
ruleObject
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObjectAccess().getAlternatives()); }
		(rule__Object__Alternatives)
		{ after(grammarAccess.getObjectAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Speed
ruleSpeed
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpeedAccess().getAlternatives()); }
		(rule__Speed__Alternatives)
		{ after(grammarAccess.getSpeedAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Color
ruleColor
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColorAccess().getAlternatives()); }
		(rule__Color__Alternatives)
		{ after(grammarAccess.getColorAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getGroup_0()); }
		(rule__Action__Group_0__0)
		{ after(grammarAccess.getActionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getInvestigateParserRuleCall_1()); }
		ruleInvestigate
		{ after(grammarAccess.getActionAccess().getInvestigateParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getSpeakParserRuleCall_2()); }
		ruleSpeak
		{ after(grammarAccess.getActionAccess().getSpeakParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getFollowLineParserRuleCall_3()); }
		ruleFollowLine
		{ after(grammarAccess.getActionAccess().getFollowLineParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveAction__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDriveActionAccess().getMoveBackParserRuleCall_0_0()); }
		ruleMoveBack
		{ after(grammarAccess.getDriveActionAccess().getMoveBackParserRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getDriveActionAccess().getTurnLeftParserRuleCall_0_1()); }
		ruleTurnLeft
		{ after(grammarAccess.getDriveActionAccess().getTurnLeftParserRuleCall_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getDriveActionAccess().getTurnRightParserRuleCall_0_2()); }
		ruleTurnRight
		{ after(grammarAccess.getDriveActionAccess().getTurnRightParserRuleCall_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObjectAccess().getROCKEnumLiteralDeclaration_0()); }
		('ROCK')
		{ after(grammarAccess.getObjectAccess().getROCKEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getObjectAccess().getLAKEEnumLiteralDeclaration_1()); }
		('LAKE')
		{ after(grammarAccess.getObjectAccess().getLAKEEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Speed__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpeedAccess().getFASTEnumLiteralDeclaration_0()); }
		('FAST')
		{ after(grammarAccess.getSpeedAccess().getFASTEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getSpeedAccess().getNORMALEnumLiteralDeclaration_1()); }
		('NORMAL')
		{ after(grammarAccess.getSpeedAccess().getNORMALEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getSpeedAccess().getSLOWEnumLiteralDeclaration_2()); }
		('SLOW')
		{ after(grammarAccess.getSpeedAccess().getSLOWEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Color__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0()); }
		('RED')
		{ after(grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_1()); }
		('GREEN')
		{ after(grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_2()); }
		('BLUE')
		{ after(grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DSL__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DSL__Group__0__Impl
	rule__DSL__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DSL__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDSLAccess().getMissionsAssignment_0()); }
	(rule__DSL__MissionsAssignment_0)*
	{ after(grammarAccess.getDSLAccess().getMissionsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DSL__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DSL__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DSL__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDSLAccess().getTasksAssignment_1()); }
	(rule__DSL__TasksAssignment_1)*
	{ after(grammarAccess.getDSLAccess().getTasksAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__0__Impl
	rule__Mission__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getMissionKeyword_0()); }
	'Mission:'
	{ after(grammarAccess.getMissionAccess().getMissionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__1__Impl
	rule__Mission__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getNameAssignment_1()); }
	(rule__Mission__NameAssignment_1)
	{ after(grammarAccess.getMissionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__2__Impl
	rule__Mission__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getTasksKeyword_2()); }
	'tasks:'
	{ after(grammarAccess.getMissionAccess().getTasksKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getMissionAccess().getTasksAssignment_3()); }
		(rule__Mission__TasksAssignment_3)
		{ after(grammarAccess.getMissionAccess().getTasksAssignment_3()); }
	)
	(
		{ before(grammarAccess.getMissionAccess().getTasksAssignment_3()); }
		(rule__Mission__TasksAssignment_3)*
		{ after(grammarAccess.getMissionAccess().getTasksAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Task__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group__0__Impl
	rule__Task__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getTaskKeyword_0()); }
	'Task:'
	{ after(grammarAccess.getTaskAccess().getTaskKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group__1__Impl
	rule__Task__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getNameAssignment_1()); }
	(rule__Task__NameAssignment_1)
	{ after(grammarAccess.getTaskAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group__2__Impl
	rule__Task__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getActionAssignment_2()); }
	(rule__Task__ActionAssignment_2)
	{ after(grammarAccess.getTaskAccess().getActionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getDetectorAssignment_3()); }
	(rule__Task__DetectorAssignment_3)?
	{ after(grammarAccess.getTaskAccess().getDetectorAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Action__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_0__0__Impl
	rule__Action__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getActionKeyword_0_0()); }
	'action:'
	{ after(grammarAccess.getActionAccess().getActionKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getDriveUntilParserRuleCall_0_1()); }
	ruleDriveUntil
	{ after(grammarAccess.getActionAccess().getDriveUntilParserRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Detector__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Detector__Group__0__Impl
	rule__Detector__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Detector__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDetectorAccess().getDetectorsKeyword_0()); }
	'detectors:'
	{ after(grammarAccess.getDetectorAccess().getDetectorsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Detector__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Detector__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Detector__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDetectorAccess().getAvoidersAssignment_1()); }
		(rule__Detector__AvoidersAssignment_1)
		{ after(grammarAccess.getDetectorAccess().getAvoidersAssignment_1()); }
	)
	(
		{ before(grammarAccess.getDetectorAccess().getAvoidersAssignment_1()); }
		(rule__Detector__AvoidersAssignment_1)*
		{ after(grammarAccess.getDetectorAccess().getAvoidersAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DriveUntil__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DriveUntil__Group__0__Impl
	rule__DriveUntil__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveUntil__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDriveUntilAccess().getDriveKeyword_0()); }
	'Drive'
	{ after(grammarAccess.getDriveUntilAccess().getDriveKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveUntil__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DriveUntil__Group__1__Impl
	rule__DriveUntil__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveUntil__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDriveUntilAccess().getSpeedAssignment_1()); }
	(rule__DriveUntil__SpeedAssignment_1)?
	{ after(grammarAccess.getDriveUntilAccess().getSpeedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveUntil__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DriveUntil__Group__2__Impl
	rule__DriveUntil__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveUntil__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDriveUntilAccess().getUntilKeyword_2()); }
	'Until'
	{ after(grammarAccess.getDriveUntilAccess().getUntilKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveUntil__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DriveUntil__Group__3__Impl
	rule__DriveUntil__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveUntil__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDriveUntilAccess().getColorAssignment_3()); }
	(rule__DriveUntil__ColorAssignment_3)?
	{ after(grammarAccess.getDriveUntilAccess().getColorAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveUntil__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DriveUntil__Group__4__Impl
	rule__DriveUntil__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveUntil__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDriveUntilAccess().getObjectAssignment_4()); }
	(rule__DriveUntil__ObjectAssignment_4)
	{ after(grammarAccess.getDriveUntilAccess().getObjectAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveUntil__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DriveUntil__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveUntil__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDriveUntilAccess().getFoundKeyword_5()); }
	'Found'
	{ after(grammarAccess.getDriveUntilAccess().getFoundKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Investigate__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Investigate__Group__0__Impl
	rule__Investigate__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Investigate__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInvestigateAccess().getInvestigateKeyword_0()); }
	'Investigate'
	{ after(grammarAccess.getInvestigateAccess().getInvestigateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Investigate__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Investigate__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Investigate__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInvestigateAccess().getSpeedAssignment_1()); }
	(rule__Investigate__SpeedAssignment_1)
	{ after(grammarAccess.getInvestigateAccess().getSpeedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Speak__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Speak__Group__0__Impl
	rule__Speak__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Speak__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpeakAccess().getSpeakKeyword_0()); }
	'Speak'
	{ after(grammarAccess.getSpeakAccess().getSpeakKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Speak__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Speak__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Speak__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpeakAccess().getTextAssignment_1()); }
	(rule__Speak__TextAssignment_1)
	{ after(grammarAccess.getSpeakAccess().getTextAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FollowLine__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FollowLine__Group__0__Impl
	rule__FollowLine__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowLine__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFollowLineAccess().getFindAndFollowLineForKeyword_0()); }
	'FindAndFollowLineFor'
	{ after(grammarAccess.getFollowLineAccess().getFindAndFollowLineForKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowLine__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FollowLine__Group__1__Impl
	rule__FollowLine__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowLine__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFollowLineAccess().getDistanceAssignment_1()); }
	(rule__FollowLine__DistanceAssignment_1)
	{ after(grammarAccess.getFollowLineAccess().getDistanceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowLine__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FollowLine__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowLine__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFollowLineAccess().getMetersKeyword_2()); }
	'meters'
	{ after(grammarAccess.getFollowLineAccess().getMetersKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Avoid__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Avoid__Group__0__Impl
	rule__Avoid__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Avoid__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAvoidAccess().getAvoidKeyword_0()); }
	'Avoid'
	{ after(grammarAccess.getAvoidAccess().getAvoidKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Avoid__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Avoid__Group__1__Impl
	rule__Avoid__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Avoid__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAvoidAccess().getColorAssignment_1()); }
	(rule__Avoid__ColorAssignment_1)?
	{ after(grammarAccess.getAvoidAccess().getColorAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Avoid__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Avoid__Group__2__Impl
	rule__Avoid__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Avoid__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAvoidAccess().getObjectAssignment_2()); }
	(rule__Avoid__ObjectAssignment_2)
	{ after(grammarAccess.getAvoidAccess().getObjectAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Avoid__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Avoid__Group__3__Impl
	rule__Avoid__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Avoid__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAvoidAccess().getByKeyword_3()); }
	'By'
	{ after(grammarAccess.getAvoidAccess().getByKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Avoid__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Avoid__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Avoid__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getAvoidAccess().getDriveActionsAssignment_4()); }
		(rule__Avoid__DriveActionsAssignment_4)
		{ after(grammarAccess.getAvoidAccess().getDriveActionsAssignment_4()); }
	)
	(
		{ before(grammarAccess.getAvoidAccess().getDriveActionsAssignment_4()); }
		(rule__Avoid__DriveActionsAssignment_4)*
		{ after(grammarAccess.getAvoidAccess().getDriveActionsAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DriveAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DriveAction__Group__0__Impl
	rule__DriveAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDriveActionAccess().getAlternatives_0()); }
	(rule__DriveAction__Alternatives_0)
	{ after(grammarAccess.getDriveActionAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DriveAction__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDriveActionAccess().getAndKeyword_1()); }
	('and')?
	{ after(grammarAccess.getDriveActionAccess().getAndKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MoveBack__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveBack__Group__0__Impl
	rule__MoveBack__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveBack__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveBackAccess().getMoveBackwardsKeyword_0()); }
	'MoveBackwards'
	{ after(grammarAccess.getMoveBackAccess().getMoveBackwardsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveBack__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveBack__Group__1__Impl
	rule__MoveBack__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveBack__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveBackAccess().getMetersAssignment_1()); }
	(rule__MoveBack__MetersAssignment_1)
	{ after(grammarAccess.getMoveBackAccess().getMetersAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveBack__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveBack__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveBack__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveBackAccess().getMetersKeyword_2()); }
	'meters'
	{ after(grammarAccess.getMoveBackAccess().getMetersKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TurnLeft__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnLeft__Group__0__Impl
	rule__TurnLeft__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnLeftAccess().getTurnLeftKeyword_0()); }
	'TurnLeft'
	{ after(grammarAccess.getTurnLeftAccess().getTurnLeftKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnLeft__Group__1__Impl
	rule__TurnLeft__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnLeftAccess().getDegreesAssignment_1()); }
	(rule__TurnLeft__DegreesAssignment_1)
	{ after(grammarAccess.getTurnLeftAccess().getDegreesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnLeft__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnLeftAccess().getDegreesKeyword_2()); }
	'degrees'
	{ after(grammarAccess.getTurnLeftAccess().getDegreesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TurnRight__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnRight__Group__0__Impl
	rule__TurnRight__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnRightAccess().getTurnRightKeyword_0()); }
	'TurnRight'
	{ after(grammarAccess.getTurnRightAccess().getTurnRightKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnRight__Group__1__Impl
	rule__TurnRight__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnRightAccess().getDegreesAssignment_1()); }
	(rule__TurnRight__DegreesAssignment_1)
	{ after(grammarAccess.getTurnRightAccess().getDegreesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnRight__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnRightAccess().getDegreesKeyword_2()); }
	'degrees'
	{ after(grammarAccess.getTurnRightAccess().getDegreesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DSL__MissionsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDSLAccess().getMissionsMissionParserRuleCall_0_0()); }
		ruleMission
		{ after(grammarAccess.getDSLAccess().getMissionsMissionParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DSL__TasksAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDSLAccess().getTasksTaskParserRuleCall_1_0()); }
		ruleTask
		{ after(grammarAccess.getDSLAccess().getTasksTaskParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__TasksAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getTasksTaskCrossReference_3_0()); }
		(
			{ before(grammarAccess.getMissionAccess().getTasksTaskIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getMissionAccess().getTasksTaskIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getMissionAccess().getTasksTaskCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__ActionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskAccess().getActionActionParserRuleCall_2_0()); }
		ruleAction
		{ after(grammarAccess.getTaskAccess().getActionActionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__DetectorAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskAccess().getDetectorDetectorParserRuleCall_3_0()); }
		ruleDetector
		{ after(grammarAccess.getTaskAccess().getDetectorDetectorParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Detector__AvoidersAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDetectorAccess().getAvoidersAvoidParserRuleCall_1_0()); }
		ruleAvoid
		{ after(grammarAccess.getDetectorAccess().getAvoidersAvoidParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveUntil__SpeedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDriveUntilAccess().getSpeedSpeedEnumRuleCall_1_0()); }
		ruleSpeed
		{ after(grammarAccess.getDriveUntilAccess().getSpeedSpeedEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveUntil__ColorAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDriveUntilAccess().getColorColorEnumRuleCall_3_0()); }
		ruleColor
		{ after(grammarAccess.getDriveUntilAccess().getColorColorEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DriveUntil__ObjectAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDriveUntilAccess().getObjectObjectEnumRuleCall_4_0()); }
		ruleObject
		{ after(grammarAccess.getDriveUntilAccess().getObjectObjectEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Investigate__SpeedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInvestigateAccess().getSpeedSpeedEnumRuleCall_1_0()); }
		ruleSpeed
		{ after(grammarAccess.getInvestigateAccess().getSpeedSpeedEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Speak__TextAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpeakAccess().getTextSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getSpeakAccess().getTextSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowLine__DistanceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFollowLineAccess().getDistanceINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getFollowLineAccess().getDistanceINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Avoid__ColorAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAvoidAccess().getColorColorEnumRuleCall_1_0()); }
		ruleColor
		{ after(grammarAccess.getAvoidAccess().getColorColorEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Avoid__ObjectAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAvoidAccess().getObjectObjectEnumRuleCall_2_0()); }
		ruleObject
		{ after(grammarAccess.getAvoidAccess().getObjectObjectEnumRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Avoid__DriveActionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAvoidAccess().getDriveActionsDriveActionParserRuleCall_4_0()); }
		ruleDriveAction
		{ after(grammarAccess.getAvoidAccess().getDriveActionsDriveActionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveBack__MetersAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveBackAccess().getMetersINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getMoveBackAccess().getMetersINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__DegreesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTurnLeftAccess().getDegreesINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getTurnLeftAccess().getDegreesINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__DegreesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTurnRightAccess().getDegreesINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getTurnRightAccess().getDegreesINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
