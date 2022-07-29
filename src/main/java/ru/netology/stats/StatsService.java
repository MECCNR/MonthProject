package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int money = 0;
        for (int sale : sales) {
            money = money + sale;
        }
        return money;
    }

    public int averageSales(int[] sales) {
        int months = 0;
        int money = 0;
        for (int sale : sales) {
            money = money + sale;
            months = months + 1;
        }
        int average = money / months;
        return average;
    }

    public int peakSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int lowerAvg(int[] sales) {
        int average = averageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count = count + 1;
            }
        }
        return count;
    }

    public int higherAvg(int[] sales) {
        int average = averageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count = count + 1;
            }
        }
        return count;
    }
}