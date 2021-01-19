import java.util.ArrayList;

public class Q1{


    public static ArrayList<Integer> getPrime(Integer n){
         
         Integer num = 2;
         ArrayList<Integer> primeList = new ArrayList<Integer>();
         
         //write the entire list from 2 to n
         for(int i=2; i<=n; i++){
             
             primeList.add(i);
             
         }
         
         //primelist=["2", "3", "4", "5", "6", "7"...."20"]
         
         
         while(num < n){
             
             for(int j=2; j <= (n/num) ; j++){
                 
                 //for num = 2, I will be removing 4,6,8,10,12,14,16,18,20
                 //check if the number is still in the list before removing them
                 if(primeList.contains(num*j) == true){
                     ///System.out.println(num*j);
                    primeList.remove( primeList.indexOf(num*j) );
                 }
                 
             }
             
             
             if(primeList.indexOf(num) < primeList.size()-1){
                num = primeList.get( primeList.indexOf(num) +1);
             }
             else{
                 num = n;
             }
             
         }
         
         return primeList;
         
     }
     public static void main(String []args){
        
        //System.out.println(getPrime(50).toString());
        
        
     }
     
     
}



