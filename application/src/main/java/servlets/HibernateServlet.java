package servlets;

import dao.HibernateSessionFactory;
import model.Employee;
import org.hibernate.Session;

import javax.persistence.criteria.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

@WebServlet(urlPatterns = "/hibernate", loadOnStartup = 1)
public class HibernateServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();

        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaDelete<Employee> deleteQuery = builder.createCriteriaDelete(Employee.class);
//        deleteQuery.from(Employee.class);
//        session.createQuery(deleteQuery).executeUpdate();

//        for (int i = 0; i < 20; i++) {
//            Employee employee = new Employee("Name #" + i, "Position #" + i, "Office #" + i, "Age #" + i, "Start Date #" + i, "Salary #" + i);
//            session.save(employee);
//        }

        CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
        Root<Employee> employeeRoot = query.from(Employee.class);
        query.select(employeeRoot);

        session.getTransaction().commit();


        request.setAttribute("employees", session.createQuery(query).getResultList());
        session.close();

        request.getRequestDispatcher("/employees.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("key");
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaUpdate criteriaUpdate = builder.createCriteriaUpdate(Employee.class);
        Root<Employee> root = criteriaUpdate.from(Employee.class);
        Predicate condition = builder.equal(root.get("name"),name);
        criteriaUpdate.where(condition);
        criteriaUpdate.set(root.get("salary"),"100");

        int affected = session.createQuery(criteriaUpdate).executeUpdate();
        session.getTransaction().commit();
        session.close();
        if (affected > 0) {
            response.getWriter().append("100");
        } else {
            response.sendError(500);
        }

        response.getWriter().close();
// super.doPost(request, response);
    }
}