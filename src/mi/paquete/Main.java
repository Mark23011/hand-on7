package mi.paquete;

public class Main {
    public static void main(String[] args) {
        double A1general = Operaciones.A1Total();
        double A2general = Operaciones.A2Total();
        double B1general = Operaciones.B1Total();
        double B2general = Operaciones.B2Total();
        double ABgeneral = Operaciones.ABTotal();

        System.out.println("Probabilidades:");
        System.out.println("==================================================");
        System.out.println("| Descripción       | Valor General | Valor Total | Porcentaje |");
        System.out.println("==================================================");
        imprimirResultado("nublado", A1general, ABgeneral);
        imprimirResultado("llueva", A2general, ABgeneral);
        imprimirResultado("no esté nublado", B1general, ABgeneral);
        imprimirResultado("no llueva", B2general, ABgeneral);
        System.out.println("==================================================");

        // Probabilidades marginales
        System.out.println("\nProbabilidades Marginales:");
        System.out.println("==================================================");
        System.out.printf("| %-30s | %-10.2f%% |\n", "P(Nublado)", Operaciones.probabilidadMarginalA() * 100);
        System.out.printf("| %-30s | %-10.2f%% |\n", "P(Llueva)", Operaciones.probabilidadMarginalB() * 100);
        System.out.println("==================================================");

        // Probabilidades conjuntas
        System.out.println("\nProbabilidades Conjuntas:");
        System.out.println("==================================================");
        System.out.printf("| %-30s | %-10.2f%% |\n", "P(Nublado y Llueva)", Operaciones.probabilidadConjuntaAB() * 100);
        System.out.println("==================================================");

        // Probabilidades condicionales
        System.out.println("\nProbabilidades Condicionales:");
        System.out.println("==================================================");
        System.out.printf("| %-30s | %-10.2f%% |\n", "P(Llueva|Nublado)", Operaciones.probabilidadCondicionalBA() * 100);
        System.out.printf("| %-30s | %-10.2f%% |\n", "P(Llueva|No Nublado)", Operaciones.probabilidadCondicionalBNoA() * 100);
        System.out.println("==================================================");
    }

    private static void imprimirResultado(String descripcion, double valorGeneral, double valorTotal) {
        double porcentaje = mi.paquete.Operaciones.Porcentaje(valorGeneral, valorTotal);
        System.out.printf("| %-18s | %-13.0f | %-11.0f | %-10.2f%% |\n", descripcion, valorGeneral, valorTotal, porcentaje);
    }
}
