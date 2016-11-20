import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author robert
 * 
 */
public class GeldRechner {

	public static void main(String[] args) {
		befehl();

	}

	/**
	 * Auswahlmethode
	 */
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
				TimeUnit.SECONDS.sleep(7);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	public static void rechnen1() {
		Scanner rechner = new Scanner(System.in);
		System.out.println("Auswahl \n [1]: Monatsgehalt \n [2]: Jahresgehalt");
		int auswahl = rechner.nextInt();
		Scanner berechner = new Scanner(System.in);
		if (auswahl == 1) {
			System.out.println("Dein Monatsgehalt: ");
		} else if (auswahl == 2) {
			System.out.println("Dein Jahresgehalt: ");
		} else {
			System.out.println("Falsche Eingabe");
			rechnen1();
		}
		double ausrechnen = berechner.nextDouble();
		Scanner temp = new Scanner(System.in);
		System.out.println("Wie viel Prozent von dem Geld willst du ausgeben? [0-100] %");
		double prozent = temp.nextInt();
		if (prozent > 100 || prozent < 0) {
			System.out.println("Falsche Eingabe");
			rechnen1();
		}
		double tmp = ausrechnen;
		ausrechnen = ausrechnen * (prozent * 0.01);
		String tmp2 = null;
		if (auswahl == 1) {
			tmp2 = "Monat";
			ausrechnen = Math.round((ausrechnen / (365 / 12)) * 100) / 100.0;
		} else if (auswahl == 2) {
			tmp2 = "Jahr";
			ausrechnen = Math.round((ausrechnen / 365) * 100) / 100.0;
		} else {
			rechnen1();
		}

		System.out.println("Wenn du " + tmp + "€ pro " + tmp2 + " verdienst und davon " + prozent
				+ "% ausgeben willst, kannst du " + ausrechnen + "€ pro Tag ausgeben.");
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
