import java.util.*;
public class reversearray
{
    public static void main(String Args[])
    {
        int i; 
        int arr[] = new int[10];
        System.out.println("ENTER ARRAY");
        Scanner sc = new Scanner(System.in);
        for(i = 0; i<10; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i=9; i>=0; i--)
        {
            System.out.println(arr[i]);
        }
    }
}