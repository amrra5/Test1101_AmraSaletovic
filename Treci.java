import java.util.*;

public class Treci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite niz brojeva(0 prekida unos):");
		ArrayList<Integer> brojevi = new ArrayList<>();
		int unos = 1;

		while (unos > 0) {
			unos = sc.nextInt();
			if (unos == 0) {
				break;
			}else{
			brojevi.add(unos);
			}

		}
		System.out.print("Niz u obrnutom redoslijedu: ");
		for(int i=brojevi.size()-1; i>=0; i--){
			System.out.print(brojevi.get(i) + " ");
		}
		
		sc.close();
	}

}
