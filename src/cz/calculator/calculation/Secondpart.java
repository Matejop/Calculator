package cz.calculator.calculation;


import java.math.BigDecimal;
import java.util.Scanner;

public class Secondpart {

	public static void secondpart (){
		System.out.println("Te� napi� jestly to m� byt mocnina(!m!) nebo odmocnina(!o!).(!nema�kej Enter!).");
		System.out.println("Te� napi� ��slo s kter�m chce� po��tat tohle ��slo mus� b�t bu� za !m! nebo za !o!.(!Te� teprve zma�kn� Enter!).");
		Scanner reader=new Scanner(System.in); 
		String type=reader.nextLine();
		String taker;
		BigDecimal result;
		BigDecimal Firstfinal;
		if(type.charAt(0)=='m') {
			taker=type.substring(1,type.length());
			Firstfinal= new BigDecimal(taker);
			result=Firstfinal.multiply(Firstfinal);
			System.out.println(result);
		}
		double secondresult;
		if(type.charAt(0)=='o') {
			taker=type.substring(1,type.length());
			Firstfinal= new BigDecimal(taker);
			secondresult=Math.sqrt(Firstfinal.doubleValue());
			System.out.println(secondresult);
			

		
		
		}
	}

}