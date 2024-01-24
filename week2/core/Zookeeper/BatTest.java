
public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bat bat = new Bat(300);
		System.out.println(bat.energy);
		/*
		 * attacking three towns, eating two humans, 
		 * flying twice, and then displaying its energy. Use the display energy from the superclass!
		 */
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        
        bat.eatHumans();
        bat.eatHumans();
        
        bat.fly();
        bat.fly();
         bat.displayEnergy();
	}

}
