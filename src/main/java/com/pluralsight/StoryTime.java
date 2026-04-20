package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Integer.*;

public class StoryTime {
    public static void main(String[] args) {
        boolean storyTime = false;

        String line;
        int lineNum = 1;

        Scanner myObj = new Scanner(System.in);

        while (!storyTime) {
            System.out.print("Enter the name of a story or to end the story type (The End): ");
            String story = myObj.nextLine();

            if (story.equalsIgnoreCase("goldilocks")) {try {
                FileReader fileReader = new FileReader("goldilocks.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println( lineNum + ": " + line);
                    lineNum++;
                }
                bufferedReader.close();
            }
            catch (IOException ex) {

            }
            }
            else if (story.equalsIgnoreCase("hansel and gretel")) {
                try {
                    FileReader fileReader = new FileReader("hansel_and_gretel.txt");
                    BufferedReader bufferedReader = new BufferedReader(fileReader);

                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println( lineNum + ": " + line);
                        lineNum++;
                    }
                    bufferedReader.close();
                }
                catch (IOException ex) {

                }
            }
            else if (story.equalsIgnoreCase("mary had a little lamb")) {
                try {
                    FileReader fileReader = new FileReader("mary_had_a_little_lamb.txt");
                    BufferedReader bufferedReader = new BufferedReader(fileReader);

                    while ((line = bufferedReader.readLine()) != null) {
                            System.out.println( lineNum + ": " + line);
                            lineNum++;
                    }
                    bufferedReader.close();
                }
                catch (IOException ex) {

                }
            } else if (story.equalsIgnoreCase("the end")) {
                storyTime = true;
            }
            lineNum = 1;
        }
    }
}
