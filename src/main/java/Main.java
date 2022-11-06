import ru.netology.stats.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        StatsService salesSumm = new StatsService();
        StatsService averageSumm = new StatsService();
        StatsService maxMonth = new StatsService();
        StatsService minMonth = new StatsService();
        StatsService monthesBelowAverage = new StatsService();
        StatsService monthesAboveAverage = new StatsService();


        System.out.println(Arrays.toString(sales));
        System.out.println(salesSumm.yearlySales(sales));
        System.out.println(averageSumm.averageSumm(sales));
        System.out.println(maxMonth.maxSales(sales));
        System.out.println(minMonth.minSales(sales));
        System.out.println(monthesBelowAverage.monthesBelowAverage(sales));
        System.out.println(monthesAboveAverage.monthesAboveAverage(sales));
    }
}
