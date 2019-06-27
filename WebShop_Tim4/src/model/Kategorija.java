package model;


import java.util.*;


public class Kategorija {
   
   private String naziv;
   
   
   public java.util.Collection<Kategorija> kategorijaB;
   
   
   
   public java.util.Collection<Kategorija> getKategorijaB() {
      if (kategorijaB == null)
         kategorijaB = new java.util.HashSet<Kategorija>();
      return kategorijaB;
   }
   
   
   public java.util.Iterator getIteratorKategorijaB() {
      if (kategorijaB == null)
         kategorijaB = new java.util.HashSet<Kategorija>();
      return kategorijaB.iterator();
   }
   
   
   public void setKategorijaB(java.util.Collection<Kategorija> newKategorijaB) {
      removeAllKategorijaB();
      for (java.util.Iterator iter = newKategorijaB.iterator(); iter.hasNext();)
         addKategorijaB((Kategorija)iter.next());
   }
   
   
   public void addKategorijaB(Kategorija newKategorija) {
      if (newKategorija == null)
         return;
      if (this.kategorijaB == null)
         this.kategorijaB = new java.util.HashSet<Kategorija>();
      if (!this.kategorijaB.contains(newKategorija))
         this.kategorijaB.add(newKategorija);
   }
   
   
   public void removeKategorijaB(Kategorija oldKategorija) {
      if (oldKategorija == null)
         return;
      if (this.kategorijaB != null)
         if (this.kategorijaB.contains(oldKategorija))
            this.kategorijaB.remove(oldKategorija);
   }
   
   
   public void removeAllKategorijaB() {
      if (kategorijaB != null)
         kategorijaB.clear();
   }

}