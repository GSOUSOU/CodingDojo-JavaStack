import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {


    // 
    public int getStreakGoal(int numWeeks){
        int sum=0;
        for(int i=1; i<numWeeks+1; i++){
          sum+=i;        
       }
       return sum;
    }
    // 
    public double getOrderTotal(double[] prix){
        double total=0;
        for (int i = 0; i < prix.length; i++){
            total+=prix[i];
        }
        return total;
    }
//
    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++){
            System.out.println(i+" "+menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> clients){
        System.out.println("Veuillez entrer votre nom :"); 
        String username = System.console().readLine();
        System.out.println(String.format("Bonjour %s, %s",username,"!"));
        System.out.println("Il y a "  +clients.size() + " personnes devant vous");
        clients.add(username);
        System.out.println(clients);
    }
    /*
    * Bonus de ninja ! 
    */
    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product+"\n");
        for (int i =1; i <maxQuantity+1; i++){
            if (i==1) {
                System.out.format("%d - $ %.2f\n",i, price*i);
            }else if(i==2){
                System.out.format("%d - $ %.2f\n",i, price*i-0.5);
            }else{
                System.out.format("%d - $ %.2f\n",i, price*i-(0.5*(i-1)));
            }
          
        }
           
    }
     //Ninja Bonus 3: Overload the displayMenu method.
     public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
       if(menuItems.size()!=prices.size()){
        return false;
       }else{
        for (int i = 0; i < menuItems.size(); i++){
            // System.out.format("%d - $ %.2f\n",i, price*i);
            System.out.println(i+" "+menuItems.get(i)+" -- $"+prices.get(i));
        } 
        return true;
       }
     }
                  

}
    

