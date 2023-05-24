package mvctwo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentDataUtil", value = "/StudentDataUtil")
public class StudentDataUtil extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    public static List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Dang","Thi","dangthi@codelearn.com"));
        students.add(new Student("Dang","Thi","dangthi@codelearn.com"));
        students.add(new Student("Dang","Thi","dangthi@codelearn.com"));
        students.add(new Student("Dang","Thi","dangthi@codelearn.com"));

        return students;

    }
}

