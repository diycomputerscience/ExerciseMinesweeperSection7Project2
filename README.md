<h1>Section 7 Project 2</h1>

<h2>Overview</h2>

In the previous activity we took one step towards a playable game. We allowed the user to click on squares, and when they did, we changed what is rendered on the square. However, clicks by the user, did not change the state of the backend ```Square``` objects. We will complete that cycle in this project.

In this project, we have already implemented all the code that goes from the UI to the backend. You do not have to do anything in this project. For you, this is purely a code review activity. 

We have modified the ```UI``` class so it invokes ```uncover``` on the ```Board``` object when a square on the user interface is clicked. When a square which is a mine is clicked, an ```UncoveredMineException``` is thrown. We respond to this exception by declaring to the user that the game has been lost, and asking them if they wanted to quit. This is done by displaying a _confirm_ dialogue box using ```JOptionPane```. 

Remember, a few exercises back, we had trouble testing the code which compputed counts of squares? Well we are going to run into similar difficulties while unit testing this project. This time because of the JOptionPane. We will be forced to respond to the JOptionPane when the tests are run. Ideally we want to get the user interface to behave in a slightly different manner when it is being run through the unit tests. We have achieved this by creating a layer of abstraction between the ```UI``` class and the ```JOptionPane```. Conceptually it is very similar to the MineInitializationStrategy, in that it allows a client to inject a behavior. We have created the interface ```OptionPane``` to serve as this layer of abstraction. 

We would like you to study the code to understand:

 1. How does using the Interface ```OptionPane``` make the code more testable
 1. How the UI is wired to the backend ```Square``` objects in the mouse listener's of each UI square.

You do not have to submit any code in this activity. Though you are encouraged to ask questions related to coding and design decisions, as well as alternative ways of writing the code, we have till now. Think about what you like about the code, and if you feel there are any glaring defects in the code we have written till now. 
