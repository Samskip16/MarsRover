/**
 * generated by Xtext 2.15.0
 */
package mars.ru.des.robot.taskDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mars.ru.des.robot.taskDSL.Detector#getAvoiders <em>Avoiders</em>}</li>
 * </ul>
 *
 * @see mars.ru.des.robot.taskDSL.TaskDSLPackage#getDetector()
 * @model
 * @generated
 */
public interface Detector extends EObject
{
  /**
   * Returns the value of the '<em><b>Avoiders</b></em>' containment reference list.
   * The list contents are of type {@link mars.ru.des.robot.taskDSL.Avoid}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Avoiders</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Avoiders</em>' containment reference list.
   * @see mars.ru.des.robot.taskDSL.TaskDSLPackage#getDetector_Avoiders()
   * @model containment="true"
   * @generated
   */
  EList<Avoid> getAvoiders();

} // Detector
