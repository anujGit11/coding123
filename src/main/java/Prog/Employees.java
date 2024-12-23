package Prog;


//write a program where Class is Employee and this Class Has fields like
//  id(key) and salary(value) and just display the salary into list?
public class Employees {
    private int id;
    private int salary;

    public Employees(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }
}
