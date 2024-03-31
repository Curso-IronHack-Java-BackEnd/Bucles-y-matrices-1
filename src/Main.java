import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {5, 4, 3, 2, 1}; //Array inicial
        System.out.println("Array inicial: "+ Arrays.toString(numbers));//Lo imprimimos
        //Guardamos en una variable el primer valor del array
        int firstValue = numbers[0];

        /*Iteramos sobre el array multiplicando un elemento por el siguiente excepto en el caso del ultimo
        que lo multiplicamos por el valor guardado en firstValue ya que al iterar ya ha sido cambiado su valor*/
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length-1) {
                numbers[i]= numbers[i] * firstValue;
            } else{
                numbers[i] = numbers[i] * numbers [i+1];
            }
        }

        //Imprimimos el array final
        System.out.println("Array final: "+ Arrays.toString(numbers));
    }
}