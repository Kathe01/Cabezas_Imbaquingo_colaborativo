/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.Principal;
import ec.edu.intsuperior.vista.Saludo;

/**
 *
 * @author marcelopula
 */
public class Coordinador {
    Saludo  saludo = new Saludo (this);
    Principal principal = new Principal (this);


  


public void saludar (){
 saludo.setVisible(true);
}
public void mostrarPrincipal (){
    principal.setVisible(true);
}
public void regresar (){
    
}
}

