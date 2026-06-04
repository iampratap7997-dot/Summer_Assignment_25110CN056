package Day_3;

import java.util.Scanner;

public class Que_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting number: ");
        int n= sc.nextInt();
        System.out.print("Enter the Ending Number: ");
        int end = sc.nextInt();
        for(int i=n; i<end;i++){
            int temp=i;
            int tem=i;
            int len = countdig(tem);
            int sum =0;
            while(temp > 0){
                int rem = temp%10;
                sum = sum + (int)Math.pow(rem,len);
                temp=temp/10;
            }
            if(i==sum){
                System.out.println(i+" ");
            }
        }
        sc.close();
    }
    static int countdig(int tem){
        if(tem==0){
            return 1;
        }
        int count=0;
        while(tem>0){
            tem=tem/10;
            count ++;
        }
        return count;
    }
}
