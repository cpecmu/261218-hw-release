# 261218-hw-release
Released code for 261218 homework assignments

## Code release structure
[hw?] directory is the entry point for each homework assignment,
and contains the following subdirectories:
* [src] directory contains the code being released, including
template for what you should work on.
* [hw?tests] directory contains test cases for appropriate problems.
Use file names to help match a test case with a problem.

There may be additional directories as the course progresses.
Some files may change locations as the course progresses.

## Managing source
The released code has been implemented and tested on the Eclipse IDE and repl.it,
but it is possible to make it work with other IDEs also.

### Eclipse IDE
* If you are using Eclipse as your IDE, creating a new Java project from
existing code, with [hw?] as the main project directory, should set
everything up for you nicely.  You should only need to select a Java
compiler for the project.  (Java 8 and up should work fine.)
* In most IDEs, there should be an option to select a certain directory
as a _source_ directory.  In this release, it is the [src] directory
that should be selected.
* Then, subdirectories of the [src] directory contain many source files
under many packages.  In Java, a directory represents a package.  If you
set the source directory correctly, the packages should be in the right
places for the Java compiler to look for.

### repl.it
If you are using repl.it as your IDE, you can run files directly by clicking on
the "Run" button.  But before you do that, you need to edit the `.replit` file
to choose the Java file you want to run.

In `.replit` file, you need to change the `run` configuration to point to the
desired homework set and the name of the file you would like to run,
without the `...Impl.java` suffix.
For example, to run the file `PeakFinderImpl.java`
inside hw1, change the `run` configuration to the following:
`run = "bash java-run.sh hw1 PeakFinder"`

## Dealing with test cases
Sample test cases are located in the [hw?tests] directory under each assignment.
If you use the Eclipse IDE, running the program should look for these files
without much trouble, because the working directory is the main
project directory, i.e., [hw].  If you use other IDEs, you might need to set
the working directory to point to [hw?tests] when running the code, or change
the path of the file in the released programs to point to the correct location.
Don't worry, our grader will find our own test cases at the right places
regardless of how you change the string indicating the location of the
test case you are trying.

The format of test cases may be underspecified, so look for how the main
programs read them.

##

If you have any questions, please contact the instructor for help.
Our goal is to make you feel challenged when solving algorithmic problems,
not when you are trying to get the released code to run.  Therefore, get
the released code runnable as soon as possible, and ask for help when you
feel so.
