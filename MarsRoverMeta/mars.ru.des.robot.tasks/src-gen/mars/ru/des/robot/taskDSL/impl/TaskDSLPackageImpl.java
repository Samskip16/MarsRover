/**
 * generated by Xtext 2.15.0
 */
package mars.ru.des.robot.taskDSL.impl;

import mars.ru.des.robot.taskDSL.Action;
import mars.ru.des.robot.taskDSL.Avoid;
import mars.ru.des.robot.taskDSL.Color;
import mars.ru.des.robot.taskDSL.Detector;
import mars.ru.des.robot.taskDSL.DriveAction;
import mars.ru.des.robot.taskDSL.DriveUntil;
import mars.ru.des.robot.taskDSL.FollowLine;
import mars.ru.des.robot.taskDSL.Investigate;
import mars.ru.des.robot.taskDSL.Mission;
import mars.ru.des.robot.taskDSL.MoveBack;
import mars.ru.des.robot.taskDSL.Speak;
import mars.ru.des.robot.taskDSL.Speed;
import mars.ru.des.robot.taskDSL.Task;
import mars.ru.des.robot.taskDSL.TaskDSLFactory;
import mars.ru.des.robot.taskDSL.TaskDSLPackage;
import mars.ru.des.robot.taskDSL.TurnLeft;
import mars.ru.des.robot.taskDSL.TurnRight;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskDSLPackageImpl extends EPackageImpl implements TaskDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass missionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass detectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass driveUntilEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass investigateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass speakEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass followLineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass avoidEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass driveActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moveBackEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass turnLeftEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass turnRightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum objectEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum speedEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum colorEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see mars.ru.des.robot.taskDSL.TaskDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TaskDSLPackageImpl()
  {
    super(eNS_URI, TaskDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link TaskDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TaskDSLPackage init()
  {
    if (isInited) return (TaskDSLPackage)EPackage.Registry.INSTANCE.getEPackage(TaskDSLPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredTaskDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    TaskDSLPackageImpl theTaskDSLPackage = registeredTaskDSLPackage instanceof TaskDSLPackageImpl ? (TaskDSLPackageImpl)registeredTaskDSLPackage : new TaskDSLPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theTaskDSLPackage.createPackageContents();

    // Initialize created meta-data
    theTaskDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTaskDSLPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TaskDSLPackage.eNS_URI, theTaskDSLPackage);
    return theTaskDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL()
  {
    return dslEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Missions()
  {
    return (EReference)dslEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Tasks()
  {
    return (EReference)dslEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMission()
  {
    return missionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMission_Name()
  {
    return (EAttribute)missionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMission_Tasks()
  {
    return (EReference)missionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTask()
  {
    return taskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Name()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_Action()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_Detector()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDetector()
  {
    return detectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDetector_Avoiders()
  {
    return (EReference)detectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDriveUntil()
  {
    return driveUntilEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDriveUntil_Speed()
  {
    return (EAttribute)driveUntilEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDriveUntil_Color()
  {
    return (EAttribute)driveUntilEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDriveUntil_Object()
  {
    return (EAttribute)driveUntilEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInvestigate()
  {
    return investigateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInvestigate_Speed()
  {
    return (EAttribute)investigateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpeak()
  {
    return speakEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpeak_Text()
  {
    return (EAttribute)speakEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFollowLine()
  {
    return followLineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFollowLine_Distance()
  {
    return (EAttribute)followLineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAvoid()
  {
    return avoidEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAvoid_Color()
  {
    return (EAttribute)avoidEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAvoid_Object()
  {
    return (EAttribute)avoidEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAvoid_DriveActions()
  {
    return (EReference)avoidEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDriveAction()
  {
    return driveActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMoveBack()
  {
    return moveBackEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMoveBack_Meters()
  {
    return (EAttribute)moveBackEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTurnLeft()
  {
    return turnLeftEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTurnLeft_Degrees()
  {
    return (EAttribute)turnLeftEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTurnRight()
  {
    return turnRightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTurnRight_Degrees()
  {
    return (EAttribute)turnRightEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getObject()
  {
    return objectEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSpeed()
  {
    return speedEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColor()
  {
    return colorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskDSLFactory getTaskDSLFactory()
  {
    return (TaskDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    dslEClass = createEClass(DSL);
    createEReference(dslEClass, DSL__MISSIONS);
    createEReference(dslEClass, DSL__TASKS);

    missionEClass = createEClass(MISSION);
    createEAttribute(missionEClass, MISSION__NAME);
    createEReference(missionEClass, MISSION__TASKS);

    taskEClass = createEClass(TASK);
    createEAttribute(taskEClass, TASK__NAME);
    createEReference(taskEClass, TASK__ACTION);
    createEReference(taskEClass, TASK__DETECTOR);

    actionEClass = createEClass(ACTION);

    detectorEClass = createEClass(DETECTOR);
    createEReference(detectorEClass, DETECTOR__AVOIDERS);

    driveUntilEClass = createEClass(DRIVE_UNTIL);
    createEAttribute(driveUntilEClass, DRIVE_UNTIL__SPEED);
    createEAttribute(driveUntilEClass, DRIVE_UNTIL__COLOR);
    createEAttribute(driveUntilEClass, DRIVE_UNTIL__OBJECT);

    investigateEClass = createEClass(INVESTIGATE);
    createEAttribute(investigateEClass, INVESTIGATE__SPEED);

    speakEClass = createEClass(SPEAK);
    createEAttribute(speakEClass, SPEAK__TEXT);

    followLineEClass = createEClass(FOLLOW_LINE);
    createEAttribute(followLineEClass, FOLLOW_LINE__DISTANCE);

    avoidEClass = createEClass(AVOID);
    createEAttribute(avoidEClass, AVOID__COLOR);
    createEAttribute(avoidEClass, AVOID__OBJECT);
    createEReference(avoidEClass, AVOID__DRIVE_ACTIONS);

    driveActionEClass = createEClass(DRIVE_ACTION);

    moveBackEClass = createEClass(MOVE_BACK);
    createEAttribute(moveBackEClass, MOVE_BACK__METERS);

    turnLeftEClass = createEClass(TURN_LEFT);
    createEAttribute(turnLeftEClass, TURN_LEFT__DEGREES);

    turnRightEClass = createEClass(TURN_RIGHT);
    createEAttribute(turnRightEClass, TURN_RIGHT__DEGREES);

    // Create enums
    objectEEnum = createEEnum(OBJECT);
    speedEEnum = createEEnum(SPEED);
    colorEEnum = createEEnum(COLOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    driveUntilEClass.getESuperTypes().add(this.getAction());
    investigateEClass.getESuperTypes().add(this.getAction());
    speakEClass.getESuperTypes().add(this.getAction());
    followLineEClass.getESuperTypes().add(this.getAction());
    moveBackEClass.getESuperTypes().add(this.getDriveAction());
    turnLeftEClass.getESuperTypes().add(this.getDriveAction());
    turnRightEClass.getESuperTypes().add(this.getDriveAction());

    // Initialize classes and features; add operations and parameters
    initEClass(dslEClass, mars.ru.des.robot.taskDSL.DSL.class, "DSL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Missions(), this.getMission(), null, "missions", null, 0, -1, mars.ru.des.robot.taskDSL.DSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_Tasks(), this.getTask(), null, "tasks", null, 0, -1, mars.ru.des.robot.taskDSL.DSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMission_Name(), ecorePackage.getEString(), "name", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMission_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_Action(), this.getAction(), null, "action", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_Detector(), this.getDetector(), null, "detector", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(detectorEClass, Detector.class, "Detector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDetector_Avoiders(), this.getAvoid(), null, "avoiders", null, 0, -1, Detector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(driveUntilEClass, DriveUntil.class, "DriveUntil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDriveUntil_Speed(), this.getSpeed(), "speed", null, 0, 1, DriveUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDriveUntil_Color(), this.getColor(), "color", null, 0, 1, DriveUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDriveUntil_Object(), this.getObject(), "object", null, 0, 1, DriveUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(investigateEClass, Investigate.class, "Investigate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInvestigate_Speed(), this.getSpeed(), "speed", null, 0, 1, Investigate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(speakEClass, Speak.class, "Speak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpeak_Text(), ecorePackage.getEString(), "text", null, 0, 1, Speak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(followLineEClass, FollowLine.class, "FollowLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFollowLine_Distance(), ecorePackage.getEInt(), "distance", null, 0, 1, FollowLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(avoidEClass, Avoid.class, "Avoid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAvoid_Color(), this.getColor(), "color", null, 0, 1, Avoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAvoid_Object(), this.getObject(), "object", null, 0, 1, Avoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAvoid_DriveActions(), this.getDriveAction(), null, "driveActions", null, 0, -1, Avoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(driveActionEClass, DriveAction.class, "DriveAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(moveBackEClass, MoveBack.class, "MoveBack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMoveBack_Meters(), ecorePackage.getEInt(), "meters", null, 0, 1, MoveBack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(turnLeftEClass, TurnLeft.class, "TurnLeft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTurnLeft_Degrees(), ecorePackage.getEInt(), "degrees", null, 0, 1, TurnLeft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(turnRightEClass, TurnRight.class, "TurnRight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTurnRight_Degrees(), ecorePackage.getEInt(), "degrees", null, 0, 1, TurnRight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(objectEEnum, mars.ru.des.robot.taskDSL.Object.class, "Object");
    addEEnumLiteral(objectEEnum, mars.ru.des.robot.taskDSL.Object.ROCK);
    addEEnumLiteral(objectEEnum, mars.ru.des.robot.taskDSL.Object.LAKE);

    initEEnum(speedEEnum, Speed.class, "Speed");
    addEEnumLiteral(speedEEnum, Speed.FAST);
    addEEnumLiteral(speedEEnum, Speed.NORMAL);
    addEEnumLiteral(speedEEnum, Speed.SLOW);

    initEEnum(colorEEnum, Color.class, "Color");
    addEEnumLiteral(colorEEnum, Color.RED);
    addEEnumLiteral(colorEEnum, Color.GREEN);
    addEEnumLiteral(colorEEnum, Color.BLUE);

    // Create resource
    createResource(eNS_URI);
  }

} //TaskDSLPackageImpl
