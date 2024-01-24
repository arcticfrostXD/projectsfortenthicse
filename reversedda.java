import java.util.*;
public class reversedda
{
    public static void main(String Args[])
    {
        int arr[][] = new int [4][4];
        System.out.println("ENTER 4*4 ARRAY ELEMENTS");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<4; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("original array");
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<4; j++)
            {
                System.out.println(arr[i][j]);
            }
        }
        System.out.println("new array");
        for(int i = 0; i<4; i++)
        {
            for( int j = 0; j < 4; j++)
            {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}