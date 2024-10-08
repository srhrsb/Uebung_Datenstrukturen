import java.time.LocalDate;
import java.util.ArrayList;

public interface EmployeeDAO {

    boolean addEmployee(String firstName, String lastName,
                               String employeeId, String job, int phone,
                               int room, LocalDate hiringDate, EmploymentType type );

    /**
     * Löscht den Mitarbeiter mit übergebender ID
     * @param id
     * @return
     */
    boolean deleteEmployeeById( String id );

    /**
     * Löscht die komplette Liste der Mitarbeiter
     * @return Erfolgsmeldung
     */
    boolean deleteAll();

    /**
     * Löscht die gegeben Mitarbeiter
     * @return Erfolgsmeldung
     */
    boolean deleteByList( ArrayList<Employee> collection );

    /**
     * Gibt den Mitarbeiter mit der gegebenen ID zurück
     * @param id ID des Mitarbeiters
     * @return Mitarbeiter
     */
     Employee getEmployeeById( String id);

}
