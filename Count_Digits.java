package Day_1;

import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to count digit of : ");
        int n = sc.nextInt();
        do{
            n=n/10;
            count++;
        }while(n>0);
        System.out.println(count);
    }
}
