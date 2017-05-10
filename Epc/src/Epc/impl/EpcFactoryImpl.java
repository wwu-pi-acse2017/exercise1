/**
 */
package Epc.impl;

import Epc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EpcFactoryImpl extends EFactoryImpl implements EpcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EpcFactory init() {
		try {
			EpcFactory theEpcFactory = (EpcFactory)EPackage.Registry.INSTANCE.getEFactory(EpcPackage.eNS_URI);
			if (theEpcFactory != null) {
				return theEpcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EpcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpcFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EpcPackage.MODEL: return createModel();
			case EpcPackage.EVENT: return createEvent();
			case EpcPackage.FUNCTION: return createFunction();
			case EpcPackage.XOR: return createXor();
			case EpcPackage.AND: return createAnd();
			case EpcPackage.OR: return createOr();
			case EpcPackage.INFORMATION_OBJECT: return createInformationObject();
			case EpcPackage.ORG_UNIT: return createOrgUnit();
			case EpcPackage.CONTROL_FLOW_CONNECTOR: return createControlFlowConnector();
			case EpcPackage.PROCESS_ANNOTATION_CONNECTOR: return createProcessAnnotationConnector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xor createXor() {
		XorImpl xor = new XorImpl();
		return xor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationObject createInformationObject() {
		InformationObjectImpl informationObject = new InformationObjectImpl();
		return informationObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgUnit createOrgUnit() {
		OrgUnitImpl orgUnit = new OrgUnitImpl();
		return orgUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowConnector createControlFlowConnector() {
		ControlFlowConnectorImpl controlFlowConnector = new ControlFlowConnectorImpl();
		return controlFlowConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessAnnotationConnector createProcessAnnotationConnector() {
		ProcessAnnotationConnectorImpl processAnnotationConnector = new ProcessAnnotationConnectorImpl();
		return processAnnotationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpcPackage getEpcPackage() {
		return (EpcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EpcPackage getPackage() {
		return EpcPackage.eINSTANCE;
	}

} //EpcFactoryImpl
