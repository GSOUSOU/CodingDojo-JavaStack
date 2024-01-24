package week1.DAY1.AlfredBot;
import java.util.Date;
import java.text.SimpleDateFormat; 
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello %s, %s",name,".Lovely to see you. ");
    }
    
    public String dateAnnouncement() {
        // 	"It is currently Wed Aug 11 16:34:59 PDT 2022."
        Date date = new Date();
        return "It is currently " + date;    
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf("Alexis")!=-1){
            return ("Right away, sir. She certainly isn't sophisticated enough for that");
        }else if(conversation.indexOf("Alfred")!=-1){
            return("At your service. As you wish, naturally.");
        }else
        return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method,
    public String guestGreeting(String name, String dayPeriod) {
        return (dayPeriod+","+name+" .Lovely to see you. ");
    }
    public String guestGreeting() {
        Date date = new Date();
        SimpleDateFormat dayperiod = new SimpleDateFormat("dd/MM/yy :: HH:mm:ss"); 
        return ("Today Date & Time at Now :"+dayperiod.format(date));
    }


    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

