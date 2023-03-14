
package bank_mangement_system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;




public class signUpThree extends JFrame implements ActionListener
{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1, c2 ,c3 , c4 , c5,c6,c7;
    JButton submit, cancel;
    
    String formno;
    
    signUpThree( String formno)
    {
        this.formno = formno;
        
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel l1 =new JLabel("page 3 : Account Details");
        l1.setFont(new Font("Raleway" , Font.BOLD,22)); 
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type =new JLabel(" Account type");
        type.setFont(new Font("Raleway" , Font.BOLD,22)); 
        type.setBounds(100,140,200,30);
        add(type);
        
        r1 = new JRadioButton("saving Account");
        r1.setFont(new Font("Raleway" , Font.BOLD,16));
        r1.setBackground(Color.white);
        r1.setBounds(100,180,250,20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway" , Font.BOLD,16));
        r2.setBackground(Color.white);
        r2.setBounds(350,180,250,20);
        add(r2); 
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway" , Font.BOLD,16));
        r3.setBackground(Color.white);
        r3.setBounds(100,220,250,20);
        add(r3); 
       
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway" , Font.BOLD,16));
        r4.setBackground(Color.white);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        
        
           ButtonGroup accountbutton = new ButtonGroup();
        accountbutton.add(r1);
        accountbutton.add(r2);
        accountbutton.add(r3);
        accountbutton.add(r4);
        
        JLabel card =new JLabel(" Card Number");
        card.setFont(new Font("Raleway" , Font.BOLD,22)); 
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number =new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway" , Font.BOLD,22)); 
        number.setBounds(350,300,300,30);
        add(number);
        
            JLabel carddetail =new JLabel("your 16 digits card number");
        carddetail.setFont(new Font("Raleway" , Font.BOLD,12)); 
        carddetail.setBounds(100,330,300,20);
        add(carddetail);
        
          JLabel pin =new JLabel("Pin Number");
        pin.setFont(new Font("Raleway" , Font.BOLD,22)); 
        pin.setBounds(100,370,200,30);
        add(pin);
        
    
        JLabel pnumber =new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway" , Font.BOLD,22)); 
        pnumber.setBounds(350,370,300,30);
        add(pnumber);
        
             JLabel pindetail =new JLabel("your 4 digits pin");
        pindetail.setFont(new Font("Raleway" , Font.BOLD,12)); 
        pindetail.setBounds(100,400,300,20);
        add(pindetail);
        
            JLabel services =new JLabel("Services Required :");
        services.setFont(new Font("Raleway" , Font.BOLD,22)); 
        services.setBounds(100,450,400,30);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway", Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
       
         c2 = new JCheckBox("INTERNET BANKING");
        c2.setBackground(Color.white);
        c2.setFont(new Font("Raleway", Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
         c3 = new JCheckBox("MOBILE BANKING");
        c3.setBackground(Color.white);
        c3.setFont(new Font("Raleway", Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
         c4 = new JCheckBox("EMAIL & SMS ALERts");
        c4.setBackground(Color.white);
        c4.setFont(new Font("Raleway", Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
         c5 = new JCheckBox("CHEQUE BOOK");
        c5.setBackground(Color.white);
        c5.setFont(new Font("Raleway", Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
         c6 = new JCheckBox("E-STATEMENT");
        c6.setBackground(Color.white);
        c6.setFont(new Font("Raleway", Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
         c7 = new JCheckBox("I herby declare that the above entered details are correct best of my knowledge");
        c7.setBackground(Color.white);
        c7.setFont(new Font("Raleway", Font.BOLD,12));
        c7.setBounds(100,680,600,30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250 , 720, 100 , 30);
        submit.addActionListener(this);
        add(submit);
        
        
        cancel = new JButton("cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420 , 720, 100 , 30);
        add(cancel);
        cancel.addActionListener(this);
        
        getContentPane().setBackground(Color.white);
  
        setSize(850,820);
        setLocation(350,0);
   
        
    }


    public static void main(String[] args) 
    {
        new signUpThree("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   
        if(e.getSource()==cancel)
        {
            setVisible(false);
            new Login().setVisible(true);
            
            
        }else if(e.getSource()==submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType ="Saving Account";
            }else   if(r2.isSelected()){
                accountType ="Fixed Dposit Account";
            }else   if(r3.isSelected()){
                accountType ="Current Account";
            }else   if(r4.isSelected()){
                accountType ="Current Account";
            }
        Random random =new Random();
        
        String cardnumber = ""+Math.abs((random.nextLong() %90000000L) + 5040936000000000L);
        
        String pinnumber = "" + Math.abs((random.nextLong() %9000L)+1000L);
        
        
        String facility = "";
        if(c1.isSelected()){
            facility = facility = " ATM CARD";
        } else  if(c2.isSelected()){
            facility = facility = " Internet Banking";
        } else  if(c3.isSelected()){
            facility = facility = " Mobile Banking";
        } else  if(c4.isSelected()){
            facility = facility = " EMAIL & SMS alerts";
        } else  if(c5.isSelected()){
            facility = facility = " Cheque Book";
        } else  if(c6.isSelected()){
            facility = facility = " E-Statement";
        } 
        
        try{
        
            if(accountType.equals("")){
                JOptionPane.showMessageDialog(null,"Account type is Required");
            }else{
            
            con c = new con();
           
            String query1 = "insert into signupthree values( '"+formno+"' ,'"+accountType+"' ,'"+cardnumber+"' ,'"+pinnumber+"' ,'"+ facility+"' )";
            String query2 = "insert into login values( '"+formno+"' ,'"+cardnumber+"' ,'"+pinnumber+"')";
            c.st.executeUpdate(query1);
             c.st.executeUpdate(query2);
             
            JOptionPane.showMessageDialog(null,"Card Number :" + cardnumber + "\n pin : " +pinnumber);
           
            
                setVisible(false);
                new Deposit(pinnumber).setVisible(true);
            }
            
        } catch(Exception f)
        {
           
            System.out.println(f);
        }            
        }
    
    }

}
