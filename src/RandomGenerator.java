// Random Generator
// A Utility class for generating random values for things. Includes some random number selection
// as well as Name, Location, Item and Creature sets. 
// - by Dylan Fries - 
public class RandomGenerator{
	 
	// ======== Source Words ========
	// [ ] Update with better adjectives and nouns for places to party. You should have a minimum of 5 of each but more is better
	// --- Locations --- 
	// a random list of words to generate a random location 
	private static String[] locationAdjectives = {"Cold","Damp","Soggy","Hot","Dangerous","Dark","Bright","Cavernous", "Smelly","Charred","Glowing","Dirty","Spotless","Marble","Glass"};
	private static String[] locationNouns = {"Cave","Hallway","Diner","Room","Throne Room","Quarters","Kitchen","Armory","Garage","Stables","Pit","Bedroom","Workshop", "Tunnel","Plateau"};

	// --- Names --- 
	private static String[] randomNames = {"Talha","Ayman","Mehidi","Cem","Chaahna","Muskaan","Harleen","Dhruv","Tasnuva","Daehwan","HeeJeong","Petro","Rahul","Minh","Peter","Bilguun","Shubhkumar","Rajit","Jida","Melvin","Manik","Diwakar","Sahil","Yujin","Abhijeet","Yevhenii","Melvin","Rubait","Valeria","Al Amin","Mustafa","Zeel","Zuhao","Mostofa","Zhaolin","Nishil","Anirudh","Oluwasoji","Zhuobin","Weiyi","Tahmina","Krish","Hai","Osamah","Anuj","Mitkumar","Thai","Mebin","Jisu","Chongrui","Rizaldi","Solbee"};
	private static String[] randomVerbs = {"Invincible","Meaningless","Invincible", "Unbeaten", "Yellow-bellied"};
	// --- Item generation ---	
	// Not used in A1 (yet)
	// Generate a random item name
	private static String[] itemAdjectives = {"Magic","Antique","Smelly","Rusted","Broken","Fragile","Glowing","Strange","Flaming"};
	private static String[] itemNouns = {"Hammer","Shield","Helmet","Shoes","Sword","Ax","Abicus","Jar","Boots","Gloves","Ring"};

	// Not used in A1 (yet)
	// this list is sorted by difficulty
	private static String[] creatureDifficulty = {"Insignificant","Trivial","Tiny","Small","Weak","Rumpled","Sulking","Zombie","Mutant","Angry","Venomous","Fierce","Giant","Tremendous","Elemental","Monsterous","Omnipotent","Exceptional"};
	private static String[] creatureNames = {"Mouse","Lizard","Rabbit","Skunk","Fish","Monkey","Crab","Blob","Goblin","Dinosaur","Orc","Dragon","Bandit","Werewolf"};
	
	// ======== Random Generators ========

	// This method returns names of monsters. 
	// The type of monster is determined by the difficulty of the location
	// we can use the difficulty as an index to get a monster from the list
	// Difficulty is locked from 0 to 6. total 18 difficulty names
	// This is a little loose, there are probably better ways to map this but I am dealing with 
	// uncertainty by contraining both the input and selected (calculated) indexes manually. 
	public static String getCreatureNameByDifficulty(int difficulty){
		String returnMonster = "Default Monster";
		// Lock in bounds. This should never be < 0 but might be higher then 6
		if( difficulty < 0)
			difficulty = 0;
		if( difficulty > 6)
			difficulty = 6;

		// Add some random noise. The difficulty should be 'close' to where it actually will be but might be higher
		int tilt = randomRoll(-1,4);
		int adjustedDifficulty = difficulty * 3 + tilt;

		// boundary check again because I am adding some random values to the index
		if(adjustedDifficulty < 0)
			adjustedDifficulty = 0; // zero difficulty
		if( adjustedDifficulty >= creatureDifficulty.length )
			adjustedDifficulty = creatureDifficulty.length -1; // max difficulty

		// Select a name by combining difficulty and type
		returnMonster = creatureDifficulty[adjustedDifficulty];
		int typeIndex = randomRoll(0, creatureNames.length);
		returnMonster += " " + creatureNames[typeIndex];

		// Return the new generated monster name
		return returnMonster;
	}

	// Get a random name of an Item
	public static String getRandomItemName(){
		int indexAdjective = randomRoll(0,itemAdjectives.length);
		int indexNoun = randomRoll(0,itemNouns.length);
		String returnName = itemAdjectives[indexAdjective] + " " + itemNouns[indexNoun];
		return returnName;
	}

	// Generate a random persons name from the list supplied above
	public static String getRandomName(){
		int index = randomRoll(0,randomNames.length);
		String name = randomNames[index];
		return name;
	}

	// Generates a random two word name for the Location and returns it. 
	// Sample names could include: "Cold Cave", "Damp Hallway", "Soggy Room" etc.
	public static String getRandomLocationName(){
		// randomly roll to get the adjective. 
		int indexAdjective = randomRoll(0, locationAdjectives.length);
		// randomly roll to get the noun. 
		int indexNoun = randomRoll(0, locationNouns.length);
		String returnName = locationAdjectives[indexAdjective] + " " + locationNouns[indexNoun];
		return returnName;
	}

	// ======== Utility Functions ========
	// Roll a random int between min (inclusive) and max (exclusive)
	// 		- Pay attention to the edges when doing this. Off by one errors are common
	// [ ] You should learn how this works, it is a very useful method
	public static int randomRoll(int min, int max){
		int randomNum = 0;
		// Get the random number between [0..1)]
		double random = Math.random();
		// convert to an int range from [0..length-1]
		int range = max - min;
		randomNum = min + (int)(random * range);

		return randomNum;
	}

	public static String getRandomPersonDescription(){
		int indexName = randomRoll(0,randomNames.length);              //random roll to get name
		int indexVerbs = randomRoll(0,randomVerbs.length);             //random roll to get verb
		String returnNameVerb = randomVerbs[indexVerbs] + " " + randomNames[indexName];
		return returnNameVerb;

	}
}