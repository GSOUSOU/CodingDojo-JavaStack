public class Bat extends Mammal{

	public Bat(int energy) {
		super(energy);
	
		
	}
	public void fly() {
		System.out.println("the bat is airborne");
		this.energy-=50;
	}
	public void eatHumans(){
		System.out.println("the bat is SATISFIED");
		this.energy+=25;
	}
	public void attackTown(){
		System.out.println("the bat attacks a town");
		this.energy-=100;
	}
	
}
