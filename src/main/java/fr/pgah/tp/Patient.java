package fr.pgah.tp;

public class Patient {

  private double poids;
  private double taille;

  public Patient(double poids, double taille) {
    if (poids <= 0 || taille <= 0) {
      this.poids = 0;
      this.taille = 0;
    } else {
      this.poids = poids;
      this.taille = taille;
    }
  }

  public double calculerIMC() {
    if (taille == 0)
      return 0;
    double imc = poids / (taille * taille);
    return imc;
  }

  public String caractéristiques() {
    // Utilisation de String.format pour les arrondis
    // https://www.geeksforgeeks.org/java-string-format-method-with-examples/
    String caractéristiques =
        String.format("Patient : %.1f kg pour %.1f m (IMC : %.2f)", poids, taille, calculerIMC());
    return caractéristiques;
  }
}
