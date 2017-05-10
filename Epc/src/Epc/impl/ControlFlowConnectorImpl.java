/**
 */
package Epc.impl;

import Epc.ControlFlowConnector;
import Epc.ControlFlowNode;
import Epc.EpcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flow Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Epc.impl.ControlFlowConnectorImpl#getStart <em>Start</em>}</li>
 *   <li>{@link Epc.impl.ControlFlowConnectorImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlFlowConnectorImpl extends ConnectorImpl implements ControlFlowConnector {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected ControlFlowNode start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected ControlFlowNode end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpcPackage.Literals.CONTROL_FLOW_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowNode getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (ControlFlowNode)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EpcPackage.CONTROL_FLOW_CONNECTOR__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowNode basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(ControlFlowNode newStart, NotificationChain msgs) {
		ControlFlowNode oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpcPackage.CONTROL_FLOW_CONNECTOR__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(ControlFlowNode newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EpcPackage.CONTROL_FLOW_NODE__OUTGOING_CONNECTORS, ControlFlowNode.class, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EpcPackage.CONTROL_FLOW_NODE__OUTGOING_CONNECTORS, ControlFlowNode.class, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpcPackage.CONTROL_FLOW_CONNECTOR__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowNode getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (ControlFlowNode)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EpcPackage.CONTROL_FLOW_CONNECTOR__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowNode basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(ControlFlowNode newEnd, NotificationChain msgs) {
		ControlFlowNode oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpcPackage.CONTROL_FLOW_CONNECTOR__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(ControlFlowNode newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EpcPackage.CONTROL_FLOW_NODE__INCOMING_CONNECTORS, ControlFlowNode.class, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EpcPackage.CONTROL_FLOW_NODE__INCOMING_CONNECTORS, ControlFlowNode.class, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpcPackage.CONTROL_FLOW_CONNECTOR__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EpcPackage.CONTROL_FLOW_CONNECTOR__START:
				if (start != null)
					msgs = ((InternalEObject)start).eInverseRemove(this, EpcPackage.CONTROL_FLOW_NODE__OUTGOING_CONNECTORS, ControlFlowNode.class, msgs);
				return basicSetStart((ControlFlowNode)otherEnd, msgs);
			case EpcPackage.CONTROL_FLOW_CONNECTOR__END:
				if (end != null)
					msgs = ((InternalEObject)end).eInverseRemove(this, EpcPackage.CONTROL_FLOW_NODE__INCOMING_CONNECTORS, ControlFlowNode.class, msgs);
				return basicSetEnd((ControlFlowNode)otherEnd, msgs);
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
			case EpcPackage.CONTROL_FLOW_CONNECTOR__START:
				return basicSetStart(null, msgs);
			case EpcPackage.CONTROL_FLOW_CONNECTOR__END:
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
			case EpcPackage.CONTROL_FLOW_CONNECTOR__START:
				if (resolve) return getStart();
				return basicGetStart();
			case EpcPackage.CONTROL_FLOW_CONNECTOR__END:
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
			case EpcPackage.CONTROL_FLOW_CONNECTOR__START:
				setStart((ControlFlowNode)newValue);
				return;
			case EpcPackage.CONTROL_FLOW_CONNECTOR__END:
				setEnd((ControlFlowNode)newValue);
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
			case EpcPackage.CONTROL_FLOW_CONNECTOR__START:
				setStart((ControlFlowNode)null);
				return;
			case EpcPackage.CONTROL_FLOW_CONNECTOR__END:
				setEnd((ControlFlowNode)null);
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
			case EpcPackage.CONTROL_FLOW_CONNECTOR__START:
				return start != null;
			case EpcPackage.CONTROL_FLOW_CONNECTOR__END:
				return end != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlFlowConnectorImpl
