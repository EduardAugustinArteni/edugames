package edugames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CashMoneyGame2 {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static double bani = 0;
	public static double venituri = 0;

	public static void main(String[] args) throws IOException {

		String Slujba = null;

		System.out.println(
				"In acest joc trebuie sa faci bani pentru a te angaja scrie 'slujbe' iar ca sa inveti trebuie sa spui 'scoala' si ca sa termini ziua spune 'termina ziua'");
		int Mate = 0;
		int Literatura = 0;
		int Putere = 0;
		int PermisDeConducere = 0;
		while (true) {
			String CeVreiSaFaci = null;
			CeVreiSaFaci = br.readLine();
			switch (CeVreiSaFaci.toUpperCase()) {
			case "TERMINA ZIUA":
				terminaZiua(bani, venituri, Slujba, Mate, Literatura, Putere, PermisDeConducere);
				break;
			case "SLUJBE":
				VeziSlujbele(Slujba, Literatura, Putere, PermisDeConducere, Mate);
				break;
			case "SCOALA":
				Scoala(Literatura, Putere, PermisDeConducere, Mate);
				break;

			}

		} // end of while

	}

	public static void terminaZiua(double bani, double venituri, String Slujba, int Mate, int Literatura, int Putere,
			int PermisDeConducere) {

		bani = bani + venituri;
		System.out.println("Ai " + bani + " bani.");
		System.out.println("Ai " + venituri + " venituri.");
		if (Slujba == null) {
			System.out.println("Nu ai slujba, ar fi bine sa iti iei una");
		} else {
			System.out.println("Ai slujba de " + Slujba + ".");
		}

		System.out.println("Mate " + Mate);
		System.out.println("Literatura " + Literatura);
		System.out.println("Putere " + Putere);
		System.out.println("Permis de conducere " + PermisDeConducere);
	}

	public static void VeziSlujbele(String Slujba, int Putere, int Mate, int Literatura, int PermisDeConducere)
			throws IOException {
		System.out.println("1)   Constructor 2$ pe zi ");
		System.out.println("Nevointe : Mate 0 Literatura 0 Putere 0");
		System.out.println("2)   Curatator de strazi 4$ pe zi ");
		System.out.println("Nevointe : Mate 0 Literatura 0 Putere 0");
		System.out.println("3)   Curatator de geamuri 5$ pe zi ");
		System.out.println("Nevointe : Mate 0 Literatura 0 Putere 1");
		System.out.println("4)   Curatator de masini 6$ pe zi ");
		System.out.println("Nevointe : Mate 0 Literatura 0 Putere 2");
		System.out.println("5)   Postas 10$ pe zi ");
		System.out.println("Nevointe : Mate 0 Literatura 0 Putere 0 Permis de conducere 1");
		System.out.println("6)   Taximetrist 11$ pe zi ");
		System.out.println("Nevointe : Mate 2 Literatura 1 Putere 0 Permis de conducere 1");
		System.out.println("7)   Casier 15$ pe zi ");
		System.out.println("Nevointe : Mate 5 Literatura 3 Putere 0");
		System.out.println("8)   Programator 50$ pe zi ");
		System.out.println("Nevointe : Mate 10 Literatura 5 Putere 0");
		System.out.println("Zi 1/2/3/4/5/6/7/8 ca sa te angajezi.");

		String CeVreiSaTeAngajezi = null;
		CeVreiSaTeAngajezi = br.readLine();

		if (CeVreiSaTeAngajezi.equalsIgnoreCase("1")) {
			venituri = 2;
			Slujba = "Constructor";
		}
		if (CeVreiSaTeAngajezi.equalsIgnoreCase("2")) {
			venituri = 4;
			Slujba = "Curatator de strazi";
		}
		if (CeVreiSaTeAngajezi.equalsIgnoreCase("3") && Putere > 0) {
			venituri = 5;
			Slujba = "Curatator de geamuri";
		}
		if (CeVreiSaTeAngajezi.equalsIgnoreCase("4") && Putere > 1) {
			venituri = 6;
			Slujba = "Curatator de masini";
		}
		if (CeVreiSaTeAngajezi.equalsIgnoreCase("5") && PermisDeConducere > 0) {
			venituri = 10;
			Slujba = "Postas";
		}
		if (CeVreiSaTeAngajezi.equalsIgnoreCase("6") && Mate > 1 && Literatura > 0 && PermisDeConducere > 0) {
			venituri = 11;
			Slujba = "Taximetrist";
		}
		if (CeVreiSaTeAngajezi.equalsIgnoreCase("7") && Mate > 4 && Literatura > 2) {
			venituri = 15;
			Slujba = "Casier";
		}
		if (CeVreiSaTeAngajezi.equalsIgnoreCase("8") && Mate > 9 && Literatura > 4) {
			venituri = 50;
			Slujba = "Programator";
		}

	}

	public static void Scoala(int Mate, int Literatura, int Putere, int PermisDeConducere) throws IOException {
		System.out.println("1)   Mate -5$");
		System.out.println("2)   Literatura -5$");
		System.out.println("3)   Putere - 5$");
		System.out.println("4)   Permis de conducere - 100$");
		System.out.println("Zi 1/2/3/4 pentru a invata.");
		String CeVreiSaInveti = null;
		CeVreiSaInveti = br.readLine();
		if (CeVreiSaInveti.equalsIgnoreCase("1") && bani > 4) {
			bani = bani - 5;
			Mate++;
		}
		if (CeVreiSaInveti.equalsIgnoreCase("2") && bani > 4) {
			bani = bani - 5;
			Literatura++;
		}
		if (CeVreiSaInveti.equalsIgnoreCase("3") && bani > 4) {
			bani = bani - 5;
			Putere++;
		}
		if (CeVreiSaInveti.equalsIgnoreCase("4") && bani > 99) {
			bani = bani - 100;
			PermisDeConducere++;
		}
	}

}
