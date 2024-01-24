import java.util.*;
public class selectionsort
{
    public static void main(String Args[])
    {
        int t;
        int min;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0; i<10; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<10; i++)
        {
            min = i;
            for(int j = i+1; j<10; j++)
            {
                if(arr[min]<arr[j])
                {
                    min = j;
                }
                
            }
            t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
            
        }
        for(int i = 0; i<10; i++)
        {
            System.out.println(arr[i]);
        }
    }
}