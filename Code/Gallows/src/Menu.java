import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class Menu {
    JFrame menuFrame = null;
    public static JPanel menuPanel = null;

    public static Audio btns;
    public static Audio back;

    public JButton StartGame;
    public JButton Exit;
    public JButton SettingsB;
    public JButton Rulles;

    public void goMenu(){
        menuFrame = new JFrame("MENU");
        menuPanel = new JPanel();

        menuFrame.getContentPane().add(BorderLayout.CENTER, menuPanel);

        btns = new Audio("/home/farida/DPrograms/Git/JavaProj/GlJ8.9/probnick/gallows/btn.wav",1.0);
        back = new Audio("/home/farida/Downloads/wavSounds/back.wav",1.0);

        StartGame = new JButton("Start Game!");
        StartGame.setBackground(Color.RED);
        StartGame.setForeground(Color.ORANGE);
        StartGame.setFont((new Font("Serif", Font.CENTER_BASELINE, 29)));
        StartGame.addActionListener(new Menu.StartGemeListener());
        StartGame.addMouseListener(new Menu.StartGameMouseListener());

        Rulles = new JButton("Rules");
        Rulles.setBackground(Color.orange);
        Rulles.setFont((new Font("Serif", Font.CENTER_BASELINE, 29)));
        Rulles.addActionListener(new Menu.RullesListener());
        Rulles.addMouseListener(new Menu.RulesMouseListener());

        SettingsB = new JButton("Settings");
        SettingsB.setBackground(Color.ORANGE);
        SettingsB.setFont((new Font("Serif", Font.CENTER_BASELINE, 29)));
        SettingsB.addActionListener(new Menu.SettingListener());
        SettingsB.addMouseListener(new Menu.SettingMouseListener());

        Exit = new JButton("Exit");
        Exit.setBackground(Color.orange);
        Exit.setFont((new Font("Serif", Font.CENTER_BASELINE, 29)));
        Exit.addActionListener(new Menu.ExitListener());
        Exit.addMouseListener(new Menu.ExitMouseListener());



        menuPanel.add(StartGame);
        menuPanel.add(Rulles);
        menuPanel.add(SettingsB);
        menuPanel.add(Exit);
        menuPanel.setBackground(new Color(0, 0, 0));
        menuPanel.setLayout(new GridLayout(10,0));

        menuFrame.setVisible(true);
        menuFrame.setSize(900,700);
        menuFrame.setBackground(Color.PINK);
        menuFrame.setResizable(false);
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class StartGemeListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            try {
                btns.sound();
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

    public class StartGameMouseListener implements MouseListener{

        @Override
        public void mouseEntered(MouseEvent e) {
            StartGame.setText("Начать Игу!");
//            StartGame.setBackground(new Color(81, 17, 154));
//            StartGame.setForeground(new Color(55, 152, 251));
            StartGame.setBackground(new Color(0, 0, 0));
            StartGame.setForeground(new Color(241, 255, 0));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            StartGame.setText("Start Game!");
            StartGame.setBackground(Color.RED);
            StartGame.setForeground(Color.ORANGE);

        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }


    }

    public class RullesListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            btns.sound();
            Rulles rulles = new Rulles();
            rulles.ShowRulles();
            menuFrame.setVisible(false);
        }
    }

    public class RulesMouseListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            Rulles.setText("Правила");
//            Rulles.setBackground(new Color(55, 152, 251 ));
//            Rulles.setForeground(new Color(81, 17, 154));
            Rulles.setBackground(new Color(0,0,0));
            Rulles.setForeground(new Color(255, 18, 0));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            Rulles.setText("Rules");
            Rulles.setBackground(Color.orange);
            Rulles.setForeground(Color.black);
        }
    }

    public class SettingListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            btns.sound();
            Settings settings = new Settings();
            settings.ShowSetings();
            menuFrame.setVisible(false);
        }
    }

    public class SettingMouseListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            SettingsB.setText("Настрйки");
//            SettingsB.setBackground(new Color(55, 152, 251 ));
//            SettingsB.setForeground(new Color(81, 17, 154));
            SettingsB.setBackground(new Color(0,0,0));
            SettingsB.setForeground(new Color(255, 18, 0));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            SettingsB.setText("Settings");
            SettingsB.setBackground(Color.ORANGE);
            SettingsB.setForeground(Color.black);
        }
    }

    public class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            btns.sound();
            menuFrame.setVisible(false);
        }
    }

    public class ExitMouseListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            Exit.setText("Выход");
            Exit.setBackground(new Color(0,0,0));
            Exit.setForeground(new Color(255, 18, 0));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            Exit.setText("Exit");
            Exit.setBackground(Color.orange);
            Exit.setForeground(Color.BLACK);

        }
    }


}
