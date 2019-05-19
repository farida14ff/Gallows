import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Settings {
    public JFrame setingsFrame= null;
    public static Audio btns;
    JRadioButton soundOff = new JRadioButton("OFF",true);
    JRadioButton soundOn = new JRadioButton("ON",false);

    public void ShowSetings(){
        setingsFrame = new JFrame("SETTINGS");
        JPanel  setingsPanel = new JPanel();

        setingsFrame.getContentPane().add(BorderLayout.CENTER, setingsPanel);
        setingsFrame.setVisible(true);
        setingsFrame.setSize(900,700);
        setingsFrame.setBackground(Color.PINK);
        setingsFrame.setResizable(false);
        setingsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setingsFrame.setBackground(Color.PINK);

        btns = new Audio("/home/farida/DPrograms/Git/JavaProj/GlJ8.9/probnick/gallows/btn.wav",1.0);

        String setingsOfGame = "<html> <u>SETTINGS</u><br>" +
                "<br>" +
                "Sound <br></html>";

        JLabel setingLabel = new JLabel(setingsOfGame,JLabel.CENTER);
        setingLabel.setFont((new Font("Serif", Font.CENTER_BASELINE, 20)));
        setingLabel.setAlignmentX(0);
        setingLabel.setAlignmentY(0);



        soundOff.addActionListener(new Settings.SoundOffListener());


        soundOn.addActionListener(new Settings.SoundOnListener());

        ButtonGroup group = new ButtonGroup();
        group.add(soundOn);
        group.add(soundOff);

        JButton Restart = new JButton("Go back");
        Restart.addActionListener(new Settings.RestartListener());
        Restart.setBackground(Color.ORANGE);
        Restart.setFont((new Font("Serif", Font.CENTER_BASELINE, 27)));
        Restart.setSize(new Dimension(50, 20));

//        JButton save = new JButton("Save");
//        save.addActionListener(new SaveListener());
//        save.setBackground(Color.ORANGE);
//        save.setFont((new Font("Serif", Font.CENTER_BASELINE, 27)));
//        save.setSize(new Dimension(50, 20));



        setingsPanel.add(setingLabel);
        setingsPanel.add(soundOn);
        setingsPanel.add(soundOff);
        setingsPanel.add(Restart);
        setingsPanel.setBackground(Color.PINK);




    }
    public class RestartListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            btns.sound();
            Start s1= new Start();
            try {
                setingsFrame.dispose();
                s1.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public class SoundOffListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            btns.sound();
            Menu menu = new Menu();
            menu.back.stop();

        }
    }

    public class SoundOnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            btns.sound();
            Menu menu = new Menu();
            menu.back.sound();
            menu.back.repeat();

        }
    }


}

