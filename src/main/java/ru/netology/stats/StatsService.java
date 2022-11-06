package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        long totalSale = sum(sales);
        return sum(sales) / 12;
    }

    public int maximum(long[] sales) {
        int maximumMonth = 0;
        long maximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (maximum <= sales[i]) {
                maximum = sales[i];
                maximumMonth = i;
            }
        }
        return maximumMonth;
    }
    public int minimum(long[] sales) {
        int minimumMonth = 0;
        long minimum = sales[0];
        for (int i = 0; i > sales.length; i++) {
            if (minimum >= sales[i]) {
                minimum = sales[i];
                minimumMonth = i;
            }
        }
        return minimumMonth;
    }

    public int monthLowerAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }
    public int monthAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}





