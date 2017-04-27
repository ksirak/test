/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.*;
public class MidtermExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int count[] = new int[100000];
		
		
		
		for(;;){
			list.clear();
			
			
			int number = scan.nextInt();
			if(number>0){
				
				list.add(number);
				
			}else
				break;	
			
			
			for(int i=0;i<list.size();i++){
				for(int k =0 ;k<=list.get(i);k++){
					
					if(list.get(i)==k){
						count[k]++;
					}
					
					
				}
				
			}
		}
		
		/*for(int i=0;i<count.length;i++){
			if(count[i]>0){
			System.out.println(i+" "+count[i]+" ");
			}
		}*/
		
		
		///หาค่าmax
		int max=0;
		
		for(int i=0;i<count.length;i++){
			if(count[i]>max){
				max = count[i];
			}
		}
		
		System.out.print("max frequency ");
		for(int i=0;i<count.length;i++){
			if(count[i]==max){
				System.out.print(i+" ");
			}
		
		}
		System.out.println();
		
		
		///หาค่าทรื
		System.out.print("min frequency ");
		for(int i=0;i<count.length;i++){
			if(count[i]==1){
				System.out.print(i+" ");
			}
				
		}System.out.println();
		
		
		
		System.out.print("No frequency ");
		
		int MaxT=0;
		int MinT=1000;
		for(int i=0;i<count.length;i++){
			if(count[i]>0){
				if(i>MaxT){
					MaxT=i;
				}
				if(i<MinT){
					MinT=i;
				}
			}
			
		}
		/*System.out.println(MaxT+" "+MinT);*/
		
		
		
		for(int i=MinT;i<MaxT;i++){
			if(count[i]==0){
				System.out.print(i+" ");
			}
			
			
			
		}
		
		
		
		
		}
		

	}

/*5 8 8 9 4 3 3 9 8 9 7 2 2 5 -1*/
/*1 1 1 1 1 2 2 2 2 3 3 3 4 4 5 5 6 7 9 10 11 12 15 20 0*/
