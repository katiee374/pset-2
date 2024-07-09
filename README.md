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
approach. First, copy the Room, Actor, and Treasure classes into your project 
folder. Follow the instructions in the files. When you're done, copy and 
paste the code into the files in this repository.

Next, you should consider your Game file to be now a class declaration. Remove 
the word static from you method headers. Turn the "main" method into the Game 
class's constructor. Then, add the following instance variables:
 * An array directions containing the Strings "North", "South", "East", 
   "West"
 * An ArrayList of Room objects named Blueprint
 * An Actor object named Player

Initialize the Rooms from the map you drew, as well as the Player object with 
a name and description of your choice.

Then, write the method moveTo(Actor a, String direction) to do the following:
 * Initialize int exit to -1.
 * Initialize Room room to a.getLocation().
 * Check if direction is North, South, East, West; if so, set exit to 
   room.getN(), S, etc.
 * Check if exit is -1; if so, return false, indicating that the move failed.
 * Assign the actor's location to blueprint.get(exit).
 * Return true, indicating that if the method reaches this line, the move was 
   successful.

Next, update the parsing of user commands:
 * In Game.java, add the commands n, s, e, w to the array of commands.
 * Change the array into an ArrayList, for both commands and objects. Why 
   might we want to do this? What benefit does an ArrayList have over an 
   array?
ANSWER HERE:
 * Move the ArrayLists of commands and objects to be instance variables of 
   the Game class.
 * Write the processVerb(String verb): Check if the verb is n/s/e/w. If so, 
   call moveTo(player, String dir), where the direction is North, South, etc.
Upload your updated Game.java to this repository.

Then, copy the file AdventureGame.java into your project folder. This will 
be the driver for your game, or the file that you would run to play it. Notice 
that it only initializes a Game object, since all the processing is done within
the Game class.

Goals:
 * Program with creativity by developing the theme of your own text-based 
  adventure game.
 * Use object-oriented programming to further a program with a larger goal.
 * Have some fun implementing a game!
