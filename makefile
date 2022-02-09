JC = "C:\Program Files\Java\jdk-17.0.2\bin\javac"

all:
	$(JC) CashRegister.java Staff.java Clerk.java

clean:
	$(RM) *.class