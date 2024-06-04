import java.util.*;

public class Operaciones {

    // Calcula la media (promedio) para datos no agrupados
    public static double media(List<Double> datos) {
        double suma = 0;
        for (double valor : datos) {
            suma += valor;
        }
        return suma / datos.size();
    }

    // Calcula la moda (valor más frecuente) para datos no agrupados
    public static double moda(List<Double> datos) {
        Map<Double, Integer> frecuencia = new HashMap<>();
        for (double valor : datos) {
            frecuencia.put(valor, frecuencia.getOrDefault(valor, 0) + 1);
        }

        double moda = datos.get(0);
        int maxFrecuencia = 0;
        for (Map.Entry<Double, Integer> entrada : frecuencia.entrySet()) {
            if (entrada.getValue() > maxFrecuencia) {
                maxFrecuencia = entrada.getValue();
                moda = entrada.getKey();
            }
        }
        return moda;
    }

    // Calcula la mediana (valor central) para datos no agrupados
    public static double mediana(List<Double> datos) {
        Collections.sort(datos);
        int tamaño = datos.size();
        if (tamaño % 2 == 0) {
            return (datos.get(tamaño / 2 - 1) + datos.get(tamaño / 2)) / 2.0;
        } else {
            return datos.get(tamaño / 2);
        }
    }

    // Calcula la media (promedio) para datos agrupados
    public static double mediaAgrupada(Map<Double, Integer> datosAgrupados) {
        double suma = 0;
        int totalFrecuencia = 0;
        for (Map.Entry<Double, Integer> entrada : datosAgrupados.entrySet()) {
            suma += entrada.getKey() * entrada.getValue();
            totalFrecuencia += entrada.getValue();
        }
        return suma / totalFrecuencia;
    }

    // Calcula la moda (valor más frecuente) para datos agrupados
    public static double modaAgrupada(Map<Double, Integer> datosAgrupados) {
        double moda = 0;
        int maxFrecuencia = 0;
        for (Map.Entry<Double, Integer> entrada : datosAgrupados.entrySet()) {
            if (entrada.getValue() > maxFrecuencia) {
                maxFrecuencia = entrada.getValue();
                moda = entrada.getKey();
            }
        }
        return moda;
    }

    // Calcula la mediana (valor central) para datos agrupados
    public static double medianaAgrupada(Map<Double, Integer> datosAgrupados) {
        List<Double> datos = new ArrayList<>();
        for (Map.Entry<Double, Integer> entrada : datosAgrupados.entrySet()) {
            for (int i = 0; i < entrada.getValue(); i++) {
                datos.add(entrada.getKey());
            }
        }
        return mediana(datos);
    }
}
