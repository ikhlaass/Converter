public class Converter {

    public static String inttobiner (int decimal) {
         String binary = "";

         while (decimal > 0 || binary.length() < 8) {
             binary = (decimal % 2) + binary;
             decimal = decimal / 2;
         }
         return binary;
     }

     public static String inttookt(int decimal) {
         String octal = "";

         while (decimal > 0) {
             octal = (decimal % 8) + octal;
             decimal = decimal / 8;
         }
            return octal;
     }

     public static String inttohexa(int decimal) {
        String hex = "";

        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            hex = hexChars[decimal % 16] + hex;
            decimal = decimal / 16;
        }
        return hex;
    }

    public static int bintoint (String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }
        return decimal;
    }

    public static int okttoint(String Oktal) {
        int decimal = 0;
        for (int i = 0; i < octal.length(); i++) {
            decimal = decimal * 8 + (octal.charAt(i) - '0');
        }
        return decimal;
    }

    public static int hexatoint(String hex) {
        int decimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            int hexValue;
            if (hexChar >= '0' && hexChar <= '9') {
                hexValue = hexChar - '0';
            } else {
                hexValue = hexChar - 'A' + 10;
            }
            decimal = decimal * 16 + hexValue;
        }
        return decimal;
    }

    public static String bintookt(String binary) {
        int decimal = 0;
                for (int i = 0; i < binary.length(); i++) {
                    decimal = decimal * 2 + (binary.charAt(i) - '0');
                }
                String octal = "";
                while (decimal > 0) {
                    octal = (decimal % 8) + octal;
                    decimal = decimal / 8;
                }
                return decimal;
    }

    public static int bintohexa(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }
        String hex = "";
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            hex = hexChars[decimal % 16] + hex;
            decimal = decimal / 16;
        }
        return decimal;
    }

}
