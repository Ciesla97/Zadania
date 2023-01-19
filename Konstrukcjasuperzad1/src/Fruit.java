public class Fruit {
    private int fruitWeight;
    private String fruitType;

    public Fruit(int fruitWeight, String fruitType) {
        this.fruitWeight = fruitWeight;
        this.fruitType = fruitType;
    }

    public int getFruitWeight() {
        return fruitWeight;
    }

    public void setFruitWeight(int fruitWeight) {
        this.fruitWeight = fruitWeight;
    }

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }
    public String getInfo(){
        return "Waga: " + getFruitWeight() + " " + "typ: " + getFruitType();
}
    }