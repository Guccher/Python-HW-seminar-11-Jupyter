

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.ArrayList;
import java.util.Scanner;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        int sum = 0;
        int N;
        ArrayList<Integer> triangular_list = new ArrayList<Integer>();
        Scanner iscanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = iscanner.nextInt();
        for (int i = 1; i <= N; i++) {
            triangular_list.add(sum += i);

        }
        System.err.println(triangular_list);
    }
}