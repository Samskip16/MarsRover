/**
 * generated by Xtext 2.15.0
 */
package mars.ru.des.robot.validation;

import java.util.ArrayList;
import java.util.List;
import mars.ru.des.robot.taskDSL.Action;
import mars.ru.des.robot.taskDSL.Avoid;
import mars.ru.des.robot.taskDSL.Color;
import mars.ru.des.robot.taskDSL.Detector;
import mars.ru.des.robot.taskDSL.DriveAction;
import mars.ru.des.robot.taskDSL.DriveUntil;
import mars.ru.des.robot.taskDSL.MoveBack;
import mars.ru.des.robot.taskDSL.Task;
import mars.ru.des.robot.taskDSL.TurnLeft;
import mars.ru.des.robot.taskDSL.TurnRight;
import mars.ru.des.robot.validation.AbstractTaskDSLValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class TaskDSLValidator extends AbstractTaskDSLValidator {
  public final static String INVALID_NAME = "invalidName";
  
  private Action ac;
  
  private List<String> avoidObjects;
  
  private String s;
  
  private Class cls;
  
  @Check
  public void checkActionAndDetectorObjectNotTheSame(final Task task) {
    this.ac = task.getAction();
    if ((this.ac instanceof DriveUntil)) {
      EList<Avoid> _avoiders = task.getDetector().getAvoiders();
      for (final Avoid av : _avoiders) {
        if (((av.getObject() == ((DriveUntil)this.ac).getObject()) && 
          ((((av.getColor() != null) && (((DriveUntil)this.ac).getColor() == null)) || ((av.getColor() == null) && (((DriveUntil)this.ac).getColor() != null))) || (av.getColor() == ((DriveUntil)this.ac).getColor())))) {
          this.s = this.stringifyAvoid(av);
          this.error((("Cannot avoid the same object as you are trying to find (\'" + this.s) + "\')"), null);
        }
      }
    }
  }
  
  @Check
  public void checkAvoidObjectsMultiplyDefined(final Detector detector) {
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.avoidObjects = _arrayList;
    EList<Avoid> _avoiders = detector.getAvoiders();
    for (final Avoid av : _avoiders) {
      {
        this.s = this.stringifyAvoid(av);
        boolean _contains = this.avoidObjects.contains(this.s);
        if (_contains) {
          this.warning((("No use to avoid the same object twice (\'" + this.s) + "\')."), null);
        } else {
          this.avoidObjects.add(this.s);
        }
      }
    }
  }
  
  @Check
  public void checkAvoidActionSequence(final Avoid av) {
    this.cls = null;
    EList<DriveAction> _driveActions = av.getDriveActions();
    for (final DriveAction da : _driveActions) {
      {
        if (((this.cls != null) && (this.cls == da.getClass()))) {
          this.warning("Should combine two similar avoidActions together", null);
        }
        this.cls = da.getClass();
      }
    }
  }
  
  @Check
  public void distanceInRange(final MoveBack action) {
    int _meters = action.getMeters();
    boolean _tripleEquals = (_meters == 0);
    if (_tripleEquals) {
      this.warning("No use in driving 0 meters", null);
    }
    if (((action.getMeters() < 0) || (action.getMeters() > 100))) {
      this.error("Distance should be inside achievable bounds (0, 100)", null);
    }
  }
  
  @Check
  public void degreesInRange(final TurnLeft action) {
    int _degrees = action.getDegrees();
    boolean _tripleEquals = (_degrees == 0);
    if (_tripleEquals) {
      this.warning("No use in turning 0 degrees", null);
    }
    int _degrees_1 = action.getDegrees();
    boolean _greaterThan = (_degrees_1 > 359);
    if (_greaterThan) {
      this.error("Distance should be inside achievable bounds (0, 359)", null);
    }
  }
  
  @Check
  public void degreesInRange(final TurnRight action) {
    int _degrees = action.getDegrees();
    boolean _tripleEquals = (_degrees == 0);
    if (_tripleEquals) {
      this.warning("No use in turning 0 degrees", null);
    }
    int _degrees_1 = action.getDegrees();
    boolean _greaterThan = (_degrees_1 > 359);
    if (_greaterThan) {
      this.error("Distance should be inside achievable bounds (0, 359)", null);
    }
  }
  
  private String stringifyAvoid(final Avoid a) {
    Color _color = a.getColor();
    boolean _tripleEquals = (_color == null);
    if (_tripleEquals) {
      return a.getObject().toString();
    } else {
      String _string = a.getColor().toString();
      String _plus = (_string + " ");
      String _string_1 = a.getObject().toString();
      return (_plus + _string_1);
    }
  }
}
