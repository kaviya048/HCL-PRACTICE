import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        if (units >= 0 && units <= 100) {
            bill = 0;
        } 
        else if (units <= 200) {
            bill = (units - 100) * 0.8;
        } 
        else if (units <= 300) {
            bill = (units - 200) * 15;
        } 
        else {
            bill = (units - 300) * 3;
        }

        System.out.println("Electricity Bill = " + bill);
    }
}
