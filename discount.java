
import java.util.*; //importing util package
class discount{ //creating class
     String name; //predefined variables
     long mobno;
     double cost;
     double dis;
     double amount;
    public discount(){ //constructor
        name = "";
        mobno = 0l;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }
    public void input(){ //costumer details
       Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Customer name: ");
        name = sc.nextLine();
        System.out.print("Please enter Mobile Number: ");
        mobno = sc.nextLong();
        System.out.print("Please enter Cost: ");
        cost = sc.nextDouble();
    }
    public void calculate(){ //discount calculation
        if(cost <= 10000)
            dis = 5.0/100.0 *cost;
        else if(cost <= 20000)
            dis = 10.0/100.0*cost;
        else if(cost <= 35000)
            dis = 15.0/100.0 *cost;
        else
        dis = 20.0 / 100.0 * cost;
        amount = cost - dis;
    }
    public void display(){ //displays details
        System.out.println("Customer name is: " + name);
        System.out.println("Mobile Number is: " + mobno);
        System.out.println("Total Amount is: " + amount);
    }
    public static void main(String args[]){ //main class
        discount obj = new discount();
        obj.input();
        obj.calculate();
        obj.display();
    }
}