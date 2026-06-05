package Day_5;

import java.util.Scanner;

public class Que_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number factors of which is required: ");
        int n = sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
