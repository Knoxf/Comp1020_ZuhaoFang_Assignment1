// Import any libraries you need and note what you need them for
import java.util.Scanner; // Needed for Scanner class 

// Remove any Package declarations you might have. It will break compilation for me
// You may need to create your project to not be in a package if you are using 
// IntelliJ or Eclipse. See the internet for details. 

// package com.whatever <--- Remove this!

// Class name must be uppercase, file must be *ClassName*.java
// Standards.java in this case
public class Standards{ 

	//  --- Variables ---
	// variables should be lower case and camelCase. 
	// should be private unless told otherwise
	// Use appropriate names for variables
	// They should be CLEAR and CONSISE 
	// Eg
	private int a = 0; // awful, what is a? 
	private int num = 0; // Bad - What is num?
	private int arrayIndex = 0; // good if there is only one array


	// What level of detail is appropriate
	// If you cannot read the variable like a sentence and have it make sense, you need to keep working on it. 
	private String a = "Terrible"; // Bad - unclear. We do not need to save character space, this is not 1982
	private String word = "Still Bad"; // Still bad. Which word? Is it the old or new one? not very helpful
	private String currentKeyword = "Good"; // better - Gives context - current, as well as a specific description - keyword
	private String theWordThatIsUsedAsTheKeyForTheDictionary = "Too Long";

	/*
	Some tips on Variable names: 
	this will be highly context sensitive. My advice is to refactor as you go (carefully!) to keep words up to date. 
	For example, a class that is using keywords might be ok with currentKeyword to begin, but what happens if you have
	Multiple keywords? How do you differentiate them? 

		You may start off with "keyword"
		Later, you may have currentKeyword, previousKeyword, nextKeyword
		Etc ..

	Some things to think about
	- Is it immediately obvious what the variable is used for?
	- Is it clear what an appropriate value of a variable would mean

	eg. */
	private boolean control = false; // Doesn't tell us what is being controlled or what the values of this might mean
	private boolean isInitialized = true; // Tells us more information and gives context for whether it should be true or not. 


	// --- Variable Organization ---
	// Clump related variables together and add a
	// description of the whole functionality 
	// This will greatly assist you in keeping your code organized
	// and will make it MUCH easier to reorganize your code as you 
	// refactor. As your code grows you will need to continue to 
	// organize it. It is not a thing that you do at the end, it 
	// is a constant effort. 

	// eg --- Reading and and processing some words from the user ---
	// This is a made up example. Note how you can begin to understand the code execution and function
	// simply by reading the variables? 

	private Scanner keyboard = new Scanner(System.in);
	private boolean userInputComplete = false; // This flag is true when the user finishes selecting words. 

	// Try to explain the context of what is happening
	// wordList stores the full list read in from worldList.txt	
	private String[] sourceWordList; // the full list of words read from disk
	private int sourceListIndex; // the index of the list of words
	// a shorter word list of words selected by the user
	private String[] currentWordList; // the short list of selected words from the sourceList
	private int currentListIndex; // Notice I am trying to be consistent with my conventions, whatever they may be

	// constructors and methods should be public unless they are 
	// only being called within the class they are defined in. 
	public Standards(){}

	// --- Indentation ---
	// Methods are one tab in from the previous braces indent
//| previous indent	

	// keep your control structures properly indented. 
	public void indentation(){
	
		// Variables are one \t in from the start of the method indentation
		boolean flag1 = true;
		boolean flag2 = true;
		// Proper indentation
		if(flag1){ // If is indented one \t from the method alignment
			if(flag2){ // nested control structures are one \t in from the parent braces
				while(flag1){ // same loops
					// stuff
				}
			}

			// Another control structure. Note it is aligned with other controls structures in the same set of curly braces. 
			if(flag2){
			} // if(flag2) <- this is optional but can be helpful, especially if you have a lot of brackets
		} // flag 1
	} // indentation method

	// --- Two types of brackets ---
	// You can use one or the other but your should be CONSISTENT with the style you choose. 
	public void bracketsTypeOne(){ // Open curly braces follows parameter list
		// Method body
	} // closing braces is aligned with visibility identifier. 

	// Style two - Aligned
	public void bracketsTypeTwo()
	{ // Open curly braces is on the next line, aligns with the start of the method declaration ("-->|public")

	} // Closing braces aligns with the opening curly bracket
	
