public class Place {
    String name;    //Add new String here
    String description; // add new String here
    private PersonList people;

    public Place(String name, String description){// The constructer
        this.name = name;
        this.description = description;
    }

    public String toString(){     // toString method
        return name;
    }

    public String getDescription(){
        return description;
    }   //getDescription method

    public void setDescription(String newDescription){    //change description to a newDescription
        description = newDescription;
    }

    public String getPeople(){

    }

    public void addPerson(Person toAdd){
        people.addPerson(toAdd);
    }

    public boolean removePerson(Person toRemove){
        if(people.containsPerson(toRemove) )
    }
}
