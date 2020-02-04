/*
This class will be our main gameplay loop (for now). 
It will later include a turn counter (turn based) and listen for input from the player. 
Think of simulation type games such as the Sims. This is a very simple version. 
We will increase the complexity later.
*/
public class PartySim{
	
	// Its a party, only simulated. Generate some guests, assign them to mingle, then print them out in the end (including who they talked to). 
	public static void main(String[] args){

		// Eg, should test on other list sizes, at least {0,1,2,3,4,5}
		PersonList list = createPeople(4);

		// call mingle a few times to talk to random people.
		// then output the result		

	}

	// method mingle()
	// main game step, called to start the scene. 
	// each person selects a person to talk to. If there is an even number of people, 
	// each person "talks" to one other person. 

	// Special case: 
	// If there is an odd number of people, one group has three people and each of them 
	// should record that they "talked to" the other two. 

	// Make sure you are setting both directions at the same time (so person A talking 
	// to person b would mean person A would have B added to their talkedTo list, while 
	// person B would add Person A to the talkedTo list. ) % 2 can be used to help you 
	// know if the number is odd or even. 

	// Calling mingle() should make each person should talk to a different person if 
	// they are able. 
	// If they are not able, they can talk to each other again, however, they should 
	// not add each other to their lists again. They should also not talk to themselves. 
	
	// You can use the RandomGenerator class to select a person from the person list. 
	// You should verify that the two Person objects are different and reselect a person
	// until you have a unique one. 
	private void mingle(Place toPartyAt){
		
	}

	// Print out a list of all Persons at the Place. 
	// Print out the people they each talked to as well as friends (if you got that far)
	private String wholePartyToString(PersonList partyPeople){
		// it should be well formatted and clear for full marks. 

		return "Not Implimented Yet";
	}
	
	// ----- Utility methods -----  
	// Create a new list of people by selecting from the names array. 
	// Create int number of people, 
	public static PersonList createPeople(int number){
		PersonList list = new PersonList();      //created new personList
		for(int i=0;i<number;i++){                   //created int number of people
			list.addPerson();
		}

		return list; // Return the list / array
	}

	//  ----- Stretch goal - Major Feature [ ] ----- 
		// Add interests and friends

		// Create a new PersonList variable for each person, called friends. 
		// If two people talk to each other and have at least one of the same interests, 
		// add them to each others friends list (in addition to the talkedTo lists). 

		// Again at the end, print out all the people with their lists of talkedTo, 
		// interests and friends. 

			// Notes: You will likely want to create some methods to help facilite these tasks. 
			// Break down what you have to do into smaller bite sized pieces. 
			// Look where you can reuse existing code (eg PersonList will get reused many times.)
			// You should also add additional methods to other classes 
			// (such as adding new Constructors to Person to accept interests. )

}