	// This method will explain some thoughts about how you should comment your code 
	public void commenting(){

		/*
		There are two types of comments. A comment block can be created like this and should
		be used for explaing what a class, method or large block of code is doing
		*/

		// Short comments like this let you know what a line of text is doing

		// You should explain what your code is suppose to do, don't just reiterate your code
		// Think of it like your working log. What will you need to rememeber about how this method 
		// works if you had to quickly fix it a year from now? 

		// ---------------------------------------------
		// Code Organization
		// --- Headings and seperators can be helpful for clarity and organization
		// Note: This isn't any special syntax, its just what I came up with. You will develop
		// your own style naturally, but don't go overboard with it either
		// ---------------------------------------------

		// EG. Bad Example - Don't Do This!
		// Not very helpful
		int a = 5;
		int b = 8;
		// check if 4 * 5 = 8
		// No context, what are these numbers? Why am I checking them?
		// what is 10? Why should it be there? Use variable to clarify and reuse vales
		if( a * b < 10){
			// how do we know what is happening here? 
			// what conditions lead to this if statement being true?
		}

		// Eg. Better Example - More clear and human readable

		// Test Trampoline Safety Procedures
		// Descriptions and variables make it much more clear what your code is doing
		// * Not Real Physics, Don't try this at home!
		int acceleration = 5;
		int bouncinessOfTrampoline = 8; 
		int ceilingHeight = 10;

		// Determining if it is safe to jump on the trampoline
		if(acceleration * bouncinessOfTrampoline < ceilingHeight){
			// Didn't smash our heads
		}else{
			// Can sometimes be useful to output or note the alternative outcome as well, especially if you expect to never reach this code. 
			System.out.println("Warning: Ceiling collision imminent!");
		}

	} // close commenting method

	// A few last thoughts and best practices
	public void threeStepCommenting(){
		// I recommend my patented* 3 Step Process 
		// Create your comments 3 times, at three places in development, and for three reasons.

		// (* not actually patented) 

		// 1. First, use comments BEFORE you code to outline the methods and logic you will need in rough terms
		// This can give you a rough guideline to follow as you begin programming
		// It will also force you to THINK before you start typing, possibly allowing you
		// to spot upcoming design issues or considerations before you have started

		// eg. 
		// Method to calculate trampoline safety
			
			// What variables will you need?
			// Eg. need local ceiling height and trampoline bounciness rating

			// What is the logic? What formulas or algorithms might be useful here? 
			// Eg. Do calculation. formula used is Schmupners Trampoline Quotent (accel * bounce < ceiling) 

			// What is the final output? How are the results communicated
			// Eg. activate trampoline extra boost mode if ceiling is high enough to allow it
			// Eg. Communicate to the user 


		// 2. Comment WHILE you are coding. 
		// This is capturing things you don't want to forget, functionality, and any other design notes
		// you might consider later. You should be thinking about where things go WHEN YOU CREATE THEM. 
		// For example, if you create an index variable that goes with an array, put it next to the array immediately. 
		// This will help a great deal in keeping you organized as you progress.  
	
		// 3. Refactor and Refine
		// Once you have your *Proof of Concept* code working your task is not done
		// Spend some time organizing variables, fixing indentation and blank or extra lines. 
		// This is a great time to notice bugs, get rid of unused code and fix typos and spelling mistakes. 
		// You should really think of your code as a work in progress, a Draft. 
		// Once it finially works, thats simply a Proof of Concept, keep editing and improving it
		// Writing neater code means writing better code
		// better code will be MUCH faster to fix and improve and you will find
		// very quickly is it faster in the long run to Write Slower and Neater then it is to write Fast and Messy
	}

	public void miscCodeOrganization(){

		public a,b,x = 0; // shorthards make you look LEET but also makes it hard to add good commenting
		int glob = 123;
		if(glob){

		}

		// Not Very Clear
		// Don't do this
		int acceleration = 0;
		String[] wordList;
		int drag = 0;
		boolean isJumping;
		Scanner input = Scanner(System.in);	// <- why is this in the middle?
		int speed, index = 0; // <- two unrelated variables
		int ceiling = 10;

		// Organize your code
		// leave a single linebreak between logical functions
		// Don't leave multiple blank lines:


		// EG. Too many blank lines between code--> 



		// Like this, it just makes your code hard to read

		// Eg. Much Better, SAME CODE

		// --- Trampoline Variables --- 
		// current jump state
		int acceleration = 0;
		int drag = 0;
		int speed = 0;	
		// isJumping is the current state of the trampoline jumper
		boolean isJumping; // not exactly the same as the jump state, but related to that functionality so I put it nearby

		// * Notice how the blank space helps seperate logical groups of variables
		// Word List from user
		String[] wordList;
		int index; // the index for the wordList

		// Get User input for the wordList
		Scanner input = Scanner(System.in);	// <- why is this in the middle?


	}

}