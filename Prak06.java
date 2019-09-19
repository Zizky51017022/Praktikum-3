/**
 * @(#)Prak06.java
 *
 *
 * @author 
 * @version 1.00 2019/9/19
 */


public class Prak06 {

   public static void main (String[] args) {
   	char HA = 'A';
    	System.out.print ("Masukkan Huruf Awal Nama Anda : ");
    	try{
    		HA = (char)System.in.read();
    	}catch(Exception e){
    		System.out.println ("Salah Ko Menginput Cess!!!");
    	}
    	switch(HA){
    	case (char)-1 : System.out.println("Bukan Huruf Depan !!!");break;
    	case 'A' : System.out.println("Apa Namaku Amin?"); break;
    	case 'B' : System.out.println ("Apa Namaku Bambang?"); break;
    	case 'C' : System.out.println("Apa Namaku Ceceo?");break;
    	case 'D' : System.out.println ("Apa Namaku Daud?");break;
    	case 'E' : System.out.println ("Apa Namaku Endang?");break;
    	default : System.out.println ("Aku Tidak Bisa Menebak Lagi");
    	}
  	}
}

   