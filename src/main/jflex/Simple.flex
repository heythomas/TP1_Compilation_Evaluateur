/* --------------------------Section de Code Utilisateur---------------------*/
package fr.usmb.m1isc.compilation.simple;
import java_cup.runtime.Symbol;

%%

/* -----------------Section des Declarations et Options----------------------*/
// nom de la class a generer
%class SimpleLexer
%unicode
%line   // numerotation des lignes
%column // numerotation caracteres par ligne

// utilisation avec CUP
// nom de la classe generee par CUP qui contient les symboles terminaux
%cupsym SimpleParserSym
// generation analyser lexical pour CUP
%cup

// code a ajouter dans la classe produite
%{

%}

/* definitions regulieres */

chiffre 	= [0-9]
sep 		= \s
mod 		= "mod"

// Gestion variables (exo 2)
let = "let"
nom_var = [:letter:]

%% 
/* ------------------------Section des Regles Lexicales----------------------*/

/* Appels à cup via des symboles/définitions */
{chiffre}+	{ return new Symbol(SimpleParserSym.NOMBRE, yyline, yycolumn, Integer.valueOf(yytext())) ;}
{sep}+ 	    { /* pas d'action */ }
"+"			{ return new Symbol(SimpleParserSym.PLUS, yyline, yycolumn) ;}
";"			{ return new Symbol(SimpleParserSym.PVIRG, yyline, yycolumn) ;}
"-"			{ return new Symbol(SimpleParserSym.MOINS, yyline, yycolumn) ;}
"*"			{ return new Symbol(SimpleParserSym.MULT, yyline, yycolumn) ;}
"/"			{ return new Symbol(SimpleParserSym.DIV, yyline, yycolumn) ;}
{mod}		{ return new Symbol(SimpleParserSym.MOD, yyline, yycolumn) ;}
"("			{ return new Symbol(SimpleParserSym.PAR_O, yyline, yycolumn) ;}
")"			{ return new Symbol(SimpleParserSym.PAR_F, yyline, yycolumn) ;}
// Gestion variables
{let}		{ return new Symbol(SimpleParserSym.LET, yyline, yycolumn) ;}
{nom_var}	{ return new Symbol(SimpleParserSym.NOMVAR, yyline, yycolumn, yytext()) ;}
"="			{ return new Symbol(SimpleParserSym.EGAL, yyline, yycolumn) ;}

