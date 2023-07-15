package ru.netology.stats;

public class SalesCalcService {
    // 1. Сумма всех продаж
    public int salesAmount(int[] sales) {
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    // 2. Среднняя сумма продаж в месяц
    public int salesAverage(int[] sales) {
        int amount = salesAmount(sales);
        return amount / sales.length;
    }

    // 3. Номер (последнего) месяца, в к-ром максимум продаж
    public int salesMaxMonth(int[] sales) {
        int maxSales = sales[0];
        int maxSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSales) {
                maxSales = sales[i];
                maxSalesMonth = i;
            }
        }
        return maxSalesMonth + 1;
    }

    // 4. Номер (последнего) месяца, в к-ром минимум продаж
    public int salesMinMonth(int[] sales) {
        int minSales = sales[0];
        int minSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSales) {
                minSales = sales[i];
                minSalesMonth = i;
            }
        }
        return minSalesMonth + 1;
    }

    // 5. Кол-во месяцев, в к-рых продажи ниже среднего
    public int salesNumberOfLessAverageMonths(int[] sales) {
        int average = salesAverage(sales);
        int lessAverageMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
               lessAverageMonth++;
            }
        }
        return lessAverageMonth;
    }

    // 6. Кол-во месяцев, в к-рых продажи выше среднего
    public int salesNumberOfMoreAverageMonths(int[] sales) {
        int average = salesAverage(sales);
        int moreAverageMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                moreAverageMonth++;
            }
        }
        return moreAverageMonth;
    }
}
