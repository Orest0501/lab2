package models;

public class Basketball_arena extends Sport_facilities {

    private String location;

    public Basketball_arena(int capacity, String name, String type_of_ground, String location) {

        super(capacity, name, type_of_ground);

        this.capacity = capacity;

        this.name = name;

        this.type_of_ground = type_of_ground;

        this.location = "Bucha";
    }

    public String getLocation() {
        return location;
    }

    public void setLocation() {
        this.location = location;
    }
}



