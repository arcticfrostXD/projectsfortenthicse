import java.util.*;
public class reversestring
{
    public static void main()
    {
        System.out.println("ENTER STRING");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        for(int i = st.length()-1; i>= 0; i--)
        {
            System.out.print(st.charAt(i));
        }
    }
}