import java.util.*; //importing util package

public class quadraticequation //creating main class
{
    private float a; //predefined variables
    private float b;
    private float c;
    private float d;
    private float r1;
    private float r2;

    public quadraticequation(float x, float y, float z) //constructor
    {
        a = x;
        b = y;
        c = z;
        d = 0;
    }

    public void calculate() { //calculating roots for the equation
        d= (b * b) - (4 * a * c);
        if (d < 0)
            System.out.println("Roots not possible");
        else {
            r1 = (float)((-b + Math.sqrt(d)) / (2 * a));
            r2 = (float)((-b - Math.sqrt(d)) / (2 * a));
            System.out.println("the equation is: (" + a +")x^2 + (" + b + ")x + (" +c+ ")");
            System.out.println("the first root of this equation =" + r1);
            System.out.println("the second root of this equation =" + r2);
        }
    }
    
    public static void main(String args[]) { //main method
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        float x = in.nextFloat();
        System.out.print("Enter b: ");
        float y = in.nextFloat();
        System.out.print("Enter c: ");
        float z = in.nextFloat();
        quadraticequation obj = new quadraticequation(x,y,z);
        obj.calculate();
    }
}