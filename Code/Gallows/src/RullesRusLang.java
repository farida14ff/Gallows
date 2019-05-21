import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class RullesRusLang {
    public JFrame rullesFrame = null;
    public JPanel  rullesPanel = null;


    public static Audio btns;

    public void ShowRullesRusLang(){
        rullesFrame = new JFrame("ПРАВИЛА");
        rullesPanel = new JPanel();
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Опции");
        JMenu podMenu1 = new JMenu("Язык");
        JRadioButtonMenuItem r2 = new JRadioButtonMenuItem("English");
        JRadioButtonMenuItem r1 = new JRadioButtonMenuItem("Русский");
        r1.setSelected(true);
        r2.addActionListener(new RullesRusLang.R2Listener());

        menu1.add(podMenu1);
        podMenu1.add(r2);
        podMenu1.add(r1);
        menuBar.add(menu1);


        btns = new Audio("/home/farida/DPrograms/Git/JavaProj/GlJ8.9/probnick/gallows/btn.wav",1.0);


        String rullesOfGame = "<html> <u>ПРАВИЛА <br>" +
                "<br> " +
                "</u> Компьютер выдает игроку слово или фразу; игрок попытается <br>" +
                "угадать, что это,по одной букве за раз. Если игрок предлагает <br>" +
                "букву что присутствует в слове, компьютер заполняет пробелы этой  <br> " +
                "буквой в нужных местах. Если слово не содержит предложенной<br> " +
                "буквы, компьютер рисует один элемент виселицы палача.Игра  <br>" +
                "прогрессирует, добавляются сегменты виселицы и жертвы за <br>" +
                "каждую предложенная буква, что не в слове. Количество неверных  <br>" +
                "догадок до окончания игры зависит от игрока, но завершение персонажа<br> " +
                "в игре, дает минимум шесть неправильных ответов до конца игры.<br>" +
                "<br>" +
                "Цель <br>" +
                "Отгадать слово/фразу, прежде чем твой человечек повесится! <br>" +
                "<br>" +
                "Повторяющиеся буквы <br>" +
                "Хорошая аббревиатура для фиксации в памяти: ETAOIN SHRDLU. Трудно <br>" +
                "произнести, да, но его порядок обозначает наиболее часто  <br>" +
                "используемые буквы (по порядку) в английском языке. </html>";


        JLabel rulLabel = new JLabel(rullesOfGame,JLabel.CENTER);
        JButton Restart = new JButton("Назад");

        rulLabel.setFont((new Font("Serif", Font.CENTER_BASELINE, 18)));
        rulLabel.setAlignmentX(0);
        rulLabel.setAlignmentY(0);

        Restart.addActionListener(new RullesRusLang.RestartListener());
        Restart.setBackground(Color.orange);
        Restart.setFont((new Font("AvantGarde", Font.CENTER_BASELINE, 27)));


        rullesPanel.add(rulLabel);
        rullesPanel.add(Restart);
        rullesPanel.setBackground(Color.PINK);

        rullesFrame.getContentPane().add(BorderLayout.CENTER, rullesPanel);
        rullesFrame.setVisible(true);
        rullesFrame.setSize(900,700);
        rullesFrame.setBackground(Color.PINK);
        rullesFrame.setResizable(false);
        rullesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rullesFrame.setJMenuBar(menuBar);

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

    public class R2Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            btns.sound();
            Rulles rulles= new Rulles();
            rulles.ShowRulles();
            rullesFrame.setVisible(false);
        }
    }

}

