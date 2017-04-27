
import java.util.HashSet;
import java.util.Scanner;

/**
 * Solution for RM Final Exam 1/2559
 * @author sirak
 */
public class FinalExam {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();
        int min=Integer.MAX_VALUE;
        int max = 0;
        while(true){
            int n = keyboard.nextInt();
            if(n<0){
                break;
            }
            set.add(n);
            if(n>max){
                max = n;
            }
            if(n<min){
                min =n;
            }
        }
        System.out.println("Number = "+set.size()+" min = "+min+
                " max = "+max);
        for(int i=max;i>min;--i){
            if(!set.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
}
