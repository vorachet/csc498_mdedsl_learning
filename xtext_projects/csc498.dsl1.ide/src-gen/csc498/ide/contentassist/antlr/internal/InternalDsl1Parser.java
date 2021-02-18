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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDsl1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Contact'", "'email'", "'RSVP'", "'message'", "'Email'", "'to'", "'{'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDsl1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDsl1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDsl1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl1.g"; }


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



    // $ANTLR start "entryRuleModel"
    // InternalDsl1.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDsl1.g:54:1: ( ruleModel EOF )
            // InternalDsl1.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl1.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDsl1.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalDsl1.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalDsl1.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDsl1.g:69:3: ( rule__Model__Group__0 )
            // InternalDsl1.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleContact"
    // InternalDsl1.g:78:1: entryRuleContact : ruleContact EOF ;
    public final void entryRuleContact() throws RecognitionException {
        try {
            // InternalDsl1.g:79:1: ( ruleContact EOF )
            // InternalDsl1.g:80:1: ruleContact EOF
            {
             before(grammarAccess.getContactRule()); 
            pushFollow(FOLLOW_1);
            ruleContact();

            state._fsp--;

             after(grammarAccess.getContactRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContact"


    // $ANTLR start "ruleContact"
    // InternalDsl1.g:87:1: ruleContact : ( ( rule__Contact__Group__0 ) ) ;
    public final void ruleContact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:91:2: ( ( ( rule__Contact__Group__0 ) ) )
            // InternalDsl1.g:92:2: ( ( rule__Contact__Group__0 ) )
            {
            // InternalDsl1.g:92:2: ( ( rule__Contact__Group__0 ) )
            // InternalDsl1.g:93:3: ( rule__Contact__Group__0 )
            {
             before(grammarAccess.getContactAccess().getGroup()); 
            // InternalDsl1.g:94:3: ( rule__Contact__Group__0 )
            // InternalDsl1.g:94:4: rule__Contact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Contact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContact"


    // $ANTLR start "entryRuleRSVP"
    // InternalDsl1.g:103:1: entryRuleRSVP : ruleRSVP EOF ;
    public final void entryRuleRSVP() throws RecognitionException {
        try {
            // InternalDsl1.g:104:1: ( ruleRSVP EOF )
            // InternalDsl1.g:105:1: ruleRSVP EOF
            {
             before(grammarAccess.getRSVPRule()); 
            pushFollow(FOLLOW_1);
            ruleRSVP();

            state._fsp--;

             after(grammarAccess.getRSVPRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRSVP"


    // $ANTLR start "ruleRSVP"
    // InternalDsl1.g:112:1: ruleRSVP : ( ( rule__RSVP__Group__0 ) ) ;
    public final void ruleRSVP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:116:2: ( ( ( rule__RSVP__Group__0 ) ) )
            // InternalDsl1.g:117:2: ( ( rule__RSVP__Group__0 ) )
            {
            // InternalDsl1.g:117:2: ( ( rule__RSVP__Group__0 ) )
            // InternalDsl1.g:118:3: ( rule__RSVP__Group__0 )
            {
             before(grammarAccess.getRSVPAccess().getGroup()); 
            // InternalDsl1.g:119:3: ( rule__RSVP__Group__0 )
            // InternalDsl1.g:119:4: rule__RSVP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RSVP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRSVPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRSVP"


    // $ANTLR start "entryRuleEmail"
    // InternalDsl1.g:128:1: entryRuleEmail : ruleEmail EOF ;
    public final void entryRuleEmail() throws RecognitionException {
        try {
            // InternalDsl1.g:129:1: ( ruleEmail EOF )
            // InternalDsl1.g:130:1: ruleEmail EOF
            {
             before(grammarAccess.getEmailRule()); 
            pushFollow(FOLLOW_1);
            ruleEmail();

            state._fsp--;

             after(grammarAccess.getEmailRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmail"


    // $ANTLR start "ruleEmail"
    // InternalDsl1.g:137:1: ruleEmail : ( ( rule__Email__Group__0 ) ) ;
    public final void ruleEmail() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:141:2: ( ( ( rule__Email__Group__0 ) ) )
            // InternalDsl1.g:142:2: ( ( rule__Email__Group__0 ) )
            {
            // InternalDsl1.g:142:2: ( ( rule__Email__Group__0 ) )
            // InternalDsl1.g:143:3: ( rule__Email__Group__0 )
            {
             before(grammarAccess.getEmailAccess().getGroup()); 
            // InternalDsl1.g:144:3: ( rule__Email__Group__0 )
            // InternalDsl1.g:144:4: rule__Email__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Email__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmailAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmail"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDsl1.g:152:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:156:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDsl1.g:157:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalDsl1.g:164:1: rule__Model__Group__0__Impl : ( ( rule__Model__ContactsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:168:1: ( ( ( rule__Model__ContactsAssignment_0 )* ) )
            // InternalDsl1.g:169:1: ( ( rule__Model__ContactsAssignment_0 )* )
            {
            // InternalDsl1.g:169:1: ( ( rule__Model__ContactsAssignment_0 )* )
            // InternalDsl1.g:170:2: ( rule__Model__ContactsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getContactsAssignment_0()); 
            // InternalDsl1.g:171:2: ( rule__Model__ContactsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl1.g:171:3: rule__Model__ContactsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ContactsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getContactsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDsl1.g:179:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:183:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalDsl1.g:184:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalDsl1.g:191:1: rule__Model__Group__1__Impl : ( ( rule__Model__RsvpsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:195:1: ( ( ( rule__Model__RsvpsAssignment_1 )* ) )
            // InternalDsl1.g:196:1: ( ( rule__Model__RsvpsAssignment_1 )* )
            {
            // InternalDsl1.g:196:1: ( ( rule__Model__RsvpsAssignment_1 )* )
            // InternalDsl1.g:197:2: ( rule__Model__RsvpsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getRsvpsAssignment_1()); 
            // InternalDsl1.g:198:2: ( rule__Model__RsvpsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl1.g:198:3: rule__Model__RsvpsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__RsvpsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRsvpsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalDsl1.g:206:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:210:1: ( rule__Model__Group__2__Impl )
            // InternalDsl1.g:211:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalDsl1.g:217:1: rule__Model__Group__2__Impl : ( ( rule__Model__EmailsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:221:1: ( ( ( rule__Model__EmailsAssignment_2 )* ) )
            // InternalDsl1.g:222:1: ( ( rule__Model__EmailsAssignment_2 )* )
            {
            // InternalDsl1.g:222:1: ( ( rule__Model__EmailsAssignment_2 )* )
            // InternalDsl1.g:223:2: ( rule__Model__EmailsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getEmailsAssignment_2()); 
            // InternalDsl1.g:224:2: ( rule__Model__EmailsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl1.g:224:3: rule__Model__EmailsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__EmailsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEmailsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Contact__Group__0"
    // InternalDsl1.g:233:1: rule__Contact__Group__0 : rule__Contact__Group__0__Impl rule__Contact__Group__1 ;
    public final void rule__Contact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:237:1: ( rule__Contact__Group__0__Impl rule__Contact__Group__1 )
            // InternalDsl1.g:238:2: rule__Contact__Group__0__Impl rule__Contact__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Contact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__0"


    // $ANTLR start "rule__Contact__Group__0__Impl"
    // InternalDsl1.g:245:1: rule__Contact__Group__0__Impl : ( 'Contact' ) ;
    public final void rule__Contact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:249:1: ( ( 'Contact' ) )
            // InternalDsl1.g:250:1: ( 'Contact' )
            {
            // InternalDsl1.g:250:1: ( 'Contact' )
            // InternalDsl1.g:251:2: 'Contact'
            {
             before(grammarAccess.getContactAccess().getContactKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getContactAccess().getContactKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__0__Impl"


    // $ANTLR start "rule__Contact__Group__1"
    // InternalDsl1.g:260:1: rule__Contact__Group__1 : rule__Contact__Group__1__Impl rule__Contact__Group__2 ;
    public final void rule__Contact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:264:1: ( rule__Contact__Group__1__Impl rule__Contact__Group__2 )
            // InternalDsl1.g:265:2: rule__Contact__Group__1__Impl rule__Contact__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Contact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contact__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__1"


    // $ANTLR start "rule__Contact__Group__1__Impl"
    // InternalDsl1.g:272:1: rule__Contact__Group__1__Impl : ( ( rule__Contact__NameAssignment_1 ) ) ;
    public final void rule__Contact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:276:1: ( ( ( rule__Contact__NameAssignment_1 ) ) )
            // InternalDsl1.g:277:1: ( ( rule__Contact__NameAssignment_1 ) )
            {
            // InternalDsl1.g:277:1: ( ( rule__Contact__NameAssignment_1 ) )
            // InternalDsl1.g:278:2: ( rule__Contact__NameAssignment_1 )
            {
             before(grammarAccess.getContactAccess().getNameAssignment_1()); 
            // InternalDsl1.g:279:2: ( rule__Contact__NameAssignment_1 )
            // InternalDsl1.g:279:3: rule__Contact__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Contact__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__1__Impl"


    // $ANTLR start "rule__Contact__Group__2"
    // InternalDsl1.g:287:1: rule__Contact__Group__2 : rule__Contact__Group__2__Impl rule__Contact__Group__3 ;
    public final void rule__Contact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:291:1: ( rule__Contact__Group__2__Impl rule__Contact__Group__3 )
            // InternalDsl1.g:292:2: rule__Contact__Group__2__Impl rule__Contact__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Contact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contact__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__2"


    // $ANTLR start "rule__Contact__Group__2__Impl"
    // InternalDsl1.g:299:1: rule__Contact__Group__2__Impl : ( 'email' ) ;
    public final void rule__Contact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:303:1: ( ( 'email' ) )
            // InternalDsl1.g:304:1: ( 'email' )
            {
            // InternalDsl1.g:304:1: ( 'email' )
            // InternalDsl1.g:305:2: 'email'
            {
             before(grammarAccess.getContactAccess().getEmailKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getContactAccess().getEmailKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__2__Impl"


    // $ANTLR start "rule__Contact__Group__3"
    // InternalDsl1.g:314:1: rule__Contact__Group__3 : rule__Contact__Group__3__Impl ;
    public final void rule__Contact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:318:1: ( rule__Contact__Group__3__Impl )
            // InternalDsl1.g:319:2: rule__Contact__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contact__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__3"


    // $ANTLR start "rule__Contact__Group__3__Impl"
    // InternalDsl1.g:325:1: rule__Contact__Group__3__Impl : ( ( rule__Contact__EmailAssignment_3 ) ) ;
    public final void rule__Contact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:329:1: ( ( ( rule__Contact__EmailAssignment_3 ) ) )
            // InternalDsl1.g:330:1: ( ( rule__Contact__EmailAssignment_3 ) )
            {
            // InternalDsl1.g:330:1: ( ( rule__Contact__EmailAssignment_3 ) )
            // InternalDsl1.g:331:2: ( rule__Contact__EmailAssignment_3 )
            {
             before(grammarAccess.getContactAccess().getEmailAssignment_3()); 
            // InternalDsl1.g:332:2: ( rule__Contact__EmailAssignment_3 )
            // InternalDsl1.g:332:3: rule__Contact__EmailAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Contact__EmailAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getEmailAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__3__Impl"


    // $ANTLR start "rule__RSVP__Group__0"
    // InternalDsl1.g:341:1: rule__RSVP__Group__0 : rule__RSVP__Group__0__Impl rule__RSVP__Group__1 ;
    public final void rule__RSVP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:345:1: ( rule__RSVP__Group__0__Impl rule__RSVP__Group__1 )
            // InternalDsl1.g:346:2: rule__RSVP__Group__0__Impl rule__RSVP__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RSVP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RSVP__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSVP__Group__0"


    // $ANTLR start "rule__RSVP__Group__0__Impl"
    // InternalDsl1.g:353:1: rule__RSVP__Group__0__Impl : ( 'RSVP' ) ;
    public final void rule__RSVP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:357:1: ( ( 'RSVP' ) )
            // InternalDsl1.g:358:1: ( 'RSVP' )
            {
            // InternalDsl1.g:358:1: ( 'RSVP' )
            // InternalDsl1.g:359:2: 'RSVP'
            {
             before(grammarAccess.getRSVPAccess().getRSVPKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRSVPAccess().getRSVPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSVP__Group__0__Impl"


    // $ANTLR start "rule__RSVP__Group__1"
    // InternalDsl1.g:368:1: rule__RSVP__Group__1 : rule__RSVP__Group__1__Impl rule__RSVP__Group__2 ;
    public final void rule__RSVP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:372:1: ( rule__RSVP__Group__1__Impl rule__RSVP__Group__2 )
            // InternalDsl1.g:373:2: rule__RSVP__Group__1__Impl rule__RSVP__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__RSVP__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RSVP__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSVP__Group__1"


    // $ANTLR start "rule__RSVP__Group__1__Impl"
    // InternalDsl1.g:380:1: rule__RSVP__Group__1__Impl : ( ( rule__RSVP__NameAssignment_1 ) ) ;
    public final void rule__RSVP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:384:1: ( ( ( rule__RSVP__NameAssignment_1 ) ) )
            // InternalDsl1.g:385:1: ( ( rule__RSVP__NameAssignment_1 ) )
            {
            // InternalDsl1.g:385:1: ( ( rule__RSVP__NameAssignment_1 ) )
            // InternalDsl1.g:386:2: ( rule__RSVP__NameAssignment_1 )
            {
             before(grammarAccess.getRSVPAccess().getNameAssignment_1()); 
            // InternalDsl1.g:387:2: ( rule__RSVP__NameAssignment_1 )
            // InternalDsl1.g:387:3: rule__RSVP__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RSVP__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRSVPAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSVP__Group__1__Impl"


    // $ANTLR start "rule__RSVP__Group__2"
    // InternalDsl1.g:395:1: rule__RSVP__Group__2 : rule__RSVP__Group__2__Impl rule__RSVP__Group__3 ;
    public final void rule__RSVP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:399:1: ( rule__RSVP__Group__2__Impl rule__RSVP__Group__3 )
            // InternalDsl1.g:400:2: rule__RSVP__Group__2__Impl rule__RSVP__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__RSVP__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RSVP__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSVP__Group__2"


    // $ANTLR start "rule__RSVP__Group__2__Impl"
    // InternalDsl1.g:407:1: rule__RSVP__Group__2__Impl : ( 'message' ) ;
    public final void rule__RSVP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:411:1: ( ( 'message' ) )
            // InternalDsl1.g:412:1: ( 'message' )
            {
            // InternalDsl1.g:412:1: ( 'message' )
            // InternalDsl1.g:413:2: 'message'
            {
             before(grammarAccess.getRSVPAccess().getMessageKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRSVPAccess().getMessageKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSVP__Group__2__Impl"


    // $ANTLR start "rule__RSVP__Group__3"
    // InternalDsl1.g:422:1: rule__RSVP__Group__3 : rule__RSVP__Group__3__Impl ;
    public final void rule__RSVP__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:426:1: ( rule__RSVP__Group__3__Impl )
            // InternalDsl1.g:427:2: rule__RSVP__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RSVP__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSVP__Group__3"


    // $ANTLR start "rule__RSVP__Group__3__Impl"
    // InternalDsl1.g:433:1: rule__RSVP__Group__3__Impl : ( ( rule__RSVP__MessageAssignment_3 ) ) ;
    public final void rule__RSVP__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:437:1: ( ( ( rule__RSVP__MessageAssignment_3 ) ) )
            // InternalDsl1.g:438:1: ( ( rule__RSVP__MessageAssignment_3 ) )
            {
            // InternalDsl1.g:438:1: ( ( rule__RSVP__MessageAssignment_3 ) )
            // InternalDsl1.g:439:2: ( rule__RSVP__MessageAssignment_3 )
            {
             before(grammarAccess.getRSVPAccess().getMessageAssignment_3()); 
            // InternalDsl1.g:440:2: ( rule__RSVP__MessageAssignment_3 )
            // InternalDsl1.g:440:3: rule__RSVP__MessageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RSVP__MessageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRSVPAccess().getMessageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSVP__Group__3__Impl"


    // $ANTLR start "rule__Email__Group__0"
    // InternalDsl1.g:449:1: rule__Email__Group__0 : rule__Email__Group__0__Impl rule__Email__Group__1 ;
    public final void rule__Email__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:453:1: ( rule__Email__Group__0__Impl rule__Email__Group__1 )
            // InternalDsl1.g:454:2: rule__Email__Group__0__Impl rule__Email__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Email__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Email__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__0"


    // $ANTLR start "rule__Email__Group__0__Impl"
    // InternalDsl1.g:461:1: rule__Email__Group__0__Impl : ( 'Email' ) ;
    public final void rule__Email__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:465:1: ( ( 'Email' ) )
            // InternalDsl1.g:466:1: ( 'Email' )
            {
            // InternalDsl1.g:466:1: ( 'Email' )
            // InternalDsl1.g:467:2: 'Email'
            {
             before(grammarAccess.getEmailAccess().getEmailKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEmailAccess().getEmailKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__0__Impl"


    // $ANTLR start "rule__Email__Group__1"
    // InternalDsl1.g:476:1: rule__Email__Group__1 : rule__Email__Group__1__Impl rule__Email__Group__2 ;
    public final void rule__Email__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:480:1: ( rule__Email__Group__1__Impl rule__Email__Group__2 )
            // InternalDsl1.g:481:2: rule__Email__Group__1__Impl rule__Email__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Email__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Email__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__1"


    // $ANTLR start "rule__Email__Group__1__Impl"
    // InternalDsl1.g:488:1: rule__Email__Group__1__Impl : ( ( rule__Email__NameAssignment_1 ) ) ;
    public final void rule__Email__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:492:1: ( ( ( rule__Email__NameAssignment_1 ) ) )
            // InternalDsl1.g:493:1: ( ( rule__Email__NameAssignment_1 ) )
            {
            // InternalDsl1.g:493:1: ( ( rule__Email__NameAssignment_1 ) )
            // InternalDsl1.g:494:2: ( rule__Email__NameAssignment_1 )
            {
             before(grammarAccess.getEmailAccess().getNameAssignment_1()); 
            // InternalDsl1.g:495:2: ( rule__Email__NameAssignment_1 )
            // InternalDsl1.g:495:3: rule__Email__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Email__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEmailAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__1__Impl"


    // $ANTLR start "rule__Email__Group__2"
    // InternalDsl1.g:503:1: rule__Email__Group__2 : rule__Email__Group__2__Impl rule__Email__Group__3 ;
    public final void rule__Email__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:507:1: ( rule__Email__Group__2__Impl rule__Email__Group__3 )
            // InternalDsl1.g:508:2: rule__Email__Group__2__Impl rule__Email__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Email__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Email__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__2"


    // $ANTLR start "rule__Email__Group__2__Impl"
    // InternalDsl1.g:515:1: rule__Email__Group__2__Impl : ( 'to' ) ;
    public final void rule__Email__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:519:1: ( ( 'to' ) )
            // InternalDsl1.g:520:1: ( 'to' )
            {
            // InternalDsl1.g:520:1: ( 'to' )
            // InternalDsl1.g:521:2: 'to'
            {
             before(grammarAccess.getEmailAccess().getToKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEmailAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__2__Impl"


    // $ANTLR start "rule__Email__Group__3"
    // InternalDsl1.g:530:1: rule__Email__Group__3 : rule__Email__Group__3__Impl rule__Email__Group__4 ;
    public final void rule__Email__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:534:1: ( rule__Email__Group__3__Impl rule__Email__Group__4 )
            // InternalDsl1.g:535:2: rule__Email__Group__3__Impl rule__Email__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Email__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Email__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__3"


    // $ANTLR start "rule__Email__Group__3__Impl"
    // InternalDsl1.g:542:1: rule__Email__Group__3__Impl : ( '{' ) ;
    public final void rule__Email__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:546:1: ( ( '{' ) )
            // InternalDsl1.g:547:1: ( '{' )
            {
            // InternalDsl1.g:547:1: ( '{' )
            // InternalDsl1.g:548:2: '{'
            {
             before(grammarAccess.getEmailAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEmailAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__3__Impl"


    // $ANTLR start "rule__Email__Group__4"
    // InternalDsl1.g:557:1: rule__Email__Group__4 : rule__Email__Group__4__Impl rule__Email__Group__5 ;
    public final void rule__Email__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:561:1: ( rule__Email__Group__4__Impl rule__Email__Group__5 )
            // InternalDsl1.g:562:2: rule__Email__Group__4__Impl rule__Email__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Email__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Email__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__4"


    // $ANTLR start "rule__Email__Group__4__Impl"
    // InternalDsl1.g:569:1: rule__Email__Group__4__Impl : ( ( ( rule__Email__ContactsAssignment_4 ) ) ( ( rule__Email__ContactsAssignment_4 )* ) ) ;
    public final void rule__Email__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:573:1: ( ( ( ( rule__Email__ContactsAssignment_4 ) ) ( ( rule__Email__ContactsAssignment_4 )* ) ) )
            // InternalDsl1.g:574:1: ( ( ( rule__Email__ContactsAssignment_4 ) ) ( ( rule__Email__ContactsAssignment_4 )* ) )
            {
            // InternalDsl1.g:574:1: ( ( ( rule__Email__ContactsAssignment_4 ) ) ( ( rule__Email__ContactsAssignment_4 )* ) )
            // InternalDsl1.g:575:2: ( ( rule__Email__ContactsAssignment_4 ) ) ( ( rule__Email__ContactsAssignment_4 )* )
            {
            // InternalDsl1.g:575:2: ( ( rule__Email__ContactsAssignment_4 ) )
            // InternalDsl1.g:576:3: ( rule__Email__ContactsAssignment_4 )
            {
             before(grammarAccess.getEmailAccess().getContactsAssignment_4()); 
            // InternalDsl1.g:577:3: ( rule__Email__ContactsAssignment_4 )
            // InternalDsl1.g:577:4: rule__Email__ContactsAssignment_4
            {
            pushFollow(FOLLOW_14);
            rule__Email__ContactsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEmailAccess().getContactsAssignment_4()); 

            }

            // InternalDsl1.g:580:2: ( ( rule__Email__ContactsAssignment_4 )* )
            // InternalDsl1.g:581:3: ( rule__Email__ContactsAssignment_4 )*
            {
             before(grammarAccess.getEmailAccess().getContactsAssignment_4()); 
            // InternalDsl1.g:582:3: ( rule__Email__ContactsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl1.g:582:4: rule__Email__ContactsAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Email__ContactsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEmailAccess().getContactsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__4__Impl"


    // $ANTLR start "rule__Email__Group__5"
    // InternalDsl1.g:591:1: rule__Email__Group__5 : rule__Email__Group__5__Impl rule__Email__Group__6 ;
    public final void rule__Email__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:595:1: ( rule__Email__Group__5__Impl rule__Email__Group__6 )
            // InternalDsl1.g:596:2: rule__Email__Group__5__Impl rule__Email__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Email__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Email__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__5"


    // $ANTLR start "rule__Email__Group__5__Impl"
    // InternalDsl1.g:603:1: rule__Email__Group__5__Impl : ( '}' ) ;
    public final void rule__Email__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:607:1: ( ( '}' ) )
            // InternalDsl1.g:608:1: ( '}' )
            {
            // InternalDsl1.g:608:1: ( '}' )
            // InternalDsl1.g:609:2: '}'
            {
             before(grammarAccess.getEmailAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEmailAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__5__Impl"


    // $ANTLR start "rule__Email__Group__6"
    // InternalDsl1.g:618:1: rule__Email__Group__6 : rule__Email__Group__6__Impl rule__Email__Group__7 ;
    public final void rule__Email__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:622:1: ( rule__Email__Group__6__Impl rule__Email__Group__7 )
            // InternalDsl1.g:623:2: rule__Email__Group__6__Impl rule__Email__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Email__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Email__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__6"


    // $ANTLR start "rule__Email__Group__6__Impl"
    // InternalDsl1.g:630:1: rule__Email__Group__6__Impl : ( 'message' ) ;
    public final void rule__Email__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:634:1: ( ( 'message' ) )
            // InternalDsl1.g:635:1: ( 'message' )
            {
            // InternalDsl1.g:635:1: ( 'message' )
            // InternalDsl1.g:636:2: 'message'
            {
             before(grammarAccess.getEmailAccess().getMessageKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEmailAccess().getMessageKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__6__Impl"


    // $ANTLR start "rule__Email__Group__7"
    // InternalDsl1.g:645:1: rule__Email__Group__7 : rule__Email__Group__7__Impl ;
    public final void rule__Email__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:649:1: ( rule__Email__Group__7__Impl )
            // InternalDsl1.g:650:2: rule__Email__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Email__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__7"


    // $ANTLR start "rule__Email__Group__7__Impl"
    // InternalDsl1.g:656:1: rule__Email__Group__7__Impl : ( ( rule__Email__MessageAssignment_7 ) ) ;
    public final void rule__Email__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:660:1: ( ( ( rule__Email__MessageAssignment_7 ) ) )
            // InternalDsl1.g:661:1: ( ( rule__Email__MessageAssignment_7 ) )
            {
            // InternalDsl1.g:661:1: ( ( rule__Email__MessageAssignment_7 ) )
            // InternalDsl1.g:662:2: ( rule__Email__MessageAssignment_7 )
            {
             before(grammarAccess.getEmailAccess().getMessageAssignment_7()); 
            // InternalDsl1.g:663:2: ( rule__Email__MessageAssignment_7 )
            // InternalDsl1.g:663:3: rule__Email__MessageAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Email__MessageAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEmailAccess().getMessageAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__7__Impl"


    // $ANTLR start "rule__Model__ContactsAssignment_0"
    // InternalDsl1.g:672:1: rule__Model__ContactsAssignment_0 : ( ruleContact ) ;
    public final void rule__Model__ContactsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:676:1: ( ( ruleContact ) )
            // InternalDsl1.g:677:2: ( ruleContact )
            {
            // InternalDsl1.g:677:2: ( ruleContact )
            // InternalDsl1.g:678:3: ruleContact
            {
             before(grammarAccess.getModelAccess().getContactsContactParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleContact();

            state._fsp--;

             after(grammarAccess.getModelAccess().getContactsContactParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ContactsAssignment_0"


    // $ANTLR start "rule__Model__RsvpsAssignment_1"
    // InternalDsl1.g:687:1: rule__Model__RsvpsAssignment_1 : ( ruleRSVP ) ;
    public final void rule__Model__RsvpsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:691:1: ( ( ruleRSVP ) )
            // InternalDsl1.g:692:2: ( ruleRSVP )
            {
            // InternalDsl1.g:692:2: ( ruleRSVP )
            // InternalDsl1.g:693:3: ruleRSVP
            {
             before(grammarAccess.getModelAccess().getRsvpsRSVPParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRSVP();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRsvpsRSVPParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RsvpsAssignment_1"


    // $ANTLR start "rule__Model__EmailsAssignment_2"
    // InternalDsl1.g:702:1: rule__Model__EmailsAssignment_2 : ( ruleEmail ) ;
    public final void rule__Model__EmailsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:706:1: ( ( ruleEmail ) )
            // InternalDsl1.g:707:2: ( ruleEmail )
            {
            // InternalDsl1.g:707:2: ( ruleEmail )
            // InternalDsl1.g:708:3: ruleEmail
            {
             before(grammarAccess.getModelAccess().getEmailsEmailParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEmail();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEmailsEmailParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EmailsAssignment_2"


    // $ANTLR start "rule__Contact__NameAssignment_1"
    // InternalDsl1.g:717:1: rule__Contact__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Contact__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:721:1: ( ( RULE_ID ) )
            // InternalDsl1.g:722:2: ( RULE_ID )
            {
            // InternalDsl1.g:722:2: ( RULE_ID )
            // InternalDsl1.g:723:3: RULE_ID
            {
             before(grammarAccess.getContactAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContactAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__NameAssignment_1"


    // $ANTLR start "rule__Contact__EmailAssignment_3"
    // InternalDsl1.g:732:1: rule__Contact__EmailAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Contact__EmailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:736:1: ( ( RULE_STRING ) )
            // InternalDsl1.g:737:2: ( RULE_STRING )
            {
            // InternalDsl1.g:737:2: ( RULE_STRING )
            // InternalDsl1.g:738:3: RULE_STRING
            {
             before(grammarAccess.getContactAccess().getEmailSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContactAccess().getEmailSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__EmailAssignment_3"


    // $ANTLR start "rule__RSVP__NameAssignment_1"
    // InternalDsl1.g:747:1: rule__RSVP__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RSVP__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:751:1: ( ( RULE_ID ) )
            // InternalDsl1.g:752:2: ( RULE_ID )
            {
            // InternalDsl1.g:752:2: ( RULE_ID )
            // InternalDsl1.g:753:3: RULE_ID
            {
             before(grammarAccess.getRSVPAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRSVPAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSVP__NameAssignment_1"


    // $ANTLR start "rule__RSVP__MessageAssignment_3"
    // InternalDsl1.g:762:1: rule__RSVP__MessageAssignment_3 : ( RULE_STRING ) ;
    public final void rule__RSVP__MessageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:766:1: ( ( RULE_STRING ) )
            // InternalDsl1.g:767:2: ( RULE_STRING )
            {
            // InternalDsl1.g:767:2: ( RULE_STRING )
            // InternalDsl1.g:768:3: RULE_STRING
            {
             before(grammarAccess.getRSVPAccess().getMessageSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRSVPAccess().getMessageSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSVP__MessageAssignment_3"


    // $ANTLR start "rule__Email__NameAssignment_1"
    // InternalDsl1.g:777:1: rule__Email__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Email__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:781:1: ( ( RULE_ID ) )
            // InternalDsl1.g:782:2: ( RULE_ID )
            {
            // InternalDsl1.g:782:2: ( RULE_ID )
            // InternalDsl1.g:783:3: RULE_ID
            {
             before(grammarAccess.getEmailAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEmailAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__NameAssignment_1"


    // $ANTLR start "rule__Email__ContactsAssignment_4"
    // InternalDsl1.g:792:1: rule__Email__ContactsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Email__ContactsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:796:1: ( ( ( RULE_ID ) ) )
            // InternalDsl1.g:797:2: ( ( RULE_ID ) )
            {
            // InternalDsl1.g:797:2: ( ( RULE_ID ) )
            // InternalDsl1.g:798:3: ( RULE_ID )
            {
             before(grammarAccess.getEmailAccess().getContactsContactCrossReference_4_0()); 
            // InternalDsl1.g:799:3: ( RULE_ID )
            // InternalDsl1.g:800:4: RULE_ID
            {
             before(grammarAccess.getEmailAccess().getContactsContactIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEmailAccess().getContactsContactIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getEmailAccess().getContactsContactCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__ContactsAssignment_4"


    // $ANTLR start "rule__Email__MessageAssignment_7"
    // InternalDsl1.g:811:1: rule__Email__MessageAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Email__MessageAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl1.g:815:1: ( ( RULE_STRING ) )
            // InternalDsl1.g:816:2: ( RULE_STRING )
            {
            // InternalDsl1.g:816:2: ( RULE_STRING )
            // InternalDsl1.g:817:3: RULE_STRING
            {
             before(grammarAccess.getEmailAccess().getMessageSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEmailAccess().getMessageSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__MessageAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});

}