import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // Check if 2 command line arguments are given
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <sourceFile> <destinationFile>");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        try {
            FileReader reader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(destinationFile);

            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);

            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
    }
}


/*
🧪 How to Run from Terminal:
Save as FileCopy.java

Compile the program:

javac FileCopy.java
Run the program with source and destination file paths:


java FileCopy input.txt output.txt


💡 Output:
File copied successfully from input.txt to output.txt
*/