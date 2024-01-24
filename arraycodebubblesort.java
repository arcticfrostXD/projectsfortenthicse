import java.util.Scanner; //importing java package util
class arraycodebubblesort //creating class
{
    public static void main(String [] args) //creating main method
    {
        
        int temp; int i; int j; //creating pre-defined methods
        System.out.println("enter the number of elements you want in array");//storing number of elements
        Scanner sc = new Scanner(System.in); //creating scanner to input array
        int n = sc.nextInt(); //defining limit of array
        int arr[] = new int[n];
        System.out.println("Enter " +n+  " integers"); //inputting array
        for (i = 0; i<n; i++) //storing elements
        {
            arr[i] = sc.nextInt();
        }
        {
        for( i = 0; i <(n-1); i++) //outer loop for bubblesorting 
        { 
            for( j = 1; j <(n-i); j++) //inner loop for bubblesorting
            {
                if(arr[j-1] > arr[j]) //ascending arrangmenet 
                {
                    temp = arr[j-1]; //storing larger value in temporary variable 
                    arr[j-1] = arr[j]; //storing smaller value in place of larger value
                    arr[j] = temp;
                }
            }
        }
            System.out.println("Sorted list : "); //printing sorted list
            for( i=0; i < n; i++)
            {
                System.out.println(arr[i]);
            }
    }

}
}