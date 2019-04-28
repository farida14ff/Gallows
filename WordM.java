import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class WordM {

    static String WordN;
    static String secret;
    //static Graphics G;
    static Set<Character> position = new HashSet<Character>();

    public static void setWord(String word) {
        WordN = word;
    }

    public static String getWord() {
        return WordN;
    }

    public static void restartPosition() {
        position.clear();
    }


    public static String arr() {
        String[] wo = new String[WordN.length()];
        wo = WordN.split(",");
        String[] wo1 = new String[WordN.length() - 2];
        //String[] wor = new String[Word.length() - 2];
        for (int i = 1; i < WordN.length() - 1; i++) {
            int c = 0;
            wo1[c] = wo[i];
            c++;
        }
//        for (int i = 0; i < wo1.length; i++) {
//            int c = 0;
//            wor[c] = wo1[i];
//            c++;
//        }

        char Word0 = WordN.charAt(0);
        String WordFirst = Character.toString(Word0);

        char Word1 = WordN.charAt(WordN.length());
        String WordLast = Character.toString(Word1);

        class MyDrawPanel4 extends JPanel {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawString(WordFirst,370,40);
                g.setFont((new Font("Serif", Font.CENTER_BASELINE, 17)));
                g.setColor(Color.BLACK);
                for (String i:wo1) {
                    int x = 300;
                    g.drawString("_",x,40);
                    g.setFont((new Font("Serif", Font.CENTER_BASELINE, 17)));
                    g.setColor(Color.BLACK);
                    x += 30;
                }
                g.drawString(WordLast,(300 +30)*wo1.length,40);
                g.setFont((new Font("Serif", Font.CENTER_BASELINE, 17)));
                g.setColor(Color.BLACK);
                //letterPanel1.setLayout(new GridLayout(2, 2));
            }
        }
        return frame.add(MyDrawPanel4);

    }
}