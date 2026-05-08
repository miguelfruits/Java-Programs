import saldept.Sales;
import purcdept.Purchase;
import java.util.Scanner;

public class Business {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total sales amount: ");
		
        double salesAmount = scanner.nextDouble();
        Sales sales = new Sales(salesAmount);
		
        System.out.print("Enter total purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        Purchase purchase = new Purchase(purchaseAmount);

        double profitOrLoss = sales.getTotalSales() - purchase.getTotalPurchase();

        if (profitOrLoss > 0) {
            System.out.println("Profit: $" + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("Loss: $" + (-profitOrLoss));
        } else {
            System.out.println("No Profit, No Loss.");
        }

        scanner.close();
    }
}
