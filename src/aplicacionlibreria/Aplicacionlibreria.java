/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionlibreria;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernanda
 */
public class Aplicacionlibreria {
    
    private static index_libreria inicio;
    private static libros Libro[];
    private static int contador;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inicio = new index_libreria();
        Libro = new libros[100];
        
        for (int i = 0; i < 100; i++){
            Libro[i]= new libros();
        }
        contador = 0;
        inicio.setVisible(true);
        
    }
    
    public static void guardar(int i, String t, String d, int u){
        {
            Libro[contador].setId(i);
            Libro[contador].setTitulo(t);
            Libro[contador].setDescripcion(d);
            Libro[contador].setUnidades_disponibles(u);
            
            contador++;
        }
    }
    public static void busqueda(String bus){
            for (int j = 0; j < Libro.length; j++){
                if(Libro[j].getTitulo().equals(bus)){
                    inicio.cargardatos(Libro[j]);
                }else{
        JOptionPane.showMessageDialog(null, "LibroNoEncontradoException");
       System.exit(0);

                    
                }
            }
                    
                    
        }

   
    }

    

