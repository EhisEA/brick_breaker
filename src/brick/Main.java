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
import java.util.Random;
import java.awt.Color;
import javax.swing.JFrame;
public class Main extends JFrame {
      Random ne = new Random();
       private float re;
  
public Main(){
  
     re= ne.nextFloat();
    GamePlay ga = new GamePlay();
        setVisible(true);
        setBounds(270, 70, 700, 600);
        setResizable(false);
        setTitle("Brick Breaker");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
      //  setBackground(Color.BLACK);
        add(ga);
        //add(ga.imagg("c:/data/theme6.png")); 
        //System.out.println(re);

        

}
    
    
    public static void main(String[] args) {
               Main m = new Main();
               //GamePlay g = new GamePlay();g.imagg("c:/data/theme6.png");
    }
}
