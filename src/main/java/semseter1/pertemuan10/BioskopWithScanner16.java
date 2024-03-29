package semseter1.pertemuan10;

import java.util.Scanner;
public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama, pilih;
        int baris, kolom;
        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = input.nextLine();
            if (pilih.equals("1")) {
                while (true) {
                    System.out.print("Masukan nama: ");
                    nama = input.nextLine();
                    System.out.print("Masukan baris: ");
                    baris = input.nextInt();
                    System.out.print("Masukan kolom: ");
                    kolom = input.nextInt();
                    if (baris > 4 || kolom > 2) {
                        System.out.println("baris/kolom kursi tidak tersedia");
                        input.nextLine();
                        continue;
                    }
                    if (penonton[baris-1][kolom-1]!=null) {
                        System.out.println("Kursi telah terisi");
                        input.nextLine();
                        continue;
                    }
                    input.nextLine();
                    penonton[baris-1][kolom-1] = nama;
                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilih = input.nextLine();
                    if (pilih.equalsIgnoreCase("n")) break;
                }
            } else if (pilih.equals("2")) {
                for (int i = 0; i < penonton.length; i++) {
                    if (penonton[i][0]==null) penonton[i][0] = "***";
                    if (penonton[i][1]==null) penonton[i][1] = "***";
                    System.out.println("Penonton pada baris ke-"+(i+1)+ " : " + String.join(", ", penonton[i]));
                }
            } 
            else if (pilih.equals("3")) break;
            else System.out.println("Input tidak dimengerti");
        }
    }
}
