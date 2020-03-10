package cz.calculator.calculation;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import cz.calculator.UI.Button;
import cz.calculator.UI.DrawingCanvas;
	public class Mouse implements MouseListener {
	public ArrayList<Button> buttons;
	String cutout= new String();
	String collector= new String();
	ArrayList numbers;
	char operation;
	@Override
	public void mousePressed(MouseEvent position) {
		Object information=position.getSource();
		DrawingCanvas mycanvas;
		mycanvas=(DrawingCanvas)information;
		position.getX();
		position.getY();
		int pointA=position.getY();
		int PointB=position.getX();
		//System.out.println(pointA);
		//System.out.println(PointB);
		int intbutton;
		
		for(intbutton=0;intbutton<buttons.size();intbutton++){
			Button taken=buttons.get(intbutton);
			if(taken.leftupper.x<position.getX()) {
				
				if(taken.leftupper.y<position.getY()) {
					
					if(taken.rightlower.x>position.getX()) {
						
						if(taken.rightlower.y>position.getY()){
							if(taken.label=='*'||taken.label=='/'||taken.label=='-'||taken.label=='+') {
								if(collector.length()==0) { //"length" KDYZ NAPISU LENGTH TAK SE MY VRATI DELKA PROMENY.
									return;  
								}
									int a;
									int b;
									int c;
									int d;
									int center=-1;	
									a=collector.indexOf("+");		  
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
									 //  Zkontroluje jestli neni na konci dalsi operator(/,*,-,+) a kdyz tam je tak zameni predchozi s tim novim.
									 	
									 if(center==collector.length()-1) {
										 cutout=collector.substring(0,collector.length()-1 );
										 collector=cutout;
										 collector=collector+taken.label;
										 mycanvas.display=collector;
										 mycanvas.repaint();
										 return;
									 }
									 else {
										if(center!=-1) {
											 Calculator taker;
											 taker= new Calculator();
											 collector=taker.calculate(collector);
											 mycanvas.display=collector;
											 mycanvas.repaint();
										 }
									 }	
								}
							
								if(taken.label=='='){
									Calculator taker;
									taker= new Calculator();
									collector=taker.calculate(collector);
									mycanvas.display=collector;
									mycanvas.repaint();
								} else {
									if(taken.label=='d'){
										if(collector.length()>0) {
											collector=collector.substring(0,collector.length()-1);
											mycanvas.display=collector;
											mycanvas.repaint();
										}
											
									}else{
										collector=collector+taken.label;
										//System.out.println(collector.length());
										mycanvas.display=collector;
										mycanvas.repaint();
								}
							}	
						}
					}
				}
			}	
		}
	}
		
	
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
