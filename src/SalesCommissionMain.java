import javax.swing.*;
import java.util.Scanner;

public class SalesCommissionMain {

    public static void main(String[] args) {
        SalesCommission salesCommission = new SalesCommission();
        Scanner scanner = new Scanner(System.in);

        int[] frequency = new int[9];
        System.out.println("Enter sales:");
        int firstSale = scanner.nextInt();
        while (firstSale != -1) {
            SalesCommission.getSalesCommissionDistribution(firstSale, frequency);
            System.out.println("Enter sales:");
            firstSale = scanner.nextInt();
        }
        System.out.println("The hard coded sales is:");
        int [] score={1000,20000,3000,6666};
        SalesCommission.getSalesCommissionDistribution(score,frequency);



    }
}











