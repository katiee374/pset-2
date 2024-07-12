# PSET 2: Classes and Objects
## Part 1: Modeling Wellesley's CS111 Class
In the first task of the assignment, you will employ object-oriented 
programming principles to model a section of CS 111. You will create student 
and professor classes to represent students and professors, and provide 
methods that will allow you to get statistics about the class.

Goals:
* Practice with OOP principles to create a simple object-oriented programming 
 structure.
* Practice quantitative reasoning and mathematical skills through creating 
 QR-based instance methods.
* Declare variables and create instances of classes.

It is recommended that you move through the assignment in the following order:
1. The Professor class.
2. The Student class.
3. The CS111 class.

## Part 2: Create an Object-Oriented Game
In this task, you will start developing your game using an object-oriented 
approach. First, create the Room, Actor, Food, Key, and Animal classes according
to the following specifications:
# Room: A class to represent any location in your game.
 * A name and description.
 * Four integer fields: n, s, e, and w, to represent the exits.
 * The void enter() method, which should print the name and description of the 
   room as well as the possible directions to exit the room. If the value of a
   direction is -1, the player cannot go that way. If it isn't, the player can 
   go that way.
 * Getter methods for the exits. Think: why not setter methods?
 * A constructor
# Actor: A class to represent the player.
 * A name, description, and location (of type Room).
 * An ArrayList<Room> called blueprint (representing the map of the game).
 * Getter methods, including a method that calls the enter() method of the location.
 * A moveTo() method, which should change the location. You can get the Room from 
   blueprint.
 * A field that represents health. This could be an integer or another type. You 
   can devise your own system for tracking the player's heatlh.
 * A constructor
# Food: A class to represent an object that adds health.
# Key: A class to represent an object that unlocks a room or treasure chest.
# Animal: A class to represent an object that can attack the player.

Next, you should consider your Game file to be now a class declaration. Remove 
the word static from you method headers. Turn the "main" method into the Game 
class's constructor. Then, add the following instance variables:
 * An array directions containing the Strings "North", "South", "East", 
   "West"
 * An ArrayList of Room objects named "blueprint"
 * An Actor object named Player (pass blueprint into this constructor)
Feel free to use private helper methods to initialize different parts of the game,
including a runGame() method that processes user input (i.e. the code from the 
file in PSET 1).
Initialize the Rooms from the map you drew, as well as the Player object with 
a name and description of your choice.
Upload your new files to this repository.

Then, copy the file AdventureGame.java into your project folder. This will 
be the driver for your game, or the file that you would run to play it. Notice 
that it only initializes a Game object, since all the processing is done within
the Game class.

Goals:
 * Program with creativity by developing the theme of your own text-based 
  adventure game.
 * Use object-oriented programming to further a program with a larger goal.
 * Have some fun implementing a game!
