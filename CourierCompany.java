import java.util.*;
public class CourierCompany
{
    double weight;
    char booking;
    public CourierCompany(double w, char b)
    {
        weight = w;
        booking = b;
        
    }
    public void Calculate(double w, char b)
    {
            if(b== 'o' || b== 'O')
        {
            if (w<100)
            {
                System.out.println("The price is 80$");
            }
            else if(w>100&&w<=500)
            {
                System.out.println("The price is 150$");
            }
            else if(w>500&&w<= 1000)
            {
                System.out.println("The price is 210$");
            }
            else if (w>1000)
            {
                System.out.println("The price is 250$");
            }
        }
           else if (b == 'd' || b == 'D')
        {
            if (w<100)
            {
                System.out.println("The price is 100$");
            }
            else if(w>100&&w<=500)
            {
                System.out.println("The price is 200$");
            }
            else if(w>500&&w<= 1000)
            {
                System.out.println("The price is 250$");
            }
            else if (w>1000)
            {
                System.out.println("The price is 300$");
            }
        }
           else
            {
               System.out.println("ENTER APPROPRIATE CHOICE :("); 
            }
               
       }
       public static void main(String Args[])
       {
           System.out.println("ENTER WEIGHT OF THE PARCEL ");
           System.out.println("ENTER TYPE OF BOOKING (O for ORDINARY, E for EXPRESS)");
           Scanner sc = new Scanner(System.in);
           double wei = sc.nextDouble();
           char book = sc.next().charAt(0);
           CourierCompany ob = new CourierCompany(wei,book);
           ob.Calculate(wei,book);
       }
}