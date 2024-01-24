import java.util.*;
class HappyWord
{
    static int sumDigit(int n)
    {
        int sum=0,digit;
        while(n>0)
        {
            digit=n%10;
            sum=sum+digit*digit;
            n=n/10;
        }
        return(sum);
    }
    public static void main(String arr[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Any String");
        String str=sc.nextLine();
        String pos="";
        int n;
        str=str.toUpperCase();
        for(int a=0;a<str.length();a++)
        {
            n=((int)str.charAt(a))-64; // Find the position value of each Character
            pos=pos+Integer.toString(n); // concatenate the position value by converting it in string
        }
        
        n=Integer.valueOf(pos); // Conver the value String to Integer
        int sum=HappyWord.sumDigit(n); 
        while(sum>9)
        {
            sum=HappyWord.sumDigit(sum);
        }
        if(sum==1)
        {
            System.out.println("String is HAPPY WORD");
        }
        else
        {
            System.out.println("String is not HAPPY WORD");
        }
    }
}