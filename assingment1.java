// ● Write a Java class using VS CODE / Intelli J
// ● Ask the user to input a number with proper printing message
// ● Take the input and store in a variable
// ● Multiply that number with 10 and store in a variable
// ● Print the final output on the screen

import java.util.Scanner;

public class assingment1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter something: ");
        String input_from_user = stdin.nextLine();

        try{
            int number = Integer.parseInt(input_from_user);
            System.out.println(number*10) ;
        }
        catch (NumberFormatException ex){
            System.out.println(input_from_user.repeat(10)) ;
        }

        stdin.close();
    }
}
