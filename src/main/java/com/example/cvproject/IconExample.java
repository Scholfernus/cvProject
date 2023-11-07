package com.example.cvproject;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IconExample {
    public static void main(String[] args) {
        // Ładowanie ikony z pliku graficznego
        ImageIcon icon = new ImageIcon("icon.png");

        // Tworzenie etykiety z ikoną
        JLabel label = new JLabel(icon);

        // Tworzenie ramki i dodawanie etykiety
        JFrame frame = new JFrame("Przykład ikony");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }
}


