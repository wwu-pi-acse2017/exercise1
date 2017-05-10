/**
 */
package Epc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Annotation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Epc.ProcessAnnotationConnector#getStart <em>Start</em>}</li>
 *   <li>{@link Epc.ProcessAnnotationConnector#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see Epc.EpcPackage#getProcessAnnotationConnector()
 * @model
 * @generated
 */
public interface ProcessAnnotationConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Epc.ProcessAnnotation#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(ProcessAnnotation)
	 * @see Epc.EpcPackage#getProcessAnnotationConnector_Start()
	 * @see Epc.ProcessAnnotation#getConnectors
	 * @model opposite="connectors" required="true"
	 * @generated
	 */
	ProcessAnnotation getStart();

	/**
	 * Sets the value of the '{@link Epc.ProcessAnnotationConnector#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(ProcessAnnotation value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Epc.Function#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Function)
	 * @see Epc.EpcPackage#getProcessAnnotationConnector_End()
	 * @see Epc.Function#getAnnotations
	 * @model opposite="annotations" required="true"
	 * @generated
	 */
	Function getEnd();

	/**
	 * Sets the value of the '{@link Epc.ProcessAnnotationConnector#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Function value);

} // ProcessAnnotationConnector
