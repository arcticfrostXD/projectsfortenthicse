
import java.util.*; //importing util package

public class discount2 //defining class
{
    private String name; //predefined variables
    private int price;
    private double dis;
    private double amt;

    public discount2(String s, int p) // constructor
    {
        name = s;
        price = p;
    }

    public void compute() { //calculating discount
        if (price <= 25000)
            dis = price * 0.05;
        else if (price <= 50000)
            dis = price * 0.075;
        else if (price <= 100000)
            dis = price * 0.1;
        else
            dis = price * 0.15;
            
        amt = price - dis;
    }
    
    public void display() { //displaying output
        System.out.println("Name: " + name);
        System.out.println("Discount: " + dis);
        System.out.println("Amount to be paid: " + amt);
    }
    
    public static void main(String args[]) { //main method
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String str = in.nextLine();
        System.out.print("Enter Price: ");
        int p = in.nextInt();
        
        discount2 obj = new discount2(str,p);
        obj.compute();
        obj.display();
    }
}