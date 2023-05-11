package Pecas;

import Auxiliar.Consts;
import Xadrez.Jogo;
import Xadrez.Tabuleiro;
import Auxiliar.Posicao;
import java.awt.Graphics2D;
import java.io.IOException;
import java.io.Serializable;

import javax.swing.ImageIcon;

public abstract class Peca implements Serializable {
    protected ImageIcon iImage;
    protected Posicao pPosicao;
    /* O elemento deve saber em qual cenário ele está */
    protected boolean bBrancas;

    protected Peca(String sAFileName, Posicao aPosicao, boolean bBrancas) {
        this.pPosicao = aPosicao;
        this.bBrancas = bBrancas;
        try {
            iImage = new ImageIcon(new java.io.File(".").getCanonicalPath() + Consts.PATH + sAFileName);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public boolean temAMesmaCorQue(Peca umaPeca) {
        return this.bBrancas == umaPeca.bBrancas;
    }

    public void autoDesenho(Tabuleiro tTabuleiro) {
        iImage.paintIcon(tTabuleiro, (Graphics2D) tTabuleiro.getGraphics(),
                pPosicao.getColuna() * Consts.SIZE, pPosicao.getLinha() * Consts.SIZE);
    }

    public boolean foiClicada(Posicao aPosicao) {
        return this.pPosicao.igual(aPosicao);
    }

    public abstract boolean setPosicao(Posicao umaPosicao);
}
