import javax.swing.*;
import javax.swing.border.Border;

import backend.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class MainInterface {

    JLabel mainLabel  = new JLabel("text");
    int i = 0;

    public MainInterface(){
        JFrame display = globalContainer(homePanel());
        display.setVisible(true);
    }

    private JFrame globalContainer(JPanel neededPanel){
        JFrame mainScreen = new JFrame("MainScene");
        mainScreen.setSize(400,400);
        mainScreen.add(neededPanel);
        mainScreen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        return mainScreen;
    }

    private JPanel homePanel(){
        JPanel homePanel  = new JPanel(new BorderLayout());
        homePanel.add(mainLabel, BorderLayout.CENTER);
        JButton butt = new JButton("add one");
        butt.addActionListener(
                e -> {
                    i++;
                    mainLabel.setText(String.valueOf(i));
                });
        homePanel.add(butt, BorderLayout.SOUTH);

        return homePanel;
    }

    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
        SwingUtilities.invokeAndWait(
                new Runnable() {
                    public void run() {
                        new MainInterface();
                    }
                }
        );
    }

}
