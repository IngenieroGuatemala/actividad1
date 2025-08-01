/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author excal
 */
public class cliente extends Persona {
    private String nit;
    
    public String getnit(){
     return nit;
    }
    public  void  setnit(String nit){
     this.nit= nit;
    
    }

  protected void agregar (){
  System.out.println("Nit"+getnit());
  System.out.println("Nombres"+ getnombres());
  System.out.println("Apellidos"+ getApellidos());
  System.out.println("Direccion"+ getDireccion());
  System.out.println("Telefono"+ getTelefono());
  System.out.println("fecha nacimiento"+ getFecha_nacimiento());
  
  
 
  }
  
}
