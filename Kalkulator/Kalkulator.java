
package kalkulator;

import java.util.Scanner;


public class Kalkulator {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int operasi;
        double angka1 , angka2 , hasil = 0;
        System.out.println("Program kalkulator sederhana :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Perkalian");
        System.out.println("3. Pengurangan");
        System.out.println("4. Pembagian");
        
        System.out.println("----------------------------------------");
        System.out.print("Masukkan angka pertama :");
        angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua : ");
        angka2 = input.nextInt();
        System.out.print("Masukkan operasi :");
        operasi = input.nextInt();
        
        if (operasi == 1){
            hasil = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 + " = " + hasil);
        }
        else if (operasi == 2){
            hasil = angka1 * angka2;
            System.out.println(angka1 + " x " + angka2 + " = " + hasil);
        }
        else if (operasi == 3){
            hasil = angka1 - angka2;
            System.out.println(angka1 + " - " + angka2 + " = " + hasil);
        }
        else if (operasi == 4){
            hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil); 
        }
        
        if(operasi > 0 && operasi < 5) {
            System.out.print(" ");
        }
        else {
            System.out.println("periksa kembali inputan anda!");
        }
        
        
    }
    
}
