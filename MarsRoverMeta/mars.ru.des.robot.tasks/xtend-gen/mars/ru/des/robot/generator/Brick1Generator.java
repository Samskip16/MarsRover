package mars.ru.des.robot.generator;

import java.util.Arrays;
import java.util.List;
import mars.ru.des.robot.generator.DslHelper;
import mars.ru.des.robot.taskDSL.Action;
import mars.ru.des.robot.taskDSL.Avoid;
import mars.ru.des.robot.taskDSL.DriveAction;
import mars.ru.des.robot.taskDSL.DriveUntil;
import mars.ru.des.robot.taskDSL.Investigate;
import mars.ru.des.robot.taskDSL.Mission;
import mars.ru.des.robot.taskDSL.MoveBack;
import mars.ru.des.robot.taskDSL.Speak;
import mars.ru.des.robot.taskDSL.Task;
import mars.ru.des.robot.taskDSL.Turn;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Brick1Generator {
  public static CharSequence generate(final Mission mission) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Task to Iterable<?>"
      + "\nType mismatch: cannot convert from Object to Action");
  }
  
  public CharSequence generateTask(final Task task) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Avoid to Action");
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field action is undefined"
      + "\ngetSpeed cannot be resolved");
  }
  
  public static CharSequence toString(final List<DriveAction> driveActions) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from DriveAction to MoveBack");
  }
  
  public static String driveActionToString(final MoveBack action) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getDistance() is undefined for the type MoveBack");
  }
  
  public static String driveActionToString(final Turn action) {
    int _degrees = action.getDegrees();
    String _plus = ("DriveAction(Speed.NORMAL, 0," + Integer.valueOf(_degrees));
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
}
