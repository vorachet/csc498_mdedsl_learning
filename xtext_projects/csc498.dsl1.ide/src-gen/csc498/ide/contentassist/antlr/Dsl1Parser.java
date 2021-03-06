/*
 * generated by Xtext 2.22.0
 */
package csc498.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import csc498.ide.contentassist.antlr.internal.InternalDsl1Parser;
import csc498.services.Dsl1GrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class Dsl1Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(Dsl1GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, Dsl1GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getContactAccess().getGroup(), "rule__Contact__Group__0");
			builder.put(grammarAccess.getRSVPAccess().getGroup(), "rule__RSVP__Group__0");
			builder.put(grammarAccess.getEmailAccess().getGroup(), "rule__Email__Group__0");
			builder.put(grammarAccess.getModelAccess().getContactsAssignment_0(), "rule__Model__ContactsAssignment_0");
			builder.put(grammarAccess.getModelAccess().getRsvpsAssignment_1(), "rule__Model__RsvpsAssignment_1");
			builder.put(grammarAccess.getModelAccess().getEmailsAssignment_2(), "rule__Model__EmailsAssignment_2");
			builder.put(grammarAccess.getContactAccess().getNameAssignment_1(), "rule__Contact__NameAssignment_1");
			builder.put(grammarAccess.getContactAccess().getEmailAssignment_3(), "rule__Contact__EmailAssignment_3");
			builder.put(grammarAccess.getRSVPAccess().getNameAssignment_1(), "rule__RSVP__NameAssignment_1");
			builder.put(grammarAccess.getRSVPAccess().getMessageAssignment_3(), "rule__RSVP__MessageAssignment_3");
			builder.put(grammarAccess.getEmailAccess().getNameAssignment_1(), "rule__Email__NameAssignment_1");
			builder.put(grammarAccess.getEmailAccess().getContactsAssignment_4(), "rule__Email__ContactsAssignment_4");
			builder.put(grammarAccess.getEmailAccess().getMessageAssignment_7(), "rule__Email__MessageAssignment_7");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private Dsl1GrammarAccess grammarAccess;

	@Override
	protected InternalDsl1Parser createParser() {
		InternalDsl1Parser result = new InternalDsl1Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public Dsl1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Dsl1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
