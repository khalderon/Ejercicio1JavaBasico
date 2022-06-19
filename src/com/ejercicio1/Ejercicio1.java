package com.ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {

        //enteros
        byte number1 = 1;
        short number2 = 2;
        int number3 = 3;
        long number4 = 4;

        //punto flotante
        float decimal1 = 1.2f;
        double decimal2 = 2.2;

        //caracter
        char caracter1 = 'a';

        //booleanos
        boolean verdadero = true;
        boolean falso = false;

        //texto
        String nombre = "Victor";

        //envoltorio
        Integer num = null;
        Long num2 = null;

        System.out.println(
                "Los tipos de texto en java son: \n"+
                "Enteros: \n"+
                    "\tbyte: "+number1+" "+"short: "+number2+" "+"int: "+number3+" "+"long: "+number4+
                "\nPunto flotante: \n"+
                    "\tfloat: "+decimal1+" "+"double: "+decimal2+
                "\nCaracter: \n"+
                    "\tchar: "+caracter1+
                "\nBooleanos: \n"+
                    "\tverdadero: "+verdadero+" "+"falso: "+falso+
                "\nTexto: \n"+
                    "\tString: "+nombre+
                "\nEnvoltorio: \n"+
                    "\tInteger: "+num+" "+"Long: "+num2
        );
    }
}
