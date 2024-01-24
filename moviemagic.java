
import java.util.*; //importing util package

class moviemagic { //creating main class

    int year;   //creating predefined variables
    String title;
    float rating;

    public moviemagic() { //constructor 
        year = 0;
        title = "";
        rating = 0;
    }

    public void accept() { //storing movie details
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter title:- ");
        title = sc.nextLine();
        System.out.print("Please enter year:- ");
        year = sc.nextInt();
        System.out.print("Please enter rating between 0.0 to 5.0:- ");
        rating = sc.nextFloat();
    }

    public void display() { //calculating movie success 
        System.out.println("Movie Title:- " + title);
        if (rating >= 0 && rating <= 2.0) {
             System.out.println("Flop");
         } else if (rating >= 2.1 && rating <= 3.4) {
             System.out.println("Semi-hit");
         } else if (rating >= 3.5 && rating <= 4.5) {
             System.out.println("Hit");
         } else if (rating >= 4.6 && rating <= 5.0) {
            System.out.println("Super Hit");
        }
    }

    public static void main(String[] args) {   //creating main method                                                                                                                            
        moviemagic movie = new moviemagic();
        movie.accept();
        movie.display();
    }

}
