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
public class HorrorBoard extends JFrame{
    JButton b7days, bBatsInCave, bBuzz, bCasket, bCatScream, bChainsaw, bDeath, bDecapitation, bDentistDrill, bDrill, bEvilLaugh, bFemaleScream, bGodzilla, bGrowl;
    JButton bGuillotine, bIWillKillYou, bMonsterLaugh, bMonsterRoar, bMummyZombie, bPain, bPsychoScream, bPterodactylScream, bScreams, bSqueakingDoor, bSuspense;
    JButton bThunder, bTorture, bTRexRoar, bWheresMyMummy, bZombie, bZombieDeath; 
    
    File f7days = new File("7days.wav");
    File fBatsInCave = new File("BatsInCave.wav");
    File fBuzz = new File("Buzz.wav");
    File fCasket = new File("Casket.wav");
    File fCatScream = new File("CatScream.wav");
    File fChainsaw = new File("Chainsaw.wav");
    File fDeath = new File("Death.wav");
    File fDecapitation = new File("Decapitation.wav");
    File fDentistDrill = new File("DentistDrill.wav");
    File fDrill = new File("Drill.wav");
    File fEvilLaugh = new File("EvilLaugh.wav");
    File fFemaleScream = new File("FemaleScream.wav");
    File fGodzilla = new File("Godzilla.wav");
    File fGrowl = new File("Growl.wav");
    File fGuillotine = new File("Guillotine.wav");
    File fIWillKillYou = new File("IWillKillYou.wav");
    File fMonsterLaugh = new File("MonsterLaugh.wav");
    File fMonsterRoar = new File("MonsterRoar.wav");
    File fMummyZombie = new File("MummyZombie.wav");
    File fPain = new File("Pain.wav");
    File fPsychoScream = new File("PsychoScream.wav");
    File fPterodactylScream = new File("PterodactylScream.wav");
    File fScreams = new File("Screams.wav");
    File fSqueakingDoor = new File("SqueakingDoor.wav");
    File fSuspense = new File("Suspense.wav");
    File fThunder = new File("Thunder.wav");
    File fTorture = new File("Torture.wav");
    File fTRexRoar = new File("TRexRoar.wav");
    File fWheresMyMummy = new File("WheresMyMummy.wav");
    File fZombie = new File("Zombie.wav");
    File fZombieDeath = new File("ZombieDeath.wav");
    public HorrorBoard(){
        super("Horror Board");
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.BLACK);
        
        ImageIcon ghost = new ImageIcon("Ghost.png");
        JLabel label = new JLabel(ghost);
        add(label);
        
        b7days = new JButton("7 Days");
        add(b7days);
        
        bBatsInCave = new JButton("Bats In Cave");
        add(bBatsInCave);
        
        bBuzz = new JButton("Buzz");
        add(bBuzz);
        
        bCasket = new JButton("Casket");
        add(bCasket);
        
        bCatScream = new JButton("Cat Scream");
        add(bCatScream);
        
        bChainsaw = new JButton("Chainsaw");
        add(bChainsaw);
        
        bDeath = new JButton("Death");
        add(bDeath);
        
        bDecapitation = new JButton("Decapitation");
        add(bDecapitation);
        
        bDentistDrill = new JButton("Dentist Drill");
        add(bDentistDrill);
        
        bDrill = new JButton("Drill");
        add(bDrill);
        
        bEvilLaugh = new JButton("Evil Laugh");
        add(bEvilLaugh);
        
        bFemaleScream = new JButton("Female Scream");
        add(bFemaleScream);
        
        bGodzilla = new JButton("Godzilla");
        add(bGodzilla);
        
        bGrowl = new JButton("Growl");
        add(bGrowl);
        
        bGuillotine = new JButton("Guillotine");
        add(bGuillotine);
        
        bIWillKillYou = new JButton("I Will Kill You");
        add(bIWillKillYou);
        
        bMonsterLaugh = new JButton("Monster Laugh");
        add(bMonsterLaugh);
        
        bMonsterRoar = new JButton("Monster Roar");
        add(bMonsterRoar);
        
        bMummyZombie = new JButton("Mummy Zombie");
        add(bMummyZombie);
        
        bPain = new JButton("Pain");
        add(bPain);
        
        bPsychoScream = new JButton("Psycho Scream");
        add(bPsychoScream);
        
        bPterodactylScream = new JButton("Pterodactyl Scream");
        add(bPterodactylScream);
        
        bScreams = new JButton("Screams");
        add(bScreams);
        
        bSqueakingDoor = new JButton("Squeaking Door");
        add(bSqueakingDoor);

        bSuspense = new JButton("Suspense");
        add(bSuspense);
        
        bThunder = new JButton("Thunder");
        add(bThunder);
        
