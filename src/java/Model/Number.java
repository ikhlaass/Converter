package Model;

import java.util.Scanner;

public class Number {
    private String biner;
    private String hexaDecimal;
    private String octal;
    private int decimal;
    private Scanner scanner = new Scanner(System.in);

    // Getter
    public String getHexaDecimal() {
        return hexaDecimal;
    }

    public String getOctal() {
        return octal;
    }

    public int getDecimal() {
        return decimal;
    }

    public String getBiner() {
        return biner;
    }

    // Setter
    public void setBiner() {
        System.out.print("Masukkan bilangan biner: ");
        this.biner = scanner.nextLine();
    }

    public void setDecimal() {
        System.out.print("Masukkan bilangan desimal: ");
        this.decimal = scanner.nextInt();
    }

    public void setHexaDecimal() {
        System.out.print("Masukkan bilangan heksadesimal: ");
        this.hexaDecimal = scanner.nextLine();
    }

    public void setOctal() {
        System.out.print("Masukkan bilangan oktal: ");
        this.octal = scanner.nextLine();
    }
}
