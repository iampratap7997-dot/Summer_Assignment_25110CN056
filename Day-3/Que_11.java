package Day_3;

import java.util.Scanner;

public class Que_11 {
    public static void main(String[] args) {
        int gcd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        while(n2!=0){
            int temp = n2;
            n2 = n1%n2;
            n1 = temp;
        }
        System.out.println("GCD is: "+n1);

        sc.close();
    }
}
