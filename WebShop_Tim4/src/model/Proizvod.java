package model;


import java.util.*;


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
   
   
   public void setTag(java.util.Collection<Tag> newTag) {
      removeAllTag();
      for (java.util.Iterator iter = newTag.iterator(); iter.hasNext();)
         addTag((Tag)iter.next());
   }
   
   
   public void addTag(Tag newTag) {
      if (newTag == null)
         return;
      if (this.tag == null)
         this.tag = new java.util.HashSet<Tag>();
      if (!this.tag.contains(newTag))
      {
         this.tag.add(newTag);
         newTag.addProizvod(this);      
      }
   }
   
   
   public void removeTag(Tag oldTag) {
      if (oldTag == null)
         return;
      if (this.tag != null)
         if (this.tag.contains(oldTag))
         {
            this.tag.remove(oldTag);
            oldTag.removeProizvod(this);
         }
   }
   
   
   public void removeAllTag() {
      if (tag != null)
      {
         Tag oldTag;
         for (java.util.Iterator iter = getIteratorTag(); iter.hasNext();)
         {
            oldTag = (Tag)iter.next();
            iter.remove();
            oldTag.removeProizvod(this);
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
   
   
   public void setStavkaKorpe(java.util.Collection<StavkaKorpe> newStavkaKorpe) {
      removeAllStavkaKorpe();
      for (java.util.Iterator iter = newStavkaKorpe.iterator(); iter.hasNext();)
         addStavkaKorpe((StavkaKorpe)iter.next());
   }
   
   
   public void addStavkaKorpe(StavkaKorpe newStavkaKorpe) {
      if (newStavkaKorpe == null)
         return;
      if (this.stavkaKorpe == null)
         this.stavkaKorpe = new java.util.HashSet<StavkaKorpe>();
      if (!this.stavkaKorpe.contains(newStavkaKorpe))
         this.stavkaKorpe.add(newStavkaKorpe);
   }
   
   
   public void removeStavkaKorpe(StavkaKorpe oldStavkaKorpe) {
      if (oldStavkaKorpe == null)
         return;
      if (this.stavkaKorpe != null)
         if (this.stavkaKorpe.contains(oldStavkaKorpe))
            this.stavkaKorpe.remove(oldStavkaKorpe);
   }
   
   
   public void removeAllStavkaKorpe() {
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
   
   
   public void setKategorija(java.util.Collection<Kategorija> newKategorija) {
      removeAllKategorija();
      for (java.util.Iterator iter = newKategorija.iterator(); iter.hasNext();)
         addKategorija((Kategorija)iter.next());
   }
   
   
   public void addKategorija(Kategorija newKategorija) {
      if (newKategorija == null)
         return;
      if (this.kategorija == null)
         this.kategorija = new java.util.HashSet<Kategorija>();
      if (!this.kategorija.contains(newKategorija))
         this.kategorija.add(newKategorija);
   }
   
   
   public void removeKategorija(Kategorija oldKategorija) {
      if (oldKategorija == null)
         return;
      if (this.kategorija != null)
         if (this.kategorija.contains(oldKategorija))
            this.kategorija.remove(oldKategorija);
   }
   
   
   public void removeAllKategorija() {
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
   
   
   public void setStanjeProizvoda(java.util.Collection<StanjeProizvoda> newStanjeProizvoda) {
      removeAllStanjeProizvoda();
      for (java.util.Iterator iter = newStanjeProizvoda.iterator(); iter.hasNext();)
         addStanjeProizvoda((StanjeProizvoda)iter.next());
   }
   
   
   public void addStanjeProizvoda(StanjeProizvoda newStanjeProizvoda) {
      if (newStanjeProizvoda == null)
         return;
      if (this.stanjeProizvoda == null)
         this.stanjeProizvoda = new java.util.HashSet<StanjeProizvoda>();
      if (!this.stanjeProizvoda.contains(newStanjeProizvoda))
         this.stanjeProizvoda.add(newStanjeProizvoda);
   }
   
   
   public void removeStanjeProizvoda(StanjeProizvoda oldStanjeProizvoda) {
      if (oldStanjeProizvoda == null)
         return;
      if (this.stanjeProizvoda != null)
         if (this.stanjeProizvoda.contains(oldStanjeProizvoda))
            this.stanjeProizvoda.remove(oldStanjeProizvoda);
   }
   
   
   public void removeAllStanjeProizvoda() {
      if (stanjeProizvoda != null)
         stanjeProizvoda.clear();
   }

}