/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan27.hurufbesarhurufkecil;
/**
 * @author  
 * Nama  : Aditiya Musthafa Kamil
 * Kelas : PBOIF2
 * NIM   : 10119075
 * Deskripsi Program : Program ini berisi program yang menampilkan Huruf Besar Huruf Kecil
 **/

import java.util.Scanner;
public class PBOIF210119075Latihan27HurufBesarHurufKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String kalimat;
       Scanner scanner = new Scanner (System.in);
       
       System.out.println("Masukkan Kalimat: ");
       kalimat = scanner.nextLine();
       
       String hurufBesar = kalimat.toUpperCase();
       String hurufKecil = kalimat.toLowerCase();
       
       System.out.println("Masukkan Kalimat: " + kalimat);
       System.out.println("HURUF Besar: " + hurufBesar);
       System.out.println("huruf kecil: " + hurufKecil);
       
       System.out.println("==========================");
       System.out.println("Developed by Aditiya Musthafa Kamil");
    }
    
}
