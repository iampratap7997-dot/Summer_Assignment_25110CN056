package Day_5;

import java.util.Scanner;

public class Que_18 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int m = sc.nextInt();
        int n=m;
        if(m==0){
            sum=1;
        }
        while(n>0){
            int rem = n%10;
            sum += fact(rem);
            n/=10;
        }
        if(sum==m){
            System.out.println("Number is straang!!");
        }
        else
            System.out.println("Numer is not Strong...");
    }
    static int fact(int n){
        int fact =1;
        while(n>0){
            fact = fact*(n);
            n--;
        }
        return fact;
    }
}
