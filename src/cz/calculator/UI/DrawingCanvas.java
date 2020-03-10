package cz.calculator.UI;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.stream.Collector;
public class DrawingCanvas extends Canvas {
    Image image;
    public ArrayList buttons= new ArrayList();
    public String display="0";
    int x;
    int y;   
        DrawingCanvas(){
            try {
                 image = ImageIO.read(new File("Calculator.Image.png.second.png") );
            } catch( java.io.IOException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.exit(1);
             
            }
            Button button = new Button();
            button.leftupper.x=19;
            button.leftupper.y=425;
            button.rightlower.x=111;
            button.rightlower.y=484;
            button.label='1';
            buttons.add(button);
            


    	    button = new Button();
                button.leftupper.x=135;
                button.leftupper.y=516;
                button.rightlower.x=228;
                button.rightlower.y=571;
                button.label='.';
                buttons.add(button);
    
    	    button = new Button();
                button.leftupper.x=251;
                button.leftupper.y=519;
                button.rightlower.x=346;
                button.rightlower.y=572;
                button.label='=';
                buttons.add(button);
    
    	    button = new Button();
                button.leftupper.x=132;
                button.leftupper.y=173;
                button.rightlower.x=247;
                button.rightlower.y=233;
                button.label='o';
                buttons.add(button);
    
    	    button = new Button();
                button.leftupper.x=18;
                button.leftupper.y=173;
                button.rightlower.x=124;
                button.rightlower.y=232;
                button.label='m';
                buttons.add(button);
    
    	    button = new Button();
                button.leftupper.x=372;
                button.leftupper.y=251;
                button.rightlower.x=464;
                button.rightlower.y=306;
                button.label='*';
                buttons.add(button);
    
    	    button = new Button();
                button.leftupper.x=377;
                button.leftupper.y=429;
                button.rightlower.x=467;
                button.rightlower.y=575;
                button.label='+';
                buttons.add(button);
  
    	    button = new Button();
                button.leftupper.x=372;
                button.leftupper.y=340;
                button.rightlower.x=461;
                button.rightlower.y=395;
                button.label='-';
                buttons.add(button);

    	    button = new Button();
                button.leftupper.x=369;
                button.leftupper.y=182;
                button.rightlower.x=463;
                button.rightlower.y=218;
                button.label='/';
                buttons.add(button);

    	    button = new Button();
                button.leftupper.x=19;
                button.leftupper.y=516;
                button.rightlower.x=111;
                button.rightlower.y=574;
                button.label='0';
                buttons.add(button);
    
    	    button = new Button();
                button.leftupper.x=253;
                button.leftupper.y=253;
                button.rightlower.x=344;
                button.rightlower.y=305;
                button.label='9';
                buttons.add(button);
    
    	    button = new Button();
                button.leftupper.x=139;
                button.leftupper.y=251;
                button.rightlower.x=228;
                button.rightlower.y=306;
                button.label='8';
                buttons.add(button);
    
    	    button = new Button();
                button.leftupper.x=24;
                button.leftupper.y=253;
                button.rightlower.x=116;
                button.rightlower.y=306;
                button.label='7';
                buttons.add(button);
    
    	    button = new Button();
                button.leftupper.x=252;
                button.leftupper.y=340;
                button.rightlower.x=344;
                button.rightlower.y=390;
                button.label='6';
                buttons.add(button);
    
    	    button = new Button();
                button.leftupper.x=137;
                button.leftupper.y=341;
                button.rightlower.x=229;
                button.rightlower.y=393;
                button.label='5';
                buttons.add(button);
    
    	    button = new Button();
                button.leftupper.x=20;
                button.leftupper.y=339;
                button.rightlower.x=110;
                button.rightlower.y=395;
                button.label='4';
                buttons.add(button);
    
    	    button = new Button();
                button.leftupper.x=254;
                button.leftupper.y=428;
                button.rightlower.x=345;
                button.rightlower.y=483;
                button.label='3';
                buttons.add(button);
    
    	    button = new Button();
                button.leftupper.x=138;
                button.leftupper.y=429;
                button.rightlower.x=222;
                button.rightlower.y=483;
                button.label='2';
                buttons.add(button);
                
                
            button = new Button();
                button.leftupper.x=253;
                button.leftupper.y=171;
                button.rightlower.x=356;
                button.rightlower.y=234;
                button.label='d';
                buttons.add(button);
        } 
        
        public void paint(Graphics g){
            Graphics2D g2 = (Graphics2D)g;
            if(image!=null) {
          	   g.drawImage(image, x, y,498,605,this);
          	   
          	   }
            Font font = new Font("SansSerif", Font.PLAIN, 96);
            if(display.length()>8) {
            	Font font2 = new Font("SansSerif", Font.PLAIN, 46);
            	font=font2;
            }
           
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            		RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setFont(font);
            g2.drawString(display, 40, 102); 
            
            
        }
       
        public void  setCoordinates(int x) {
	    	this.x= x;
	    }


       
    	   
              
	}

