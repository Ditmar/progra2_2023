import java.util.ArrayList;

import arrayextension.ArrayData;
import arrayextension.ImproveData;

public class App {
    public static void main(String[] args) throws Exception {
        // ArrayList<String> list = new ArrayList<>();
        // list.add("Maria");
        // list.add("Juan");
        // list.add("Bonifacio");
        // list.add("Cinthia");
        // list.add("Mario");
        // ArrayData data = new ArrayData();
        // data.setData(list);
        // data.map((item) -> {
        // System.out.println(" Hola " + item);
        // return item;
        // });
        // System.out.println(" -------------------- ");
        // ArrayList<String> result = data.filter((item) -> {
        // return !item.equals("Juan");
        // });
        // for (String item : result) {
        // System.out.println(" Hola " + item);
        // }
        ImproveData<String> list = new ImproveData<>();
        list.add("maria");
        list.add("juan");
        list.add("jose");
        list.map(item -> {
            System.out.println(" Hola " + item);
            return item;
        });
        System.out.println(" ----------filter---------- ");
        ImproveData<String> result = list.filter(item -> {
            return !item.equals("juan");
        });
        System.out.println(" --------result filter------------ ");
        result.map(item -> {
            System.out.println(" Hola " + item);
            return item;
        });
    }
}
