public class TestClass {

    public static void main (String[] args){
        Person personTest = new Person("Person class","To test person class");
        System.out.println(personTest.toString());

        Place placeTest = new Place("Place class","To test Place class");
        System.out.println(placeTest.toString());

        Thing thingTest = new Thing("Thing class", "To test thing class");
        System.out.println(thingTest.toString());

        Person p1 = new Person("Knox", "p1"); //created person object
        Person p2 = new Person("Amy" , "p2");//created person object
        Person p3 = new Person("Mush" , "p3");//created person object
        Person p4 = new Person("Skr" , "p4");//created person object

        PersonList newPersonList = new PersonList();  // Created new personList
        newPersonList.addPerson(p1);   //Store p1 to the newPersonList
        newPersonList.addPerson(p2);   //Store p1 to the newPersonList
        newPersonList.addPerson(p3);   //Store p1 to the newPersonList
        newPersonList.addPerson(p4);   //Store p1 to the newPersonList

        System.out.println(newPersonList.size());   //test the counter is working or not
        System.out.println(newPersonList.toString()); //print the PersonList by toString method test that is working
    }

}
