
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package fr.usmb.m1isc.compilation.simple;

import java_cup.runtime.Symbol;
import java.util.HashMap;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class SimpleParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return SimpleParserSym.class;
}

  /** Default constructor. */
  @Deprecated
  public SimpleParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public SimpleParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public SimpleParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\004\000\002\003\004\000\002\005\006" +
    "\000\002\004\003\000\002\004\005\000\002\004\005\000" +
    "\002\004\004\000\002\004\005\000\002\004\005\000\002" +
    "\004\005\000\002\004\005\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\014\006\012\013\005\015\014\017\013\020" +
    "\007\001\002\000\004\005\040\001\002\000\012\006\012" +
    "\013\005\017\013\020\007\001\002\000\004\002\035\001" +
    "\002\000\020\004\ufff3\005\ufff3\006\ufff3\007\ufff3\010\ufff3" +
    "\011\ufff3\014\ufff3\001\002\000\016\004\022\005\034\006" +
    "\023\007\021\010\024\011\020\001\002\000\016\002\uffff" +
    "\006\012\013\005\015\014\017\013\020\007\001\002\000" +
    "\012\006\012\013\005\017\013\020\007\001\002\000\020" +
    "\004\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb\011\ufffb\014" +
    "\ufffb\001\002\000\004\020\015\001\002\000\004\016\016" +
    "\001\002\000\012\006\012\013\005\017\013\020\007\001" +
    "\002\000\016\004\022\005\ufffc\006\023\007\021\010\024" +
    "\011\020\001\002\000\012\006\012\013\005\017\013\020" +
    "\007\001\002\000\012\006\012\013\005\017\013\020\007" +
    "\001\002\000\012\006\012\013\005\017\013\020\007\001" +
    "\002\000\012\006\012\013\005\017\013\020\007\001\002" +
    "\000\012\006\012\013\005\017\013\020\007\001\002\000" +
    "\020\004\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6\011\ufff6" +
    "\014\ufff6\001\002\000\020\004\ufff9\005\ufff9\006\ufff9\007" +
    "\021\010\024\011\020\014\ufff9\001\002\000\020\004\ufffa" +
    "\005\ufffa\006\ufffa\007\021\010\024\011\020\014\ufffa\001" +
    "\002\000\020\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010\ufff7" +
    "\011\ufff7\014\ufff7\001\002\000\020\004\ufff5\005\ufff5\006" +
    "\ufff5\007\ufff5\010\ufff5\011\ufff5\014\ufff5\001\002\000\020" +
    "\004\ufff8\005\ufff8\006\ufff8\007\ufff8\010\ufff8\011\ufff8\014" +
    "\ufff8\001\002\000\004\002\001\001\002\000\016\002\ufffe" +
    "\006\ufffe\013\ufffe\015\ufffe\017\ufffe\020\ufffe\001\002\000" +
    "\004\002\000\001\002\000\016\004\022\006\023\007\021" +
    "\010\024\011\020\014\037\001\002\000\020\004\ufff4\005" +
    "\ufff4\006\ufff4\007\ufff4\010\ufff4\011\ufff4\014\ufff4\001\002" +
    "\000\016\002\ufffd\006\ufffd\013\ufffd\015\ufffd\017\ufffd\020" +
    "\ufffd\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\012\002\005\003\010\004\007\005\003\001" +
    "\001\000\002\001\001\000\004\004\035\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\012\002" +
    "\032\003\010\004\007\005\003\001\001\000\004\004\031" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\004\016\001\001\000\002\001\001\000\004" +
    "\004\030\001\001\000\004\004\027\001\001\000\004\004" +
    "\026\001\001\000\004\004\025\001\001\000\004\004\024" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$SimpleParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$SimpleParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$SimpleParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

    //    initialisation du parser

    }


    // pour le parser (redefinition de la methode reportant les erreurs d'analyse)
    public void report_error(String message, Object info) {
        String m = "";
        if (info instanceof java_cup.runtime.Symbol) {
            Symbol s = ((Symbol) info);
            if (s.left >= 0) {
                /* Ajoute le numero de ligne  */
                m = m + "Ligne " + (s.left+1) + " ";
            }
            if (s.right >= 0) {
                /* Ajoute le numero de colonne  */
                m = m + "Colonne " + (s.right+1) + " ";
            }
            if (s.left >=0  || s.right >= 0) {
                m = m + ": ";
            }
        }
        m = m + "Erreur de syntaxe";
        System.out.println(m);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$SimpleParser$actions {


    // pour utilisation dans les actions (classe action)

    // Dictionnaire de variables
    private HashMap<String,Integer> variables = new HashMap<>();

  private final SimpleParser parser;

  /** Constructor */
  CUP$SimpleParser$actions(SimpleParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$SimpleParser$do_action_part00000000(
    int                        CUP$SimpleParser$act_num,
    java_cup.runtime.lr_parser CUP$SimpleParser$parser,
    java.util.Stack            CUP$SimpleParser$stack,
    int                        CUP$SimpleParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$SimpleParser$result;

      /* select the action based on the action number */
      switch (CUP$SimpleParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // ens_expr ::= expr ens_expr 
            {
              Object RESULT =null;

              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("ens_expr",0, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= ens_expr EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).value;
		RESULT = start_val;
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$SimpleParser$parser.done_parsing();
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ens_expr ::= expr 
            {
              Object RESULT =null;

              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("ens_expr",0, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= expression PVIRG 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).value;
		int pvleft = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int pvright = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Object pv = (Object)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 System.out.println("Resultat = "+e); 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= assignation PVIRG 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).value;
		int pvleft = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int pvright = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Object pv = (Object)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 System.out.println("Assignation OK"); 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // assignation ::= LET NOMVAR EGAL expression 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 variables.put(n,e); RESULT = e; 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("assignation",3, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-3)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expression ::= NOMBRE 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 RESULT = e ; 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expression ::= expression PLUS expression 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 RESULT = e1+e2 ; 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expression ::= expression MOINS expression 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 RESULT = e1-e2 ; 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expression ::= MOINS expression 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 RESULT = -e ; 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expression ::= expression MULT expression 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 RESULT = e1*e2 ; 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expression ::= expression DIV expression 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 if (e2 == 0) { RESULT = 0; System.err.println("Impossible, division par 0"); }
													   else { RESULT = e1/e2; } 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expression ::= expression MOD expression 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 if (e2 == 0) { RESULT = 0; System.err.println("Impossible, division par 0"); }
													   else { RESULT = e1%e2; } 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expression ::= PAR_O expression PAR_F 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).value;
		 RESULT = e ; 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expression ::= NOMVAR 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 if(variables.get(n) != null) { RESULT = variables.get(n); }
                                                                     else { RESULT = 0; System.err.println("Impossible, variable inexistante"); } 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$SimpleParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$SimpleParser$do_action(
    int                        CUP$SimpleParser$act_num,
    java_cup.runtime.lr_parser CUP$SimpleParser$parser,
    java.util.Stack            CUP$SimpleParser$stack,
    int                        CUP$SimpleParser$top)
    throws java.lang.Exception
    {
              return CUP$SimpleParser$do_action_part00000000(
                               CUP$SimpleParser$act_num,
                               CUP$SimpleParser$parser,
                               CUP$SimpleParser$stack,
                               CUP$SimpleParser$top);
    }
}

}
