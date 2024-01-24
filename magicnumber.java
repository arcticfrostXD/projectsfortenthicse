import java.util.*;
public class magicnumber
{
    public static void main(String [] Args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("magic number");
        int a = sc.nextInt();
        int b = a;
        int dig;
        
        while(b>9)
        {
            int sum = 0;
            while (b!=0)
            {
            dig = b%10;
            sum += dig;
             b/=10;
            }
            b = sum;
        
         }
         if ( b == 1)
         {
             System.out.println("Magic Number");
         }
    }
}