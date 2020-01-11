import java.util.*;

public class Cetvrti {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			lista.add((int) (Math.random() * 102 + 1));
		}
		
		System.out.print("Generisana kolekcija: ");
		Iterator<Integer> i = lista.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nKoliko elemenata zelite ukloniti iz kolekcije? ");
		int brElemenata = sc.nextInt();
		System.out.print("\nUnesite indexe " + brElemenata
				+ " elementa koje zelite ukloniti: ");
		int brojac = 0;
		int indexElementa = 0;
		while (brojac < brElemenata) {
			indexElementa = sc.nextInt();
			lista.remove(lista.get(indexElementa));
			brojac++;
			
		}
		sc.close();
		System.out.print("\nNova kolekcija: ");
		Iterator<Integer> i2 = lista.iterator();
		while (i2.hasNext()) {
			System.out.print(i2.next() + " ");
		}
		
	}

}
