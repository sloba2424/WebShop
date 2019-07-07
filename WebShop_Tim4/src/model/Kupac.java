package model;


import java.io.Serializable;
import java.util.*;


public class Kupac implements Serializable {
   
   private String ime;
   
   private String prezime;
   
   private Pol pol;
   
   private String eAdresa;
   
   private String adresa;
   
   
   public Korpa korpa;
   
	public Kupac() {
		Korpa k = new Korpa();
	}


	public String getIme() {
		return ime;
	}
	
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	
	public String getPrezime() {
		return prezime;
	}
	
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	
	public Pol getPol() {
		return pol;
	}
	
	
	public void setPol(Pol pol) {
		this.pol = pol;
	}
	
	
	public String geteAdresa() {
		return eAdresa;
	}
	
	
	public void seteAdresa(String eAdresa) {
		this.eAdresa = eAdresa;
	}
	
	
	public String getAdresa() {
		return adresa;
	}
	
	
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	
	public Korpa getKorpa() {
		return korpa;
	}
	
	
	public void setKorpa(Korpa korpa) {
		this.korpa = korpa;
	}
	   
	   

}