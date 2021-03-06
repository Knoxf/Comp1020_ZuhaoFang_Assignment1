public class TestClass {

    public static void main (String[] args){
        // Phase 1 test
        System.out.println("============================ Phase 1 test ============================");
        Person personTest = new Person("Person class","To test person class");
        System.out.println(personTest.toString());

        Place placeTest = new Place("Place class","To test Place class");
        System.out.println(placeTest.toString());

        Thing thingTest = new Thing("Thing class", "To test thing class");
        System.out.println(thingTest.toString());

        // Created some Person object
        Person p1 = new Person("Knox", "p1"); //created person object
        Person p2 = new Person("Amy" , "p2");//created person object
        Person p3 = new Person("Mush" , "p3");//created person object
        Person p4 = new Person("Skr" , "p4");//created person object

        // Add those to the PersonList array
        PersonList newPersonList = new PersonList();  // Created new personList
        newPersonList.addPerson(p1);   //Store p1 to the newPersonList
        newPersonList.addPerson(p2);   //Store p1 to the newPersonList
        newPersonList.addPerson(p3);   //Store p1 to the newPersonList
        newPersonList.addPerson(p4);   //Store p1 to the newPersonList

        // Phase 2 test
        System.out.println("============================ Phase 2 test ============================");
        System.out.println(newPersonList.size());   //test the counter is working or not
        System.out.println(newPersonList.toString()); //print the PersonList by toString method test that is working

        // for check reason i change the findIndex method to the public after check changed back to private
        Person p5 = new Person("Skrs" , "p4121");//created person object but not add to the list
       // System.out.println(newPersonList.findIndex(p5));    //check p5 is on the list or  not
        //System.out.println(newPersonList.findIndex(p2));    //check p2 is on the list or not

        // Phase 3 test
        System.out.println("============================ Phase 3 test ============================");
        System.out.println(newPersonList.containsPerson(p2));   //To test the containsPerson method is can find it return true
        System.out.println(newPersonList.containsPerson(p5));   //To test the containsPerson method is can not find it return false

        System.out.println("Already remove item " + newPersonList.removePerson(p2)); //to test the P2 is already remove from array
        System.out.println(newPersonList.toString());

        // Phase 4 test
        System.out.println("============================ Phase 4 test ============================");
        System.out.println(RandomGenerator.getRandomPersonDescription());

        // Phase 5 test
        System.out.println("============================ Phase 5 test ============================");
        System.out.println(PartySim.createPeople(6).toString());
        PartySim sim = new PartySim();
        System.out.println(sim.wholePartyToString(PartySim.createPeople(6)));

    }

}
