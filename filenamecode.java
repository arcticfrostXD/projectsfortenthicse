import java.util.*;
class filenamecode
{
 public static void main(String[] args)
 {
System.out.println("ENTER FILE NAME");
 Scanner sc = new Scanner(System.in);
 String sen=sc.nextLine();
 System.out.println(sen.toUpperCase());
 System.out.println((sen.substring(0,sen.indexOf(' ')).toLowerCase()));
 System.out.println(sen.indexOf('@'));
 System.out.println(Character.isUpperCase(sen.charAt(0)));
}
}
