@ECHO OFF

if NOT exist class MKDIR class

javac *.java -d class

IF ["%ERRORLEVEL%"] == ["0"] (
	ECHO NQueenProblem:
	java -cp class; NQueenProblem
	
	ECHO NQueenProblem2:
	java -cp class; NQueenProblem2
)
