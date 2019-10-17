
import java.util.*;
class GuessTheNumber {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 10 + 1);
        /* This creates a random integer between 1 and 10 
         * and stores it as integer "answer"
         */
        System.out.print("I am thinking of a number between 1 and 10. What is it? ");
        Scanner userInput = new Scanner(System.in);
        //takes user input
        int response = userInput.nextInt();
        /* this converts the Scanner into an integer so that response and
           answer can be compared
           */
        if (response == answer) {
            /* If the number typed out matches the random number, the program 
               prints out "yes, that's it!"
               */
            System.out.println("Yes, that's it!");
        }
        else {
            /* If the user types anything other than what the random number 
                is, the program will print out "sorry, that is incorrect :/" 
            */
            System.out.println("Sorry, that is incorrect :/");
        }
     
        
    }
}
