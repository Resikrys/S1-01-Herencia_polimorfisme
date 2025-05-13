# SPRINT 1
## TASK 1: Inheritance and Polymorphism

### LEVEL 1 - EXERCISE 1
In a music group there are different types of musical instruments. 
There are wind, string and percussion instruments.

All instruments have their name and price as attributes. 
In addition, they have a method called play(). 
This is abstract in the instrument class and, therefore, must be implemented in the child classes. 
If a wind instrument is being played, the method must display on the console:
"A wind instrument is being played", if a string instrument is being played:
"A string instrument is being played" and if a percussion instrument is being played:
"A percussion instrument is being played".

The loading process of a class only takes place once. 
Demonstrate that loading can be caused by the creation of the first instance of this class or by accessing a static member of it.

Find information about initialization blocks and static blocks in Java.

### LEVEL 1 - EXERCISE 2
Create a class "Car" with the attributes: make, model, and horsepower. 
The make must be final static, the model static, and the horsepower final. 
Demonstrate the difference between the three. Are there any that can be initialized in the class constructor?

Add two methods to the class "Car". A static method called brake() and a non-static method called accelerate(). 
The accelerate method should output to the console: 
“The vehicle is accelerating” and the brake() method should output: “The vehicle is braking”.

Demonstrate how to invoke the static and non-static methods from the main() of the main class.

### LEVEL 2 - EXERCISE 1
Create a class called "Phone" with the attributes brand and model, and the method call(). 
This method must receive a String with a phone number. 
The method must display a message on the console saying that the number received as a parameter is being called.

Create an interface called "Camera" with the method photograph(), 
and another interface called Clock with the method alarm().

Create a class called "Smartphone" that is a subclass of "Phone" and 
that at the same time implements the interfaces "Camera" and "Clock".

The method photograph() must display on the console: 
“A photo is being taken” and the method alarm() must display: “The alarm is ringing”.

From the main() of the application, create a Smartphone object and call the previous methods.

### TECHNOLOGIES
| Package | Version    | Description                |
|---------|------------|----------------------------|
| `java`  | ^1.8.0_441 | Principal project language |

### REQUIREMENTS
Local environment: `IntelliJ or Eclipse`

### EXECUTION
To Run code, press `Ctrl F5` or click the `play` icon in the gutter.

