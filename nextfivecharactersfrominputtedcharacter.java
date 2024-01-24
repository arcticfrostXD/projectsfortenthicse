import java.util.*; //importing util package
public class nextfivecharactersfrominputtedcharacter//defining class 
{
    public static void main(String args[]) { //defining main method
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter a character: ");
        char ch = in.next().charAt(0); //storing character 
        
        System.out.println("Next 5 characters from "   + ch + " are:");
            
        for (int i = 1; i <= 5; i++) {
            System.out.println(++ch); //printing the characters following ch 
        }
    }
}
