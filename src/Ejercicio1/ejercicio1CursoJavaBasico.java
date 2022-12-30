package Ejercicio1;

public class ejercicio1CursoJavaBasico {
    public static void main(String[] args) {
        
        //Datos enteros----------
        byte number1 = 1; //Ocupa 1byte en memoria
        short number2 = 2; //Ocupa 2byte en memoria
        int number3 = 3; //Ocupa 4byte en memoria
        long number4 = 4; //Ocupa 8byte en memoria


        //Datos punto flotante----------
        float decimal1 = 1.2f;
        double decimal2 = 2.1d;

        
        //Datos caracter----------
        char caracter = 'a';

        //Datos boleanos------
        boolean verdadero = true;
        boolean falso = false;

        //DATOS CLASE----------------------------------------------
        String nombre = "Ernesto";


        //DATOS ENVOLTORIO---------------------------------------------------
        Integer numero = null; //Este dato permite envolver datos primitivos y asignarles null
        long numero9 = 7L; //Se le pone l mayuscula

        System.out.println("Estos son datos númericos enteros: " + number1 + number2 + number3 + number4);

        System.out.println("Estos son datos númericos decimales: " + decimal1 + decimal2);

        System.out.println("Estos son datos caracter: " + caracter);

        System.out.println("Estos son datos númericos decimales: " + decimal1 + decimal2);

        System.out.println("Estos son datos booleanos " + verdadero + falso);

        System.out.println("Estos son datos cadena de texto " + nombre);

        System.out.println("Estos son datos envoltorio: " + numero + numero9);
    }
}
