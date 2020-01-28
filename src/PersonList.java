public class PersonList {

    int counter = 0;
    Person[] thePersonArray;   //Created PersonList array and hold all data

    public PersonList(){
        int maxSize = 100;    //credit the maxSize of person list
        thePersonArray = new Person[maxSize];   // instance the array of person list


        //check if any number is not null and let counter++ to get how many data on the array
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
        //check if any number is not null and let counter++ to get how many data on the array
        for(int i = 0; i<thePersonArray.length; i++){
            if(thePersonArray[i] != null){
                counter++;
            }
        }
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

    private int findIndex(Person key){                //Find the gived person object Index number
        int indexNum = -1;                                           //The index number

        for(int i = 0; i<thePersonArray.length;i++){     // Staring loop
            if(thePersonArray[i] == key){      // Check thePersonArray[i] is equal or not
                indexNum = i;                            // if is Found set indexNum to the location number
                break;                                   // and break the loop
            }else{
                indexNum = -1;                           // If is not found set indexNum to the -1
            }
        }
        return indexNum;
    }

    public boolean containsPerson(Person key){       // reuse the FindIndex method
        boolean isFound ;

        if(findIndex(key) == -1){              //If findIndex is equal -1
            isFound = false;                   //set isFound boolean variable to false
        }else{
            isFound = true;                    //set isFound boolean variable to true
        }
        return isFound;                        //return the isFound
    }

    public Person removePerson(Person key) {
        Person[] afterRemove = new Person[thePersonArray.length];

        for (int i = 0; i < thePersonArray.length; i++) {
            if (thePersonArray[i] == key) {
                thePersonArray[i] = null;
            }
        }

        for (int i = 0; i < thePersonArray.length; i++) {
            if (thePersonArray[i] != null) {
                thePersonArray[i] = afterRemove[i];
            }
        }

        for (int i = 0; i < thePersonArray.length; i++) {
            afterRemove[i] = thePersonArray[i];
        }

        for (int i = 0; i < thePersonArray.length; i++) {
            if (thePersonArray[i] == key) {
                thePersonArray[i] = key;
            }

        }
        return key;
    }

}

