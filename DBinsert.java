import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;

public class DBinsert {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter id and name :");
		System.out.println("enter your id to delete:");
		int id  = sc.nextInt();
//		String name = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("Driver Found");
			
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","12345678");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","12345678");//print data base

//			System.out.println("connection success");
			
			Statement statement  = connection.createStatement();// query execute
//			
//			ResultSet Set = statement.executeQuery("SELECT * FROM mydb.student");//print data base
//			while(Set.next()) { //true -next data
//				System.out.println(Set.getInt(1)+" "+Set.getString(2));
//			}
			
//			String query = "insert into Student (`name`) values('"+id+"','"+name+"')";
//			String query = "insert into Student (`name`) values('"+name+"')";
//
//			int i  = 0;
//			if(i != 0) {
//				System.out.println("data inserted");
//			}else {
//				System.out.println("try again");
//			}
//			statement.executeUpdate(query);
			
//			String query = "UPDATE `Student` SET `name` = '"+ name+"' WHERE (`id` = '"+id+"')"; //update database table
//			int i  = 0;
//			i = statement.executeUpdate(query);
//			if(i != 0) {
//				System.out.println("data updated");
//			}
			
			String query = "DELETE FROM `MyDB`.`Student` WHERE (`id` = '"+id+"')"; // data delete
			
			int i = 0;
			i = statement.executeUpdate(query);
			if(i !=0) {
				System.out.println("data deleted");
			}


			
		} catch (Exception e) {
		 	System.out.println(e);
		}
	}
}
