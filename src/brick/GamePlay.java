/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brick;

/**
 *
 * @author EMMANUEL AYEMERE
 */
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Timer;

public class GamePlay extends JPanel implements ActionListener, KeyListener{
    
  JTextField key =new JTextField();
    private int padx = 300;
    private  Timer time;
    private int delay = 8;
    private int ballx= 200;
    private int bally= 150;
    private int ballvx =-1;
    private int ballvy= -2;
    private boolean play= false;
   
    public GamePlay(){
        key.
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        time= new Timer(delay, this);
        time.start();
        
        BorderLayout j = new BorderLayout();
      setLayout(j);
        add(key, BorderLayout.NORTH);
    }
    @Override
    public void paint(Graphics g){
        
        g.setColor(Color.black);
        g.fillRect(0,0,700,600);
        
        g.setColor(Color.yellow);
        g.fillRect(0,0,3,590);
        g.fillRect(0, 0, 691, 3);
        g.fillRect(691, 0, 3,590 );
        
        g.setColor(Color.green);
        g.fillRect(padx,520,100,6);
        
        g.setColor(Color.yellow);
        g.fillOval(ballx, bally, 20, 20);
        
        g.dispose();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        time.start();
        repaint(); 
        if (new Rectangle(ballx,bally,20,20).intersects(new Rectangle(padx, 520,100,6 ))){
            ballvy= -ballvy;
        }
        if(play){
            ballx+= ballvx;
            bally+= ballvy;
            if(ballx <= 0){
                ballvx= -ballvx;
            }
            
            if(bally <= 0){
                ballvy= -ballvy;
            }
            
            if(ballx >= 680){
                ballvx= -ballvx;
            }
        }
    }
    
    
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
        
            if(padx>=600){
            
            padx=600;
        }else{
            moveRight();
        }
        
        }
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
        
            if (padx<16){
            padx=16;
        }else{
            moveLeft();
        }
            
        }
        
    }
    
   
    public void moveRight(){
        
        play=true;
        padx=padx +25;
        //repaint();
    }
    
    public void moveLeft(){
        
        play = true;
        padx= padx-25;
        //repaint();
    }
     
    BufferedImage imagg(String fn){
        BufferedImage imadd = null;
        
      try {
          imadd = ImageIO.read(new File (fn));
      } catch (IOException ex) {
          Logger.getLogger(GamePlay.class.getName()).log(Level.SEVERE, null, ex);
      }
        
                return imadd;
    }
   
    
}
