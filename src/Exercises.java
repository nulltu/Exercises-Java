import javax.swing.*;
import java.rmi.MarshalException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercises {


    public static void main(String[] args) {

        double num1 = 10;
        double num2 = 10;


        //    1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
        //Suma
        System.out.println("La suma de los números es: " + (num1+num2));

        //Resta
        System.out.println("La resta de los números es: " + (num1-num2));

        //Multiplicación
        System.out.println("El producto de los números es: " + (num1*num2));

        //División
        System.out.println("La division de los números es: " + (num1/num2));

        //Módulo
        System.out.println("El módulo de los números es: " + (num2%num1));


        //    2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.

        if(num1>num2){
            System.out.println("Nro1 es mayor");
        }else if(num1==num2){
            System.out.println("Nro1 es Igual a Nro2");
        }else{
            System.out.println("Nro2 es mayor");
        }

//        3) Solicitar nombre al usuario por consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.

        System.out.println("Hola! Ingresa tu nombre por favor.");
        String entradaTeclado = "";
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.nextLine();

        System.out.println("Bienvenido/a: " + entradaTeclado);

        //5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.

        //A
        System.out.println("Ingrese el radio para poder realizar el cálculo");
        String entradaTeclado ="";
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado =  entradaScanner.nextLine();
        double radioCuadrado = Math.pow(Double.parseDouble(entradaTeclado), 2);
        System.out.println(radioCuadrado* Math.PI);

        //B

        System.out.println("Ingrese el radio para poder realizar el cálculo");
        String entradaTeclado = JOptionPane.showInputDialog("Ingresa el radio del cìrculo");
        double calcularArea = (Math.pow(Double.parseDouble(entradaTeclado),2))*Math.PI;
        System.out.println("El área del círculo es: " + calcularArea);

        //6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.

        String entradaTeclado = JOptionPane.showInputDialog(("Ingrese el numéro a verificar si es divisible por 2"));
        if(Double.parseDouble(entradaTeclado) % 2 == 0){
            System.out.println("Este número si es divisible por 2");
        }else{
            System.out.println("Este número no es divisible por 2");
        }

//        //7) Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.

        String entradaTeclado = JOptionPane.showInputDialog(("Ingrese el NRO"));
        int numero = Integer.parseInt(entradaTeclado);
        char ascii = (char)numero;
        System.out.println("En ASCII es; " +  ascii);

        //8) Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y muestre su código en la tabla ASCII.

        String entradaTeclado = JOptionPane.showInputDialog("Ingrese codigo ASCII");
        char codigo = entradaTeclado.charAt(0);
        int caracter = (int) codigo;
        System.out.println(caracter);

        //9) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.

        String entradaTeclado = JOptionPane.showInputDialog("Ingrese el precio del producto");

        final float iva = 21;

        float precio = Float.parseFloat(entradaTeclado);
        float porcentaje = (precio* iva)/100;
        float precioFinal = (precio+porcentaje);

        System.out.println(precioFinal);


//        //10) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
//
        int i=1;
        while (i<=100){
            System.out.println(i);
            i++;
        }
    }

}
