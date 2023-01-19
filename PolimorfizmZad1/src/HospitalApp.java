public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.add(new Doctor("Maciek","Prefeska", 7500, 1300));


        Person nurse1 = new Nurse("Ania", "Dobroszewska", 2200, 6);
        hospital.add(nurse1);
        Person nurse2 = new Nurse("Marta", "Danielska", 2100, 3);
        hospital.add(nurse2);
        hospital.getInfo();
        Person doctor2 = new Doctor("Konrad", "Krawczyk", 10000, 2000);
        hospital.add(doctor2);
        hospital.getInfo();

    }
}
