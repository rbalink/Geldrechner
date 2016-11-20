import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GeldRechner {

	public static void main(String[] args) {
		befehl();

	}

	public static void befehl() {
		while (true) {
			Scanner command = new Scanner(System.in);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("[Auswahl] \n [1]: Wie viel Geld kann ich pro Tag ausgeben? (Monatsgehalt eingeben)\n "
					+ "[2]: Wie viel Geld will ich pro Tag ausgeben? (Tagesgeldbetrag eingeben) \n " + "[3]: Beenden");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			int auswahl = command.nextInt();
			if (auswahl == 1) {
				rechnen1();
			} else if (auswahl == 2) {
				rechnen2();
			} else if (auswahl == 3) {
				System.out.println("Tschüss");
				return;
			} else {
				System.out.println("Falsche Eingabe");
			}
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void rechnen1() {
		Scanner rechner1 = new Scanner(System.in);
		System.out.println("Auswahl \n [1]: Monatsgehalt \n [2]: Jahresgehalt");
		int auswahl1 = rechner1.nextInt();
		if (auswahl1 == 1) {
			rechnen1Monat();
		} else if (auswahl1 == 2) {
			rechnen1Jahr();
		} else {
			System.out.println("Falsche Eingabe");
			rechnen1();
		}

	}

	public static void rechnen1Monat() {
		// prozentual berechnen
		Scanner rechnen1Monat = new Scanner(System.in);
		System.out.println("Dein Monatsgehalt: ");
		double berechnen1M = rechnen1Monat.nextDouble();
		berechnen1M = Math.round((berechnen1M / (365 / 12)) * 100) / 100.0;
		System.out.println("Du kannst " + berechnen1M + "€ pro Tag ausgeben.");
	}

	public static void rechnen1Jahr() {

		Scanner rechnen1Jahr = new Scanner(System.in);
		System.out.println("Dein Jahresgehalt: ");
		double berechnen1J = rechnen1Jahr.nextDouble();
		berechnen1J = Math.round((berechnen1J / 365) * 100) / 100.0;
		System.out.println("Du kannst " + berechnen1J + "€ pro Tag ausgeben.");
	}

	public static void rechnen2() {
		Scanner rechnen2 = new Scanner(System.in);
		System.out.println("Wie viel Geld willst du pro Tag ausgeben?: ");
		int berechnen2 = rechnen2.nextInt();
		int jahr = berechnen2 * 365;
		int monat = berechnen2 * (365 / 12);
		System.out.println("Wenn du pro Tag " + berechnen2 + "€ ausgeben willst. Dann gibst du pro Monat " + monat
				+ "€ und pro Jahr " + jahr + "€ aus.");

	}

}