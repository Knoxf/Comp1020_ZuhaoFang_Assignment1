public class Person {
    String name;
    String description;

    public Person(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String toString(){
        return name + "," + description;
    }
}
