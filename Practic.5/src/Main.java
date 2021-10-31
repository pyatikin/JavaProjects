import java.util.Scanner;

public class Main {

    public static void sequence(int n, int check){
        for(int i =0; i < check; i++)
        System.out.print(check + " ");
        if (check < n){
            sequence(n, ++check);
        }
    }

    public static void from1ToN(int n, int check){
        System.out.print(check + " ");
        if(check <  n)
            from1ToN(n, ++check);
    }

    public static void fromAToB(int A, int B, int check){
        if(check==0){
            if(A <= B)
                check = 1;
            else if(A >= B)
                check = -1;

        }
        if(check == 1 && A<=B ){
            System.out.print(A + " ");
            fromAToB(++A,B, check);
        }
        else if (check == -1 && A >= B) {
            System.out.print(A + " ");
            fromAToB(--A, B, check);
        }
    }

    public static int sumDigits(int k){
        if(k/10 == 0)
            return k;
        return k%10 + sumDigits(k/10);
    }

    public static boolean simpleOrNot(int Simple, int check){
        if(check == Simple && Simple != 1){
            return true;
        }
        if(Simple%check==0 && check!=1 || Simple == 1){
            return false;
        }
        return simpleOrNot(Simple, ++check);
    }

    public static void showMultipliers(int Multiplier, int check){
        if(check <= Multiplier){
            if(Multiplier%check == 0 && simpleOrNot(check,1)){
                System.out.print(check + " ");
                Multiplier /= check;
                showMultipliers(Multiplier, check);
            }
            else {
                showMultipliers(Multiplier, ++check);
            }
        }
        return;
    }

    public static int howMuchCombinations(int A0, int B1){
        if(A0 == 0 && B1 != 0)
            return 1;
        if(A0 == 1)
            return (B1+1);
        if(A0>1 && B1 ==0)
            return 0;
        return howMuchCombinations(A0-1, B1-1) + howMuchCombinations(A0, B1-1);

    }

    public static int countOnes(int [] mass, int index, int check){
        int i = 0;
        if(check == 2)
            return 0;

        if(index != mass.length-1) {
            if (mass[index] == 0)
                check++;
            i = countOnes(mass, ++index, check);
        }
        if(mass[--index] == 1)
            return i + 1;

        return i;
    }

    public static void showOnlyOdd(int [] mass, int index){
        if(mass[index-1] == 0)
            return;
        if(index % 2 ==1){
            System.out.print(mass[index-1] + " ");
        }
        if(index != mass.length )
            showOnlyOdd(mass, ++index);
    }

    public static void reverseDigit(long num){
        System.out.print(num % 10 + " ");
        if(num /  10 != 0)
            reverseDigit(num/10);
    }

    public static int showMax(Scanner sc){
        int curr = sc.nextInt();
        if(curr == 0)
            return 0;
        int next = showMax(sc);
        System.gc();
        return (curr>next)?curr:next;
    }

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

    public static int kAndS(int k, int s){
        int res = 0;
        if(k != 0) {
            for (int i = 0; i < 10; i++){
                if(sumDigits(i) == s)
                    res++;
                res += kAndS(k-1, s);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания для проверки (0 для выхода) =");
        int NumberOfExercise = scanner.nextInt();
        while(NumberOfExercise != 0) {
            switch (NumberOfExercise) {
                case 1:
                    System.out.print("1)Введите n для треугольной последовательности = ");
                    int n1 = scanner.nextInt();
                    sequence(n1, 1);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("2)Введите n для последовательности от 1 до n = ");
                    int n2 = scanner.nextInt();
                    from1ToN(n2, 1);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("3)Введите A (от А до В) = ");
                    int A3 = scanner.nextInt();
                    System.out.print("Введите В (от А до В) = ");
                    int B3 = scanner.nextInt();
                    fromAToB(A3, B3, 0);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("4)Введите K число (k-значные числа) = ");
                    int k4 = scanner.nextInt();
                    System.out.print("4)Введите s (сумма цифр в числе) = ");
                    int s4 = scanner.nextInt();
                    System.out.println("Кол-во " + k4 + "-значных чисел суммой " + s4 + " cуществует = "+ brute(0,0,k4,s4));

                case 5:
                    System.out.print("5)Введите Число (сумма цифр в числе) = ");
                    int k5 = scanner.nextInt();
                    System.out.println("Сумма цифр в числе " + k5 + " = " + sumDigits(k5));
                    break;

                case 6:
                    System.out.print("6)Введите число (простое или нет) = ");
                    int Simple6 = scanner.nextInt();
                    System.out.println("Число " + Simple6 + " простое - " + ((simpleOrNot(Simple6, 1) == true) ? "Yes" : "No"));
                    break;

                case 7:
                    System.out.print("7)Введите число (разложить на простые множители) = ");
                    int Multiplier7 = scanner.nextInt();
                    showMultipliers(Multiplier7, 1);
                    System.out.println();
                    break;

                case 9:
                    System.out.print("9)Введите a (кол-во нулей) = ");
                    int A9 = scanner.nextInt();
                    System.out.print("9)Введите b (кол-во едениц) = ");
                    int B9 = scanner.nextInt();
                    System.out.println(howMuchCombinations(A9, B9));
                    break;

                case 11:
                    System.out.print("11)Введите строку в конце 2 нуля (кол-во единиц в последовательности) = ");
                    scanner.nextLine();
                    String str11 = scanner.nextLine();
                    String[] strs11 = str11.split(" ");
                    int[] mass11 = new int[strs11.length];
                    for (int i = 0; i < mass11.length; i++)
                        mass11[i] = Integer.parseInt(strs11[i]);
                    System.out.println("Кол-во единиц в последовательности = " + countOnes(mass11, 0, 0));
                    break;


                case 13:
                    System.out.print("13)Введите строку (последовательность чисел, вывод нечетных) = ");
                    scanner.nextLine();
                    String string13 = scanner.nextLine();
                    String[] strs13 = string13.split(" ");
                    int[] mass13 = new int[strs13.length];
                    for (int i = 0; i < mass13.length; i++)
                        mass13[i] = Integer.parseInt(strs13[i]);
                    showOnlyOdd(mass13, 1);
                    System.out.println();
                    break;


                case 15:
                    System.out.print("15)Введите число n (число наоборот) = ");
                    long N15 = scanner.nextLong();
                    reverseDigit(N15);
                    break;
                case 17:

                    System.out.println("17)Вводите числа(каждое на новой строке) в конце введите ноль");
                    System.out.println("Максимальное число последовательности = " + showMax(scanner));
                    break;

                default:
                    System.out.println("Номера от 1 до 17!");
                    break;

            }
            System.out.print("Введите номер задания для проверки (0 для выхода) =");
            NumberOfExercise = scanner.nextInt();
        }
    }
}
