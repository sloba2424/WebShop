package model;


import java.util.*;


public class Tag {
   
   private String naziv;
   
   
   public java.util.Collection<Proizvod> proizvod;
   
   
   
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
      {
         this.proizvod.add(newProizvod);
         newProizvod.addTag(this);      
      }
   }
   
   
   public void removeProizvod(Proizvod oldProizvod) {
      if (oldProizvod == null)
         return;
      if (this.proizvod != null)
         if (this.proizvod.contains(oldProizvod))
         {
            this.proizvod.remove(oldProizvod);
            oldProizvod.removeTag(this);
         }
   }
   
   
   public void removeAllProizvod() {
      if (proizvod != null)
      {
         Proizvod oldProizvod;
         for (java.util.Iterator iter = getIteratorProizvod(); iter.hasNext();)
         {
            oldProizvod = (Proizvod)iter.next();
            iter.remove();
            oldProizvod.removeTag(this);
         }
      }
   }

}