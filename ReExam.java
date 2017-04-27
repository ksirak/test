
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 1004 2 1008 3 1003 1 1001 2 1006 2 1008 1 1008 3 1008 3 1003 3 1003 3 1001 3 1008 1 1007 2 1002 3 1003 1 1007 2 1004 1 1003 3 1006 3 1003 3 -5
 8895 1 8896 3 8898 3 8893 2 8894 3 8892 3 8897 1 8888 2 8889 2 8895 2 8895 3 8892 1 8890 1 8891 1 8898 3 8889 3 8893 2 8895 2 8898 2 8890 3 
 8891 1 8890 3 8890 3 8892 2 8895 1 8890 3 8896 3 8895 1 8894 1 8893 2 -1
  @author sirak
 */
public class ReExam {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
        int num1=0, num2=0, num3=0;
        while(true){
            int id = keyboard.nextInt();
            if(id<0){
                break;
            }
            int number = keyboard.nextInt();
            if(map.get(id)==null){
                map.put(id,number);
                if(number==1){
                    num1++;
                }else if(number==2){
                    num2++;
                }else if(number==3){
                    num3++;
                }
            }
        }
        System.out.println("1 has "+num1+" votes\n2 has "+num2+" votes\n3 has "+num3+" votes");
        if(num1>=num2&&num1>=num3){
            System.out.println("1 win");
        }else if(num2>num1 && num2>=num3){
            System.out.println("2 win");
        }else if(num3>num1 && num3>num2){
            System.out.println("3 win");
        }
    }
}
