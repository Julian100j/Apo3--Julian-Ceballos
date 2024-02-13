/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo;

/**
 *
 * @author Julian Ceballos
 */
 public class Tarea {
    private int id;
    private String descripcion;
    private int prioridad;
   
    
    public Tarea(int idtarea, String descripcion, int piroridad) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = piroridad;
    }

    public int getIdTarea() {
        return id;
    }

    public void setIdtarea(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
}