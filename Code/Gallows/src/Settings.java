import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Settings {
    public JFrame setingsFrame= null;
    public JPanel setingsPanel = null;
    public JPanel setingsPanelGoBack = null;
    public static Audio btns;
    JRadioButton soundOffB = new JRadioButton("OFF",true);
    JRadioButton soundOnB = new JRadioButton("ON",false);

    public void ShowSetings(){
        setingsFrame = new JFrame("SETTINGS");
        setingsPanel = new JPanel();
        setingsPanelGoBack = new JPanel();
        ButtonGroup group = new ButtonGroup();

        btns = new Audio("/home/farida/DPrograms/Git/JavaProj/GlJ8.9/probnick/gallows/btn.wav",1.0);

        setingsFrame.getContentPane().add(BorderLayout.CENTER, setingsPanel);
        setingsFrame.getContentPane().add(BorderLayout.SOUTH, setingsPanelGoBack);
        setingsFrame.setVisible(true);
        setingsFrame.setSize(900,700);
        setingsFrame.setBackground(Color.PINK);
        setingsFrame.setResizable(false);
        setingsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setingsFrame.setBackground(Color.PINK);

        String setingsOfGame = "<html> <u>SETTINGS</u><br>" +
                "<br>" +
                "Sound: <br>" +
                " <br></html>";

        JLabel setingLabel = new JLabel(setingsOfGame,JLabel.CENTER);
        setingLabel.setFont((new Font("Serif", Font.CENTER_BASELINE, 20)));

        soundOffB.addActionListener(new Settings.SoundOffListener());
        soundOffB.setBackground(Color.PINK);

        soundOnB.addActionListener(new Settings.SoundOnListener());
        soundOnB.setBackground(Color.PINK);

        group.add(soundOffB);
        group.add(soundOnB);


        JButton Restart = new JButton("Go back");
        Restart.addActionListener(new Settings.RestartListener());
        Restart.setBackground(Color.ORANGE);
        Restart.setFont((new Font("Serif", Font.CENTER_BASELINE, 27)));
        Restart.setSize(new Dimension(50, 20));

        JButton color = new JButton("Change color");
        color.setBackground(new Color(0, 0, 0));
        color.setForeground(new Color(241, 255, 0));
        color.setFont((new Font("Serif", Font.CENTER_BASELINE, 27)));
        color.setSize(new Dimension(50, 20));
        color.addActionListener(new Settings.ColorListener());

        setingsPanel.add(setingLabel);
        setingsPanel.add(soundOnB);
        setingsPanel.add(soundOffB);
        setingsPanel.setBackground(Color.PINK);
        setingsPanel.setLayout(new GridLayout(7,1));

        setingsPanelGoBack.add(color);
        setingsPanelGoBack.add(Restart);
        setingsPanelGoBack.setBackground(Color.PINK);

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

    public class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            btns.sound();
            try {
                final JColorChooser chooser = new JColorChooser();
                class OkListener implements ActionListener {

                    public void actionPerformed(ActionEvent e) {
                        Color c = chooser.getColor();
                        setingsPanel.setBackground(c);
                        soundOffB.setBackground(c);
                        soundOnB.setBackground(c);
                        setingsPanelGoBack.setBackground(c);
                        btns.sound();
                    }
                }
                JDialog co = JColorChooser.createDialog(null, "Pick A Color", false, chooser, new OkListener(), null);
                chooser.setColor(new Color(154, 51, 52));
                co.setVisible(true);
            } catch (Exception ex) {
                System.out.println("Nothing");
            }
        }
    }



}

