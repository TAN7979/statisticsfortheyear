import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void amountOfSalesForTheYear() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.getStatsSalesSum(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageMonthlySalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageAmount = 15;
        long actualAverageAmount = service.getAverageSumSales(sales);
        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
    }

    @Test
    public void maxMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedmaxMonth = 8;
        long actualmaxMonth = service.getMonthMaxSales(sales);
        Assertions.assertEquals(expectedmaxMonth, actualmaxMonth);
    }

    @Test
    public void minMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedminMonth = 9;
        long actualminMonth = service.getMonthMinSales(sales);
        Assertions.assertEquals(expectedminMonth, actualminMonth);
    }

    @Test
    public void belowAverageMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedBelowAverage = 5;
        long actualBelowAverage = service.getMonthBelowAverageSales(sales);
        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }
    @Test
    public void aboveAverageMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAboveAverage = 5;
        long actualAboveAverage = service.getMonthBelowAverageSales(sales);
        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }
}
