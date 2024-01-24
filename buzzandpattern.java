import java.util.*; //importing util package
public class buzzandpattern //defining class
{
    public static void main(String Args[]) //main method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Pattern and 2 to check if given number is buzz number");
        int choice = sc.nextInt();
        switch(choice) //switch case
     {
         case 1: //pattern
             for(int i = 9; i>=1; i=i-2) //outer loop - rows
        {
            for(int j = i; j>=1; j=j-2) //inner loop - columns
            {
                System.out.print(j + " "); 
            }
            System.out.println();
        }
        break;
        case 2: //buzz
            System.out.println("Enter number which will be checked");
            int n = sc.nextInt(); //storing user-defined variables 
             int cn = n; //creating copy of number
        int count = 0; //predefined variable
        if (n%7==0) //checking if number is a multiple of 7
        {
            System.out.println("buzz number");
        }
        else {
            
        while(cn!=0)
        {
          int digit = cn%10; //obtaining last digit
          {
              if (digit == 7) //checking if digit is = 7
              {
                  count++;
                  break;
              }
          }
          cn/=10; //divding number by 10
        }
         if (count > 0)
        {
        System.out.println("buzz number");
        }
        else 
       {
        System.out.println("not a buzz number");
       }
       }
        break;
        default:
            System.out.println("Wrong Choice!!");
     }
    }
}
