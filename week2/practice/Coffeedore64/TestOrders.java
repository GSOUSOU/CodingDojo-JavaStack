
public class TestOrders {
    public static void main(String[] args) {
        CoffeeKiosk coff= new CoffeeKiosk();
         // Menu items
        coff.addMenuItem("banana",2.00);
        coff.addMenuItem("coffee",1.50);
        coff.addMenuItem("latte",4.50 );
        coff.addMenuItem("capuccino",3.00 );
        coff.addMenuItem("muffin",4.00);
        coff.newOrder();
    
       
    }    
}

