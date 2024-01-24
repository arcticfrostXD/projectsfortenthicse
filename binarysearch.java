import java.util.*;
public class binarysearch
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int m[] = new int[20];
        int t;
        for(int i = 0; i < 10; i++)
        {
            m[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++)
        {
            for ( int j = 0; j < 9-i; j++)
            {
                if(m[j]>m[j+1])
                {
                    t = m[j];
                    m[j] = m[j+1];
                    m[j+1] = m[j];
                }
            }
        }
        System.out.println("Enter number to be searched");
        int a = sc.nextInt();
        int k = 0; int p = 0; int lb = 0; int ub = m.length - 1 ;
        while(lb<=ub)
        {
            p = (lb+ub)/2;
            if(m[p] < a)
            {
                lb = p+1;
            }
            if (m[p]>a)
            {
                ub = p-1;
            }
            if(m[p]==a)
            {
                k++;
                System.out.println("Search Successful");
                break;
            }
        }
        if(k==0)
        {
            System.out.println("Search Unsuccessful");
        }
    }
}