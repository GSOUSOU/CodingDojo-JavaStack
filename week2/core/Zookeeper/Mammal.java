public class Mammal {
    protected int energy=100;
public Mammal(int energy)  {
    this.energy=energy;
 }

    public int displayEnergy(){
        System.out.println("the energy level ="+this.energy);
       return this.energy; 
    }
    
}
