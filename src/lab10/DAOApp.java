package lab10;

import java.util.List;

public class DAOApp {
    public static void main(String[] args) {
        empDAOImpl dao = empDAOImpl.getInstant();

        List<Employee> allEmp = dao.getAllEmp();
        System.out.println("-----Data in Database-----");
        for (Employee emp : allEmp) {
            System.out.println(emp.toString());
        }
        System.out.println("--------------------------");

    }//main
}//class
