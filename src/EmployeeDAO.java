import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    private List<Employee> employees;

    public EmployeeDAO() {
        employees = new ArrayList<>();
    }

    /**
     * Fügt einen neuen Mitarbeiter zur Mitarbeiterlist hinzu.
     * @param firstName - Vorname
     * @param lastName - Nachname
     * @param employeeId - ID
     * @param job -Job
     * @param phone - Telefon
     * @param room - Raum
     * @param hiringDate - Einstellungsdatum
     * @return success -Erfolg
     */
    public boolean addEmployee( String firstName, String lastName,
                                String employeeId, String job, int phone,
                                int room, LocalDate hiringDate ){

        Employee employee = new Employee( firstName, lastName, employeeId,
                                          job, phone, room, hiringDate);

        return employees.add( employee );
    }










}
