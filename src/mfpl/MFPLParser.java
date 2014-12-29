package mfpl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MFPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__26=1, T__25=2, T__24=3, T__23=4, T__22=5, T__21=6, T__20=7, T__19=8, 
		T__18=9, T__17=10, T__16=11, T__15=12, T__14=13, T__13=14, T__12=15, T__11=16, 
		T__10=17, T__9=18, T__8=19, T__7=20, T__6=21, T__5=22, T__4=23, T__3=24, 
		T__2=25, T__1=26, T__0=27, TYPENAME=28, IDENTIFIER=29, NUMERICVALUE=30, 
		INTVALUE=31, FLOATVALUE=32, STRINGVALUE=33, WS=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'as'", "'incase'", "';'", "'doforever if'", "'print'", 
		"'('", "'noforever'", "'nocount'", "'othercase'", "'*'", "'declare'", 
		"'<-'", "'terminate'", "'to'", "'equals'", "'perform'", "'otherwise'", 
		"'or'", "'start'", "'nocase'", "'syscall'", "'count from'", "')'", "'and'", 
		"'+'", "'-'", "TYPENAME", "IDENTIFIER", "NUMERICVALUE", "INTVALUE", "FLOATVALUE", 
		"STRINGVALUE", "WS"
	};
	public static final int
		RULE_parse = 0, RULE_rootRule = 1, RULE_statementRule = 2, RULE_declarationRule = 3, 
		RULE_assignmentRule = 4, RULE_expressionRule = 5, RULE_expressionRule2 = 6, 
		RULE_expressionRule3 = 7, RULE_expressionRule4 = 8, RULE_expressionRule5 = 9, 
		RULE_expressionRule6 = 10, RULE_conditionalStructRule = 11, RULE_ifRule = 12, 
		RULE_elseIfRule = 13, RULE_elseRule = 14, RULE_routineRule = 15, RULE_loopRule = 16, 
		RULE_countRule = 17, RULE_doforeverifRule = 18, RULE_printRule = 19, RULE_printContentRule = 20, 
		RULE_systemcallRule = 21, RULE_systemcallcontentRule = 22;
	public static final String[] ruleNames = {
		"parse", "rootRule", "statementRule", "declarationRule", "assignmentRule", 
		"expressionRule", "expressionRule2", "expressionRule3", "expressionRule4", 
		"expressionRule5", "expressionRule6", "conditionalStructRule", "ifRule", 
		"elseIfRule", "elseRule", "routineRule", "loopRule", "countRule", "doforeverifRule", 
		"printRule", "printContentRule", "systemcallRule", "systemcallcontentRule"
	};

	@Override
	public String getGrammarFileName() { return "MFPL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MFPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public RootRuleContext rootRule() {
			return getRuleContext(RootRuleContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); rootRule();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RootRuleContext extends ParserRuleContext {
		public List<StatementRuleContext> statementRule() {
			return getRuleContexts(StatementRuleContext.class);
		}
		public StatementRuleContext statementRule(int i) {
			return getRuleContext(StatementRuleContext.class,i);
		}
		public RootRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rootRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterRootRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitRootRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitRootRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootRuleContext rootRule() throws RecognitionException {
		RootRuleContext _localctx = new RootRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rootRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(T__7);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49); statementRule();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__5) | (1L << T__4) | (1L << IDENTIFIER))) != 0) );
			setState(54); match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementRuleContext extends ParserRuleContext {
		public DeclarationRuleContext declarationRule() {
			return getRuleContext(DeclarationRuleContext.class,0);
		}
		public ConditionalStructRuleContext conditionalStructRule() {
			return getRuleContext(ConditionalStructRuleContext.class,0);
		}
		public LoopRuleContext loopRule() {
			return getRuleContext(LoopRuleContext.class,0);
		}
		public RoutineRuleContext routineRule() {
			return getRuleContext(RoutineRuleContext.class,0);
		}
		public AssignmentRuleContext assignmentRule() {
			return getRuleContext(AssignmentRuleContext.class,0);
		}
		public StatementRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementRuleContext statementRule() throws RecognitionException {
		StatementRuleContext _localctx = new StatementRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statementRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			switch (_input.LA(1)) {
			case T__15:
				{
				setState(56); declarationRule();
				}
				break;
			case IDENTIFIER:
				{
				setState(57); assignmentRule();
				}
				break;
			case T__24:
				{
				setState(58); conditionalStructRule();
				}
				break;
			case T__22:
			case T__4:
				{
				setState(59); loopRule();
				}
				break;
			case T__21:
			case T__5:
				{
				setState(60); routineRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(63); match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationRuleContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MFPLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MFPLParser.IDENTIFIER); }
		public TerminalNode TYPENAME() { return getToken(MFPLParser.TYPENAME, 0); }
		public DeclarationRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterDeclarationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitDeclarationRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitDeclarationRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationRuleContext declarationRule() throws RecognitionException {
		DeclarationRuleContext _localctx = new DeclarationRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(T__15);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66); match(IDENTIFIER);
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(71); match(T__25);
			setState(72); match(TYPENAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentRuleContext extends ParserRuleContext {
		public TerminalNode STRINGVALUE() { return getToken(MFPLParser.STRINGVALUE, 0); }
		public ExpressionRuleContext expressionRule() {
			return getRuleContext(ExpressionRuleContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MFPLParser.IDENTIFIER, 0); }
		public AssignmentRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterAssignmentRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitAssignmentRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitAssignmentRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentRuleContext assignmentRule() throws RecognitionException {
		AssignmentRuleContext _localctx = new AssignmentRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(IDENTIFIER);
			setState(75); match(T__14);
			setState(78);
			switch (_input.LA(1)) {
			case T__20:
			case IDENTIFIER:
			case NUMERICVALUE:
				{
				setState(76); expressionRule(0);
				}
				break;
			case STRINGVALUE:
				{
				setState(77); match(STRINGVALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionRuleContext extends ParserRuleContext {
		public Token operator;
		public ExpressionRuleContext expressionRule() {
			return getRuleContext(ExpressionRuleContext.class,0);
		}
		public ExpressionRule2Context expressionRule2() {
			return getRuleContext(ExpressionRule2Context.class,0);
		}
		public ExpressionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterExpressionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitExpressionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionRuleContext expressionRule() throws RecognitionException {
		return expressionRule(0);
	}

	private ExpressionRuleContext expressionRule(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionRuleContext _localctx = new ExpressionRuleContext(_ctx, _parentState);
		ExpressionRuleContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expressionRule, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(81); expressionRule2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionRuleContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionRule);
					setState(83);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(84); ((ExpressionRuleContext)_localctx).operator = match(T__8);
					setState(85); expressionRule2(0);
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionRule2Context extends ParserRuleContext {
		public Token operator;
		public ExpressionRule3Context expressionRule3() {
			return getRuleContext(ExpressionRule3Context.class,0);
		}
		public ExpressionRule2Context expressionRule2() {
			return getRuleContext(ExpressionRule2Context.class,0);
		}
		public ExpressionRule2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionRule2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterExpressionRule2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitExpressionRule2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitExpressionRule2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionRule2Context expressionRule2() throws RecognitionException {
		return expressionRule2(0);
	}

	private ExpressionRule2Context expressionRule2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionRule2Context _localctx = new ExpressionRule2Context(_ctx, _parentState);
		ExpressionRule2Context _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expressionRule2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(92); expressionRule3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionRule2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionRule2);
					setState(94);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(95); ((ExpressionRule2Context)_localctx).operator = match(T__2);
					setState(96); expressionRule3(0);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionRule3Context extends ParserRuleContext {
		public Token operator;
		public ExpressionRule3Context expressionRule3() {
			return getRuleContext(ExpressionRule3Context.class,0);
		}
		public ExpressionRule4Context expressionRule4() {
			return getRuleContext(ExpressionRule4Context.class,0);
		}
		public ExpressionRule3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionRule3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterExpressionRule3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitExpressionRule3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitExpressionRule3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionRule3Context expressionRule3() throws RecognitionException {
		return expressionRule3(0);
	}

	private ExpressionRule3Context expressionRule3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionRule3Context _localctx = new ExpressionRule3Context(_ctx, _parentState);
		ExpressionRule3Context _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expressionRule3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(103); expressionRule4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionRule3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionRule3);
					setState(105);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(106); ((ExpressionRule3Context)_localctx).operator = match(T__11);
					setState(107); expressionRule4(0);
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionRule4Context extends ParserRuleContext {
		public Token operator;
		public ExpressionRule5Context expressionRule5() {
			return getRuleContext(ExpressionRule5Context.class,0);
		}
		public ExpressionRule4Context expressionRule4() {
			return getRuleContext(ExpressionRule4Context.class,0);
		}
		public ExpressionRule4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionRule4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterExpressionRule4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitExpressionRule4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitExpressionRule4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionRule4Context expressionRule4() throws RecognitionException {
		return expressionRule4(0);
	}

	private ExpressionRule4Context expressionRule4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionRule4Context _localctx = new ExpressionRule4Context(_ctx, _parentState);
		ExpressionRule4Context _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expressionRule4, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(114); expressionRule5(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionRule4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionRule4);
					setState(116);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(117);
					((ExpressionRule4Context)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==T__0) ) {
						((ExpressionRule4Context)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(118); expressionRule5(0);
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionRule5Context extends ParserRuleContext {
		public Token operator;
		public ExpressionRule5Context expressionRule5() {
			return getRuleContext(ExpressionRule5Context.class,0);
		}
		public ExpressionRule6Context expressionRule6() {
			return getRuleContext(ExpressionRule6Context.class,0);
		}
		public ExpressionRule5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionRule5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterExpressionRule5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitExpressionRule5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitExpressionRule5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionRule5Context expressionRule5() throws RecognitionException {
		return expressionRule5(0);
	}

	private ExpressionRule5Context expressionRule5(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionRule5Context _localctx = new ExpressionRule5Context(_ctx, _parentState);
		ExpressionRule5Context _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expressionRule5, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125); expressionRule6();
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionRule5Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionRule5);
					setState(127);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(128);
					((ExpressionRule5Context)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__26 || _la==T__16) ) {
						((ExpressionRule5Context)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(129); expressionRule6();
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionRule6Context extends ParserRuleContext {
		public ExpressionRuleContext expressionRule() {
			return getRuleContext(ExpressionRuleContext.class,0);
		}
		public TerminalNode NUMERICVALUE() { return getToken(MFPLParser.NUMERICVALUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MFPLParser.IDENTIFIER, 0); }
		public ExpressionRule6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionRule6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterExpressionRule6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitExpressionRule6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitExpressionRule6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionRule6Context expressionRule6() throws RecognitionException {
		ExpressionRule6Context _localctx = new ExpressionRule6Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionRule6);
		int _la;
		try {
			setState(140);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(135); match(T__20);
				setState(136); expressionRule(0);
				setState(137); match(T__3);
				}
				break;
			case IDENTIFIER:
			case NUMERICVALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==NUMERICVALUE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalStructRuleContext extends ParserRuleContext {
		public IfRuleContext ifRule() {
			return getRuleContext(IfRuleContext.class,0);
		}
		public ConditionalStructRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStructRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterConditionalStructRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitConditionalStructRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitConditionalStructRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStructRuleContext conditionalStructRule() throws RecognitionException {
		ConditionalStructRuleContext _localctx = new ConditionalStructRuleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditionalStructRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); ifRule();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfRuleContext extends ParserRuleContext {
		public ElseRuleContext elseRule() {
			return getRuleContext(ElseRuleContext.class,0);
		}
		public List<ElseIfRuleContext> elseIfRule() {
			return getRuleContexts(ElseIfRuleContext.class);
		}
		public ElseIfRuleContext elseIfRule(int i) {
			return getRuleContext(ElseIfRuleContext.class,i);
		}
		public List<StatementRuleContext> statementRule() {
			return getRuleContexts(StatementRuleContext.class);
		}
		public ExpressionRuleContext expressionRule() {
			return getRuleContext(ExpressionRuleContext.class,0);
		}
		public StatementRuleContext statementRule(int i) {
			return getRuleContext(StatementRuleContext.class,i);
		}
		public IfRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterIfRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitIfRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitIfRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfRuleContext ifRule() throws RecognitionException {
		IfRuleContext _localctx = new IfRuleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(T__24);
			setState(145); expressionRule(0);
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146); statementRule();
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__5) | (1L << T__4) | (1L << IDENTIFIER))) != 0) );
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(151); elseIfRule();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(157); elseRule();
				}
			}

			setState(160); match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfRuleContext extends ParserRuleContext {
		public List<StatementRuleContext> statementRule() {
			return getRuleContexts(StatementRuleContext.class);
		}
		public ExpressionRuleContext expressionRule() {
			return getRuleContext(ExpressionRuleContext.class,0);
		}
		public StatementRuleContext statementRule(int i) {
			return getRuleContext(StatementRuleContext.class,i);
		}
		public ElseIfRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterElseIfRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitElseIfRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitElseIfRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfRuleContext elseIfRule() throws RecognitionException {
		ElseIfRuleContext _localctx = new ElseIfRuleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elseIfRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(T__17);
			setState(163); expressionRule(0);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164); statementRule();
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__5) | (1L << T__4) | (1L << IDENTIFIER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseRuleContext extends ParserRuleContext {
		public List<StatementRuleContext> statementRule() {
			return getRuleContexts(StatementRuleContext.class);
		}
		public StatementRuleContext statementRule(int i) {
			return getRuleContext(StatementRuleContext.class,i);
		}
		public ElseRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterElseRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitElseRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitElseRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseRuleContext elseRule() throws RecognitionException {
		ElseRuleContext _localctx = new ElseRuleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(T__9);
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170); statementRule();
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__5) | (1L << T__4) | (1L << IDENTIFIER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutineRuleContext extends ParserRuleContext {
		public SystemcallRuleContext systemcallRule() {
			return getRuleContext(SystemcallRuleContext.class,0);
		}
		public PrintRuleContext printRule() {
			return getRuleContext(PrintRuleContext.class,0);
		}
		public RoutineRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterRoutineRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitRoutineRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitRoutineRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineRuleContext routineRule() throws RecognitionException {
		RoutineRuleContext _localctx = new RoutineRuleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_routineRule);
		try {
			setState(177);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(175); printRule();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(176); systemcallRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopRuleContext extends ParserRuleContext {
		public CountRuleContext countRule() {
			return getRuleContext(CountRuleContext.class,0);
		}
		public DoforeverifRuleContext doforeverifRule() {
			return getRuleContext(DoforeverifRuleContext.class,0);
		}
		public LoopRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterLoopRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitLoopRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitLoopRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopRuleContext loopRule() throws RecognitionException {
		LoopRuleContext _localctx = new LoopRuleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loopRule);
		try {
			setState(181);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); countRule();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); doforeverifRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CountRuleContext extends ParserRuleContext {
		public TerminalNode NUMERICVALUE(int i) {
			return getToken(MFPLParser.NUMERICVALUE, i);
		}
		public List<StatementRuleContext> statementRule() {
			return getRuleContexts(StatementRuleContext.class);
		}
		public List<TerminalNode> NUMERICVALUE() { return getTokens(MFPLParser.NUMERICVALUE); }
		public StatementRuleContext statementRule(int i) {
			return getRuleContext(StatementRuleContext.class,i);
		}
		public CountRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterCountRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitCountRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitCountRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountRuleContext countRule() throws RecognitionException {
		CountRuleContext _localctx = new CountRuleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_countRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(T__4);
			setState(184); match(NUMERICVALUE);
			setState(185); match(T__12);
			setState(186); match(NUMERICVALUE);
			setState(187); match(T__10);
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188); statementRule();
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__5) | (1L << T__4) | (1L << IDENTIFIER))) != 0) );
			setState(193); match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoforeverifRuleContext extends ParserRuleContext {
		public List<StatementRuleContext> statementRule() {
			return getRuleContexts(StatementRuleContext.class);
		}
		public ExpressionRuleContext expressionRule() {
			return getRuleContext(ExpressionRuleContext.class,0);
		}
		public StatementRuleContext statementRule(int i) {
			return getRuleContext(StatementRuleContext.class,i);
		}
		public DoforeverifRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doforeverifRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterDoforeverifRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitDoforeverifRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitDoforeverifRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoforeverifRuleContext doforeverifRule() throws RecognitionException {
		DoforeverifRuleContext _localctx = new DoforeverifRuleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_doforeverifRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(T__22);
			setState(196); expressionRule(0);
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197); statementRule();
				}
				}
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__5) | (1L << T__4) | (1L << IDENTIFIER))) != 0) );
			setState(202); match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintRuleContext extends ParserRuleContext {
		public List<PrintContentRuleContext> printContentRule() {
			return getRuleContexts(PrintContentRuleContext.class);
		}
		public PrintContentRuleContext printContentRule(int i) {
			return getRuleContext(PrintContentRuleContext.class,i);
		}
		public PrintRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterPrintRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitPrintRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitPrintRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintRuleContext printRule() throws RecognitionException {
		PrintRuleContext _localctx = new PrintRuleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_printRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(T__21);
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205); printContentRule();
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << IDENTIFIER) | (1L << NUMERICVALUE) | (1L << STRINGVALUE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContentRuleContext extends ParserRuleContext {
		public TerminalNode STRINGVALUE() { return getToken(MFPLParser.STRINGVALUE, 0); }
		public ExpressionRuleContext expressionRule() {
			return getRuleContext(ExpressionRuleContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MFPLParser.IDENTIFIER, 0); }
		public PrintContentRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printContentRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterPrintContentRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitPrintContentRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitPrintContentRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContentRuleContext printContentRule() throws RecognitionException {
		PrintContentRuleContext _localctx = new PrintContentRuleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_printContentRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(210); expressionRule(0);
				}
				break;
			case 2:
				{
				setState(211); match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(212); match(STRINGVALUE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemcallRuleContext extends ParserRuleContext {
		public SystemcallcontentRuleContext systemcallcontentRule(int i) {
			return getRuleContext(SystemcallcontentRuleContext.class,i);
		}
		public List<SystemcallcontentRuleContext> systemcallcontentRule() {
			return getRuleContexts(SystemcallcontentRuleContext.class);
		}
		public SystemcallRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemcallRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterSystemcallRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitSystemcallRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitSystemcallRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemcallRuleContext systemcallRule() throws RecognitionException {
		SystemcallRuleContext _localctx = new SystemcallRuleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_systemcallRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); match(T__5);
			setState(217); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216); systemcallcontentRule();
				}
				}
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER || _la==STRINGVALUE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemcallcontentRuleContext extends ParserRuleContext {
		public TerminalNode STRINGVALUE() { return getToken(MFPLParser.STRINGVALUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MFPLParser.IDENTIFIER, 0); }
		public SystemcallcontentRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemcallcontentRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).enterSystemcallcontentRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MFPLListener ) ((MFPLListener)listener).exitSystemcallcontentRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MFPLVisitor ) return ((MFPLVisitor<? extends T>)visitor).visitSystemcallcontentRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemcallcontentRuleContext systemcallcontentRule() throws RecognitionException {
		SystemcallcontentRuleContext _localctx = new SystemcallcontentRuleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_systemcallcontentRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRINGVALUE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: return expressionRule_sempred((ExpressionRuleContext)_localctx, predIndex);
		case 6: return expressionRule2_sempred((ExpressionRule2Context)_localctx, predIndex);
		case 7: return expressionRule3_sempred((ExpressionRule3Context)_localctx, predIndex);
		case 8: return expressionRule4_sempred((ExpressionRule4Context)_localctx, predIndex);
		case 9: return expressionRule5_sempred((ExpressionRule5Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionRule_sempred(ExpressionRuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressionRule2_sempred(ExpressionRule2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressionRule3_sempred(ExpressionRule3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressionRule4_sempred(ExpressionRule4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressionRule5_sempred(ExpressionRule5Context _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00e2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\6\3\65\n\3\r\3\16\3\66\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\4"+
		"\3\4\3\5\3\5\6\5F\n\5\r\5\16\5G\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6Q\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\bd\n\b\f\b\16\bg\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\to\n\t\f\t\16\tr"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nz\n\n\f\n\16\n}\13\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u0085\n\13\f\13\16\13\u0088\13\13\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u008f\n\f\3\r\3\r\3\16\3\16\3\16\6\16\u0096\n\16\r\16\16\16\u0097"+
		"\3\16\7\16\u009b\n\16\f\16\16\16\u009e\13\16\3\16\5\16\u00a1\n\16\3\16"+
		"\3\16\3\17\3\17\3\17\6\17\u00a8\n\17\r\17\16\17\u00a9\3\20\3\20\6\20\u00ae"+
		"\n\20\r\20\16\20\u00af\3\21\3\21\5\21\u00b4\n\21\3\22\3\22\5\22\u00b8"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u00c0\n\23\r\23\16\23\u00c1\3"+
		"\23\3\23\3\24\3\24\3\24\6\24\u00c9\n\24\r\24\16\24\u00ca\3\24\3\24\3\25"+
		"\3\25\6\25\u00d1\n\25\r\25\16\25\u00d2\3\26\3\26\3\26\5\26\u00d8\n\26"+
		"\3\27\3\27\6\27\u00dc\n\27\r\27\16\27\u00dd\3\30\3\30\3\30\2\7\f\16\20"+
		"\22\24\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\6\3\2\34\35"+
		"\4\2\3\3\r\r\3\2\37 \4\2\37\37##\u00e4\2\60\3\2\2\2\4\62\3\2\2\2\6?\3"+
		"\2\2\2\bC\3\2\2\2\nL\3\2\2\2\fR\3\2\2\2\16]\3\2\2\2\20h\3\2\2\2\22s\3"+
		"\2\2\2\24~\3\2\2\2\26\u008e\3\2\2\2\30\u0090\3\2\2\2\32\u0092\3\2\2\2"+
		"\34\u00a4\3\2\2\2\36\u00ab\3\2\2\2 \u00b3\3\2\2\2\"\u00b7\3\2\2\2$\u00b9"+
		"\3\2\2\2&\u00c5\3\2\2\2(\u00ce\3\2\2\2*\u00d7\3\2\2\2,\u00d9\3\2\2\2."+
		"\u00df\3\2\2\2\60\61\5\4\3\2\61\3\3\2\2\2\62\64\7\26\2\2\63\65\5\6\4\2"+
		"\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\28"+
		"9\7\20\2\29\5\3\2\2\2:@\5\b\5\2;@\5\n\6\2<@\5\30\r\2=@\5\"\22\2>@\5 \21"+
		"\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@A\3\2\2\2AB\7\6\2"+
		"\2B\7\3\2\2\2CE\7\16\2\2DF\7\37\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3"+
		"\2\2\2HI\3\2\2\2IJ\7\4\2\2JK\7\36\2\2K\t\3\2\2\2LM\7\37\2\2MP\7\17\2\2"+
		"NQ\5\f\7\2OQ\7#\2\2PN\3\2\2\2PO\3\2\2\2Q\13\3\2\2\2RS\b\7\1\2ST\5\16\b"+
		"\2TZ\3\2\2\2UV\f\4\2\2VW\7\25\2\2WY\5\16\b\2XU\3\2\2\2Y\\\3\2\2\2ZX\3"+
		"\2\2\2Z[\3\2\2\2[\r\3\2\2\2\\Z\3\2\2\2]^\b\b\1\2^_\5\20\t\2_e\3\2\2\2"+
		"`a\f\4\2\2ab\7\33\2\2bd\5\20\t\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2"+
		"\2f\17\3\2\2\2ge\3\2\2\2hi\b\t\1\2ij\5\22\n\2jp\3\2\2\2kl\f\4\2\2lm\7"+
		"\22\2\2mo\5\22\n\2nk\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\21\3\2\2\2"+
		"rp\3\2\2\2st\b\n\1\2tu\5\24\13\2u{\3\2\2\2vw\f\4\2\2wx\t\2\2\2xz\5\24"+
		"\13\2yv\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\23\3\2\2\2}{\3\2\2\2~\177"+
		"\b\13\1\2\177\u0080\5\26\f\2\u0080\u0086\3\2\2\2\u0081\u0082\f\4\2\2\u0082"+
		"\u0083\t\3\2\2\u0083\u0085\5\26\f\2\u0084\u0081\3\2\2\2\u0085\u0088\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\25\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\7\t\2\2\u008a\u008b\5\f\7\2\u008b\u008c\7\32"+
		"\2\2\u008c\u008f\3\2\2\2\u008d\u008f\t\4\2\2\u008e\u0089\3\2\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\27\3\2\2\2\u0090\u0091\5\32\16\2\u0091\31\3\2\2\2"+
		"\u0092\u0093\7\5\2\2\u0093\u0095\5\f\7\2\u0094\u0096\5\6\4\2\u0095\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009c\3\2\2\2\u0099\u009b\5\34\17\2\u009a\u0099\3\2\2\2\u009b\u009e\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a1\5\36\20\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\27\2\2\u00a3\33\3\2\2\2\u00a4"+
		"\u00a5\7\f\2\2\u00a5\u00a7\5\f\7\2\u00a6\u00a8\5\6\4\2\u00a7\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\35\3\2\2\2\u00ab\u00ad\7\24\2\2\u00ac\u00ae\5\6\4\2\u00ad\u00ac\3\2\2"+
		"\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\37"+
		"\3\2\2\2\u00b1\u00b4\5(\25\2\u00b2\u00b4\5,\27\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4!\3\2\2\2\u00b5\u00b8\5$\23\2\u00b6\u00b8\5&\24\2"+
		"\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8#\3\2\2\2\u00b9\u00ba\7"+
		"\31\2\2\u00ba\u00bb\7 \2\2\u00bb\u00bc\7\21\2\2\u00bc\u00bd\7 \2\2\u00bd"+
		"\u00bf\7\23\2\2\u00be\u00c0\5\6\4\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\7\13\2\2\u00c4%\3\2\2\2\u00c5\u00c6\7\7\2\2\u00c6\u00c8\5\f\7\2"+
		"\u00c7\u00c9\5\6\4\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\n\2\2\u00cd"+
		"\'\3\2\2\2\u00ce\u00d0\7\b\2\2\u00cf\u00d1\5*\26\2\u00d0\u00cf\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3)\3"+
		"\2\2\2\u00d4\u00d8\5\f\7\2\u00d5\u00d8\7\37\2\2\u00d6\u00d8\7#\2\2\u00d7"+
		"\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8+\3\2\2\2"+
		"\u00d9\u00db\7\30\2\2\u00da\u00dc\5.\30\2\u00db\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de-\3\2\2\2\u00df"+
		"\u00e0\t\5\2\2\u00e0/\3\2\2\2\30\66?GPZep{\u0086\u008e\u0097\u009c\u00a0"+
		"\u00a9\u00af\u00b3\u00b7\u00c1\u00ca\u00d2\u00d7\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}