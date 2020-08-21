/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brick;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author EMMANUEL AYEMERE
 */
public class Ball {
    private Random ran = new Random();
    private int fh;
    private int fw;
    private int x, y, diameter= 25;
    private int speed;
    private float red, blue,green;
    private boolean up , right;
    
    public Ball(int ffw, int ffh){
        fw = ffw;
        fh = ffh;
        x = ran.nextInt(fw-diameter);
        y = ran.nextInt(fh-diameter); 
        right= ran.nextBoolean();
        up = ran.nextBoolean();
        red= ran.nextFloat();
        blue = ran.nextFloat();
        green = ran.nextFloat();
        
        
    }
    
    
    public void move(){
        
        if(right=true)
        x+=speed;
        else x-=speed;
        
        if(up)
            y+=speed;
        else y-=speed;
        
        if(x<0)right=true;
        if(x>(fw-diameter)) right=false;
        
        if(y<0)up = true;
        if(x>(fh-diameter)) up = false;
    }
    
    
    public void paint(Graphics g){
        g.setColor(new Color(red, green, blue));
        g.drawOval( x, y,diameter, diameter);
        
    }

    void draw(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
