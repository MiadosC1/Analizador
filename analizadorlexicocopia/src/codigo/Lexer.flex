package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
"if"                         { lexeme=yytext(); return Pregunta; }
"else"                       { lexeme=yytext(); return Contrario; }
">="|"<="|"=="|"!="|">"|"<"   { lexeme=yytext(); return Comparar; }
{D}+                          { lexeme=yytext(); return Numero; }
\"{L}({L}|{D})*\"              { lexeme=yytext(); return Literal; }
"**"|"+"|"-"|"*"|"/"|"%"      { lexeme=yytext(); return Operaciones; }
"="                           { lexeme=yytext(); return Asignacion; }
"++"                          { lexeme=yytext(); return Incremento; }
"--"                          { lexeme=yytext(); return Decremento; }
"&&"|"||"|"!"                 { lexeme=yytext(); return Logico; }
"^"|"~"|"<<"|">>"             { lexeme=yytext(); return Bits; }
"*"|"&"|"->"|"::"             { lexeme=yytext(); return Punteros; }
"."                           { lexeme=yytext(); return Punto; }
"//".*                        {/* Ignore comentario de línea */}
"/*"([^*]|\*+[^*/])*\*+"/"    {/* Ignore comentario de bloque */}
"#".*                         {/* Ignore comentario tipo script */}
"{" { lexeme=yytext(); return LlaveApertura; }
"}" { lexeme=yytext(); return LlaveCerradura; }
"(" { lexeme=yytext(); return ParentesisApertura; }
")" { lexeme=yytext(); return ParentesisCerradura; }
"[" { lexeme=yytext(); return CorcheteApertura; }
"]" { lexeme=yytext(); return CorcheteCerradura; }

int|float|double|bool|char|string|var|dynamic 
                              { lexeme=yytext(); return Tipodato; }

public|private|protected|internal
                              { lexeme=yytext(); return Acceso; }

break|continue|return|goto|match
                              { lexeme=yytext(); return ControlFlujo; }

TRUE|FALSE|null|undefined
                              { lexeme=yytext(); return Constantes; }

sizeof|new|delete|await|async|typeof|nameof|reinterpret_cast|static_cast
                              { lexeme=yytext(); return OperadoresEspeciales; }

try|catch|throw|finally
                              { lexeme=yytext(); return ManejoErrores; }

class|interface|extends|package|import|enum|struct|base|this|super
                              { lexeme=yytext(); return Reservadas; }

instanceof|function
                              { lexeme=yytext(); return Relacional; }

def|fun|fn
                              { lexeme=yytext(); return Funciones; }

object|record|data
                              { lexeme=yytext(); return Clases; }

raise                         { lexeme=yytext(); return Excepciones; }

namespace|module
                              { lexeme=yytext(); return EspacioNombre; }

implements
                              { lexeme=yytext(); return Herencia; }

static|final|const|readonly|transient|volatile|strictfp|partial|sealed
                              { lexeme=yytext(); return Modificadores; }

let|val { lexeme=yytext(); return Variables; }

for|while|do|foreach|repeat|until { lexeme=yytext(); return Ciclos; }

switch|case|default|when { lexeme=yytext(); return Condiciones; }

print|scanf|cin|cout|input|output { lexeme=yytext(); return E_S; }

include|using|require { lexeme=yytext(); return Require; }

template|typename|concept { lexeme=yytext(); return Genericos; }

async|thread|synchronized { lexeme=yytext(); return Concurrencia; }

operator|override|explicit|virtual|inline|abstract { lexeme=yytext(); return OtrosReservados; }

assert|ensure { lexeme=yytext(); return Aserciones; }

any { lexeme=yytext(); return TipadoDebil; }

union|tuple|delegate|event { lexeme=yytext(); return EstructurasAdicionales; }

stream|yield|pipe|fork|join { lexeme=yytext(); return Streams; }

constexpr|eval|meta { lexeme=yytext(); return Metaprogramacion; }

NaN|Infinity { lexeme=yytext(); return OtrosValores; }

typedef
                              { lexeme=yytext(); return Alias; }

lock|critical|atomic
                              { lexeme=yytext(); return Seguridad; }

malloc|free|stackalloc
                              { lexeme=yytext(); return ManejoMemoria; }

