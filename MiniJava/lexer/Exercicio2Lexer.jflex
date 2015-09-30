package generated.lexer;

%%

/* 
A linha atual pode ser acessada por yyline 
e a coluna atual com yycolumn. 
*/ 
%line
%column

/* Se quisermos 'interfacear' com um parser gerado pelo sistema CUP
%cup
*/ 

//encoding
%unicode

// faz com que a classe tenha uma função main e torna possivel que a classe gerada seja usada como reconhecedor
%standalone

//nomeia a classe
%class Exercicio2Lexer

/* 
Declarações

código dentro de %{ e %}, é copiado para a classe gerada. 
a ideia é utilizar este recurso para declarar atributos e métodos usados nas ações 
*/ 
%{
int qtdeID=0;
%}


%eof{
System.out.println("Quantidade de Identificadores encontrados: "+qtdeID);
%eof}

/*-*
 * PADROES NOMEADOS:
 */
underline		= [_]
letter          = [A-Za-z]
digit           = [0-9]
integer_literal = 0 | [1-9][0-9]*
float_literal = {integer_literal}.{integer} (E [+ | -]? {integer_literal})?
integer         = {digit}+
alphanumeric    = {underline}|{letter}|{digit}
identifier      = ({letter}|{underline})({alphanumeric})*
eol = [\r|\n|\r\n]
whitespace = {eol}|[ \t]


/*Comentários (alinhandos não são permitidos) */
COMMENT_MULTILINE = "/*" [^*] ~"*/" | "/*" "*"+ "/"
COMMENT_SIMPLELINE = "//" [^\r\n]* {eol}?
COMMENT = {COMMENT_MULTILINE}|{COMMENT_SIMPLELINE}

%%
/* Palavras chave */
"return"			 { System.out.println("Token return"); 	}
"class"   			 { System.out.println("Token class"); 	}
"public"  			 { System.out.println("Token public"); 	} 
"static"  			 { System.out.println("Token static"); 	}
"void"    			 { System.out.println("Token void"); 	}
"main"    			 { System.out.println("Token main");	}
"extends"			 { System.out.println("Token extends"); }
"this"				 { System.out.println("Token this");	}
"new"				 { System.out.println("Token new"); 	}
"int"				 { System.out.println("Token int"); 	}
"boolean"			 { System.out.println("Token boolean"); }
"System.out.println" { System.out.println("Token System.out.println") }

/* Condicionais */
"if"				 { System.out.println("Token if"); 		}
"else"				 { System.out.println("Token else"); 	}
"while"				 { System.out.println("Token while"); 	}

/* Booleanos */
"true"				 { System.out.println("Token true"); 	}
"false"				 { System.out.println("Token false"); 	}

/* Operadores */
"&&"             	 { System.out.println("Token &&"); }
"||"				 { System.out.println("Token ||"); }
"*"             	 { System.out.println("Token *"); }
"+"             	 { System.out.println("Token +"); }
"-"             	 { System.out.println("Token -"); }
"/"             	 { System.out.println("Token /"); }
"=="             	 { System.out.println("Token =="); }
"<"             	 { System.out.println("Token <"); }
"<="             	 { System.out.println("Token <="); }
">"             	 { System.out.println("Token >"); }
">="             	 { System.out.println("Token >="); }

/* Delimitadores */
"("             	 { System.out.println("Token ("); }
")"             	 { System.out.println("Token )"); }
"{"                  { System.out.println("Token {");} 
"}"                  { System.out.println("Token }");}
"["                  { System.out.println("Token [");}
"]"                  { System.out.println("Token ]");}
"."             	 { System.out.println("Token ."); }
","             	 { System.out.println("Token ,"); }
"="             	 { System.out.println("Token ="); }
";"             	 { System.out.println("Token ;"); }

/* Identificadores */
{identifier}    	 { qtdeID++; System.out.println("Token ID ("+yytext()+")"); }

/* Literais */
{integer_literal}    { System.out.println("Token INT ("+yytext()+")"); }
{float_literal}    { System.out.println("Token FLOAT ("+yytext()+")"); }

/* Espaços em branco */
{whitespace}+    	 { /* Ignorar whitespace. */ }

/* Comentarios */
{COMMENT} { /* Ignore os comentários */ }

. { System.out.println("Illegal char, '" + yytext() + "' line: " + yyline + ", column: " + yycolumn); }
