import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Maria");
        nameList.add("Juan");
        nameList.add("Pedro");
        nameList.add("Mauricio");
        nameList.add("Alfredo");
        nameList.forEach((item) -> {
            System.out.println(item);
        });
        System.out.println("----------------");
        nameList.sort((a, b) -> {
            return b.compareTo(a);
        });
        nameList.forEach((item) -> {
            System.out.println(item);
        });
        nameList.removeIf(item -> {
            return item.equals("Pedro");
        });
        System.out.println("----------------");
        nameList.forEach((item) -> {
            System.out.println(item);
        });
    }
}
