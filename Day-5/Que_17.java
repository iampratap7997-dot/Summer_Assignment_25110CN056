package Day_5;

import java.util.Scanner;

public class Que_17 {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number u wanna check is perfect: ");
        int n = sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum = sum +i;
            }
        }
        if(sum==n){
            System.out.println("Number is Perfect!!");
        }
        else
            System.out.println("Nhi h Perfect..Mai is baat ka khandan krta hu.");
    }
}
