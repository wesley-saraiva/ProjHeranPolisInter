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
public class Diretor extends Pessoa implements PermitirAcesso{

    private String registroEducacao;
    private int tempoDuracao;
    private String titulacao;
    private String login;
    private String senha;

    public Diretor() {
    }

    public Diretor(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getRegistroEducacao() {
        return registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Diretor{" + "registroEducacao=" + registroEducacao + ", tempoDuracao=" + tempoDuracao + ", titulacao=" + titulacao + '}';
    }

    @Override
    public boolean diretorNomePadrao() {
        return nome == "Wesley Saraiva";
    }

    public String msgNomeDiretor() {

        return this.diretorNomePadrao() ? "Diretor verificado com sucesso"
                : "Diretor invalido";
    }

    @Override
    public double salario() {
        return 50.55 * 30;
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
     @Override
    public boolean Autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;
        return Autenticar();
    }
    
    @Override
    public boolean Autenticar() {
        
        return login.equals("wesley") && senha.equals("123");
    }
}
