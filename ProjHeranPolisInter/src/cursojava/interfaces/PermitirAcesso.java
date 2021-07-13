/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.interfaces;

/**
 *
 * @author wesle
 */
//Essa interface sera nosso contrato de autenticação
public interface PermitirAcesso {
    
    //public boolean Autenticar();//Apenas declaração do metodo
    public boolean Autenticar(String login, String senha);
    public boolean Autenticar();
}
