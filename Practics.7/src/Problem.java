import java.util.*;

public class Problem {
    public static void game(String first, String second){
        LinkedList<Integer> a = new LinkedList<Integer>();
        LinkedList<Integer> b = new LinkedList<Integer>();
        String[] one = first.split(" ");
        String[] two = second.split(" ");
        for(int i = 0; i<5;i++){
            a.addLast(Integer.parseInt(one[i]));
            b.addLast(Integer.parseInt(two[i]));
        }
        int count = 0;
        while (!a.isEmpty() && !b.isEmpty() && count < 106){
            int aGet = a.pop();
            int bGet = b.pop();
            LinkedList<Integer> winner = new LinkedList<Integer>();
            if(aGet == 0 && bGet == 9) {
                a.addLast(aGet);
                a.addLast(bGet);
            }
            else if(bGet ==0 && aGet == 9) {
                b.addLast(aGet);
                b.addLast(bGet);
            }
            else if (aGet > bGet) {
                a.addLast(aGet);
                a.addLast(bGet);
            }
            else {
                b.addLast(aGet);
                b.addLast(bGet);
            }
            count++;
        }
        if(a.isEmpty())
            System.out.println("second " + count);
        else if(b.isEmpty())
            System.out.println("first " + count);
        else
            System.out.println("botva\n");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first, second;
        System.out.println("Введите карты-числа первого игрока");
        first = scanner.nextLine();
        System.out.println("Введите карты-числа первого игрока");
        second = scanner.nextLine();
        System.out.println("Первый = " + first + "\nВторой = " + second);
        game(first,second);
    }
}
