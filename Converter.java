public class Converter {

    void inttobiner (int decimal) {
         String binary = "";

         while (decimal > 0 || binary.length() < 8) {
             binary = (decimal % 2) + binary;
             decimal = decimal / 2;
         }
         System.out.println("Hasil Biner: " + binary);
     }

     void inttookt(int decimal) {
         String octal = "";

         while (decimal > 0) {
             octal = (decimal % 8) + octal;
             decimal = decimal / 8;
         }
         System.out.println("Hasil Oktal: " + octal);
     }

    void inttohexa(int decimal) {
        String hex = "";

        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            hex = hexChars[decimal % 16] + hex;
            decimal = decimal / 16;
        }
        System.out.println("Hasil Hexadecimal: " + hex);
    }

    void bintoint (String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }
        System.out.println("Hasil Integer: " + decimal);
    }
}
