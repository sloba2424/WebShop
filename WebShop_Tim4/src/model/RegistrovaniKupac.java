package model;

import java.io.Serializable;

public class RegistrovaniKupac extends Kupac implements Serializable {
   
   public KorisnickiNalog korisnickiNalog;
   
   public java.util.Collection<Proizvod> listaZelja;
   
   public java.util.Collection<Proizvod> preporuceniProizvodi;
   
   public java.util.Collection<Narudzbenica> narudzbenica;
   
   
   
   public RegistrovaniKupac() {
	super();
}
   
   


public RegistrovaniKupac(KorisnickiNalog korisnickiNalog) {
	super();
	this.korisnickiNalog = korisnickiNalog;
}




public KorisnickiNalog getKorisnickiNalog() {
	return korisnickiNalog;
   }


	public void setKorisnickiNalog(KorisnickiNalog korisnickiNalog) {
		this.korisnickiNalog = korisnickiNalog;
	}
	
	
	public java.util.Collection<Proizvod> getListaZelja() {
	      if (listaZelja == null)
	         listaZelja = new java.util.HashSet<Proizvod>();
	      return listaZelja;
	   }
	 
	   
	   public void setListaZelja(java.util.Collection<Proizvod> noviProizvod) {
	      obrisiSvePreporuceneProizvode();
	      for (java.util.Iterator iter = noviProizvod.iterator(); iter.hasNext();)
	         dodajListuZelja((Proizvod)iter.next());
	   }
	   
	   
	   public void dodajListuZelja(Proizvod noviProizvod) {
	      if (noviProizvod == null)
	         return;
	      if (this.listaZelja == null)
	         this.listaZelja = new java.util.HashSet<Proizvod>();
	      if (!this.listaZelja.contains(noviProizvod))
	         this.listaZelja.add(noviProizvod);
	   }
	   
	   
	   public void obrisiSaListeZelja(Proizvod proizvod) {
	      if (proizvod == null)
	         return;
	      if (this.listaZelja != null)
	         if (this.listaZelja.contains(proizvod))
	            this.listaZelja.remove(proizvod);
	   }
	   
	   
	   public void obrisiSveSaListeZelja() {
	      if (listaZelja != null)
	         listaZelja.clear();
	   }
	   
	   
	   public java.util.Collection<Proizvod> getPreporuceniProizvodi() {
	      if (preporuceniProizvodi == null)
	    	  preporuceniProizvodi = new java.util.HashSet<Proizvod>();
	      return preporuceniProizvodi;
	   }
	   
	   
	   public void setPreporuceniProizvodi(java.util.Collection<Proizvod> noviProizvod) {
	      obrisiSvePreporuceneProizvode();
	      for (java.util.Iterator iter = noviProizvod.iterator(); iter.hasNext();)
	         dodajPreporuceniProizvod((Proizvod)iter.next());
	   }
	   
	   
	   public void dodajPreporuceniProizvod(Proizvod noviProizvod) {
	      if (noviProizvod == null)
	         return;
	      if (this.preporuceniProizvodi == null)
	         this.preporuceniProizvodi = new java.util.HashSet<Proizvod>();
	      if (!this.preporuceniProizvodi.contains(noviProizvod))
	         this.preporuceniProizvodi.add(noviProizvod);
	   }
	   
	   
	   public void obrisiIzPreporucenihProizvoda(Proizvod proizvod) {
	      if (proizvod == null)
	         return;
	      if (this.preporuceniProizvodi != null)
	         if (this.preporuceniProizvodi.contains(proizvod))
	            this.preporuceniProizvodi.remove(proizvod);
	   }
	   
	   
	   public void obrisiSvePreporuceneProizvode() {
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
	   
	   
	   public void setNarudzbenica(java.util.Collection<Narudzbenica> novaNarudzbenica) {
	      obrisiSveNarudzbenice();
	      for (java.util.Iterator iter = novaNarudzbenica.iterator(); iter.hasNext();)
	         dodajNarudzbenicu((Narudzbenica)iter.next());
	   }
	   
	   
	   public void dodajNarudzbenicu(Narudzbenica novaNarudzbenica) {
	      if (novaNarudzbenica == null)
	         return;
	      if (this.narudzbenica == null)
	         this.narudzbenica = new java.util.HashSet<Narudzbenica>();
	      if (!this.narudzbenica.contains(novaNarudzbenica))
	      {
	         this.narudzbenica.add(novaNarudzbenica);
	         novaNarudzbenica.setRegistrovaniKupac(this);      
	      }
	   }
	   
	   
	   public void obrisiNarudzbenicu(Narudzbenica staraNarudzbenica) {
	      if (staraNarudzbenica == null)
	         return;
	      if (this.narudzbenica != null)
	         if (this.narudzbenica.contains(staraNarudzbenica))
	         {
	            this.narudzbenica.remove(staraNarudzbenica);
	            staraNarudzbenica.setRegistrovaniKupac((RegistrovaniKupac)null);
	         }
	   }
	   
	   
	   public void obrisiSveNarudzbenice() {
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