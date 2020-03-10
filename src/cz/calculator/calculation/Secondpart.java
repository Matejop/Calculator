package cz.calculator.calculation;


import java.math.BigDecimal;
import java.util.Scanner;

public class Secondpart {

	public static void secondpart (){
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