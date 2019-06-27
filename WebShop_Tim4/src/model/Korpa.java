package model;


import java.util.*;


public class Korpa {
   
   public java.util.Collection<StavkaKorpe> stavkaKorpe;
   
   
   public void formirajNarudzbenicu() {
      // TODO: implement
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

}