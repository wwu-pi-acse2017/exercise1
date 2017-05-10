/**
 */
package Epc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Epc.Function#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see Epc.EpcPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends ControlFlowNode {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link Epc.ProcessAnnotationConnector}.
	 * It is bidirectional and its opposite is '{@link Epc.ProcessAnnotationConnector#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see Epc.EpcPackage#getFunction_Annotations()
	 * @see Epc.ProcessAnnotationConnector#getEnd
	 * @model opposite="end"
	 * @generated
	 */
	EList<ProcessAnnotationConnector> getAnnotations();

} // Function
