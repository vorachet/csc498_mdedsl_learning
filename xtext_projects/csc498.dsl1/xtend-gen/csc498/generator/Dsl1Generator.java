package csc498.generator;

import com.google.common.collect.Iterables;
import csc498.dsl1.Contact;
import csc498.dsl1.Email;
import csc498.dsl1.Model;
import csc498.dsl1.RSVP;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class Dsl1Generator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Model> _filter = Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class);
    for (final Model e : _filter) {
      fsa.generateFile("Contacts.txt", this.compile(e));
    }
    Iterable<RSVP> _filter_1 = Iterables.<RSVP>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), RSVP.class);
    for (final RSVP e_1 : _filter_1) {
      {
        EObject _eContainer = e_1.eContainer();
        final Model m = ((Model) _eContainer);
        String _name = e_1.getName();
        String _plus = (_name + ".txt");
        fsa.generateFile(_plus, this.compile(e_1, m.getContacts()));
      }
    }
    Iterable<Email> _filter_2 = Iterables.<Email>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Email.class);
    for (final Email e_2 : _filter_2) {
      String _name = e_2.getName();
      String _plus = (_name + ".txt");
      fsa.generateFile(_plus, this.compile(e_2));
    }
  }
  
  protected CharSequence compile(final Model m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CS@SIT people");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Contact> _contacts = m.getContacts();
      for(final Contact c : _contacts) {
        String _name = c.getName();
        _builder.append(_name);
        _builder.append(" <");
        String _email = c.getEmail();
        _builder.append(_email);
        _builder.append(">");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence compile(final RSVP r, final EList<Contact> contacts) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Dear ");
    _builder.newLine();
    {
      for(final Contact c : contacts) {
        String _name = c.getName();
        _builder.append(_name);
        _builder.append(" <");
        String _email = c.getEmail();
        _builder.append(_email);
        _builder.append(">");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    String _message = r.getMessage();
    _builder.append(_message);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence compile(final Email e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Dear ");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Contact> _contacts = e.getContacts();
      for(final Contact c : _contacts) {
        String _name = c.getName();
        _builder.append(_name);
        _builder.append(" <");
        String _email = c.getEmail();
        _builder.append(_email);
        _builder.append(">");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    String _message = e.getMessage();
    _builder.append(_message);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
