###### CS-207-3: Programming II <br> Spring 2021 <br> Northeastern Illinois University <br> Workshop Week 2 <br> Practice Problems

**Getting Started**

**1.** Detailed instructions are located in the tutorial videos.<br>
**2.** Accept the assignment invitation on D2L.<br>
**3.** Clone the assignment to your computer.<br>
**4.** Go to File > Project Structure. Under Project Settings, click on Project and verify that the Project SDK is set
to JDK 11 or higher.  If it is not, select the correct SDK from the drop-down.<br>
**5.** Go to File > Settings (Mac: IntelliJ IDEA > Preferences). Under Build, Execution, Deployment and under Build
Tools, click Gradle. Make sure Build and run using: and Run tests using: are set to Gradle. Make sure Use Gradle from:
is set to 'gradle-wrapper.properties' file. And make sure Gradle JVM is set to JDK 11 or higher.<br>
**6.** Project SDK and Gradle JVM should be set to the same Java version.<br>
**7.** Create the `main/java` directory in the `src` directory. This is where you will be creating your Java classes for
your assignment. Right click `src` and go to New > Directory and select `main/java`.<br>

### Problem 1

**1.** In the main/java directory, create a properly encapsulated class named `ImaginaryNumber`. The class should have the following instance variables, constructor(s), and methods:
- Two integer instance variables named `real` and `imaginary`. Run the code analyzers and commit your code now.
- A constructor that takes two integer parameters and sets the instance variables. Run the code analyzers and commit your code now.
- One getter method for each instance variable. Run the code analyzers and commit your code now.
- A method named `displayImaginaryNumber` that does not take any parameters and prints the instance variables to the console in the following format: `a + bi` , where a is the value stored in real and b is the value stored in imaginary. If imaginary is negative, print out the instance variables in this format instead: `a − bi`
  - Hint: You may find the Math class’ absolute value method helpful!
- A method named `isIdentical`, which takes one `ImaginaryNumber` object as a parameter. This method returns `true` only if both of the `ImaginaryNumber` objects have the same values for each of their instance variables. Otherwise, it returns `false`.
  - Uncomment the body of the test with the name `testingIsIdentical` in the `TestingImaginaryNumber` class in the test/java directory to test this method. Run the code analyzers and commit your code now.
           
**2.** Create a `TestImaginaryNumber` class with a main method by following these steps.
- Create an `ImaginaryNumber` object that has a value of 7 for real and a value of 3 for imaginary.
- Create another `ImaginaryNumber` object that has a value of 7 for real and a value of -3 for imaginary.
- Create a third `ImaginaryNumber` object that has a value of 7 for real and a value of 3 for imaginary.
- Call the `displayImaginaryNumber` method on the reference variable for each of the 3 objects you just created.
- Print out the result of calling the `isIdentical` method on the first reference variable, passing in the second reference variable.
- Print out the result of calling the `isIdentical` method on the first reference variable, passing in the third reference variable.
- Run `TestImaginaryNumber`. The correct output is below:
  - `7 + 3i`
  - `7 - 3i`
  - `7 + 3i`
  - `false`
  - `true`

### Problem 2

**1.** In the main/java directory, create a new class called `SocialNetwork`. It should include the following:
- Create four properly encapsulated variables: a static variable called `count`, which is an integer, and starts with the value 0, a String called `name`, an int called `users`, a double called `rating`. Run the code analyzers and commit your code now.
- Create a no-arg constructor that does the following: increment `count`, set `name` to “Facebook”, set `users` to 50, set `rating`to 2.5. Run the code analyzers and commit your code now.
- Create a second constructor that takes three arguments: a String, an integer, and a double. Increment `count` and set all the instance variables using the arguments. Run the code analyzers and commit your code now.
- A getter method for `rating` and `users`. Make sure you give your methods the correct names! Run the code analyzers and commit your code now.
- A method called `addUser`, which takes no arguments, doesn’t return anything, and increases the value of `users` by 1.
  - Uncomment the body of the test with the name `testingAddUser` in the `TestingSocialNetwork` class in the test/java directory to test this method. Run the code analyzers and commit your code now.
- Two methods, `goodReview` and `badReview`. Both methods take no arguments, and don’t return anything. `goodReview` adds 0.5 to rating, and `badReview` subtracts 0.5.
  - `rating` should always have a value between 0.0 and 5.0. Therefore, after these methods add or subtract 0.5, you should confirm that the new value is valid. If rating is below 0.0, set it to 0.0. If rating is above 5.0, set it to 5.0.
  - Uncomment the body of the test with the name `testingGoodReview` in the `TestingSocialNetwork` class in the test/java directory to test this method. Run the code analyzers and commit your code now.
- A `toString` method, which has no arguments and returns a String. The String should be formatted to match the sample output below.
  -Uncomment the body of the test with the name `testingBadReview` in the `TestingSocialNetwork` class in the test/java directory to test this method. Run the code analyzers and commit your code now.
- A static `printCount` method, which prints the number of social networks (match the format of the same output, below.)
- A method named`isBetterThan`, which takes one `SocialNetwork` object as an argument, and return a boolean. The method returns `true` if the calling `SocialNetwork` has a higher rating than the argument `SocialNetwork`, and `false` otherwise. 
  - Uncomment the body of the test with the name `testingIsBetterThan` in the `TestingSocialNetwork` class in the test/java directory to test this method. Run the code analyzers and commit your code now.
- Run the `TestSocialNetwork` class. Your program should have the following output:
  - `Facebook has 51 users, and a rating of 3.5`
  - `Snapchat has 188 users, and a rating of 5.0`
  - `MySpace has 13 users, and a rating of 2.4`
  - `There are 3 social networks.`
  - `true`
  - `false`
