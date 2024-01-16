import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        name="Guest";
        items = new ArrayList<>();
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name=name;
        this.items = new ArrayList<>(); 
    }
    // ORDER METHODS
    
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    
    // GETTERS & SETTERS
     // getter
     public String getName() {
        return name;
    }
    
    // setter
    public void setName(String name) {
        this.name=name;
    }
     // getter
     public boolean getIsReady() {
        return ready;
    }
    
    // setter
    public void setIsReady(Boolean ready) {
        this.ready=ready;
    }
    // Getter pour l'ArrayList
    public ArrayList<Item> getItems() {
        return items;
    }

    // Setter pour l'ArrayList
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    //
    public void addItem(Item item){
       items.add(item);

    }
    //getStatusMessage
    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready";
        }else{
            return "Thank you for waiting. Your order will be ready soon.";
        }

    }
    public double getOrderTotal(){
        double total=0;
        for(Item item : items){
            total+=item.getPrice();
          }
          return total;
    }
    public void display(){

System.out.println("Customer Name:" +this.name);

for(Item item : items){
            System.out.println(item.getName() +" "+item.getPrice()); 
          }
          System.out.println("Total:$" +this.getOrderTotal());

    }
}


