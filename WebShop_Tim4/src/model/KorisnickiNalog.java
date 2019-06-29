package model;


import java.util.*;


public class KorisnickiNalog {
   
   private String korisnickoIme;
   
   private String lozinka;
   
   private TipKorisnika vrstaKorisnika;
   
   public Mesto mesto;
   
   public RegistrovaniKupac registrovaniKupac;
   
	public KorisnickiNalog(){
		
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