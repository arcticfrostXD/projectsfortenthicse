import java.util.*;
public class searchingname
{
    public static void main(String Args[])
    {
        String arr[] = new String[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<10; i++)
        {
            arr[i] = sc.nextLine().toUpperCase();
        }
        System.out.println("Enter name to be searched");
        String search = sc.nextLine().toUpperCase();
        int c = 0; int k = 0;
        System.out.println(search);
        
        for(int i = 0; i<10; i++)
        {
             if(search.equals(arr[i]))
            {
                k++;
                System.out.println("index of name : " +i);
                break;
            }
        }
        for(int i = 0; i<10; i++)
        {
        
            if(arr[i].substring(0,3).equals("SRI"))
            {     
                c++;
            } 
        
        }
        if(k==0)
        {
            System.out.println("no such name in array");
        }
        System.out.println("Number of names starting with SRI : " +c);
    }  
}