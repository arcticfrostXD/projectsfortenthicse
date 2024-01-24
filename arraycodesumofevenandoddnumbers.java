import java.util.*; //importing util package
public class arraycodesumofevenandoddnumbers//creating class
{
    public static void main(String Args[]) //creating main method
    {
        Scanner sc = new Scanner(System.in); //creating scanner 
        System.out.println("Enter no. of rows and columns"); //inputting number of rows and columns
        int i,j,se = 0,so = 0; //predefining variables
        int r = sc.nextInt(); //storing number of rows
        int c = sc.nextInt(); //storing number of columns
        int arr[][] = new int[r][c]; //predefining an array
        System.out.println("Enter array elements"); //storing array elements
        for( i = 0; i<r; i++)
        {
            for ( j = 0; j<c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for( i = 0; i<r; i++) 
        {
            for(j=0;j<c;j++)
            {
                if(arr[i][j] % 2 == 0) //sum of even elements
                {
                    se += arr[i][j]; 
                }
                else //sum of odd elements
                {
                    so += arr[i][j];
                }
            }
        }
        System.out.println("Sum of odd elements: " +so+ " Sum of even elements: " +se); //printing sum 
    }
}