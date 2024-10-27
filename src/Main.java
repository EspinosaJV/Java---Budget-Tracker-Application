import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // single variables
        String monthBudget = "";
        String expenseCategoryInput = "";
        double monthlyBudgetValue = 0;
        double expenseValueInput = 0;
        double expenseValueTotal = 0;
        boolean isBudgetExceeded = false;


        // array variables
        List<String> months = Arrays.asList("january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december");
        List<String> categoryExpenses = new ArrayList<>();
        List<Double> valueExpenses = new ArrayList<>();

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
            System.out.println("We will now be calculating the expenses, type exit to finish.");
            System.out.print("Enter the category of the expense: ");
            expenseCategoryInput = scanner.next();

            if (expenseCategoryInput.equals("exit"))
            {
                break;
            }

            categoryExpenses.add(expenseCategoryInput);
            System.out.print("Enter your total expenses for this specific category: ");
            expenseValueInput = scanner.nextDouble();
            valueExpenses.add(expenseValueInput);
            expenseValueTotal += expenseValueInput;
            expenseValueInput = 0;

            if ((monthlyBudgetValue - expenseValueTotal) < 0)
            {
                System.out.println("You have exceeded your monthly budget by " + (expenseValueTotal - monthlyBudgetValue));
                isBudgetExceeded = true;
                break;
            }
        }

        if (isBudgetExceeded)
            System.out.println("Your expenses has exceeded your monthly budget, please reallocate!");
        else
        {
            for (int i = 0; i < categoryExpenses.size(); i++)
            {
                System.out.println("For category " + categoryExpenses.get(i) + " you had an expense of " + valueExpenses.get(i));
            }

            System.out.println("Your total expense for the month was: " + expenseValueTotal);
            System.out.println("Your remaining budget for the month is: " + (monthlyBudgetValue - expenseValueTotal));
        }

    }
}