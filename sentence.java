import java.util.*;
public class sentence
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a statement/sentence");
        String a = sc.nextLine();
        String b = a.toUpperCase();
        int p = a.indexOf(' ');
        String fw = (a.toLowerCase()).substring(0,p);
        int at = a.indexOf('@');
        int l = a.length();
        boolean c = false;
        for(int i = 0; i<l; i++)
        {
            if(Character.isLetter(a.charAt(i))==true)
            {
                  c = Character.isUpperCase(a.charAt(i));
                 break;
            }
        }
       
        System.out.println("(i) The statement in uppercase : " +b);
        System.out.println("(ii) The first word in lowercase : " +fw);
        System.out.println("(iii) The first index of '@' : " +at);
        System.out.println("(iv) Checking if the first character is uppercase : " +c);
    }
}
