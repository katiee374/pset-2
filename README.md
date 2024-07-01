# PSET 2
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

## Part 2: Charting Your Adventure Game
In this task, we'd like you to draw a map of your adventure game. According to 
whatever theme you've chosen, chart a map (on paper!) that contains 4-6 locations
(rooms, landmarks, etc.), and paths between them. Include a compass rose (N-S-E-W)
to give your map some direction. It doesn't need to be artistic, but you 
will repeatedly refer back to this map throughout the semester. You're welcome 
to change it later in the semester as well. Add lists of objects (treasure chests, 
keys, snakes, etc.) that will be in each place.
When you're finished, take a picture of your map and upload a .png or .jpeg file to 
this repository.

## Part 3: Create an Object-Oriented Game
In this task, you will start developing your game using an object-oriented approach.
First, you should consider your Game file to be now a class declaration. Turn the 
"main" method into the Game class's constructor. Then, add the following 
instance variables:
 * An ArrayList directions containing the Strings "North", "South", "East", 
   "West"
 * An ArrayList of Room objects named Blueprint
 * An Actor object named Player

Then, write the method moveTo(Actor a, int direction) to do the following:
 * Initialize int exit.
 * Initialize Room room to a.getLocation().
 * Check if direction is between zero and 3 (representing the values N, S, E, W
   respectively)
     * If so: Set Exit to be room.getN/S/E/W() depending on the value of 
       direction
 * If, at the end of these checks, exit is NOT -1, set the actor location to 
   exit, and print where the actor is moving to (by retrieving the room from 
   Blueprint).
 * Else, print "No exit"

Next, update the parsing of user commands:
 * In Game.java, add the commands n, s, e, w to the ArrayList of commands.
 * Move the ArrayLists of commands and objects to be instance variables of 
   the Game class.
 * Write the processVerb(String verb): check that the verb is a known command. 
   If not, print "unknown command." Check if the verb is n/s/e/w. If so, call 
   moveTo(player, int d). The integer will correspond to the location of n/s/e/w
   in the ArrayList directions.

Then, create a new file, called AdventureGame, and write a main method there. 
This is the class that you will run to play the game. For now, write one line of 
code in the file that initializes a Game object. Don't forget to add Javadoc. 
Upload copies of Game.java and AdventureGame.java to this repository.
Next, copy the Room, Actor, and Treasure classes into your project folder. Follow 
the instructions in the files. When you're done, copy and paste the code into the 
files in this repository.

Goals:
 * Program with creativity by developing the theme of your own text-based 
  adventure game.
 * Use object-oriented programming to further a program with a larger goal.
 * Have some fun implementing a game!