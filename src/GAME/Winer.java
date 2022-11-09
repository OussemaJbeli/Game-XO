package GAME;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Winer extends JFrame 
{
    pp p = new pp();
    ImageIcon image=new ImageIcon("E:\\DEV\\dev proj\\Project1\\Game\\src\\GAME\\1.jpg");
    JLabel L1 = new JLabel(image);
    JLabel L2 = new JLabel(" player");
    JLabel L3 = new JLabel(" is the winner");
    JButton B = new JButton("OK");
    String Player;
    Winer(String P)
    {
        setIconImage();
        this.Player = P;
        setSize(400,250);
        setLocation(600,250);
        setTitle("X/O game");
        setVisible(true);
        setResizable(false);
        
        B.setBounds(150, 150, 100, 50);
        B.setBackground(Color.black);
        B.setForeground(Color.blue);
        L2.setBounds(70, 47, 150, 50);
        L2.setFont(new Font("atilic",Font.BOLD,30));
        L2.setText(Player);
        if(Player.equals("Player 1"))
        {
            L2.setForeground(Color.blue);
        }
        if(Player.equals("Player 2"))
        {
            L2.setForeground(Color.green);
        }
        
        L3.setBounds(185, 50, 150, 50);
        L3.setFont(new Font("atilic",Font.BOLD,20));
        L3.setForeground(Color.orange);
        
        L1.add(B);
        L1.add(L2);L1.add(L3);
        this.add(L1);
        
        B.addActionListener(p);
     
    }
    private void setIconImage() 
    {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        
        
    }
    private class pp implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==B)
            {
                XO_Pannel d = new XO_Pannel();
                setVisible(false);
            }
            
            
            
            
            
            
        }
            
        
    }
}

