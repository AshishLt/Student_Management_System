import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class deptupdateWindow extends JFrame {

Container c ;
JButton back,save;
JLabel id,name;
JTextField txtid,txtname;
TextArea ta;

deptupdateWindow()
{
c=getContentPane();

c.setLayout(new FlowLayout());

id= new JLabel("Enter the id where to UPDATE");
name = new JLabel("SET NAME");
txtid = new JTextField(10);
txtname = new JTextField(10);
back = new JButton("BACK");
save = new JButton("SAVE");


c.add(id);
c.add(txtid);
c.add(name);
c.add(txtname);
c.add(save);
c.add(back);  

setSize(500,500);
setLocation(200,200);
setTitle("cms");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);



ActionListener a2=(ae)->{opWindow m = new opWindow(); dispose();};
back.addActionListener(a2);

ActionListener a1=(ae)->{
String r = txtid.getText();
String n = txtname.getText();



dbhandler3 db = new dbhandler3();
db.updateDept(n,Integer.parseInt(r));

JOptionPane.showMessageDialog(c,"created");
};
save.addActionListener(a1);

}
















class dbhandler3 {




public void updateDept(String name,int id  )
{

try{
DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college","root", "");
System.out.println("open");
Statement s = con.createStatement();

String sql = "update department set name='"+name+"' where id="+id+";";
System.out.println(name+" "+id);



try{
	
int r = s.executeUpdate(sql);
JOptionPane.showMessageDialog(new JDialog(),r + "record Updated");
}
catch(SQLException e){
System.out.println("Update issue"+e);
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






