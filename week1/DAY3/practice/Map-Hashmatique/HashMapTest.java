import java.util.HashMap;
import java.util.Set;
public class HashMapTest {
    public static  void main(String [] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("L'Oiseau Et l'Enfant", "Comme un enfant aux yeux de lumière,Qui voit passer au loin les oiseaux" );
        trackList.put("On Ecrit Sur Les Murs", "On écrit sur les murs le nom de ceux qu'on aime,Des messages pour les jours à venir");
        trackList.put("Mama Africa feat", "C'est là-bas que j'aime aller,Son coeur ne connait pas de frontières");
        trackList.put("Santiano ", "C'est un fameux trois-mâts fin comme un oiseau,Hissez haut Santiano");
        System.out.println("\n-----Pull out one of the songs by its track title.!-----");
        System.out.println(trackList.get("Mama Africa feat"));
        // get the keys by using the keySet method
        Set<String> keys =  trackList.keySet();
        for(String key : keys) {
            System.out.println(key +" : "+trackList.get(key));
              
        }

    }
    
}
