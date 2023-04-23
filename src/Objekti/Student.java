package Objekti;

import java.util.SortedMap;

public class Student {
   public String ime, prezime;
   public int ocena;

   public Student(String ime, String prezime, int ocena) {
      this.ime = ime;
      this.prezime = prezime;
      this.ocena = ocena;
   }


   public String getIme() {
      return ime;
   }

   public void setIme(String ime) {
      this.ime = ime;
   }

   public String getPrezime() {
      return prezime;
   }

   public void setPrezime(String prezime) {
      this.prezime = prezime;
   }

   public int getOcena() {
      return ocena;
   }

   public void setOcena(int ocena) {
      this.ocena = ocena;
   }
   @Override
   public String toString() {
      return "Ime: " + ime + ", Prezime: " + prezime + ", Ocena: " + ocena;
   }
}