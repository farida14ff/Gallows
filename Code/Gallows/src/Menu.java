import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Menu {
    JFrame menuFrame = null;
    JPanel menuPanel = null;

    public void goMenu(){
        menuFrame = new JFrame("Menu");
        menuPanel = new JPanel();

//        menuFrame.getContentPane().add(BorderLayout.SOUTH, letterPanel);
        menuFrame.getContentPane().add(BorderLayout.CENTER, menuPanel);


        JButton StartGame = new JButton("Start Game!");
        StartGame.setFont((new Font("Serif", Font.CENTER_BASELINE, 29)));
        StartGame.addActionListener(new Menu.StartGemeListener());
        StartGame.setBackground(Color.RED);

        JButton Exit = new JButton("Exit");
        Exit.setFont((new Font("Serif", Font.CENTER_BASELINE, 29)));
        Exit.addActionListener(new Menu.ExitLiatener());
        Exit.setBackground(Color.BLACK);

        JButton SettingsB = new JButton("Settings");
        SettingsB.setFont((new Font("Serif", Font.CENTER_BASELINE, 29)));
        SettingsB.addActionListener(new Menu.SettingListener());
        SettingsB.setBackground(Color.BLUE);


        JButton Rulles = new JButton("Rulles");
        Rulles.setFont((new Font("Serif", Font.CENTER_BASELINE, 29)));
        Rulles.addActionListener(new Menu.RullesListener());
        Rulles.setBackground(Color.GREEN);
        menuPanel.add(StartGame);
        menuPanel.add(Rulles);
        menuPanel.add(SettingsB);
        menuPanel.add(Exit);

        menuFrame.setVisible(true);
        menuFrame.setSize(900,700);
        menuFrame.setBackground(Color.PINK);
        menuFrame.setResizable(false);
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuPanel.setLayout(new GridLayout(3,1));



        //menuFrame.add(menuPanel);
//        menuPanel.setLayout(new GridLayout(3,1));
    }

    public class StartGemeListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            try {
                String word = Wordpicker.getWord();
                Word.setWord(word);
                String secret = Word.hideSecret();
                Screen s = new Screen();
                s.go(word, secret, 0, "",false);
                menuFrame.setVisible(false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public class RullesListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
                Rulles rulles = new Rulles();
                rulles.ShowRulles();
                menuFrame.setVisible(false);
        }
    }

    public class SettingListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Settings settings = new Settings();
            settings.ShowSetings();
            menuFrame.setVisible(false);

        }

    }

    public class ExitLiatener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            menuFrame.setVisible(false);
        }
    }
}
