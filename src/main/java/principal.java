/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author MargaritaT
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TablasHash tabla1=new TablasHash(9);//9 sera el tamanio que le asignamos
       int []elementos={9,18,7,6,1,4,3,6};
       tabla1.AsignacionLlave(elementos, tabla1.arreglo);
        System.out.println("Ingresamos nuevos elementos");
       tabla1.add(10, 10);
       tabla1.add(8, 3);
       tabla1.add(100, 4);
       tabla1.add(20, 15);
       tabla1.add(13, 90);
       tabla1.remove(9);
       //retorna la llave solicitada
        System.out.println("Valor" +" asociado a la llave");
       tabla1.valueOf(13);
       tabla1.mostrar();
      
    }
    
}
