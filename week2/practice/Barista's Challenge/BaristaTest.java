

public class BaristaTest {
    
    public static void main(String[] args) {
        Order order1= new Order();
        Order order2= new Order();

        Order order3= new Order("Cindhuri");
        Order order4= new Order("Jimmy");
        Order order5= new Order("Noah");

        Item item1= new Item("mocha",3.5);
        Item item2= new Item( "drip coffee", 1.50);
        Item item3= new Item("capuccino",3.50);
        Item item4 =new Item("latte",4.0);
        
    //Add at least 2 items to each of the orders using the addItem method.
        order3.addItem(item2);
        order3.addItem(item3);

        order4.addItem(item2);
        order4.addItem(item2);

        order5.addItem(item1);
        order5.addItem(item4);

       //Test your getStatusMessage method by setting 
       //some orders to ready and printing the messages for each order.
        order4.setIsReady(true);
        String order4Satut= order4.getStatusMessage();
        System.out.println("Order4 :"+order4Satut);


        order3.setIsReady(true);
        String order3Satut= order3.getStatusMessage();
        System.out.println("Order3 :"+order3Satut);
        //Test the total by printing the return value
        System.out.println("order3's total :" +order3.getOrderTotal());
    //call the display method on all of your orders.
        order3.display();
        order4.display();
        order5.display();
        

   
}
}
