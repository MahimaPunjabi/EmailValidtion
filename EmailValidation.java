

import java.util.*;
class EmailValidation
{

 public static void main(String[] args)
{ 
    Scanner sc = new Scanner(System.in);
  System.out.println("Enter your email address");
  String email = sc.next();
  boolean b= email.endsWith(".");
  boolean b1= email.startsWith(".");
          
  int l = email.lastIndexOf('.');
  int atCount = 0;
  for (int i = 0; i < email.length(); i++) {
    if(email.charAt(i)=='@')
       atCount++; }
   boolean inValid =false;
  if (email.contains("..") || email.contains(".@") || email.contains("@."))
      inValid=true;
  String divs[]=email.split("@"); 
  String uN= divs[0];
  String dN= divs[1]; 
  if ((atCount==1) && (uN.endsWith(".")==false)  &&(inValid==false))
 { 
     System.out.println("\"Valid email address\"");
 }
 else { 
      System.out.println("\n\"Invalid email address\""); 
  }
  System.out.println("User name:" + uN);
  System.out.println("Domain name:" + dN);   
    }
}