package Dbs;


import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Database {
	

		static String URL = "jdbc:mysql://localhost:3306/";
		static String db = "patientrecord";
		static String u_name = "root";
		static String u_pwd = "";
		private static Connection connection;

		Statement statement = null;
		ResultSet resultSet = null;

		public static Connection getcon() {

			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				connection = DriverManager.getConnection(URL + db, u_name, u_pwd);
				System.out.println("Creating statement...");

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return connection;
		}

		public boolean execute(String query) throws SQLException {
			Connection con = getcon();
			Statement s = con.createStatement();

			return s.execute(query);
		}

		public ResultSet select(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		public ResultSet execute1(String query) throws SQLException {
			// TODO Auto-generated method stub
			ResultSet rs=null;
			Connection con=getcon();
			Statement s=con.createStatement();
			rs=s.executeQuery(query);
			return rs;
			
		}
	}



	
