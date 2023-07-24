package oop1;

public class Employee {
    private String ID;
    private String FullName;
    private float Salary;

    public void setID(String ID) {
        this.ID = ID;
    }
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }
    public void setSalary(float Salary) {
        this.Salary = Salary;
    }
    public String getID() {
        return ID;
    }
    public String getFullName() {
        return FullName;
    }
    public float getSalary() {
        return Salary;
    }
    public float CalculateSalaryPerYear() {
        return Salary * 12;
    }
    public float CalculateSalaryBonus() {
        return Salary * 1.05f;
    }
}
