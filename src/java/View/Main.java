package View;

import Model.Number;
import Controller.Converter;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

        private static void decimalMenu(Number number) {
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
                System.out.print("Insert a Decimal Number : ");
                number.setDecimal();
                System.out.println("Decimal Number     : " + number.getDecimal());
                System.out.println("Hasil dalam biner: " + Converter.inttobiner(number.getDecimal()));
                break;

            case 2:
                System.out.println("=====================* Decimal to Octal *=====================");
                System.out.print("Insert a Decimal Number : ");
                number.setDecimal();
                System.out.println("Decimal Number     : " + number.getDecimal());
                System.out.println("Hasil dalam oktal: " + Converter.inttookt(number.getDecimal()));
                break;

            case 3:
                System.out.println("=====================* Decimal to HexaDecimal *=====================");
                System.out.print("Insert a Decimal Number : ");
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
        int ans = 0;
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
                System.out.print("Insert a Octal Number : ");
                number.setOctal();
                System.out.println("Octal Number   : " + number.getOctal());
                ans = number.okttoint(number.getOctal());

                System.out.println("Hasil dalam desimal: " + Converter.okttoint(number.getOctal()));
                    break;
                break;

            case 2:
                System.out.println("=====================* Octal to Decimal *=====================");
                System.out.print("Insert a Octal Number : ");
                number.setOctal();
                System.out.println("Octal Number     : " + number.getOctal());
                System.out.println("Decimal Number   : " + Formula.octalToDecimal(number.getOctal()));
                break;

            case 3:
                System.out.println("=====================* Octal to HexaDecimal *=====================");
                System.out.print("Insert a Octal Number : ");
                number.setOctal();
                System.out.println("Octal Number       : " + number.getOctal());
                ans = Formula.octalToDecimal(number.getOctal());

                System.out.println("HexaDecimal Number : " + Formula.decimalToHexaDecimal(ans));
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid Input");

        }
    }


    public static void binerMenu(Number number){
        int ans = 0;
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
                System.out.print("Insert a Biner Number : ");
                number.setBiner();
                System.out.println("Biner Number   : " + number.getBiner());
                ans = Formula.binerToDecimal(number.getBiner());

                System.out.println("Octal Number   : " + Formula.decimalToOctal(ans));
                break;

            case 2:
                System.out.println("=====================* Biner to Decimal *=====================");
                System.out.print("Insert a Biner Number : ");
                number.setBiner();
                System.out.println("Biner Number     : " + number.getBiner());
                System.out.println("Decimal Number   : " + Formula.binerToDecimal(number.getOctal()));
                break;

            case 3:
                System.out.println("=====================* Biner to HexaDecimal *=====================");
                System.out.print("Insert a Biner Number : ");
                number.setBiner();
                System.out.println("Biner Number         : " + number.getBiner());
                ans = Formula.binerToDecimal(number.getBiner());

                System.out.println("HexaDecimal Number   : " + Formula.decimalToHexaDecimal(ans));
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid Input");

        }
    }


    public static void hexaDecimalMenu(Number number){
        int ans = 0;
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
                System.out.print("Insert a HexaDecimal Number : ");
                number.setHexaDecimal();
                System.out.println("HexaDecimal Number   : " + number.getHexaDecimal());
                ans = Formula.hexadecimalToDecimal(number.getHexaDecimal());

                System.out.println("Biner Number         : " + Formula.decimalToBiner(ans));
                break;

            case 2:
                System.out.println("=====================* HexaDecimal to Decimal *=====================");
                System.out.print("Insert a HexaDecimal Number : ");
                number.setHexaDecimal();
                System.out.println("HexaDecimal Number     : " + number.getHexaDecimal());
                System.out.println("Decimal Number         : " + Formula.hexadecimalToDecimal(number.getHexaDecimal()));
                break;

            case 3:
                System.out.println("=====================* HexaDecimal to Octal *=====================");
                System.out.print("Insert a HexaDecimal Number : ");
                number.setHexaDecimal();
                System.out.println("HexaDecimal Number : " + number.getHexaDecimal());
                ans = Formula.hexadecimalToDecimal(number.getHexaDecimal());

                System.out.println("Octal Number       : " + Formula.decimalToOctal(ans));
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid Input");

        }
    }

    public static void main(String[] args) {
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
        do {
            System.out.println("\n=== KONVERSI BILANGAN ===");
            System.out.println("1. Desimal ke Biner");
            System.out.println("2. Biner ke Desimal");
            System.out.println("3. Desimal ke Oktal");
            System.out.println("4. Oktal ke Desimal");
            System.out.println("5. Desimal ke Heksadesimal");
            System.out.println("6. Heksadesimal ke Desimal");
            System.out.println("7. Biner ke Oktal");
            System.out.println("8. Biner ke Heksadesimal");
            System.out.println("9. Keluar");
            System.out.print("Pilih operasi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  

            switch (pilihan) {
                case 1:
                    number.setDecimal();
                    System.out.println("Hasil dalam biner: " + Converter.inttobiner(number.getDecimal()));
                    break;

                case 2:
                    number.setBiner();
                    System.out.println("Hasil dalam desimal: " + Converter.bintoint(number.getBiner()));
                    break;

                case 3:
                    number.setDecimal();
                    System.out.println("Hasil dalam oktal: " + Converter.inttookt(number.getDecimal()));
                    break;

                case 4:
                    number.setOctal();
                    System.out.println("Hasil dalam desimal: " + Converter.okttoint(number.getOctal()));
                    break;

                case 5:
                    number.setDecimal();
                    System.out.println("Hasil dalam heksadesimal: " + Converter.inttohexa(number.getDecimal()));
                    break;

                case 6:
                    number.setHexaDecimal();
                    System.out.println("Hasil dalam desimal: " + Converter.hexatoint(number.getHexaDecimal()));
                    break;

                case 7:
                    number.setBiner();
                    System.out.println("Hasil dalam oktal: " + Converter.bintookt(number.getBiner()));
                    break;

                case 8:
                    number.setBiner();
                    System.out.println("Hasil dalam heksadesimal: " + Converter.bintohexa(number.getBiner()));
                    break;

                case 9:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 9);

        scanner.close();
    }

