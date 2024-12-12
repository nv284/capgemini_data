package pack.cap.module1.basic;

public class StoreTransaction {
    public static void main(String[] args) {
       
        byte item1Price = 5; // Price of item 1 in dollars (byte type, small value)
        short item2Price = 150; // Price of item 2 in dollars (short type, still small but more than byte)
        int item3Price = 2000; // Price of item 3 in dollars (int type, larger value)
        long item4Price = 100000L; // Price of item 4 in dollars (long type, very large value)

        // Quantities of the items
        int item1Quantity = 3;
        short item2Quantity = 10;
        int item3Quantity = 50;
        byte item4Quantity = 100;

        // Calculate the total price for each item
        int totalPriceItem1 = item1Price * item1Quantity;
        int totalPriceItem2 = item2Price * item2Quantity;
        int totalPriceItem3 = item3Price * item3Quantity;
        long totalPriceItem4 = item4Price * item4Quantity;

        // Calculate the overall total price
        long totalTransactionPrice = totalPriceItem1 + totalPriceItem2 + totalPriceItem3 + totalPriceItem4;

        // Display total price
        System.out.println("Total Transaction Price (without tax): " + totalTransactionPrice + " dollars");

        // Calculate the sales tax at 8% (as a decimal percentage)
        double salesTaxRate = 0.08; // 8% tax
        double salesTax = totalTransactionPrice * salesTaxRate;

        // Display the sales tax
        System.out.println("Sales Tax: " + salesTax + " dollars");

        // Calculate final total including tax
        double finalTotalPrice = totalTransactionPrice + salesTax;

        // Display the final total
        System.out.println("Total Transaction Price (with tax): " + finalTotalPrice + " dollars");
    }
}
