package models ;

public abstract class Sport_facilities {

public int capacity;
public String name;
public String type_of_ground;

public Sport_facilities(int capacity, String name, String type_of_ground){

    this.capacity = capacity;

    this.name = name;

    this.type_of_ground = type_of_ground;

}
public int getCapacity(){
    return capacity;
}
public void setCapacity(){

    this.capacity = capacity;
}
public String getName(){
    return name;
}
public void  setName(){
        this.name = name;
}

public String getType_of_ground() {
        return type_of_ground;
}

    public void setType_of_ground() {
        this.type_of_ground = type_of_ground;
    }
}
