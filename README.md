# Sort_Manager
## Summary

The main goal of this project is to implement the Java Design Patterns

## Required Setup

Initially the project was created in Intellij IDEA with the Maven option provided upon creating a new file.

![image-20220204115305011](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220204115305011.png)

This allowed the project to contain access to dependencies made easier to access and include. While discussing the dependencies required for this project, the two main dependencies were JUnit or Jupiter for testing and Log4J for the logging. Everything else was done with the base install of the OpenJDK package.

To access the dependencies and import them into the project the user must access the pom.xml file created upon the selection and naming of the Maven project shown above. From within the pom.xml file the user must right click within the <project> </project> area within the file. The left image displays what would pop up.

![image-20220206151544136](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220206151544136.png)![image-20220206151657299](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220206151657299.png)

The user would select Generate.. => Dependency and then search for Jupiter for JUnit or Log4J for Logging. This brings up the available packages. Ensure that the correct one is selected and click on "Add".

<img src="C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220206152122045.png" alt="image-20220206152122045"  /><img src="C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220206152349409.png" alt="image-20220206152349409"  />







## *Table of Contents*

1. [Phases, Reasons for Creation and Goals](#1.-Phase,-Reasons-for-Creation-and-Goals)

2. [Phase 1](#Phase-1)
3. [Phase 2](#Phase-2)
4. [Phase 3](#Phase-3)
5. [Phase 4](#Phase-4)
6. [Phase 5](#Phase-5)
7. [Final Conclusions](#Final-Conclusions)
8. [Using the Software](#Using-the-Software)



# 1. Phase, Reasons for Creation and Goals

The main reason for this project being split into Phases is to develop incrementally over the span of a week in order to learn and understand the various way of implementing features.

Incrementally including newly learned functions, practises and packages to improve the input, output and overall outcome of the project and program.

Below the individual Phases can be found and quickly accessed with the [Table of Contents](#Table-of-Contents) above! Throughout there is reference to the features, and at the end is all the testing once all features were implemented.





# Phase 1

### Implementation

In the beginning, the requirements were to create two sorting algorithms - Bubble and Merge. Implement these and test them. This implementation was both a simple implementation of the features in the same file that allowed the creation of a random sized array of Integers:

![image-20220204134600501](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220204134600501.png)

The above code takes an already initialised int[] array and finds the length. That length is assigned to range. From there, the 'for loop' will loop until 'j' is equal to 'range'. This int variable is used to assign a random Integer within the range of 0-999. These Integer values will be used in the sorters.

The code underlined in Red generates and assigns the random digits. To change the range of numbers, the number 1000 can be changed to whatever the user determines to be their adequate range for generated digits. Range: 0 - Integer.MAXINT.

The Blue underlined code simply returns the filled array.

The two original sorting algorithms programmed for this project were setup to accept the int[] array that's randomly generated above. And so work throughout the project no matter the refactoring or any other change to the structure of the program.

### Testing the implementation

Implementation of testing happened throughout the project but started early and allowed for refining of the features. Early on the testing was done only on the implemented features and therefore for a bigger and better picture on all of the features and their capabilities I have relegated the testing to a section titled [Testing](#Testing).

# Phase 2

![image-20220205155207405](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220205155207405.png)

In Phase 2 the plan of action was to refactor the code into Model View Controller and utilises the Factory Design Pattern to create a modular systems that allowed the addition of new features in the form of new Sort subclasses. 

# Phase 3

In phase four the implementation of the Logging with the Log4J package took place and included outputting similar lines to a file as those seen in the image below. Interested in the information that was going through the file, the chosen sorter was included to begin with, following it up with the unsolved array and the solved array. Finally in the line of logs for each sorter passthrough the time it took to complete the sort in nanoseconds. 

![image-20220205141257937](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220205141257937.png)

The main idea of the logging was to get different levels of logging to be output to a file in a specific location. The above image shows the program going through the process of completing each sorting algorithm with debug output to the file to note that it made it through the process. And when an error is encountered, an Error log is generated and appended to the file.

# Phase 4

The implementation of the Binary Search Tree was difficult and took some time to understand, but eventually was implemented and worked with the already implemented MVC and Factory environment setup in [Phase 2.](#phase-2) This meant that there was no need to refactor the program structure any more and that the arrays that were passed into the two other sorting algorithms would work without the need for change to their implementation. However upon finishing the tree it was easier to pass a new ArrayList to the method that translates the tree structure to an array and then manipulate that into an int[] array.

![Binary Search Tree Algorithm](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220205142733480.png)

The above piece of code was found to be helpful in creating just what was needed to implement and return the tree as an array. Taking one single Integer each time around it determines if the root is null and then creates a new Node. Following from this if that check fails it starts to split the data into branches and from there will create the structure of the Binary Search Tree using a nested class and recursion. From here the tree is done and from the sort method (not shown) it queries the treeToArrayList method and once again utilises recursion to sort out the tree structure into an ArrayList to return.



# Phase 5

Phase 5 had the goal of implementing a timing structure that could time the sorting, originally the timing was done in nanoseconds but later revised to be displayed in seconds, with some maths done behind the scene to present it in a nicer way.

![image-20220205153426368](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220205153426368.png)

The above image once again shows the two original algorithms and the newly introduced Binary Search Tree in the previous phase, Phase 4.

The image also shows a more refined logging practise, showing everything that was shown prior, but now including the timing as a log to the file.



# Testing

The testing was mostly performed on the Sorts and as such a method to achieve a sorted list of the Integers needed to be implemented in each test. The below image shows the code that a copy of the arrays were run against to get a sorted list for comparison.

![image-20220206135350043](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220206135350043.png)

The Testing was done from two angles, the features and the number generator.

## First, the number generator:

![image-20220206141309512](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220206141309512.png)

All that was really possible with the testing of the number generator was to find if the returned array kept the same size throughout the addition of the random numbers in the SortManager.

## Second, the features:

The testing of the features also required access to the random number generator that was tested above.

The way that the tests are constructed allowed them to be used throughout the different tests for the features. Each returned a pass on each test provided, meaning that they all function correctly.

Each test file accesses the basic features, running against a small array list, a large array list. A list that isn't randomly generated and a bunch of edge cases that confirm the proper functionality of the program.

### Bubble Sort Testing

![image-20220206150815308](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220206150815308.png)

### Merge Sort Testing

![image-20220206150848414](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220206150848414.png)

### Binary Search Tree Testing

![image-20220206150916364](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220206150916364.png)
