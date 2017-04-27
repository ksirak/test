import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Student{
       Student(){
       } 
       Student(int id,String name,int score){
         this.id = id;
         this.name = name;
         this.score = score;
        }
        int id;
        String name;
        int score;
        String grade;
        //grading by score method
        public void setGrade(){
            if(score>=80){
                grade = "A";
            }else if(score>=75){
                grade = "B+";
            }else if(score>=70){
                grade = "B";            
            }else if(score>=65){
                grade = "C+";
            }else if(score>=60){
                grade = "C";
            }else if(score>=55){
                grade = "D+";
            }else if(score>=50){
                grade = "D";
            }else{
                grade = "F";
            }
        }
    }

public class PracticeCollection {
    Scanner keyboard = new Scanner(System.in);
    Map<Integer,Student> map = new TreeMap<Integer,Student>();
   
    public static void main(String[] args){
        PracticeCollection p = new PracticeCollection();
        
            Student std = new Student();
                    std.id = 007;
                    std.name = "sirak";
                    std.score = 99;
                    std.setGrade();
        
                    p.map.put(007, std);
                    
            //get input and start prcessing 
            p.getInput();
            
    }
    void getInput(){
        while(true){
            String input = keyboard.next();  
            switch(input){
                case "add": 
                           addElement();
                           break;
                case "remove": 
                           removeElement();
                           break;
                case "show":
                           show();
                           break;
                case "showAll":
                           showAll();
                           break;
                case "exit":
                           System.exit(0);
            }
                   
           
        }
    }
    // add new element into treemap
    // you can use this method as an example how to deal 
    // with object in collection
    void addElement(){
                int id = keyboard.nextInt();
                String name = keyboard.next();
                int score = keyboard.nextInt();
                Student std = new Student(id,name,score);
                std.setGrade();
                map.put(id,std);
    }
    //remove element from treemap by id 
    void removeElement(){
        map.remove(keyboard.nextInt());
    }
    //show grade of specific id in form of name = grade
    void show(){
        Student std = map.get(keyboard.nextInt());
        System.out.println(std.name +" grade = " + std.grade);
    }
    // show all elements in form id idnumber name grade
    void showAll(){
            for (Map.Entry entry : map.entrySet()) {
                Student std = (Student)entry.getValue();
	        System.out.println("id " + entry.getKey() + " " 
                            + std.name + " " + std.grade);
	                    
	        }
    }
    
}

