package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import komparatori.PoredjenjePoNazivuA_Z;
import komparatori.PoredjenjePoNazivuZ_A;

import model.TipKorisnika;

public class Aplikacija {
	
	private static Aplikacija single_instance = null; 
	
	private Aplikacija() {
		// TODO Auto-generated constructor stub
	}
	
	public static Aplikacija getInstance() { 
        if (single_instance == null) 
            single_instance = new Aplikacija(); 
  
        return single_instance; 
    }
	
	
   public ArrayList<KorisnickiNalog> korisnickiNalog;
   
   public ArrayList<Proizvod> proizvod;
   
   public java.util.Collection<Prodavnica> prodavnica;
   
   
   private void sortirajPoNazivuA_Z(){
	   
	   Collections.sort(proizvod, new PoredjenjePoNazivuA_Z());
	   
   }
   
	private void sortirajPoNazivuZ_A(){
		   
	   Collections.sort(proizvod, new PoredjenjePoNazivuZ_A());
		   
	}
   
	private static boolean validnaEAdresa(String eAdresa)
	{
		String emailRegex =  "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(emailRegex);
		if (eAdresa == null) 
	            return false; 
	    return p.matcher(eAdresa).matches(); 
	}
	
   public int registrovanje(String ime, String prezime, Pol p, String nazivMesta, String pttBroj, String adresa, String korisnickoIme, String lozinka, String ponovljenaLozinka, String eAdresa)
   {
	   for(KorisnickiNalog nalog : korisnickiNalog)
	   {
		   if(nalog.getKorisnickoIme() == korisnickoIme)
			   return 1; //Korisnicko ime vec postoji
	   }
	   if(lozinka != ponovljenaLozinka)
	   {
		   return 2; //Ponovljena lozinka nije ista
	   }
	   else if(!validnaEAdresa(eAdresa))
	   {
		   return 3; //Nepravilna e-mail adresa
	   }
	   else
	   {
		   KorisnickiNalog nalog = new KorisnickiNalog();
		   nalog.setKorisnickoIme(korisnickoIme);
		   nalog.setLozinka(lozinka);
		   nalog.setVrstaKorisnika(TipKorisnika.registrovaniKupac);
		   
		   Mesto mesto = new Mesto(nazivMesta, pttBroj);
		   nalog.setMesto(mesto);
		   
		   nalog.registrovaniKupac.setIme(ime);
		   nalog.registrovaniKupac.setPrezime(prezime);
		   nalog.registrovaniKupac.setPol(p);
		   nalog.registrovaniKupac.setAdresa(adresa);
		   nalog.registrovaniKupac.seteAdresa(eAdresa);
		   nalog.registrovaniKupac.setKorisnickiNalog(nalog);
		   
		   dodajKorisnickiNalog(nalog);
		   
	   }
	   return 0; //Sve je ispravno uneseno
   }
   
   public java.util.Collection<KorisnickiNalog> getKorisnickiNalog() {
      if (korisnickiNalog == null)
         korisnickiNalog = new ArrayList();
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
         this.korisnickiNalog = new ArrayList();
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
   
   List<Proizvod> pronadjiProizvode(String tekstPretrage, List<Tag> tagovi)
   {
	   List<Proizvod> pronadjeniProizvodi = new ArrayList<Proizvod>();
	   for (Proizvod p : proizvod)
	   {
		   /*
		    * Za sada jednostavna pretraga koja proveri da li je naziv proizvoda bar 30% slican sa tekstom pretrage i sadrzi zadate tagove.
		    * Pitati profesoricu da li treba i neki kompleksniji search ili ne, posto je ovo ipak samo prototip.
		    */
		   if (Util.similarity(p.getNaziv(), tekstPretrage) > 0.3 && Util.proveriTagove(p.getTag(), tagovi))
		   {
			   pronadjeniProizvodi.add(p);
		   }
	   }
	   
	   return pronadjeniProizvodi;
   }



}