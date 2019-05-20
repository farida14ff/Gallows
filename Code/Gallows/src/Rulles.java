import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Rulles {

    public JFrame rullesFrame = null;
    public JPanel  rullesPanel = null;
    public static Audio btns;

    public void ShowRulles(){
        rullesFrame = new JFrame("RULES");
        rullesPanel = new JPanel();
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Options");
        JMenu podMenu1 = new JMenu("Language");
        JMenuItem subPodMenu11 = new JMenu("English");
        JMenuItem subPodMenu12 = new JMenu("Русский");

        menu1.add(podMenu1);
        podMenu1.add(subPodMenu11);
        podMenu1.add(subPodMenu12);
        menuBar.add(menu1);

        rullesFrame.getContentPane().add(BorderLayout.CENTER, rullesPanel);
        rullesFrame.setVisible(true);
        rullesFrame.setSize(900,700);
        rullesFrame.setBackground(Color.PINK);
        rullesFrame.setResizable(false);
        rullesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rullesFrame.setJMenuBar(menuBar);

        btns = new Audio("/home/farida/DPrograms/Git/JavaProj/GlJ8.9/probnick/gallows/btn.wav",1.0);

        JButton Restart = new JButton("Go back");
        Restart.addActionListener(new Rulles.RestartListener());
        Restart.setBackground(Color.orange);
        Restart.setFont((new Font("AvantGarde", Font.CENTER_BASELINE, 27)));


        String rullesOfGame = "<html> <u>RULES <br>" +
                "<br>"+
                "</u>The computer gives to the player word or phrase; the player try  <br>" +
                "to guess what it is one letter at a time.If a player suggests a letter<br>" +
                "that occurs in the word, the computer fills in the blanks with that<br>" +
                "letter in the right places. If the word does not contain the suggested <br>" +
                "letter, the computer draws one element of a hangman’s gallows. As the<br>" +
                "game progresses, a segment of the gallows and of a victim is added for <br>" +
                "every suggested letter not in the word. The number of incorrect guesses <br>" +
                "before the game ends is up to the players, but completing a character in <br>" +
                "a noose provides a minimum of six wrong answers until the game ends.<br>"+
                "<br>" +
                "Objective<br>" +
                "Guess the word/phrase before your man gets hung!<br>" +
                "<br>" +
                "Letter frequencies<br>" +
                "A good acronym to commit to memory is: ETAOIN SHRDLU. It’s hard to <br>" +
                "pronounce, yes, but its order denotes the most commonly used letters<br>" +
                "(in order) in the English language.</html>";

        JLabel rulLabel = new JLabel(rullesOfGame,JLabel.CENTER);
        rulLabel.setFont((new Font("Serif", Font.CENTER_BASELINE, 20)));
        rulLabel.setAlignmentX(0);
        rulLabel.setAlignmentY(0);

        rullesPanel.add(rulLabel);
        rullesPanel.add(Restart);
        rullesPanel.setBackground(Color.PINK);

    }
    public class RestartListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            btns.sound();
            Start s1= new Start();
            try {
                rullesFrame.dispose();
                Word.restartPosition();
                s1.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
