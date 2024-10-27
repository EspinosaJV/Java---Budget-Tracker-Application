import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // single variables
        String monthBudget = "";
        double monthlyBudgetValue = 0;

        // array variables
        List<String> months = Arrays.asList("january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december");
        List<String> categoryExpenses = new ArrayList<>();

        //Prompt user for what month to budget
        while (true) {
            System.out.print("Please input what month you are currently budgeting for ");
            monthBudget = scanner.next();
            if (months.contains(monthBudget.toLowerCase()))
                break;
            else
                System.out.println("Please input a proper month!");
        }

        // Prompt user for monthly budget value
        System.out.println("You're budgeting for the month of " + monthBudget);
        while (true) {
            System.out.print("Enter budget for the month: ");
            monthlyBudgetValue = scanner.nextDouble();
            if (monthlyBudgetValue > 0)
            {
                break;
            }
        }

        //Prompt user to be able to enter the expense category
        while (true) {
            System.out.println("");
        }

    }
}