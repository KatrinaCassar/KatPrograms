import java.awt.*;
import javax.swing.*;
public class Run{
    public static void main(String[] args){
        runHome();
    }

    public static void runHome(){
        Home home = new Home();
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setSize(1650,1080);
        home.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        home.setUndecorated(true);
        home.setResizable(false);
        home.setVisible(true);
    }

    public static void runMemeBoard(){
        MemeBoard memeboard = new MemeBoard();
        memeboard.setSize(294, 500);
        memeboard.setResizable(false);
        memeboard.setVisible(true);
    }

    public static void runMarioBoard(){
        MarioBoard marioboard = new MarioBoard();
        marioboard.setSize(525, 436);
        marioboard.setResizable(false);
        marioboard.setVisible(true);
    }

    public static void runHorrorBoard(){
        HorrorBoard horrorboard = new HorrorBoard();
        horrorboard.setSize(398, 649);
        horrorboard.setResizable(false);
        horrorboard.setVisible(true);
    }

    public static void runMineBoard(){
        MineBoard mineboard = new MineBoard();
        mineboard.setSize(927, 312);
        mineboard.setResizable(false);
        mineboard.setVisible(true);
    }
    
    public static void exit(){
        System.exit(0);
    }
}
