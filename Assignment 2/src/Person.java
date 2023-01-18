public class Person implements Payable, Comparable<Person>{
    int id;
    private static int numb = 1;
    String name;
    String surname;

    public Person(){
        id = numb++;
    }
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    @Override
    public String toString() {
        return id + "."
                + name +" " + surname;
    }
    public String getPosition(){
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 36660.00;
    }

    @Override
    public int compareTo(Person o) {
        return (int)(getPaymentAmount() - o.getPaymentAmount());
    }
}