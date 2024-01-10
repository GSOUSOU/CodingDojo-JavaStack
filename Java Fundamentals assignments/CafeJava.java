public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables
        double mochaPrice = 3.5;
        double dripCoffeePrice = 4.5;
        int latteCoffeePrice = 5;
        int cappuccinoPrice=10;
    
        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1+" "+pendingMessage); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //

        //Noah order 
        if(isReadyOrder4){
             System.out.println(generalGreeting + customer4+" "+readyMessage +" and "+displayTotalMessage +cappuccinoPrice);
        }else {
            System.out.println(generalGreeting + customer4+" "+pendingMessage );
        }
     
        //Sam just ordered 2 lattes,this total
         System.out.println(generalGreeting + customer2+" "+displayTotalMessage+latteCoffeePrice*2 );
         //ternary operator instead of if statement to print the appropriate message
         System.out.println(isReadyOrder2? customer2 +readyMessage:pendingMessage);
         // Changing the isReady flag value from true to false and
         isReadyOrder2 =false;
         System.out.println(isReadyOrder2? readyMessage: "Sorry "+customer2 +pendingMessage);

         // jimmy order 
          System.out.println(generalGreeting + customer3+" "+displayTotalMessage+mochaPrice );
          // tne new calculated total 
        System.out.println(generalGreeting + customer3+" "+displayTotalMessage+(latteCoffeePrice-mochaPrice) );
 /**
  * changing the price values for each drink and isReady flags and testing the logic
  */
  System.out.println("after changing prices and flags");
        mochaPrice = 5.5;
        dripCoffeePrice = 2.5;
        latteCoffeePrice = 6;
        cappuccinoPrice=8;
  
        isReadyOrder1 = true;
        isReadyOrder2 = false;
        isReadyOrder3 = true;
        isReadyOrder4 = false;

        System.out.println(generalGreeting + customer1+" "+pendingMessage); 
        //Noah order 
        if(isReadyOrder4){
             System.out.println(generalGreeting + customer4+" "+readyMessage +" and "+displayTotalMessage +cappuccinoPrice);
        }else {
            System.out.println(generalGreeting + customer4+" "+pendingMessage );
        }
     
        //Sam just ordered 2 lattes,this total
         System.out.println(generalGreeting + customer2+" "+displayTotalMessage+latteCoffeePrice*2 );
         //ternary operator instead of if statement to print the appropriate message
         System.out.println(isReadyOrder2? customer2 +readyMessage:"Sorry "+customer2 +pendingMessage);
         // Changing the isReady flag value from true to false and
         isReadyOrder2 =true;
         System.out.println(isReadyOrder2? customer2 +readyMessage: "Sorry "+customer2 +pendingMessage);

         // jimmy order 
        System.out.println(generalGreeting + customer3+" "+displayTotalMessage+mochaPrice );
          // tne new calculated total 
        System.out.println(generalGreeting + customer3+" "+displayTotalMessage+(latteCoffeePrice-mochaPrice) );
    }
}

