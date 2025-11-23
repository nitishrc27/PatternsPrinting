package PrintPatterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        System.out.print("Enter the length of the Pattern: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num_of_spaces = 0;
        for (int i=0;i<n;i++) {
            num_of_spaces = 0;
            while (num_of_spaces++ < i) {
                System.out.print(" ");
            }
            for (int j=0;j<n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
