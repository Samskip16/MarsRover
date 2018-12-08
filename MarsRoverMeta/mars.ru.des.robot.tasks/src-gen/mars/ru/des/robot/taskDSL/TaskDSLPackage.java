/**
 * generated by Xtext 2.15.0
 */
package mars.ru.des.robot.taskDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mars.ru.des.robot.taskDSL.TaskDSLFactory
 * @model kind="package"
 * @generated
 */
public interface TaskDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "taskDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ru.mars/des/robot/TaskDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "taskDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TaskDSLPackage eINSTANCE = mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link mars.ru.des.robot.taskDSL.impl.MissionImpl <em>Mission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.ru.des.robot.taskDSL.impl.MissionImpl
   * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getMission()
   * @generated
   */
  int MISSION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__TASKS = 1;

  /**
   * The number of structural features of the '<em>Mission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link mars.ru.des.robot.taskDSL.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.ru.des.robot.taskDSL.impl.TaskImpl
   * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getTask()
   * @generated
   */
  int TASK = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ACTION = 1;

  /**
   * The feature id for the '<em><b>Detector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DETECTOR = 2;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link mars.ru.des.robot.taskDSL.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.ru.des.robot.taskDSL.impl.ActionImpl
   * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getAction()
   * @generated
   */
  int ACTION = 2;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link mars.ru.des.robot.taskDSL.impl.DetectorImpl <em>Detector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.ru.des.robot.taskDSL.impl.DetectorImpl
   * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getDetector()
   * @generated
   */
  int DETECTOR = 3;

  /**
   * The feature id for the '<em><b>Avoiders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETECTOR__AVOIDERS = 0;

  /**
   * The number of structural features of the '<em>Detector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETECTOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link mars.ru.des.robot.taskDSL.impl.DriveUntilImpl <em>Drive Until</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.ru.des.robot.taskDSL.impl.DriveUntilImpl
   * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getDriveUntil()
   * @generated
   */
  int DRIVE_UNTIL = 4;

  /**
   * The feature id for the '<em><b>Speed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVE_UNTIL__SPEED = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVE_UNTIL__COLOR = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVE_UNTIL__OBJECT = ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Drive Until</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVE_UNTIL_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link mars.ru.des.robot.taskDSL.impl.InvestigateImpl <em>Investigate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.ru.des.robot.taskDSL.impl.InvestigateImpl
   * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getInvestigate()
   * @generated
   */
  int INVESTIGATE = 5;

  /**
   * The feature id for the '<em><b>Speed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVESTIGATE__SPEED = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Investigate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVESTIGATE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mars.ru.des.robot.taskDSL.impl.SpeakImpl <em>Speak</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.ru.des.robot.taskDSL.impl.SpeakImpl
   * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getSpeak()
   * @generated
   */
  int SPEAK = 6;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEAK__TEXT = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Speak</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEAK_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mars.ru.des.robot.taskDSL.impl.FollowLineImpl <em>Follow Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.ru.des.robot.taskDSL.impl.FollowLineImpl
   * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getFollowLine()
   * @generated
   */
  int FOLLOW_LINE = 7;

  /**
   * The feature id for the '<em><b>Distance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLLOW_LINE__DISTANCE = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Follow Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLLOW_LINE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mars.ru.des.robot.taskDSL.impl.AvoidImpl <em>Avoid</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.ru.des.robot.taskDSL.impl.AvoidImpl
   * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getAvoid()
   * @generated
   */
  int AVOID = 8;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVOID__COLOR = 0;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVOID__OBJECT = 1;

  /**
   * The feature id for the '<em><b>Avoid Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVOID__AVOID_ACTIONS = 2;

  /**
   * The number of structural features of the '<em>Avoid</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVOID_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link mars.ru.des.robot.taskDSL.impl.DriveActionImpl <em>Drive Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.ru.des.robot.taskDSL.impl.DriveActionImpl
   * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getDriveAction()
   * @generated
   */
  int DRIVE_ACTION = 9;

  /**
   * The number of structural features of the '<em>Drive Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVE_ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link mars.ru.des.robot.taskDSL.impl.MoveBackImpl <em>Move Back</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.ru.des.robot.taskDSL.impl.MoveBackImpl
   * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getMoveBack()
   * @generated
   */
  int MOVE_BACK = 10;

  /**
   * The feature id for the '<em><b>Meters</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_BACK__METERS = DRIVE_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Move Back</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_BACK_FEATURE_COUNT = DRIVE_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mars.ru.des.robot.taskDSL.impl.TurnImpl <em>Turn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.ru.des.robot.taskDSL.impl.TurnImpl
   * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getTurn()
   * @generated
   */
  int TURN = 11;

  /**
   * The feature id for the '<em><b>Degrees</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURN__DEGREES = DRIVE_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Turn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURN_FEATURE_COUNT = DRIVE_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mars.ru.des.robot.taskDSL.Object <em>Object</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.ru.des.robot.taskDSL.Object
   * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 12;

  /**
   * The meta object id for the '{@link mars.ru.des.robot.taskDSL.Speed <em>Speed</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.ru.des.robot.taskDSL.Speed
   * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getSpeed()
   * @generated
   */
  int SPEED = 13;

  /**
   * The meta object id for the '{@link mars.ru.des.robot.taskDSL.Color <em>Color</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.ru.des.robot.taskDSL.Color
   * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getColor()
   * @generated
   */
  int COLOR = 14;


  /**
   * Returns the meta object for class '{@link mars.ru.des.robot.taskDSL.Mission <em>Mission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mission</em>'.
   * @see mars.ru.des.robot.taskDSL.Mission
   * @generated
   */
  EClass getMission();

  /**
   * Returns the meta object for the attribute '{@link mars.ru.des.robot.taskDSL.Mission#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mars.ru.des.robot.taskDSL.Mission#getName()
   * @see #getMission()
   * @generated
   */
  EAttribute getMission_Name();

  /**
   * Returns the meta object for the reference '{@link mars.ru.des.robot.taskDSL.Mission#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Tasks</em>'.
   * @see mars.ru.des.robot.taskDSL.Mission#getTasks()
   * @see #getMission()
   * @generated
   */
  EReference getMission_Tasks();

  /**
   * Returns the meta object for class '{@link mars.ru.des.robot.taskDSL.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see mars.ru.des.robot.taskDSL.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link mars.ru.des.robot.taskDSL.Task#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mars.ru.des.robot.taskDSL.Task#getName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Name();

  /**
   * Returns the meta object for the containment reference '{@link mars.ru.des.robot.taskDSL.Task#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see mars.ru.des.robot.taskDSL.Task#getAction()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Action();

  /**
   * Returns the meta object for the containment reference '{@link mars.ru.des.robot.taskDSL.Task#getDetector <em>Detector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Detector</em>'.
   * @see mars.ru.des.robot.taskDSL.Task#getDetector()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Detector();

  /**
   * Returns the meta object for class '{@link mars.ru.des.robot.taskDSL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see mars.ru.des.robot.taskDSL.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link mars.ru.des.robot.taskDSL.Detector <em>Detector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Detector</em>'.
   * @see mars.ru.des.robot.taskDSL.Detector
   * @generated
   */
  EClass getDetector();

  /**
   * Returns the meta object for the containment reference list '{@link mars.ru.des.robot.taskDSL.Detector#getAvoiders <em>Avoiders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Avoiders</em>'.
   * @see mars.ru.des.robot.taskDSL.Detector#getAvoiders()
   * @see #getDetector()
   * @generated
   */
  EReference getDetector_Avoiders();

  /**
   * Returns the meta object for class '{@link mars.ru.des.robot.taskDSL.DriveUntil <em>Drive Until</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drive Until</em>'.
   * @see mars.ru.des.robot.taskDSL.DriveUntil
   * @generated
   */
  EClass getDriveUntil();

  /**
   * Returns the meta object for the attribute '{@link mars.ru.des.robot.taskDSL.DriveUntil#getSpeed <em>Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Speed</em>'.
   * @see mars.ru.des.robot.taskDSL.DriveUntil#getSpeed()
   * @see #getDriveUntil()
   * @generated
   */
  EAttribute getDriveUntil_Speed();

  /**
   * Returns the meta object for the attribute '{@link mars.ru.des.robot.taskDSL.DriveUntil#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see mars.ru.des.robot.taskDSL.DriveUntil#getColor()
   * @see #getDriveUntil()
   * @generated
   */
  EAttribute getDriveUntil_Color();

  /**
   * Returns the meta object for the attribute '{@link mars.ru.des.robot.taskDSL.DriveUntil#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object</em>'.
   * @see mars.ru.des.robot.taskDSL.DriveUntil#getObject()
   * @see #getDriveUntil()
   * @generated
   */
  EAttribute getDriveUntil_Object();

  /**
   * Returns the meta object for class '{@link mars.ru.des.robot.taskDSL.Investigate <em>Investigate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Investigate</em>'.
   * @see mars.ru.des.robot.taskDSL.Investigate
   * @generated
   */
  EClass getInvestigate();

  /**
   * Returns the meta object for the attribute '{@link mars.ru.des.robot.taskDSL.Investigate#getSpeed <em>Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Speed</em>'.
   * @see mars.ru.des.robot.taskDSL.Investigate#getSpeed()
   * @see #getInvestigate()
   * @generated
   */
  EAttribute getInvestigate_Speed();

  /**
   * Returns the meta object for class '{@link mars.ru.des.robot.taskDSL.Speak <em>Speak</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Speak</em>'.
   * @see mars.ru.des.robot.taskDSL.Speak
   * @generated
   */
  EClass getSpeak();

  /**
   * Returns the meta object for the attribute '{@link mars.ru.des.robot.taskDSL.Speak#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see mars.ru.des.robot.taskDSL.Speak#getText()
   * @see #getSpeak()
   * @generated
   */
  EAttribute getSpeak_Text();

  /**
   * Returns the meta object for class '{@link mars.ru.des.robot.taskDSL.FollowLine <em>Follow Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Follow Line</em>'.
   * @see mars.ru.des.robot.taskDSL.FollowLine
   * @generated
   */
  EClass getFollowLine();

  /**
   * Returns the meta object for the attribute '{@link mars.ru.des.robot.taskDSL.FollowLine#getDistance <em>Distance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distance</em>'.
   * @see mars.ru.des.robot.taskDSL.FollowLine#getDistance()
   * @see #getFollowLine()
   * @generated
   */
  EAttribute getFollowLine_Distance();

  /**
   * Returns the meta object for class '{@link mars.ru.des.robot.taskDSL.Avoid <em>Avoid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Avoid</em>'.
   * @see mars.ru.des.robot.taskDSL.Avoid
   * @generated
   */
  EClass getAvoid();

  /**
   * Returns the meta object for the attribute '{@link mars.ru.des.robot.taskDSL.Avoid#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see mars.ru.des.robot.taskDSL.Avoid#getColor()
   * @see #getAvoid()
   * @generated
   */
  EAttribute getAvoid_Color();

  /**
   * Returns the meta object for the attribute '{@link mars.ru.des.robot.taskDSL.Avoid#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object</em>'.
   * @see mars.ru.des.robot.taskDSL.Avoid#getObject()
   * @see #getAvoid()
   * @generated
   */
  EAttribute getAvoid_Object();

  /**
   * Returns the meta object for the containment reference list '{@link mars.ru.des.robot.taskDSL.Avoid#getAvoidActions <em>Avoid Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Avoid Actions</em>'.
   * @see mars.ru.des.robot.taskDSL.Avoid#getAvoidActions()
   * @see #getAvoid()
   * @generated
   */
  EReference getAvoid_AvoidActions();

  /**
   * Returns the meta object for class '{@link mars.ru.des.robot.taskDSL.DriveAction <em>Drive Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drive Action</em>'.
   * @see mars.ru.des.robot.taskDSL.DriveAction
   * @generated
   */
  EClass getDriveAction();

  /**
   * Returns the meta object for class '{@link mars.ru.des.robot.taskDSL.MoveBack <em>Move Back</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Move Back</em>'.
   * @see mars.ru.des.robot.taskDSL.MoveBack
   * @generated
   */
  EClass getMoveBack();

  /**
   * Returns the meta object for the attribute '{@link mars.ru.des.robot.taskDSL.MoveBack#getMeters <em>Meters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Meters</em>'.
   * @see mars.ru.des.robot.taskDSL.MoveBack#getMeters()
   * @see #getMoveBack()
   * @generated
   */
  EAttribute getMoveBack_Meters();

  /**
   * Returns the meta object for class '{@link mars.ru.des.robot.taskDSL.Turn <em>Turn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Turn</em>'.
   * @see mars.ru.des.robot.taskDSL.Turn
   * @generated
   */
  EClass getTurn();

  /**
   * Returns the meta object for the attribute '{@link mars.ru.des.robot.taskDSL.Turn#getDegrees <em>Degrees</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Degrees</em>'.
   * @see mars.ru.des.robot.taskDSL.Turn#getDegrees()
   * @see #getTurn()
   * @generated
   */
  EAttribute getTurn_Degrees();

  /**
   * Returns the meta object for enum '{@link mars.ru.des.robot.taskDSL.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Object</em>'.
   * @see mars.ru.des.robot.taskDSL.Object
   * @generated
   */
  EEnum getObject();

  /**
   * Returns the meta object for enum '{@link mars.ru.des.robot.taskDSL.Speed <em>Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Speed</em>'.
   * @see mars.ru.des.robot.taskDSL.Speed
   * @generated
   */
  EEnum getSpeed();

  /**
   * Returns the meta object for enum '{@link mars.ru.des.robot.taskDSL.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Color</em>'.
   * @see mars.ru.des.robot.taskDSL.Color
   * @generated
   */
  EEnum getColor();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TaskDSLFactory getTaskDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link mars.ru.des.robot.taskDSL.impl.MissionImpl <em>Mission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.ru.des.robot.taskDSL.impl.MissionImpl
     * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getMission()
     * @generated
     */
    EClass MISSION = eINSTANCE.getMission();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MISSION__NAME = eINSTANCE.getMission_Name();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MISSION__TASKS = eINSTANCE.getMission_Tasks();

    /**
     * The meta object literal for the '{@link mars.ru.des.robot.taskDSL.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.ru.des.robot.taskDSL.impl.TaskImpl
     * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__NAME = eINSTANCE.getTask_Name();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__ACTION = eINSTANCE.getTask_Action();

    /**
     * The meta object literal for the '<em><b>Detector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__DETECTOR = eINSTANCE.getTask_Detector();

    /**
     * The meta object literal for the '{@link mars.ru.des.robot.taskDSL.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.ru.des.robot.taskDSL.impl.ActionImpl
     * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link mars.ru.des.robot.taskDSL.impl.DetectorImpl <em>Detector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.ru.des.robot.taskDSL.impl.DetectorImpl
     * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getDetector()
     * @generated
     */
    EClass DETECTOR = eINSTANCE.getDetector();

    /**
     * The meta object literal for the '<em><b>Avoiders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DETECTOR__AVOIDERS = eINSTANCE.getDetector_Avoiders();

    /**
     * The meta object literal for the '{@link mars.ru.des.robot.taskDSL.impl.DriveUntilImpl <em>Drive Until</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.ru.des.robot.taskDSL.impl.DriveUntilImpl
     * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getDriveUntil()
     * @generated
     */
    EClass DRIVE_UNTIL = eINSTANCE.getDriveUntil();

    /**
     * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DRIVE_UNTIL__SPEED = eINSTANCE.getDriveUntil_Speed();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DRIVE_UNTIL__COLOR = eINSTANCE.getDriveUntil_Color();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DRIVE_UNTIL__OBJECT = eINSTANCE.getDriveUntil_Object();

    /**
     * The meta object literal for the '{@link mars.ru.des.robot.taskDSL.impl.InvestigateImpl <em>Investigate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.ru.des.robot.taskDSL.impl.InvestigateImpl
     * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getInvestigate()
     * @generated
     */
    EClass INVESTIGATE = eINSTANCE.getInvestigate();

    /**
     * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INVESTIGATE__SPEED = eINSTANCE.getInvestigate_Speed();

    /**
     * The meta object literal for the '{@link mars.ru.des.robot.taskDSL.impl.SpeakImpl <em>Speak</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.ru.des.robot.taskDSL.impl.SpeakImpl
     * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getSpeak()
     * @generated
     */
    EClass SPEAK = eINSTANCE.getSpeak();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPEAK__TEXT = eINSTANCE.getSpeak_Text();

    /**
     * The meta object literal for the '{@link mars.ru.des.robot.taskDSL.impl.FollowLineImpl <em>Follow Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.ru.des.robot.taskDSL.impl.FollowLineImpl
     * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getFollowLine()
     * @generated
     */
    EClass FOLLOW_LINE = eINSTANCE.getFollowLine();

    /**
     * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOLLOW_LINE__DISTANCE = eINSTANCE.getFollowLine_Distance();

    /**
     * The meta object literal for the '{@link mars.ru.des.robot.taskDSL.impl.AvoidImpl <em>Avoid</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.ru.des.robot.taskDSL.impl.AvoidImpl
     * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getAvoid()
     * @generated
     */
    EClass AVOID = eINSTANCE.getAvoid();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AVOID__COLOR = eINSTANCE.getAvoid_Color();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AVOID__OBJECT = eINSTANCE.getAvoid_Object();

    /**
     * The meta object literal for the '<em><b>Avoid Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AVOID__AVOID_ACTIONS = eINSTANCE.getAvoid_AvoidActions();

    /**
     * The meta object literal for the '{@link mars.ru.des.robot.taskDSL.impl.DriveActionImpl <em>Drive Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.ru.des.robot.taskDSL.impl.DriveActionImpl
     * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getDriveAction()
     * @generated
     */
    EClass DRIVE_ACTION = eINSTANCE.getDriveAction();

    /**
     * The meta object literal for the '{@link mars.ru.des.robot.taskDSL.impl.MoveBackImpl <em>Move Back</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.ru.des.robot.taskDSL.impl.MoveBackImpl
     * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getMoveBack()
     * @generated
     */
    EClass MOVE_BACK = eINSTANCE.getMoveBack();

    /**
     * The meta object literal for the '<em><b>Meters</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVE_BACK__METERS = eINSTANCE.getMoveBack_Meters();

    /**
     * The meta object literal for the '{@link mars.ru.des.robot.taskDSL.impl.TurnImpl <em>Turn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.ru.des.robot.taskDSL.impl.TurnImpl
     * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getTurn()
     * @generated
     */
    EClass TURN = eINSTANCE.getTurn();

    /**
     * The meta object literal for the '<em><b>Degrees</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TURN__DEGREES = eINSTANCE.getTurn_Degrees();

    /**
     * The meta object literal for the '{@link mars.ru.des.robot.taskDSL.Object <em>Object</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.ru.des.robot.taskDSL.Object
     * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getObject()
     * @generated
     */
    EEnum OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '{@link mars.ru.des.robot.taskDSL.Speed <em>Speed</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.ru.des.robot.taskDSL.Speed
     * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getSpeed()
     * @generated
     */
    EEnum SPEED = eINSTANCE.getSpeed();

    /**
     * The meta object literal for the '{@link mars.ru.des.robot.taskDSL.Color <em>Color</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.ru.des.robot.taskDSL.Color
     * @see mars.ru.des.robot.taskDSL.impl.TaskDSLPackageImpl#getColor()
     * @generated
     */
    EEnum COLOR = eINSTANCE.getColor();

  }

} //TaskDSLPackage
