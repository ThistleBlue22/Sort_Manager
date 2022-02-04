# Sort_Manager
## Summary

The main goal of this project is to implement the Java Design Patterns

## Required Setup

Initially the project was created in Intellij IDEA with the Maven option provided upon creating a new file.

![image-20220204115305011](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220204115305011.png)

This allowed the project to contain access to dependencies made easier to access and include.







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





# Phase 1

### Implementation

In the beginning, the requirements were to create two sorting algorithms - Bubble and Merge. Implement these and test them. This implementation was both a simple implementation of the features in the same file that allowed the creation of a random sized array of Integers:

![image-20220204134600501](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220204134600501.png)

The above code takes an already initialised int[] array and finds the length. That length is assigned to range. From there, the 'for loop' will loop until 'j' is equal to 'range'. This int variable is used to assign a random Integer within the range of 0-999. These Integer values will be used in the sorters.

The code underlined in Red generates and assigns the random digits. To change the range of numbers, the number 1000 can be changed to whatever the user determines to be their adequate range for generated digits. Range: 0 - Integer.MAXINT.

The Blue underlined code simply returns the filled array.

The two original sorting algorithms programmed for this project were setup to accept the int[] array that's randomly generated above. And so work throughout the project no matter the refactoring or any other change to the structure of the program.

### Testing

Implementation of testing happened throughout the project but started early and allowed for refining of the features.

# Phase 2

Import a structure diagram here for the Factory and MVC refactoring

# Phase 3

In phase four the implementation of the Logging with the Log4J package took place and included outputting similar lines to a file as those seen in the image below. Interested in the information that was going through the file, the chosen sorter was included to begin with, following it up with the unsolved array and the solved array. Finally in the line of logs for each sorter passthrough the time it took to complete the sort in nanoseconds. 

![image-20220204122232449](C:\Users\wiico\Documents\GitHub\Sort_Manager\src\main\resources\images\image-20220204122232449.png)



# Phase 4

The implementation of the Binary Search Tree was difficult and took some time to understand

# Phase 5

Implement a better timing that either presents in seconds through timsing or using a different implementation
