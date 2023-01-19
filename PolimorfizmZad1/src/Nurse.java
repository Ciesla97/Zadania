public class Nurse extends Person{

    private double overtime;

    public Nurse(String name, String lastName, int paycheck, double overtime) {
        super(name, lastName, paycheck);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }




}
