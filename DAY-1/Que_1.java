package Day_1;
import java.util.Scanner;

public class sumFirst_N_NaturalNum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number upto which sum is required : ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            sum += i;
        }

        sc.close();
        System.out.println(sum);
    }
}
