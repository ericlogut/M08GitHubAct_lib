import java.util.List;

public class CalculadoraMitjana {

    public double calcularMitjana(List<Double> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("La llista no pot estar buida.");
        }
    
        double suma = 0.0;
        int n = numeros.size();
        for (double num : numeros) {
            suma += num;
        }
        return suma / n;
    }
    
}
