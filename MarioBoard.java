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
public class MarioBoard extends JFrame{
    JButton b1up, bBowserFalls, bBowserFire, bBreakBlock, bBump, bCoin, bFireball, bFireworks, bFlagpole, bGameOver, bSmallJump; 
    JButton bSuperJump, bKick, bMarioDies, bPause, bPipe, bPowerUp, bPowerUpAppears, bStageClear, bStomp, bVine, bWarning, bWorldClear;
    
    File f1up = new File("smb_1-up.wav");
    File fBowserFalls = new File("smb_bowserfalls.wav");
    File fBowserFire = new File("smb_bowserfire.wav");
    File fBreakBlock = new File("smb_breakblock.wav");
    File fBump = new File("smb_bump.wav");
    File fCoin = new File("smb_coin.wav");
    File fFireball = new File("smb_fireball.wav");
    File fFireworks = new File("smb_fireworks.wav");
    File fFlagpole = new File("smb_flagpole.wav");
    File fGameOver = new File("smb_gameover.wav");
    File fSmallJump = new File("smb_jump-small.wav");
    File fSuperJump = new File("smb_jump-super.wav");
    File fKick = new File("smb_kick.wav");
    File fMarioDies = new File("smb_mariodie.wav");
    File fPause = new File("smb_pause.wav");
    File fPipe = new File("smb_pipe.wav");
    File fPowerUp = new File("smb_powerup.wav");
    File fPowerUpAppears = new File("smb_powerup_appears.wav");
    File fStageClear = new File("smb_stage_clear.wav");
    File fStomp = new File("smb_stomp.wav");
    File fVine = new File("smb_vine.wav");
    File fWarning = new File("smb_warning.wav");
    File fWorldClear = new File("smb_world_clear.wav");
    public MarioBoard(){
        super("Mario Board");
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.RED);
        
        ImageIcon mario = new ImageIcon("Mario.png");
        JLabel label = new JLabel(mario);
        add(label);
        
        ImageIcon toad = new ImageIcon("Toad.png");
        JLabel label2 = new JLabel(toad);
        add(label2);
        
        ImageIcon star = new ImageIcon("Star.png");
        JLabel label3 = new JLabel(star);
        add(label3);
        
        b1up = new JButton("1 Up");
        add(b1up);
        
        bBowserFalls = new JButton("Bowser Falls");
        add(bBowserFalls);
        
        bBowserFire = new JButton("Bowser Fire");
        add(bBowserFire);
        
        bBreakBlock = new JButton("Break Block");
        add(bBreakBlock);
        
        bBump = new JButton("Bump");
        add(bBump);
        
        bCoin = new JButton("Coin");
        add(bCoin);
        
        bFireball = new JButton("Fireball");
        add(bFireball);
        
        bFireworks = new JButton("Fireworks");
        add(bFireworks);
        
        bFlagpole = new JButton("Flagpole");
        add(bFlagpole);
        
        bGameOver = new JButton("Game Over");
        add(bGameOver);
        
        bSmallJump = new JButton("Small Jump");
        add(bSmallJump);
        
        bSuperJump = new JButton("Super Jump");
        add(bSuperJump);
        
        bKick = new JButton("Kick");
        add(bKick);
        
        bMarioDies = new JButton("Mario Dies");
        add(bMarioDies);
        
        bPause = new JButton("Pause");
        add(bPause);
        
        bPipe = new JButton("Pipe");
        add(bPipe);
        
        bPowerUp = new JButton("Power-Up");
        add(bPowerUp);
        
        bPowerUpAppears = new JButton("Power-Up Appears");
        add(bPowerUpAppears);
        
        bStageClear = new JButton("Stage Cleared");
        add(bStageClear);
        
        bStomp = new JButton("Stomp");
        add(bStomp);
        
        bVine = new JButton("Vine");
        add(bVine);
        
        bWarning = new JButton("Warning");
        add(bWarning);
        
        bWorldClear = new JButton("World Cleared");
        add(bWorldClear);
        
        Handler handler = new Handler();
        b1up.addActionListener(handler);
        bBowserFalls.addActionListener(handler);
        bBowserFire.addActionListener(handler);
        bBreakBlock.addActionListener(handler);
        bBump.addActionListener(handler);
        bCoin.addActionListener(handler);
        bFireball.addActionListener(handler);
        bFireworks.addActionListener(handler);
        bFlagpole.addActionListener(handler);
        bGameOver.addActionListener(handler);
        bSmallJump.addActionListener(handler);
        bSuperJump.addActionListener(handler);
        bKick.addActionListener(handler);
        bMarioDies.addActionListener(handler);
        bPause.addActionListener(handler);
        bPipe.addActionListener(handler);
        bPowerUp.addActionListener(handler);
        bPowerUpAppears.addActionListener(handler);
        bStageClear.addActionListener(handler);
        bStomp.addActionListener(handler);
        bVine.addActionListener(handler);
        bWarning.addActionListener(handler);
        bWorldClear.addActionListener(handler);
    }
    
    public class Handler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == b1up){
                PlaySound(f1up);
            }
            else if(event.getSource() == bBowserFalls){
                PlaySound(fBowserFalls);
            }
            else if(event.getSource() == bBowserFire){
                PlaySound(fBowserFire);
            }
            else if(event.getSource() == bBreakBlock){
                PlaySound(fBreakBlock);
            }
            else if(event.getSource() == bBump){
                PlaySound(fBump);
            }
            else if(event.getSource() == bCoin){
                PlaySound(fCoin);
            }
            else if(event.getSource() == bFireball){
                PlaySound(fFireball);
            }
            else if(event.getSource() == bFireworks){
                PlaySound(fFireworks);
            }
            else if(event.getSource() == bFlagpole){
                PlaySound(fFlagpole);
            }
            else if(event.getSource() == bGameOver){
                PlaySound(fGameOver);
            }
            else if(event.getSource() == bSmallJump){
                PlaySound(fSmallJump);
            }
            else if(event.getSource() == bSuperJump){
                PlaySound(fSuperJump);
            }
            else if(event.getSource() == bKick){
                PlaySound(fKick);
            }
            else if(event.getSource() == bMarioDies){
                PlaySound(fMarioDies);
            }
            else if(event.getSource() == bPause){
                PlaySound(fPause);
            }
            else if(event.getSource() == bPipe){
                PlaySound(fPipe);
            }
            else if(event.getSource() == bPowerUp){
                PlaySound(fPowerUp);
            }
            else if(event.getSource() == bPowerUpAppears){
                PlaySound(fPowerUpAppears);
            }
            else if(event.getSource() == bStageClear){
                PlaySound(fStageClear);
            }
            else if(event.getSource() == bStomp){
                PlaySound(fStomp);
            }
            else if(event.getSource() == bVine){
                PlaySound(fVine);
            }
            else if(event.getSource() == bWarning){
                PlaySound(fWarning);
            }
            else if(event.getSource() == bWorldClear){
                PlaySound(fWorldClear);
            }
            else{
                //do nothing
            }
        }
        
        public void PlaySound(File Sound){
            try{
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(Sound));
                clip.start();

                Thread.sleep(clip.getMicrosecondLength() / 1000);
            }catch(Exception e){

            }
        }
    }
}