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
public class MineBoard extends JFrame{
    JButton bBlaze, bCat, bCave, bChicken, bCow, bCreeper, bDamage, bEnderman, bFire, bGhast;
    JButton bIronGolem, bMagmaCube, bPig, bSheep, bSilverfish, bSkeleton, bSlime, bSpider, bPortal;

    File fBlaze = new File("Blaze.wav");
    File fCat = new File("Cat.wav");
    File fCave = new File("Cave.wav");
    File fChicken = new File("Chicken.wav");
    File fCow = new File("Cow.wav");
    File fCreeper = new File("Creeper.wav");
    File fDamage = new File("Damage.wav");
    File fEnderman = new File("Enderman.wav");
    File fFire = new File("Fire.wav");
    File fGhast = new File("Ghast.wav");
    File fIronGolem = new File("IronGolem.wav");
    File fMagmaCube = new File("MagmaCube.wav");
    File fPig = new File("Pig.wav");
    File fSheep = new File("Sheep.wav");
    File fSilverfish = new File("Silverfish.wav");
    File fSkeleton = new File("Skeleton.wav");
    File fSlime = new File("Slime.wav");
    File fSpider = new File("Spider.wav");
    File fPortal = new File("Portal.wav");
    public MineBoard(){
        super("Mine Board");
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        ImageIcon logo = new ImageIcon("Minecraft.png");
        JLabel label = new JLabel(logo);
        add(label);

        bBlaze = new JButton("Blaze");
        add(bBlaze);

        bCat = new JButton("Cat");
        add(bCat);

        bCave = new JButton("Cave");
        add(bCave);

        bChicken = new JButton("Chicken");
        add(bChicken);

        bCow = new JButton("Cow");
        add(bCow);

        bCreeper = new JButton("Creeper");
        add(bCreeper);

        bDamage = new JButton("Damage");
        add(bDamage);

        bEnderman = new JButton("Enderman");
        add(bEnderman);

        bFire = new JButton("Fire");
        add(bFire);

        bGhast = new JButton("Ghast");
        add(bGhast);

        bIronGolem = new JButton("Iron Golem");
        add(bIronGolem);

        bMagmaCube = new JButton("Magma Cube");
        add(bMagmaCube);
        
        bPig = new JButton("Pig");
        add(bPig);
        
        bSheep = new JButton("Sheep");
        add(bSheep);
        
        bSilverfish = new JButton("Silverfish");
        add(bSilverfish);
        
        bSkeleton = new JButton("Skeleton");
        add(bSkeleton);
        
        bSlime = new JButton("Slime");
        add(bSlime);
        
        bSpider = new JButton("Spider");
        add(bSpider);
        
        bPortal = new JButton("Portal");
        add(bPortal);
        
        Handler handler = new Handler();
        bBlaze.addActionListener(handler);
        bCat.addActionListener(handler);
        bCave.addActionListener(handler);
        bChicken.addActionListener(handler);
        bCow.addActionListener(handler);
        bCreeper.addActionListener(handler);
        bDamage.addActionListener(handler);
        bEnderman.addActionListener(handler);
        bFire.addActionListener(handler);
        bGhast.addActionListener(handler);
        bIronGolem.addActionListener(handler);
        bMagmaCube.addActionListener(handler);
        bPig.addActionListener(handler);
        bPortal.addActionListener(handler);
        bSheep.addActionListener(handler);
        bSilverfish.addActionListener(handler);
        bSkeleton.addActionListener(handler);
        bSlime.addActionListener(handler);
        bSpider.addActionListener(handler);
    }
    
    public class Handler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == bBlaze){
                PlaySound(fBlaze);
            }
            else if(event.getSource() == bCat){
                PlaySound(fCat);
            }
            else if(event.getSource() == bCave){
                PlaySound(fCave);
            }
            else if(event.getSource() == bChicken){
                PlaySound(fChicken);
            }
            else if(event.getSource() == bCow){
                PlaySound(fCow);
            }
            else if(event.getSource() == bCreeper){
                PlaySound(fCreeper);
            }
            else if(event.getSource() == bDamage){
                PlaySound(fDamage);
            }
            else if(event.getSource() == bEnderman){
                PlaySound(fEnderman);
            }
            else if(event.getSource() == bFire){
                PlaySound(fFire);
            }
            else if(event.getSource() == bGhast){
                PlaySound(fGhast);
            }
            else if(event.getSource() == bIronGolem){
                PlaySound(fIronGolem);
            }
            else if(event.getSource() == bMagmaCube){
                PlaySound(fMagmaCube);
            }
            else if(event.getSource() == bPig){
                PlaySound(fPig);
            }
            else if(event.getSource() == bPortal){
                PlaySound(fPortal);
            }
            else if(event.getSource() == bSheep){
                PlaySound(fSheep);
            }
            else if(event.getSource() == bSilverfish){
                PlaySound(fSilverfish);
            }
            else if(event.getSource() == bSkeleton){
                PlaySound(fSkeleton);
            }
            else if(event.getSource() == bSlime){
                PlaySound(fSlime);
            }
            else if(event.getSource() == bSpider){
                PlaySound(fSpider);
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
