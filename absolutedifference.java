import java.util.*;
public class absolutedifference
{
    public static void main(String Args[])
    {
        System.out.println("ENTER A STRING");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0; i<s.length()-1; i++)
        {
            System.out.println("The difference between " +s.charAt(i)+ " and " + s.charAt(i+1) + " is " +Math.abs(s.charAt(i)-s.charAt(i+1)));
        }
    }
}