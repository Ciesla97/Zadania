import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj aktualną temperaturę.");
        double currentTemp= input.nextInt();
        System.out.println("Podaj docelową temperaturę.");
        double targetTemp = input.nextInt();

        Thermostat thermostat = new Thermostat();
        while(!thermostat.targetTempReached()){

        }


        while(currentTemp != targetTemp){
            System.out.println("Aktualna temperatura: " + currentTemp);
            double tempDiff = targetTemp - currentTemp;
            if(tempDiff > 0 ) {
                currentTemp += 0.5;
            }else if(tempDiff < 0)
                    currentTemp -= 0.5;
            }
        System.out.println("Osiągnięto temp docelową " + currentTemp + "  stopni");

        }
    }
