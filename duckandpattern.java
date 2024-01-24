import java.util.*; //importing util package
public class duckandpattern //defining class
{
    public static void main(String Args[]) //creating main method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Pattern and 2 to check if given number is duck number");
        int choice = sc.nextInt();
        switch(choice) //switch statement 
     {
         case 1: //pattern
             int i,j,k,p=2;
         for(i=1;i<=5;i++) //outer loop - number of rows
         {
            for(j=1;j<=i;j++) // inner loop - number of columns 
            System.out.print(i); //printing the first half of pattern
            for(k=p;k<=5;k++) //printing the remaining numbers
            
           System.out.print(k);
        
            System.out.println();
            p=p+1;
        }
        break;
        case 2: //duck
            System.out.println("Enter number which will be checked");
            int n = sc.nextInt(); //storing user-defined number
           int cn = n; //creating a copy of the number
        int a = 0; //predefined variable
        while (cn!=0) { //while loop
            int dig = cn%10; //obtaining last digit
            if (dig == 0) { //check if the digit is equal to 0
                a++;
            }
            cn /= 10; //dividing number by 10
        }
        if (a>0)
        {
            System.out.println("duck number");
        }
        else
        {
            System.out.println("not duck number");
        }
        break;
        default:
            System.out.println("Wrong Choice!!");
     }
    }
}
