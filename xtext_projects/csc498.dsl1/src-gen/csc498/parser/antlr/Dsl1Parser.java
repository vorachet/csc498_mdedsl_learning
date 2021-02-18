/*
 * generated by Xtext 2.22.0
 */
package csc498.parser.antlr;

import com.google.inject.Inject;
import csc498.parser.antlr.internal.InternalDsl1Parser;
import csc498.services.Dsl1GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class Dsl1Parser extends AbstractAntlrParser {

	@Inject
	private Dsl1GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDsl1Parser createParser(XtextTokenStream stream) {
		return new InternalDsl1Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public Dsl1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Dsl1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}