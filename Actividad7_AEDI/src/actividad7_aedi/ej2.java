package actividad7_aedi;

/**
 * @author david
 * 
 * Rellenar el área contigua a la posición de la matriz situada en la fila x 
 * y la columna y con el valor dado por nuevoColor. Se define como área contigua 
 * a una casilla de la matriz todas aquellas casillas accesibles mediante movimientos 
 * verticales u horizontales (no en diagonal) y del mismo valor (color) que la casilla original
 */
public class ej2 {
    public void rellenar(int[][] matriz, int x, int y, int nuevoColor){
        int color = matriz[x][y];
        int Xorigen = x;
        int Yorigen = y;
        
        //Cambiar color por la derecha
        while(Yorigen < matriz[0].length && matriz[Xorigen][Yorigen] == color){
            matriz[Xorigen][Yorigen++] = nuevoColor;
        }
        
        //Cambiar color por la izquierda
        Yorigen = y-1;
        while(Yorigen >= 0 && matriz[Xorigen][Yorigen] == color){
            matriz[Xorigen][Yorigen--] = nuevoColor;
        }
        
        //Cambiar color por arriba
        Yorigen = y;
        Xorigen = x-1;
        while(Xorigen > 0  && matriz[Xorigen][Yorigen] == color){
            matriz[Xorigen--][Yorigen] = nuevoColor;
            
        //Cambiar color por debajo
        Xorigen = x+1;
        }while(Yorigen < matriz.length && matriz[Xorigen][Yorigen] == color){
            matriz[Xorigen++][Yorigen] = nuevoColor;
        }
        
    }
    
    
}
