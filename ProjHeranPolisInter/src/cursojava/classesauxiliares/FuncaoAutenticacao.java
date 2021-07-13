/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/**
 *
 * @author wesle
 */
//Realmente e somente receber alguem que tem o contrato da interface de PermitirAcesso
public class FuncaoAutenticacao {
    
    private PermitirAcesso permitirAcesso;
    
    public boolean autenticar(){
        return permitirAcesso.Autenticar();
    }

    public FuncaoAutenticacao(PermitirAcesso acesso) {
        this.permitirAcesso = acesso;
    }
    
}
