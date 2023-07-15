import java.util.*;

//        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//        Вывести название каждой планеты и количество его повторений в списке. Collections.frequency(list, item)
public class Homework3_3 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Нибиру");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");
        System.out.println(planets);
        Random random = new Random();
        System.out.println(random.nextInt(0,planets.size()));
        ArrayList<String> randomPlanets = new ArrayList<>();
        for (int i = 0; i < random.nextInt(5,25); i++) {
            randomPlanets.add(planets.get(random.nextInt(0,planets.size())));
        }
        System.out.println("набор планет - " + randomPlanets);
        printPlanetSet(planetSet(randomPlanets));
    }
    public static ArrayList<ArrayList<String>> planetSet (ArrayList randomPlanets){
        ArrayList<ArrayList<String>> planetFrequency = new ArrayList<>();
        ArrayList<String> pastPlanets = new ArrayList<>();
        for (int i = 0; i < randomPlanets.size(); i++) {
            if (!pastPlanets.contains(randomPlanets.get(i))){
                ArrayList<String> currentPlanetInfo = new ArrayList<>();
                currentPlanetInfo.add((String) randomPlanets.get(i));
                currentPlanetInfo.add(String.valueOf(Collections.frequency(randomPlanets, randomPlanets.get(i))));
                planetFrequency.add(currentPlanetInfo);
                pastPlanets.add((String) randomPlanets.get(i));
            }
        }
        return planetFrequency;
    }
    public static void printPlanetSet (ArrayList<ArrayList<String>> planetFrequency){
        for (ArrayList el: planetFrequency
        ) {
            System.out.println(el.get(0) + " встречается " + el.get(1) + " раз");
        }
    }
}
