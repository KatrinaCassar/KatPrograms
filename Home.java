import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class Home extends JFrame{
    JButton MemeButton, MarioButton, MineButton, HorrorButton, exit;
    public Home(){
        super("Home");
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.MAGENTA);
        
        ImageIcon logo = new ImageIcon("Logo.jpg");
        JLabel label = new JLabel(logo);
        add(label);

        MemeButton = new JButton("Meme Board");
        add(MemeButton);

        MarioButton = new JButton("Mario Baord");
        add(MarioButton);

        MineButton = new JButton("Mine Board");
        add(MineButton);

        HorrorButton = new JButton("Horror Board");
        add(HorrorButton);
        
        exit = new JButton("Exit");
        exit.setForeground(Color.RED);
        add(exit);
        
        Handler handler = new Handler();
        MemeButton.addActionListener(handler);
        MarioButton.addActionListener(handler);
        MineButton.addActionListener(handler);
        HorrorButton.addActionListener(handler);
        exit.addActionListener(handler);
    }

    public class Handler implements ActionListener{
        Run run = new Run();
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == MemeButton){
                run.runMemeBoard();
            }
            else if(event.getSource() == MarioButton){
                run.runMarioBoard();
            }
            else if(event.getSource() == MineButton){
                run.runMineBoard();
            }
            else if(event.getSource() == HorrorButton){
                run.runHorrorBoard();
            }
            else if(event.getSource() == exit){
                run.exit();
            }
            else{
                //do nothing
            }
        }
    }
}
