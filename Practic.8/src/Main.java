import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Pet first = new Cat("Misha");
        Pet second = new Dog("Zevs");
        Pet third = new Owl("Bird");

        Map<String, Pet> hashMap = new HashMap<>();
        hashMap.put(first.getName(),first);
        hashMap.put(second.getName(), second);
        hashMap.put(third.getName(),third);

        Set<Map.Entry<String, Pet>> set = hashMap.entrySet();

        for (Map.Entry<String, Pet> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }


        Random random = new Random(36);
        Map<Integer, Integer> hashMap2 = new HashMap<>();

        for (int i = 0; i < 100; i++){
            // Создадим число от 0 до 10
            int number = random.nextInt(10);
            Integer frequency = hashMap2.get(number);
            hashMap2.put(number, frequency == null ? 1 : frequency + 1);
        }
        System.out.println(hashMap2);
    }
}
