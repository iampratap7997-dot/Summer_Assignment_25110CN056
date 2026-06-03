package Day_3;

import java.util.Scanner;

public class Que_12 {
    public static void main(String[] args) {
        int lcm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        int a =n1;
        int b =n2;

        while(n2!=0){
            int temp = n2;
            n2 = n1%n2;
            n1 = temp;
        }
        lcm = a*b/n1;
        System.out.println("LCM is: " + lcm);

        sc.close();
    }
}