open|close|read|write|fopen|fclose
                              { lexeme=yytext(); return Archivos; }

socket|bind|listen|accept|connect
                              { lexeme=yytext(); return Redes; }

fetch|axios|XMLHttpRequest
                              { lexeme=yytext(); return Web; }

Contexpr|consteval
                              { lexeme=yytext(); return Contexpr; }

requires
                              { lexeme=yytext(); return Conceptos; }

mutex|semaphore
                              { lexeme=yytext(); return Sincronizacion; }

select|insert|update|delete|from|where
                              { lexeme=yytext(); return Basededatos; }

array|list|vector|map|set
                              { lexeme=yytext(); return Vectores; }

main|init|start|setup|loop
                              { lexeme=yytext(); return FuncionesEspeciales; }

filter|reduce
                              { lexeme=yytext(); return CiclosEspeciales; }

bigint|bigdecimal|smallint|tinyint
                              { lexeme=yytext(); return TiposEspeciales; }

noop|pass|skip
                              { lexeme=yytext(); return Otros; }

echo|puts
                              { lexeme=yytext(); return EscrituraPantalla; }

exit|abort|die
                              { lexeme=yytext(); return FinalizarPrograma; }

option|maybe|optional
                              { lexeme=yytext(); return Opcionales; }

iterator|iter|enumerate|zip
                              { lexeme=yytext(); return Iteradores; }

tostring|toint|parse|cast
                              { lexeme=yytext(); return Conversiones; }

success|failure|error|ok
                              { lexeme=yytext(); return CodigosRetorno; }

ready|waiting|running|stopped
                              { lexeme=yytext(); return Estados; }

match|case|when|otherwise
                              { lexeme=yytext(); return EstructuraCondicional; }

[_$@]
                              { lexeme=yytext(); return VariablesEspeciales; }

'[a-zA-Z]'|0x[0-9A-Fa-f]+
                              { lexeme=yytext(); return LiteralesEspeciales; }

serialize|deserialize|json|xml
                              { lexeme=yytext(); return Serializacion; }

sleep|delay|timeout
                              { lexeme=yytext(); return Tiempo; }

random|rand|srand|Math\.random
                              { lexeme=yytext(); return Random; }

resource|dispose|finalize
                              { lexeme=yytext(); return Recursos; }

log|warn|error|debug
                              { lexeme=yytext(); return Logs; }

enum|enum class
                              { lexeme=yytext(); return Enums; }

declare|define
                              { lexeme=yytext(); return Declaraciones; }

generator|async generator
                              { lexeme=yytext(); return Generadores; }

export
                              { lexeme=yytext(); return Modularizacion; }

add|substract|multiply|divide
                              { lexeme=yytext(); return OperacionesMatematicas; }

matrix|transpose|determinant
                              { lexeme=yytext(); return Matrices; }

compile|build|link
                              { lexeme=yytext(); return Compilacion; }

version|buildNumber|release
                              { lexeme=yytext(); return Versiones; }

commit|push|pull|merge|branch
                              { lexeme=yytext(); return Git; }

csrf|xss|cors
                              { lexeme=yytext(); return SeguridadWeb; }

@Override|@Deprecated|@SuppressWarnings
                              { lexeme=yytext(); return Anotaciones; }

proxy|handler|trap
                              { lexeme=yytext(); return Proxies; }

reflect|metadata|annotation
                              { lexeme=yytext(); return Reflexion; }

{D}+                       
                            { lexeme = yytext(); return NumeroEntero; }

{D}+"."{D}+                
                            { lexeme = yytext(); return NumeroDecimal; }

"0x"([0-9]|[a-fA-F])+      
                            { lexeme = yytext(); return NumeroHexadecimal; }
\'({L}|{D})\'              
                            { lexeme = yytext(); return Caracter; }

\"({L}|{D})*\"             
                            { lexeme = yytext(); return Cadena; }

"extern"                   
                            { lexeme = yytext(); return EnlaceExterno; }

{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
("(-"{D}+")")|{D}+ { lexeme=yytext(); return Numero; }
{L}({L}|{D})*                 { lexeme=yytext(); return Identificador; }
. { lexeme=yytext(); return ERROR; }
