
package metodo_burbuja;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String [] args){
        int ventas;
        ventas = Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de ventas"));
        int arreglo [] = new int [ventas];
        
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la venta"));
        }
        
        for(int i = 0; i < arreglo.length-1; i++){
            for(int j = 0; j < arreglo.length-1; j++){
               if(arreglo[j] > arreglo[j+1]){ 
                int aux = arreglo[j];
                arreglo[j] = arreglo[j+1];
                arreglo[j+1] = aux;
               }
            }
        }
        
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(+arreglo[i]+" ");
        }
    }
}
