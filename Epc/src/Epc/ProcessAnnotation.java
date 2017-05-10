/**
 */
package Epc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Epc.ProcessAnnotation#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see Epc.EpcPackage#getProcessAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface ProcessAnnotation extends Node {
	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' reference list.
	 * The list contents are of type {@link Epc.ProcessAnnotationConnector}.
	 * It is bidirectional and its opposite is '{@link Epc.ProcessAnnotationConnector#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' reference list.
	 * @see Epc.EpcPackage#getProcessAnnotation_Connectors()
	 * @see Epc.ProcessAnnotationConnector#getStart
	 * @model opposite="start"
	 * @generated
	 */
	EList<ProcessAnnotationConnector> getConnectors();

} // ProcessAnnotation
