import java.util.*;
public class seperatingevenodd
{
    public static void main(String[]Args)
    {
        int arr[] = new int[20];
        int even[] = new int[20] ;
        int odd[] = new int[20];
        Scanner sc = new Scanner(System.in);
        int j = 0;
        int k = 0;
        for(int i = 0; i<20; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<20; i++)
        {
            if(arr[i]%2==0)
            {
                even[j] = arr[i];
                j++;
            }
            else
            {
                odd[k] = arr[i];
                k++;
            }
         }
        
        System.out.println("EVEN ARRAY");
        for(int i=0; i<j; i++)
        {
            System.out.println(even[i]);
        }
        System.out.println("ODD ARRAY");
        for(int i=0; i<k; i++)
        {
            System.out.println(odd[i]);
        }
    }
}