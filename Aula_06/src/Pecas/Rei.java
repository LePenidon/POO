package Pecas;

import java.io.Serializable;

import Auxiliar.Posicao;

public class Rei extends Peca implements Serializable {
    public Rei(String sAFileName, Posicao aPosicao, boolean bBrancas) {
        super(sAFileName, aPosicao, bBrancas);
    }

    public String toString() {
        return "Rei";
    }

    public boolean setPosicao(Posicao umaPosicao) {
        throw new UnsupportedOperationException("Implemente esta funcao para o " + this); // Generated from
                                                                                          // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}