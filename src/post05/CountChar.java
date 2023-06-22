package post05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String s = "";
        Map<Character, Integer> simvols = new HashMap<>();

//        try (Scanner scanner = new Scanner(System.in)) {
//            s = scanner.nextLine();
//        }
        String str = "TTaaaabbbeecufea";
        simvols = map_input(str); // записывает сроку в Map (уникальный символ | количесвто вхождений)
        simvols.entrySet().stream() //сорерует по количесву вхождений
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed());

        printMap_butiful(simvols);

    }

    public static void printMap_butiful( Map<Character, Integer> simvols) {
//        simvols.entrySet().stream().filter(Map.Entry.<Character, Integer>)
//        System.out.println(3.6 * 7);
//        simvols1
        throw new NullPointerException();
    }



    public static Map<Character, Integer> map_input(String str) {
        Map<Character, Integer> simvols = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!simvols.containsKey(c))
                simvols.put(c, 1);
            else {
                Integer integer = simvols.get(c);
                simvols.put(c, ++integer);
            }
        }
        return simvols;
    }
}
