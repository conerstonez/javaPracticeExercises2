package Dairy;

import javax.swing.*;
import java.util.Scanner;

public class Main {
//    private static Scanner keyboardInput = new Scanner(System.in);
    private static Diary diary;

    public static void main(String[] args) {
        createDiary();
        displayLockMenu();
    }

    private static void createDiary() {
        String mainMain = """
                Welcome to my Diary!
                Let's setup things up
                """;
        print(mainMain);
        String username = input("Enter your name");
        String password = input("Enter your password");
        diary = new Diary(username, password);
        print("Diary created for " + username);
    }

    private static void displayLockMenu() {
        String mainMain = """
                Press
                Press 1 -> Unlock Diary
                Press 2 -> Lock Dairy
                Press 3 -> exit
                """;
        String userInput = input(mainMain);
        switch (Integer.parseInt(userInput)) {
            case 1 -> unlockDiary();
            case 2 -> lockDairy();
            case 3 -> exitApplication();
        }
    }

    private static void exitApplication() {
        print("Thanks for using our application");
        System.exit(0);
    }

    private static void lockDairy() {
        diary.lock();
        print("Locked successfully");
        displayLockMenu();
    }

    private static void unlockDiary() {
        String password = input("Enter correct password");
        diary.unlock(password);
        if (diary.isLocked()) {print("Wrong password"); displayLockMenu();}
        displayDiaryMenu();
    }

    private static void displayDiaryMenu() {
        String diaryMenu = """
                Press 1 -> Create Entry
                Press 2 -> Find Entry by Id
                Press 3 -> Get total number of entries
                press 4 -> lock diary
                """;
        String userInput = input(diaryMenu);
        switch ( (Integer.parseInt(userInput))) {
            case 1 -> createEntry();
            case 2 -> FindById();
            case 3 -> GetEntryNumber();
            case 4 -> lockDairy();
        }
    }

    private static void GetEntryNumber() {
        int totalNumberOfEntry = diary.numberOfEntries();
        print("You have " + totalNumberOfEntry + " Entries");
        displayDiaryMenu();
    }

    private static void FindById() {

        String id = input("Enter the Id for the entry you want to find");
        Entry foundEntry = diary.findEntryById(Integer.parseInt(id));
        print(foundEntry.toString());
        displayDiaryMenu();
    }

    private static void createEntry() {
        String title = input("Enter title for the entry");
        String body = input("Enter body for the entry");
        diary.write(title, body);
        displayDiaryMenu();
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
//        print(prompt);
//        return keyboardInput.nextLine();
    }

    private static void print(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
//        System.out.println(prompt);
    }
}
