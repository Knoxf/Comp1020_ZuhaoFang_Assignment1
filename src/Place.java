public class Place {
    String name;    //Add new String here
    String description; // add new String here

    public Place(String name, String description){// The constructer
        this.name = name;
        this.description = description;
    }

    public String toString(){     // toString method
        return name + "," + description;
    }
}
