import java.util.*; //importing util package
public class armstrongandpattern //defining class
{
    public static void main(String Args[]) //creating main method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Pattern and 2 to check if given number is Armstrong number");
        int choice = sc.nextInt();
        switch(choice) //switch
     {
         case 1: //pattern
             for (int i = 1; i<=5; i++) //outer loop for pattern - rows
        {
            for (int j = 1; j<=i; j++) //inner loop for pattern - columns
            {
                System.out.print(j); //printing the number
                
            }
            System.out.println();
        }
        break;
        case 2: //armstrong 
            System.out.println("Enter number which will be checked"); 
            int n = sc.nextInt(); //storing number to be checked
            int cn = n; //storing number in another variable
        int count = 0; //predefined variables 
        int dig = 0;
        do //do while loop
        {
          int digit = cn % 10; //obtaining last digit 
           dig = dig + (int)Math.pow(digit,3); //adding cube of the digit to sum 
          cn/=10; //dividing number by 10

        }while(cn!=0);
        if (dig==n)
        {
            System.out.println("Armstrong number");
        }
       else
        {
            System.out.println("Not Armstrong number");
        }
        break;
        default:
            System.out.println("Wrong Choice!!");
     }
    }
}