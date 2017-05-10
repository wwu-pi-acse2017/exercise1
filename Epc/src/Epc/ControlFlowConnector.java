/**
 */
package Epc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Epc.ControlFlowConnector#getStart <em>Start</em>}</li>
 *   <li>{@link Epc.ControlFlowConnector#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see Epc.EpcPackage#getControlFlowConnector()
 * @model
 * @generated
 */
public interface ControlFlowConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Epc.ControlFlowNode#getOutgoingConnectors <em>Outgoing Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(ControlFlowNode)
	 * @see Epc.EpcPackage#getControlFlowConnector_Start()
	 * @see Epc.ControlFlowNode#getOutgoingConnectors
	 * @model opposite="outgoingConnectors" required="true"
	 * @generated
	 */
	ControlFlowNode getStart();

	/**
	 * Sets the value of the '{@link Epc.ControlFlowConnector#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(ControlFlowNode value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Epc.ControlFlowNode#getIncomingConnectors <em>Incoming Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(ControlFlowNode)
	 * @see Epc.EpcPackage#getControlFlowConnector_End()
	 * @see Epc.ControlFlowNode#getIncomingConnectors
	 * @model opposite="incomingConnectors" required="true"
	 * @generated
	 */
	ControlFlowNode getEnd();

	/**
	 * Sets the value of the '{@link Epc.ControlFlowConnector#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(ControlFlowNode value);

} // ControlFlowConnector
