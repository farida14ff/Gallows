import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

public class Screen {
	JFrame frame=null;
	String secret=null;
	MyDrawPanel slika;

	public static Audio btns;
	public static Audio win;
	public static Audio loos;


	public void go(String word, String secret, int status, String message, boolean visibility) {


		frame = new JFrame("Gallows pole!");
		JPanel letterPanel = new JPanel();
		JPanel wordPanel = new JPanel();
		this.secret=secret;

		btns = new Audio("/home/farida/DPrograms/Git/JavaProj/GlJ8.9/probnick/gallows/btn.wav",1.0);
		win = new Audio("/home/farida/Downloads/wavSounds/win.wav",1.0);
		loos = new Audio("/home/farida/Downloads/wavSounds/lose.wav",1.0);

		//letters
		JButton ButtonA = new JButton("A");
		JButton ButtonB = new JButton("B");
		JButton ButtonC = new JButton("C");
		JButton ButtonD = new JButton("D");
		JButton ButtonE = new JButton("E");
		JButton ButtonF = new JButton("F");
		JButton ButtonG = new JButton("G");
		JButton ButtonH = new JButton("H");
		JButton ButtonI = new JButton("I");
		JButton ButtonJ = new JButton("J");
		JButton ButtonK = new JButton("K");
		JButton ButtonL = new JButton("L");
		JButton ButtonM = new JButton("M");
		JButton ButtonN = new JButton("N");
		JButton ButtonO = new JButton("O");
		JButton ButtonP = new JButton("P");
		JButton ButtonQ = new JButton("Q");
		JButton ButtonR = new JButton("R");
		JButton ButtonS = new JButton("S");
		JButton ButtonT = new JButton("T");
		JButton ButtonU = new JButton("U");
		JButton ButtonV = new JButton("V");
		JButton ButtonW = new JButton("W");
		JButton ButtonX = new JButton("X");
		JButton ButtonY = new JButton("Y");
		JButton ButtonZ = new JButton("Z");
		JButton anotherWord = new JButton("Another word");
		JButton NewGame = new JButton("New Game");
		JButton Restart = new JButton("Go back to menu");



		if(visibility) {
			anotherWord.setVisible(false);
			NewGame.setVisible(true);
			Restart.setVisible(true);

		} else{
			anotherWord.setVisible(true);
			NewGame.setVisible(false);
			Restart.setVisible(false);
		}

		JLabel guessSpace = new JLabel(secret);
		guessSpace.setFont((new Font("Serif", Font.CENTER_BASELINE, 29)));

		JLabel poruka = new JLabel(message);
		poruka.setFont((new Font("Serif", Font.CENTER_BASELINE, 18)));

		anotherWord.setFont((new Font("Serif", Font.CENTER_BASELINE, 29)));
		anotherWord.setSize(new Dimension(50, 20));


		NewGame.setFont((new Font("Serif", Font.CENTER_BASELINE, 29)));
		NewGame.setSize(new Dimension(50, 20));

		Restart.setFont((new Font("Serif", Font.CENTER_BASELINE, 29)));
		Restart.setSize(new Dimension(50, 20));

		slika = new MyDrawPanel();
		slika.setStatus(status);

		//adding letters
		letterPanel.setLayout(new GridLayout(2,2));
		letterPanel.add(ButtonA);
		letterPanel.add(ButtonB);
		letterPanel.add(ButtonC);
		letterPanel.add(ButtonD);
		letterPanel.add(ButtonE);
		letterPanel.add(ButtonF);
		letterPanel.add(ButtonG);
		letterPanel.add(ButtonH);
		letterPanel.add(ButtonI);
		letterPanel.add(ButtonJ);
		letterPanel.add(ButtonK);
		letterPanel.add(ButtonL);
		letterPanel.add(ButtonM);
		letterPanel.add(ButtonN);
		letterPanel.add(ButtonO);
		letterPanel.add(ButtonP);
		letterPanel.add(ButtonQ);
		letterPanel.add(ButtonR);
		letterPanel.add(ButtonS);
		letterPanel.add(ButtonT);
		letterPanel.add(ButtonU);
		letterPanel.add(ButtonV);
		letterPanel.add(ButtonW);
		letterPanel.add(ButtonX);
		letterPanel.add(ButtonY);
		letterPanel.add(ButtonZ);

		//letters ActionListener
		ButtonA.addActionListener(new LetterListener(ButtonA, status, word));
		ButtonB.addActionListener(new LetterListener(ButtonB, status, word));
		ButtonC.addActionListener(new LetterListener(ButtonC, status, word));
		ButtonD.addActionListener(new LetterListener(ButtonD, status, word));
		ButtonE.addActionListener(new LetterListener(ButtonE, status, word));
		ButtonF.addActionListener(new LetterListener(ButtonF, status, word));
		ButtonG.addActionListener(new LetterListener(ButtonG, status, word));
		ButtonH.addActionListener(new LetterListener(ButtonH, status, word));
		ButtonI.addActionListener(new LetterListener(ButtonI, status, word));
		ButtonJ.addActionListener(new LetterListener(ButtonJ, status, word));
		ButtonK.addActionListener(new LetterListener(ButtonK, status, word));
		ButtonL.addActionListener(new LetterListener(ButtonL, status, word));
		ButtonM.addActionListener(new LetterListener(ButtonM, status, word));
		ButtonN.addActionListener(new LetterListener(ButtonN, status, word));
		ButtonO.addActionListener(new LetterListener(ButtonO, status, word));
		ButtonP.addActionListener(new LetterListener(ButtonP, status, word));
		ButtonQ.addActionListener(new LetterListener(ButtonQ, status, word));
		ButtonR.addActionListener(new LetterListener(ButtonR, status, word));
		ButtonS.addActionListener(new LetterListener(ButtonS, status, word));
		ButtonT.addActionListener(new LetterListener(ButtonT, status, word));
		ButtonU.addActionListener(new LetterListener(ButtonU, status, word));
		ButtonV.addActionListener(new LetterListener(ButtonV, status, word));
		ButtonW.addActionListener(new LetterListener(ButtonW, status, word));
		ButtonX.addActionListener(new LetterListener(ButtonX, status, word));
		ButtonY.addActionListener(new LetterListener(ButtonY, status, word));
		ButtonZ.addActionListener(new LetterListener(ButtonZ, status, word));

		//color of buttons
		ButtonA.setBackground(Color.PINK);
		ButtonB.setBackground(Color.PINK);
		ButtonC.setBackground(Color.PINK);
		ButtonD.setBackground(Color.PINK);
		ButtonE.setBackground(Color.PINK);
		ButtonF.setBackground(Color.PINK);
		ButtonG.setBackground(Color.PINK);
		ButtonH.setBackground(Color.PINK);
		ButtonI.setBackground(Color.PINK);
		ButtonJ.setBackground(Color.PINK);
		ButtonK.setBackground(Color.PINK);
		ButtonL.setBackground(Color.PINK);
		ButtonM.setBackground(Color.PINK);
		ButtonN.setBackground(Color.PINK);
		ButtonO.setBackground(Color.PINK);
		ButtonP.setBackground(Color.PINK);
		ButtonQ.setBackground(Color.PINK);
		ButtonR.setBackground(Color.PINK);
		ButtonS.setBackground(Color.PINK);
		ButtonT.setBackground(Color.PINK);
		ButtonU.setBackground(Color.PINK);
		ButtonV.setBackground(Color.PINK);
		ButtonW.setBackground(Color.PINK);
		ButtonX.setBackground(Color.PINK);
		ButtonY.setBackground(Color.PINK);
		ButtonZ.setBackground(Color.PINK);

		anotherWord.addActionListener(new NewGameListener());
		anotherWord.setBackground(Color.pink);

		NewGame.addActionListener(new NewGameListener());
		NewGame.setBackground(Color.pink);

		Restart.addActionListener(new RestartListener());
		Restart.setBackground(Color.PINK);


		wordPanel.add(guessSpace);
		wordPanel.add(poruka);
		wordPanel.add(anotherWord);
		wordPanel.add(NewGame);
		wordPanel.add(Restart);
		wordPanel.setLayout(new GridLayout(7,1));

		frame.add(slika);
		frame.getContentPane().add(BorderLayout.SOUTH, letterPanel);
		frame.getContentPane().add(BorderLayout.EAST, wordPanel);
		frame.setVisible(true);
		frame.setSize(900,700);
		frame.setBackground(Color.white);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public class LetterListener implements ActionListener {
		JButton Slovo;
		int status;
		String word;
		Screen s1 = new Screen();
		LetterListener(JButton slovo, int status, String word) {
			this.Slovo = slovo;
			this.status=status;
			this.word=word;

		}
		public void actionPerformed(ActionEvent event) {
			btns.sound();
			if(status<11) {
				if(Word.checkLetter(Slovo.getText())==true) {
					secret=Word.addLetter(Slovo.getText());
					frame.dispose();
					if (secret.contains("_")) {
						s1.go(word, secret, status, "There is letter "  + Slovo.getText() + " in the wanted expression",false);
					} else {
						win.sound();
						s1.go(word, secret, status, "The word has been found!",true);
					}
				}else{
					frame.dispose();
					s1.go(word, secret, status+1, "The letter "  + Slovo.getText() + " is not in the wanted expression.",false);
				}
			} else  {
				frame.dispose();
				Word.restartPosition();
				loos.sound();
			    s1.go(word, secret, status, "You lost. Answer is "+ Word.getWord()+"!",true);
			}
		}
	}

	public class NewGameListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				btns.sound();
				String word = Wordpicker.getWord();
				Word.setWord(word);
				String secret = Word.hideSecret();
				Screen s = new Screen();
				s.go(word, secret, 0, "",false);
				frame.setVisible(false);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public class RestartListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Start s1= new Start();
			try {
				btns.sound();
				frame.dispose();
				Word.restartPosition();
				s1.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	class MyDrawPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		private String filepath;
		public void setStatus(int status) {
			filepath="./gallows/"+status+".jpg";
		}
		public void paintComponent(Graphics g) {
			Image image = new ImageIcon(filepath).getImage();
			g.drawImage(image, 0,0,342, 306, this);
		}
	}

}

