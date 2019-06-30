package model;


import java.io.Serializable;
import java.util.*;


public class Prodavnica implements Serializable {
   
   private String brojTelefona;
   
   private String naziv;
   
   private String adresa;
   
   private String eMail;
   
   
   public Mesto mesto;
   
   public StanjeProizvoda[] stanjeProizvoda;
   
   public Prodavnica() {
	   
   }

	public Prodavnica(String brojTelefona, String naziv, String adresa, String eMail, Mesto mesto) {
		super();
		this.brojTelefona = brojTelefona;
		this.naziv = naziv;
		this.adresa = adresa;
		this.eMail = eMail;
		this.mesto = mesto;
	}
	
	public Prodavnica(String brojTelefona, String naziv, String adresa, String eMail, Mesto mesto,
			StanjeProizvoda[] stanjeProizvoda) {
		super();
		this.brojTelefona = brojTelefona;
		this.naziv = naziv;
		this.adresa = adresa;
		this.eMail = eMail;
		this.mesto = mesto;
		this.stanjeProizvoda = stanjeProizvoda;
	}
	
	public String getBrojTelefona() {
		return brojTelefona;
	}
	
	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public String getAdresa() {
		return adresa;
	}
	
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	public String geteMail() {
		return eMail;
	}
	
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	public Mesto getMesto() {
		return mesto;
	}
	
	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}
	
	public StanjeProizvoda[] getStanjeProizvoda() {
		return stanjeProizvoda;
	}
	
	public void setStanjeProizvoda(StanjeProizvoda[] stanjeProizvoda) {
		this.stanjeProizvoda = stanjeProizvoda;
	}
	
	

   
   

}