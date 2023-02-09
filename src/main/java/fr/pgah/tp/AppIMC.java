package fr.pgah.tp;

public class AppIMC {

  // Méthode main initiale
  // Vous ne devez pas modifier cette méthode
  public static void main(String[] args) {
    Patient patient = new Patient(74.5, 1.75);
    System.out.println(patient.caractéristiques());
    System.out.println("IMC exact : " + patient.calculerIMC());

    // Valeur négative pour l'un des deux => les deux seront mis à zéro
    Patient autrePatient = new Patient(-2.0, 4.5);
    System.out.println(autrePatient.caractéristiques());
  }
}
