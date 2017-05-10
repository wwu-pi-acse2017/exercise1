/**
 */
package Epc.impl;

import Epc.ControlFlowConnector;
import Epc.ControlFlowNode;
import Epc.EpcPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flow Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Epc.impl.ControlFlowNodeImpl#getIncomingConnectors <em>Incoming Connectors</em>}</li>
 *   <li>{@link Epc.impl.ControlFlowNodeImpl#getOutgoingConnectors <em>Outgoing Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControlFlowNodeImpl extends NodeImpl implements ControlFlowNode {
	/**
	 * The cached value of the '{@link #getIncomingConnectors() <em>Incoming Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlFlowConnector> incomingConnectors;

	/**
	 * The cached value of the '{@link #getOutgoingConnectors() <em>Outgoing Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlFlowConnector> outgoingConnectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpcPackage.Literals.CONTROL_FLOW_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlFlowConnector> getIncomingConnectors() {
		if (incomingConnectors == null) {
			incomingConnectors = new EObjectWithInverseResolvingEList<ControlFlowConnector>(ControlFlowConnector.class, this, EpcPackage.CONTROL_FLOW_NODE__INCOMING_CONNECTORS, EpcPackage.CONTROL_FLOW_CONNECTOR__END);
		}
		return incomingConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlFlowConnector> getOutgoingConnectors() {
		if (outgoingConnectors == null) {
			outgoingConnectors = new EObjectWithInverseResolvingEList<ControlFlowConnector>(ControlFlowConnector.class, this, EpcPackage.CONTROL_FLOW_NODE__OUTGOING_CONNECTORS, EpcPackage.CONTROL_FLOW_CONNECTOR__START);
		}
		return outgoingConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EpcPackage.CONTROL_FLOW_NODE__INCOMING_CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingConnectors()).basicAdd(otherEnd, msgs);
			case EpcPackage.CONTROL_FLOW_NODE__OUTGOING_CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingConnectors()).basicAdd(otherEnd, msgs);
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
			case EpcPackage.CONTROL_FLOW_NODE__INCOMING_CONNECTORS:
				return ((InternalEList<?>)getIncomingConnectors()).basicRemove(otherEnd, msgs);
			case EpcPackage.CONTROL_FLOW_NODE__OUTGOING_CONNECTORS:
				return ((InternalEList<?>)getOutgoingConnectors()).basicRemove(otherEnd, msgs);
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
			case EpcPackage.CONTROL_FLOW_NODE__INCOMING_CONNECTORS:
				return getIncomingConnectors();
			case EpcPackage.CONTROL_FLOW_NODE__OUTGOING_CONNECTORS:
				return getOutgoingConnectors();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EpcPackage.CONTROL_FLOW_NODE__INCOMING_CONNECTORS:
				getIncomingConnectors().clear();
				getIncomingConnectors().addAll((Collection<? extends ControlFlowConnector>)newValue);
				return;
			case EpcPackage.CONTROL_FLOW_NODE__OUTGOING_CONNECTORS:
				getOutgoingConnectors().clear();
				getOutgoingConnectors().addAll((Collection<? extends ControlFlowConnector>)newValue);
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
			case EpcPackage.CONTROL_FLOW_NODE__INCOMING_CONNECTORS:
				getIncomingConnectors().clear();
				return;
			case EpcPackage.CONTROL_FLOW_NODE__OUTGOING_CONNECTORS:
				getOutgoingConnectors().clear();
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
			case EpcPackage.CONTROL_FLOW_NODE__INCOMING_CONNECTORS:
				return incomingConnectors != null && !incomingConnectors.isEmpty();
			case EpcPackage.CONTROL_FLOW_NODE__OUTGOING_CONNECTORS:
				return outgoingConnectors != null && !outgoingConnectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlFlowNodeImpl
