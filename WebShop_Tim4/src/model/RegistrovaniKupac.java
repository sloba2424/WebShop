package model;



public class RegistrovaniKupac extends Kupac {
   
   public KorisnickiNalog korisnickiNalog;
   
   public java.util.Collection<Proizvod> listaZelja;
   
   public java.util.Collection<Proizvod> preporuceniProizvodi;
   
   public java.util.Collection<Narudzbenica> narudzbenica;
   
   
   
   public java.util.Collection<Proizvod> getListaZelja() {
      if (listaZelja == null)
         listaZelja = new java.util.HashSet<Proizvod>();
      return listaZelja;
   }
   

   
   
   public void setListaZelja(java.util.Collection<Proizvod> newProizvod) {
      removeAllPreporuceniProizvodi();
      for (java.util.Iterator iter = newProizvod.iterator(); iter.hasNext();)
         addListaZelja((Proizvod)iter.next());
   }
   
   
   public void addListaZelja(Proizvod newProizvod) {
      if (newProizvod == null)
         return;
      if (this.listaZelja == null)
         this.listaZelja = new java.util.HashSet<Proizvod>();
      if (!this.listaZelja.contains(newProizvod))
         this.listaZelja.add(newProizvod);
   }
   
   
   public void removeListaZelja(Proizvod oldProizvod) {
      if (oldProizvod == null)
         return;
      if (this.listaZelja != null)
         if (this.listaZelja.contains(oldProizvod))
            this.listaZelja.remove(oldProizvod);
   }
   
   
   public void removeAllListaZelja() {
      if (listaZelja != null)
         listaZelja.clear();
   }
   
   public java.util.Collection<Proizvod> getPreporuceniProizvodi() {
      if (preporuceniProizvodi == null)
    	  preporuceniProizvodi = new java.util.HashSet<Proizvod>();
      return preporuceniProizvodi;
   }
   
 
   
   
   public void setPreporuceniProizvodi(java.util.Collection<Proizvod> newProizvod) {
      removeAllPreporuceniProizvodi();
      for (java.util.Iterator iter = newProizvod.iterator(); iter.hasNext();)
         addPreporuceniProizvodi((Proizvod)iter.next());
   }
   
   
   public void addPreporuceniProizvodi(Proizvod newProizvod) {
      if (newProizvod == null)
         return;
      if (this.preporuceniProizvodi == null)
         this.preporuceniProizvodi = new java.util.HashSet<Proizvod>();
      if (!this.preporuceniProizvodi.contains(newProizvod))
         this.preporuceniProizvodi.add(newProizvod);
   }
   
   
   public void removePreporuceniProizvodi(Proizvod oldProizvod) {
      if (oldProizvod == null)
         return;
      if (this.preporuceniProizvodi != null)
         if (this.preporuceniProizvodi.contains(oldProizvod))
            this.preporuceniProizvodi.remove(oldProizvod);
   }
   
   
   public void removeAllPreporuceniProizvodi() {
      if (preporuceniProizvodi != null)
    	  preporuceniProizvodi.clear();
   }
   
   public java.util.Collection<Narudzbenica> getNarudzbenica() {
      if (narudzbenica == null)
         narudzbenica = new java.util.HashSet<Narudzbenica>();
      return narudzbenica;
   }
   
   
   public java.util.Iterator getIteratorNarudzbenica() {
      if (narudzbenica == null)
         narudzbenica = new java.util.HashSet<Narudzbenica>();
      return narudzbenica.iterator();
   }
   
   
   public void setNarudzbenica(java.util.Collection<Narudzbenica> newNarudzbenica) {
      removeAllNarudzbenica();
      for (java.util.Iterator iter = newNarudzbenica.iterator(); iter.hasNext();)
         addNarudzbenica((Narudzbenica)iter.next());
   }
   
   
   public void addNarudzbenica(Narudzbenica newNarudzbenica) {
      if (newNarudzbenica == null)
         return;
      if (this.narudzbenica == null)
         this.narudzbenica = new java.util.HashSet<Narudzbenica>();
      if (!this.narudzbenica.contains(newNarudzbenica))
      {
         this.narudzbenica.add(newNarudzbenica);
         newNarudzbenica.setRegistrovaniKupac(this);      
      }
   }
   
   
   public void removeNarudzbenica(Narudzbenica oldNarudzbenica) {
      if (oldNarudzbenica == null)
         return;
      if (this.narudzbenica != null)
         if (this.narudzbenica.contains(oldNarudzbenica))
         {
            this.narudzbenica.remove(oldNarudzbenica);
            oldNarudzbenica.setRegistrovaniKupac((RegistrovaniKupac)null);
         }
   }
   
   
   public void removeAllNarudzbenica() {
      if (narudzbenica != null)
      {
         Narudzbenica oldNarudzbenica;
         for (java.util.Iterator iter = getIteratorNarudzbenica(); iter.hasNext();)
         {
            oldNarudzbenica = (Narudzbenica)iter.next();
            iter.remove();
            oldNarudzbenica.setRegistrovaniKupac((RegistrovaniKupac)null);
         }
      }
   }

}