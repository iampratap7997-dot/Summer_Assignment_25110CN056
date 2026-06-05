package Day_5;

import java.util.Scanner;

public class Que_20 {
    public static void main(String[] args) {
        int largestPrimeFactor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        while(n%2==0){
            largestPrimeFactor = 2;
            n/=2;
        }
        for(int i=3;i*i<=n;i+=2){
            while(n%i==0){
                largestPrimeFactor = i;
                n/=i;
            }
        }
        if(n>1){
            largestPrimeFactor = n;
        }
        System.out.println("Largest prime factor: "+largestPrimeFactor);
    }
}
