import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author sirak
 */
public class Quiz3Bidding {
    HashMap<Integer,Auction > auctionList = new HashMap<Integer, Auction>();
    Scanner keyboard = new Scanner(System.in);
    private class Auction{
        int id;
        String name;
        String owner;
        int price;
        String bidder;
        
        public void setId(int input){
            id =input;
        }
        public int getId(){
            return id;
        }
        public void setName(String input){
            name =input;
        }
        public String getName(){
            return name;
        }
        public void setOwner(String input){
            owner = input;
        }
        public String getOwner(){
            return owner;
        }
        public void setPrice(int bid){
            price = bid;
        }
        public int getPrice(){
            return price;
        }
        public void setBidder(String bidderName){
            bidder = bidderName;
        }
        public String getBidder(){
            return bidder;
        }
        
    }
    public Quiz3Bidding(){
       
    }
    public static void main(String[] args) {
        Quiz3Bidding q3 = new Quiz3Bidding();
        String command;
                   
        while(true){   
            command = q3.keyboard.next();
            switch(command){
                case "new":
                    q3.newAuction();
                    break;
                case "view":
                    q3.viewAuction();
                    break;
                case "viewall":
                    q3.viewAllAuctions();
                    break;
                case "bid":
                    q3.bid();
                    break;              
                case "delete":
                    q3.delete();
                    break;
                case "exit":
                    System.exit(0);
                    break;
            }     
        }// end while
    }// end main
    public void newAuction(){
        int id = keyboard.nextInt();
        String name = keyboard.next();
        String owner = keyboard.next();
        int price = keyboard.nextInt();
        Auction a = new Auction();
        a.setId(id);
        a.setName(name);
        a.setOwner(owner);
        a.setPrice(price);
        auctionList.put(id,a);
    }
    public void viewAuction(){
        int id = keyboard.nextInt();
        Auction a = auctionList.get(id);
        System.out.print("view "+a.getId()+" ");
        System.out.print(a.getName()+" ");
        System.out.print(a.getPrice()+" ");
        System.out.println(a.getBidder());
    }
    public void viewAllAuctions(){
        Iterator<Integer> it = auctionList.keySet().iterator();
        System.out.println("viewall " + auctionList.size() +" items");
        while(it.hasNext()){
            int key = it.next();
            Auction a = auctionList.get(key);
           
            System.out.print(a.getId()+" ");
            System.out.print(a.getName()+" ");
            System.out.print(a.getPrice()+" ");
            System.out.println(a.getBidder());
            
        }
        System.out.println("==========");
    }
    public void bid(){
        int id = keyboard.nextInt();
        String bidderName = keyboard.next();
        int price = keyboard.nextInt();
        Auction a = auctionList.get(id);
        if(price > a.getPrice()){
        a.setPrice(price);
        a.setBidder(bidderName);
        }
    }
    public void delete(){
        int id = keyboard.nextInt();
        auctionList.remove(id);
    }
    
}
