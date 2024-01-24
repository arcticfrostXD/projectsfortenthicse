import java.util.*; //importing util package
public class neonandpattern //creating class
{
    public static void main(String Args[]) //creating main method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Pattern and 2 to check if given number is neon number");
        int choice = sc.nextInt();
        switch(choice) //switch case
     {
         case 1: //pattern
    for (int i = 1; i <= 5; i++) //number of rows for first triangle 
     {
      
        for (int j = 5; j>=i; j--) //number of columns for first triangle
        { 
            
        System.out.print(j);
    
    }
    System.out.println();
    }
    for(int i=4;i>=1;i--) // number of rows for second triangle 
    {
     for(int j=5;j>=i;j--) //number of columns for second triangle 
     {
    System.out.print(j);
     }
    System.out.println();
     }
        break;
        case 2: //neon
            System.out.println("Enter number which will be checked");
            int n = sc.nextInt(); //storing user defined number 
             int sum = 0; //predefined variables 
        int sqr = n * n; ///storing square of user defined number
        while (sqr != 0)
        {
           int d = sqr % 10; //obtaining last digit of square 
            sum = sum + d; //sum of digits of square
            sqr = sqr / 10; //dividing square by 10
        }
        if (sum == n)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
        break;
        default:
            System.out.println("Wrong Choice!!");
     }
    }
}
