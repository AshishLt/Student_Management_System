import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class deptcreateWindow extends JFrame 
{
Container c;

JLabel id,name;
JTextField txtid,txtname;
JButton save,back;
deptcreateWindow()
{
c=getContentPane();
c.setLayout(new FlowLayout());

save= new JButton("SAVE");
back= new JButton("BACK");
id = new JLabel("ID");
name = new JLabel("NAME");
txtid= new JTextField(10);
txtname = new JTextField(10);


c.add(id);
c.add(txtid);
c.add(name);
c.add(txtname);
c.add(save);
c.add(back);

ActionListener a1=(ae)->{
String r = txtid.getText();
String n = txtname.getText();
dbhandler1 db = new dbhandler1();
db.addDept(Integer.parseInt(r),n);	
JOptionPane.showMessageDialog(c,"created");
};
save.addActionListener(a1);


ActionListener a2=(ae)->{opWindow m = new opWindow(); dispose();};
back.addActionListener(a2);





setSize(500,500);
setLocation(200,200);
setTitle("cms");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);


}
public static void main(String args[])
{
deptcreateWindow d = new deptcreateWindow();


}



class dbhandler1 {

public void addDept(int id , String name)
{
try{
DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college","root", "");
System.out.println("open");

String sql = "insert into department values(?,?)";
PreparedStatement pst = con.prepareStatement(sql);
pst.setInt(1,id);
pst.setString(2,name);
try{
int r = pst.executeUpdate();
JOptionPane.showMessageDialog(new JDialog(),r + "record inserted");
}
catch(SQLException e){
	JOptionPane.showMessageDialog(c,"Primary Key Property Voilated");
System.out.println("insert issue"+e);
}
con.close();
System.out.println("close");

}
catch(SQLException e){
System.out.println("issue"+e);
}
}
}
}