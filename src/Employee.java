import java.time.LocalDate;

public class Employee {
     private String firstName;
     private String lastName;
     private String employeeId;
     private String job;
     private int phone;
     private int room;
     private LocalDate hiringDate;
     private EmploymentType type;

    public Employee(String firstName, String lastName,
                    String employeeId, String job, int phone,
                    int room, LocalDate hiringDate, EmploymentType type) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.job = job;
        this.phone = phone;
        this.room = room;
        this.hiringDate = hiringDate;
        this.type = type;
    }

    public EmploymentType getType() {
        return type;
    }

    public void setType(EmploymentType type) {
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }
}
