/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author excal
 */
public class Cliente extends Persona {
    private String nit;
    public Cliente(){};
    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    @Override
   public void agregar(){
   System.out.println("nit: "+getNit());
   System.out.println("nombres: "+getNombres());
   System.out.println("nombres: "+getNombres());
   System.out.println("Apellidos: "+getApellidos());
   System.out.println("Direccion: "+getDireccion());
   System.out.println("telefono: "+getTelefono());
   System.out.println("Fecha nacimiento "+ getFecha_nacimiento());
   System.out.println("__________________________________________");
   
   
   
   
   }
}
