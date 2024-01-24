import java.util.*;
public class sumdda
{
    public static void main(String Args[])
    {
        int arr[][] = new int [4][4];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i,j;
        for(i = 0; i < 4; i++)
        {
            for( j = 0; j < 4; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for( i = 0; i < 4; i++)
        {
            for( j = 0; j < 4; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for( i=0 ; i<4 ; i++)
        {
            sum = 0;
            for ( j = 0; j<4; j++)
            {
                sum += arr[i][j];
            }
            
                System.out.println("Sum of row " +(i+1)+ " is :" +sum);
        }
        for( j=0 ; j<4 ; j++)
        {
            sum = 0;
            for ( i = 0; i<4; i++)
            {
                sum += arr[i][j];
            }
            
                System.out.println("Sum of column " +(j+1)+ " is :" +sum);

        }
    }
}