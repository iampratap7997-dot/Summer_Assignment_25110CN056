package Day_4;

import java.util.Scanner;

public class Que_15 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        int m=n;
        int l=n;
        int len = countdig(m);
        while(n > 0){
            int rem = n%10;
            sum = sum + (int)Math.pow(rem,len);
            n=n/10;
        }
        if(l==sum){
            System.out.println("Number is Armstrong!!");
        }
        else
            System.out.println("Not an Armstrong Number.");
        sc.close();
    }
    static int countdig(int m){
        if(m==0){
            return 1;
        }
        int count=0;
        while(m>0){
            m=m/10;
            count ++;
        }
        return count;
    }
}
