import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class login extends JFrame 
{
	Container c;
	JLabel u,p;
	JTextField ut;
	JPasswordField pt;
	JButton Sub,Ex;
	String s1,s2;

login()
{
c=getContentPane();
c.setLayout(new FlowLayout());

u = new JLabel("UserName");
p = new JLabel("PassWord");	
ut = new JTextField(10);
pt = new JPasswordField(10);
Sub = new JButton("Submit"); 
Ex = new JButton("Exit");
 
c.add(u);
c.add(ut);
c.add(p);
c.add(pt);
c.add(Sub);
c.add(Ex);




ActionListener a =(ae)->{

if(ae.getSource()==Sub)
{
s1=ut.getText();
s2=pt.getText();

if(s1.equals("Ashish") && s2.equals("123"))
{
JOptionPane.showMessageDialog(c,"Successful Login");
MainFrame m = new MainFrame();
dispose();
}
else
{
JOptionPane.showMessageDialog(c,"Wrong Password! please enter again");
ut.setText("");
pt.setText("");
ut.requestFocus();
}
}
};
Sub.addActionListener(a);





}
}


 




