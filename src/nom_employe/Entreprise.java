/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nom_employe;

/**
 *
 * @author Christian Saruti
 */
import java.util.Scanner;

/**
 *
 * @author Christian Saruti
 */
public class Entreprise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Combien d'employés souhaitez-vous enregistrer ? ");
        int nombreEmployes = scanner.nextInt();

        String[] nomsEmployes = new String[nombreEmployes];
        double[] salairesEmployes = new double[nombreEmployes];

        for (int i = 0; i < nombreEmployes; i++) {
            System.out.print("Nom de l'employé " + (i + 1) + " : ");
            nomsEmployes[i] = scanner.next();
            System.out.print("Salaire de l'employé " + (i + 1) + " : ");
            salairesEmployes[i] = scanner.nextDouble();
        }

        // Recherche de l'employé avec le salaire le plus bas
        double salaireMinimum = salairesEmployes[0];
        String nomEmployeSalaireMinimum = nomsEmployes[0];
        
        for (int i = 1; i < nombreEmployes; i++) {
            if (salairesEmployes[i] < salaireMinimum) {
                salaireMinimum = salairesEmployes[i];
                nomEmployeSalaireMinimum = nomsEmployes[i];
            }
        }

        // Recherche de l'employé avec le salaire le plus élevé
        double salaireMaximum = salairesEmployes[0];
        String nomEmployeSalaireMaximum = nomsEmployes[0];
        
        for (int i = 1; i < nombreEmployes; i++) {
            if (salairesEmployes[i] > salaireMaximum) {
                salaireMaximum = salairesEmployes[i];
                nomEmployeSalaireMaximum = nomsEmployes[i];
            }
        }

        System.out.println("L'employé avec le salaire le plus bas est : " + nomEmployeSalaireMinimum + " avec un salaire de " + salaireMinimum);
        System.out.println("L'employé avec le salaire le plus élevé est : " + nomEmployeSalaireMaximum + " avec un salaire de " + salaireMaximum);
    }
}
