import java.util.*; //importing util package
public class nivenandpattern //creating class
{
    public static void main(String Args[]) //main method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Pattern and 2 to check if given number is niven number");
        int choice = sc.nextInt();
        switch(choice) //switch statement
     {
         case 1: //pattern
             int r = 1; //predefined variable
        for(int i = 1; i<=5; i++) //number of rows
        {
            for(int j = 1; j<=i; j++) //number of columns
            {
                System.out.print(r + " "); 
                r++;
            }
            System.out.println();
        }
        break;
        case 2: //niven
            System.out.println("Enter number which will be checked");
            int n = sc.nextInt(); //storing user defined variable
            int cn = n; //creating copy of that number
        int d = 0; //predefined variables
        int s = 0;
         while (cn > 0) //while loop
        {
            d = cn % 10; //obtaining last digit
            s = s + d; //adding all digits
            cn = cn / 10; //dividing number by 10
        }
        if (n % s == 0)
        {
            System.out.println("Niven Number");
        }
        else
        {
            System.out.println("Not Niven Number");
        }
        break;
        default:
            System.out.println("Wrong Choice!!");
     }
    }
}
