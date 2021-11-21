package Aplicacao;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Time t1 = new Time();
		Time t2 = new Time(12);
		Time t3 = new Time(13,20);
		Time t4 = new Time(15,25,57);
		
		System.out.println("Hora sem atríbuto: "+ t1.exibeHora());
		System.out.println("Hora com 1 atríbuto: "+ t2.exibeHora());
		System.out.println("Hora com 2 atríbutos: "+ t3.exibeHora());
		System.out.println("Hora com 3 atríbutos: "+ t4.exibeHora());
		
		sc.close();
		
	}

}
