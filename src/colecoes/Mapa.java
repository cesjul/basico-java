package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("User1-Value", 8.90);
        map.put("User2-Value", 9.1);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for (String key : map.keySet()) {
            System.out.println(key);
        }

         for (double value : map.values()) {
            System.out.println(value);
        }

        for (Entry<String, Double> register : map.entrySet()) {
            System.out.println(register);
        }
    }
}
