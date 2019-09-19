/**
 * @(#)PrakNo03.java
 *
 *
 * @author 
 * @version 1.00 2019/9/19
 */

import java.util.Scanner;
public class PrakNo03 {

	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int Nilai;
		
		System.out.print("Masukkan Nilai = ");
		Nilai = input.nextInt();
	//Posisi IF Berjalan 
		if (Nilai % 2 == 0) {
			System.out.println("Angka Yang Dimasukkan Adalah Genap ");
		}
		else 
			System.out.println("Angka Yang Dimasukkan Adalah Bilangan Ganjil" );
		}
    }
    