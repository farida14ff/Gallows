import java.io.IOException;


public class Start {
	
	public static void main(String[] args) throws IOException {
		Start s = new Start();
		s.start();
	}
	public void start() throws IOException {
//		String word = Wordpicker.getWord();
//		Word.setWord(word);
//		String secret = Word.hideSecret();
//		Screen s = new Screen();
//		s.go(word, secret, 0, "",false);
		Menu menu = new Menu();
		menu.goMenu();
	}
}
/*1.добатить текст правил и разделить их на строчки
* 2.созать кнопку другое слово
* 3.добавить звук
* 4.создать кнопочку отключения звука
* 5.возможно добавить таймер
* 6.изменить дизайн букв
* 7.изменить цвет шрифта кнопки "go back to menu" на желтый например
* 8.добавить значок уровня
* 9.добавить кнопку жизни
* 10.добавить прибавчение жизней за угаданное слово
* 11.добавить возможность исопользовать жизни как посказку
* 12.кнопку настройки
* 13.кнопка ресстарт
* 14.
* */
