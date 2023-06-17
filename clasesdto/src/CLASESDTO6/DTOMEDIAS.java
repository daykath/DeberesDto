/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASESDTO6;

/**
 *
 * @author user
 */
public class DTOMEDIAS {
private String material;
private String color ;
private String peso ;
private int TALLA;
private String marca;
private String modelo;  

    public DTOMEDIAS(String material, String color, String peso, int TALLA, String marca, String modelo) {
        this.material = material;
        this.color = color;
        this.peso = peso;
        this.TALLA = TALLA;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getTALLA() {
        return TALLA;
    }

    public void setTALLA(int TALLA) {
        this.TALLA = TALLA;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}