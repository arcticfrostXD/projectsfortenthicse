import java.util.*;
public class sh
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path");
        String fp = sc.nextLine();
        int a = fp.lastIndexOf('\\');
        String path = fp.substring(0,a);
        int b = fp.indexOf(".");
        String file = fp.substring(a) ;
        String extension = fp.substring(b);
        String filename = fp.substring(a+1,b);
        System.out.println("Path\t\t\t\t" + "File Name\t" + "Extension");
        System.out.println(path+"\t\t" + filename+"\t\t" + extension);
        
    }
}