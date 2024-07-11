/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c8ejerciciosclase;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class C8EjerciciosClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int edad[] = new int[5];
        edad[0]=30;
        System.out.println(edad[0]);
        System.out.println(edad[1]);
        System.out.println(edad[2]);
        System.out.println(edad[3]);
        System.out.println(edad[4]);
        System.out.println(edad.length);
        */
        //Da error: System.out.println(edad[5]);
        /*
        String edad2[] = new String[5];
        edad2[0]="30";
        System.out.println(edad2[0]);
        System.out.println(edad2[1]);
        System.out.println(edad2[2]);
        System.out.println(edad2[3]);
        System.out.println(edad2[4]);
        */
        /*
        int edad[] = new int[10];
        for (int i = 0; i < edad.length; i++) {
            edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad " + (i+1)));
        }
        
        for (int i = 0; i < edad.length; i++) {
            JOptionPane.showMessageDialog(null, "La edad "+ (i+1) + " es: " + edad[i]);
        */
        /*
      int cantidadRegistros   = Integer.parseInt(JOptionPane.showInputDialog("Digite la de registros "));
        int edad[] = new int [cantidadRegistros];
        solicitaDatosVector(edad);
        imprimeDatosVector(edad);
        */
        /*
      int cantidadFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas "));
      int cantidadColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas " ));
      int matrizUnica[][] = new int[cantidadFilas][cantidadColumnas];
      solicitaDatosMatriz(matrizUnica, cantidadFilas, cantidadColumnas);
      imprimeDatosMatriz(matrizUnica, cantidadFilas,cantidadColumnas);
              }
    public static void solicitaDatosMatriz (int matriz[][], int filas, int columnas){
          for (int i = 0; i < filas; i++) {
              for (int j = 0; j < columnas; j++) {
                  matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila " + i + " columna " + j));
              }
          }
    }
    
    public static void imprimeDatosMatriz(int matriz[][], int filas, int columnas){
        String resultado = "";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado += matriz[i][j] + " ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    public static void solicitaDatosVector (int vector[]){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite la edad "+ (i+1)));
        }
    }
    
    public static void imprimeDatosVector (int vector[]){
        for (int i = 0; i < vector.length; i++) {
            JOptionPane.showMessageDialog(null, "La edad es "+ (i+1)+ ": " + vector[i]);
            
        }
*/
        int cantidadFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas"));
        int cantidadColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas"));
        int matrizUnica[][] = new int[cantidadFilas][cantidadColumnas];
        solicitaDatosMatriz(matrizUnica, cantidadFilas, cantidadColumnas);
        imprimeDatosMatriz(matrizUnica, cantidadFilas, cantidadColumnas);
        sumaEsquinasMatriz(matrizUnica, cantidadFilas, cantidadColumnas);
    }
        
    public static void solicitaDatosMatriz(int matriz[][], int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila " + i + " columna " + j));
                
            }
            
        }
        
    }
    public static void imprimeDatosMatriz(int matriz[][], int filas, int columnas){     
        String resultado = "";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
              resultado += matriz[i][j] + " ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    public static void sumaEsquinasMatriz(int matriz[][], int filas, int columnas){
        int suma = 0;
        suma += matriz[0][0];
        suma += matriz[filas-1][0];
        suma += matriz[0][columnas-1];
        suma += matriz[filas-1][columnas-1];
        JOptionPane.showMessageDialog(null,"La suma de sus esquinas es: " + suma);
    }
         
}
  

          
            
            
        
    
    

