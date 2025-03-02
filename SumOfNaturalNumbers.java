import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void findSum(int num) {
        int sum = num*(num+1)/2;
        System.out.println("Sum of first "+num+"natural numbers : "+sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter natural number :");
        int n =sc.nextInt();
        findSum(n);
    }
}
