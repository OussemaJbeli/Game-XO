
package GAME;


import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class XO_Pannel extends JFrame
{
    gg G = new gg();
    ImageIcon image=new ImageIcon("src\\GAME\\pricipale.jpg");
    JLabel L44 = new JLabel(image);
    JButton B1 = new JButton();
    JButton B2 = new JButton();
    JButton B3 = new JButton();
    JButton B4 = new JButton();
    JButton B5 = new JButton();
    JButton B6 = new JButton();
    JButton B7 = new JButton();
    JButton B8 = new JButton();
    JButton B9 = new JButton();
    JButton B10 = new JButton("clear");
    JButton B20 = new JButton("about");
    JLabel L1 = new JLabel("l");
    JLabel L2 = new JLabel("l");
    JLabel L3 = new JLabel("l");
    JLabel L4 = new JLabel("l");
    JLabel L5 = new JLabel("l");
    JLabel L6 = new JLabel("l");
    JLabel L7 = new JLabel("l");
    JLabel L8 = new JLabel("l");
    JLabel L9 = new JLabel("l");
    JLabel L10 = new JLabel("player 1");
    JLabel L11 = new JLabel("player 2");
    JLabel L12 = new JLabel("X");
    JLabel L13 = new JLabel("O");
    JMenuBar M = new JMenuBar();
    JMenu m2 = new JMenu("help");
    String s1,s2,s3,s4,s5,s6,s7,s8,s9,x="   X",o="   O";

    public XO_Pannel()
    {
        setIconImage();
    }
    public void game()
    {

        setSize(600, 700);
        setTitle("X/O game");
        setLocation(500,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        M.setBounds(0,0,600,30);
        M.setBackground(Color.darkGray);
        m2.setForeground(Color.white);

        B1.setBounds(60,60,150,150); 
        B1.setBackground(Color.ORANGE);
        L1.setBounds(60,60,150,150);
        L1.setFont(new Font("atilic",Font.BOLD,70));
        L1.setVisible(false);

        B2.setBounds(60,220,150,150);
        B2.setBackground(Color.ORANGE);
        L2.setBounds(60,220,150,150);
        L2.setFont(new Font("atilic",Font.BOLD,70));
        L2.setVisible(false);

        B3.setBounds(60,380,150,150);
        B3.setBackground(Color.ORANGE);
        L3.setBounds(60,380,150,150);
        L3.setFont(new Font("atilic",Font.BOLD,70));
        L3.setVisible(false);

        B4.setBounds(220,60,150,150);
        B4.setBackground(Color.ORANGE);
        L4.setBounds(220,60,150,150);
        L4.setFont(new Font("atilic",Font.BOLD,70));
        L4.setVisible(false);

        B5.setBounds(220,220,150,150);
        B5.setBackground(Color.ORANGE);
        L5.setBounds(220,220,150,150);
        L5.setFont(new Font("atilic",Font.BOLD,70));
        L5.setVisible(false);

        B6.setBounds(220,380,150,150);
        B6.setBackground(Color.ORANGE);
        L6.setBounds(220,380,150,150);
        L6.setFont(new Font("atilic",Font.BOLD,70));
        L6.setVisible(false);

        B7.setBounds(380,60,150,150);
        B7.setBackground(Color.ORANGE);
        L7.setBounds(380,60,150,150);
        L7.setFont(new Font("atilic",Font.BOLD,70));
        L7.setVisible(false);

        B9.setBounds(380,380,150,150);
        B9.setBackground(Color.ORANGE);
        L9.setBounds(380,380,150,150);
        L9.setFont(new Font("atilic",Font.BOLD,70));
        L9.setVisible(false);

        B8.setBounds(380,220,150,150);
        B8.setBackground(Color.ORANGE);
        L8.setBounds(380,220,150,150);
        L8.setFont(new Font("atilic",Font.BOLD,70));
        L8.setVisible(false);
        
        L10.setBounds(50,530,150,50);
        L10.setForeground(Color.blue);
        L10.setFont(new Font("atilic",Font.BOLD,30));
        
        L11.setBounds(450,530,150,50);
        L11.setForeground(Color.green);
        L11.setFont(new Font("atilic",Font.BOLD,30));
        
        L12.setBounds(90,580,150,50);
        L12.setForeground(Color.blue);
        L12.setFont(new Font("atilic",Font.BOLD,60));
        
        L13.setBounds(490,580,150,50);
        L13.setForeground(Color.green);
        L13.setFont(new Font("atilic",Font.BOLD,60));

        B10.setBounds(200,575,200,60);
        B10.setBackground(Color.black);
        B10.setForeground(Color.blue);

        B20.setBackground(Color.darkGray);
        B20.setForeground(Color.white);

        M.add(m2);
        m2.add(B20);
        L44.add(M);
        L44.add(L1);L44.add(L2);L44.add(L3);L44.add(L4);L44.add(L5);L44.add(L6);L44.add(L7);L44.add(L8);L44.add(L9);L44.add(L10);L44.add(L11);L44.add(L12);L44.add(L13);
        L44.add(B1);L44.add(B2);L44.add(B3);L44.add(B4);L44.add(B5);L44.add(B6);L44.add(B7);L44.add(B8);L44.add(B9);L44.add(B10);
        this.add(L44);

        
        B1.addActionListener(G);
        B2.addActionListener(G);
        B3.addActionListener(G);
        B4.addActionListener(G);
        B5.addActionListener(G);
        B6.addActionListener(G);
        B7.addActionListener(G);
        B8.addActionListener(G);
        B9.addActionListener(G);
        B10.addActionListener(G);
        B20.addActionListener(G);


   
    }
    int player = 1;
    private void setIconImage() 
    {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        
        
    }
        
    private class gg implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            

            if(player == 1 )
            {

                if(e.getSource() == B1)
                {    
                    L1.setText(x);
                    L1.setVisible(true);
                    L1.setForeground(Color.blue);
                    B1.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s7=L7.getText();s9=L9.getText();
                    if(s1.equals(x)&&s2.equals(x)&&s3.equals(x))
                    {
                        Winer w =new Winer("Player 1");
                    }
                    else if(((s1==x)&&(s5==x)&&(s9==x)))
                    {
                        Winer w =new Winer("Player 1");
                    }
                    else if(((s1==x)&&(s4==x)&&(s7==x)))
                    {
                        Winer w =new Winer("Player 1");
                    }
                }
                else if(e.getSource() == B2)
                {    
                    L2.setText(x);
                    L2.setVisible(true);
                    L2.setForeground(Color.blue);
                    B2.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                    if(s1.equals(x)&&s2.equals(x)&&s3.equals(x))
                    {
                        Winer w =new Winer("Player 1");
                    }
                    else if(((s2==x)&&(s5==x)&&(s8==x)))
                    {
                        Winer w =new Winer("Player 1");
                    }
                }
                else if(e.getSource() == B3)
                {    
                    L3.setText(x);
                    L3.setVisible(true);
                    L3.setForeground(Color.blue);
                    B3.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                    if(s1.equals(x)&&s2.equals(x)&&s3.equals(x))
                    {
                        Winer w =new Winer("Player 1");
                    }
                    else if(((s3==x)&&(s6==x)&&(s9==x)))
                    {
                        Winer w =new Winer("Player 1");
                    }
                    else if(((s7==x)&&(s5==x)&&(s3==x)))
                    {
                        Winer w =new Winer("Player 1");
                    }
                }
                else if(e.getSource() == B4)
                {    
                    L4.setText(x);
                    L4.setVisible(true);
                    L4.setForeground(Color.blue);
                    B4.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                    if(s4.equals(x)&&s5.equals(x)&&s6.equals(x))
                    {
                        Winer w =new Winer("Player 1");
                    }
                    else if(((s1==x)&&(s4==x)&&(s7==x)))
                    {
                        Winer w =new Winer("Player 1");
                    }
                }
                else if(e.getSource() == B5)
                {    
                    L5.setText(x);
                    L5.setVisible(true);
                    L5.setForeground(Color.blue);
                    B5.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                    if(s4.equals(x)&&s5.equals(x)&&s6.equals(x))
                    {
                        Winer w =new Winer("Player 1");
                    }
                    else if(((s2==x)&&(s5==x)&&(s8==x)))
                    {
                        Winer w =new Winer("Player 1");
                    }
                }
                else if(e.getSource() == B6)
                {    
                    L6.setText(x);
                    L6.setVisible(true);
                    L6.setForeground(Color.blue);
                    B6.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                    if(s4.equals(x)&&s5.equals(x)&&s6.equals(x))
                    {
                        Winer w =new Winer("Player 1");
                    }
                    else if(((s3==x)&&(s6==x)&&(s9==x)))
                    {
                        Winer w =new Winer("Player 1");
                    }
                }
                else if(e.getSource() == B7)
                {    
                    L7.setText(x);
                    L7.setVisible(true);
                    L7.setForeground(Color.blue);
                    B7.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                    if(s7.equals(x)&&s8.equals(x)&&s9.equals(x))
                    {
                        Winer w =new Winer("Player 1");
                    }
                    else if(((s1==x)&&(s4==x)&&(s7==x)))
                    {
                        Winer w =new Winer("Player 1");
                    }
                    else if(((s7==x)&&(s5==x)&&(s3==x)))
                    {
                        Winer w =new Winer("Player 1");
                    }
                }
                else if(e.getSource() == B8)
                {    
                    L8.setText(x);
                    L8.setVisible(true);
                    L8.setForeground(Color.blue);
                    B8.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                     if(s7.equals(x)&&s8.equals(x)&&s9.equals(x))
                    {
                        Winer w =new Winer("Player 1");
                    }
                    else if(((s2==x)&&(s5==x)&&(s8==x)))
                    {
                        Winer w =new Winer("Player 1");
                    }
                }
                else if(e.getSource() == B9)
                {    
                    L9.setText(x);
                    L9.setVisible(true);
                    L9.setForeground(Color.blue);
                    B9.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                    if(s7.equals(x)&&s8.equals(x)&&s9.equals(x))
                    {
                        Winer w =new Winer("Player 1");
                    }
                    else if(((s3==x)&&(s6==x)&&(s9==x)))
                    {
                        Winer w =new Winer("Player 1");
                    }
                    else if(((s1==x)&&(s5==x)&&(s9==x)))
                    {
                        Winer w =new Winer("Player 1");
                    }
                }
                player = 2;

            }
            else
            {
                if(e.getSource() == B1)
                {    
                    L1.setText(o);
                    L1.setVisible(true);
                    L1.setForeground(Color.green);
                    B1.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s7=L7.getText();s9=L9.getText();
                    if(s1.equals(o)&&s2.equals(o)&&s3.equals(o))
                    {
                        Winer w =new Winer("Player 2");
                    }
                    else if(((s1==o)&&(s5==o)&&(s9==o)))
                    {
                        Winer w =new Winer("Player 2");
                    }
                    else if(((s1==o)&&(s4==o)&&(s7==o)))
                    {
                        Winer w =new Winer("Player 2");
                    }
                }
                else if(e.getSource() == B2)
                {    
                    L2.setText(o);
                    L2.setVisible(true);
                    L2.setForeground(Color.green);
                    B2.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                    if(s1.equals(o)&&s2.equals(o)&&s3.equals(o))
                    {
                        Winer w =new Winer("Player 2");
                    }
                    else if(((s2==o)&&(s5==o)&&(s8==o)))
                    {
                        Winer w =new Winer("Player 2");
                    }
                }
                else if(e.getSource() == B3)
                {    
                    L3.setText(o);
                    L3.setVisible(true);
                    L3.setForeground(Color.green);
                    B3.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                    if(s1.equals(o)&&s2.equals(o)&&s3.equals(o))
                    {
                        Winer w =new Winer("Player 2");
                    }
                    else if(((s3==o)&&(s6==o)&&(s9==o)))
                    {
                        Winer w =new Winer("Player 2");
                    }
                    else if(((s7==o)&&(s5==o)&&(s3==o)))
                    {
                        Winer w =new Winer("Player 2");
                    }
                }
                else if(e.getSource() == B4)
                {    
                    L4.setText(o);
                    L4.setVisible(true);
                    L4.setForeground(Color.green);
                    B4.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                    if(s4.equals(o)&&s5.equals(o)&&s6.equals(o))
                    {
                        Winer w =new Winer("Player 2");
                    }
                    else if(((s1==o)&&(s4==o)&&(s7==o)))
                    {
                        Winer w =new Winer("Player 2");
                    }
                }
                else if(e.getSource() == B5)
                {    
                    L5.setText(o);
                    L5.setVisible(true);
                    L5.setForeground(Color.green);
                    B5.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                    if(s4.equals(o)&&s5.equals(o)&&s6.equals(o))
                    {
                        Winer w =new Winer("Player 2");
                    }
                    else if(((s2==o)&&(s5==o)&&(s8==o)))
                    {
                        Winer w =new Winer("Player 2");
                    }
                }
                else if(e.getSource() == B6)
                {    
                    L6.setText(o);
                    L6.setVisible(true);
                    L6.setForeground(Color.green);
                    B6.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                    if(s4.equals(o)&&s5.equals(o)&&s6.equals(o))
                    {
                        Winer w =new Winer("Player 2");
                    }
                    else if(((s3==o)&&(s6==o)&&(s9==o)))
                    {
                        Winer w =new Winer("Player 2");
                    }
                }
                else if(e.getSource() == B7)
                {    
                    L7.setText(o);
                    L7.setVisible(true);
                    L7.setForeground(Color.green);
                    B7.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                    if(s7.equals(o)&&s8.equals(o)&&s9.equals(o))
                    {
                        Winer w =new Winer("Player 2");
                    }
                    else if(((s1==o)&&(s4==o)&&(s7==o)))
                    {
                        Winer w =new Winer("Player 2");
                    }
                    else if(((s7==o)&&(s5==o)&&(s3==o)))
                    {
                        Winer w =new Winer("Player 2");
                    }
                }
                else if(e.getSource() == B8)
                {    
                    L8.setText(o);
                    L8.setVisible(true);
                    L8.setForeground(Color.green);
                    B8.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                     if(s7.equals(o)&&s8.equals(o)&&s9.equals(o))
                    {
                        Winer w =new Winer("Player 2");
                    }
                    else if(((s2==o)&&(s5==o)&&(s8==o)))
                    {
                        Winer w =new Winer("Player 2");
                    }
                }
                else if(e.getSource() == B9)
                {    
                    L9.setText(o);
                    L9.setVisible(true);
                    L9.setForeground(Color.green);
                    B9.setVisible(false);
                    s1=L1.getText();s2=L2.getText();s3=L3.getText();s4=L4.getText();s5=L5.getText();
                    s6=L6.getText();s7=L7.getText();s8=L8.getText();s9=L9.getText();
                    if(s7.equals(o)&&s8.equals(o)&&s9.equals(o))
                    {
                        Winer w =new Winer("Player 2");
                    }
                    else if(((s3==o)&&(s6==o)&&(s9==o)))
                    {
                        Winer w =new Winer("Player 2");
                    }
                    else if(((s1==o)&&(s5==o)&&(s9==o)))
                    {
                        Winer w =new Winer("Player 2");
                    }
                }

                player = 1;

            }
            if(e.getSource() == B10)
                {    

                    B1.setVisible(true);
                    L1.setVisible(false);
                    L1.setText("");
                    B2.setVisible(true);
                    L2.setVisible(false);
                    L2.setText("");
                    B3.setVisible(true);
                    L3.setVisible(false);
                    L3.setText("");
                    B4.setVisible(true);
                    L4.setVisible(false);
                    L4.setText("");
                    B5.setVisible(true);
                    L5.setVisible(false);
                    L5.setText("");
                    B6.setVisible(true);
                    L6.setVisible(false);
                    L6.setText("");
                    B7.setVisible(true);
                    L7.setVisible(false);
                    L7.setText("");
                    B8.setVisible(true);
                    L8.setVisible(false);
                    L8.setText("");
                    B9.setVisible(true);
                    L9.setVisible(false);
                    L9.setText("");
                    player = 1;
                }
            if(e.getSource()==B20)
            {
                About AB = new About();
                player = 1;
            }
            
            
            
        }
    
    
    
    }
        
}
