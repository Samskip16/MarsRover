/**
 * generated by Xtext 2.15.0
 */
package mars.ru.des.robot.taskDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn Right</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.ru.des.robot.taskDSL.TurnRight#getDegrees <em>Degrees</em>}</li>
 * </ul>
 *
 * @see mars.ru.des.robot.taskDSL.TaskDSLPackage#getTurnRight()
 * @model
 * @generated
 */
public interface TurnRight extends DriveAction
{
  /**
   * Returns the value of the '<em><b>Degrees</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Degrees</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Degrees</em>' attribute.
   * @see #setDegrees(int)
   * @see mars.ru.des.robot.taskDSL.TaskDSLPackage#getTurnRight_Degrees()
   * @model
   * @generated
   */
  int getDegrees();

  /**
   * Sets the value of the '{@link mars.ru.des.robot.taskDSL.TurnRight#getDegrees <em>Degrees</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Degrees</em>' attribute.
   * @see #getDegrees()
   * @generated
   */
  void setDegrees(int value);

} // TurnRight
