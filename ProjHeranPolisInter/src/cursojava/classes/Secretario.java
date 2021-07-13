/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

/**
 *
 * @author wesle
 */
public class Secretario extends Pessoa implements PermitirAcesso {
    
    private String registro;
    private String nivelCargo;
    private String experiencia;
    private String login;
    private String senha;
    
    public Secretario() {
    }
    
    public Secretario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    public String getRegistro() {
        return registro;
    }
    
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
    public String getNivelCargo() {
        return nivelCargo;
    }
    
    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }
    
    public String getExperiencia() {
        return experiencia;
    }
    
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
    
    @Override
    public String toString() {
        return "Secretario{" + "registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia + '}';
    }
    
    @Override
    public double salario() {
        return 20.25 * 30;
    }

    //Esse metodo do contrato de autenticação
    @Override
    public boolean Autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;
        return Autenticar();
    }
    
    @Override
    public boolean Autenticar() {
        
        return login.equals("admin") && senha.equals("admin");
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
