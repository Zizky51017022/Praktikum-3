/**
 * @(#)Latihan01.java
 *
 *
 * @author 
 * @version 1.00 2019/9/19
 */

import java.util.Scanner;
public class Latihan01 {

    public static void main (String[] args) {
    Scanner TipePesawat = new Scanner (System.in);
    int Kode;
    
    System.out.println("Masukkan Kode Tipe Pesawat = ");
    Kode =TipePesawat.nextInt();
    if (Kode ==1){
    	System.out.println("Pesawat Garuda");}
    else if (Kode ==2){
    	System.out.println("Pesawat Batik");}
    else if (Kode ==3){
    	System.out.println("Pesawat Lion");}
    else { System.out.println("Maaf Anda Salah Memasukkan Kode Tipe Pesawat");
    }
    }
    }    			
    
    
    
