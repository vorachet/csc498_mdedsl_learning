package csc498.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import csc498.services.Dsl1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDsl1Parser extends AbstractInternalAntlrParser {
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

        public InternalDsl1Parser(TokenStream input, Dsl1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Dsl1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDsl1.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDsl1.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDsl1.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl1.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_contacts_0_0= ruleContact ) )* ( (lv_rsvps_1_0= ruleRSVP ) )* ( (lv_emails_2_0= ruleEmail ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_contacts_0_0 = null;

        EObject lv_rsvps_1_0 = null;

        EObject lv_emails_2_0 = null;



        	enterRule();

        try {
            // InternalDsl1.g:77:2: ( ( ( (lv_contacts_0_0= ruleContact ) )* ( (lv_rsvps_1_0= ruleRSVP ) )* ( (lv_emails_2_0= ruleEmail ) )* ) )
            // InternalDsl1.g:78:2: ( ( (lv_contacts_0_0= ruleContact ) )* ( (lv_rsvps_1_0= ruleRSVP ) )* ( (lv_emails_2_0= ruleEmail ) )* )
            {
            // InternalDsl1.g:78:2: ( ( (lv_contacts_0_0= ruleContact ) )* ( (lv_rsvps_1_0= ruleRSVP ) )* ( (lv_emails_2_0= ruleEmail ) )* )
            // InternalDsl1.g:79:3: ( (lv_contacts_0_0= ruleContact ) )* ( (lv_rsvps_1_0= ruleRSVP ) )* ( (lv_emails_2_0= ruleEmail ) )*
            {
            // InternalDsl1.g:79:3: ( (lv_contacts_0_0= ruleContact ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl1.g:80:4: (lv_contacts_0_0= ruleContact )
            	    {
            	    // InternalDsl1.g:80:4: (lv_contacts_0_0= ruleContact )
            	    // InternalDsl1.g:81:5: lv_contacts_0_0= ruleContact
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getContactsContactParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_contacts_0_0=ruleContact();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contacts",
            	    						lv_contacts_0_0,
            	    						"csc498.Dsl1.Contact");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDsl1.g:98:3: ( (lv_rsvps_1_0= ruleRSVP ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl1.g:99:4: (lv_rsvps_1_0= ruleRSVP )
            	    {
            	    // InternalDsl1.g:99:4: (lv_rsvps_1_0= ruleRSVP )
            	    // InternalDsl1.g:100:5: lv_rsvps_1_0= ruleRSVP
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRsvpsRSVPParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_rsvps_1_0=ruleRSVP();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rsvps",
            	    						lv_rsvps_1_0,
            	    						"csc498.Dsl1.RSVP");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalDsl1.g:117:3: ( (lv_emails_2_0= ruleEmail ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl1.g:118:4: (lv_emails_2_0= ruleEmail )
            	    {
            	    // InternalDsl1.g:118:4: (lv_emails_2_0= ruleEmail )
            	    // InternalDsl1.g:119:5: lv_emails_2_0= ruleEmail
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEmailsEmailParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_emails_2_0=ruleEmail();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"emails",
            	    						lv_emails_2_0,
            	    						"csc498.Dsl1.Email");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleContact"
    // InternalDsl1.g:140:1: entryRuleContact returns [EObject current=null] : iv_ruleContact= ruleContact EOF ;
    public final EObject entryRuleContact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContact = null;


        try {
            // InternalDsl1.g:140:48: (iv_ruleContact= ruleContact EOF )
            // InternalDsl1.g:141:2: iv_ruleContact= ruleContact EOF
            {
             newCompositeNode(grammarAccess.getContactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContact=ruleContact();

            state._fsp--;

             current =iv_ruleContact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContact"


    // $ANTLR start "ruleContact"
    // InternalDsl1.g:147:1: ruleContact returns [EObject current=null] : (otherlv_0= 'Contact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleContact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_email_3_0=null;


        	enterRule();

        try {
            // InternalDsl1.g:153:2: ( (otherlv_0= 'Contact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) ) ) )
            // InternalDsl1.g:154:2: (otherlv_0= 'Contact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) ) )
            {
            // InternalDsl1.g:154:2: (otherlv_0= 'Contact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) ) )
            // InternalDsl1.g:155:3: otherlv_0= 'Contact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getContactAccess().getContactKeyword_0());
            		
            // InternalDsl1.g:159:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl1.g:160:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl1.g:160:4: (lv_name_1_0= RULE_ID )
            // InternalDsl1.g:161:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContactAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContactRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getContactAccess().getEmailKeyword_2());
            		
            // InternalDsl1.g:181:3: ( (lv_email_3_0= RULE_STRING ) )
            // InternalDsl1.g:182:4: (lv_email_3_0= RULE_STRING )
            {
            // InternalDsl1.g:182:4: (lv_email_3_0= RULE_STRING )
            // InternalDsl1.g:183:5: lv_email_3_0= RULE_STRING
            {
            lv_email_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_email_3_0, grammarAccess.getContactAccess().getEmailSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContactRule());
            					}
            					setWithLastConsumed(
            						current,
            						"email",
            						lv_email_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContact"


    // $ANTLR start "entryRuleRSVP"
    // InternalDsl1.g:203:1: entryRuleRSVP returns [EObject current=null] : iv_ruleRSVP= ruleRSVP EOF ;
    public final EObject entryRuleRSVP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRSVP = null;


        try {
            // InternalDsl1.g:203:45: (iv_ruleRSVP= ruleRSVP EOF )
            // InternalDsl1.g:204:2: iv_ruleRSVP= ruleRSVP EOF
            {
             newCompositeNode(grammarAccess.getRSVPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRSVP=ruleRSVP();

            state._fsp--;

             current =iv_ruleRSVP; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRSVP"


    // $ANTLR start "ruleRSVP"
    // InternalDsl1.g:210:1: ruleRSVP returns [EObject current=null] : (otherlv_0= 'RSVP' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'message' ( (lv_message_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleRSVP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_message_3_0=null;


        	enterRule();

        try {
            // InternalDsl1.g:216:2: ( (otherlv_0= 'RSVP' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'message' ( (lv_message_3_0= RULE_STRING ) ) ) )
            // InternalDsl1.g:217:2: (otherlv_0= 'RSVP' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'message' ( (lv_message_3_0= RULE_STRING ) ) )
            {
            // InternalDsl1.g:217:2: (otherlv_0= 'RSVP' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'message' ( (lv_message_3_0= RULE_STRING ) ) )
            // InternalDsl1.g:218:3: otherlv_0= 'RSVP' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'message' ( (lv_message_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRSVPAccess().getRSVPKeyword_0());
            		
            // InternalDsl1.g:222:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl1.g:223:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl1.g:223:4: (lv_name_1_0= RULE_ID )
            // InternalDsl1.g:224:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRSVPAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRSVPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRSVPAccess().getMessageKeyword_2());
            		
            // InternalDsl1.g:244:3: ( (lv_message_3_0= RULE_STRING ) )
            // InternalDsl1.g:245:4: (lv_message_3_0= RULE_STRING )
            {
            // InternalDsl1.g:245:4: (lv_message_3_0= RULE_STRING )
            // InternalDsl1.g:246:5: lv_message_3_0= RULE_STRING
            {
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_message_3_0, grammarAccess.getRSVPAccess().getMessageSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRSVPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRSVP"


    // $ANTLR start "entryRuleEmail"
    // InternalDsl1.g:266:1: entryRuleEmail returns [EObject current=null] : iv_ruleEmail= ruleEmail EOF ;
    public final EObject entryRuleEmail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmail = null;


        try {
            // InternalDsl1.g:266:46: (iv_ruleEmail= ruleEmail EOF )
            // InternalDsl1.g:267:2: iv_ruleEmail= ruleEmail EOF
            {
             newCompositeNode(grammarAccess.getEmailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmail=ruleEmail();

            state._fsp--;

             current =iv_ruleEmail; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmail"


    // $ANTLR start "ruleEmail"
    // InternalDsl1.g:273:1: ruleEmail returns [EObject current=null] : (otherlv_0= 'Email' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' otherlv_6= 'message' ( (lv_message_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleEmail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_message_7_0=null;


        	enterRule();

        try {
            // InternalDsl1.g:279:2: ( (otherlv_0= 'Email' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' otherlv_6= 'message' ( (lv_message_7_0= RULE_STRING ) ) ) )
            // InternalDsl1.g:280:2: (otherlv_0= 'Email' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' otherlv_6= 'message' ( (lv_message_7_0= RULE_STRING ) ) )
            {
            // InternalDsl1.g:280:2: (otherlv_0= 'Email' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' otherlv_6= 'message' ( (lv_message_7_0= RULE_STRING ) ) )
            // InternalDsl1.g:281:3: otherlv_0= 'Email' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' otherlv_6= 'message' ( (lv_message_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEmailAccess().getEmailKeyword_0());
            		
            // InternalDsl1.g:285:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl1.g:286:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl1.g:286:4: (lv_name_1_0= RULE_ID )
            // InternalDsl1.g:287:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEmailAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmailRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEmailAccess().getToKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEmailAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl1.g:311:3: ( (otherlv_4= RULE_ID ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl1.g:312:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl1.g:312:4: (otherlv_4= RULE_ID )
            	    // InternalDsl1.g:313:5: otherlv_4= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEmailRule());
            	    					}
            	    				
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    					newLeafNode(otherlv_4, grammarAccess.getEmailAccess().getContactsContactCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getEmailAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getEmailAccess().getMessageKeyword_6());
            		
            // InternalDsl1.g:332:3: ( (lv_message_7_0= RULE_STRING ) )
            // InternalDsl1.g:333:4: (lv_message_7_0= RULE_STRING )
            {
            // InternalDsl1.g:333:4: (lv_message_7_0= RULE_STRING )
            // InternalDsl1.g:334:5: lv_message_7_0= RULE_STRING
            {
            lv_message_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_message_7_0, grammarAccess.getEmailAccess().getMessageSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmailRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmail"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000A802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040010L});

}