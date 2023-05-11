package Pecas;

import java.io.Serializable;

import Auxiliar.Posicao;

public class Torre extends Peca implements Serializable {

    public Torre(String sAFileName, Posicao aPosicao, boolean bBrancas) {
        super(sAFileName, aPosicao, bBrancas);
    }

    public String toString() {
        return "Torre";
    }

    public boolean setPosicao(Posicao umaPosicao) {
        throw new UnsupportedOperationException("Implemente esta funcao para a " + this); // Generated from
                                                                                          // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
