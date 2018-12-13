package mars.ru.des.robot.generator;

import java.util.Arrays;
import java.util.List;
import mars.ru.des.robot.generator.DslHelper;
import mars.ru.des.robot.taskDSL.Action;
import mars.ru.des.robot.taskDSL.Avoid;
import mars.ru.des.robot.taskDSL.DSL;
import mars.ru.des.robot.taskDSL.DriveAction;
import mars.ru.des.robot.taskDSL.DriveUntil;
import mars.ru.des.robot.taskDSL.Investigate;
import mars.ru.des.robot.taskDSL.Mission;
import mars.ru.des.robot.taskDSL.MoveBack;
import mars.ru.des.robot.taskDSL.Speak;
import mars.ru.des.robot.taskDSL.Task;
import mars.ru.des.robot.taskDSL.TurnLeft;
import mars.ru.des.robot.taskDSL.TurnRight;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Brick1Generator {
  public static CharSequence generate(final DSL dsl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#!/usr/bin/env python3");
    _builder.newLine();
    _builder.append("from action.colorFinder import ColorFinder");
    _builder.newLine();
    _builder.append("from avoider.colorAvoider import ColorAvoider");
    _builder.newLine();
    _builder.append("from base.mission import Mission");
    _builder.newLine();
    _builder.append("from base.task import Task");
    _builder.newLine();
    _builder.append("from bt.bluethooth import Bluetooth");
    _builder.newLine();
    _builder.append("from color import Color");
    _builder.newLine();
    _builder.append("from drive.moveAction import MoveAction");
    _builder.newLine();
    _builder.append("from drive.rotateAction import RotateAction");
    _builder.newLine();
    _builder.append("from drive.speed import Speed");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("def run():");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for m in missions:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("m.execute()");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("print(\"Starting brick 1\")");
    _builder.newLine();
    _builder.append("missions = []");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("print(\"Creating tasks...\")");
    _builder.newLine();
    {
      EList<Task> _tasks = dsl.getTasks();
      for(final Task task : _tasks) {
        CharSequence _generateTask = Brick1Generator.generateTask(task);
        _builder.append(_generateTask);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("print(\"Creating missions...\")");
    _builder.newLine();
    {
      EList<Mission> _missions = dsl.getMissions();
      for(final Mission mission : _missions) {
        CharSequence _generateMission = Brick1Generator.generateMission(mission);
        _builder.append(_generateMission);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("print(\"Connecting as Client...\")");
    _builder.newLine();
    _builder.newLine();
    _builder.append("b = Bluetooth()");
    _builder.newLine();
    _builder.append("b.connect_as_client()");
    _builder.newLine();
    _builder.newLine();
    _builder.append("run()");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence generateMission(final Mission mission) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Task> _tasks = mission.getTasks();
      boolean _hasElements = false;
      for(final Task task : _tasks) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("missions.append(Mission([");
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name = DslHelper.toName(task);
        _builder.append(_name);
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append("]))");
      }
    }
    return _builder;
  }
  
  public static CharSequence generateTask(final Task task) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = DslHelper.toName(task);
    _builder.append(_name);
    _builder.append(" = Task()");
    _builder.newLineIfNotEmpty();
    String _name_1 = DslHelper.toName(task);
    _builder.append(_name_1);
    _builder.append(".set_action(");
    CharSequence _generateAction = Brick1Generator.generateAction(task.getAction());
    _builder.append(_generateAction);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Avoid> _avoiders = task.getDetector().getAvoiders();
      for(final Avoid av : _avoiders) {
        String _name_2 = DslHelper.toName(task);
        _builder.append(_name_2);
        _builder.append(".add_avoider(");
        CharSequence _generateAvoider = Brick1Generator.generateAvoider(av);
        _builder.append(_generateAvoider);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected static CharSequence _generateAction(final DriveUntil action) {
    StringConcatenation _builder = new StringConcatenation();
    {
      mars.ru.des.robot.taskDSL.Object _object = action.getObject();
      boolean _tripleEquals = (_object == mars.ru.des.robot.taskDSL.Object.LAKE);
      if (_tripleEquals) {
        _builder.append("ColorFinder(");
        String _string = DslHelper.toString(action.getColor());
        _builder.append(_string);
        _builder.append(", ");
        String _string_1 = DslHelper.toString(action.getSpeed());
        _builder.append(_string_1);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      } else {
        mars.ru.des.robot.taskDSL.Object _object_1 = action.getObject();
        boolean _tripleEquals_1 = (_object_1 == mars.ru.des.robot.taskDSL.Object.ROCK);
        if (_tripleEquals_1) {
          _builder.append("RockFinder(");
          String _string_2 = DslHelper.toString(action.getColor());
          _builder.append(_string_2);
          _builder.append(", ");
          String _string_3 = DslHelper.toString(action.getSpeed());
          _builder.append(_string_3);
          _builder.append(")");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  protected static CharSequence _generateAction(final Investigate action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Investigator(");
    String _string = DslHelper.toString(action.getSpeed());
    _builder.append(_string);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _generateAction(final Speak action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Speaker(\"");
    String _text = action.getText();
    _builder.append(_text);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence generateAvoider(final Avoid avoid) {
    StringConcatenation _builder = new StringConcatenation();
    {
      mars.ru.des.robot.taskDSL.Object _object = avoid.getObject();
      boolean _tripleEquals = (_object == mars.ru.des.robot.taskDSL.Object.LAKE);
      if (_tripleEquals) {
        _builder.append("ColorAvoider(");
        String _string = DslHelper.toString(avoid.getColor());
        _builder.append(_string);
        _builder.append(", ");
        CharSequence _string_1 = Brick1Generator.toString(avoid.getDriveActions());
        _builder.append(_string_1);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      } else {
        mars.ru.des.robot.taskDSL.Object _object_1 = avoid.getObject();
        boolean _tripleEquals_1 = (_object_1 == mars.ru.des.robot.taskDSL.Object.ROCK);
        if (_tripleEquals_1) {
          _builder.append("RockAvoider(");
          CharSequence _string_2 = Brick1Generator.toString(avoid.getDriveActions());
          _builder.append(_string_2);
          _builder.append(")");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  public static CharSequence toString(final List<DriveAction> driveActions) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasElements = false;
      for(final DriveAction action : driveActions) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("[");
        } else {
          _builder.appendImmediate(",", "");
        }
        String _driveActionToString = Brick1Generator.driveActionToString(action);
        _builder.append(_driveActionToString);
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append("]");
      }
    }
    return _builder;
  }
  
  protected static String _driveActionToString(final MoveBack action) {
    int _meters = action.getMeters();
    String _plus = ("MoveAction(Speed.NORMAL, " + Integer.valueOf(_meters));
    return (_plus + ")");
  }
  
  protected static String _driveActionToString(final TurnLeft action) {
    int _degrees = action.getDegrees();
    String _plus = ("RotateAction(Speed.NORMAL, -" + Integer.valueOf(_degrees));
    return (_plus + ")");
  }
  
  protected static String _driveActionToString(final TurnRight action) {
    int _degrees = action.getDegrees();
    String _plus = ("RotateAction(Speed.NORMAL, " + Integer.valueOf(_degrees));
    return (_plus + ")");
  }
  
  public static CharSequence generateAction(final Action action) {
    if (action instanceof DriveUntil) {
      return _generateAction((DriveUntil)action);
    } else if (action instanceof Investigate) {
      return _generateAction((Investigate)action);
    } else if (action instanceof Speak) {
      return _generateAction((Speak)action);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(action).toString());
    }
  }
  
  public static String driveActionToString(final DriveAction action) {
    if (action instanceof MoveBack) {
      return _driveActionToString((MoveBack)action);
    } else if (action instanceof TurnLeft) {
      return _driveActionToString((TurnLeft)action);
    } else if (action instanceof TurnRight) {
      return _driveActionToString((TurnRight)action);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(action).toString());
    }
  }
}
