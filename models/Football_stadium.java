package models;

public class Football_stadium extends Sport_facilities{

    private String stadium_colour;

    public Football_stadium(int capacity, String name, String type_of_ground, String stadium_colour) {

        super(capacity, name, type_of_ground);

        this.capacity = capacity;

        this.name = name;

        this.type_of_ground = type_of_ground;

        this.stadium_colour = "red-black";
    }

    public String getStadium_colour() {
        return stadium_colour;
    }

    public void setStadium_colour() {
        this.stadium_colour = stadium_colour;
    }
}


