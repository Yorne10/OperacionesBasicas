
package operacionesbasicas;

/**
 *
 * @author maryse
 * 
 * Programa para realizar operaciones básicas :
 * suma, resta, multiplicación y division.
 * 
 */

public class OperacionesBasicas {
    
    //int valor1 = 10, valor2 = 8;
        
        public void suma(int valor1, int valor2){
        //Reliza el cálculo de la suma
        float suma= valor1 + valor2;
        System.out.println("La suma es: " + suma);
        }
        
        public void resta(int valor1, int valor2){
        //Reliza el cálculo de la resta
        float resta= valor1 - valor2;
        System.out.println("La resta es: " + resta);
        }
        
        public void multi (int valor1, int valor2){
        //Reliza el cálculo de la multiplicación
        float multiplicación = valor1 * valor2;
        System.out.println("La multiplicación es: " + multiplicación);
        }
        
        public void division (int valor1, int valor2){
        //Reliza el cálculo de la división
        float division = valor1 / valor2;
        System.out.println("La division es: " + division);
        }


    public static void main(String[] args) {        
        OperacionesBasicas operaciones = new OperacionesBasicas();
        operaciones.suma(2,4);
        operaciones.resta(7,6);
        operaciones.multi(908,4);
        operaciones.division(16,8);
    }
}
