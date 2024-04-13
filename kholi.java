
import java.sql.PreparedStatement;
import java.sql.*;

public class kholi {

	public static void main(String[] args) {
		String ur1 = "jdbc:mysql://localhost:3306/shetty";
		String uname = "root";
		String pwd = "thanu";
		String query = "update Student set stud_marks=? where Stud_name=?";
		try {
			Connection c = DriverManager.getConnection(ur1,uname,pwd);
			Statement s = c.createStatement();
			PreparedStatement pstmt = c.prepareStatement(query);
			pstmt.setInt(1, 299);
			pstmt.setString(2,"lokii");
            System.out.println("tstud_id\tStud_name\tmarks");
            while(rs.next())
            {
                int stud_id = rs.getInt("stud_id");
                String Stud_name =rs.getString("Stud_name");
                int marks = rs.getInt("marks");
              
                System.out.println(stud_id+" "+Stud_name+" "+marks+" ");
            }
            rs.close();
            s.close();
            c.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}