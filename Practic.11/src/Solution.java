import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Horse Racing
Разберись, что делает программа.
Реализуй метод calculateHorsesFinished. Он должен:
1. Посчитать количество финишировавших лошадей и возвратить его. Используй метод isFinished().
2. Если лошадь еще не пришла к финишу (!isFinished()), то:
2.1. Вывести в консоль "Waiting for " + horse.getName().
2.2. Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого.
*/

public class Solution {
    public static int countHorses = 10;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        countHorses = scanner.nextInt();
        List<Horse> horses = prepareHorsesAndStart();
        while (calculateHorsesFinished(horses) != countHorses) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horse) throws InterruptedException {
        int countFinished = 0;
        //add your implementation here - добавь свою реалзацию тут
        for (int i = 0;i<horse.size();i++)
            if (horse.get(i).isFinished)
            {
                countFinished++;
            }
            else if(horse.get(i).isFinished() == false)
            {
                //System.out.println("Waiting for " + horse.get(i).getName());
                horse.get(i).join();
            }

        return countFinished;
    }
        public static List<Horse> prepareHorsesAndStart() {
        List<Horse> horses = new ArrayList<Horse>(countHorses);
        String number;
        for (int i = 1; i < countHorses + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        for (int i = 0; i < countHorses; i++) {
            horses.get(i).start();
        }
        return horses;
    }
    public static class Horse extends Thread {

        public Horse(String name) {
            super(name);
        }

        private boolean isFinished;

        public boolean isFinished() {
            return isFinished;
        }

        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {   //delay
                s += new String("" + i);
                if (i == 1000) {
                    s = " has finished the race!";
                    System.out.println(getName() + s);
                    isFinished = true;
                }
            }
        }
    }
}