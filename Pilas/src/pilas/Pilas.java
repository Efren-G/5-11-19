
package pilas;

import java.util.Scanner;

public class Pilas {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int pila[] = new int[10];
        pila objPilaEnteros = new pila(pila);
        objPilaEnteros.insertar(90);
        objPilaEnteros.insertar(56);
        objPilaEnteros.insertar(23);
        objPilaEnteros.insertar(12);
        objPilaEnteros.mostrarPila();
        
        System.out.println("Elige tu opcion:"
                + "\n 1.- Insertar"
                + "\n 2.- Eliminar"
                + "\n 3.- Mostrar"
                + "\n 4.- Dato en la Cima"
                + "\n 5.- Dato en el Fondo"
                + "\n 6.- Exit");
        int opcion=r.nextInt();
        if(opcion==1){
            System.out.println("Introducir dato:");
            int dato=r.nextInt();
            objPilaEnteros.insertar(dato);
            objPilaEnteros.mostrarPila();
        }if(opcion==2){
            objPilaEnteros.retirar();
            System.out.println("Dato Eliminado");
        }if(opcion==3){
            objPilaEnteros.mostrarPila();
        }if(opcion==4){
        objPilaEnteros.cima();
        }if(opcion==5){
            objPilaEnteros.fondo();
    }
    }  
}
