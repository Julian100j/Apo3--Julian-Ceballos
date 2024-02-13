/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.umariana.taller1;

/**
 *
 * @author Julian Ceballos
 */
import Mundo.Tarea;
import java.util.ArrayList;
import java.util.Scanner;

        public class Taller1 {

       public static void main(String[] args) {
           //Se crea un nuevo lector de scanner y una lista array
        Scanner lector = new Scanner (System.in);
        ArrayList<Tarea> misTareas=new ArrayList<>();
        
        //Antes del do while se activa un boolean para que inice activado

        boolean activo = true;                                                
        
        do {
            //Se realiza un menu con las opciones disponibles
            System.out.println("======= Menu de opciones ======");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Mostar tareas por prioridad");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion");
            System.out.println("===============================");
            
            int opcion = lector.nextInt();
            
            switch(opcion) {
                
                case 1:
                    //Se hace las funciones que se usan para agregar un nueva tarea
                    
                    System.out.println("Ingrese el id de la tarea");
                    int id=lector.nextInt();
                    lector.nextLine();
                    System.out.println("Ingrese la descripcion de la tarea");
                    String descripcion=lector.nextLine();
                    System.out.println("Ingrese la prioridad de 1-5");
                    int prioridad=lector.nextInt();
                    
                    //Creacion del objeto y llenar la informacion
                    Tarea nuevaTarea = new Tarea (id,descripcion,prioridad);
                    
                    //Almacenar el objeto en la contenedora
                    misTareas.add(nuevaTarea);
                    System.out.println("=====la tarea fue guardada a satisfaccion=====");
                    break;
                case 2:
                    //Se elabora un for para que muestre las tareas existentes en el sistema
                    
                    System.out.println("======Tareas registradas=====");
                    for (Tarea t: misTareas){
                        System.out.println("id: " +t.getIdTarea());
                        System.out.println("descripcion: " +t.getDescripcion());
                        System.out.println("prioridad: " +t.getPrioridad());
                        System.out.println("===============");
                    }
                    break;
                    
                case 3:
                   //Se inicia el funcionamiento de la opcicon numero 3
                    System.out.println("=====Tareas Segun prioridad=====");
                    
                    //Se reorganiza mis tareas segun prioridad
                    int n = misTareas.size();
                    
                    for(int i=0;i<n-1;i++){
                        
                     for(int j=0;j<n-i-1;j++){
                         
                         if(misTareas.get(j).getPrioridad()<misTareas.get(j+1).getPrioridad()){
                             
                             Tarea temp = misTareas.get(j);
                             misTareas.set(j, misTareas.get(j +1));
                             misTareas.set(j+1,temp);
                          
                         }     
                     }    
                    }
                    //Por ultimo hago un for para que imprima las tareas
                    for (Tarea t: misTareas){
                        System.out.println("id: " +t.getIdTarea());
                        System.out.println("descripcion: " +t.getDescripcion());
                        System.out.println("prioridad: " +t.getPrioridad());
                        System.out.println("===============");
                    }
                    
                    break;
                    
                case 4:
                    activo = false;
                    System.out.println("Has salido del programa :)");
                    break;
                    
                default:
                    System.out.println("opcion no valida");
            }
        }
        while(activo);
    }
}
        
    

