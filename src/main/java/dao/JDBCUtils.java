package dao;

import model.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

/**
 * Created by dzna0914 on 3/24/2017.
 */
public class JDBCUtils {

    private static JDBCConnectionPool connectionPool;

    public static JDBCConnectionPool getConnectionPool() {
        if (connectionPool == null) {
            Properties props = readProperties("jdbc.properties");
            connectionPool = new JDBCConnectionPool(
                    props.getProperty("jdbc.Driver"),
                    props.getProperty("jdbc.url"),
                    props.getProperty("jdbc.user"),
                    props.getProperty("jdbc.password")
            );
        }

        return connectionPool;
    }

    private static Properties readProperties(String fileResourceName) {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = JDBCUtils.class.getClassLoader().getResourceAsStream(fileResourceName);
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return prop;
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
