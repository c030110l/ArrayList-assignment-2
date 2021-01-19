import java.util.ArrayList;

public class Q2
{
    public static void getGoldbach(Integer input){
         
         //get a list of prime numbers less than input
         ArrayList<Integer> primeNumList = Q1.getPrime(input);
         
         //if we use 120 as an example, input = 120
         //we need to find 7 + 113, or 11 + 109....
         
         //120 - 2 = 118, is 118 in the primeNumList? No
         //120 - 3 = 117, is 117 in the primeNumList? No
         //120 - 5 = 115, is 115? No
         //120 - 7 = 113, is 113? Yes
         
         for(int i=0; i < primeNumList.size(); i++){
             
             Integer calc = input - primeNumList.get(i);
             
             if(primeNumList.contains(calc) == true){
                 
                 System.out.println(primeNumList.get(i) + ",  " + calc);
                 
                 i = primeNumList.size();
                 
             }
             
         }
         
         
     }

    public static void main(String []args){
        
    //getGoldbach(120);
        
     }
}
