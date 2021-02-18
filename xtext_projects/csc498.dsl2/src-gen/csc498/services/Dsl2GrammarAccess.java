/*
 * generated by Xtext 2.22.0
 */
package csc498.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Dsl2GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "csc498.Dsl2.Model");
		private final Assignment cGamesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cGamesGameParserRuleCall_0 = (RuleCall)cGamesAssignment.eContents().get(0);
		
		//Model:
		//	games+=Game*;
		@Override public ParserRule getRule() { return rule; }
		
		//games+=Game*
		public Assignment getGamesAssignment() { return cGamesAssignment; }
		
		//Game
		public RuleCall getGamesGameParserRuleCall_0() { return cGamesGameParserRuleCall_0; }
	}
	public class GameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "csc498.Dsl2.Game");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGameKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCommandsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCommandsCommandParserRuleCall_3_0 = (RuleCall)cCommandsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Game:
		//	'Game' name=ID '{'
		//	commands+=Command*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Game' name=ID '{' commands+=Command* '}'
		public Group getGroup() { return cGroup; }
		
		//'Game'
		public Keyword getGameKeyword_0() { return cGameKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//commands+=Command*
		public Assignment getCommandsAssignment_3() { return cCommandsAssignment_3; }
		
		//Command
		public RuleCall getCommandsCommandParserRuleCall_3_0() { return cCommandsCommandParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "csc498.Dsl2.Command");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cUpParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDownParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRightParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLeftParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Command:
		//	Up | Down | Right | Left;
		@Override public ParserRule getRule() { return rule; }
		
		//Up | Down | Right | Left
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Up
		public RuleCall getUpParserRuleCall_0() { return cUpParserRuleCall_0; }
		
		//Down
		public RuleCall getDownParserRuleCall_1() { return cDownParserRuleCall_1; }
		
		//Right
		public RuleCall getRightParserRuleCall_2() { return cRightParserRuleCall_2; }
		
		//Left
		public RuleCall getLeftParserRuleCall_3() { return cLeftParserRuleCall_3; }
	}
	public class UpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "csc498.Dsl2.Up");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUpKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueINTTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Up:
		//	'up' '(' value=INT ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'up' '(' value=INT ')'
		public Group getGroup() { return cGroup; }
		
		//'up'
		public Keyword getUpKeyword_0() { return cUpKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//value=INT
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_2_0() { return cValueINTTerminalRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class DownElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "csc498.Dsl2.Down");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDownKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueINTTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Down:
		//	'down' '(' value=INT ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'down' '(' value=INT ')'
		public Group getGroup() { return cGroup; }
		
		//'down'
		public Keyword getDownKeyword_0() { return cDownKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//value=INT
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_2_0() { return cValueINTTerminalRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class RightElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "csc498.Dsl2.Right");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRightKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueINTTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Right:
		//	'right' '(' value=INT ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'right' '(' value=INT ')'
		public Group getGroup() { return cGroup; }
		
		//'right'
		public Keyword getRightKeyword_0() { return cRightKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//value=INT
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_2_0() { return cValueINTTerminalRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class LeftElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "csc498.Dsl2.Left");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueINTTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Left:
		//	'left' '(' value=INT ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'left' '(' value=INT ')'
		public Group getGroup() { return cGroup; }
		
		//'left'
		public Keyword getLeftKeyword_0() { return cLeftKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//value=INT
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_2_0() { return cValueINTTerminalRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	
	
	private final ModelElements pModel;
	private final GameElements pGame;
	private final CommandElements pCommand;
	private final UpElements pUp;
	private final DownElements pDown;
	private final RightElements pRight;
	private final LeftElements pLeft;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Dsl2GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pGame = new GameElements();
		this.pCommand = new CommandElements();
		this.pUp = new UpElements();
		this.pDown = new DownElements();
		this.pRight = new RightElements();
		this.pLeft = new LeftElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("csc498.Dsl2".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	games+=Game*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Game:
	//	'Game' name=ID '{'
	//	commands+=Command*
	//	'}';
	public GameElements getGameAccess() {
		return pGame;
	}
	
	public ParserRule getGameRule() {
		return getGameAccess().getRule();
	}
	
	//Command:
	//	Up | Down | Right | Left;
	public CommandElements getCommandAccess() {
		return pCommand;
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}
	
	//Up:
	//	'up' '(' value=INT ')';
	public UpElements getUpAccess() {
		return pUp;
	}
	
	public ParserRule getUpRule() {
		return getUpAccess().getRule();
	}
	
	//Down:
	//	'down' '(' value=INT ')';
	public DownElements getDownAccess() {
		return pDown;
	}
	
	public ParserRule getDownRule() {
		return getDownAccess().getRule();
	}
	
	//Right:
	//	'right' '(' value=INT ')';
	public RightElements getRightAccess() {
		return pRight;
	}
	
	public ParserRule getRightRule() {
		return getRightAccess().getRule();
	}
	
	//Left:
	//	'left' '(' value=INT ')';
	public LeftElements getLeftAccess() {
		return pLeft;
	}
	
	public ParserRule getLeftRule() {
		return getLeftAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
