import java.util.Scanner;

public class Exercise4 {
    public  static int brute(int len, int sum, int k, int s) {
        if(len == k) {
            return (sum==s)?1:0;
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for(int i = c; i < 10; i++) {
            res += brute(len + 1, sum + i, k, s);
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("4)Введите K число (k-значные числа) = ");
        int k4 = scanner.nextInt();
        System.out.print("4)Введите s (сумма цифр в числе) = ");
        int s4 = scanner.nextInt();
        System.out.println("Кол-во " + k4 + "-значных чисел суммой " + s4 + " cуществует = "+ brute(0,0,k4,s4));
    }
}
