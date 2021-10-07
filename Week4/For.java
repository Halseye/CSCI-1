package Week4;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        // for loop executes block of code a limited amount of times 
        // simple case
        // variable, condition, iteration (optional)
        for(int i = 0; i<=10; i++){
            System.out.println(i);
        }
        // count down?
        // decrement by 2 is i-=2

        for(int i = 10; i>=0; i--){
            System.out.println(i);
            // or i-=2
        }
        System.out.println("Happy New Year");

        // Nested loop - loop inside of a loop
        Scanner keyboard = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = keyboard.nextInt();
        System.out.println("Enter # of columns: ");
        columns = keyboard.nextInt();
        System.out.println("Enter symbol to use:" );
        symbol = keyboard.next();

        for(int i=1; i<=rows; i++) {
            // incharge of rows.. moves us down to the next line
            System.out.println();
            for(int j=1; j<= columns; j++){
                // incharge of columns until it reaches the end then moves back to the outer loop
                System.out.print(symbol);
            }
        }

    }
    
}
