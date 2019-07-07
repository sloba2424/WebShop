package model;


import java.io.Serializable;
import java.util.*;


public class KorisnickiNalog implements Serializable {
   
   private String korisnickoIme;
   
   private String lozinka;
   
   private TipKorisnika vrstaKorisnika;
   
   public Mesto mesto;
   
   public RegistrovaniKupac registrovaniKupac;
   
	public KorisnickiNalog(){
		
	}
	
	
	
	public KorisnickiNalog(String korisnickoIme, String lozinka, TipKorisnika tk) {
		super();
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
		this.vrstaKorisnika = tk;
	}
	
	



	public KorisnickiNalog(String korisnickoIme, String lozinka, TipKorisnika vrstaKorisnika,
			RegistrovaniKupac registrovaniKupac) {
		super();
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
		this.vrstaKorisnika = vrstaKorisnika;
		this.registrovaniKupac = registrovaniKupac;
	}



	public KorisnickiNalog(String korisnickoIme, String lozinka, TipKorisnika vrstaKorisnika, Mesto mesto,
			RegistrovaniKupac registrovaniKupac) {
		super();
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
		this.vrstaKorisnika = vrstaKorisnika;
		this.mesto = mesto;
		this.registrovaniKupac = registrovaniKupac;
	}



	public String getKorisnickoIme() {
		return korisnickoIme;
	}
	
	
	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}
	
	
	public String getLozinka() {
		return lozinka;
	}
	
	
	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}
	
	
	public TipKorisnika getVrstaKorisnika() {
		return vrstaKorisnika;
	}
	
	
	public void setVrstaKorisnika(TipKorisnika vrstaKorisnika) {
		this.vrstaKorisnika = vrstaKorisnika;
	}
	
	
	public Mesto getMesto() {
		return mesto;
	}
	
	public void setMesto(Mesto mesto)
	{
		this.mesto = mesto;
	}
	
	
}