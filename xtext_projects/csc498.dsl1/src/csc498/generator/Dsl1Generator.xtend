package csc498.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import csc498.dsl1.Contact
import csc498.dsl1.RSVP
import csc498.dsl1.Email
import csc498.dsl1.Model
import org.eclipse.emf.common.util.EList

class Dsl1Generator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
	
		for (e : resource.allContents.toIterable.filter(Model)) {
			fsa.generateFile("Contacts.txt", e.compile)
		}
			
		for (e : resource.allContents.toIterable.filter(RSVP)) {
			val m = e.eContainer as Model
			fsa.generateFile(e.name + ".txt", e.compile(m.contacts))
		}
		
		for (e : resource.allContents.toIterable.filter(Email)) {
			fsa.generateFile(e.name + ".txt", e.compile)
		}
	}
	
	protected def compile(Model m) '''
	CS@SIT people
	
	«FOR c : m.contacts»
	«c.name» <«c.email»>
	«ENDFOR»
	'''
	
	protected def compile(RSVP r, EList<Contact> contacts) '''
	Dear 
	«FOR c : contacts»
	«c.name» <«c.email»>
	«ENDFOR»

	«r.message»
	'''
	
	protected def compile(Email e) '''
	Dear 
	
	«FOR c : e.contacts»
	«c.name» <«c.email»>
	«ENDFOR»
	
	«e.message»
	'''
	
}
