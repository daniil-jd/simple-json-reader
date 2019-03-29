package util;

import domain.expense.Expense;
import domain.stat.Stat;
import domain.stat.StatsItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Calculator {

    public static Stat calculate(Expense expense) {
        HashMap<String, Long> statItemMap = new HashMap<>();
        expense.getExpenses().stream()
                .forEach(expensesItem ->
                {expensesItem.getDetails().stream()
                        .forEach(detailsItem -> {
                            if (statItemMap.get(detailsItem.getCategory()) == null) {
                                statItemMap.put(detailsItem.getCategory(), detailsItem.getAmount());
                            } else {
                                long sum = statItemMap.get(detailsItem.getCategory())
                                        + detailsItem.getAmount();
                                statItemMap.put(detailsItem.getCategory(), sum);
                            }
                        });});

        List<StatsItem> stats = new ArrayList<>();
        statItemMap.forEach((k,v) -> {
            stats.add(new StatsItem(v, k));
        });

        Stat result = new Stat();
        result.setId(expense.getId());
        result.setName(expense.getName());
        result.setStats(stats);
        return result;
    }

}
