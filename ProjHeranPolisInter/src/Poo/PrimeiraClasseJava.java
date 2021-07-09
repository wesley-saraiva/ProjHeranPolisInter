/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class PrimeiraClasseJava {

    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("Digite seu login");
        String senha = JOptionPane.showInputDialog("Digite sua senha");

        if (login.equalsIgnoreCase("admin")
                && senha.equalsIgnoreCase("123")) {
            
            HashMap<String,List<Aluno>> maps = new HashMap<String, List<Aluno>>();

            List<Aluno> alunos = new ArrayList<Aluno>();
            /*List<Aluno> alunosAprovados = new ArrayList<Aluno>();
            List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
            List<Aluno> alunosReprovados = new ArrayList<Aluno>();*/

            for (int qtd = 1; qtd <= 5; qtd++) {
                //Objeto valido
                //Aluno aluno1 = new Aluno("Wesley");
                //new Aluno() é uma instancia (Criação do objeto)
                //aluno2 é um referencia para objeto Aluno
                String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
                /*int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno"));
        String dataNasc = JOptionPane.showInputDialog("Qual a data do nascimento");
        String rg = JOptionPane.showInputDialog("Qual o RG");
        String cpf = JOptionPane.showInputDialog("Qual o CPF");
        String nomeMae = JOptionPane.showInputDialog("Nome da mae");
        String nomePai = JOptionPane.showInputDialog("Nome do pai");
        String dataMatri = JOptionPane.showInputDialog("Data da matricula");
        String nomeEscola = JOptionPane.showInputDialog("Nome da escola");
        String serieMatri = JOptionPane.showInputDialog("Serie do aluno");*/

                Aluno aluno2 = new Aluno();
                aluno2.setNome(nome);
                /*aluno2.setIdade(idade);
        aluno2.setDataNascimento(dataNasc);
        aluno2.setRG(rg);
        aluno2.setCPF(cpf);
        aluno2.setNomeMae(nomeMae);
        aluno2.setNomePai(nomePai);
        aluno2.setDataMatricula(dataMatri);
        aluno2.setNomeEscola(nomeEscola);
        aluno2.setSerieMatriculado(serieMatri);*/

 /*aluno2.getDisciplina().setNota1(n1);
        aluno2.getDisciplina().setNota2(n2);
        aluno2.getDisciplina().setNota3(n3);
        aluno2.getDisciplina().setNota4(n4);
        
        aluno2.getDisciplina().setDisciplina1(d1);
        aluno2.getDisciplina().setDisciplina2(d2);
        aluno2.getDisciplina().setDisciplina3(d3);
        aluno2.getDisciplina().setDisciplina4(d4);*/
                for (int pos = 1; pos <= 1; pos++) {
                    String nomeDisc = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
                    double nota = Double.parseDouble(JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?"));

                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina(nomeDisc);
                    disciplina.setNota(nota);

                    aluno2.getDisciplinas().add(disciplina);
                }

                int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");

                if (escolha == 0) {
                    int continuaRemover = 0;
                    int posicao = 1;

                    while (continuaRemover == 0) {
                        int discRemover = Integer.parseInt(JOptionPane.showInputDialog("Qual disciplina 1, 2 ,3 ou 4"));
                        aluno2.getDisciplinas().remove(discRemover - posicao);
                        posicao++;
                        continuaRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo ?");
                    }
                }
                alunos.add(aluno2);
            }
            maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
            maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
            for (Aluno aluno : alunos) {//Separei em listas os alunos
                if (aluno.getAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                    maps.get(StatusAluno.APROVADO).add(aluno);
                } else if (aluno.getAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                    maps.get(StatusAluno.RECUPERACAO).add(aluno);
                } else if (aluno.getAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
                    maps.get(StatusAluno.REPROVADO).add(aluno);
                }
            }

            /*for (int pos = 0; pos < alunos.size(); pos++) {

            Aluno aluno = alunos.get(pos);

            if (aluno.getNome().equalsIgnoreCase("Wesley")) {
                Aluno trocar = new Aluno();
                trocar.setNome("Aluno foi trocado");
                
                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina("Matematica");
                disciplina.setNota(50);
                
                trocar.getDisciplinas().add(disciplina);
                
                alunos.set(pos, trocar);
                aluno = alunos.get(pos);
            }

            System.out.println("Aluno = " + aluno.getNome());
            System.out.println("Media da notas = " + aluno.getCalcMedia());
            System.out.println("Resultado = " + aluno.getAprovado2());
            System.out.println("----------------------------------------");

            for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {

                Disciplina disc = aluno.getDisciplinas().get(posd);
                System.out.println("Materia = " + disc.getDisciplina()
                        + "Nota = " + disc.getNota());

            }
            System.out.println("-----------------------------");
        }*/
            System.out.println("---------------Listas dos Aprovados-----------------");
            for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                System.out.println("Aluno(a): " + aluno.getNome() + " Resultado = " + aluno.getAprovado2() + " média de = "
                        + aluno.getCalcMedia());
            }
            System.out.println("---------------Listas de Recuperacao-----------------");
            for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                System.out.println("Aluno(a): " + aluno.getNome() + " Resultado = " + aluno.getAprovado2() + " média de = "
                        + aluno.getCalcMedia());
            }
            System.out.println("---------------Listas dos Reprovados-----------------");
            for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                System.out.println("Aluno(a): " + aluno.getNome() + " Resultado = " + aluno.getAprovado2() + " média de = "
                        + aluno.getCalcMedia());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Senha Invalida, tente novamente");
            
        }
    }
}
/*for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase("wesley")) {
                alunos.remove(aluno);
                break;
            } else {
                System.out.println(aluno.toString());//descricao do objeto da memoria
                System.out.println("Media do aluno = " + aluno.getCalcMedia());
                System.out.println("Situacao do aluno é " + (aluno.getAprovado() ? "Aprovado" : "Reprovado"));
                System.out.println("Situacao do aluno é " + aluno.getAprovado2());
                System.out.println("----------------------------------------------");
                break;
            }
        }
        for (Aluno aluno : alunos) {
            System.out.println("Alunos que sobraram da lista ");
            System.out.println(aluno.getNome());
            for (Disciplina disciplina : aluno.getDisciplinas()) {
                System.out.println(disciplina.getDisciplina());
            }
        }
//Equals e hashcode (Diferencia objetos)
/*Aluno aluno3 = new Aluno();
        aluno3.setNome("Alex");
        
        Aluno aluno4 = new Aluno();
        aluno4.setNome("Alx");
        
        if (aluno3.equals(aluno4)){
            System.out.println("Alunos sao iguais");
        } else {
            System.out.println("Alunos nao sao iguais");
        }*/
