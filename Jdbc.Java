//let's create the employee table and insert some values which we retrieve using JDBC
CREATE TABLE employee(empID int primary key, empName varchar(10), empDept varchar(10));
insert into employee values(101, "john", "IT");

//Do the above thing in ur cmd after installing mysql
//now Java time
import java.sql.*;

public class DatabaseDemo {
  public static void main(String[] args) {
    String URL = "jdbc:mysql://localhost:3306/company";
    String username = "root";
    String password = "YOUR_MYSQL_PASSWORD";

   try {
Class.forName("com.mysql.cj.jdbc.Driver"); //2) Loading & Registering the Driver
// 3) Establishing connection
Connection con = DriverManager.getConnection(URL, username, password);
// 4) Creating & Executing the statement
Statement statement = con.createStatement();
ResultSet rs = statement.executeQuery("select * form employee");
System.out.println("Employee Details:");
// 5) Processing Results
while (rs.next()) {
int empID = rs.getInt("empID");
String empName = rs.getString("empName");
String empDept = rs.getString("empDept");
System.out.println(empID + " " + empName + " " + empDept);
}
//6) Closing the connection
con.close();
   }}
}

/* output
Employee Details:
101 John IT
102 Mike Finance
103 Tom IT */
