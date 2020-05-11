package actividad7_aedi;



/**
 *
 * @author david
 */
public class Actividad7_AEDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("----------------Ejercicio 1----------------");
        int[] aux = {20,20,16,12,8,4,3};
        ej1 mayores = new ej1();
        System.out.println(mayores.cuantosMayores(aux, 20));
        
        
        System.out.println("----------------Ejercicio 2----------------");
        int [][] matriz = {
            {1,1,1,8,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {8,1,1,8,8,8,1,8,8,1},
            {1,1,1,8,1,1,8,1,1,1},
            {1,1,8,8,8,1,1,8,8,1},
            {1,1,8,8,8,8,1,8,8,1},
            {1,1,8,8,8,8,1,1,1,1},
            {1,1,1,8,8,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
        };
        
        System.out.println("\n>>>>>>>>>> Matriz Original <<<<<<<<<<<");
        for(int i=0; i<matriz.length; i++){
            System.out.println();
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] + "|");
            }
        }
        
        ej2 ej2 = new ej2();
        ej2.rellenar(matriz, 3, 3, 7);
        
        System.out.println();
        System.out.println("\n>>>>>>>>>> Matriz cambiada <<<<<<<<<<<");
        for(int i=0; i<matriz.length; i++){
            System.out.println();
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] + "|");
            }
        }
        
    }
    
}
