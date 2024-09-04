//1.	Hello World Program: Write a Java program that prints "Hello World!!" to the console.
//2.	Compile with Verbose Option: Compile your Java file using the -verbose option with javac. Check the output.
//3.	Inspect Bytecode: Use the javap tool to examine the bytecode of the compiled .class file. Observe the output.
public class First{
	public static void main(String args[]){
		System.out.println("Hello World!");
	}
}
/*

C:\Users\RISHI\OneDrive\Attachments\Desktop\cdac java\Day1>javac First.java

C:\Users\RISHI\OneDrive\Attachments\Desktop\cdac java\Day1>java First
Hello World!

C:\Users\RISHI\OneDrive\Attachments\Desktop\cdac java\Day1>javap -c First
Compiled from "First.java"
public class First {
  public First();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #13                 // String Hello World!
       5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return
}

C:\Users\RISHI\OneDrive\Attachments\Desktop\cdac java\Day1>

*/