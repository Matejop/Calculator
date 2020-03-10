package cz.calculator.calculation;


	import java.math.BigDecimal;
import java.util.Scanner;

	public class Secondpart {

	public String power (String seven){
		BigDecimal result;
		BigDecimal Firstfinal;			
			Firstfinal= new BigDecimal(seven);
			result=Firstfinal.multiply(Firstfinal);
			return result.toString();
		
	}
	public String squareRoot (String seven){	
		BigDecimal Firstfinal;			
		double secondresult;			
			Firstfinal= new BigDecimal(seven);
			secondresult=Math.sqrt(Firstfinal.doubleValue());
			String stringresult=String.valueOf(secondresult);
			return stringresult;
		
	}

}