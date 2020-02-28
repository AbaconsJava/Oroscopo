package it.corso.oroscopo.support;

public class CalcolaOroscopo {
	public static void calcolaOroscopo() {
		String nome = Supporto.chiediStringa("Inserisci il tuo nome");
		String dtn = Supporto.chiediStringa
				("Inserisci la tua data di nascita (gg/mm/aaaa)");
		
		int iSegno = calcolaSegno(dtn);
		
		String sSegno = estraiSegno(iSegno);
		//String sOroscopo = estraiOroscopo(iSegno);
		
		System.out.println(nome + " il tuo segno è: " + sSegno);
		/* System.out.println(String.format("%s il tuo segno è %s", nome, sSegno));
		   System.out.printf("%s il tuo segno è %s", nome, sSegno);
		*/
		
		//System.out.println(nome + " il tuo oroscopo è:\n" + sOroscopo);
	
	
	} //public static void calcolaOroscopo() {
	
	public static int calcolaSegno (String valore) {
		int tmp = 0;
		String gg = valore.substring(0, 2);
		String mm = valore.substring(3, 5);
		
		tmp = Integer.parseInt(mm + gg);
		
		if (tmp >= 321 && tmp <= 419) tmp = 1;
		else if (tmp >= 420 && tmp <= 520) tmp = 2;
		else if (tmp >= 521 && tmp <= 620) tmp = 3;
		else if (tmp >= 621 && tmp <= 722) tmp = 4;
		else if (tmp >= 723 && tmp <= 823) tmp = 5;
		else if (tmp >= 824 && tmp <= 922) tmp = 6;
		else if (tmp >= 923 && tmp <= 1022) tmp = 7;
		else if (tmp >= 1023 && tmp <= 1121) tmp = 8;
		else if (tmp >= 1122 && tmp <= 1221) tmp = 9;
		else if (tmp >= 1221 && tmp <= 1231) tmp = 10;
		else if (tmp >= 101 && tmp <= 119) tmp = 10;
		else if (tmp >= 120 && tmp <= 219) tmp = 11;
		else if (tmp >= 220 && tmp <= 320) tmp = 12;
				
		return tmp;
	} //public static int calcolaSegno (String valore) {

	public static String estraiSegno (int valore) {
		String tmp = "";
		
		switch (valore) {
		case 1: tmp = "Ariete";
		break;
		case 2: tmp = "Toro";
		break;
		case 3: tmp = "Gemelli";
		break;
		case 4: tmp = "Cancro";
		break;
		case 5: tmp = "Leone";
		break;
		case 6: tmp = "Vergine";
		break;
		case 7: tmp = "Bilancia";
		break;
		case 8: tmp = "Scorpione";
		break;
		case 9: tmp = "Sagittario";
		break;
		case 10: tmp = "Capricorno";
		break;
		case 11: tmp = "Acquario";
		break;
		case 12: tmp = "Pesci";
		break;		
		}
		
		return tmp;
	} //public static String estraiSegno (int valore) {	




} //public class CalcolaOroscopo {
