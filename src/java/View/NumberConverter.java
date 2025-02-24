package View;

import java.util.Scanner;
import Controller.Converter;


public class NumberConverter {
    private static final Scanner scanner = new Scanner(System.in);

    public static void run() {
        int choice;
        do {
                System.out.print("\033[H\033[2J");
                System.out.println("===== Konversi Bilangan =====");
                System.out.println("1. Integer ke Biner");
                System.out.println("2. Integer ke Oktal");
                System.out.println("3. Integer ke Hexadecimal");
                System.out.println("4. Biner ke Integer");
                System.out.println("5. Oktal ke Integer");
                System.out.println("6. Hexadecimal ke Integer");
                System.out.println("7. Biner ke Oktal");
                System.out.println("8. Biner ke Hexadecimal");
                System.out.println("9. Keluar");
                System.out.print("Pilih opsi: ");
                
                choice = scanner.nextInt();
                scanner.nextLine(); 

                if (choice == 1) {
                    System.out.print("Masukkan Integer: ");
                    int decimal = scanner.nextInt();
                    System.out.println("Hasil Biner: " + Converter.inttobiner(decimal));
                } else if (choice == 2) {
                    System.out.print("Masukkan Integer: ");
                    int decimal = scanner.nextInt();
                    System.out.println("Hasil Oktal: " + Converter.inttookt(decimal));
                } else if (choice == 3) {
                    System.out.print("Masukkan Integer: ");
                    int decimal = scanner.nextInt();
                    System.out.println("Hasil Hexadecimal: " + Converter.inttohexa(decimal));
                } else if (choice == 4) {
                    System.out.print("Masukkan Biner: ");
                    String binary = scanner.next();
                    System.out.println("Hasil Integer: " + Converter.bintoint(binary));
                } else if (choice == 5) {
                    System.out.print("Masukkan Oktal: ");
                    String octal = scanner.next();
                    System.out.println("Hasil Integer: " + Converter.okttoint(octal));
                } else if (choice == 6) {
                    System.out.print("Masukkan Hexadecimal: ");
                    String hex = scanner.next();
                    System.out.println("Hasil Integer: " + Converter.hexatoint(hex));
                } else if (choice == 7) {
                    System.out.print("Masukkan Biner: ");
                    String binary = scanner.next();
                    System.out.println("Hasil Oktal: " + Converter.bintookt(binary));
                } else if (choice == 8) {
                    System.out.print("Masukkan Biner: ");
                    String binary = scanner.next();
                    System.out.println("Hasil Hexadecimal: " + Converter.bintohexa(binary));
                } else if (choice == 9) {
                    System.out.println("Keluar dari program.");
                    break;
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
                System.out.println();
        }while(choice != 9);
        scanner.close();
    }
}
