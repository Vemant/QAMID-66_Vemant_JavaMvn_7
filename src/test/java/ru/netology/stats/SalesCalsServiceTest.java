package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SalesCalsServiceTest {

//    @ParameterizedTest
//    @CsvSource({
//            "{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}, 180"
//      })
//    public void shouldFindSalesAmount(int[] sales, int expectAmount) {
//        SalesCalcService service = new SalesCalcService();
//        int actualAmount = service.salesAmount(sales);
//        Assertions.assertEquals(expectAmount, actualAmount);
//    }

    // 1. Сумма всех продаж
    // salesAmount
    @Test
    public void shouldFindSalesAmount() {
        SalesCalcService service = new SalesCalcService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectAmount = 180;
        int actualAmount = service.salesAmount(sales);
        Assertions.assertEquals(expectAmount, actualAmount);
    }

    // 2. Среднняя сумма продаж в месяц
    // salesAverage
    @Test
    public void shouldFindSalesAverage() {
        SalesCalcService service = new SalesCalcService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectAmount = 15;
        int actualAmount = service.salesAverage(sales);
        Assertions.assertEquals(expectAmount, actualAmount);
    }

    // 3. Номер (последнего) месяца, в к-ром максимум продаж
    // salesMaxMonth
    @Test
    public void shouldFindSalesMaxMonth() {
        SalesCalcService service = new SalesCalcService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectMaxMonth = 8;
        int actualMaxMonth = service.salesMaxMonth(sales);
        Assertions.assertEquals(expectMaxMonth, actualMaxMonth);
    }

    // 4. Номер (последнего) месяца, в к-ром минимум продаж
    // salesMinMonth
    @Test
    public void shouldFindSalesMinMonth() {
        SalesCalcService service = new SalesCalcService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectMinMonth = 9;
        int actualMinMonth = service.salesMinMonth(sales);
        Assertions.assertEquals(expectMinMonth, actualMinMonth);
    }

    // 5. Кол-во месяцев, в к-рых продажи ниже среднего
    // salesNumberOfLessAverageMonths
    @Test
    public void shouldFindSalesLessAverageMonths() {
        SalesCalcService service = new SalesCalcService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectLessAverageMonth = 5;
        int actualLessAverageMonth = service.salesNumberOfLessAverageMonths(sales);
        Assertions.assertEquals(expectLessAverageMonth, actualLessAverageMonth);
    }

    // 6. Кол-во месяцев, в к-рых продажи выше среднего
    // salesNumberOfMoreAverageMonths
    @Test
    public void shouldFindSalesMoreAverageMonths() {
        SalesCalcService service = new SalesCalcService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectMoreAverageMonth = 5;
        int actualMoreAverageMonth = service.salesNumberOfMoreAverageMonths(sales);
        Assertions.assertEquals(expectMoreAverageMonth, actualMoreAverageMonth);
    }

}

