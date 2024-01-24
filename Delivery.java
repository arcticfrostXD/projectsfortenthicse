import java.util.*;
public class Delivery

{
    double w;
    char dt;
    int price;
    Delivery( double we,char dety)
    {
        w = we;
        dt = dety;
    }
    public void pricing()
    {
        
        if(w<100)
        {
            if (dt=='o'||dt=='O')
            {
                price = 80;
            }
            else if(dt=='e'||dt=='E')
            {
                price = 100;
            }
        }
        else if(101<w&&w<=500)
        {
            if (dt=='o'||dt=='O')
            {
                price =150;
            }
            else if(dt=='e'||dt=='E')
            {
                price = 200;
            }
        }
        else if(501<w&&w<=1000)
        {
            if (dt=='o'||dt=='O')
            {
                price = 210;
            }
            else if(dt=='e'||dt=='E')
            {
                price = 250;
            }
        }
        else if(w>1000)
        {
            if (dt=='o'||dt=='O')
            {
                price = 250;
            }
            else if(dt=='e'||dt=='E')
            {
                price = 300;
            }
        }
        System.out.println("the price is : " +price);
        
    }
    public static void main(String Args[])
    {
        System.out.println("enter the weight of parcel and mode of booking (ordinary or express)");
        Scanner sc = new Scanner(System.in);
        double mass = sc.nextDouble();
        char deltyp = sc.next().charAt(0);
        Delivery ob = new Delivery(mass,deltyp);
        ob.pricing();
    
    }
}
