package komparatori;

import java.util.Comparator;

import model.Proizvod;

public class PoredjenjePoNazivuZ_A implements Comparator<Proizvod>{
	@Override
	public int compare(Proizvod p1, Proizvod p2) {
		
		int result = 0;
		String str1 = p1.getNaziv();
		String str2 = p2.getNaziv();
		
		result =  str1.compareToIgnoreCase(str2);
		result = result * -1;
		
		return result;
	}
	
	

}
