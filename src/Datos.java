import java.util.*;

public class Datos {
    private List<Double> data;

    public Datos(List<Double> data) {
        this.data = data;
    }

    public List<Double> getData() {
        return data;
    }

    public Map<Double, Integer> getGroupedData(int intervalo) {
        Map<Double, Integer> datosAgrupados = new HashMap<>();
        for (double valor : data) {
            double clave = Math.floor(valor / intervalo) * intervalo;
            datosAgrupados.put(clave, datosAgrupados.getOrDefault(clave, 0) + 1);
        }
        return datosAgrupados;
    }
}
