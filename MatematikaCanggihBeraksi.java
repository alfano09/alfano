/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatematikaCanggih;

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari MatematikaCanggih
        MatematikaCanggih kalkulator = new MatematikaCanggih();
        
        // Menggunakan metode pertambahan
        int a = 10;
        int b = 5;
        int hasilTambah = kalkulator.pertambahan(a, b);
        System.out.println("Hasil pertambahan " + a + " + " + b + " = " + hasilTambah);
        
        // Menggunakan metode perkalian
        int hasilKali = kalkulator.perkalian(a, b);
        System.out.println("Hasil perkalian " + a + " * " + b + " = " + hasilKali);
        
        // Menggunakan metode modulus
        int hasilModulus = kalkulator.modulus(a, b);
        System.out.println("Hasil modulus " + a + " % " + b + " = " + hasilModulus);
    }
}