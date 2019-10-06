/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan22perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program menghitung lingkaran
 */
public class IF110118015Latihan22perhitunganlingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=======Perhitungan Lingkaran===========");
	System.out.print("Masukkan nilai diameter lingkaran : ");
	Scanner input = new Scanner(System.in);
	double diameter = 0;
	while (!input.hasNextDouble()){
		System.out.println("Nilai Diameter Tidak Sesuai");
                System.out.println();
		System.out.print("Masukkan nilai diameter lingkaran : ");
		input.next();
	}
	diameter = input.nextDouble();
        System.out.println();
	System.out.println("=======Hasil Perhitungan Lingkaran======");
	System.out.println("Jari-jari Lingkaran\t= " + (diameter/2) + " cm");
	System.out.println("Luas Lingkaran\t\t= " + (3.14*(diameter/2)*(diameter/2)) + " cm");
	System.out.println("Keliling Lingkaran\t= " + (3.14*diameter) + " cm");
        System.out.println("(Developed by : Adi Chandra Nugraha)");
    }
    
}
