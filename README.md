# Notes-App-Project-using-java
Project Overview  The Java File I/O Notes App is a simple console-based note-taking application that demonstrates how to persist data using files. Unlike programs that lose data when closed, this app allows users to create, save, and retrieve notes permanently by using Java’s File I/O classes such as FileWriter, FileReader, and BufferedReader. 
Objective

To create a text-based notes manager that lets users:

Add new notes and save them to a file.

View all saved notes by reading from the file.

The main goal is to learn how to write to and read from text files in Java.

Tools & Technologies

Java (JDK): Core programming language.

VS Code (or any Java IDE): For writing and running the program.

Terminal/Command Prompt: For compiling and executing the .java file.

Key Java Concepts Used

FileWriter

Used to create or open a text file and write content into it.

Example: FileWriter fw = new FileWriter("notes.txt", true);

The true flag ensures append mode, so new notes don’t overwrite old ones.

FileReader / BufferedReader

FileReader reads characters from a file.

BufferedReader efficiently reads text line by line.

Example:

BufferedReader br = new BufferedReader(new FileReader("notes.txt"));


Exception Handling

Handles potential errors such as:

File not found

Input/output errors.

User Input with Scanner

To take notes and menu options from the user.

Features to Implement

Add Note:

User types a note.

Program saves the note into a file named, for example, notes.txt.

View Notes:

Program reads all notes from the file and displays them in the terminal.

Exit:

User can quit the application.
