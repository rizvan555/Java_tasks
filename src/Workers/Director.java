package Workers;

public class Director extends Workers {

    private int responsible_person;
    public Director(String name, int averageSalary, String department, int responsible_person) {
        super(name, averageSalary, department);
        this.responsible_person = responsible_person;
    }
    public int getResponsible_person() {
        return responsible_person;
    }
    public void setResponsible_person(int responsible_person) {
        this.responsible_person = responsible_person;
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("Responsible Person: " + responsible_person);
    }

}
