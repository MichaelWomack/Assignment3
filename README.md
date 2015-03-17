# Assignment3

The purpose of this assignment is to reinforce linear data structure concepts.  Specifically, the assigment is to the following 3 problems.

1) Write a program that meets the following requirements.Define a class named Point with two data fields x and y to represent a point's x and y coordinates.
Define two classes CompareX and CompareY that implement Comparator<Point>.  For CompareX, compare points using the x-coordinates.  If the x-coordinates are equal, 
then use the y-coordinates.  For CompareY, compare points using the y-coordinates.  If the y-coordinates are equal, then use the x-coordinates.Randomly create 100 
points and sort these points twice: once using CompareX and the other using CompareY.

2) Write a test program that stores 5 million integers in a linked list. and test the time to traverse the list using an iterator vs. using the get method.

3) Write a method that converts an infix expression into a postfix expression and a test program to test your method.  The method header should be
              
    public static String infixToPostfix (String expression)
