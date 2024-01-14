import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleJava {
    Random randomno = new Random();
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomarray = new ArrayList<Integer>();// check next int value
     for(int i=0; i<10; i++){
        randomarray.add(randomno.nextInt(20)+1);
     }
     return randomarray;
    }
    public String getRandomLetter(){
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        String[] alpharray=new String[alphabet. length()];
        for(int i=0;i<alphabet. length();i++){
        alpharray[i]=String.valueOf(alphabet. charAt(i));
        }
        int randomindex = randomno.nextInt(25) + 1;
        //System.out.println(randomindex);
        //System.out.println(alpharray[randomindex]);
        return alpharray[randomindex];
    }
    public String generatePassword(){
        String password="";
        for(int i=0;i<8;i++){
            
            String lettrer=getRandomLetter();
           // System.out.println(i+lettrer);
            password=password+lettrer;
            }
        return password;
    }
    // 
    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordsarray= new ArrayList<String>();
        for(int i=0;i<length;i++){
            passwordsarray.add(generatePassword());

        }
        return passwordsarray;

    }
}
