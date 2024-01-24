import java.util.Scanner; //importing util package

public class stringcodechangingvoweltoitssuccessor //creating class
{
    public static void main(String args[]) { //creating main method
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = in.nextLine(); //store string
        str = str.toLowerCase(); //converting string to lower case
        String newStr = ""; //predefining variables 
        int len = str.length(); //storing length of user-defined string

        for (int i = 0; i < len; i++) { 
            char ch = str.charAt(i);

        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u') 
            {

                char nextChar = (char)(ch + 1); //replacing vowels with the letter following it

                newStr = newStr +  nextChar; //storing new value in variable "newStr" 
            }
            else {
                newStr = newStr + ch; //storing new value in variable "newStr" 
            }
        }

        System.out.println(newStr); //printing the new string
    }
}