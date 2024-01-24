import java.util.*;
public class bubblesort
{
    public static void main(String Args[])
    {
        int t;
        System.out.println("enter array");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        for(int i = 0; i<20; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<20; i++)
        {
            for(int j = 0; j<(19-i); j++ )
            {
                if(arr[j]<arr[j+1])
                {
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
            
        }
        for(int i = 0; i<20; i++)
            {
                System.out.println(arr[i]);
            }
        
    }
}