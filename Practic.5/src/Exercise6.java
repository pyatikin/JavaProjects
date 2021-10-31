import java.util.Scanner;

public class Exercise6 {
    public static boolean simpleOrNot(int Simple, int check){
        if(check == Simple && Simple != 1){
            return true;
        }
        if(Simple%check==0 && check!=1 || Simple == 1){
            return false;
        }
        return simpleOrNot(Simple, ++check);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("6)Введите число (простое или нет) = ");
        int Simple6 = scanner.nextInt();
        System.out.println("Число " + Simple6 + " простое - " + ((simpleOrNot(Simple6, 1) == true) ? "Yes" : "No"));

    }
}
