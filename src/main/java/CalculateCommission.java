import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class CalculateCommission {

    static Scanner scanner = new Scanner(System.in);
    static Logger logger = getLogger(CalculateCommission.class.getName());

    public double getCommission(int locks, int stocks, int barrels) {
        double lockPrice, stockPrice, barrelPrice;
        int totalLocks, totalStocks, totalBarrels;
        double lockSales, stockSales, barrelSales;
        double sales, commission;
        lockPrice = 45.0;
        stockPrice = 30.0;
        barrelPrice = 25.0;
        totalLocks = 0;
        totalStocks = 0;
        totalBarrels = 0;

        while (locks >= 0) {
            totalLocks += locks;
            totalStocks += stocks;
            System.out.print("Number of Barrels: ");
            barrels = scanner.nextInt();
            totalBarrels += barrels;
            locks--;
        }

        lockSales = lockPrice * totalLocks;
        stockSales = stockPrice * totalStocks;
        barrelSales = barrelPrice * totalBarrels;
        sales = lockSales + stockSales + barrelSales;
        logger.log(Level.INFO,"Total sales: " + sales);

        if (sales > 1800.0) {
            commission = 0.1 * 1000.0;
            commission = commission + 0.15 * 800.0;
            commission = commission + 0.20 * (sales - 1000.0);
        } else if (sales > 1000.0) {
            commission = 0.10 * 1000.0;
            commission = commission + 0.15 * (sales - 1000.0);
        } else {
            commission = 0.10 * sales;
        }

        logger.log(Level.INFO, "Commission is: $" + commission);
        return commission;
    }
}
