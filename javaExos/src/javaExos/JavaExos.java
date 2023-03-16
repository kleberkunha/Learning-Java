package javaExos;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class JavaExos {
	public static void main(String[] args) {
		Date data = new Date();
		
		System.out.print("The time of your system is : ");
		System.out.println(data);
		
		Locale lang = Locale.getDefault();
		System.out.print("The language of your system is : ");
		System.out.println(lang);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.print("The dimension of your screen is : ");
		System.out.println(screenSize);
	};

}
