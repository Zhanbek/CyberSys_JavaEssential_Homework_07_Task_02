package model;



public class Worker {
    private String lastName;
    private String firstName;
    private String middleName;
    private String position;
    private int hireDateYear;

    public Worker() {
    }

    public Worker(String lastName, String firstName, String middleName, String position, int hireDateYear) {
        this.firstName = firstName;
        this.hireDateYear = hireDateYear;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getHireDateYear() {
        return hireDateYear;
    }

    public void setHireDateYear(int hireDateYear) {
        this.hireDateYear = hireDateYear;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperience(int currentYear) {
        return currentYear - hireDateYear;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", position='" + position + '\'' +
                ", hireDateYear='" + hireDateYear + '\'' +
                '}';
    }
}

