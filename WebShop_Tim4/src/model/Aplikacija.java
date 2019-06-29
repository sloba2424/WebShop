package model;

import java.util.ArrayList;
import java.util.Collections;

import komparatori.PoredjenjePoCeniOpadajuce;
import komparatori.PoredjenjePoCeniRastuce;
import komparatori.PoredjenjePoNazivuA_Z;
import komparatori.PoredjenjePoNazivuZ_A;

public class Aplikacija {
	
   public java.util.Collection<KorisnickiNalog> korisnickiNalog;
   
   public ArrayList<Proizvod> proizvod;
   
   public java.util.Collection<Prodavnica> prodavnica;
   
   private void sortirajPoNazivuA_Z(){
	   
	   Collections.sort(proizvod, new PoredjenjePoNazivuA_Z());
	   
   }
   
	private void sortirajPoNazivuZ_A(){
		   
	   Collections.sort(proizvod, new PoredjenjePoNazivuZ_A());
		   
	}
	
	private void sortirajPoCeniRastuce() {
		Collections.sort(proizvod, new PoredjenjePoCeniRastuce());
	}
	
	private void sortirajPoCeniOpadajuce() {
		Collections.sort(proizvod, new PoredjenjePoCeniOpadajuce());
	}
   
   
   public java.util.Collection<KorisnickiNalog> getKorisnickiNalog() {
      if (korisnickiNalog == null)
         korisnickiNalog = new java.util.HashSet<KorisnickiNalog>();
      return korisnickiNalog;
   }
   
   
  /* public java.util.Iterator getIteratorKorisnickiNalog() {
      if (korisnickiNalog == null)
         korisnickiNalog = new java.util.HashSet<KorisnickiNalog>();
      return korisnickiNalog.iterator();
   }*/
   
   
   public void setKorisnickiNalog(java.util.Collection<KorisnickiNalog> noviKorisnickiNalog) {
      obrisiSveKorisnickeNaloge();
      for (java.util.Iterator iter = noviKorisnickiNalog.iterator(); iter.hasNext();)
         dodajKorisnickiNalog((KorisnickiNalog)iter.next());
   }
   
   
   public void dodajKorisnickiNalog(KorisnickiNalog noviKorisnickiNalog) {
      if (noviKorisnickiNalog == null)
         return;
      if (this.korisnickiNalog == null)
         this.korisnickiNalog = new java.util.HashSet<KorisnickiNalog>();
      if (!this.korisnickiNalog.contains(noviKorisnickiNalog))
         this.korisnickiNalog.add(noviKorisnickiNalog);
   }
   
   
   public void obrisiKorisnickiNalog(KorisnickiNalog stariKorisnickiNalog) {
      if (stariKorisnickiNalog == null)
         return;
      if (this.korisnickiNalog != null)
         if (this.korisnickiNalog.contains(stariKorisnickiNalog))
            this.korisnickiNalog.remove(stariKorisnickiNalog);
   }
   
   
   public void obrisiSveKorisnickeNaloge() {
      if (korisnickiNalog != null)
         korisnickiNalog.clear();
   }
   
   public java.util.Collection<Proizvod> getProizvod() {
      if (proizvod == null)
         proizvod = new ArrayList();
      return proizvod;
   }
   
   
  /* public java.util.Iterator getIteratorProizvod() {
      if (proizvod == null)
         proizvod = new java.util.HashSet<Proizvod>();
      return proizvod.iterator();
   }*/
   
   
   public void setProizvod(java.util.Collection<Proizvod> noviProizvod) {
      obrisiSveProizvode();
      for (java.util.Iterator iter = noviProizvod.iterator(); iter.hasNext();)
         dodajProizvod((Proizvod)iter.next());
   }
   
   
   public void dodajProizvod(Proizvod noviProizvod) {
      if (noviProizvod == null)
         return;
      if (this.proizvod == null)
         this.proizvod = new ArrayList();
      if (!this.proizvod.contains(noviProizvod))
         this.proizvod.add(noviProizvod);
   }
   
   
   public void obrisiProizvod(Proizvod stariProizvod) {
      if (stariProizvod == null)
         return;
      if (this.proizvod != null)
         if (this.proizvod.contains(stariProizvod))
            this.proizvod.remove(stariProizvod);
   }
   
   
   public void obrisiSveProizvode() {
      if (proizvod != null)
         proizvod.clear();
   }
   
   public java.util.Collection<Prodavnica> getProdavnica() {
      if (prodavnica == null)
         prodavnica = new java.util.HashSet<Prodavnica>();
      return prodavnica;
   }
   
   
 /*  public java.util.Iterator getIteratorProdavnica() {
      if (prodavnica == null)
         prodavnica = new java.util.HashSet<Prodavnica>();
      return prodavnica.iterator();
   }*/
   
   
   public void setProdavnica(java.util.Collection<Prodavnica> novaProdavnica) {
      obrisiSveProdavnice();
      for (java.util.Iterator iter = novaProdavnica.iterator(); iter.hasNext();)
         dodajProdavnicu((Prodavnica)iter.next());
   }
   
   
   public void dodajProdavnicu(Prodavnica novaProdavnica) {
      if (novaProdavnica == null)
         return;
      if (this.prodavnica == null)
         this.prodavnica = new java.util.HashSet<Prodavnica>();
      if (!this.prodavnica.contains(novaProdavnica))
         this.prodavnica.add(novaProdavnica);
   }
   
   
   public void obrisiProdavnicu(Prodavnica staraProdavnica) {
      if (staraProdavnica == null)
         return;
      if (this.prodavnica != null)
         if (this.prodavnica.contains(staraProdavnica))
            this.prodavnica.remove(staraProdavnica);
   }
   
   
   public void obrisiSveProdavnice() {
      if (prodavnica != null)
         prodavnica.clear();
   }

}