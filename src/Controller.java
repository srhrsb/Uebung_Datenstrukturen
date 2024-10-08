import java.time.LocalDate;

public class Controller {
    private EmployeeDAO employeeDB;

    public Controller(EmployeeDAO employeeDB) {
        this.employeeDB = employeeDB;

        //Mitarbeiter erzeugen und Bestätigung annehmen
        var success = employeeDB.addEmployee("Ingeborg", "Müller","1","Test",12345687, 100,
                                             LocalDate.of(2024, 12, 3), EmploymentType.UNLIMITED);
        //        boolean isDeleted = employeeDB.deleteEmployeeById("1");
        //        System.out.println("Mitarbeiter gelöscht: "+isDeleted);

        System.out.println( "Mitarbeiter hinzugefügt: "+success );

        //Mitarbeiter mit Hilfe der ID holen und Daten ausgeben
        Employee id1 = employeeDB.getEmployeeById("1");
        System.out.println( id1.getFirstName() );
        System.out.println( id1.getLastName() );
        System.out.println( id1.getType() );
    }

    public static void main(String[] args) {
        new Controller( new EmployeeDAO() );
    }

}