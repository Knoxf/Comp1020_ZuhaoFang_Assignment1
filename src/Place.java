public class Place {
    String name;
    String description;

    public Place(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String toString(){
        return name + "," + description;
    }
}
