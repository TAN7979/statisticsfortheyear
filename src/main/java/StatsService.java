public class StatsService {
    public long getStatsSalesSum(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public long getAverageSumSales(long[] sales) {

        long averageSum = getStatsSalesSum(sales) / sales.length;
        return averageSum;
    }

    public long getMonthMaxSales(long[] sales) {
        int monthMax = 0;
        long month = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= month) {
                month = sales[i];
                monthMax = i;
            }

        }
        return monthMax + 1;
    }

    public long getMonthMinSales(long[] sales) {
        int monthMin = 0;
        long month = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= month) {
                month = sales[i];
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public long getMonthBelowAverageSales(long[] sales) {
        long averageSumsale = getAverageSumSales(sales);
        long belowAverage = 0;
        for (long sale : sales) {
            if (sale < averageSumsale) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public long getMonthAboveAverageSales(long[] sales) {
        long aboveAverageSale = getAverageSumSales(sales);
        long aboveAverage = 0;
        for (long sale : sales) {
            if (sale > aboveAverageSale) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}
