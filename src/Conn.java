import java.sql.*;

public class Conn {

  //Create Connection
  Connection c;
  Statement s;
  public Conn() {
    try {
      c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "suckmydick");
      s = c.createStatement();

    } catch (Exception e){
      System.out.println(e);
    }
  }

}
