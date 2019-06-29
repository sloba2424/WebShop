package model;

import java.util.ArrayList;

public class Proizvod {
   
   private String idAritkla;
   
   private String naziv;
   
   private String opis;
   
   private String velicina;
   
   private Boja boja;
   
   
   
   public java.util.Collection<Tag> tag;
   
   public java.util.Collection<StavkaKorpe> stavkaKorpe;
   
   public java.util.Collection<Kategorija> kategorija;
   
   public java.util.Collection<StanjeProizvoda> stanjeProizvoda;
   
   public ArrayList<StavkaCennovnika> stavkeCenovnika;
   
   public int getCena() {  //zadnja dodata stavkaCenovnika u listi sadrzi aktuelnu cenu
	   int cena = stavkeCenovnika.get(stavkeCenovnika.size()-1).getJedinicnaCena();
	   return cena;
   }
   
   
   
   public java.util.Collection<Tag> getTag() {
      if (tag == null)
         tag = new java.util.HashSet<Tag>();
      return tag;
   }
   
   
   public java.util.Iterator getIteratorTag() {
      if (tag == null)
         tag = new java.util.HashSet<Tag>();
      return tag.iterator();
   }
   
   
   public void setTag(java.util.Collection<Tag> noviTag) {
      obrisiSveTagove();
      for (java.util.Iterator iter = noviTag.iterator(); iter.hasNext();)
         dodajTag((Tag)iter.next());
   }
   
   
   public void dodajTag(Tag noviTag) {
      if (noviTag == null)
         return;
      if (this.tag == null)
         this.tag = new java.util.HashSet<Tag>();
      if (!this.tag.contains(noviTag))
      {
         this.tag.add(noviTag);
         noviTag.dodajProizvod(this);      
      }
   }
   
   
   public void obrisiTag(Tag stariTag) {
      if (stariTag == null)
         return;
      if (this.tag != null)
         if (this.tag.contains(stariTag))
         {
            this.tag.remove(stariTag);
            stariTag.obrisiProizvod(this);
         }
   }
   
   
   public void obrisiSveTagove() {
      if (tag != null)
      {
         Tag oldTag;
         for (java.util.Iterator iter = getIteratorTag(); iter.hasNext();)
         {
            oldTag = (Tag)iter.next();
            iter.remove();
            oldTag.obrisiProizvod(this);
         }
      }
   }
   
   public java.util.Collection<StavkaKorpe> getStavkaKorpe() {
      if (stavkaKorpe == null)
         stavkaKorpe = new java.util.HashSet<StavkaKorpe>();
      return stavkaKorpe;
   }
   
   
   public java.util.Iterator getIteratorStavkaKorpe() {
      if (stavkaKorpe == null)
         stavkaKorpe = new java.util.HashSet<StavkaKorpe>();
      return stavkaKorpe.iterator();
   }
   
   
   public void setStavkaKorpe(java.util.Collection<StavkaKorpe> novaStavkaKorpe) {
      obrisiSveStavkeKorpe();
      for (java.util.Iterator iter = novaStavkaKorpe.iterator(); iter.hasNext();)
         dodajStavkuKorpe((StavkaKorpe)iter.next());
   }
   
   
   public void dodajStavkuKorpe(StavkaKorpe novaStavkaKorpe) {
      if (novaStavkaKorpe == null)
         return;
      if (this.stavkaKorpe == null)
         this.stavkaKorpe = new java.util.HashSet<StavkaKorpe>();
      if (!this.stavkaKorpe.contains(novaStavkaKorpe))
         this.stavkaKorpe.add(novaStavkaKorpe);
   }
   
   
   public void obrisiStavkuKorpe(StavkaKorpe staraStavkaKorpe) {
      if (staraStavkaKorpe == null)
         return;
      if (this.stavkaKorpe != null)
         if (this.stavkaKorpe.contains(staraStavkaKorpe))
            this.stavkaKorpe.remove(staraStavkaKorpe);
   }
   
   
   public void obrisiSveStavkeKorpe() {
      if (stavkaKorpe != null)
         stavkaKorpe.clear();
   }
   
   public java.util.Collection<Kategorija> getKategorija() {
      if (kategorija == null)
         kategorija = new java.util.HashSet<Kategorija>();
      return kategorija;
   }
   
   
   public java.util.Iterator getIteratorKategorija() {
      if (kategorija == null)
         kategorija = new java.util.HashSet<Kategorija>();
      return kategorija.iterator();
   }
   
   
   public void setKategorija(java.util.Collection<Kategorija> novaKategorija) {
      obrisiSveKategorije();
      for (java.util.Iterator iter = novaKategorija.iterator(); iter.hasNext();)
         dodajKategoriju((Kategorija)iter.next());
   }
   
   
   public void dodajKategoriju(Kategorija novaKategorija) {
      if (novaKategorija == null)
         return;
      if (this.kategorija == null)
         this.kategorija = new java.util.HashSet<Kategorija>();
      if (!this.kategorija.contains(novaKategorija))
         this.kategorija.add(novaKategorija);
   }
   
   
   public void obrisiKategoriju(Kategorija staraKategorija) {
      if (staraKategorija == null)
         return;
      if (this.kategorija != null)
         if (this.kategorija.contains(staraKategorija))
            this.kategorija.remove(staraKategorija);
   }
   
   
   public void obrisiSveKategorije() {
      if (kategorija != null)
         kategorija.clear();
   }
   
   public java.util.Collection<StanjeProizvoda> getStanjeProizvoda() {
      if (stanjeProizvoda == null)
         stanjeProizvoda = new java.util.HashSet<StanjeProizvoda>();
      return stanjeProizvoda;
   }
   
   
   public java.util.Iterator getIteratorStanjeProizvoda() {
      if (stanjeProizvoda == null)
         stanjeProizvoda = new java.util.HashSet<StanjeProizvoda>();
      return stanjeProizvoda.iterator();
   }
   
   
   public void setStanjeProizvoda(java.util.Collection<StanjeProizvoda> novoStanjeProizvoda) {
      obrisiSvaStanjaProizvoda();
      for (java.util.Iterator iter = novoStanjeProizvoda.iterator(); iter.hasNext();)
         dodajStanjeProizvoda((StanjeProizvoda)iter.next());
   }
   
   
   public void dodajStanjeProizvoda(StanjeProizvoda novoStanjeProizvoda) {
      if (novoStanjeProizvoda == null)
         return;
      if (this.stanjeProizvoda == null)
         this.stanjeProizvoda = new java.util.HashSet<StanjeProizvoda>();
      if (!this.stanjeProizvoda.contains(novoStanjeProizvoda))
         this.stanjeProizvoda.add(novoStanjeProizvoda);
   }
   
   
   public void obrisiStanjeProizvoda(StanjeProizvoda staroStanjeProizvoda) {
      if (staroStanjeProizvoda == null)
         return;
      if (this.stanjeProizvoda != null)
         if (this.stanjeProizvoda.contains(staroStanjeProizvoda))
            this.stanjeProizvoda.remove(staroStanjeProizvoda);
   }
   
   
   public void obrisiSvaStanjaProizvoda() {
      if (stanjeProizvoda != null)
         stanjeProizvoda.clear();
   }


public String getNaziv() {
	return naziv;
}


public void setNaziv(String naziv) {
	this.naziv = naziv;
}

}