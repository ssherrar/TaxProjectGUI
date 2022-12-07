// Sam Sherrard
// 12/05/2022
// Tax Project


import javax.swing.JOptionPane;
import java.util.Scanner;

public class TaxProjectGUI {
    static Scanner scanner; //classes begin with uppercase


       public static void main(String[] args) {
           String purchasePrice;

           purchasePrice = JOptionPane.showInputDialog(null, "Enter purchase price: ", "Java Class", JOptionPane.WARNING_MESSAGE);

            //Declare Variables-----------------------
            double price;
            double stateTax;
            double countyTax;
            double totalSalesTax;
            double totalSale;

            //Convert string to double-----------------
            price = Double.parseDouble(purchasePrice);

            //Cals-----------------------------------
            stateTax = price * 0.04;
            countyTax = price * 0.02;
            totalSalesTax = stateTax + countyTax;
            totalSale = totalSalesTax + price;

            //Output---------------------------------
            System.out.println();
            System.out.print("Purchase Price:  $");
            System.out.printf("%,10.2f", price);
            System.out.println();
            System.out.print("State Tax (4%):  $");
            System.out.printf("%,10.2f", stateTax);
            System.out.println();
            System.out.print("County Tax (2%): $");
            System.out.printf("%,10.2f", countyTax);
            System.out.println();
            System.out.print("Total Sales Tax: $");
            System.out.printf("%,10.2f", totalSalesTax);
            System.out.println();
            System.out.println("                 -----------");
            System.out.print("Total Sale:      $");
            System.out.printf("%,10.2f", totalSale);
            System.out.println();

    }
}
