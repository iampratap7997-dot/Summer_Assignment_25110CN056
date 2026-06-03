package Day_3;

import java.util.Scanner;

public class Que_9 {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = sc.nextInt();

        if(n<=1){
            isPrime = false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Prime Number!!");
        }
        else{
            System.out.println("Not a Prime Number.");
        }
        sc.close();
    }
}
