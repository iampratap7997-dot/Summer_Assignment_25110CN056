package Day_2;

import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {
        int prod =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want the sum of : ");
        int n = sc.nextInt();
        while(n>0){
            prod *= n%10;
            n=n/10;
        }
        System.out.println(prod);
    }
}
