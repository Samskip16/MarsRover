/*
 * generated by Xtext 2.15.0
 */
package mars.ru.des.robot.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TaskDSLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TaskElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.ru.des.robot.TaskDSL.Task");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTaskKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cActionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cActionActionParserRuleCall_2_0 = (RuleCall)cActionAssignment_2.eContents().get(0);
		private final Assignment cDetectorAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDetectorDetectorsParserRuleCall_3_0 = (RuleCall)cDetectorAssignment_3.eContents().get(0);
		
		//Task:
		//	'Task:' name=ID
		//	action=Action
		//	detector=Detectors?;
		@Override public ParserRule getRule() { return rule; }
		
		//'Task:' name=ID action=Action detector=Detectors?
		public Group getGroup() { return cGroup; }
		
		//'Task:'
		public Keyword getTaskKeyword_0() { return cTaskKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//action=Action
		public Assignment getActionAssignment_2() { return cActionAssignment_2; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_2_0() { return cActionActionParserRuleCall_2_0; }
		
		//detector=Detectors?
		public Assignment getDetectorAssignment_3() { return cDetectorAssignment_3; }
		
		//Detectors
		public RuleCall getDetectorDetectorsParserRuleCall_3_0() { return cDetectorDetectorsParserRuleCall_3_0; }
	}
	public class MissionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.ru.des.robot.TaskDSL.Mission");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMissionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cTasksKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTasksAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTasksTaskCrossReference_3_0 = (CrossReference)cTasksAssignment_3.eContents().get(0);
		private final RuleCall cTasksTaskIDTerminalRuleCall_3_0_1 = (RuleCall)cTasksTaskCrossReference_3_0.eContents().get(1);
		
		//Mission:
		//	'Mission:' name=ID
		//	"tasks:" tasks=[Task];
		@Override public ParserRule getRule() { return rule; }
		
		//'Mission:' name=ID "tasks:" tasks=[Task]
		public Group getGroup() { return cGroup; }
		
		//'Mission:'
		public Keyword getMissionKeyword_0() { return cMissionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"tasks:"
		public Keyword getTasksKeyword_2() { return cTasksKeyword_2; }
		
		//tasks=[Task]
		public Assignment getTasksAssignment_3() { return cTasksAssignment_3; }
		
		//[Task]
		public CrossReference getTasksTaskCrossReference_3_0() { return cTasksTaskCrossReference_3_0; }
		
		//ID
		public RuleCall getTasksTaskIDTerminalRuleCall_3_0_1() { return cTasksTaskIDTerminalRuleCall_3_0_1; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.ru.des.robot.TaskDSL.Action");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cActionKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cDriveUntilParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cInvestigateParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSpeakParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cFollowLineParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Action:
		//	'action:'
		//	DriveUntil | Investigate | Speak | FollowLine;
		@Override public ParserRule getRule() { return rule; }
		
		//'action:' DriveUntil | Investigate | Speak | FollowLine
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'action:' DriveUntil
		public Group getGroup_0() { return cGroup_0; }
		
		//'action:'
		public Keyword getActionKeyword_0_0() { return cActionKeyword_0_0; }
		
		//DriveUntil
		public RuleCall getDriveUntilParserRuleCall_0_1() { return cDriveUntilParserRuleCall_0_1; }
		
		//Investigate
		public RuleCall getInvestigateParserRuleCall_1() { return cInvestigateParserRuleCall_1; }
		
		//Speak
		public RuleCall getSpeakParserRuleCall_2() { return cSpeakParserRuleCall_2; }
		
		//FollowLine
		public RuleCall getFollowLineParserRuleCall_3() { return cFollowLineParserRuleCall_3; }
	}
	public class DetectorsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.ru.des.robot.TaskDSL.Detectors");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDetectorsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAvoidsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAvoidsAvoidParserRuleCall_1_0 = (RuleCall)cAvoidsAssignment_1.eContents().get(0);
		
		//Detectors:
		//	'detectors:'
		//	avoids+=Avoid+;
		@Override public ParserRule getRule() { return rule; }
		
		//'detectors:' avoids+=Avoid+
		public Group getGroup() { return cGroup; }
		
		//'detectors:'
		public Keyword getDetectorsKeyword_0() { return cDetectorsKeyword_0; }
		
		//avoids+=Avoid+
		public Assignment getAvoidsAssignment_1() { return cAvoidsAssignment_1; }
		
		//Avoid
		public RuleCall getAvoidsAvoidParserRuleCall_1_0() { return cAvoidsAvoidParserRuleCall_1_0; }
	}
	public class DriveUntilElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.ru.des.robot.TaskDSL.DriveUntil");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDriveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSpeedAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpeedSpeedEnumRuleCall_1_0 = (RuleCall)cSpeedAssignment_1.eContents().get(0);
		private final Keyword cUntilKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cColorAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cColorColorEnumRuleCall_3_0 = (RuleCall)cColorAssignment_3.eContents().get(0);
		private final Assignment cObjectAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cObjectObjectEnumRuleCall_4_0 = (RuleCall)cObjectAssignment_4.eContents().get(0);
		private final Keyword cFoundKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DriveUntil:
		//	'Drive'
		//	speed=Speed?
		//	'Until'
		//	color=Color?
		//	object=Object
		//	'Found';
		@Override public ParserRule getRule() { return rule; }
		
		//'Drive' speed=Speed? 'Until' color=Color? object=Object 'Found'
		public Group getGroup() { return cGroup; }
		
		//'Drive'
		public Keyword getDriveKeyword_0() { return cDriveKeyword_0; }
		
		//speed=Speed?
		public Assignment getSpeedAssignment_1() { return cSpeedAssignment_1; }
		
		//Speed
		public RuleCall getSpeedSpeedEnumRuleCall_1_0() { return cSpeedSpeedEnumRuleCall_1_0; }
		
		//'Until'
		public Keyword getUntilKeyword_2() { return cUntilKeyword_2; }
		
		//color=Color?
		public Assignment getColorAssignment_3() { return cColorAssignment_3; }
		
		//Color
		public RuleCall getColorColorEnumRuleCall_3_0() { return cColorColorEnumRuleCall_3_0; }
		
		//object=Object
		public Assignment getObjectAssignment_4() { return cObjectAssignment_4; }
		
		//Object
		public RuleCall getObjectObjectEnumRuleCall_4_0() { return cObjectObjectEnumRuleCall_4_0; }
		
		//'Found'
		public Keyword getFoundKeyword_5() { return cFoundKeyword_5; }
	}
	public class InvestigateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.ru.des.robot.TaskDSL.Investigate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInvestigateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSpeedAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpeedSpeedEnumRuleCall_1_0 = (RuleCall)cSpeedAssignment_1.eContents().get(0);
		
		//Investigate:
		//	'Investigate'
		//	speed=Speed;
		@Override public ParserRule getRule() { return rule; }
		
		//'Investigate' speed=Speed
		public Group getGroup() { return cGroup; }
		
		//'Investigate'
		public Keyword getInvestigateKeyword_0() { return cInvestigateKeyword_0; }
		
		//speed=Speed
		public Assignment getSpeedAssignment_1() { return cSpeedAssignment_1; }
		
		//Speed
		public RuleCall getSpeedSpeedEnumRuleCall_1_0() { return cSpeedSpeedEnumRuleCall_1_0; }
	}
	public class SpeakElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.ru.des.robot.TaskDSL.Speak");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpeakKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextSTRINGTerminalRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		
		//Speak:
		//	'Speak'
		//	text=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'Speak' text=STRING
		public Group getGroup() { return cGroup; }
		
		//'Speak'
		public Keyword getSpeakKeyword_0() { return cSpeakKeyword_0; }
		
		//text=STRING
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_1_0() { return cTextSTRINGTerminalRuleCall_1_0; }
	}
	public class FollowLineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.ru.des.robot.TaskDSL.FollowLine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFindAndFollowLineForKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDistanceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDistanceINTTerminalRuleCall_1_0 = (RuleCall)cDistanceAssignment_1.eContents().get(0);
		private final Keyword cMetersKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//FollowLine:
		//	'FindAndFollowLineFor'
		//	distance=INT 'meters';
		@Override public ParserRule getRule() { return rule; }
		
		//'FindAndFollowLineFor' distance=INT 'meters'
		public Group getGroup() { return cGroup; }
		
		//'FindAndFollowLineFor'
		public Keyword getFindAndFollowLineForKeyword_0() { return cFindAndFollowLineForKeyword_0; }
		
		//distance=INT
		public Assignment getDistanceAssignment_1() { return cDistanceAssignment_1; }
		
		//INT
		public RuleCall getDistanceINTTerminalRuleCall_1_0() { return cDistanceINTTerminalRuleCall_1_0; }
		
		//'meters'
		public Keyword getMetersKeyword_2() { return cMetersKeyword_2; }
	}
	public class AvoidElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.ru.des.robot.TaskDSL.Avoid");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAvoidKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cColorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cColorColorEnumRuleCall_1_0 = (RuleCall)cColorAssignment_1.eContents().get(0);
		private final Assignment cObjectAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cObjectObjectEnumRuleCall_2_0 = (RuleCall)cObjectAssignment_2.eContents().get(0);
		private final Keyword cByKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAvoidActionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAvoidActionsAvoidActionParserRuleCall_4_0 = (RuleCall)cAvoidActionsAssignment_4.eContents().get(0);
		
		//Avoid:
		//	'Avoid'
		//	color=Color?
		//	object=Object
		//	'By'
		//	avoidActions+=AvoidAction+;
		@Override public ParserRule getRule() { return rule; }
		
		//'Avoid' color=Color? object=Object 'By' avoidActions+=AvoidAction+
		public Group getGroup() { return cGroup; }
		
		//'Avoid'
		public Keyword getAvoidKeyword_0() { return cAvoidKeyword_0; }
		
		//color=Color?
		public Assignment getColorAssignment_1() { return cColorAssignment_1; }
		
		//Color
		public RuleCall getColorColorEnumRuleCall_1_0() { return cColorColorEnumRuleCall_1_0; }
		
		//object=Object
		public Assignment getObjectAssignment_2() { return cObjectAssignment_2; }
		
		//Object
		public RuleCall getObjectObjectEnumRuleCall_2_0() { return cObjectObjectEnumRuleCall_2_0; }
		
		//'By'
		public Keyword getByKeyword_3() { return cByKeyword_3; }
		
		//avoidActions+=AvoidAction+
		public Assignment getAvoidActionsAssignment_4() { return cAvoidActionsAssignment_4; }
		
		//AvoidAction
		public RuleCall getAvoidActionsAvoidActionParserRuleCall_4_0() { return cAvoidActionsAvoidActionParserRuleCall_4_0; }
	}
	public class AvoidActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.ru.des.robot.TaskDSL.AvoidAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cMoveBackParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cTurnParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final Keyword cAndKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//AvoidAction:
		//	(MoveBack | Turn) 'and'?;
		@Override public ParserRule getRule() { return rule; }
		
		//(MoveBack | Turn) 'and'?
		public Group getGroup() { return cGroup; }
		
		//MoveBack | Turn
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//MoveBack
		public RuleCall getMoveBackParserRuleCall_0_0() { return cMoveBackParserRuleCall_0_0; }
		
		//Turn
		public RuleCall getTurnParserRuleCall_0_1() { return cTurnParserRuleCall_0_1; }
		
		//'and'?
		public Keyword getAndKeyword_1() { return cAndKeyword_1; }
	}
	public class MoveBackElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.ru.des.robot.TaskDSL.MoveBack");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMoveBackwardsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDistanceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDistanceINTTerminalRuleCall_1_0 = (RuleCall)cDistanceAssignment_1.eContents().get(0);
		private final Keyword cMetersKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//MoveBack:
		//	'MoveBackwards'
		//	distance=INT 'meters';
		@Override public ParserRule getRule() { return rule; }
		
		//'MoveBackwards' distance=INT 'meters'
		public Group getGroup() { return cGroup; }
		
		//'MoveBackwards'
		public Keyword getMoveBackwardsKeyword_0() { return cMoveBackwardsKeyword_0; }
		
		//distance=INT
		public Assignment getDistanceAssignment_1() { return cDistanceAssignment_1; }
		
		//INT
		public RuleCall getDistanceINTTerminalRuleCall_1_0() { return cDistanceINTTerminalRuleCall_1_0; }
		
		//'meters'
		public Keyword getMetersKeyword_2() { return cMetersKeyword_2; }
	}
	public class TurnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.ru.des.robot.TaskDSL.Turn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTurnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDegreesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDegreesINTTerminalRuleCall_1_0 = (RuleCall)cDegreesAssignment_1.eContents().get(0);
		private final Keyword cDegreesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Turn:
		//	'Turn'
		//	degrees=INT 'degrees';
		@Override public ParserRule getRule() { return rule; }
		
		//'Turn' degrees=INT 'degrees'
		public Group getGroup() { return cGroup; }
		
		//'Turn'
		public Keyword getTurnKeyword_0() { return cTurnKeyword_0; }
		
		//degrees=INT
		public Assignment getDegreesAssignment_1() { return cDegreesAssignment_1; }
		
		//INT
		public RuleCall getDegreesINTTerminalRuleCall_1_0() { return cDegreesINTTerminalRuleCall_1_0; }
		
		//'degrees'
		public Keyword getDegreesKeyword_2() { return cDegreesKeyword_2; }
	}
	
	public class ObjectElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "mars.ru.des.robot.TaskDSL.Object");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cROCKEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cROCKROCKKeyword_0_0 = (Keyword)cROCKEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLAKEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLAKELAKEKeyword_1_0 = (Keyword)cLAKEEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Object:
		//	ROCK | LAKE;
		public EnumRule getRule() { return rule; }
		
		//ROCK | LAKE
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ROCK
		public EnumLiteralDeclaration getROCKEnumLiteralDeclaration_0() { return cROCKEnumLiteralDeclaration_0; }
		
		//"ROCK"
		public Keyword getROCKROCKKeyword_0_0() { return cROCKROCKKeyword_0_0; }
		
		//LAKE
		public EnumLiteralDeclaration getLAKEEnumLiteralDeclaration_1() { return cLAKEEnumLiteralDeclaration_1; }
		
		//"LAKE"
		public Keyword getLAKELAKEKeyword_1_0() { return cLAKELAKEKeyword_1_0; }
	}
	public class SpeedElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "mars.ru.des.robot.TaskDSL.Speed");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cFASTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cFASTFASTKeyword_0_0 = (Keyword)cFASTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cNORMALEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cNORMALNORMALKeyword_1_0 = (Keyword)cNORMALEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSLOWEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSLOWSLOWKeyword_2_0 = (Keyword)cSLOWEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Speed:
		//	FAST | NORMAL | SLOW;
		public EnumRule getRule() { return rule; }
		
		//FAST | NORMAL | SLOW
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//FAST
		public EnumLiteralDeclaration getFASTEnumLiteralDeclaration_0() { return cFASTEnumLiteralDeclaration_0; }
		
		//"FAST"
		public Keyword getFASTFASTKeyword_0_0() { return cFASTFASTKeyword_0_0; }
		
		//NORMAL
		public EnumLiteralDeclaration getNORMALEnumLiteralDeclaration_1() { return cNORMALEnumLiteralDeclaration_1; }
		
		//"NORMAL"
		public Keyword getNORMALNORMALKeyword_1_0() { return cNORMALNORMALKeyword_1_0; }
		
		//SLOW
		public EnumLiteralDeclaration getSLOWEnumLiteralDeclaration_2() { return cSLOWEnumLiteralDeclaration_2; }
		
		//"SLOW"
		public Keyword getSLOWSLOWKeyword_2_0() { return cSLOWSLOWKeyword_2_0; }
	}
	public class ColorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "mars.ru.des.robot.TaskDSL.Color");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cREDEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cREDREDKeyword_0_0 = (Keyword)cREDEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cGREENEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cGREENGREENKeyword_1_0 = (Keyword)cGREENEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBLUEEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBLUEBLUEKeyword_2_0 = (Keyword)cBLUEEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Color:
		//	RED | GREEN | BLUE;
		public EnumRule getRule() { return rule; }
		
		//RED | GREEN | BLUE
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//RED
		public EnumLiteralDeclaration getREDEnumLiteralDeclaration_0() { return cREDEnumLiteralDeclaration_0; }
		
		//"RED"
		public Keyword getREDREDKeyword_0_0() { return cREDREDKeyword_0_0; }
		
		//GREEN
		public EnumLiteralDeclaration getGREENEnumLiteralDeclaration_1() { return cGREENEnumLiteralDeclaration_1; }
		
		//"GREEN"
		public Keyword getGREENGREENKeyword_1_0() { return cGREENGREENKeyword_1_0; }
		
		//BLUE
		public EnumLiteralDeclaration getBLUEEnumLiteralDeclaration_2() { return cBLUEEnumLiteralDeclaration_2; }
		
		//"BLUE"
		public Keyword getBLUEBLUEKeyword_2_0() { return cBLUEBLUEKeyword_2_0; }
	}
	
	private final TaskElements pTask;
	private final MissionElements pMission;
	private final ActionElements pAction;
	private final DetectorsElements pDetectors;
	private final DriveUntilElements pDriveUntil;
	private final InvestigateElements pInvestigate;
	private final SpeakElements pSpeak;
	private final FollowLineElements pFollowLine;
	private final AvoidElements pAvoid;
	private final AvoidActionElements pAvoidAction;
	private final MoveBackElements pMoveBack;
	private final TurnElements pTurn;
	private final ObjectElements eObject;
	private final SpeedElements eSpeed;
	private final ColorElements eColor;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TaskDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTask = new TaskElements();
		this.pMission = new MissionElements();
		this.pAction = new ActionElements();
		this.pDetectors = new DetectorsElements();
		this.pDriveUntil = new DriveUntilElements();
		this.pInvestigate = new InvestigateElements();
		this.pSpeak = new SpeakElements();
		this.pFollowLine = new FollowLineElements();
		this.pAvoid = new AvoidElements();
		this.pAvoidAction = new AvoidActionElements();
		this.pMoveBack = new MoveBackElements();
		this.pTurn = new TurnElements();
		this.eObject = new ObjectElements();
		this.eSpeed = new SpeedElements();
		this.eColor = new ColorElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("mars.ru.des.robot.TaskDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Task:
	//	'Task:' name=ID
	//	action=Action
	//	detector=Detectors?;
	public TaskElements getTaskAccess() {
		return pTask;
	}
	
	public ParserRule getTaskRule() {
		return getTaskAccess().getRule();
	}
	
	//Mission:
	//	'Mission:' name=ID
	//	"tasks:" tasks=[Task];
	public MissionElements getMissionAccess() {
		return pMission;
	}
	
	public ParserRule getMissionRule() {
		return getMissionAccess().getRule();
	}
	
	//Action:
	//	'action:'
	//	DriveUntil | Investigate | Speak | FollowLine;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//Detectors:
	//	'detectors:'
	//	avoids+=Avoid+;
	public DetectorsElements getDetectorsAccess() {
		return pDetectors;
	}
	
	public ParserRule getDetectorsRule() {
		return getDetectorsAccess().getRule();
	}
	
	//DriveUntil:
	//	'Drive'
	//	speed=Speed?
	//	'Until'
	//	color=Color?
	//	object=Object
	//	'Found';
	public DriveUntilElements getDriveUntilAccess() {
		return pDriveUntil;
	}
	
	public ParserRule getDriveUntilRule() {
		return getDriveUntilAccess().getRule();
	}
	
	//Investigate:
	//	'Investigate'
	//	speed=Speed;
	public InvestigateElements getInvestigateAccess() {
		return pInvestigate;
	}
	
	public ParserRule getInvestigateRule() {
		return getInvestigateAccess().getRule();
	}
	
	//Speak:
	//	'Speak'
	//	text=STRING;
	public SpeakElements getSpeakAccess() {
		return pSpeak;
	}
	
	public ParserRule getSpeakRule() {
		return getSpeakAccess().getRule();
	}
	
	//FollowLine:
	//	'FindAndFollowLineFor'
	//	distance=INT 'meters';
	public FollowLineElements getFollowLineAccess() {
		return pFollowLine;
	}
	
	public ParserRule getFollowLineRule() {
		return getFollowLineAccess().getRule();
	}
	
	//Avoid:
	//	'Avoid'
	//	color=Color?
	//	object=Object
	//	'By'
	//	avoidActions+=AvoidAction+;
	public AvoidElements getAvoidAccess() {
		return pAvoid;
	}
	
	public ParserRule getAvoidRule() {
		return getAvoidAccess().getRule();
	}
	
	//AvoidAction:
	//	(MoveBack | Turn) 'and'?;
	public AvoidActionElements getAvoidActionAccess() {
		return pAvoidAction;
	}
	
	public ParserRule getAvoidActionRule() {
		return getAvoidActionAccess().getRule();
	}
	
	//MoveBack:
	//	'MoveBackwards'
	//	distance=INT 'meters';
	public MoveBackElements getMoveBackAccess() {
		return pMoveBack;
	}
	
	public ParserRule getMoveBackRule() {
		return getMoveBackAccess().getRule();
	}
	
	//Turn:
	//	'Turn'
	//	degrees=INT 'degrees';
	public TurnElements getTurnAccess() {
		return pTurn;
	}
	
	public ParserRule getTurnRule() {
		return getTurnAccess().getRule();
	}
	
	//enum Object:
	//	ROCK | LAKE;
	public ObjectElements getObjectAccess() {
		return eObject;
	}
	
	public EnumRule getObjectRule() {
		return getObjectAccess().getRule();
	}
	
	//enum Speed:
	//	FAST | NORMAL | SLOW;
	public SpeedElements getSpeedAccess() {
		return eSpeed;
	}
	
	public EnumRule getSpeedRule() {
		return getSpeedAccess().getRule();
	}
	
	//enum Color:
	//	RED | GREEN | BLUE;
	public ColorElements getColorAccess() {
		return eColor;
	}
	
	public EnumRule getColorRule() {
		return getColorAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
