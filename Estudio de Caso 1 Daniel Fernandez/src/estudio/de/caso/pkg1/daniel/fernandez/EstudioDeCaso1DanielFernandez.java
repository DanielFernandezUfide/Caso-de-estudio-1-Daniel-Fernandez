/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudio.de.caso.pkg1.daniel.fernandez;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class EstudioDeCaso1DanielFernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Agente agente = new Agente();
        agente.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
        agente.setCedula(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cedula")));
        agente.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su codigo de empleado")));
        agente.setSucursal(JOptionPane.showInputDialog("Ingrese el nombre de la sucursal"));
        agente.setTieneCarro();
        agente.setMes();
        
              
        Finansas finansas = new Finansas();
        int cantidadFacturas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas facturas se van a ingresas?"));
        for (int i = cantidadFacturas; i > 0; i-- ){
            
            Factura factura = new Factura();
            factura.setNombreCliente(JOptionPane.showInputDialog("Ingrese el nombre del cliente"));
            factura.setCedulaCliente(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cedula del cliente")));
            factura.setCodigo((int)Math.random()*1000+1);
            factura.setProductosElectricos(Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos productos Electronicos fueron vendidos")));
            factura.setProductosAutomotrices(Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos productos Automotrices fueron vendidos")));
            factura.setProductosConstruccion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos productos de Construccion fueron vendidos")));
            factura.setMonto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto total de la factura")));
            finansas.setMontoTotal(finansas.getMontoTotal() + factura.getMonto());
            
            if (factura.getProductosElectricos()!= 0 && factura.getProductosConstruccion() != 0 && factura.getProductosAutomotrices() != 0){
                finansas.setComision(finansas.getComision() + factura.getMonto() * 0.10);
            }else {
                
                if (factura.getProductosElectricos()>= 3) {
                    finansas.setComision(finansas.getComision() + factura.getMonto() * 0.04);
                }else{
                    finansas.setComision(finansas.getComision() + factura.getMonto() * 0.02);
                }
                if (factura.getProductosAutomotrices()>= 4){
                   finansas.setComision(finansas.getComision() + factura.getMonto() * 0.04);
                }else{
                    finansas.setComision(finansas.getComision() + factura.getMonto() * 0.02);
                }
                if (factura.getProductosConstruccion() != 0) {
                    finansas.setComision(finansas.getComision() + factura.getMonto() * 0.08);
                }else{
                    finansas.setComision(finansas.getComision() + factura.getMonto() * 0.2);
                }
            }
            if (factura.getMonto() > 50000){
                finansas.setComision(finansas.getComision() + factura.getMonto() * 0.05);
            }
            
        }
        if (cantidadFacturas >= 3){
            finansas.setBonoExtra(true);
            finansas.setComision(finansas.getComision() + 20000);
        }else{
            finansas.setBonoExtra(false);
        }
        
        JOptionPane.showMessageDialog(null, "El Agente Vendedor " + agente.getNombre() + "codigo: " + agente.getCodigo() + "en el mes de: " + agente.getMes());
        JOptionPane.showMessageDialog(null, "Vendio un total de " + finansas.getMontoTotal() + "En facturas");
        JOptionPane.showMessageDialog(null, "Obtuvo un total en comisiones de: " + finansas.getComision());
        JOptionPane.showMessageDialog(null, "El agente vendedor " + finansas.isBonoExtra() + "logro llegar al objetivo del BONO EXTRA");
        JOptionPane.showMessageDialog(null, "El agente vendedor " + agente.isTieneCarro() + "tiene carro propio");
        
    }
    
}
