package com.mycodefu.java14;

import javax.swing.*;
import java.awt.*;

import static com.mycodefu.java14.EntryPoint.createAnimalsText;

public class AnimalsUI extends JFrame {
    private AnimalsUI() {
        JTextArea jTextArea = new JTextArea(createAnimalsText());
        jTextArea.setLineWrap(true);
        this.add(jTextArea);

        this.setMinimumSize(new Dimension(800, 600));
        this.setVisible(true);

    }
    public static void main(String[] args) { SwingUtilities.invokeLater(AnimalsUI::new); }
}
