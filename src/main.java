import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a integer number");
        int number = input.nextInt();
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println("Factorial of " + number + " is "+scientificCalculator.factoral(number));
        System.out.println("Enter second number");
        int secondNumber = input.nextInt();
        System.out.println("Result of addition: " + scientificCalculator.add(number, secondNumber));
        System.out.println("Result of subtraction: " + scientificCalculator.subtract(number, secondNumber));
        System.out.println("Result of modulo: " + scientificCalculator.modulo(number, secondNumber));

        System.out.println("Enter next number:");
        number = input.nextInt();
        System.out.println("Enter next number:");
        secondNumber = input.nextInt();
        System.out.println("Result of and: " + ProgrammerCalculator.and(number, secondNumber) );
        System.out.println("Result of or: " + ProgrammerCalculator.or(number, secondNumber) );

        System.out.println("Please enter a polish word");
        String polishWord = input.next();

        ItalianBasic.plTOit(polishWord);
        System.out.println("Enter italian word");
        String italianWord = input.next();
        ItalianBasic.itTOpl(italianWord);
        System.out.println("Enter italian number");
        String italianNumber = input.next();
        ItalianAdvanced.noTOpl(italianNumber);
        System.out.println("Enter polish number");
        String polishNumber = input.next();
        ItalianAdvanced.noTOit(polishNumber);










    }
}
