import java.util.ArrayList;

public class Q3
{
   public static ArrayList<Integer> addBigInt(ArrayList<Integer> num1, ArrayList<Integer> num2){
         
         
         //Notes: 
         //1. Highest digit is in the index 0
         //2. These two numbers may have different sizes
         //3. The lowest digit is in index   .size()-1
         //4. also need to track increments
         
         //    123456789
         //+ 45678901234 
         //--------------
                     //3
         
         Boolean carryOver = false;
         ArrayList<Integer> result = new ArrayList<Integer>();
         //ArrayList<Integer> largerNum = new ArrayList<Integer>();
         //ArrayList<Integer> smallNum = new ArrayList<Integer>();
         
         System.out.println(num1.size());
         System.out.println(num2.size());
         
         Integer sizeDiff = 0;
         
         if(num1.size() > num2.size()){
             
             sizeDiff = num1.size()-num2.size();
             for(int i=1; i <= sizeDiff; i++ ){
                 num2.add(0,0);
             }
         }
         else if(num1.size() < num2.size()){
             
             sizeDiff = num2.size()-num1.size();
             for(int i=1; i <= sizeDiff;i++ ){
                 num1.add(0,0);
             }
         }
         
         //start adding 
         //logic is:
         
         //first time
         // use .size()-1 to get the lowest digit
         //add num1, num2 (carryover is set false by default)
         //see if the result is larger or equal to 10
            //if it is, store result -10, and set carryover to true
            //if it is not, store result, and set carryover to false
         
         //second time
         //use .size()-2 to get second lowest digit
         //add num1, num2, 
            //if carryover is true, add 1
        
        System.out.println(num1);
        System.out.println(num2);
        
        
        for(int j = num1.size()-1; j >=0; j--){
            
            //add the numbers together
            Integer sum = num1.get(j) + num2.get(j);
            
            System.out.println(sum);
            //add carry over if needed
            if(carryOver == true){
                sum = sum + 1;
                
            }
            
            //check the next carry over and store value
            if(sum >=10){
                carryOver = true;
                result.add(0, sum-10);
            }
            else{
                carryOver = false;
                result.add(0, sum);
            }
            
        }
         
        return result; 
    }


}
