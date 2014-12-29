// written by Alican Şekerefe

grammar MFPL;

parse : rootRule;
//main rule
rootRule : 'start' statementRule+ 'terminate';

//statement which consists of declaration, assignment, conditions, loops and routine
statementRule : 
(declarationRule | assignmentRule | conditionalStructRule | loopRule | routineRule) ';';
//variable declaration with type name
declarationRule : 'declare' IDENTIFIER+ 'as' TYPENAME;
//value assignment
assignmentRule : IDENTIFIER '<-' (expressionRule | STRINGVALUE);

//expression set
expressionRule:  expressionRule  operator='or' expressionRule2 | expressionRule2;
expressionRule2: expressionRule2 operator='and' expressionRule3 | expressionRule3;
expressionRule3: expressionRule3 operator='equals' expressionRule4 | expressionRule4;
expressionRule4: expressionRule4 operator=('+' | '-') expressionRule5 | expressionRule5;
expressionRule5: expressionRule5 operator=('*' | '/') expressionRule6 | expressionRule6;
expressionRule6: '(' expressionRule ')' | (NUMERICVALUE | IDENTIFIER);

//conditional structure rule
conditionalStructRule : ifRule;

//rules for if, elseif and else control statements
ifRule : 'incase' expressionRule statementRule+ elseIfRule* elseRule? 'nocase';
elseIfRule : 'othercase' expressionRule statementRule+;
elseRule : 'otherwise' statementRule+;

//routine call rule. consists of print and systemcall
routineRule : printRule | systemcallRule;

//loops : countloop and doforever if
loopRule : countRule | doforeverifRule;
//count loop. counts from NUMERICVALUE.1 to NUMERICVALUE.2 by executing statements
countRule : 'count from' NUMERICVALUE 'to' NUMERICVALUE 'perform' statementRule+ 'nocount';
//doforever if loop. keeps running until expressionRule returns 0
doforeverifRule : 'doforever if' expressionRule statementRule+ 'noforever';

//prints the given content through std out
printRule : 'print' printContentRule+;
//printable contents which can be expression, id or string
printContentRule : (expressionRule | IDENTIFIER | STRINGVALUE);

//rule for calling external programs
systemcallRule : 'syscall' systemcallcontentRule+;
//content can be a string or identifier
systemcallcontentRule : (STRINGVALUE | IDENTIFIER);

//tokens
TYPENAME : 'int' | 'float' | 'str';
IDENTIFIER : [a-zA-Z]+[a-zA-Z0-9]*;
NUMERICVALUE : INTVALUE | FLOATVALUE;
INTVALUE : '-'?[0-9]+;
FLOATVALUE : '-'?[0-9]'.'[0-9]+;
STRINGVALUE : '\"'[a-zA-Z0-9':''/']+'\"';

//whitespace supressor
WS : [ \t\r\n]+ -> skip ;