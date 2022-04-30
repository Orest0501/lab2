package ua.Lviv.iot ;

import jdk.javadoc.doclet.Taglet;
import models.Basketball_arena;
import models.Football_stadium;
import models.Icy_arena;

public class Main {

    public static void main(String[] args) {

        Basketball_arena basketball_arena = new Basketball_arena(14000,"Lviv Basket Arena", "Floor", "Lviv");

        Football_stadium football_stadium = new Football_stadium(68500, "Mykolaiv Stadium", "Grass", "red-black");

        Icy_arena icy_arena = new Icy_arena(19280, "Ternopil Ice", "Ice", 8 );


        System.out.println("Basketball arena's Capacity: " + basketball_arena.getCapacity() + "," +" Name: " + basketball_arena.getName() + "," + " Type of ground - " + basketball_arena.getType_of_ground() + " , Location - " + basketball_arena.getLocation());

        System.out.println("Football stadium's Capacity: " + football_stadium.getCapacity() + "," +" Name: " + football_stadium.getName() + "," + " Type of ground - " + football_stadium.getType_of_ground() + " , Colour - " + football_stadium.getStadium_colour());

        System.out.println("Icy arena's Capacity: " + icy_arena.getCapacity()+ "," +" Name: " + icy_arena.getName() + "," + " Type of ground - " + icy_arena.getType_of_ground() + " , number_of_departments - " + icy_arena.getThe_number_of_departments_of_the_sports_complex());






    }

















}
