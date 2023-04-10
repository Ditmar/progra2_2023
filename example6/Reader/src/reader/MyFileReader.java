package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    private BufferedReader reader;

    public MyFileReader(String path) {
        try {
            FileReader fileReader = new FileReader(path);
            this.reader = new BufferedReader(fileReader);
        } catch (FileNotFoundException err) {
            System.out.println(err.getMessage());
        }
    }

    public String getFileData() {
        StringBuilder result = new StringBuilder("");
        String line;
        try {
            while ((line = this.reader.readLine()) != null) {
                result.append(line + "\n");
            }
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }

        return result.toString();
    }
}
