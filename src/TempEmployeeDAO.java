import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TempEmployeeDAO implements EmployeeDAO{
    private List<Employee> employees;

    public TempEmployeeDAO() {
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
                                int room, LocalDate hiringDate, EmploymentType type ){

        Employee employee = new Employee( firstName, lastName, employeeId,
                                          job, phone, room, hiringDate, type);

        return employees.add( employee );
    }

    /**
     * Löscht den Mitarbeiter mit übergebender ID
     * @param id
     * @return
     */
    public boolean deleteEmployeeById( String id ){

        for(Employee employee : employees){
            if(employee.getEmployeeId().equals( id )){
                return employees.remove(employee);
            }
        }
        return false;
    }

    /**
     * Löscht die komplette Liste der Mitarbeiter
     * @return Erfolgsmeldung
     */
    public boolean deleteAll(){
        employees.clear();
        return true;
    }

    /**
     * Löscht die gegeben Mitarbeiter
     * @return Erfolgsmeldung
     */
    public boolean deleteByList( ArrayList<Employee> collection ){
        employees.removeAll(collection);
        return true;
    }

    /**
     * Gibt den Mitarbeiter mit der gegebenen ID zurück
     * @param id ID des Mitarbeiters
     * @return Mitarbeiter
     */
    public Employee getEmployeeById( String id){

        for(Employee employee : employees){
            if(employee.getEmployeeId().equals( id ))
                return employee;

        }

        return null;
    }






















}
