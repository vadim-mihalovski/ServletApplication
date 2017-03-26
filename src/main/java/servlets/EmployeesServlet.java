package servlets;

import dao.JDBCUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

@WebServlet(urlPatterns = "/employees", loadOnStartup = 1)
public class EmployeesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Connection conn = JDBCUtils.getConnectionPool().checkOut();

//        for (int i = 0; i < 40; i++) {
//            Employee employee = new Employee("Name #" + i, "Position #" + i, "Office #" + i, "Age #" + i, "Start Date #" + i, "Salary #" + i);
//            JDBCUtils.insertEmployee(conn,employee);
//        }

        request.setAttribute("employees", JDBCUtils.getEmployees(conn));
        JDBCUtils.getConnectionPool().checkIn(conn);

        request.getRequestDispatcher("/employees.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doPost(request, response);
    }
}
