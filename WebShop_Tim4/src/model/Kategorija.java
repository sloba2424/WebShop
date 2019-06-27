package model;


import java.util.*;


public class Kategorija {
   
   private String naziv;
   
   
   public java.util.Collection<Kategorija>potkategorija;
   
   
   
   public java.util.Collection<Kategorija> getPotkategorija() {
      if (potkategorija == null)
         potkategorija = new java.util.HashSet<Kategorija>();
      return potkategorija;
   }
   

  /* public java.util.Iterator getIteratorPotkategorija() {
      if (potkategorija == null)
         potkategorija = new java.util.HashSet<Kategorija>();
      return potkategorija.iterator();
   }*/
   
   
   public void setPotkategorija(java.util.Collection<Kategorija> novaPotkategorija) {
      obrisiSvePotkategorije();
      for (java.util.Iterator iter = novaPotkategorija.iterator(); iter.hasNext();)
         dodajPotkategoriju((Kategorija)iter.next());
   }
   
   
   public void dodajPotkategoriju(Kategorija novaPotkategorija) {
      if (novaPotkategorija == null)
         return;
      if (this.potkategorija == null)
         this.potkategorija = new java.util.HashSet<Kategorija>();
      if (!this.potkategorija.contains(novaPotkategorija))
         this.potkategorija.add(novaPotkategorija);
   }
   
   
   public void obrisiPotkategoriju(Kategorija staraPotkategorija) {
      if (staraPotkategorija == null)
         return;
      if (this.potkategorija != null)
         if (this.potkategorija.contains(staraPotkategorija))
            this.potkategorija.remove(staraPotkategorija);
   }
   
   
   public void obrisiSvePotkategorije() {
      if (potkategorija != null)
         potkategorija.clear();
   }

}