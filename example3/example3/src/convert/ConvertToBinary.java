package convert;

public class ConvertToBinary {
    private String ip;
    public ConvertToBinary(String ip) {
        this.ip = ip;
    }
    public String getBinary() {
        // 192.168.1.1
        String[] splitedIp = this.ip.split("[.]");
        StringBuilder result = new StringBuilder("");
        for (String elementString : splitedIp) {
            // casting from string to Integer
            Integer number = Integer.parseInt(elementString);
            String binary = this.getBinaryToDecimal(number);
            binary = this.getInformat(binary);
            result.append(binary);
            result.append(".");
        }
        return result.toString();
    }
    private String getInformat(String binary) {
        String completeCeros = "";
        if (binary.length() < 8) {
            completeCeros = "0000000";
            Integer difference = 8 - binary.length();
            completeCeros = completeCeros.substring(0, difference);
        }
        return completeCeros + binary;
    }
    private String getBinaryToDecimal(Integer number) {
        String binary = Integer.toBinaryString(number);
        return binary;
    }
}
