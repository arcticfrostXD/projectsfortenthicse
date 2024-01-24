import java.util.*; //importing util package
public class minormaxcharacteredition//creating class 
{
   public static void main(String args[]) { // main method
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first character: "); //storing first character 
        char ch1 = in.next().charAt(0);
        System.out.print("Enter second character: ");// storing second character
        char ch2 = in.next().charAt(0);
        
        int d = (int)ch1 - (int)ch2; //storing difference between ASCII codes of the two characters
         //checking which character is smaller
        if (d > 0) 
            System.out.println("Second character is smaller");
        else if (d < 0)
            System.out.println("First character is smaller");
        else
            System.out.println("Both the characters are same");
    }
}
