import java.util.*;

public class Main {
    public static void main(String[] args) {

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");

        List<String> solarSystem = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter)));
        ArrayList<String> solarSystem1 = new ArrayList<>(Arrays.asList(mercury, venus, earth));
        Collections.addAll(solarSystem1, mars);
        solarSystem1.remove(mercury);
        solarSystem1.set(solarSystem1.indexOf(venus),jupiter);
        Collections.shuffle(solarSystem1);
        Random rand = new Random();
        String str = solarSystem1.get(rand.nextInt(solarSystem1.size()));
        solarSystem1.indexOf(earth);
        solarSystem1.contains(mercury);
        solarSystem1.removeAll(solarSystem);
        if(solarSystem1.isEmpty())
            System.out.println("Список пуст");
    }
}