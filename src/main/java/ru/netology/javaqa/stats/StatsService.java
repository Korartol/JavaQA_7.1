package ru.netology.javaqa.stats;

public class StatsService {

    // Находим сумму всех продаж
    public long sumSales(long[] sales) {

        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    // Среднюю сумму продаж в месяц
    public long averageSales(long[] sales) {
        long sum = sumSales(sales);  // передаем сумму всех продаж
        long average = sum / sales.length;  // делим на количество месяцев
        return average;
    }

    // Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    public int monthMaxSales(long[] sales) {
        int maxMonth = 0;  // сюда запишем месяц с максимальной продажей
        int month = 0;  // индекс месяца

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    // Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public int monthMinSales(long[] sales) {
        int minMonth = 0;  // сюда запишем месяц с максимальной продажей
        int month = 0;  // индекс месяца

        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    // Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public int averageMinSales(long[] sales) {
        long aversale = averageSales(sales);  // передаем средние продажи
        int month = 0;  // кол-во месяцев

        for (long sale : sales) {
            if (sale < aversale) {
                month++;
            }
        }
        return month;
    }

    // Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public int averageMaxSales(long[] sales) {
        long aversale = averageSales(sales);  // передаем средние продажи
        int month = 0;  // кол-во месяцев

        for (long sale : sales) {
            if (sale > aversale) {
                month++;
            }
        }
        return month;
    }

}
