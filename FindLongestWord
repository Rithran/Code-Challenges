import java.util.*; 
import java.io.*;

class SortLongestWord {  
    
  public static String LongestWord(String sen) { 
  
    
    int largest = 0;
    //sort the string to remove punctuation, split, and add the split words to an array
    String [] arr = sen.replaceAll("[^a-z A-Z]", "").split(" ");

    //init replacement string
    String str = "a";
    //loop through the array
    for(int i = 0; i < arr.length; i++){
        //find the largest string in the array by using .length() to find it
        if(arr[i].length() > largest){
            largest = arr[i].length();
            str = arr[i];
           }
    }
    return str;
    
  } 
  
  public static void main (String[] args) {  
         
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
}
