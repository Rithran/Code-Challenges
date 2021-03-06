import java.util.*; 
import java.io.*;

class ReverseString {  

  public static String Reverse(String str) { 
  
     String reverse = "";
    //start at the end of the original string and add chars backwards to the new string
    for(int i = str.length() - 1; i >= 0; i--){
     reverse = reverse + str.charAt(i);
    }
    return reverse;
    
  } 
  
  public static void main (String[] args) {  
      Scanner s = new Scanner(System.in);
    System.out.print(Reverse(s.nextLine())); 
  }   
  
}

//This is another way to do it
import java.util.*; 
import java.io.*;

class ReverseString {  

  
  
  public static void main (String[] args) {  
  
      Scanner s = new Scanner(System.in);
      String str = s.nextLine();
    //StringBuilder reverse... almost feels like cheating.
      StringBuilder b = new StringBuilder(str);
      String reverse = b.reverse().toString();
      System.out.print(reverse); 
  }   
  
}
