/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg7;

import java.util.Scanner;

/**
 *
 * @author win 7
 */
public class Latihan7 {
    public static void main(String[] args) {
        String identitas = "BAYU RIZQI FACHREZA RAMADHAN / XR5 / 07";
        System.out.println("Identitas : "+ identitas);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n SARAN RESEP DARI BAHAN MILIK ANDA\n");
        
        
        System.out.println("BAHAN PERTAMA : ");
        System.out.println("1. Pisang ");
        System.out.println("2. Telur ");
        System.out.println("3.Masukkan pilihan anda ");
        int bahan1 = scanner.nextInt();
        
      if(bahan1 == 1 || bahan1 == 2);
      {
          System.out.println("BAHAN KEDUA : ");
          if (bahan1 == 1) {
              System.out.println("1.SUSU");
              System.out.println("2.MINYAK GORENG");
              System.out.println("3.TIDAK ADA");
          }else{
              System.out.println("1.Minyak goreng");
              System.out.println("2.Roti");
              System.out.println("TIDAK ADA");
          }
          System.out.print("MASUKKAN NO PILIHAN ANDA");
          int bahan2 = scanner.nextInt();
      }else
        System.out.println("MOHON MAAF PILIHAN TIDAK DI TENTUKAN, "+
                "TIDAK BISA MEMBERIKAN SARAN RESEP");
              
          
          
      
        
           
    
    


    
    }
}
