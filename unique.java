import java.util.*;
public class unique
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String a = sc.nextLine();
        int p = a.length();
        int c = 0;
        for(int i = 0; i<p; i++)
        {
            for (int j = p-1; j>i+1; j--)
            {   
                
                if(a.charAt(j) == a.charAt(i))
                {
                    c++;
                }
                
            }
        }
        if(c==0)
        {
            System.out.println("IT IS A UNIQUE STRING");
        }
        else 
        {
            System.out.println("IT IS NOT A UNIQUE STRING");
        }
        
    }
}