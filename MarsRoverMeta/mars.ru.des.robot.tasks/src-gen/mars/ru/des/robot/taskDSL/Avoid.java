/**
 * generated by Xtext 2.15.0
 */
package mars.ru.des.robot.taskDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avoid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.ru.des.robot.taskDSL.Avoid#getColor <em>Color</em>}</li>
 *   <li>{@link mars.ru.des.robot.taskDSL.Avoid#getObject <em>Object</em>}</li>
 *   <li>{@link mars.ru.des.robot.taskDSL.Avoid#getDriveActions <em>Drive Actions</em>}</li>
 * </ul>
 *
 * @see mars.ru.des.robot.taskDSL.TaskDSLPackage#getAvoid()
 * @model
 * @generated
 */
public interface Avoid extends EObject
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * The literals are from the enumeration {@link mars.ru.des.robot.taskDSL.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see mars.ru.des.robot.taskDSL.Color
   * @see #setColor(Color)
   * @see mars.ru.des.robot.taskDSL.TaskDSLPackage#getAvoid_Color()
   * @model
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link mars.ru.des.robot.taskDSL.Avoid#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see mars.ru.des.robot.taskDSL.Color
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

  /**
   * Returns the value of the '<em><b>Object</b></em>' attribute.
   * The literals are from the enumeration {@link mars.ru.des.robot.taskDSL.Object}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' attribute.
   * @see mars.ru.des.robot.taskDSL.Object
   * @see #setObject(mars.ru.des.robot.taskDSL.Object)
   * @see mars.ru.des.robot.taskDSL.TaskDSLPackage#getAvoid_Object()
   * @model
   * @generated
   */
  mars.ru.des.robot.taskDSL.Object getObject();

  /**
   * Sets the value of the '{@link mars.ru.des.robot.taskDSL.Avoid#getObject <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' attribute.
   * @see mars.ru.des.robot.taskDSL.Object
   * @see #getObject()
   * @generated
   */
  void setObject(mars.ru.des.robot.taskDSL.Object value);

  /**
   * Returns the value of the '<em><b>Drive Actions</b></em>' containment reference list.
   * The list contents are of type {@link mars.ru.des.robot.taskDSL.DriveAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Drive Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Drive Actions</em>' containment reference list.
   * @see mars.ru.des.robot.taskDSL.TaskDSLPackage#getAvoid_DriveActions()
   * @model containment="true"
   * @generated
   */
  EList<DriveAction> getDriveActions();

} // Avoid
