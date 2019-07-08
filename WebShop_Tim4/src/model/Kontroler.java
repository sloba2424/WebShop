package model;

import java.util.ArrayList;
import java.util.List;

public class Kontroler {
	
	private Stanje novoStanje;
	
	public void placenjaNarudzbenice(Narudzbenica narudzbenica) {
		narudzbenica.stanje = new Placena();
	}
	
	public void odbijenoPlacanje(Narudzbenica narudzbenica) {
		narudzbenica.stanje = new NaCekanju();
	}
	
	private List<UpdateListener> listeners = new ArrayList<UpdateListener>();
	
	public void addListener(UpdateListener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(UpdateListener listener) {
		listeners.remove(listener);
	}
	
	public void osveziStanje() {		
		UpdateEvent e = new UpdateEvent(this, novoStanje);
		//Slanje dogadjaja da se desila promena svima koji su se registrovali za pracenje promena:
		for (UpdateListener updateListener : listeners) {
			updateListener.updatePerformed(e);
		}
		
		//U slucaju realnog kontrolera, ovde bi se direktno izdavale komande izlaznim uredjajima.
	}

}

