public class Patient {
   private String name ;
   private String lastName;
   private String peselNumber;

    public Patient(String name, String lastName, String peselNumber) {
        this.name = name;
        this.lastName = lastName;
        this.peselNumber = peselNumber;
    }

    public Patient() {
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

    public String getPeselNumber() {
        return peselNumber;
    }

    public void setPeselNumber(String peselNumber) {
        this.peselNumber = peselNumber;
    }

    String getInfo(){
        return name + " " + lastName + " " + peselNumber;
    }
}
