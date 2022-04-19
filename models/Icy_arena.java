package models;

public class Icy_arena extends Sport_facilities{

    private int the_number_of_departments_of_the_sports_complex;

    public Icy_arena(int capacity, String name, String type_of_ground, int the_number_of_departments_of_the_sports_complex) {

        super(capacity, name, type_of_ground);

        this.capacity = capacity;

        this.name = name;

        this.type_of_ground = type_of_ground;

        this.the_number_of_departments_of_the_sports_complex = 8;
    }

    public int getThe_number_of_departments_of_the_sports_complex() {
        return the_number_of_departments_of_the_sports_complex;
    }

    public void setThe_number_of_departments_of_the_sports_complex() {
        this.the_number_of_departments_of_the_sports_complex = the_number_of_departments_of_the_sports_complex;
    }
}
