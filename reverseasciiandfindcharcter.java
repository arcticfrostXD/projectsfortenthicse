import java.util.*; //importing util package 
public class reverseasciiandfindcharcter //creating class 
{
   public static void main(String Args[]) //main method
   {

       Scanner in = new Scanner(System.in);
       System.out.print("Enter a letter: ");
       char l = in.next().charAt(0); //storing character 
       
       int a = (int)l; //calculating ASCII code
       System.out.println("ASCII Code = " + a); 
       
       int r = 0;
       while (a > 0) {
           int digit = a % 10; //obtaining last digit 
           r = r * 10 + digit; //storing reversed ASCII code
           a /= 10;
       }
       
       System.out.println("Reversed Code = " + r);
       System.out.println("Equivalent character = " + (char)r); //printing character which has the same ASCII code as "r"
   
}
}
