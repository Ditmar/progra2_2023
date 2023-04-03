package hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class HashMapSol {

    public HashMapSol() {
    }

    public HashMap<Integer, Integer> repeatNumbers(ArrayList<Integer> numbers) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Integer steps = 0;
        for (Integer item : numbers) {
            if (!hashMap.containsKey(item)) {
                hashMap.put(item, 1);
            } else {
                Integer count = hashMap.get(item);
                count++;
                hashMap.put(item, count);
            }
            steps++;
        }
        System.out.println("la cantidad de pasos es " + steps);
        return hashMap;
    }
}
