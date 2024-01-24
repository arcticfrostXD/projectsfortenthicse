public class patternofalphabets //defining class 
{
    
public static void main(String args[]) { //creating main method
        int a = 97;
        for (int i = 1; i <= 4; i++) { //outer loop - number of loops
            for (int j = 1; j <= 4; j++) { //inner loop - number of columns 
                System.out.print((char)a + " "); //converting digit to capital A or B
            }
            a++;
            if (i % 2 == 0)
                a = 65; //converting digit to small a or b
            System.out.println();
        }
    }
}