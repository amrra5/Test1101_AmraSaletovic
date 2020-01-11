import java.util.*;
public class Peti {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite kolekciju stringova: ");
		String unos = null;
		ArrayList<String> stringovi = new ArrayList<>();
		for(int i=0; i<6; i++){
			unos = sc.next();
			stringovi.add(unos);
		}
		System.out.print("\nKolekcija stringova sa neparnim brojem karaktera: ");
		String element = null;
		for(int i=0; i<stringovi.size(); i++){
			element = stringovi.get(i);
			if(element.length()%2 != 0){
				System.out.print(element + " ");
			}
		}
		sc.close();
	}

}
