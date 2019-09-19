/**
 * @(#)PrakNo01.java
 *
 *
 * @author 
 * @version 1.00 2019/9/19
 */


public class PrakNo01 {
	 public static void main (String[] args) {
	 	char HurufAwal = 'A';
	 	System.out.print ("Masukkan Huruf Awal Nama Anda : ");
	 	try{
	 			HurufAwal =(char)System.in.read();}
	 			catch(Exception e){
	 				System.out.println("Salah Ko Menginput Cess . . .!");}
	 				if (HurufAwal == 'A')
	 					System.out.println("Apa Namamu Amin ?");
	 				else if (HurufAwal == 'B') 
	 					System.out.println("Apa Namamu Bambang ?");
	 				else if (HurufAwal == 'C') 
	 					System.out.println("Apa Namamu Ceceo ?");
	 				else if (HurufAwal == 'D') 
	 					System.out.println("Apa Namamu Daud ?");
	 				else if (HurufAwal == 'E') 
	 					System.out.println("Apa Namamu Endang ?");
	 				else
	 					System.out.println("Aku Tidak Bisa Menebak ?");
	 			}}