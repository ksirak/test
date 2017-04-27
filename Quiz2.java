import java.util.ArrayList;
import java.util.Scanner;

public class Quiz2 {
        int[] input = new int[10000];
        int prime = 0;
        int moreOdd = 0;
        int moreEven = 0;
        int equal = 0;
        ArrayList primeList = new ArrayList<Fac>();
        ArrayList oddList = new ArrayList<Fac>();
        ArrayList evenList = new ArrayList<Fac>();
        ArrayList equalList = new ArrayList<Fac>();
        
    class Fac{
        int value;
        ArrayList facList = new ArrayList<Integer>();
        void showValue(){
            System.out.print(value+" ");
        }
        void showList(){
            for(int i=0; i<facList.size();i++){
             System.out.print(facList.get(i)+" ");
            } 
            System.out.println();
        }
    }
    Quiz2(){
    }
    public static void main(String[] args) {
                // TODO code application logic here
        Quiz2 q2 = new Quiz2();
  //      System.out.println("Start Program");
                       
        Scanner keyboard = new Scanner(System.in);
        for(int i=0; i<10000;i++){
           q2.input[i] = keyboard.nextInt();
           if(q2.input[i]<=0){
               break;
           }          
        }// end for
        System.out.println();
        q2.start();
        q2.printPrime();
        q2.printOdd();
        q2.printEven();
        q2.printEqual();
    }
        
    public void start(){    
         for(int i=0; input[i]>0;i++){
             Fac fac = new Fac();
             fac.value = input[i];
             //System.out.print(input[i]+" ");
             int odd =0, even = 0;
             for(int j=1;j<=input[i];j++){
                 if(input[i]%j == 0){
                     fac.facList.add(j);
                     if(j%2 == 0){
                         even++;
                     }else{ 
                         odd++;
                     }
                 //System.out.print(j+" ");
                }                                                                  
             }// end for
                if(input[i]==2){
                    prime++;
                    primeList.add(fac);
                }else if(input[i]>2 && odd>even && odd == 2){
                     prime++;
                     primeList.add(fac);
                 }else if(odd>even){
                     moreOdd++;  
                     oddList.add(fac);
                 }else if(even>odd){
                     moreEven++;
                     evenList.add(fac);
                 }else{
                     equal++;
                     equalList.add(fac);
                 }
         
            //System.out.println(" o = "+odd+" e = "+even);  
         }
        System.out.println("prime = "+prime+" more odd = "+moreOdd+" more even = "
                +moreEven+" equal = "+equal);
       
    }
    public void printPrime(){
        System.out.println("##########");
        for (int i = 0; i < primeList.size(); i++) {
	    Fac fac = (Fac)primeList.get(i);
	    fac.showValue();
            fac.showList();
	}
    }
    public void printOdd(){
        System.out.println("##########");
        for (int i = 0; i < oddList.size(); i++) {
	    Fac fac = (Fac)oddList.get(i);
	    fac.showValue();
            fac.showList();
        }
    }
    public void printEven(){
        System.out.println("##########"); 
        for (int i = 0; i < evenList.size(); i++) {
	    Fac fac = (Fac)evenList.get(i);
	    fac.showValue();
            fac.showList();
        }
    }
    public void printEqual(){
        System.out.println("##########");
        for (int i = 0; i < equalList.size(); i++) {
	    Fac fac = (Fac)equalList.get(i);
	    fac.showValue();
            fac.showList();
        }
    }
    
}