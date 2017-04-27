import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * RM 1/2559 Quiz2 by Sirak
 */
public class Quiz2_1_2559 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        ArrayList<Integer> maxList = new ArrayList<Integer>();
        int maxFrequency=0;
        while(true){
            int x = keyboard.nextInt();
            if(x<0){
                break;
            }
            if(map.get(x)==null){
                map.put(x, 1);
            }else{
                int y = map.get(x);
                y++;
                if(y>maxFrequency){
                    maxFrequency=y;
                }
                map.put(x, y);
            }
        }
        
        for (Map.Entry entry : map.entrySet()) {
                System.out.print(entry.getKey() + " "+entry.getValue()+ "\n" );      
             if((int)entry.getValue()==maxFrequency){
                 maxList.add((int)entry.getKey());
             }   
        }
        System.out.println("Max Frequency = "+maxFrequency);
        for (int i=0;i<maxList.size();i++) {
                
                    System.out.print(maxList.get(i) + " " );      
                
        }
    }
}
