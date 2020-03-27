package Ejer_3;

/**
 *
 * @author david
 */
public class OpMatrices {
        
    public static Matriz multiplicar(Matriz m1, Matriz m2) throws DimensionException{
        Matriz res = new Matriz(m1.numFilas(), m2.numCol());
          
        //Comprueba si el numero de colmunas a multiplicar es igual al num filas
        if(m1.numCol() == m2.numFilas()){
            //Se hacen 2 bucles; bucle i que recorre las filas de m1 y bucle j 
            //que recorre las columnas de m2
            for(int i=1; i<=m1.numFilas(); i++){
                for (int j=1; j<=m2.numCol(); j++) {
                    //El bucle k recorre cada elemento de cada fila de m1
                    for(int k=1; k<=m1.numCol(); k++){
                        int elem=0;
                        elem += m1.recuperar(i, j) * m2.recuperar(i, j);
                    }
                }
            }
        }
        else{
            throw new DimensionException("La dimension de las matrices debe ser la misma");
        }
        return res;
    }
}
