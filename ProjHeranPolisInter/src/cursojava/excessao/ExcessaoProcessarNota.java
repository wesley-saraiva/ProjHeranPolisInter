/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.excessao;

/**
 *
 * @author wesle
 */
public class ExcessaoProcessarNota extends Exception {

    public ExcessaoProcessarNota(String erro) {
        super(" Vixx um erro no procesamento\n"
                + "do arquivo ao procesar as notas do aluno " + erro);;
    }

}
