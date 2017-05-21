package model.entity;

public enum Price {
    SMALL_CAR("Hot Wheels", 1, 3, 26),
    MIDDLE_CAR("Cars", 4, 7, 41),
    LARGE_CAR("Big Track", 8, 13, 95),
    SMALL_BALL("Pin-pong Ball", 3, 12, 21),
    MIDDLE_BALL("Tennis Ball", 3, 6, 34),
    LARGE_BALL("Soccer Ball", 5, 15, 88),
    SMALL_CUBE("Small Cube", 1, 7, 4),
    MIDDLE_CUBE("Rubik's Cube", 12, 16, 14),
    LARGE_CUBE("Large Cube", 3, 10, 62),
    SMALL_DOLL("Barbie", 5, 12, 38),
    MIDDLE_DOLL("Dolly", 6, 13, 79),
    LARGE_DOLL("Molly", 7, 14, 110),
    BUILDING_KIT("Builder Kit", 10, 15, 174);

    private String name;
    private int ageMin;
    private int ageMax;
    private int cost;

    Price(String name, int ageMin, int ageMax, int cost) {
        this.name = name;
        this.ageMin = ageMin;
        this.ageMax = ageMax;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public int getAgeMax() {
        return ageMax;
    }

    public String getName() {
        return name;
    }

}
