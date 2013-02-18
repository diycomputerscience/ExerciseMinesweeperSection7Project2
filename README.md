<h1>Section 7 Project 2</h1>

<h2>Overview</h2>

In the previous activity we took one step towards a playable game. We allowed the user to click on squares, and when they did, we changed what is rendered on the square. However, clicks by the user, did not change the state of the backend square objects. We will create that connection in this activity.

In this project, we have actually implemented all the code that creates this connection. You do not have to do anything in this project. For you, this is purely a code review activity. We have modified the ```UI``` class to actually invoke ```uncover``` on the ```Board``` object when a square on the user interface is clicked. When a square which is a mine is clicked, an ```UncoveredMineException``` is thrown. We respond to this exception by declaring to the user that the game has been lost, and asking them if they wanted to quit. This is done by displaying a _confirm_ dialogue box. This  dialogue box is great when we are actually playing the game. But it can create difficulties while unit testing. Ideally we want to get the user interface to behave in a slightly different manner when it is being run through the unit tests. We have achieved this by creating a layer of abstraction between the ```UI``` class and the ```JOptionPane``` (the option pane which is displayed when a user loses a game). Conceptually it is very similar to the MineInitializationStrategy, in that it allows a client to inject a behavior. The interface ```OptionPane``` is this layer of abstraction. 

We would like you to study the code to understand:

 1. How does using the Interface ```OptionPane``` make the code more testable
 1. How the UI is wired to the backend ```Square``` objects in the mouse listener's of each UI square.

You do not have to submit any code in this activity. Though you are encouraged to ask questions related to coding and design decisions, as well as alternative ways of writing the code, we have till now. Think about what you like about the code, and if you feel there are any glaring defects in the code we have written till now. 
