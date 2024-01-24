import java.util.Scanner; //importing util package 

public class arraycodeproductandsum { //creating class
    public static void main(String[] args) { //creating main method
        Scanner scanner = new Scanner(System.in);
        
        // Declare an array of size twenty
        double[] array = new double[20];
        
        // Accept elements into the array
        System.out.println("Enter 20 elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
        
        double product = 1.0; //creating predifined variable storing product
        for (double element : array) {
            product *= element; //calculating product of all elements
        }
        System.out.println("Product of all elements: " + product);
        
        // Print the square of each element
        System.out.println("Squares of elements:");
        for (double element : array) {
            double square = element * element; //calculating square of all elements
            System.out.print(square + " ");
        }
        }
}