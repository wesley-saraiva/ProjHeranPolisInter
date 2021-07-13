/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.classes;

import cursojava.constantes.StatusAluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author wesle
 */
// esta e nossa classe / objeto que representa o aluno
public class Aluno extends Pessoa {

    // Esses são os atributos do Aluno
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Aluno() {// Cria os dados da memoria - Sendo padrão do Java

    }

    public Aluno(String nomePadrao) {
        nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    }
    //Veremos os metdos SETTERS e GETTERS do objeto
    //SET é para adiconar ou receber dados para os atributos
    //GET é para resgatar ou obter o valor do atributo

    //Recebe dados
    

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    @Override
    public String toString() {
        return "Aluno{" + "dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado + ", disciplinas=" + disciplinas + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    //Metodo que retorna a media do aluno;

    public double getCalcMedia() {

        double somaNotas = 0.0;

        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getNota();
        }
        return somaNotas / disciplinas.size();
    }

    public boolean getAprovado() {
        double media = this.getCalcMedia();
        if (media >= 70) {//Aprovado
            return true;
        } else {
            return false;// Reprovado
        }
    }

    public String getAprovado2() {
        double media = this.getCalcMedia();
        if (media >= 70) {
            return StatusAluno.APROVADO;
        } else if (media >= 50) {
            return StatusAluno.RECUPERACAO;
        } else {
            return StatusAluno.REPROVADO;
        }

    }
    //identifica método sobreescrito
    @Override
    public boolean pessoaMaiorIdade() {
        
        return idade >=21;
    }
    public String msgMaiorIdade(){
        
        return this.pessoaMaiorIdade() ? "Obaa aluno maior de idade" : "Vixi aluno menor de idade";
    }

    @Override
    public double salario() {
        return 0;
    }
    public String msgSalario(){
    
        return "Aluno não pode receber salario";
                
    }
    

}
