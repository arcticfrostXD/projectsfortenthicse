import java.util.Scanner; //inputting util package 

public class stringcodepiglatin //creating class
{
    public static void main(String args[]) { //creating main method

        Scanner in = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = in.next(); //inputting string
        int len = word.length(); //extracting word length

        word=word.toUpperCase(); //changing string to uppercase
        String piglatin=""; int flag=0; //predefining variables 
        
        for(int i = 0; i < len; i++) //changing string to piglatin
        {
            char x = word.charAt(i);
            if(x=='A' || x=='E' || x=='I' || x=='O' || x=='U') //comparing character to vowel
            {
                piglatin=word.substring(i) + word.substring(0,i) + "AY"; //storing the world in piglatin
                flag=1;
                break;
            }
        }
        
        if(flag == 0) //if word does not contain ANY vowels
        {
            piglatin = word + "AY"; 
        }
        System.out.println(word + " in Piglatin format is " + piglatin); //printing the piglatin word 
    }
}