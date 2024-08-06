package org.example;

import org.example.persistance.Database;
import org.example.utils.InputRequester;

import javax.swing.*;
import java.sql.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int optionManager = 0;
        do{
            optionManager = Integer.parseInt(JOptionPane.showInputDialog("""
            1. Coder Manager
            2. Exit
            
            Enter your favorite option:
            """));

            switch (optionCRUD) {
                case 1:
                    do {
                        optionCRUD = Integer.parseInt(JOptionPane.showInputDialog("""
                        1. View Coder
                        2. Look for Coder
                        3. Delete Coder
                        4. Update Coder
                        5. Exit
                        
                        Enter your option:
                        """));

                        switch (optionCRUD) {
                            case 1:
                                CoderController.create();
                                break;
                    }

            } while (optionCRUD != 2);
                    break;

        }
    }  JOptionPane.showMessageDialog(null, "Have a great day. Until next time!");
    }
}

