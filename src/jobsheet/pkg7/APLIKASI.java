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
public class APLIKASI {
    public static void main(String[]args){
        
    
        String identitas = "BAYU RIZQI FACHREZA RAMADHAN / XR5 / 07";
        System.out.println("Identitas : "+ identitas);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n SARAN RESEP DARI BAHAN MILIK ANDA\n");
        
        
        System.out.println("BAHAN PERTAMA : ");
        System.out.println("1. TEH ");
        System.out.println("2. AIR HANGAT ");
        System.out.println("3.Masukkan pilihan anda : ");
        int bahan1 = scanner.nextInt();
        
      if(bahan1 == 1 || bahan1 == 2);
      
          System.out.println("BAHAN KEDUA : ");
          if (bahan1 == 1) {
              System.out.println("1.KOPI");
              System.out.println("2.SUSU");
              System.out.println("3.TIDAK ADA");
          }else{
              System.out.println("1.GULA");
              System.out.println("2.AIR DINGIN");
              System.out.println("TIDAK ADA");
          }
          System.out.print("MASUKKAN NO PILIHAN ANDA : ");
          int bahan2 = scanner.nextInt();
      
          
          
          if(bahan2 >= 1 && bahan2<= 3)
          {
              if(bahan1==1)
                  switch(bahan2)
                     {
                      
                      case 1:System.out.println("Anda dapat membuat KOPI");break;
                      case 2:System.out.println("Anda dapat membuat SUSU");break;
                      case 3:System.out.println("Anda dapat membuat KOPI SUSU");break;
                      case 4:System.out.println("TEH TAWAR");
                      
                      
                  }
      }else 
              
        System.out.println("MOHON MAAF PILIHAN TIDAK DI TENTUKAN, "+
                "TIDAK BISA MEMBERIKAN SARAN RESEP");
      }
    }
    

