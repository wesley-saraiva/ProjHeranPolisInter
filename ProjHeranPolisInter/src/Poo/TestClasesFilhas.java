/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

/**
 *
 * @author wesle
 */
public class TestClasesFilhas {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Wesley");
        aluno.setIdade(15);

        Diretor diretor = new Diretor();
        diretor.setNome("Wesley Saraiva");
        diretor.setRegistroEducacao("454d5f4d4ds");
        diretor.setIdade(20);

        Secretario sec = new Secretario();
        sec.setExperiencia("Adm");
        sec.setIdade(30);

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(sec);

        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        System.out.println(diretor.diretorNomePadrao() + " - " + diretor.msgNomeDiretor());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(sec.pessoaMaiorIdade());

        System.out.println("Salario do aluno = R$" + aluno.salario() + " - " + aluno.msgSalario());
        System.out.println("Salario do secretario = R$" + sec.salario());
        System.out.println("Salario do diretor = R$" + diretor.salario());

        teste(aluno);
        teste(diretor);
        teste(sec);
    }

    public static void teste(Pessoa pessoa) {
        System.out.println("Essa pessoa e demias = "
                + pessoa.getNome() + " e o salario é de = " + pessoa.salario());

    }
}
