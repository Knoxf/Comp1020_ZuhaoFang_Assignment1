public class Person {

    String name;    //Add new String here
    String description; // add new String here

    public Person(String name, String description){   // The constructer
        this.name = name;
        this.description = description;
    }

    public Person(){

    }

    public String toString(){          // To String method
        return name;
    }   //To String method

    public String getDescription(){
        return description;
    }   //getDescription method

    public void setDescription(String newDescription){    //change description to a newDescription
        description = newDescription;
    }
}


