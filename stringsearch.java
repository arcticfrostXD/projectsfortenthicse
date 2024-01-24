import java.util.Scanner; //importing util package

public class stringsearch //creating class
{
    public static void main(String args[]) { //creating main method
        
        String wonders[] = {"CHICHEN ITZA", "CHRIST THE REDEEMER", "TAJMAHAL", "GREAT WALL OF CHINA", "MACHU PICCHU", "PETRA", "COLOSSEUM"}; //storing wonders
        
        String locations[] = {"MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN", "ITALY"}; //storing countries at the same index as there respective wonder of the world
        Scanner in = new Scanner(System.in);
        System.out.print("Enter country to search if it has a wonder of the world: "); 
        String c = in.nextLine(); //storing country which user entered
        c = c.toUpperCase(); //making string to uppercase so that program excepts different case inputs
        int i;
        
        for (i = 0; i < locations.length; i++) {  //searching if country and wonder exist
            if (locations[i].equals(c)) {
                System.out.println(locations[i] + " - " + wonders[i]); //prints the country along with the wonder 
                break;
            }
        }
        
        if (i == locations.length)
            System.out.println("Sorry Not Found!"); //prints "sorry not found" if country does not have wonder
    }
}