        bTorture = new JButton("Torture");
        add(bTorture);
        
        bTRexRoar = new JButton("T-Rex Roar");
        add(bTRexRoar);
        
        bWheresMyMummy = new JButton("Where's My Mummy?");
        add(bWheresMyMummy);
        
        bZombie = new JButton("Zombie");
        add(bZombie);
        
        bZombieDeath = new JButton("Zombie Death");
        add(bZombieDeath);
        
        Handler handler = new Handler();
        b7days.addActionListener(handler);
        bBatsInCave.addActionListener(handler);
        bBuzz.addActionListener(handler);
        bCasket.addActionListener(handler);
        bCatScream.addActionListener(handler);
        bChainsaw.addActionListener(handler);
        bDeath.addActionListener(handler);
        bDecapitation.addActionListener(handler);
        bDentistDrill.addActionListener(handler);
        bDrill.addActionListener(handler);
        bEvilLaugh.addActionListener(handler);
        bFemaleScream.addActionListener(handler);
        bGodzilla.addActionListener(handler);
        bGrowl.addActionListener(handler);
        bGuillotine.addActionListener(handler);
        bIWillKillYou.addActionListener(handler);
        bMonsterLaugh.addActionListener(handler);
        bMonsterRoar.addActionListener(handler);
        bMummyZombie.addActionListener(handler);
        bPain.addActionListener(handler);
        bPsychoScream.addActionListener(handler);
        bPterodactylScream.addActionListener(handler);
        bScreams.addActionListener(handler);
        bSqueakingDoor.addActionListener(handler);
        bSuspense.addActionListener(handler);
        bThunder.addActionListener(handler);
        bTorture.addActionListener(handler);
        bTRexRoar.addActionListener(handler);
        bWheresMyMummy.addActionListener(handler);
        bZombie.addActionListener(handler);
        bZombieDeath.addActionListener(handler);
    }
    
    public class Handler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == b7days){
                PlaySound(f7days);
            }
            else if (event.getSource() == bBatsInCave){
                PlaySound(fBatsInCave);
            }
            else if (event.getSource() == bBuzz){
                PlaySound(fBuzz);
            }
            else if (event.getSource() == bCasket){
                PlaySound(fCasket);
            }
            else if (event.getSource() == bCatScream){
                PlaySound(fCatScream);
            }
            else if (event.getSource() == bChainsaw){
                PlaySound(fChainsaw);
            }
            else if (event.getSource() == bDeath){
                PlaySound(fDeath);
            }
            else if (event.getSource() == bDecapitation){
                PlaySound(fDecapitation);
            }
            else if (event.getSource() == bDentistDrill){
                PlaySound(fDentistDrill);
            }
            else if (event.getSource() == bDrill){
                PlaySound(fDrill);
            }
            else if (event.getSource() == bEvilLaugh){
                PlaySound(fEvilLaugh);
            }
            else if (event.getSource() == bFemaleScream){
                PlaySound(fFemaleScream);
            }
            else if (event.getSource() == bGodzilla){
                PlaySound(fGodzilla);
            }
            else if (event.getSource() == bGrowl){
                PlaySound(fGrowl);
            }
            else if (event.getSource() == bGuillotine){
                PlaySound(fGuillotine);
            }
            else if (event.getSource() == bIWillKillYou){
                PlaySound(fIWillKillYou);
            }
            else if (event.getSource() == bMonsterLaugh){
                PlaySound(fMonsterLaugh);
            }
            else if (event.getSource() == bMonsterRoar){
                PlaySound(fMonsterRoar);
            }
            else if (event.getSource() == bMummyZombie){
                PlaySound(fMummyZombie);
            }
            else if (event.getSource() == bPain){
                PlaySound(fPain);
            }
            else if (event.getSource() == bPsychoScream){
                PlaySound(fPsychoScream);
            }
            else if (event.getSource() == bPterodactylScream){
                PlaySound(fPterodactylScream);
            }
            else if (event.getSource() == bScreams){
                PlaySound(fScreams);
            }
            else if (event.getSource() == bSqueakingDoor){
                PlaySound(fSqueakingDoor);
            }
            else if (event.getSource() == bSuspense){
                PlaySound(fSuspense);
            }
            else if (event.getSource() == bThunder){
                PlaySound(fThunder);
            }
            else if (event.getSource() == bTorture){
                PlaySound(fTorture);
            }
            else if (event.getSource() == bTRexRoar){
                PlaySound(fTRexRoar);
            }
            else if (event.getSource() == bWheresMyMummy){
                PlaySound(fWheresMyMummy);
            }
            else if (event.getSource() == bZombie){
                PlaySound(fZombie);
            }
            else if (event.getSource() == bZombieDeath){
                PlaySound(fZombieDeath);
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
