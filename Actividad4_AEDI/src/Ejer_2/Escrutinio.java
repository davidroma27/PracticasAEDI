package Ejer_2;

/**
 *
 * @author david
 */
public class Escrutinio {
    public static void main(String[] args) {
        Urna<Papeleta> u = new Urna<Papeleta>();
        
        //Se realiza la votación
        for(int i=1; i<=10; i++){
            //Se generan 2 num random para cada papeleta
            int rand1 = (int) (Math.random()*10)+1; //Num aleatorio de 1 a 10
            int rand2 = (int) (Math.random()*10)+1;
            
            //Si los dos numeros son iguales genero otro num distinto
            if(rand1 == rand2){
                rand2 = (int) (Math.random()*10)+1;
            }
            
            Papeleta p = new Papeleta(rand1,rand2);
            u.addPapeleta(p);
        }
        
        int[] votos = new int[10];
        
        //Se realiza el conteo de votos
        while(u.numElem() != 0){
            Papeleta p = u.recuperar(); //Se obtiene una papeleta de la urna
            votos[p.getCandidato1()]++; //Se incrementa un voto en la posicion del array
                                        //correspondiente al candidato
            votos[p.getCandidato2()]++; //Lo mismo 
            u.borrar(p); //Se elimina la papeleta de la urna
        }
        
        //Se imprimen los resultados
        for(int i=1; i<=votos.length; i++){
            System.out.println("El candidato " + i + " tiene " + votos[i] + " votos");
        }
    }
}
