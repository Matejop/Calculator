package cz.calculator.calculation;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator {
	
	public String calculate(String formula) {
		
		int a;
		int b;
		int c;
		int d;
		String nose;
		String stern;
		String collector=formula;
		a=collector.indexOf("+");
		int center=0;			  
		 if(a!=-1) {
			 center=a;
			 
		 }
		 
		 
		 b=collector.indexOf("/");
		 if(b!=-1) {
			 center=b;
			 
		 }
		 
		 c=collector.indexOf("*");
		 if(c!=-1) {
			 center=c;
			 
		 }
		 
		 d=collector.indexOf("-");
		 if(d!=-1) {
			 center=d;
			 
		 }
		 char Ncenter;
		 Ncenter=collector.charAt(center);
		 
		 BigDecimal Afinal;
		 BigDecimal Bfinal;
		 
		 nose=collector.substring(0,center);
		 stern=collector.substring(center+1,collector.length());
		 Afinal=new BigDecimal(nose);
		 Bfinal=new BigDecimal(stern);
		 
		 BigDecimal Result=null;
		  if(Ncenter=='+') {
			  Result= Afinal.add(Bfinal);
			  System.out.println(Result);
		 }
		 
		
		 if(Ncenter=='/') {
			 Result= Afinal.divide(Bfinal,10,BigDecimal.ROUND_HALF_UP);
			 System.out.println(Result);
		 }
		 
		 
		 if(Ncenter=='*') {
			 Result= Afinal.multiply(Bfinal);
			 System.out.println(Result);
		 }
		 
		 
		 if(Ncenter=='-') {
			 Result= Afinal.subtract(Bfinal);				 
			 System.out.println(Result);
		 }
		 return Result.toString();
	}
}
