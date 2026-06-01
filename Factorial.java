package Day_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which factorial is required : ");
        int n = sc.nextInt();
        for(int i=n; i>0;i--){
            fact *=i;
        }
        System.out.println(fact);
    }
}
