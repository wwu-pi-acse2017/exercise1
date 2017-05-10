/**
 */
package Epc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Epc.ControlFlowNode#getIncomingConnectors <em>Incoming Connectors</em>}</li>
 *   <li>{@link Epc.ControlFlowNode#getOutgoingConnectors <em>Outgoing Connectors</em>}</li>
 * </ul>
 *
 * @see Epc.EpcPackage#getControlFlowNode()
 * @model abstract="true"
 * @generated
 */
public interface ControlFlowNode extends Node {
	/**
	 * Returns the value of the '<em><b>Incoming Connectors</b></em>' reference list.
	 * The list contents are of type {@link Epc.ControlFlowConnector}.
	 * It is bidirectional and its opposite is '{@link Epc.ControlFlowConnector#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connectors</em>' reference list.
	 * @see Epc.EpcPackage#getControlFlowNode_IncomingConnectors()
	 * @see Epc.ControlFlowConnector#getEnd
	 * @model opposite="end"
	 * @generated
	 */
	EList<ControlFlowConnector> getIncomingConnectors();

	/**
	 * Returns the value of the '<em><b>Outgoing Connectors</b></em>' reference list.
	 * The list contents are of type {@link Epc.ControlFlowConnector}.
	 * It is bidirectional and its opposite is '{@link Epc.ControlFlowConnector#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connectors</em>' reference list.
	 * @see Epc.EpcPackage#getControlFlowNode_OutgoingConnectors()
	 * @see Epc.ControlFlowConnector#getStart
	 * @model opposite="start"
	 * @generated
	 */
	EList<ControlFlowConnector> getOutgoingConnectors();

} // ControlFlowNode
