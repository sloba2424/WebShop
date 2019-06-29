package komparatori;

import java.util.Comparator;

import model.Proizvod;

public class PoredjenjePoCeniRastuce implements Comparator<Proizvod>{

	@Override
	public int compare(Proizvod p1, Proizvod p2) {
		int result = 0;		
		int cena1 = p1.getCena();
		int cena2 = p2.getCena();
		
		
		if(cena1 < cena2){
			result = -1;
		}else if(cena1 > cena2){
			result = 1;
		}else{
			result = 0;
		}
		
		return result;
	}
	
}
