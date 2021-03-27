package sn.sylla;

import sun.usagetracker.UsageTrackerClient;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenu sur SAMAGAZIN ");
        System.out.println("> l liste les regions du Sénégal vous pouvez npous trouver  ");
        Scanner scanner = new Scanner(System.in);
        String menu = scanner.next();
        String numeroProduit = scanner.next();
        if ("l".equalsIgnoreCase(menu)) {
            System.out.println("Listes des regions : ");
            System.out.println("> t Thies ");
            System.out.println("> d Dakar ");
            String codeAssocie = scanner.next();
            if ("t".equalsIgnoreCase(codeAssocie)) {
                System.out.println("Liste des associes dans la regions de Thies ");
                System.out.println("> 1 Amadou  ");
                System.out.println("> 2 Fatou Diagne ");


                if ("1".equalsIgnoreCase(numeroProduit)) {
                    System.out.println("Liste des offres de Amadou");
                    System.out.println("> 1 Lait en poudre (500)");
                    System.out.println("> 2 Riz  (13.000 Fcfa)");
                    System.out.println("> 3 Poulet (3.500 Fcfa)");
                    String achat = scanner.next();
                    if ("1".equalsIgnoreCase(achat)) {
                        System.out.println("Decidez-vous de payé votre comande ? 1 pour OUI et 0 pour NON ");
                        System.out.println("> 1 OUI");
                        System.out.println("> 0 NON");
                    } else if ("1".equalsIgnoreCase(achat)) {
                        System.out.println("Decidez-vous de payé votre comande ? 1 pour OUI et 0 pour NON ");
                        System.out.println("> 1 OUI");
                        System.out.println("> 0 NON");
                    } else if ("1".equalsIgnoreCase(achat)) {
                        System.out.println("Decidez-vous de payé votre comande ? 1 pour OUI et 0 pour NON ");
                        System.out.println("> 1 OUI");
                        System.out.println("> 0 NON");
                    }
                } else if ("2".equalsIgnoreCase(numeroProduit)) {
                    System.out.println("Liste des offres de Fatou Diagne");
                    System.out.println("> 1 Lait en poudre (500)");
                    System.out.println("> 2 Riz  (13.000 Fcfa)");
                    System.out.println("> 3 Poulet (3.500 Fcfa)");
                }
            } else if ("d".equalsIgnoreCase(codeAssocie)) {
                System.out.println("Liste des associes dans la rergions de Dakar ");
                System.out.println("> 1 Moctar SYLLA  ");
                System.out.println("> 2 Aliou SYLLA ");

                if ("1".equalsIgnoreCase(numeroProduit)) {
                    System.out.println("Liste des offres de Moctar SYLLA ");
                    System.out.println("> 1 Lait en poudre (500)");
                    System.out.println("> 2 Riz  (13.000 Fcfa)");
                    System.out.println("> 3 Poulet (3.500 Fcfa)");

                } else if ("2".equalsIgnoreCase(numeroProduit)) {
                    System.out.println("Liste des offres de Aliou SYLLA  ");
                    System.out.println("> 1 Lait en poudre (500)");
                    System.out.println("> 2 Riz  (13.000 Fcfa)");
                    System.out.println("> 3 Poulet (3.500 Fcfa)");
                    String achat = scanner.next();
                    if ("1".equalsIgnoreCase(achat)) {
                        System.out.println("Decidez-vous de payé votre comande ? 1 pour OUI et 0 pour NON ");
                        System.out.println("> 1 OUI");
                        System.out.println("> 0 NON");
                    } else if ("2".equalsIgnoreCase(achat)) {
                        System.out.println("Decidez-vous de payé votre comande ? 1 pour OUI et 0 pour NON ");
                        System.out.println("> 1 OUI");
                        System.out.println("> 0 NON");
                    } else if ("3".equalsIgnoreCase(achat)) {
                        System.out.println("Decidez-vous de payé votre comande ? 1 pour OUI et 0 pour NON ");
                        System.out.println("> 1 OUI");
                        System.out.println("> 0 NON");
                    }
                }
            } else {
                System.out.println("Choix inconnu");
            }
        }
    }
}

