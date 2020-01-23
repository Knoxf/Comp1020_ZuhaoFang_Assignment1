public class Thing {
    String name;    //Add new String here
    String description; // add new String here

    
    public Thing(String name, String description){  // The constructer
        this.name = name;
        this.description = description;
    }

    public String toString (){    //toString method
        return name;
    }

    public String getDescription(){
        return description;
    }   //getDescription method

    public void setDescription(String newDescription){    //change description to a newDescription
        description = newDescription;
    }
}
