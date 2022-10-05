import java.util.Scanner;

//Nome repo: AnagraficaUtenteinserire i seguenti dati relativi ad un utente, scegliendo il tipo di variabili più adatto per ogni dato:
//        -nome
//        -cognome
//        -età
//        -luogo di nascita
//        -altezza (in metri)
//        -possesso patente (vero/falso)
//        -genere (M/F/A)
//visualizzare poi i dati inseriti, formattandoli opportunamente (m

public class PrimoEsercizio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean hasPatente;
		String hasPatenteFinal;
		
		String nome = in.nextLine();
		System.out.print("Inserisci  il tuo cognome: ");
		String cognome = in.nextLine();
		System.out.print("Inserisci  la tua età: ");
		int età = Integer.parseInt(in.nextLine());
		System.out.print("Inserisci  la tua altezza: ");
		float altezza = Float.parseFloat(in.nextLine());

		System.out.print("In quale genere ti identifichi?[M,F,A]: ");
		String genere = in.nextLine();
		String genereFinal;
		if (genere.equals("M")) {
			genereFinal = "Maschio";
		} else if (genere == "F") {
			genereFinal = "Donna";
		} else {
			genereFinal = "Assesuato";
		}

		System.out.print("Hai la patente?: ");
		String patente = in.nextLine();
		if (patente.equals("Si")) {
			hasPatente = true;
		} else {
			hasPatente = false;
		}
		hasPatenteFinal = hasPatente ? "Hai la patente" : "Non hai la patente";

		System.out.println("Ti chiami " + nome + " " + cognome + ", hai " + età + " anni, sei alto " + altezza
				+ " metri, sei " + genereFinal + ", " + hasPatenteFinal + " ");

		in.close();
	}
}




