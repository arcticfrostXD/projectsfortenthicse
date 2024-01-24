import java.util.*;
public class perfectsqrt
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [10];
        
        for(int i = 0; i<10; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            if(Math.sqrt(arr[i]) == Math.round(Math.sqrt(arr[i])))
            {
                System.out.println(arr[i]);
            }
        }
    }
}