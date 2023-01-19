public class Apple extends Fruit {
    public static final String TYPE = "jabłkowaty";

    private String fruitVariety;

    public Apple(int fruitWeight, String fruitVariety) {
        super(fruitWeight, TYPE);
        this.fruitVariety = fruitVariety;
    }

    public String getFruitVariety() {
        return fruitVariety;
    }

    public void setFruitVariety(String fruitVariety) {
        this.fruitVariety = fruitVariety;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "odmiana:" + fruitVariety;
    }
}


