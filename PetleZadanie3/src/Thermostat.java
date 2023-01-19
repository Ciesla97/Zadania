public class Thermostat {
    private double currentTemp;
    private double targetTemp;

    public double getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(double currentTemp) {
        this.currentTemp = currentTemp;
    }

    public double getTargetTemp() {
        return targetTemp;
    }

    public void setTargetTemp(double targetTemp) {
        this.targetTemp = targetTemp;
    }

    boolean targetTempReached() {
        return currentTemp == targetTemp;
    }
}
