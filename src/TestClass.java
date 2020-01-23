public class TestClass {

    public static void main (String[] args){
        Person personTest = new Person("Person class","To test person class");
        System.out.println(personTest.toString());

        Place placeTest = new Place("Place class","To test Place class");
        System.out.println(placeTest.toString());

        Thing thingTest = new Thing("Thing class", "To test thing class");
        System.out.println(thingTest.toString());
    }

}
