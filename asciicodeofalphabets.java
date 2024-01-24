public class asciicodeofalphabets //defining class
{
    
    public static void main(String Args[]) //main method
    {
        
        int c;
        System.out.println("Alphabet\t" + "ASCII CODE");
        for(int i = 1; i<27; i++)
        {
             c = 64 + i; //calculating ASCII code of all alphabets
             System.out.println((char)c+"\t\t" +c);
             
        }
        
        
    }
    
}