import java.util.*;
public class Prvi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite niz brojeva od 12 brojeva: ");
		ArrayList<Integer> lista = new ArrayList<>();
		int unos = 0;
		for(int i=0; i<12; i++){
			unos = sc.nextInt();
			lista.add(unos);
		}
		sc.close();
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>(lista);
		System.out.print("\nUnikatni brojevi u datom nizu su: ");
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()){
			System.out.print(i.next() + " ");
		}
	}

}
