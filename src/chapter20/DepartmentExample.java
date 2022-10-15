package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class DepartmentExample {

	public static void main(String[] args) throws SQLException {

		DriverManager.registerDriver(new OracleDriver());

		Connection department = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pc11", "java");

		Statement qurry = department.createStatement();

		ResultSet resultSet = qurry.executeQuery("select dept_id, dept_name, dept_tel from department");

		while (resultSet.next()) {

			String deptId = resultSet.getString("dept_id");
			String deptName = resultSet.getString("dept_name");
			String deptTel = resultSet.getString("dept_tel");

			System.out.printf("%s\t%s\t%s\n", deptId, deptName, deptTel);

		}

		resultSet.close();
		qurry.close();
		department.close();

	}

}
