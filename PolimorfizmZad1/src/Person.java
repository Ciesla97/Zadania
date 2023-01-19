public class Person {
    private String name;
    private String lastName;
    private int paycheck;

    public Person(String name, String lastName, int paycheck) {
        this.name = name;
        this.lastName = lastName;
        this.paycheck = paycheck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(int paycheck) {
        this.paycheck = paycheck;
    }
}
