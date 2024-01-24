public class Gorilla extends Mammal {
	
public Gorilla(int energy) {
		super(energy);
		  System.out.println("gorilla" +energy);
		 
	}

   public void   throwSomething(){
	   this.energy-=5;
    System.out.println("gorilla has thrown something" );

  }
 public void  eatBananas(){
   
     this.energy+=10;
     System.out.println("gorilla is satisfied");
 
  }
  
  public void climb(){
   
     this.energy-=10;
     System.out.println(" the gorilla has climbed a tree");
 
  }
}
