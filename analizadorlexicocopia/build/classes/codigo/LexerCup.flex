package codigo;
import java_cup.runtime.Symbol;
%%
%class Lexer
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol (int type, Object value)
    {
        return new Symbol(type, yyline, yycolumn, value);
    }

     private Symbol symbol (int type)
    {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}
%%
"if"                         {return new Symbol(sym.Pregunta, yychar, yyline, yytext());}
"else"                       {return new Symbol(sym.Contrario, yychar, yyline, yytext());}
">="|"<="|"=="|"!="|">"|"<"   {return new Symbol(sym.Comparar, yychar, yyline, yytext());}
{D}+                          {return new Symbol(sym.Numero, yychar, yyline, yytext());}
\"{L}({L}|{D})*\"              {return new Symbol(sym.Literal, yychar, yyline, yytext());}
"**"|"+"|"-"|"*"|"/"|"%"      {return new Symbol(sym.Operaciones, yychar, yyline, yytext());}
"="                           { return new Symbol(sym.Asignacion, yychar, yyline, yytext()); }
"++"                          { return new Symbol(sym.Incremento, yychar, yyline, yytext()); }
"--"                          { return new Symbol(sym.Decremento, yychar, yyline, yytext()); }
"&&"|"||"|"!"                 { return new Symbol(sym.Logico, yychar, yyline, yytext()); }
"^"|"~"|"<<"|">>"             { return new Symbol(sym.Bits, yychar, yyline, yytext()); }
"*"|"&"|"->"|"::"             { return new Symbol(sym.Punteros, yychar, yyline, yytext()); }
"."                           { return new Symbol(sym.Punto, yychar, yyline, yytext()); }
"//".*                        {/* Ignore comentario de línea */}
"/*"([^*]|\*+[^*/])*\*+"/"    {/* Ignore comentario de bloque */}
"#".*                         {/* Ignore comentario tipo script */}
"{"                           { return new Symbol(sym.LlaveApertura, yychar, yyline, yytext()); }
"}"                           { return new Symbol(sym.LlaveCerradura, yychar, yyline, yytext()); }
"("                           { return new Symbol(sym.ParentesisApertura, yychar, yyline, yytext()); }
")"                           { return new Symbol(sym.ParentesisCerradura, yychar, yyline, yytext()); }
"["                           { return new Symbol(sym.CorcheteApertura, yychar, yyline, yytext()); }
"]"                           { return new Symbol(sym.CorcheteCerradura, yychar, yyline, yytext()); }
";"                           { return new Symbol(sym.Delimitador, yychar, yyline, yytext()); }     

int|float|double|bool|char|string|var|dynamic 
                              { return new Symbol(sym.Tipodato, yychar, yyline, yytext()); }

public|private|protected|internal
                              { return new Symbol(sym.Acceso, yychar, yyline, yytext()); }

break|continue|return|goto|match
                              { return new Symbol(sym.ControlFlujo, yychar, yyline, yytext()); }

TRUE|FALSE|null|undefined
                              { return new Symbol(sym.Constantes, yychar, yyline, yytext()); }

sizeof|new|delete|await|async|typeof|nameof|reinterpret_cast|static_cast
                              { return new Symbol(sym.OperadoresEspeciales, yychar, yyline, yytext()); }

try|catch|throw|finally
                              { return new Symbol(sym.ManejoErrores, yychar, yyline, yytext()); }

class|interface|extends|package|import|enum|struct|base|this|super
                              { return new Symbol(sym.Reservadas, yychar, yyline, yytext()); }

instanceof|function
                              { return new Symbol(sym.Relacional, yychar, yyline, yytext()); }

def|fun|fn
                              { return new Symbol(sym.Funciones, yychar, yyline, yytext()); }

object|record|data
                              { return new Symbol(sym.Clases, yychar, yyline, yytext()); }

raise                         { return new Symbol(sym.Excepciones, yychar, yyline, yytext()); }

namespace|module
                              { return new Symbol(sym.EspacioNombre, yychar, yyline, yytext()); }

implements
                              { return new Symbol(sym.Herencia, yychar, yyline, yytext()); }

static|final|const|readonly|transient|volatile|strictfp|partial|sealed
                              { return new Symbol(sym.Modificadores, yychar, yyline, yytext()); }

let|val { return new Symbol(sym.Variables, yychar, yyline, yytext()); }

for|while|do|foreach|repeat|until { return new Symbol(sym.Ciclos, yychar, yyline, yytext()); }

switch|case|default|when { return new Symbol(sym.Condiciones, yychar, yyline, yytext()); }

print|scanf|cin|cout|input|output { return new Symbol(sym.E_S, yychar, yyline, yytext()); }

include|using|require { return new Symbol(sym.Require, yychar, yyline, yytext()); }

template|typename|concept { return new Symbol(sym.Genericos, yychar, yyline, yytext()); }

async|thread|synchronized { return new Symbol(sym.Concurrencia, yychar, yyline, yytext()); }

operator|override|explicit|virtual|inline|abstract { return new Symbol(sym.OtrosReservados, yychar, yyline, yytext()); }

assert|ensure { return new Symbol(sym.Aserciones, yychar, yyline, yytext()); }

any { return new Symbol(sym.TipadoDebil, yychar, yyline, yytext()); }

union|tuple|delegate|event { return new Symbol(sym.EstructurasAdicionales, yychar, yyline, yytext()); }

stream|yield|pipe|fork|join { return new Symbol(sym.Streams, yychar, yyline, yytext()); }

constexpr|eval|meta { return new Symbol(sym.Metaprogramacion, yychar, yyline, yytext()); }

NaN|Infinity { return new Symbol(sym.OtrosValores, yychar, yyline, yytext()); }

