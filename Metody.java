package ppa1;

import java.util.*;

public class Metody {

	public static void main(String[] args) {
		
		System.out.println("Start");
		//System.out.println("Vysledek operace: " + vypisCislo(789.56));
		
		System.out.println("Pocet delitelu je: " + vypisDelitelu(20));
		System.out.println("KONEC");
	}
	
	public static int vypisDelitelu(int cislo) {
		
		int pocetDelitelu = 0;
		
		for(int i = 1; i <= cislo; i++) {
			
			if(jeCisloDelitelne(cislo, i)) {
				
				pocetDelitelu++;
				
				if(pocetDelitelu > 1) {
					System.out.print(", ");
				}
				
				System.out.print(i);
			}
		}
		
		System.out.println("");
		return pocetDelitelu;
	}
	
	public static boolean jeCisloDelitelne(int cislo, int delitel) {
		
		boolean delitelne = false;
		delitelne = (cislo % delitel == 0);
		return delitelne;
	}
	
	
	/*public static String vypisCislo(int cisloKVypsani) {
		
		System.out.println(cisloKVypsani);
		return "POVEDLO SE (Int)";
	}
	
	public static String vypisCislo(double cisloKVypsani) {
		
		System.out.println(cisloKVypsani);
		return "POVEDLO SE (Double)";
	}*/
}