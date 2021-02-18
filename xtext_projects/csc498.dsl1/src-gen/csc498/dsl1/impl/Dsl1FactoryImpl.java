/**
 * generated by Xtext 2.22.0
 */
package csc498.dsl1.impl;

import csc498.dsl1.*;

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
public class Dsl1FactoryImpl extends EFactoryImpl implements Dsl1Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Dsl1Factory init()
  {
    try
    {
      Dsl1Factory theDsl1Factory = (Dsl1Factory)EPackage.Registry.INSTANCE.getEFactory(Dsl1Package.eNS_URI);
      if (theDsl1Factory != null)
      {
        return theDsl1Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Dsl1FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dsl1FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Dsl1Package.MODEL: return createModel();
      case Dsl1Package.CONTACT: return createContact();
      case Dsl1Package.RSVP: return createRSVP();
      case Dsl1Package.EMAIL: return createEmail();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Contact createContact()
  {
    ContactImpl contact = new ContactImpl();
    return contact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RSVP createRSVP()
  {
    RSVPImpl rsvp = new RSVPImpl();
    return rsvp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Email createEmail()
  {
    EmailImpl email = new EmailImpl();
    return email;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dsl1Package getDsl1Package()
  {
    return (Dsl1Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Dsl1Package getPackage()
  {
    return Dsl1Package.eINSTANCE;
  }

} //Dsl1FactoryImpl