typedef { return new Symbol(sym.Alias, yychar, yyline, yytext()); }

lock|critical|atomic { return new Symbol(sym.Seguridad, yychar, yyline, yytext()); }

malloc|free|stackalloc { return new Symbol(sym.ManejoMemoria, yychar, yyline, yytext()); }

open|close|read|write|fopen|fclose { return new Symbol(sym.Archivos, yychar, yyline, yytext()); }

socket|bind|listen|accept|connect { return new Symbol(sym.Redes, yychar, yyline, yytext()); }

fetch|axios|XMLHttpRequest { return new Symbol(sym.Web, yychar, yyline, yytext()); }

Contexpr|consteval { return new Symbol(sym.Contexpr, yychar, yyline, yytext()); }

requires { return new Symbol(sym.Conceptos, yychar, yyline, yytext()); }

mutex|semaphore { return new Symbol(sym.Sincronizacion, yychar, yyline, yytext()); }

select|insert|update|delete|from|where { return new Symbol(sym.Basededatos, yychar, yyline, yytext()); }

array|list|vector|map|set { return new Symbol(sym.Vectores, yychar, yyline, yytext()); }

main|init|start|setup|loop { return new Symbol(sym.FuncionesEspeciales, yychar, yyline, yytext()); }

filter|reduce { return new Symbol(sym.CiclosEspeciales, yychar, yyline, yytext()); }

bigint|bigdecimal|smallint|tinyint { return new Symbol(sym.TiposEspeciales, yychar, yyline, yytext()); }

noop|pass|skip { return new Symbol(sym.Otros, yychar, yyline, yytext()); }

echo|puts { return new Symbol(sym.EscrituraPantalla, yychar, yyline, yytext()); }

exit|abort|die { return new Symbol(sym.FinalizarPrograma, yychar, yyline, yytext()); }

option|maybe|optional { return new Symbol(sym.Opcionales, yychar, yyline, yytext()); }

iterator|iter|enumerate|zip { return new Symbol(sym.Iteradores, yychar, yyline, yytext()); }

tostring|toint|parse|cast { return new Symbol(sym.Conversiones, yychar, yyline, yytext()); }

success|failure|error|ok { return new Symbol(sym.CodigosRetorno, yychar, yyline, yytext()); }

ready|waiting|running|stopped { return new Symbol(sym.Estados, yychar, yyline, yytext()); }

match|case|when|otherwise { return new Symbol(sym.EstructuraCondicional, yychar, yyline, yytext()); }

[_$@] { return new Symbol(sym.VariablesEspeciales, yychar, yyline, yytext()); }

'[a-zA-Z]'|0x[0-9A-Fa-f]+ { return new Symbol(sym.LiteralesEspeciales, yychar, yyline, yytext()); }

serialize|deserialize|json|xml { return new Symbol(sym.Serializacion, yychar, yyline, yytext()); }

sleep|delay|timeout { return new Symbol(sym.Tiempo, yychar, yyline, yytext()); }

random|rand|srand|Math\.random { return new Symbol(sym.Random, yychar, yyline, yytext()); }

resource|dispose|finalize { return new Symbol(sym.Recursos, yychar, yyline, yytext()); }

log|warn|error|debug { return new Symbol(sym.Logs, yychar, yyline, yytext()); }

enum|enum class { return new Symbol(sym.Enums, yychar, yyline, yytext()); }

declare|define { return new Symbol(sym.Declaraciones, yychar, yyline, yytext()); }

generator|async generator { return new Symbol(sym.Generadores, yychar, yyline, yytext()); }

export { return new Symbol(sym.Modularizacion, yychar, yyline, yytext()); }

add|substract|multiply|divide { return new Symbol(sym.OperacionesMatematicas, yychar, yyline, yytext()); }

matrix|transpose|determinant { return new Symbol(sym.Matrices, yychar, yyline, yytext()); }

compile|build|link { return new Symbol(sym.Compilacion, yychar, yyline, yytext()); }

version|buildNumber|release { return new Symbol(sym.Versiones, yychar, yyline, yytext()); }

commit|push|pull|merge|branch { return new Symbol(sym.Git, yychar, yyline, yytext()); }

csrf|xss|cors { return new Symbol(sym.SeguridadWeb, yychar, yyline, yytext()); }

@Override|@Deprecated|@SuppressWarnings { return new Symbol(sym.Anotaciones, yychar, yyline, yytext()); }

proxy|handler|trap { return new Symbol(sym.Proxies, yychar, yyline, yytext()); }

reflect|metadata|annotation { return new Symbol(sym.Reflexion, yychar, yyline, yytext()); }

{D}+ { return new Symbol(sym.NumeroEntero, yychar, yyline, yytext()); }

{D}+"."{D}+ { return new Symbol(sym.NumeroDecimal, yychar, yyline, yytext()); }

"0x"([0-9]|[a-fA-F])+ { return new Symbol(sym.NumeroHexadecimal, yychar, yyline, yytext()); }

\'({L}|{D})\' { return new Symbol(sym.Caracter, yychar, yyline, yytext()); }

\"({L}|{D})*\" { return new Symbol(sym.Cadena, yychar, yyline, yytext()); }

"extern" { return new Symbol(sym.EnlaceExterno, yychar, yyline, yytext()); }

{espacio} {/*Ignore*/}

"//".* {/*Ignore*/}

("(-"{D}+")")|{D}+ { return new Symbol(sym.Numero, yychar, yyline, yytext()); }

{L}({L}|{D})* { return new Symbol(sym.Identificador, yychar, yyline, yytext()); }

. { return new Symbol(sym.ERROR, yychar, yyline, yytext()); }
