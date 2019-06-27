package model;


import java.util.*;


public class Aplikacija {
   
   public java.util.Collection<KorisnickiNalog> korisnickiNalog;
   
   public java.util.Collection<Proizvod> proizvod;
   
   public java.util.Collection<Prodavnica> prodavnica;
   
   
   
   public java.util.Collection<KorisnickiNalog> getKorisnickiNalog() {
      if (korisnickiNalog == null)
         korisnickiNalog = new java.util.HashSet<KorisnickiNalog>();
      return korisnickiNalog;
   }
   
   
   public java.util.Iterator getIteratorKorisnickiNalog() {
      if (korisnickiNalog == null)
         korisnickiNalog = new java.util.HashSet<KorisnickiNalog>();
      return korisnickiNalog.iterator();
   }
   
   
   public void setKorisnickiNalog(java.util.Collection<KorisnickiNalog> newKorisnickiNalog) {
      removeAllKorisnickiNalog();
      for (java.util.Iterator iter = newKorisnickiNalog.iterator(); iter.hasNext();)
         addKorisnickiNalog((KorisnickiNalog)iter.next());
   }
   
   
   public void addKorisnickiNalog(KorisnickiNalog newKorisnickiNalog) {
      if (newKorisnickiNalog == null)
         return;
      if (this.korisnickiNalog == null)
         this.korisnickiNalog = new java.util.HashSet<KorisnickiNalog>();
      if (!this.korisnickiNalog.contains(newKorisnickiNalog))
         this.korisnickiNalog.add(newKorisnickiNalog);
   }
   
   
   public void removeKorisnickiNalog(KorisnickiNalog oldKorisnickiNalog) {
      if (oldKorisnickiNalog == null)
         return;
      if (this.korisnickiNalog != null)
         if (this.korisnickiNalog.contains(oldKorisnickiNalog))
            this.korisnickiNalog.remove(oldKorisnickiNalog);
   }
   
   
   public void removeAllKorisnickiNalog() {
      if (korisnickiNalog != null)
         korisnickiNalog.clear();
   }
   
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
   
   
   public void setProizvod(java.util.Collection<Proizvod> newProizvod) {
      removeAllProizvod();
      for (java.util.Iterator iter = newProizvod.iterator(); iter.hasNext();)
         addProizvod((Proizvod)iter.next());
   }
   
   
   public void addProizvod(Proizvod newProizvod) {
      if (newProizvod == null)
         return;
      if (this.proizvod == null)
         this.proizvod = new java.util.HashSet<Proizvod>();
      if (!this.proizvod.contains(newProizvod))
         this.proizvod.add(newProizvod);
   }
   
   
   public void removeProizvod(Proizvod oldProizvod) {
      if (oldProizvod == null)
         return;
      if (this.proizvod != null)
         if (this.proizvod.contains(oldProizvod))
            this.proizvod.remove(oldProizvod);
   }
   
   
   public void removeAllProizvod() {
      if (proizvod != null)
         proizvod.clear();
   }
   
   public java.util.Collection<Prodavnica> getProdavnica() {
      if (prodavnica == null)
         prodavnica = new java.util.HashSet<Prodavnica>();
      return prodavnica;
   }
   
   
   public java.util.Iterator getIteratorProdavnica() {
      if (prodavnica == null)
         prodavnica = new java.util.HashSet<Prodavnica>();
      return prodavnica.iterator();
   }
   
   
   public void setProdavnica(java.util.Collection<Prodavnica> newProdavnica) {
      removeAllProdavnica();
      for (java.util.Iterator iter = newProdavnica.iterator(); iter.hasNext();)
         addProdavnica((Prodavnica)iter.next());
   }
   
   
   public void addProdavnica(Prodavnica newProdavnica) {
      if (newProdavnica == null)
         return;
      if (this.prodavnica == null)
         this.prodavnica = new java.util.HashSet<Prodavnica>();
      if (!this.prodavnica.contains(newProdavnica))
         this.prodavnica.add(newProdavnica);
   }
   
   
   public void removeProdavnica(Prodavnica oldProdavnica) {
      if (oldProdavnica == null)
         return;
      if (this.prodavnica != null)
         if (this.prodavnica.contains(oldProdavnica))
            this.prodavnica.remove(oldProdavnica);
   }
   
   
   public void removeAllProdavnica() {
      if (prodavnica != null)
         prodavnica.clear();
   }

}