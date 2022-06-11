package ru.netology.stats;

public class StatsService {
    //    1. Сумма всех продаж
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //    2.Средняя сумма продаж в месяц
    public int averageMonth(int[] sales) {
        return sumSales(sales) / sales.length;
    }

    //    3. Месяц в котором был пик продаж
    public int monthMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth;
    }


    //    4. Месяц в котором минимум продаж
    public int monthMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    // 5. Кол-во месяцев, в которых продажи были ниже среднего
    public int monthMinAverage(int[] sales) {
        int countMinMonth = 0;
        for (int sale : sales) {
            if (sale < averageMonth(sales)) {
                countMinMonth++;
            }
        }
        return countMinMonth;
    }

    //    6. Кол-во месяцев, в которых продажи были выше среднего
    public int monthMaxAverage(int[] sales) {
        int countMaxMonth = 0;
        for (int sale : sales) {
            if (sale > averageMonth(sales)) {
                countMaxMonth++;
            }
        }
        return countMaxMonth;
    }
}


