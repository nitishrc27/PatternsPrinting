package PrintPatterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter No. of Columns: ");
        int columns = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
