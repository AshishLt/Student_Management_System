import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class opWindow extends JFrame {

Container c;
JButton create,read,update,back,delete;



opWindow() {

c=getContentPane();
c.setLayout(new FlowLayout());


create  = new JButton("Create");
read = new JButton("Retrieve");
back = new JButton("Back");
update = new JButton("Update");
delete = new JButton("Delete");



c.add(create);
c.add(read);
c.add(update);
c.add(delete);
c.add(back);

setSize(500,500);
setLocation(200,200);
setTitle("cms");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);


ActionListener a1=(ae)->{MainFrame m = new MainFrame(); dispose();};
back.addActionListener(a1);

ActionListener a2=(ae)->{deptcreateWindow m = new deptcreateWindow(); dispose();};
create.addActionListener(a2);

ActionListener a3=(ae)->{deptviewWindow m = new deptviewWindow(); dispose();};
read.addActionListener(a3);

ActionListener a4=(ae)->{deptupdateWindow m = new deptupdateWindow(); dispose();};
update.addActionListener(a4);



}


public static void main(String args[])
{
opWindow f = new opWindow();

}


}				