package com.mycompany.bankacibitir;

public class KrediDurumu {
  private boolean krediDurumu; // private = restricted access

  // Getter
  public boolean getKrediDurumu() {
    return krediDurumu;
  }

  // Setter
  public void setKrediDurumu(boolean krediDurumuNew) {
    this.krediDurumu = krediDurumuNew;
  }
}
