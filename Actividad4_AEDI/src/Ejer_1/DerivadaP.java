package Ejer_1;

/**
 * Escribe un método que dado un polinomio calcule su derivada
 */
public class DerivadaP {
    public static Polinomio deriva(Polinomio p){
    // Produce: Dado el polinomio p de la forma anxn + an-1xn-1 + …+ a1x1 + a0x0
    // devuelve su derivada: (n*an) xn-1 + (n-1 * an-1) x n-2 + …+ a1
    
        Polinomio nuevo = new Polinomio();
        int gradoMax = p.getGrado();
        
        for(int i=gradoMax; i >= 1; i--){
            if (p.getCoeficiente(i) != 0) {
                double nuevoCoef = i * p.getCoeficiente(i);
                int nuevoExp = i - 1;
                nuevo.addTermino(nuevoCoef, nuevoExp);
            }
        }
        return nuevo;
    }
}
