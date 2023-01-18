public class Employee extends Person{
    private String position;
    private double salary;

    public Employee(){
        super();
    }
    public Employee(String name, String surname, String position, double salary){
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getPosition(){
        return position;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: " +super.toString();
    }

    @Override
    public double getPaymentAmount() {
        return getSalary();
    }

    @Override
    public int compareTo(Person o) {
        return super.compareTo(o);
    }
}