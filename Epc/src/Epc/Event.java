/**
 */
package Epc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Epc.Event#isStart <em>Start</em>}</li>
 *   <li>{@link Epc.Event#isEnd <em>End</em>}</li>
 * </ul>
 *
 * @see Epc.EpcPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends ControlFlowNode {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(boolean)
	 * @see Epc.EpcPackage#getEvent_Start()
	 * @model default="false"
	 * @generated
	 */
	boolean isStart();

	/**
	 * Sets the value of the '{@link Epc.Event#isStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #isStart()
	 * @generated
	 */
	void setStart(boolean value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(boolean)
	 * @see Epc.EpcPackage#getEvent_End()
	 * @model default="false"
	 * @generated
	 */
	boolean isEnd();

	/**
	 * Sets the value of the '{@link Epc.Event#isEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #isEnd()
	 * @generated
	 */
	void setEnd(boolean value);

} // Event
