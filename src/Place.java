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
        Person peoples = new Person();
        String str = "[";

        for
    }

    public void addPerson(Person toAdd){
        people.addPerson(toAdd);
    }

    public boolean removePerson(Person toRemove){
        boolean foundToRemove = false;

        if(people.containsPerson(toRemove) ==true){
            people.removePerson(toRemove);
            foundToRemove = true;
        }else{
            foundToRemove = false;
        }
        return foundToRemove;
    }

    public int countPeople(){
        return people.size();
    }

    public boolean contains(Person tofind){
        return people.containsPerson(tofind);
    }
}
