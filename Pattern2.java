package PrintPatterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.print("Enter the Length of the Pattern : ");
        Scanner sc = new Scanner(System.in);
        int j=1;
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(j = 1; j <= n; j++){
                if (i>1 && i<n) {
                    if (j==1 || j==n) {
                        System.out.print("* ");
                    } else  {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
