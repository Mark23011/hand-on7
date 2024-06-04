package mi.paquete;

public class Operaciones {
    public static double ABTotal() {
        return Datos.abData[0][0] + Datos.abData[0][1] + Datos.abData[1][0] + Datos.abData[1][1];
    }

    public static double A1Total() {
        return Datos.abData[0][0] + Datos.abData[1][0];
    }

    public static double A2Total() {
        return Datos.abData[0][0] + Datos.abData[0][1];
    }

    public static double B1Total() {
        return Datos.abData[0][1] + Datos.abData[1][1];
    }

    public static double B2Total() {
        return Datos.abData[1][0] + Datos.abData[1][1];
    }

    public static double Porcentaje(double valor, double total) {
        return (valor / total) * 100;
    }


    public static double probabilidadMarginalA() {
        return A1Total() / ABTotal();
    }

    public static double probabilidadMarginalB() {
        return B1Total() / ABTotal();
    }

    public static double probabilidadConjuntaAB() {
        return Datos.abData[0][0] / ABTotal();
    }

    public static double probabilidadCondicionalBA() {
        return Datos.abData[0][0] / A1Total();
    }

    public static double probabilidadCondicionalBNoA() {
        return Datos.abData[0][1] / B1Total();
    }
}
