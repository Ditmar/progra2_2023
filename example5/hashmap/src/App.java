import java.util.ArrayList;
import java.util.HashMap;

import hashmap.HashMapSol;
import hashmap.WidthoutHashMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        WidthoutHashMap widthoutHashMap = new WidthoutHashMap();
        ArrayList<Integer> list = new ArrayList();
        // Integer[] list = {1,2,1, 3,4,5,4};
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(4);
        ArrayList<Integer> results = widthoutHashMap.repeatNumbers(list);
        for (Integer item : results) {
            System.out.println(item);
        }
        HashMapSol hash = new HashMapSol();
        HashMap<Integer, Integer> results2 = hash.repeatNumbers(list);
        for (Integer item : results2.values()) {
            System.out.println(item);
        }
    }
}
