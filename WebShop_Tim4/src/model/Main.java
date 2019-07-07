package model;

import gui.AppWindow;


public class Main {
	
	static AppWindow window;
	static Aplikacija app = Aplikacija.getInstance();

	public static void main(String[] args) {
		//cisto da testiram, posle ce biti nesto smisleno
		Prodavnica prod = new Prodavnica("br tel", "Prodavnica 1", "adresa1", "email1", null);
		Proizvod proizvod = new Proizvod("proizvod", "proizvod", "proizvod", "proizvod", null);
		KorisnickiNalog nalog = new KorisnickiNalog("username", "password", null, null, null);
		Kupac kupac = new Kupac();
		
		app.dodajKorisnickiNalog(nalog);
		app.dodajProdavnicu(prod);
		app.dodajProizvod(proizvod);
				
		app.ucitajKolekcije();
		window = new AppWindow();
		window.frame.setVisible(true);
		
		
	}

	public static AppWindow getWindow() {
		return window;
	}

	public static void setWindow(AppWindow window) {
		Main.window = window;
	}
	
	

}
