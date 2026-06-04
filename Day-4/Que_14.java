package Day_4;

import java.util.Scanner;

public class Que_14 {
    public static void main(String[] args) {
        int a=0,b=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term required from Fibonacci series: ");
        int n = sc.nextInt();

        while (n>0){
            int x=a+b;
            if(n==1){
                System.out.println(a);
            }
            a=b;
            b=x;
            n--;
        }
    }
}
