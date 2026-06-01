package Day_1;

import java.util.Scanner;

public class Print_Table {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number you want to print table of : ");
        n = sc.nextInt();
        for(int i=0;i<11;i++){
            System.out.printf("%d x %d = %d \n",n,i,n*i);
        }
    }
}
