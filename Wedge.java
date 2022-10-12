import java.util.Scanner;

public class Wedge {
    /* write code here */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter the initial number of @'s ");
        String input = stdin.nextLine();
        System.out.println(String.format("You entered: %s", input));

        try{
            int number = Integer.parseInt(input);
            for (int i = number; i > 0; i--) {
                System.out.println("@".repeat(i)) ;
            }
        }
        catch (NumberFormatException ex){
            System.out.println("Please input int.");
        }

        sum(stdin);
        product(stdin);

        stdin.close();
    }

    public static void sum(Scanner stdin) {
        System.out.println("Enter the first number");
        String input_1 = stdin.nextLine();
        System.out.println("Enter the second number");
        String input_2 = stdin.nextLine();
        System.out.println(String.format("You entered: %s & %s", input_1, input_2));

        try{
            int number_1 = Integer.parseInt(input_1);
            int number_2 = Integer.parseInt(input_2);
            System.out.println(String.format("sum: %d", number_1+number_2));
        }
        catch (NumberFormatException ex){
            System.out.println("Please input int.");
        }
    }

    public static void product(Scanner stdin) {
        System.out.println("Enter the first number");
        String input_1 = stdin.nextLine();
        System.out.println("Enter the second number");
        String input_2 = stdin.nextLine();
        System.out.println(String.format("You entered: %s & %s", input_1, input_2));

        try{
            int number_1 = Integer.parseInt(input_1);
            int number_2 = Integer.parseInt(input_2);
            System.out.println(String.format("multiple: %d", number_1*number_2));
        }
        catch (NumberFormatException ex){
            System.out.println("Please input int.");
        }
    }
}
