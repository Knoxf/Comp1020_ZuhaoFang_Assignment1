public class Thing {
    String name;
    String description;

    public Thing(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String toString (){
        return name + "," + description;
    }
}
