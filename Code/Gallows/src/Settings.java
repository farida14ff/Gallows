import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Settings {
    public JFrame setingsFrame= null;

    public void ShowSetings(){
        setingsFrame = new JFrame("Setings");
        JPanel  setingsPanel = new JPanel();

//        menuFrame.getContentPane().add(BorderLayout.SOUTH, letterPanel);
        setingsFrame.getContentPane().add(BorderLayout.CENTER, setingsPanel);
        setingsFrame.setVisible(true);
        setingsFrame.setSize(900,700);
        setingsFrame.setBackground(Color.PINK);
        setingsFrame.setResizable(false);
        setingsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setingsFrame.setLayout(new GridLayout(3,1));

        JButton Restart = new JButton("Go back");
        Restart.addActionListener(new Settings.RestartListener());
        Restart.setBackground(Color.BLUE);
        Restart.setFont((new Font("Serif", Font.CENTER_BASELINE, 29)));
        Restart.setSize(new Dimension(50, 20));


        String setingsOfGame = "WEUFHKJDN SGIVH VSXKCJVN KJDF LXKCJV DIFV" +
                "VX XCBCXN XC XIJX LC" +
                " XCPOBJKXBLKXCJXPLJCB LX" +
                "C BXC BXCILBKJXCKBDBSFN SV  OEFSN FPI SDFK PSU ";

        JLabel setingLabel = new JLabel(setingsOfGame,JLabel.CENTER);
        setingLabel.setFont((new Font("Serif", Font.CENTER_BASELINE, 30)));
        setingLabel.setAlignmentX(0);
        setingLabel.setAlignmentY(0);

        setingsPanel.add(setingLabel);
        setingsPanel.add(Restart);

    }
    public class RestartListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Start s1= new Start();
            try {
                setingsFrame.dispose();
                Word.restartPosition();
                s1.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

