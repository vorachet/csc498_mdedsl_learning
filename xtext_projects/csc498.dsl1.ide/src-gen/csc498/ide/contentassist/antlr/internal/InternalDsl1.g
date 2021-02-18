/*
 * generated by Xtext 2.22.0
 */
grammar InternalDsl1;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package csc498.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package csc498.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import csc498.services.Dsl1GrammarAccess;

}
@parser::members {
	private Dsl1GrammarAccess grammarAccess;

	public void setGrammarAccess(Dsl1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleContact
entryRuleContact
:
{ before(grammarAccess.getContactRule()); }
	 ruleContact
{ after(grammarAccess.getContactRule()); } 
	 EOF 
;

// Rule Contact
ruleContact 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getContactAccess().getGroup()); }
		(rule__Contact__Group__0)
		{ after(grammarAccess.getContactAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRSVP
entryRuleRSVP
:
{ before(grammarAccess.getRSVPRule()); }
	 ruleRSVP
{ after(grammarAccess.getRSVPRule()); } 
	 EOF 
;

// Rule RSVP
ruleRSVP 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRSVPAccess().getGroup()); }
		(rule__RSVP__Group__0)
		{ after(grammarAccess.getRSVPAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEmail
entryRuleEmail
:
{ before(grammarAccess.getEmailRule()); }
	 ruleEmail
{ after(grammarAccess.getEmailRule()); } 
	 EOF 
;

// Rule Email
ruleEmail 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEmailAccess().getGroup()); }
		(rule__Email__Group__0)
		{ after(grammarAccess.getEmailAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getContactsAssignment_0()); }
	(rule__Model__ContactsAssignment_0)*
	{ after(grammarAccess.getModelAccess().getContactsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getRsvpsAssignment_1()); }
	(rule__Model__RsvpsAssignment_1)*
	{ after(grammarAccess.getModelAccess().getRsvpsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getEmailsAssignment_2()); }
	(rule__Model__EmailsAssignment_2)*
	{ after(grammarAccess.getModelAccess().getEmailsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Contact__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contact__Group__0__Impl
	rule__Contact__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContactAccess().getContactKeyword_0()); }
	'Contact'
	{ after(grammarAccess.getContactAccess().getContactKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contact__Group__1__Impl
	rule__Contact__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContactAccess().getNameAssignment_1()); }
	(rule__Contact__NameAssignment_1)
	{ after(grammarAccess.getContactAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contact__Group__2__Impl
	rule__Contact__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContactAccess().getEmailKeyword_2()); }
	'email'
	{ after(grammarAccess.getContactAccess().getEmailKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Contact__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContactAccess().getEmailAssignment_3()); }
	(rule__Contact__EmailAssignment_3)
	{ after(grammarAccess.getContactAccess().getEmailAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RSVP__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RSVP__Group__0__Impl
	rule__RSVP__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RSVP__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRSVPAccess().getRSVPKeyword_0()); }
	'RSVP'
	{ after(grammarAccess.getRSVPAccess().getRSVPKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RSVP__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RSVP__Group__1__Impl
	rule__RSVP__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RSVP__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRSVPAccess().getNameAssignment_1()); }
	(rule__RSVP__NameAssignment_1)
	{ after(grammarAccess.getRSVPAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RSVP__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RSVP__Group__2__Impl
	rule__RSVP__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RSVP__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRSVPAccess().getMessageKeyword_2()); }
	'message'
	{ after(grammarAccess.getRSVPAccess().getMessageKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RSVP__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RSVP__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RSVP__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRSVPAccess().getMessageAssignment_3()); }
	(rule__RSVP__MessageAssignment_3)
	{ after(grammarAccess.getRSVPAccess().getMessageAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Email__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Email__Group__0__Impl
	rule__Email__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEmailAccess().getEmailKeyword_0()); }
	'Email'
	{ after(grammarAccess.getEmailAccess().getEmailKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Email__Group__1__Impl
	rule__Email__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEmailAccess().getNameAssignment_1()); }
	(rule__Email__NameAssignment_1)
	{ after(grammarAccess.getEmailAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Email__Group__2__Impl
	rule__Email__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEmailAccess().getToKeyword_2()); }
	'to'
	{ after(grammarAccess.getEmailAccess().getToKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Email__Group__3__Impl
	rule__Email__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEmailAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getEmailAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Email__Group__4__Impl
	rule__Email__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getEmailAccess().getContactsAssignment_4()); }
		(rule__Email__ContactsAssignment_4)
		{ after(grammarAccess.getEmailAccess().getContactsAssignment_4()); }
	)
	(
		{ before(grammarAccess.getEmailAccess().getContactsAssignment_4()); }
		(rule__Email__ContactsAssignment_4)*
		{ after(grammarAccess.getEmailAccess().getContactsAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Email__Group__5__Impl
	rule__Email__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEmailAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getEmailAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Email__Group__6__Impl
	rule__Email__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEmailAccess().getMessageKeyword_6()); }
	'message'
	{ after(grammarAccess.getEmailAccess().getMessageKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Email__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEmailAccess().getMessageAssignment_7()); }
	(rule__Email__MessageAssignment_7)
	{ after(grammarAccess.getEmailAccess().getMessageAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ContactsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getContactsContactParserRuleCall_0_0()); }
		ruleContact
		{ after(grammarAccess.getModelAccess().getContactsContactParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__RsvpsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getRsvpsRSVPParserRuleCall_1_0()); }
		ruleRSVP
		{ after(grammarAccess.getModelAccess().getRsvpsRSVPParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__EmailsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getEmailsEmailParserRuleCall_2_0()); }
		ruleEmail
		{ after(grammarAccess.getModelAccess().getEmailsEmailParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContactAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getContactAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Contact__EmailAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContactAccess().getEmailSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getContactAccess().getEmailSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RSVP__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRSVPAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRSVPAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RSVP__MessageAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRSVPAccess().getMessageSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getRSVPAccess().getMessageSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEmailAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEmailAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__ContactsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEmailAccess().getContactsContactCrossReference_4_0()); }
		(
			{ before(grammarAccess.getEmailAccess().getContactsContactIDTerminalRuleCall_4_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEmailAccess().getContactsContactIDTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getEmailAccess().getContactsContactCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Email__MessageAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEmailAccess().getMessageSTRINGTerminalRuleCall_7_0()); }
		RULE_STRING
		{ after(grammarAccess.getEmailAccess().getMessageSTRINGTerminalRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;