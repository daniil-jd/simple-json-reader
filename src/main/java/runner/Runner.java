package runner;

import domain.expense.Expense;
import domain.stat.Stat;
import util.Calculator;
import util.Converter;

public class Runner {

    private static String INPUT = "src/main/resources/files/expenses.json";
    private static String OUTPUT = "src/main/resources/files/stats.json";

    public static void main(String[] args) {
        String in = INPUT, out = OUTPUT;

        if (args.length > 0 && args[0].equals("local")) {
            in = "expenses.json";
            out = "stats.json";
        }

        Expense exp = Converter.loadPojoFromJsonFile(Expense.class, in);
        Stat stat = Calculator.calculate(exp);
        Converter.saveJsonFromPojo(stat, out);
    }

}
