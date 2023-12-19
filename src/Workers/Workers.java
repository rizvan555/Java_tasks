package Workers;

public class Workers {
    private String name;
    private int averageSalary;
    private String department;

    public Workers(String name, int averageSalary, String department) {
        this.name = name;
        this.averageSalary = averageSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }
    public int getAverageSalary() {
        return averageSalary;
    }
    public String getDepartment() {
        return department;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAverageSalary(int averageSalary){
        this.averageSalary = averageSalary;
    }
    public void setDepartment(String department){
        this.department = department;
    }


    //Methods-Functions
    public void work(){
        System.out.println("Working...");
    }

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Department: " + department);
    }

    public void changeDepartment(String newDepartment){
        this.department = newDepartment;
        System.out.println("Department changed to " + this.department);
    }
}
