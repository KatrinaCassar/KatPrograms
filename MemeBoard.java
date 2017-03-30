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
public class MemeBoard extends JFrame{
    JButton bAirhorn, bDedotatedWam, bGetNoscoped, bHitmarker, bIntervention420, bNeverDoneThat;
    JButton bOhBabyATriple, bSanic, bShotsFired, bSpooky, bTacticalNuke, bWhatchaSay, bWow; 

    File fAirhorn = new File("AIRHORN.wav");
    File fDedotatedWam = new File("DEDOTADED_WAM.wav");
    File fGetNoscoped = new File("GET_NOSCOPED.wav");
    File fHitmarker = new File("HITMARKER.wav");
    File fIntervention420 = new File("intervention_420.wav");
    File fNeverDoneThat = new File("NEVER_DONE_THAT.wav");
    File fOhBabyATriple = new File("Oh_Baby_A_Triple.wav");
    File fSanic= new File("SANIC.wav");
    File fShotsFired = new File("SHOTS_FIRED.wav");
    File fSpooky = new File("Spooky.wav");
    File fTacticalNuke = new File("tactical_nuke.wav");
    File fWhatchaSay = new File("Whatcha_Say.wav");
    File fWow = new File("wow-.wav");
    public MemeBoard(){
        super("Meme Board");
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.GREEN);
        
        ImageIcon meme = new ImageIcon("Meme.jpg");
        JLabel label = new JLabel(meme);
        add(label);

        bAirhorn = new JButton("Airhorn");
        add(bAirhorn);

        bDedotatedWam = new JButton("Dedotated Wam");
        add(bDedotatedWam);

        bGetNoscoped = new JButton("Get Noscoped");
        add(bGetNoscoped);

        bHitmarker = new JButton("Hitmarker");
        add(bHitmarker);

        bIntervention420 = new JButton("Intervention 420");
        add(bIntervention420);

        bNeverDoneThat = new JButton("Never Done That");
        add(bNeverDoneThat);

        bOhBabyATriple = new JButton("Oh Baby A Triple");
        add(bOhBabyATriple);

        bSanic = new JButton("Sanic");
        add(bSanic);

        bShotsFired = new JButton("Shots Fired");
        add(bShotsFired);

        bSpooky = new JButton("Spooky");
        add(bSpooky);

        bTacticalNuke = new JButton("Tactical Nuke");
        add(bTacticalNuke);

        bWhatchaSay = new JButton("Whatcha Say");
        add(bWhatchaSay);

        bWow = new JButton("Wow");
        add(bWow);

        Handler handler = new Handler();
        bAirhorn.addActionListener(handler);
        bDedotatedWam.addActionListener(handler);
        bGetNoscoped.addActionListener(handler);
        bHitmarker.addActionListener(handler);
        bIntervention420.addActionListener(handler);
        bNeverDoneThat.addActionListener(handler);
        bOhBabyATriple.addActionListener(handler);
        bSanic.addActionListener(handler);
        bShotsFired.addActionListener(handler);
        bSpooky.addActionListener(handler);
        bTacticalNuke.addActionListener(handler);
        bWhatchaSay.addActionListener(handler);
        bWow.addActionListener(handler);
    }

    private class Handler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == bAirhorn){
                PlaySound(fAirhorn);
            }
            else if(event.getSource() == bDedotatedWam){
                PlaySound(fDedotatedWam);
            }
            else if(event.getSource() == bGetNoscoped){
                PlaySound(fGetNoscoped);
            }
            else if(event.getSource() == bHitmarker){
                PlaySound(fHitmarker);
            }
            else if(event.getSource() == bIntervention420){
                PlaySound(fIntervention420);
            }
            else if(event.getSource() == bNeverDoneThat){
                PlaySound(fNeverDoneThat);
            }
            else if(event.getSource() == bOhBabyATriple){
                PlaySound(fOhBabyATriple);
            }
            else if(event.getSource() == bSanic){
                PlaySound(fSanic);
            }
            else if(event.getSource() == bShotsFired){
                PlaySound(fShotsFired);
            }
            else if(event.getSource() == bSpooky){
                PlaySound(fSpooky);
            }
            else if(event.getSource() == bTacticalNuke){
                PlaySound(fTacticalNuke);
            }
            else if(event.getSource() == bWhatchaSay){
                PlaySound(fWhatchaSay);
            }
            else if(event.getSource() == bWow){
                PlaySound(fWow);
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
