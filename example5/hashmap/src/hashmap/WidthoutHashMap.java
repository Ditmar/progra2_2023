package hashmap;

import java.util.ArrayList;

public class WidthoutHashMap {
    public WidthoutHashMap() {

    }

    public ArrayList<Integer> repeatNumbers(ArrayList<Integer> numbers) {
        // sol
        Integer steps = 0;
        ArrayList<Integer> results = new ArrayList<>();
        for (Integer i = 0; i < numbers.size(); i++) {
            Integer count = 1;
            for (Integer j = i + 1; j < numbers.size(); j++) {
                steps++;
                if (numbers.get(i) == numbers.get(j)) {
                    count++;
                }
            }
            results.add(count);
        }
        System.out.println("la cantidad de pasos es " + steps);
        return results;
    }
}
