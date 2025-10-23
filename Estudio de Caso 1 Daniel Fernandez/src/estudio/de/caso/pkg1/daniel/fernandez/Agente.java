/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.de.caso.pkg1.daniel.fernandez;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Agente {
    private String nombre;
    private int cedula;
    private int codigo;
    private String sucursal;
    private boolean tieneCarro;
    private int mes;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public boolean isTieneCarro() {
        return tieneCarro;
    }
    
    public int getMes() {
        return mes;
    }

    public void setMes() {
       while (true){
       
            this.mes =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese, en numero, el mes actual"));
            if (mes < 13 && mes > 0){
                break;
            }
        }
            
        
        
    }

    public void setTieneCarro() {
        while (true) {
            int respuesta = Integer.parseInt(JOptionPane.showInputDialog("¿Usted tiene carro propio? 1 = Si 2 = no"));
            if ( respuesta == 1){
                this.tieneCarro = true;
                break;
            }else if (respuesta == 2) {
                this.tieneCarro = false;
                break;
            }
        }
    }

   
    
    
}
