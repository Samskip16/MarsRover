package mars.ru.des.robot.generator;

import mars.ru.des.robot.taskDSL.Color;
import mars.ru.des.robot.taskDSL.Speed;
import mars.ru.des.robot.taskDSL.Task;

@SuppressWarnings("all")
public class DslHelper {
  public static String toString(final Color color) {
    if ((color == null)) {
      return "[Color.RED, Color.GREEN, Color.BLUE]";
    } else {
      String _string = color.toString();
      String _plus = ("[Color." + _string);
      return (_plus + "]");
    }
  }
  
  public static String toString(final Speed speed) {
    if ((speed == null)) {
      return "Speed.NORMAL";
    } else {
      String _string = speed.toString();
      return ("Speed." + _string);
    }
  }
  
  public static String toName(final Task task) {
    String _name = task.getName();
    return ("task_" + _name);
  }
}
