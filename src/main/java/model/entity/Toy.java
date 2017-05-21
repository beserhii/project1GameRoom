package model.entity;

public class Toy {

    private String name;
    private String type;
    private int ageMin;
    private int ageMax;
    private Integer cost;
    private int count;

    public Toy(String name, String type, int ageMin, int ageMax, Integer cost, int count) {
        this.name = name;
        this.type = type;
        this.ageMin = ageMin;
        this.ageMax = ageMax;
        this.cost = cost;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getAge() {
        return ageMin+"-"+ageMax;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public int getAgeMax() {
        return ageMax;
    }
}
