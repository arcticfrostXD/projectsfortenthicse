import java.util.Scanner; //importing util package

public class stringcodedoublelettersequencecount //creating class 
{
    public static void main(String args[]) { //creating main method
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: "); 
        String s = in.nextLine(); //storing string
        String str = s.toUpperCase(); //changing string to uppercase
        int count = 0; //predefining variables
        int len = str.length(); //calculating length of inputted string
        
        for (int i = 0; i < len - 1; i++) //finding out repeating characters
        {
            if (str.charAt(i) == str.charAt(i + 1)) 
                count++; //;increasing count everytime two subsequent characters are same
        }
        
        System.out.println("Double Letter Sequence Count = " + count); //printing the number of times there were two same subsequent characters
        
    }
}