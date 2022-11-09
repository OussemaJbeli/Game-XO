
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


public class About extends JFrame
{
    Hp P = new Hp();
    JButton B1 =new JButton("close");
    JLabel L1 = new JLabel("About");
    JLabel L2 = new JLabel("X/O Game");
    JLabel L3 = new JLabel("Software version 1.0.0");
    ImageIcon image=new ImageIcon("XO logo1.png");
    JLabel L4 = new JLabel(image);
   
    public About()
    {
        setIconImage();
         //about fram
        setSize(450, 350);
        setTitle("X/O Game");
        setLocation(575,175);
        setResizable(false);
        setVisible(true);   

        B1.setBounds(170,270,100,30);
        B1.setBackground(Color.black);
        B1.setForeground(Color.green);
        
        L1.setBounds(180,50,225,30);
        L1.setFont(new Font("atilic",Font.BOLD,25));
        L2.setBounds(180,210,225,30);
        L2.setFont(new Font("atilic",Font.BOLD,15));
        L3.setBounds(160,240,225,30);
        L3.setFont(new Font("atilic",Font.BOLD,10));
        L3.setForeground(Color.DARK_GRAY);

        
        L4.add(B1);
        L4.add(L1);L4.add(L2);L4.add(L3);
        
        this.add(L4);
        
        B1.addActionListener(P);

        
       
    }
    private void setIconImage() 
    {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        
        
    }
    private class Hp implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource()==B1)
            {
                
                XO_Pannel L = new XO_Pannel();
                setVisible(false);
               
            }
    
        }

    }

    
}
