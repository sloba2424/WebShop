package model;


import java.util.*;


public class Mesto {
   
   private String naziv;
   
   private String pttBroj;

   public Mesto(){
   }
	
	public Mesto(String nazivMesta, String pttBroj2) {
		this.naziv = nazivMesta;
		this.pttBroj = pttBroj2;
	}

	public String getNaziv() {
		return naziv;
	}
	
	public void setNazivMesta(String naziv) {
		this.naziv = naziv;
	}
	
	public String getPttBroj() {
		return pttBroj;
	}
	
	public void setPttBroj(String pttBroj) {
		this.pttBroj = pttBroj;
	}
      

}