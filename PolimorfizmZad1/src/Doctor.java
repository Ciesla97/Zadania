public class Doctor extends Person {
        private int bonus;

        public Doctor(String name, String lastName, int paycheck, int bonus) {
                super(name, lastName, paycheck);
                this.bonus = bonus;
        }


        public int getBonus() {
                return bonus;
        }

        public void setBonus(int bonus) {
                this.bonus = bonus;
        }
}
