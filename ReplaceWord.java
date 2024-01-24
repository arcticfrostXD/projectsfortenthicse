import java.util.Scanner;
public class ReplaceWord 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Enter the word to be replaced: ");
        String wordToReplace = scanner.nextLine();
        System.out.println("Enter the word to replace with: ");
        String wordToReplaceWith = scanner.nextLine();
        String newSentence = sentence.replace(wordToReplace, wordToReplaceWith);
        System.out.println("The new sentence is: " + newSentence);
    }
}