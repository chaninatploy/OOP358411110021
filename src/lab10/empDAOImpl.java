package lab10;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class empDAOImpl implements empDAO {
    private static String driverName = "org.sqlite.JDBC";
    private static String url = "jdbc:sqlite:D:/company.sqlite";
    private static Connection conn = null;

    //Constants Operation
    private static final String GET_ALL_EMP = "select * from employee";

    private static empDAOImpl instant = new empDAOImpl();

    //constructor
    public empDAOImpl() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Load Driver Successfully");

    }

    public static empDAOImpl getInstant(){
        return instant;
    }

    @Override
    public List<Employee> getAllEmp() {
        List<Employee>emp=new ArrayList<>();
        try {
            conn=DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(GET_ALL_EMP);

            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String position = rs.getString(3);
                double salary = rs.getDouble(4);

                emp.add(new Employee(id, name, position, salary));
            }
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;
    }

    @Override
    public void addEmp(Employee emp) {

    }

    @Override
    public Employee getEmpById(int id) {
        return null;
    }

    @Override
    public void updateEmp(Employee emp) {

    }

    @Override
    public void deleteEmp(int id) {

    }
}
