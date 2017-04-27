import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Sirak
 */
public class Computer {
    
    class Goods{
        public Goods(){

        }
        private int id;
        private int type;
        private int price;
        private int stock;

        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id = id;
        }
        public int getType(){
            return type;
        }
        public void setType(int type){
            this.type = type;
        }
        public int getPrice(){
            return price;
        }
        public void setPrice(int price){
            this.price = price;
        }
        public int getStock(){
            return stock;
        }
        public void cutStock(){
            this.stock--;
        }
        public void setStock(int stock){
            this.stock = stock;
        }
    }
    HashMap<Integer,Goods> map = new HashMap<Integer,Goods>();
    Scanner key = new Scanner(System.in);
    public static void main(String[] args){
        Computer c = new Computer();
        int n = c.key.nextInt();
        for(int i=0; i<n;i++){
            c.newItem();
        }
        int k = c.key.nextInt();
        for(int i =0;i<k;i++){
            c.processStock();
        }

    }
    public void newItem(){
        Goods goods = new Goods();

        int id = key.nextInt();
        goods.setId(id);
        goods.setType(key.nextInt());
        goods.setPrice(key.nextInt());
        goods.setStock(key.nextInt());
        map.put(id, goods);

    }

    public void processStock(){
        int a = key.nextInt();
        int b = key.nextInt();
        int c = key.nextInt();

        //Goods g = map.get(a);
        if(map.get(a).getType()== map.get(b).getType() ||
           map.get(a).getType()== map.get(c).getType() ||
           map.get(b).getType()== map.get(c).getType()){
                System.out.println("invalid order");
        }else if(map.get(a).getStock() == 0  ||
                 map.get(b).getStock() == 0 ||
                 map.get(c).getStock()==0){
                System.out.println("out of stock");
        }else{
            int sum = map.get(a).getPrice()+map.get(b).getPrice()+map.get(c).getPrice();
            map.get(a).cutStock();
            map.get(b).cutStock();
            map.get(c).cutStock();
            System.out.println(sum);

        }

    }
}
