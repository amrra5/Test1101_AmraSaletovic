import java.util.*;
public class Drugi {

	public static void main(String[] args) {
		
		ArrayList<Integer> brojevi = new ArrayList<>();
		for(int i=0; i<100; i++){
			brojevi.add((int)(Math.random()*10));
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite jednocifreni broj:");
		int unos = scanner.nextInt();
		
		if(brojevi.contains(unos)){
			System.out.println("Pogodili ste broj iz moje tajne kolekcije!");
		}else{
			System.out.println("wah wah wah");
		}
		scanner.close();

	}

}
