package Pecas;

import Xadrez.Jogo;

import java.io.Serializable;

import Auxiliar.Posicao;

public class Bispo extends Peca implements Serializable {
    public Bispo(String sAFileName, Posicao aPosicao, boolean bBrancas) {
        super(sAFileName, aPosicao, bBrancas);
    }

    public String toString() {
        return "Bispo";
    }

    public boolean setPosicao(Posicao umaPosicao) {
        throw new UnsupportedOperationException("Implemente esta funcao para o " + this); // Generated from
                                                                                          // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
