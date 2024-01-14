import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		ArrayList<String> randompasswords = generator.getNewPasswordSet(4);
		        //..
		// Write your other test cases here.
		//..
		System.out.println(randomRolls);
        System.out.println(generator.getRandomLetter());
        System.out.println(generator.generatePassword());
		System.out.println(randompasswords);
		
    	
	}
}
