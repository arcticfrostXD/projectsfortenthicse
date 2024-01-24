import java.util.*;
public class convertingatostar
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = "";
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == 'a')
            {
                s2 = s.replace(s.charAt(i),'*');
            }
        }
        System.out.println(s2);
    }
}