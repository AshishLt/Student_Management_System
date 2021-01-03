import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class deptviewWindow extends JFrame {

Container c;
public TextArea ta;
JButton back;

deptviewWindow()
{
c=getContentPane();
c.setLayout(new FlowLayout());
ta=new TextArea(50,50);
c.add(ta);

back = new JButton("BACK");
c.add(back);

ta.setText(new dbhandler2().viewDept());

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
deptviewWindow d = new deptviewWindow();


}


class dbhandler2 {

public String viewDept()
{
StringBuffer sb = new StringBuffer();
try{
DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college","root", "");
System.out.println("open");

String sql="select * from department";
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(sql);
while(rs.next())
{
int r =rs.getInt("id");
String n =rs.getString("name");
sb.append("ID "+r+" NAME "+n+"\n");
}

rs.close();
con.close();
System.out.println("close");
}
catch(SQLException e){
System.out.println("insert issue"+e);
}
return sb.toString();



}


}



}


