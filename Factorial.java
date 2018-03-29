import java.util.*; 
import java.io.*;

class Factorial {  
  public static int FindFactorial(int num) { 
    
    //assign the value of i to be num - 1 (first number to multiply by) and continue to subtract and multiply until it reaches 0.
    for(int i = num - 1;i>0; i--){
        num = num*i;
    }
       
    return num;
} 
  public static void main (String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print(FindFactorial(s.nextLine())); 
  }   
  
}
