
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
/**
 *
 * @author Sirak
 */
public class MidtermExam {
    Map<Integer,Integer> input = new TreeMap<Integer,Integer>();
    Set<Integer> number = new HashSet<Integer>();
     Scanner key = new Scanner(System.in);
     int maxF = 0;
     int minF = Integer.MAX_VALUE;
     int max = 0;
     int min = Integer.MAX_VALUE;
    public static void main(String[] args){
       MidtermExam m = new MidtermExam();
       m.getInput();
       m.showMaxFrequency();
       m.showMinFrequency();
       m.showNoFrequency();
    }
    void getInput(){
        while(1>0){
            int x = key.nextInt();
            if(x <= 0){
            break;
            }
            if(input.get(x)==null){
                input.put(x, 1);
                number.add(x);
                if(x>max){
                    max = x;
                }
                if(x<min){
                    min = x;
                }            
            }else{
                int frequency = input.get(x);
                input.put(x, frequency+1);
            }
        }
       
    }// end getInput
    void showMaxFrequency(){
        Iterator<Integer> keySetIterator = input.keySet().iterator();
		while(keySetIterator.hasNext()){
  			Integer key = keySetIterator.next();
  			if(input.get(key)>maxF){
                            maxF = input.get(key);
                        }
		}
                System.out.print("max frequency ");
                
        Iterator<Integer> keySetIterator2 = input.keySet().iterator();
		while(keySetIterator2.hasNext()){
  			Integer key2 = keySetIterator2.next();
  			if(input.get(key2)== maxF){
                            System.out.print(key2+ " ");
                        }
		}
    }// end showMax
    void showMinFrequency(){
        Iterator<Integer> keySetIterator = input.keySet().iterator();
		while(keySetIterator.hasNext()){
  			Integer key = keySetIterator.next();
  			if(input.get(key)<minF){
                            minF = input.get(key);
                        }
		}
                System.out.print("\nmin frequency ");
                
        Iterator<Integer> keySetIterator2 = input.keySet().iterator();
		while(keySetIterator2.hasNext()){
  			Integer key2 = keySetIterator2.next();
  			if(input.get(key2)== minF){
                            System.out.print(key2+ " ");
                        }
		}
    }// end
    void showNoFrequency(){
        System.out.print("\nNo frequency ");
        for(int i= min; i<max; ++i){
            if(!number.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
    
}
