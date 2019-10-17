/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package perhitunganlingkaran;

import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : (Object Oriented) Perhitungan Lingkaran
 */

public class PerhitunganLingkaran {
    public static int diameter;
    public static double jari2;
    public static double keliling;
    public static double luas;
    
    public static void hitungKeliling() {
	keliling = 3.14 * diameter;
    }

    public static void hitungLuas() {
    luas = 3.14 * Math.pow(jari2, 2) ;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        String validasi;

        do{
            System.out.print("Masukkan Nilai Diameter Lingkaran : ");
            validasi = input.nextLine();
     
            if (validasi.matches("[0-9]*")) {
                diameter = Integer.parseInt(validasi);
                jari2 = diameter / 2;
                hitungKeliling();
                hitungLuas();
                System.out.println("=====HASIL PERHITUNGAN=====");
                System.out.println("Jari-Jari Lingkaran\t= " + jari2 + " cm");
                System.out.printf("Luas Lingkaran\t\t= %.2f",luas);System.out.println(" cm");
                System.out.printf("Keliling Lingkaran\t= %.2f",keliling);System.out.println(" cm");
                valid = true;
                break;
            } 
            else {
                System.out.println("Nilai Diameter Tidak Sesuai");
                System.out.println("");
            }
        }while(!valid);
    }
    
}
