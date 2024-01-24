import java.util.*;
public class firstorlastletter
{
    static void main()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("ENTER STRING");
       System.out.println("ENTER 1 FOR OBTAINING FIRST CHARACTER, AND 2 FOR LAST");
       String s = sc.nextLine().trim();
       int p = s.length();
       int choice = sc.nextInt();
       switch(choice)
       {
           case 1:
               System.out.println(s.charAt(0));
               break;
           case 2:
               System.out.println(s.charAt(p-1));
               break;
            default:
                System.out.println("error!");
       }
    }
}