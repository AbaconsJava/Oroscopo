package it.corso.oroscopo.support;

import java.util.Scanner;

public class Supporto {
	public static int chiediNumero(String messaggio) {
		int tmp = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(messaggio);		
		
		tmp = scanner.nextInt();				
		
		//scanner.close();
		return tmp;
	} //public static int chiediNumero(String messaggio) {
	
	public static String chiediStringa(String messaggio) {
		String tmp = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(messaggio);
		tmp = scanner.nextLine();		
		
		//scanner.close();
		return tmp;
	} //public static int chiediNumero(String messaggio) {
} //public class Supporto {
