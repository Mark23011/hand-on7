import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double> data = Arrays.asList(13.0,14.0,15.0,16.0,17.0,18.0,19.,20.0,21.0,22.0,23.0);
        Datos datos = new Datos(data);

        // Datos no agrupados
        System.out.println("Datos no agrupados:");
        System.out.println("Media: " + Operaciones.media(datos.getData()));
        System.out.println("Moda: " + Operaciones.moda(datos.getData()));
        System.out.println("Mediana: " + Operaciones.mediana(datos.getData()));

        int intervalo = 4;
        Map<Double, Integer> groupedData = datos.getGroupedData(intervalo);

        System.out.println("\nDatos agrupados (Intervalo = " + intervalo + "):");
        System.out.println("Media: " + Operaciones.mediaAgrupada(groupedData));
        System.out.println("Moda: " + Operaciones.modaAgrupada(groupedData));
        System.out.println("Mediana: " + Operaciones.medianaAgrupada(groupedData));
    }
}
