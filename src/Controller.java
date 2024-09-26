public class Controller {

    private EmployeeDAO employeeDB;

    public Controller(EmployeeDAO employeeDB) {
        this.employeeDB = employeeDB;

    }

    public static void main(String[] args) {
         new Controller( new EmployeeDAO() );
    }

}