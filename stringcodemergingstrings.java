import java.util.Scanner; //importing util package

public class stringcodemergingstrings//creating class
{
    public static void main(String args[]) { //creating main method
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String s1 = in.nextLine(); //storing first string
        System.out.print("Enter second String: ");
        String s2 = in.nextLine(); //storing second string
        String newStr = ""; //predefining string
        int len = s1.length();//calculating length of first string
        int leng = s2.length();//calculating length of second string
        if (len == leng){ //checking if both lengths are same for proper functioning of code
        
        for (int i = 0; i < len; i++) { //merging strings according to question
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            newStr = newStr + ch1 + ch2; 
        }
        
        System.out.println(newStr); //printing merged strings
    }
    else
    {
        System.out.println("length of both strings should be same"); 
    }
    
}
}