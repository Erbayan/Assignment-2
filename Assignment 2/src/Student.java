public class Student extends Person{
    private double gpa;
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa){
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }
    public String toString() {
        return "Student: " + super.toString();
    }
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return super.getPaymentAmount();
        }else{
            return 0;
        }
    }
    public int compareTo(Person o) {
        return super.compareTo(o);
    }
}
