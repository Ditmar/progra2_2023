import java.io.File;

import reader.MyFileReader;
import reader.Reader;

public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println("leer mis propios datos desde mi propio reder!");
        // Reader reader = new Reader(System.in);
        // String data = reader.next();
        // System.out.println(data);
        MyFileReader file = new MyFileReader("/Users/ditmarcastroangulo/Desktop/studentList.txt");
        String dataFile = file.getFileData();
        System.out.println(dataFile);
    }
}
