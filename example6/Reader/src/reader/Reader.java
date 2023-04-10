package reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//import javax.print.PrintException;

public class Reader {
    private BufferedReader reader;

    public Reader(InputStream input) {
        InputStreamReader inputReader = new InputStreamReader(input);
        this.reader = new BufferedReader(inputReader);
    }

    public String next() {
        String data = "";
        try {
            data = this.reader.readLine();
        } catch (IOException err) {
            System.out.println(err.getMessage());
            // PrintException exp = new PrintException();
            // exp.printStackTrace();
            // saca un mensaje de error
        }
        return data;
    }
}
