package ru.netology.stats;

public class StatsService {

    // 1.
    public int sumSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    // 2.
    public int averageSales(long[] sales) {
        int average = sumSales(sales);
        return average / sales.length;
    }

    // 3.
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    // 4.
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // 5.
    public int quantityMonthSalesBelowTheAverage(long[] sales) {
        int quantityMinSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) {
                quantityMinSales++;
            }
        }
        return quantityMinSales;
    }

    // 6.
    public int quantityMonthSalesAboveAverage(long[] sales) {
        int quantityMaxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales(sales)) {
                quantityMaxSales++;
            }
        }
        return quantityMaxSales;
    }
}
