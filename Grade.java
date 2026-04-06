import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: O");
        } 
        
        else if (marks >= 75) {
            System.out.println("Grade: A");
        } 
        else {
            System.out.println("Grade: B");
        }
    }
}
