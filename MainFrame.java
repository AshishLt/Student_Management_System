import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class MainFrame extends JFrame {

	Container c;		//declaration
	JButton d,f,C,h,s;	//declaration
	

MainFrame() 
{
	c = getContentPane();
	
	d = new JButton("Department");    //Creating Button
	f = new JButton("Faculty");	//Creating Button
	h = new JButton("Hostel");	//Creating Button
	C = new JButton("Course");	//Creating Button
	s = new JButton("Student");	//Creating Button
	

	c.setLayout(new FlowLayout());	

	c.add(d);	//adding button to Container
	c.add(f);	//adding button to Container
	c.add(h);	//adding button to Container	
	c.add(C);	//adding button to Container
	c.add(s);	//adding button to Container
	
//EventHandling
ActionListener a1=(ae)->{opWindow m = new opWindow(); dispose();};      //EventHandling
d.addActionListener(a1);

ActionListener a2=(ae)->{opWindow m = new opWindow(); dispose();};     //EventHandling
f.addActionListener(a2);
 
ActionListener a3=(ae)->{opWindow m = new opWindow(); dispose();};     //EventHandling
C.addActionListener(a3);
 
ActionListener a4=(ae)->{opWindow m = new opWindow(); dispose();};    //EventHandling
h.addActionListener(a4);
 
ActionListener a5=(ae)->{opWindow m = new opWindow(); dispose();};    //EventHandling
s.addActionListener(a5);


 

setSize(500,500);
setLocation(200,200);
setTitle("cms");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

}



public static void main(String args[])
{
MainFrame f = new MainFrame();

}
}


























