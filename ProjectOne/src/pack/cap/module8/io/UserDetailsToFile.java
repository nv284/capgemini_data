package pack.cap.module8.io;

import java.io.*;
import java.util.*;

public class UserDetailsToFile {
    public static void main(String[] args) {
        // Creating a BufferedReader object to take input from the user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            // Creating FileWriter and BufferedWriter to write to a text file
            fileWriter = new FileWriter("D:\\user_details.txt", true); // 'true' to append data
            bufferedWriter = new BufferedWriter(fileWriter);

            // Asking user for details
            System.out.println("Enter your details:");

            // Name
            System.out.print("Name: ");
            String name = reader.readLine();

            // Phone number
            System.out.print("Phone Number: ");
            String phoneNumber = reader.readLine();

            // Age
            System.out.print("Age: ");
            String age = reader.readLine();

            // Storing details into the text file
            bufferedWriter.write("Name: " + name);
            bufferedWriter.newLine();
            bufferedWriter.write("Phone Number: " + phoneNumber);
            bufferedWriter.newLine();
            bufferedWriter.write("Age: " + age);
            bufferedWriter.newLine();
            bufferedWriter.write("-----------------------------"); // Separator
            bufferedWriter.newLine();

            System.out.println("Details saved successfully to user_details.txt");

        } catch (IOException e) {
            // Handle exceptions if file operations or input operations fail
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                // Close the BufferedReader and BufferedWriter
                if (reader != null) {
                    reader.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                System.err.println("An error occurred while closing resources: " + e.getMessage());
            }
        }
    }
}
