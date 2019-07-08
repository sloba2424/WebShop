package model;


import java.util.*;


public class Narudzbenica extends Korpa {
   
   private int broj;
   
   private int datum;
   
   private int adresaIsporuke;
   
   private NacinPlacanja nacinPlacanja;
   
   private String ime;
   
   private String prezime;
   
   
   public Stanje stanje = new Placanje();
   
   
   
   public RegistrovaniKupac registrovaniKupac;
   
   public void prikaziStanje() {
	   System.out.println("Naruzbenica je u stanju: " +stanje.toString());
		
   }
   
   public void zabranaPromeneSadrzaja() {
      // TODO: implement
   }
   
   
   public void slanjeRobe() {
      // TODO: implement
   }
   
   
   public void obavljenoPlacanje() {
      // TODO: implement
   }
   
   
   public void otkazanoPlacanje() {
      // TODO: implement
   }
   
   
   
   public RegistrovaniKupac getRegistrovaniKupac() {
      return registrovaniKupac;
   }
   
   
   public void setRegistrovaniKupac(RegistrovaniKupac noviRegistrovaniKupac) {
      if (this.registrovaniKupac == null || !this.registrovaniKupac.equals(noviRegistrovaniKupac))
      {
         if (this.registrovaniKupac != null)
         {
            RegistrovaniKupac stariRegistrovaniKupac = this.registrovaniKupac;
            this.registrovaniKupac = null;
            stariRegistrovaniKupac.obrisiNarudzbenicu(this);
         }
         if (noviRegistrovaniKupac != null)
         {
            this.registrovaniKupac = noviRegistrovaniKupac;
            this.registrovaniKupac.dodajNarudzbenicu(this);
         }
      }
   }

}