import java.util.Scanner;

public class Exercise5 {
    public static int sumDigits(int k){
        if(k/10 == 0)
            return k;
        return k%10 + sumDigits(k/10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("5)Введите Число (сумма цифр в числе) = ");
        int k5 = scanner.nextInt();
        System.out.println("Сумма цифр в числе " + k5 + " = " + sumDigits(k5));
    }
}
