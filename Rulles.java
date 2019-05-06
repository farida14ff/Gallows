import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Rulles {

    public JFrame rullesFrame = null;
    Canvas canvas ;

    public void ShowRulles(){
        rullesFrame = new JFrame("Rulles");
        JPanel  rullesPanel = new JPanel();

//        menuFrame.getContentPane().add(BorderLayout.SOUTH, letterPanel);
        rullesFrame.getContentPane().add(BorderLayout.CENTER, rullesPanel);
        rullesFrame.setVisible(true);
        rullesFrame.setSize(900,700);
        rullesFrame.setBackground(Color.PINK);
        rullesFrame.setResizable(false);
        rullesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //rullesFrame.setLayout(new GridLayout(3,1));

        JButton Restart = new JButton("Go back");
        Restart.addActionListener(new Rulles.RestartListener());
        Restart.setBackground(Color.BLUE);
        Restart.setFont((new Font("Serif", Font.CENTER_BASELINE, 29)));
        Restart.setSize(new Dimension(50, 20));

        String rullesOfGame = "WEUFHKJDN SGIVH VSXKCJVN KJDF LXKCJV DIFV\n" +
                "VX XCBCXN XC XIJX LC\n" +
                " XCPOBJKXBLKXCJXPLJCB LX\n" +
                "C BXC BXCILBKJXCKBDBSFN SV  OEFSN FPI SDFK PSU\n ";

        JLabel rulLabel = new JLabel(rullesOfGame,JLabel.CENTER);
        rulLabel.setFont((new Font("Serif", Font.CENTER_BASELINE, 30)));
        rulLabel.setAlignmentX(0);
        rulLabel.setAlignmentY(0);

        rullesPanel.add(rulLabel);
        rullesPanel.add(Restart);

    }
    public class RestartListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
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
