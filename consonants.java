import java.util.*;
public class consonants
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String a = sc.nextLine().toUpperCase();
        int p = a.length();
        
        for(int i = 0; i<p; i++)
        {
            for(int j = 0; j<=4; j++)
            if(a.charAt(i) != "AEIOU".charAt(j))
            {
                System.out.println(a.charAt(i));
            }
        }
        
        
    }
}