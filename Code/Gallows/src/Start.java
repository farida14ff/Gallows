import java.io.IOException;


public class Start {
	
	public static void main(String[] args) throws IOException {
		Start s = new Start();
		s.start();
	}
	public void start() throws IOException {
		Menu menu = new Menu();
		menu.goMenu();
	}
}
/*1.добавить меню бар
* 2.добавить кнопку жизни
* 3.кнопка помощь
* 4.музака для медиа и для системы
* 5.возможно добавить таймер
* 6.добавить прибавчение жизней за угаданное слово
* 7.добавить значок уровня
* 8.настроить пункт настройки gridlayout
* */
