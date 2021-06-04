package klaseSport;

public class SportistaRunner {

	public static void main(String[] args) {
/*
 * Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.
 */
		
		Sportista s1 = new Sportista("Bogdan Bogdanovic", "Kosarka", "Sarlot", 8);
		Sportista s2 = new Sportista("Nikola Jokic", "Kosarka", "Denver", 15);
		Sportista s3 = new Sportista("Majkl Jordan", "Kosarka", "Cikago", 23);
		
		System.out.println(s1.getImePrezime() + " " + s1.getKlub() + " " + s1.getBroj());
		System.out.println(s2.getImePrezime() + " " + s2.getKlub() + " " + s2.getBroj());
		System.out.println(s3.getImePrezime() + " " + s3.getKlub() + " " + s3.getBroj());
		
		s1.setKlub("Atlanta");
		s1.setBroj(13);
		System.out.println(s1); // Ispis toString metodom
		System.out.println(s2);// Ispis toString metodom
		System.out.println(s3);// Ispis toString metodom
		
	}

}
