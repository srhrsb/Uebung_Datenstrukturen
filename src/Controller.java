import java.time.LocalDate;

public class Controller {

    private EmployeeDAO employeeDB;

    public Controller(EmployeeDAO employeeDB) {
        this.employeeDB = employeeDB;

        employeeDB.addEmployee("h", "t","1","Test",12345687, 100, LocalDate.of(2024, 12, 3));

    }

    public static void main(String[] args) {
         new Controller( new EmployeeDAO() );
    }

}