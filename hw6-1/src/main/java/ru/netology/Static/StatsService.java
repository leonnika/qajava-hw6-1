package ru.netology.Static;
public class StatsService {
    // функция возвращает  Сумму всех продаж
    public long findSumSales(long[] monthsSumSales) {
        long sumSales = 0;
        for (long monthSumSales : monthsSumSales) {
            sumSales += monthSumSales;
        }
        return sumSales;
    }
    // функция возвращает Среднюю сумму продаж в месяц
    public long findAverageSales(long[] monthsSumSales) {
        StatsService stats = new StatsService();
        long sumSales = stats.findSumSales(monthsSumSales);
        long averageSales = sumSales / monthsSumSales.length;
        return averageSales;
    }
    // функция возвращает Номер месяца, в котором был пик продаж
    public int findMonthMaxSales(long[] monthsSumSales) {
        long currentMax = monthsSumSales[0];
        int numberMonth = 0;
        int currentNumder = 0;
        for (long monthSumSales : monthsSumSales) {
            currentNumder = currentNumder + 1;
            if (currentMax <= monthSumSales) {
                currentMax = monthSumSales;
                numberMonth = currentNumder;
            }
        }
        return numberMonth;
    }
    // функция возвращает Номер месяца, в котором был минимум продаж
    public int findMonthMinSales(long[] monthsSumSales) {
        long currentMin = monthsSumSales[0];
        int numberMonth = 0;
        int currentNumder = 0;
        for (long monthSumSales : monthsSumSales) {
            currentNumder = currentNumder + 1;
            if (currentMin >= monthSumSales) {
                currentMin = monthSumSales;
                numberMonth = currentNumder;
            }
        }
        return numberMonth;
    }
    // функция возвращает Кол-во месяцев, в которых продажи были ниже среднего
    public int findMonthSalesUnderAverage(long[] monthsSumSales) {
        int numberMonth = 0;
        StatsService stats = new StatsService();
        long averageSales = stats.findAverageSales(monthsSumSales);
        for (long monthSumSales : monthsSumSales) {
            if (monthSumSales < averageSales) {
                numberMonth = numberMonth + 1;
            }
        }
        return numberMonth;
    }
    // функция возвращает Кол-во месяцев, в которых продажи были веше среднего
    public int findMonthSalesOverAverage(long[] monthsSumSales) {
        int numberMonth = 0;
        StatsService stats = new StatsService();
        long averageSales = stats.findAverageSales(monthsSumSales);
        for (long monthSumSales : monthsSumSales) {
            if (monthSumSales > averageSales) {
                numberMonth = numberMonth + 1;
            }
        }
        return numberMonth;
    }
}
