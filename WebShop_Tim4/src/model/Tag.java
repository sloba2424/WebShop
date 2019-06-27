package model;


import java.util.*;


public class Tag {
   
   private String naziv;
   
   
   public java.util.Collection<Proizvod> proizvod;
   
   
   public java.util.Collection<Proizvod> getProizvod() {
      if (proizvod == null)
         proizvod = new java.util.HashSet<Proizvod>();
      return proizvod;
   }
   
   
   public java.util.Iterator getIteratorProizvod() {
      if (proizvod == null)
         proizvod = new java.util.HashSet<Proizvod>();
      return proizvod.iterator();
   }
   
   
   public void setProizvod(java.util.Collection<Proizvod> noviProizvod) {
      obrisiSveProizvode();
      for (java.util.Iterator iter = noviProizvod.iterator(); iter.hasNext();)
         dodajProizvod((Proizvod)iter.next());
   }
   
   
   public void dodajProizvod(Proizvod noviProizvod) {
      if (noviProizvod == null)
         return;
      if (this.proizvod == null)
         this.proizvod = new java.util.HashSet<Proizvod>();
      if (!this.proizvod.contains(noviProizvod))
      {
         this.proizvod.add(noviProizvod);
         noviProizvod.dodajTag(this);      
      }
   }
   
   
   public void obrisiProizvod(Proizvod stariProizvod) {
      if (stariProizvod == null)
         return;
      if (this.proizvod != null)
         if (this.proizvod.contains(stariProizvod))
         {
            this.proizvod.remove(stariProizvod);
            stariProizvod.obrisiTag(this);
         }
   }
   
   
   public void obrisiSveProizvode() {
      if (proizvod != null)
      {
         Proizvod stariProizvod;
         for (java.util.Iterator iter = getIteratorProizvod(); iter.hasNext();)
         {
            stariProizvod = (Proizvod)iter.next();
            iter.remove();
            stariProizvod.obrisiTag(this);
         }
      }
   }

}