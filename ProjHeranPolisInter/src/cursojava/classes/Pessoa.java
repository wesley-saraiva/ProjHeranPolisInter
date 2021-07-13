/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.classes;

/**
 *
 * @author wesle
 */
//Classe Pai ou superclasse
public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected String dataNascimento;
    protected String RG;
    protected String CPF;
    protected String nomeMae;
    protected String nomePai;

    //Metodo abstrato é que fica na classe pai é obrigatoria para as classes filhas
    public abstract double salario();    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", RG=" + RG + ", CPF=" + CPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + '}';
    }
    
    public boolean pessoaMaiorIdade() {
        return idade >= 18;
    }
    public boolean diretorNomePadrao(){
        return nome == "Wesley";
    }
}
