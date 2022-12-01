
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MargaritaT
 */
//Metodos de de la tabla
public class TablasHash {
    int  arreglo[];
    int tamanio,valor,table_size=9,indicearreglo;;
 
    public TablasHash(int table_size)//Constructor 
    {
        tamanio=table_size;
        arreglo =new int[table_size];
        Arrays.fill(arreglo, valor);
    }
    int key;
    public void AsignacionLlave(int [] valor,int []arreglo)
    {
       //key funciona como indice 
        for(key=0;key<valor.length;key++)
        {
            int elemento=valor[key];
            int indicearreglo=elemento%table_size;
            System.out.println("La llave del elemento "+elemento+" es: "+indicearreglo);
            //Coliciones
            while(arreglo[indicearreglo]!=0)
            {
                indicearreglo++;
                System.out.println("colision");
                indicearreglo%=tamanio;
            }
            arreglo[indicearreglo]=elemento;
        }
            
    }
    public void mostrar ()
    {
       
        int incremento=0,i,j;
        for(i=0;i<1;i++)
        {
            incremento+=9;
           
            System.out.println();
          
           
            System.out.println();
            for(j=0;j<incremento;j++)
            {
              
               
                   System.out.println(" "+arreglo[j]);
               
                
            }
        }
    }
     
    
  
    public void add(int key, int valor){
       int elemento;
       elemento=key;
       int indicearreglo=elemento%table_size;
        int []arreglo={valor};
        
        System.out.println("La llave del elemento "+valor+" es: "+indicearreglo);
    }
    
    public void valueOf(int key){
        int aux=0;
        
        indicearreglo = key % table_size;
        //llave del elemento
        arreglo[aux]=key % table_size;
       
        System.out.println("Valor " +arreglo[valor]+" asociado a la llave "+arreglo[aux]);
      
        
        
    }
    
    public void remove(int key)
    {
       int elemento;
       elemento=key;
        indicearreglo = elemento % table_size;
        
        int arreglo[]=null;
         System.out.println("Valor eliminado ");
    }

}
