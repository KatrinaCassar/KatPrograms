import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.io.*;
import java.util.*;
public class Game extends JPanel{
    private int stage;
    public Game(int hangmanStage){
        stage = hangmanStage;
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(stage == 1){
            g.drawLine(100, 300, 100, 50);
        }
        else if(stage == 2){
            g.drawLine(100, 300, 100, 50);
            g.drawLine(200, 50, 100, 50);
        }
        else if(stage == 3){    
            g.drawLine(100, 300, 100, 50);
            g.drawLine(200, 50, 100, 50);
            g.drawLine(200, 100, 200, 50);
        }
        else if(stage == 4){  
            g.drawLine(100, 300, 100, 50);
            g.drawLine(200, 50, 100, 50);
            g.drawLine(200, 100, 200, 50);
            g.drawOval(50, 300, 100, 50);
        }
        else if(stage == 5){   
            g.drawLine(100, 300, 100, 50);
            g.drawLine(200, 50, 100, 50);
            g.drawLine(200, 100, 200, 50);
            g.drawOval(50, 300, 100, 50);
            g.drawOval(175, 100, 50, 50);
        }
        else if(stage == 6){ 
            g.drawLine(100, 300, 100, 50);
            g.drawLine(200, 50, 100, 50);
            g.drawLine(200, 100, 200, 50);
            g.drawOval(50, 300, 100, 50);
            g.drawOval(175, 100, 50, 50);
            g.drawLine(200, 200, 200, 150);
        }
        else if(stage == 7){ 
            g.drawLine(100, 300, 100, 50);
            g.drawLine(200, 50, 100, 50);
            g.drawLine(200, 100, 200, 50);
            g.drawOval(50, 300, 100, 50);
            g.drawOval(175, 100, 50, 50);
            g.drawLine(200, 200, 200, 150);
            g.drawLine(200, 200, 250, 250);
        }
        else if(stage == 8){   
            g.drawLine(100, 300, 100, 50);
            g.drawLine(200, 50, 100, 50);
            g.drawLine(200, 100, 200, 50);
            g.drawOval(50, 300, 100, 50);
            g.drawOval(175, 100, 50, 50);
            g.drawLine(200, 200, 200, 150);
            g.drawLine(200, 200, 250, 250);
            g.drawLine(200, 200, 150, 250);
        }
        else if(stage == 9){  
            g.drawLine(100, 300, 100, 50);
            g.drawLine(200, 50, 100, 50);
            g.drawLine(200, 100, 200, 50);
            g.drawOval(50, 300, 100, 50);
            g.drawOval(175, 100, 50, 50);
            g.drawLine(200, 200, 200, 150);
            g.drawLine(200, 200, 250, 250);
            g.drawLine(200, 200, 150, 250);
            g.drawLine(150, 150, 200, 175);
        }
        else if (stage == 10){
            g.drawLine(100, 300, 100, 50);
            g.drawLine(200, 50, 100, 50);
            g.drawLine(200, 100, 200, 50);
            g.drawOval(50, 300, 100, 50);
            g.drawOval(175, 100, 50, 50);
            g.drawLine(200, 200, 200, 150);
            g.drawLine(200, 200, 250, 250);
            g.drawLine(200, 200, 150, 250);
            g.drawLine(150, 150, 200, 175);
            g.drawLine(250, 150, 200, 175);
        }
        else{
            //do nothing
        }
    }  
}
