package View;

import Model.Number;
import Controller.Converter;
import java.util.Scanner;

public class ViewMain {
    private static final Scanner scanner = new Scanner(System.in);

        public static void decimalMenu(Number number) {
        System.out.println("=====================* Decimal Converter *=====================");
        System.out.println("1.Decimal to Biner");
        System.out.println("2.Decimal to Octal");
        System.out.println("3.Decimal to HexaDecimal");
        System.out.println("4.Exit");
        System.out.print("Insert your option : ");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {

            case 1:
                System.out.println("=====================* Decimal to Biner *=====================");
                number.setDecimal();
                System.out.println("Decimal Number     : " + number.getDecimal());
                System.out.println("Hasil dalam biner: " + Converter.inttobiner(number.getDecimal()));
                break;

            case 2:
                System.out.println("=====================* Decimal to Octal *=====================");
                number.setDecimal();
                System.out.println("Decimal Number     : " + number.getDecimal());
                System.out.println("Hasil dalam oktal: " + Converter.inttookt(number.getDecimal()));
                break;

            case 3:
                System.out.println("=====================* Decimal to HexaDecimal *=====================");
                number.setDecimal();
                System.out.println("Decimal Number     : " + number.getDecimal());
                System.out.println("Hasil dalam heksadesimal: " + Converter.inttohexa(number.getDecimal()));
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid input!");
        }
    }

    public static void octalMenu(Number number) {
        System.out.println("=====================* Octal Converter *=====================");
        System.out.println("1.Octal to Biner");
        System.out.println("2.Octal to Decimal");
        System.out.println("3.Octal to HexaDecimal");
        System.out.println("4.Exit");
        System.out.print("Insert your option : ");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {

            case 1:
                System.out.println("=====================* Octal to Biner *=====================");
                number.setOctal();
                System.out.println("Octal Number   : " + number.getOctal());
                System.out.println("Hasil dalam desimal: " + Converter.okttoint(number.getOctal()));
                break;

            case 2:
                System.out.println("=====================* Octal to Decimal *=====================");
                number.setOctal();
                System.out.println("Octal Number     : " + number.getOctal());
                System.out.println("Decimal Number   : " + Converter.okttoint(number.getOctal()));
                break;

            case 3:
                System.out.println("=====================* Octal to HexaDecimal *=====================");
                number.setOctal();
                System.out.println("Octal Number       : " + number.getOctal());
                System.out.println("HexaDecimal Number : " + Converter.okttohexa(number.getHexaDecimal()));
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid Input");

        }
    }


    public static void binerMenu(Number number){
        System.out.println("=====================* Biner Converter *=====================");
        System.out.println("1.Biner to Octal");
        System.out.println("2.Biner to Decimal");
        System.out.println("3.Biner to HexaDecimal");
        System.out.println("4.Exit");
        System.out.print("Insert your option : ");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {

            case 1:
                System.out.println("=====================* Biner to Octal *=====================");
                number.setBiner();
                System.out.println("Biner Number   : " + number.getBiner());
                System.out.println("Octal Number   : " + Converter.bintookt(number.getBiner()));
                break;

            case 2:
                System.out.println("=====================* Biner to Decimal *=====================");
                number.setBiner();
                System.out.println("Biner Number     : " + number.getBiner());
                System.out.println("Decimal Number   : " + Converter.bintoint(number.getOctal()));
                break;

            case 3:
                System.out.println("=====================* Biner to HexaDecimal *=====================");
                number.setBiner();
                System.out.println("Biner Number         : " + number.getBiner());
                System.out.println("HexaDecimal Number   : " + Converter.bintohexa(number.getBiner()));
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid Input");

        }
    }

    public static void hexaDecimalMenu(Number number){
        System.out.println("=====================* hexaDecimalMenu Converter *=====================");
        System.out.println("1.HexaDecimal to Biner");
        System.out.println("2.HexaDecimal to Decimal");
        System.out.println("3.HexaDecimal to Octal");
        System.out.println("4.Exit");
        System.out.print("Insert your option : ");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {

            case 1:
                System.out.println("=====================* HexaDecimal to Biner *=====================");
                number.setHexaDecimal();
                System.out.println("HexaDecimal Number   : " + number.getHexaDecimal());
                System.out.println("Biner Number         : " + Converter.hexatobin(number.getHexaDecimal()));
                break;

            case 2:
                System.out.println("=====================* HexaDecimal to Decimal *=====================");
                number.setHexaDecimal();
                System.out.println("HexaDecimal Number     : " + number.getHexaDecimal());
                System.out.println("Decimal Number         : " + Converter.hexatoint(number.getHexaDecimal()));
                break;

            case 3:
                System.out.println("=====================* HexaDecimal to Octal *=====================");
                number.setHexaDecimal();
                System.out.println("HexaDecimal Number : " + number.getHexaDecimal());
                System.out.println("Octal Number       : " + Converter.hexatookt(number.getHexaDecimal()));
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid Input");

        }
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Number number = new Number();
        boolean flag = true;

        do {
            System.out.println("=====================* Decimal,Hexa,Biner,Octal Converter *=====================");
            System.out.println("1.Decimal");
            System.out.println("2.Octal");
            System.out.println("3.Biner");
            System.out.println("4.HexaDecimal");
            System.out.println("5.Exit");
            System.out.print("Insert your option : ");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                decimalMenu(number);
            }

            else if (input == 2) {
                octalMenu(number);
            }

            else if (input == 3) {
                binerMenu(number);
            }

            else if (input == 4) {
                hexaDecimalMenu(number);
            }
            else if (input == 5) {
                System.out.println("bye!");
                flag = false;
            }
            else {
                System.out.println("Invalid input");
            }

        } while (flag);
    }
}
