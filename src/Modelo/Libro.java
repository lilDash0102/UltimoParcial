package Modelo;
// Generated 3/12/2020 04:58:59 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Libro generated by hbm2java
 */
public class Libro  implements java.io.Serializable {


     private Integer codLib;
     private String nombre;
     private int ejemplar;
     private String categoria;
     private String coleccion;
     private Set prestamos = new HashSet(0);

    public Libro() {
    }

	
    public Libro(String nombre, int ejemplar, String categoria, String coleccion) {
        this.nombre = nombre;
        this.ejemplar = ejemplar;
        this.categoria = categoria;
        this.coleccion = coleccion;
    }
    public Libro(String nombre, int ejemplar, String categoria, String coleccion, Set prestamos) {
       this.nombre = nombre;
       this.ejemplar = ejemplar;
       this.categoria = categoria;
       this.coleccion = coleccion;
       this.prestamos = prestamos;
    }
   
    public Integer getCodLib() {
        return this.codLib;
    }
    
    public void setCodLib(Integer codLib) {
        this.codLib = codLib;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEjemplar() {
        return this.ejemplar;
    }
    
    public void setEjemplar(int ejemplar) {
        this.ejemplar = ejemplar;
    }
    public String getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getColeccion() {
        return this.coleccion;
    }
    
    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }
    public Set getPrestamos() {
        return this.prestamos;
    }
    
    public void setPrestamos(Set prestamos) {
        this.prestamos = prestamos;
    }




}


