
public class FizzBuzz {

   public static void main(String args[]) {
   
     for(int i = 0; i < 101; i++){
     //Using a modulus allows you to check if a number is divisible without
     //a remainder, making this the most efficient code for the challenge.
        if(i % 15 == 0){
           System.out.println("FizzBuzz");
        }else if(i % 5 == 0){
           System.out.println("Buzz");
        }else if(i % 3 == 0){
           Sytem.out.println("Fizz");
        }
        //Obviously, no else statement included, we don't want it to do anything other than that.
      }
   }
}
