public class PersonList {

    int counter = 0;
    Person[] thePersonArray;   //Created PersonList array and hold all data

    public PersonList(){
        int maxSize = 100;    //credit the maxSize of person list
        thePersonArray = new Person[maxSize];   // instance the array of person list


        //check if any number is not null and let counter++ to get how many data on the array
        for(int i = 0; i<thePersonArray.length; i++){
            if(thePersonArray[i] != null){
                counter++;
            }
        }
    }

    public void addPerson(Person newPerson){

        for(int i =0; i<thePersonArray.length; i++){
            if(thePersonArray[i] == null){                  //If thePersonArray[i] equal zero
                thePersonArray[i] = newPerson;              //so set the [i] to the newPerson
                i = thePersonArray.length;                  //also shut down the for loop;
            }
        }
    }

    public int size(){
        return counter;
    }

    public String toString(){
        String str = "[";

        for(int i =0; i<thePersonArray.length; i++){
            if(thePersonArray[i] != null){                               //If thePersonArray[i] not null
                str = str + thePersonArray[i].toString() + ",";          //add the name to the Str
            }
        }
        return str.substring(0, str.length()-1) + "]";       //delete the last one character this one is delete the " , " and return the string
    }
}

