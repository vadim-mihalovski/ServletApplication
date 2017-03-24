package dao;

import model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by dzna0914 on 3/24/2017.
 */
public class JDBCUtils {

    private static Connection connection;

    private static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/nc_lab_2017",
                        "root",
                        "");
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static Collection<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        String sql = "select * from employees";
        PreparedStatement pstm = null;
        try {
            pstm = getConnection().prepareStatement(sql);
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

    public static void insertEmployee(Employee employee) {
        String sql = "insert into employees(name,position,office,age,startDate,salary) values (?,?,?,?,?,?)";

        PreparedStatement pstm = null;
        try {
            pstm = getConnection().prepareStatement(sql);
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
