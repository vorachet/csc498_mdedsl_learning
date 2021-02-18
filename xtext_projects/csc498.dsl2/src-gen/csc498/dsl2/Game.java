/**
 * generated by Xtext 2.22.0
 */
package csc498.dsl2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csc498.dsl2.Game#getName <em>Name</em>}</li>
 *   <li>{@link csc498.dsl2.Game#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see csc498.dsl2.Dsl2Package#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see csc498.dsl2.Dsl2Package#getGame_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link csc498.dsl2.Game#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link csc498.dsl2.Command}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see csc498.dsl2.Dsl2Package#getGame_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // Game