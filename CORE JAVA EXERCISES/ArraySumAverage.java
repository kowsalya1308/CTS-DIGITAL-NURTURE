import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i+1) + ": ");
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum / n));
        sc.close();
    }
}
