package exceptionHandling; 
public class ExceptionHandlingWithTryCatch 
{ 
public static void main(String[] args) 
{ 
 System.out.println("One"); 
 System.out.println("Two"); 

// Declare a try-catch block. 
try // Error handling code starts here. 
{ 
 System.out.println("Before divide"); 
 int a = 1/0;
 // Exceptional case (Exception has occurred). 
 System.out.println("After divide"); 
} 
catch(Exception e) // Exception handled. Here, catch block is exception handler. 
{ 
  System.out.println("A number cannot be divided by zero."); // User-friendly message 
} 
System.out.println("Three"); 
System.out.println("Four"); 
 } 
}