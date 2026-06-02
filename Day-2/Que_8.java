package Day_2;

import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {
        int rev =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want the sum of : ");
        int n = sc.nextInt();
        int m =n;
        while(m>0){
            rev = rev*10 + m%10;
            m=m/10;
        }
        if(rev==n){
            System.out.println("Pallindrome Number!!");
        }
        else{
            System.out.println("Not a Pallindrome Number.");
        }
    }
}
