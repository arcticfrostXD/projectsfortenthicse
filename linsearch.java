import java.util.*;
public class linsearch
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [10];
        int k = 0;
        for(int i = 0; i<10; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("ENTER NUMBER TO BE SEARCHED");
        int a = sc.nextInt();
        for(int i = 0; i<10; i++)
        {
            if(arr[i] == a)
            {
                System.out.println("NUMBER IS PRESENT!");
                k++;
                break;
                
            }
        }
        if(k==0)
        {
            System.out.println("NUMBER IS NOT PRESENT");
        }
    }
}