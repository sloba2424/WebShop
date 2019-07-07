package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
		korisnickiNalog = new ArrayList<KorisnickiNalog>();
		proizvod = new ArrayList<Proizvod>();
		prodavnica = new ArrayList<Prodavnica>();
		ulogovan = null; //prvi korisnik je Guest
	}
	
	public static Aplikacija getInstance() { 
        if (single_instance == null) 
            single_instance = new Aplikacija(); 
  
        return single_instance; 
    }
	
	public ArrayList<Kupac> kupci;
	
   public ArrayList<KorisnickiNalog> korisnickiNalog;
   
   public ArrayList<Proizvod> proizvod;
   
   public ArrayList<Prodavnica> prodavnica;
   
   private Kupac ulogovan;
   
   
public ArrayList<Kupac> getKupci() {
	return kupci;
}

public void setKupci(ArrayList<Kupac> kupci) {
	this.kupci = kupci;
}

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
   
   public ArrayList<KorisnickiNalog> getKorisnickiNalog() {
      if (korisnickiNalog == null)
         korisnickiNalog = new ArrayList<KorisnickiNalog>();
      return korisnickiNalog;
   }
   
   
  /* public java.util.Iterator getIteratorKorisnickiNalog() {
      if (korisnickiNalog == null)
         korisnickiNalog = new java.util.HashSet<KorisnickiNalog>();
      return korisnickiNalog.iterator();
   }*/
   
   
   public void setKorisnickiNalog(ArrayList<KorisnickiNalog> noviKorisnickiNalog) {
      obrisiSveKorisnickeNaloge();
      for (java.util.Iterator iter = noviKorisnickiNalog.iterator(); iter.hasNext();)
         dodajKorisnickiNalog((KorisnickiNalog)iter.next());
   }
   
   
   public void dodajKupca(Kupac noviKupac) {
	      if (noviKupac == null)
	          return;
	       if (this.kupci == null)
	          this.kupci = new ArrayList<Kupac>();
	       if (!this.kupci.contains(noviKupac))
	       {
	          this.kupci.add(noviKupac);
	          try
	          {
	              FileOutputStream fos = new FileOutputStream("listaKupaca");
	              ObjectOutputStream oos = new ObjectOutputStream(fos);
	              oos.writeObject(kupci);
	              oos.close();
	              fos.close();
	          }
	          catch (IOException ioe)
	          {
	              ioe.printStackTrace();
	          }
	       }
   }
   
   public void dodajKorisnickiNalog(KorisnickiNalog noviKorisnickiNalog) {
      if (noviKorisnickiNalog == null)
         return;
      if (this.korisnickiNalog == null)
         this.korisnickiNalog = new ArrayList<KorisnickiNalog>();
  //    if (!this.korisnickiNalog.contains(noviKorisnickiNalog))
    //  {
         this.korisnickiNalog.add(noviKorisnickiNalog);
         try
         {
             FileOutputStream fos = new FileOutputStream("listaKorisnickihNaloga");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             oos.writeObject(korisnickiNalog);
             oos.close();
             fos.close();
         }
         catch (IOException ioe)
         {
             ioe.printStackTrace();
         }
    //  }
   }
   
   
   public void obrisiKorisnickiNalog(KorisnickiNalog stariKorisnickiNalog) {
      if (stariKorisnickiNalog == null)
         return;
      if (this.korisnickiNalog != null)
         if (this.korisnickiNalog.contains(stariKorisnickiNalog))
         {
            this.korisnickiNalog.remove(stariKorisnickiNalog);
            try
            {
                FileOutputStream fos = new FileOutputStream("listaKorisnickihNaloga");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(korisnickiNalog);
                oos.close();
                fos.close();
            }
            catch (IOException ioe)
            {
                ioe.printStackTrace();
            }
         }
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
      {
         this.proizvod.add(noviProizvod);
         try
         {
             FileOutputStream fos = new FileOutputStream("listaProizvoda");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             oos.writeObject(proizvod);
             oos.close();
             fos.close();
         }
         catch (IOException ioe)
         {
             ioe.printStackTrace();
         }
      }
   }
   
   
   public void obrisiProizvod(Proizvod stariProizvod) {
      if (stariProizvod == null)
         return;
      if (this.proizvod != null)
         if (this.proizvod.contains(stariProizvod))
         {
            this.proizvod.remove(stariProizvod);
            try
            {
                FileOutputStream fos = new FileOutputStream("listaProizvoda");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(proizvod);
                oos.close();
                fos.close();
            }
            catch (IOException ioe)
            {
                ioe.printStackTrace();
            }
         }
   }
   
   
   public void obrisiSveProizvode() {
      if (proizvod != null)
         proizvod.clear();
   }
   
   public java.util.Collection<Prodavnica> getProdavnica() {
      if (prodavnica == null)
         prodavnica = new ArrayList<Prodavnica>();
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
         this.prodavnica = new ArrayList<Prodavnica>();
      if (!this.prodavnica.contains(novaProdavnica))
      {
         this.prodavnica.add(novaProdavnica);
         try
         {
             FileOutputStream fos = new FileOutputStream("listaProdavnica");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             oos.writeObject(prodavnica);
             oos.close();
             fos.close();
         }
         catch (IOException ioe)
         {
             ioe.printStackTrace();
         }
      }
   }
   
   
   public void obrisiProdavnicu(Prodavnica staraProdavnica) {
      if (staraProdavnica == null)
         return;
      if (this.prodavnica != null)
         if (this.prodavnica.contains(staraProdavnica))
         {
            this.prodavnica.remove(staraProdavnica);
            try
            {
                FileOutputStream fos = new FileOutputStream("listaProdavnica");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(prodavnica);
                oos.close();
                fos.close();
            }
            catch (IOException ioe)
            {
                ioe.printStackTrace();
            }
         }
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
   
   
   public void ucitajKolekcije()
   {
	   File f1 = new File("listaProdavnica");
	   File f2 = new File("listaKorisnickihNaloga");
	   File f3 = new File("listaProizvoda");
	   File f4 = new File("listaKupaca");
	   if (f1.exists() && f2.exists() && f3.exists() && f4.exists())
	   {
	       try
	       {
	           FileInputStream fis = new FileInputStream("listaProdavnica");
	           FileInputStream fis2 = new FileInputStream("listaKorisnickihNaloga");
	           FileInputStream fis3 = new FileInputStream("listaProizvoda");
	           FileInputStream fis4 = new FileInputStream("listaKupaca");
	           ObjectInputStream ois = new ObjectInputStream(fis);
	           ObjectInputStream ois2 = new ObjectInputStream(fis2);
	           ObjectInputStream ois3 = new ObjectInputStream(fis3);
	           ObjectInputStream ois4 = new ObjectInputStream(fis4);
	
	           prodavnica = (ArrayList<Prodavnica>) ois.readObject();
	           proizvod = (ArrayList<Proizvod>) ois3.readObject();
	           korisnickiNalog = (ArrayList<KorisnickiNalog>) ois2.readObject();
	           kupci = (ArrayList<Kupac>) ois4.readObject();
	
	           ois.close();
	           ois2.close();
	           ois3.close();
	           ois4.close();
	           fis.close();
	           fis2.close();
	           fis3.close();
	           fis4.close();
	       }
	       catch (IOException ioe)
	       {
	           ioe.printStackTrace();
	           return;
	       }
	       catch (ClassNotFoundException c)
	       {
	           System.out.println("Class not found");
	           c.printStackTrace();
	           return;
	       }
	   }
	   
   }
   
   public KorisnickiNalog pronadjiNalog(String korisnicko, String sifra) {

	   
	   for (KorisnickiNalog kn : korisnickiNalog) {
		   if (kn.getKorisnickoIme().equals(korisnicko) && kn.getLozinka().equals(sifra))
			   return kn;
	   }
	   
	   return null;
   }

public Kupac getUlogovan() {
	return ulogovan;
}

public void setUlogovan(Kupac ulogovan) {
	this.ulogovan = ulogovan;
}



}