/**
 * @(#)Prak04.java
 *
 *
 * @author 
 * @version 1.00 2019/9/19
 */

import java.util.Scanner;
public class Prak04 {

	public static void main (String[] args) {
    	Scanner scan = new Scanner (System.in);
    	System.out.print("Berapa Banyak Yang Mau Diinputkan =");
    	int array = scan.nextInt();
    	int Nilai[]=new int [array];
    	int Min, Max;
    	
    	for (int N=0; N<array; N++)
    	{
    		System.out.print("Inputkan Nilai Ke-" +N+" : ");
    		
    		Nilai[N]=scan.nextInt(); 
    	}
    		
    			Min=Nilai[0];
    			Max=Nilai[0];
    				 System.out.println(" Nilai Yang Diinputkan adalah : ");
    				 for (int N=0; N<array; N++)
    				 { 
    				 	System.out.print(Nilai[N]+", ");
    				 	if (Nilai[N]<Min)
    				 			Min =Nilai[N];
    				 	if (Nilai[N]>Max)
    				 			Max = Nilai[N];
    				 }
    				 System.out.println();
    				 System.out.println("Min : "+Min+"\nMax : "+Max);
    				 }
    	} 