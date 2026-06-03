package Day_3;

import java.util.Scanner;

public class Que_10 {
    public static void main(String[] args) {
        int start, end;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number you want to start from: ");
        start = sc.nextInt();
        System.out.print("Enter the Number where you want to end: ");
        end = sc.nextInt();

        for(int i=start; i<end ;i++){
            boolean isPrime = true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
