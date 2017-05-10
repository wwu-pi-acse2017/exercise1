/**
 */
package Epc.impl;

import Epc.EpcPackage;
import Epc.Function;
import Epc.ProcessAnnotation;
import Epc.ProcessAnnotationConnector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Annotation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Epc.impl.ProcessAnnotationConnectorImpl#getStart <em>Start</em>}</li>
 *   <li>{@link Epc.impl.ProcessAnnotationConnectorImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessAnnotationConnectorImpl extends ConnectorImpl implements ProcessAnnotationConnector {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected ProcessAnnotation start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Function end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessAnnotationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpcPackage.Literals.PROCESS_ANNOTATION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessAnnotation getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (ProcessAnnotation)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EpcPackage.PROCESS_ANNOTATION_CONNECTOR__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessAnnotation basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(ProcessAnnotation newStart, NotificationChain msgs) {
		ProcessAnnotation oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpcPackage.PROCESS_ANNOTATION_CONNECTOR__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(ProcessAnnotation newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EpcPackage.PROCESS_ANNOTATION__CONNECTORS, ProcessAnnotation.class, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EpcPackage.PROCESS_ANNOTATION__CONNECTORS, ProcessAnnotation.class, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpcPackage.PROCESS_ANNOTATION_CONNECTOR__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (Function)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EpcPackage.PROCESS_ANNOTATION_CONNECTOR__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Function newEnd, NotificationChain msgs) {
		Function oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpcPackage.PROCESS_ANNOTATION_CONNECTOR__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Function newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EpcPackage.FUNCTION__ANNOTATIONS, Function.class, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EpcPackage.FUNCTION__ANNOTATIONS, Function.class, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpcPackage.PROCESS_ANNOTATION_CONNECTOR__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EpcPackage.PROCESS_ANNOTATION_CONNECTOR__START:
				if (start != null)
					msgs = ((InternalEObject)start).eInverseRemove(this, EpcPackage.PROCESS_ANNOTATION__CONNECTORS, ProcessAnnotation.class, msgs);
				return basicSetStart((ProcessAnnotation)otherEnd, msgs);
			case EpcPackage.PROCESS_ANNOTATION_CONNECTOR__END:
				if (end != null)
					msgs = ((InternalEObject)end).eInverseRemove(this, EpcPackage.FUNCTION__ANNOTATIONS, Function.class, msgs);
				return basicSetEnd((Function)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EpcPackage.PROCESS_ANNOTATION_CONNECTOR__START:
				return basicSetStart(null, msgs);
			case EpcPackage.PROCESS_ANNOTATION_CONNECTOR__END:
				return basicSetEnd(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EpcPackage.PROCESS_ANNOTATION_CONNECTOR__START:
				if (resolve) return getStart();
				return basicGetStart();
			case EpcPackage.PROCESS_ANNOTATION_CONNECTOR__END:
				if (resolve) return getEnd();
				return basicGetEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EpcPackage.PROCESS_ANNOTATION_CONNECTOR__START:
				setStart((ProcessAnnotation)newValue);
				return;
			case EpcPackage.PROCESS_ANNOTATION_CONNECTOR__END:
				setEnd((Function)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EpcPackage.PROCESS_ANNOTATION_CONNECTOR__START:
				setStart((ProcessAnnotation)null);
				return;
			case EpcPackage.PROCESS_ANNOTATION_CONNECTOR__END:
				setEnd((Function)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EpcPackage.PROCESS_ANNOTATION_CONNECTOR__START:
				return start != null;
			case EpcPackage.PROCESS_ANNOTATION_CONNECTOR__END:
				return end != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessAnnotationConnectorImpl
