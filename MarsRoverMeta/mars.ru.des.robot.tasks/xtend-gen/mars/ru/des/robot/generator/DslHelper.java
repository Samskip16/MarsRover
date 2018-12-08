package mars.ru.des.robot.generator;

import mars.ru.des.robot.taskDSL.Color;
import mars.ru.des.robot.taskDSL.Speed;

@SuppressWarnings("all")
public class DslHelper {
  public static String toString(final Color color) {
    if ((color == null)) {
      return "[Color.RED, Color.GREEN, Color.BLUE]";
    } else {
      String _string = color.toString();
      return ("Color." + _string);
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
}
