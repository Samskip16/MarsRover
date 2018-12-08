/**
 * generated by Xtext 2.15.0
 */
package mars.ru.des.robot.taskDSL.impl;

import java.util.Collection;

import mars.ru.des.robot.taskDSL.Avoid;
import mars.ru.des.robot.taskDSL.Color;
import mars.ru.des.robot.taskDSL.DriveAction;
import mars.ru.des.robot.taskDSL.TaskDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Avoid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mars.ru.des.robot.taskDSL.impl.AvoidImpl#getColor <em>Color</em>}</li>
 *   <li>{@link mars.ru.des.robot.taskDSL.impl.AvoidImpl#getObject <em>Object</em>}</li>
 *   <li>{@link mars.ru.des.robot.taskDSL.impl.AvoidImpl#getAvoidActions <em>Avoid Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvoidImpl extends MinimalEObjectImpl.Container implements Avoid
{
  /**
   * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected static final Color COLOR_EDEFAULT = Color.RED;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected Color color = COLOR_EDEFAULT;

  /**
   * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected static final mars.ru.des.robot.taskDSL.Object OBJECT_EDEFAULT = mars.ru.des.robot.taskDSL.Object.ROCK;

  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected mars.ru.des.robot.taskDSL.Object object = OBJECT_EDEFAULT;

  /**
   * The cached value of the '{@link #getAvoidActions() <em>Avoid Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAvoidActions()
   * @generated
   * @ordered
   */
  protected EList<DriveAction> avoidActions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AvoidImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TaskDSLPackage.Literals.AVOID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(Color newColor)
  {
    Color oldColor = color;
    color = newColor == null ? COLOR_EDEFAULT : newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskDSLPackage.AVOID__COLOR, oldColor, color));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mars.ru.des.robot.taskDSL.Object getObject()
  {
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject(mars.ru.des.robot.taskDSL.Object newObject)
  {
    mars.ru.des.robot.taskDSL.Object oldObject = object;
    object = newObject == null ? OBJECT_EDEFAULT : newObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskDSLPackage.AVOID__OBJECT, oldObject, object));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DriveAction> getAvoidActions()
  {
    if (avoidActions == null)
    {
      avoidActions = new EObjectContainmentEList<DriveAction>(DriveAction.class, this, TaskDSLPackage.AVOID__AVOID_ACTIONS);
    }
    return avoidActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TaskDSLPackage.AVOID__AVOID_ACTIONS:
        return ((InternalEList<?>)getAvoidActions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TaskDSLPackage.AVOID__COLOR:
        return getColor();
      case TaskDSLPackage.AVOID__OBJECT:
        return getObject();
      case TaskDSLPackage.AVOID__AVOID_ACTIONS:
        return getAvoidActions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TaskDSLPackage.AVOID__COLOR:
        setColor((Color)newValue);
        return;
      case TaskDSLPackage.AVOID__OBJECT:
        setObject((mars.ru.des.robot.taskDSL.Object)newValue);
        return;
      case TaskDSLPackage.AVOID__AVOID_ACTIONS:
        getAvoidActions().clear();
        getAvoidActions().addAll((Collection<? extends DriveAction>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TaskDSLPackage.AVOID__COLOR:
        setColor(COLOR_EDEFAULT);
        return;
      case TaskDSLPackage.AVOID__OBJECT:
        setObject(OBJECT_EDEFAULT);
        return;
      case TaskDSLPackage.AVOID__AVOID_ACTIONS:
        getAvoidActions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TaskDSLPackage.AVOID__COLOR:
        return color != COLOR_EDEFAULT;
      case TaskDSLPackage.AVOID__OBJECT:
        return object != OBJECT_EDEFAULT;
      case TaskDSLPackage.AVOID__AVOID_ACTIONS:
        return avoidActions != null && !avoidActions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (color: ");
    result.append(color);
    result.append(", object: ");
    result.append(object);
    result.append(')');
    return result.toString();
  }

} //AvoidImpl
