
// Вывести все простые числа от 1 до 1000

public class HomeWorkTask2 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        int prime_numbers = 2;
        int count_divider = 0;
        for (int i = 2; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (i % j == 0) {
                    count_divider++;
                }
                if (count_divider > 2) {
                  break;  
                }
            }   
            if (count_divider == 2) {
                prime_numbers = i;
                System.err.println(prime_numbers);
            }
            count_divider = 0;
            
        }   
    }
}
