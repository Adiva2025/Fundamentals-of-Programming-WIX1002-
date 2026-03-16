package lab.L7Q6;
import java.io.*;
import java.util.Scanner;

public class L7Q6 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("/Users/adivakar/github-classroom/FSKTMCoders/tutorial-lab-7-Adiva2025/lab/L7Q6/product.txt"));

            int productCount = 0;
            while (s.hasNextLine()) {
                s.nextLine();
                productCount++;
            }
            String[] prodID = new String[productCount];
            String[] prodName = new String[productCount];
            double[] prodPrice = new double[productCount];

            s = new Scanner(new File("/Users/adivakar/github-classroom/FSKTMCoders/tutorial-lab-7-Adiva2025/lab/L7Q6/product.txt"));
            
            for(int i = 0; i < productCount; i++) {
                String line = s.nextLine();
                String[] parts = line.split(",");

                prodID[i] = parts[0];
                prodName[i] = parts[1];
                prodPrice[i] = Double.parseDouble(parts[2]);
            }
         s.close();

         // Process orders
         Scanner o = new Scanner(new File("/Users/adivakar/github-classroom/FSKTMCoders/tutorial-lab-7-Adiva2025/lab/L7Q6/order.txt"));

         int orderCount = 0;
            while (o.hasNextLine()) {
                o.nextLine();
                orderCount++;
            }
            o.close();

            String[] orderID = new String[orderCount];
            String[] orderProdID = new String[orderCount];
            int[] orderQty = new int[orderCount];

            o = new Scanner(new File("/Users/adivakar/github-classroom/FSKTMCoders/tutorial-lab-7-Adiva2025/lab/L7Q6/order.txt"));
            for (int i = 0; i < orderCount; i++) {
                String line = o.nextLine();
                String[] parts = line.split(",");

                orderID[i] = parts[0];
                orderProdID[i] = parts[1];
                orderQty[i] = Integer.parseInt(parts[2]);
            }
            o.close();

           System.out.printf("%-8s %-25s %-15s %-15s %-15s\n",
                    "ProductID", "ProductName", "OrderQty", "Price/Unit", "TotalPrice");
            System.out.println("--------------------------------------------------------------------------");

            for(int i = 0; i < orderCount; i++) {
                for(int j = 0; j < productCount; j++) {
                    if(orderProdID[i].equals(prodID[j])) {
                      
                        System.out.printf("%-8s %-25s %-15d %-15.2f %-15.2f\n",
                                prodID[j], prodName[j], orderQty[i], prodPrice[j], (orderQty[i] * prodPrice[j]));
                        break;
                    }
                }
            }
} catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
