/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASESDTO6;


public class DTOCALCULADORAS {
private String nombre ;
private String color ;
private String textura ;
private int numeroSerie;
private String material;
private String correas;


    public DTOCALCULADORAS(String nombre, String color, String textura, int numeroSerie, String material, String correas) {
        this.nombre = nombre;
        this.color = color;
        this.textura = textura;
        this.numeroSerie = numeroSerie;
        this.material = material;
        this.correas = correas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCorreas() {
        return correas;
    }

    public void setCorreas(String correas) {
        this.correas = correas;
    }

 
}
