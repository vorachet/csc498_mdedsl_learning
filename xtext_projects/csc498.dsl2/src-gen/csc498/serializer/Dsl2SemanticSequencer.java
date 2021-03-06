/*
 * generated by Xtext 2.22.0
 */
package csc498.serializer;

import com.google.inject.Inject;
import csc498.dsl2.Down;
import csc498.dsl2.Dsl2Package;
import csc498.dsl2.Game;
import csc498.dsl2.Left;
import csc498.dsl2.Model;
import csc498.dsl2.Right;
import csc498.dsl2.Up;
import csc498.services.Dsl2GrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class Dsl2SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Dsl2GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Dsl2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Dsl2Package.DOWN:
				sequence_Down(context, (Down) semanticObject); 
				return; 
			case Dsl2Package.GAME:
				sequence_Game(context, (Game) semanticObject); 
				return; 
			case Dsl2Package.LEFT:
				sequence_Left(context, (Left) semanticObject); 
				return; 
			case Dsl2Package.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case Dsl2Package.RIGHT:
				sequence_Right(context, (Right) semanticObject); 
				return; 
			case Dsl2Package.UP:
				sequence_Up(context, (Up) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Command returns Down
	 *     Down returns Down
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Down(ISerializationContext context, Down semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Dsl2Package.Literals.COMMAND__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Dsl2Package.Literals.COMMAND__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDownAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Game returns Game
	 *
	 * Constraint:
	 *     (name=ID commands+=Command*)
	 */
	protected void sequence_Game(ISerializationContext context, Game semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Left
	 *     Left returns Left
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Left(ISerializationContext context, Left semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Dsl2Package.Literals.COMMAND__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Dsl2Package.Literals.COMMAND__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLeftAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     games+=Game+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Right
	 *     Right returns Right
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Right(ISerializationContext context, Right semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Dsl2Package.Literals.COMMAND__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Dsl2Package.Literals.COMMAND__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRightAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Up
	 *     Up returns Up
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Up(ISerializationContext context, Up semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Dsl2Package.Literals.COMMAND__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Dsl2Package.Literals.COMMAND__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUpAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
