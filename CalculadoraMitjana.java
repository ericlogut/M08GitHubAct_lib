import java.util.List;

public class CalculadoraMitjana {

    public double calcularMitjana(List<Double> numeros) {    
        double suma = 0.0;
        int n = numeros.size();
        for (double num : numeros) {
            suma += num;
        }
        return suma / n;
    }
    
}
