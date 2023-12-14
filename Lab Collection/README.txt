# Lab 04: Format Checker

* Author: David Garcia
* Class: CPSC-221 Section 001
* Semester: Fall 2023

## Overview

Format Checker is a program which is meant to take in .dat files containing
specific data which we must check if it is in the right format. 

## Compiling and Using

In order to compile and use one must input java followed by the class name and the filename in to 
the command line. One should be able to add the amount of file names after the class name 
and receive a valid or invalid notification stating weather the file is correctly formatted or not.

## Discussion
I started having issues from the start as I was unable to implement a proper way of
starting the file from the command line. I went around this by explicitly adding the files
one by one and attempting to catch the necessary exceptions to have a valid or invalid output. 
I know from the start, my home machine was having an issue as I had to go in to powershell
in order for the class to run from terminal but I was still unable to implement a proper way of running from terminal. 
I kept running in to an outofbounds exception  

## Testing
For testing, I took the path of each .dat file and ran my program to check if the necessary bounds chacking would happen.
I also ensured that if no args were passed the program would exit and inform that arguments were needed in the command line.


----------