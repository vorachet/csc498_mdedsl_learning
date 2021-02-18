package csc498.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import csc498.dsl3.Statemachine
import csc498.dsl3.Command
import csc498.dsl3.State

class Dsl3Generator extends AbstractGenerator {

override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
			fsa.generateFile(resource.className+".java", toJavaCode(resource.contents.head as Statemachine))
	}
	
	protected def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.')).toFirstUpper
	}

	protected def toJavaCode(Statemachine sm) '''
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		
		public class «sm.eResource.className» {
			
			public static void main(String[] args) {
				new «sm.eResource.className»().run();
			}
			
			«FOR c : sm.commands»
				«c.declareCommand»
			«ENDFOR»
			
			protected void run() {
				boolean executeActions = true;
				String currentState = "«sm.states.head?.name»";
				String lastEvent = null;
				while (true) {
					«FOR state : sm.states»
						«state.generateCode»
					«ENDFOR»
					«FOR resetEvent : sm.resetEvents»
						if ("«resetEvent.name»".equals(lastEvent)) {
							System.out.println("Resetting state machine.");
							currentState = "«sm.states.head?.name»";
							executeActions = true;
						}
					«ENDFOR»
					
				}
			}
			
			private String receiveEvent() {
				System.out.flush();
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				try {
					return br.readLine();
				} catch (IOException ioe) {
					System.out.println("Problem reading input");
					return "";
				}
			}
		}
	'''

	protected def declareCommand(Command command) '''
		protected void do«command.name.toFirstUpper»() {
			System.out.println("Executing command «command.name»");
		}
	'''

	protected def generateCode(State state) '''
		if (currentState.equals("«state.name»")) {
			if (executeActions) {
				«FOR c : state.actions»
					do«c.name.toFirstUpper»();
				«ENDFOR»
				executeActions = false;
			}
			System.out.println("Your are now in state '«state.name»'. Possible events are [«
				state.transitions.map(t | t.event.name).join(', ')»].");
			lastEvent = receiveEvent();
			«FOR t : state.transitions»
				if ("«t.event.name»".equals(lastEvent)) {
					currentState = "«t.state.name»";
					executeActions = true;
				}
			«ENDFOR»
		}
	'''
}
