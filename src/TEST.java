
import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CALCULE calc = new CALCULE();

        while (true) {
            System.out.println("Choisissez une opération :");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quitter");
            System.out.print("Entrez votre choix : ");
            
            int choix = scanner.nextInt();

            if (choix == 5) {
                System.out.println("Au revoir !");
                break;
            }

            System.out.print("Entrez le premier nombre : ");
            double a = scanner.nextDouble();

            System.out.print("Entrez le second nombre : ");
            double b = scanner.nextDouble();

            try {
                double resultat = 0;
                switch (choix) {
                    case 1:
                        resultat = calc.addition(a, b);
                        System.out.println("Résultat de l'addition : " + resultat);
                        break;
                    case 2:
                        resultat = calc.soustraction(a, b);
                        System.out.println("Résultat de la soustraction : " + resultat);
                        break;
                    case 3:
                        resultat = calc.multiplication(a, b);
                        System.out.println("Résultat de la multiplication : " + resultat);
                        break;
                    case 4:
                        resultat = calc.division(a, b);
                        System.out.println("Résultat de la division : " + resultat);
                        break;
                    default:
                        System.out.println("Choix invalide. Veuillez essayer à nouveau.");
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        
        scanner.close();
    }
}
