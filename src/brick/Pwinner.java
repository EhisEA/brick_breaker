/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brick;

import java.awt.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author EMMANUEL AYEMERE
 */
public class Pwinner {


JFrame j = new JFrame("Congratulation You Won Hurray!!!!!!!!!!");
private Thread t;
    int fw=600;
    int fh=600;
    Ball ball[]= new Ball[50];
    
    public Pwinner(){
        
        j.setSize(fw,fh);
        j.setVisible(true);
        j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
        j.setLocationRelativeTo(null);    
    
        for(int i = 0; i<ball.length; i++)
            ball[i]= new Ball(fw,fh);
        
        
            
        t= new Thread();
        t.start();
    }
    
    public void paint(Graphics g){
      g.setColor(Color.yellow);
      g.drawRect(0,0,fw,fh);
        
      for(int i = 0; i<ball.length; i++)
            ball[i].draw(g);
      
    }
    
    public void run(){
        while (true){
           
             for(int i = 0; i<ball.length; i++)
            ball[i].move();// repaint();
            
                 
      
        
        try{
            t.sleep(500);
        }catch(Exception e){
            System.out.println(e);    
        }  }
    }
    
    public static void main(String[] args) {
        Pwinner p = new Pwinner();
    }
    
    
    }
