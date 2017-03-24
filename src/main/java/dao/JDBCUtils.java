package dao;

import model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by dzna0914 on 3/24/2017.
 */
public class JDBCUtils {

    private static JDBCConnectionPool connectionPool;

    public static JDBCConnectionPool getConnectionPool() {
        if (connectionPool == null) {
            connectionPool = new JDBCConnectionPool(
                    "com.mysql.jdbc.Driver",
                    "jdbc:mysql://localhost:3306/nc_lab_2017",
                    "root",
                    "");
        }

        return connectionPool;
    }

    public static Collection<Employee> getEmployees(Connection conn) {
        List<Employee> list = new ArrayList<>();
        String sql = "select * from employees";
        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {

                String name = rs.getString("name");
                String position = rs.getString("position");
                String office = rs.getString("office");
                String age = rs.getString("age");
                String startDate = rs.getString("startDate");
                String salary = rs.getString("salary");

                Employee employee = new Employee();
                employee.setName(name);
                employee.setPosition(position);
                employee.setOffice(office);
                employee.setAge(age);
                employee.setStartDate(startDate);
                employee.setSalary(salary);

                list.add(employee);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


        return list;
    }

    public static void insertEmployee(Connection conn, Employee employee) {
        String sql = "insert into employees(name,position,office,age,startDate,salary) values (?,?,?,?,?,?)";

        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, employee.getName());
            pstm.setString(2, employee.getPosition());
            pstm.setString(3, employee.getOffice());
            pstm.setString(4, employee.getAge());
            pstm.setString(5, employee.getStartDate());
            pstm.setString(6, employee.getSalary());

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
