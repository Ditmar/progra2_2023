import convert.ConvertToBinary;

public class App {
    public static void main(String[] args) throws Exception {
        ConvertToBinary convert = new ConvertToBinary("192.168.10.40");
        String ipBinary = convert.getBinary();
        System.out.println(ipBinary);
    }
}
