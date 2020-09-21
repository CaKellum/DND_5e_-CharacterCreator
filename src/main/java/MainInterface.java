import javax.swing.*;
import javax.swing.border.Border;

import backend.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class MainInterface {

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
        homePanel.add(LabelAdd(), BorderLayout.NORTH);
        return homePanel;
    }

    private JPanel LabelAdd() {
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.PAGE_AXIS));
        JLabel strengthLabel = new JLabel("strenghth"),
                dexterityLabel = new JLabel("dexterity"),
                constitutionLabel = new JLabel("costitution"),
                intelligenceLabel = new JLabel("inteligence"),
                wisdomLabel = new JLabel("wisdom"),
                charismaLabel = new JLabel("charisma");
        labelPanel.add(strengthLabel);
        labelPanel.add(dexterityLabel);
        labelPanel.add(constitutionLabel);
        labelPanel.add(intelligenceLabel);
        labelPanel.add(wisdomLabel);
        labelPanel.add(charismaLabel);
        return labelPanel;
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
