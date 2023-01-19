public class Hospital {
    private final int maxEmployees = 3;
    private Person[] employee = new Person[3];
    private int currentEmployees = 0;


    public void add(Person person){
        if(currentEmployees < maxEmployees){
           employee[currentEmployees] = person;
           currentEmployees++;
        }else{
            System.out.println("Zbyt dużo pracowników!");
        }

    }

    public void getInfo() {
        for (int i = 0; i < currentEmployees; i++) {
            System.out.println(employee[i].getName() + " " + employee[i].getLastName() + " " +
                    employee[i].getPaycheck());

        }

    }


    public int getMaxEmployees() {
        return maxEmployees;
    }

    public Person[] getEmployee() {
        return employee;
    }

    public void setEmployee(Person[] employee) {
        this.employee = employee;
    }

    public int getCurrentEmployees() {
        return currentEmployees;
    }

    public void setCurrentEmployees(int currentEmployees) {
        this.currentEmployees = currentEmployees;
    }
}



