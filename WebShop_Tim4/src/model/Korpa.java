package model;


import java.io.Serializable;
import java.util.*;


public class Korpa implements Serializable {
   
   public java.util.Collection<StavkaKorpe> stavkaKorpe;
   
   
   public void formirajNarudzbenicu() {
      // TODO: implement
   }
   
   
   
   public java.util.Collection<StavkaKorpe> getStavkaKorpe() {
      if (stavkaKorpe == null)
         stavkaKorpe = new java.util.HashSet<StavkaKorpe>();
      return stavkaKorpe;
   }
   
   
 /*  public java.util.Iterator getIteratorStavkaKorpe() {
      if (stavkaKorpe == null)
         stavkaKorpe = new java.util.HashSet<StavkaKorpe>();
      return stavkaKorpe.iterator();
   }*/
   
   
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
   
   
   public void obrisiStavkaKorpe(StavkaKorpe staraStavkaKorpe) {
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

}