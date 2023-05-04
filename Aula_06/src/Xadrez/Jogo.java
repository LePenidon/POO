package Xadrez;

import Auxiliar.Consts;
import Pecas.*;
import Xadrez.Tabuleiro;
import Auxiliar.Posicao;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.util.zip.GZIPInputStream;

public class Jogo extends javax.swing.JFrame implements MouseListener, KeyListener {

    private Tabuleiro tTabuleiro;// atributo com a janela de desenho
    Conjunto cBrancas;
    Conjunto cPretas;
    boolean bEmJogada;
    Peca pecaEmMovimento;

    public enum CoresConjuntos {

        BRANCAS, PRETAS
    };

    public Jogo() {
        tTabuleiro = new Tabuleiro();// alocação do painel de desenho
        tTabuleiro.setFocusable(true);
        tTabuleiro.addMouseListener(this);// Adiciona evento de mouse ao Painel de desenho
        tTabuleiro.addKeyListener(this);
        cBrancas = new Conjunto();
        cPretas = new Conjunto();
        bEmJogada = false;
        pecaEmMovimento = null;
        initComponents();
    }

    public void addPeca(Peca aPeca, CoresConjuntos aCorConjunto) {
        aPeca.setTabuleiro(this.tTabuleiro);
        if (aCorConjunto == CoresConjuntos.BRANCAS) {
            cBrancas.add(aPeca);
        } else {
            cPretas.add(aPeca);
        }
    }

    public Peca getPecaClicada(Posicao aPosicao) {
        Peca pTemp = cBrancas.getPecaClicada(aPosicao);
        if (pTemp != null) {
            return pTemp;
        }
        pTemp = cPretas.getPecaClicada(aPosicao);
        if (pTemp != null) {
            return pTemp;
        }
        return null;
    }

    public void paint(Graphics g) {
        super.paint(g);
        cBrancas.AutoDesenho();
        cPretas.AutoDesenho();
    }

    public void go() {
        TimerTask task = new TimerTask() {
            public void run() {
                repaint();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 0, Consts.DELAY);
    }

    public Posicao getPosicaoDoClique(MouseEvent aMouseEvent) {
        return new Posicao(aMouseEvent.getY() / Consts.SIZE,
                aMouseEvent.getX() / Consts.SIZE);
    }

    public void mousePressed(MouseEvent e) {
        int x = e.getX();// pega as coordenadas do mouse
        int y = e.getY();
        this.clickLabel
                .setText("x:" + x + "  y:" + y + "   -   Quadrante: [" + y / Consts.SIZE + "," + x / Consts.SIZE + "]");

        Peca pecaClicada = this.getPecaClicada(this.getPosicaoDoClique(e));
        if (pecaClicada == null) {
            System.out.println("Nenhuma peca selecionada");
        } else {
            System.out.println("Peca " + pecaClicada + " selecionada");
        }

        if (bEmJogada) {
            if (pecaClicada == null) { // soh movimenta
                if (pecaEmMovimento.setPosicao(this.getPosicaoDoClique(e))) {
                    pecaEmMovimento = null;
                    bEmJogada = false;
                } else {
                    System.out.println("Jogada ainda em movimento, selecione uma posicao valida");
                }
            } else { // come a peca clicada
                if (pecaEmMovimento.setPosicao(this.getPosicaoDoClique(e))) {
                    if (pecaEmMovimento == pecaClicada)
                        System.out.println("A peca foi deselecionada, escolha outra peca");
                    else if (!pecaEmMovimento.temAMesmaCorQue(pecaClicada))
                        cPretas.pecaFora(pecaClicada);
                    /* Completar o codigo para pecas pretas comendo pecas brancas */
                    pecaEmMovimento = null;
                    bEmJogada = false;
                } else {
                    System.out.println("Jogada ainda em movimento, selecione uma posicao valida");
                }
            }

        } else {
            if (pecaClicada != null) {
                System.out.println("Movimentacao em andamento, selecione o destino da peca");
                pecaEmMovimento = pecaClicada;
                bEmJogada = true;
            }
        }

        repaint();
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("Estou salvando o jogo");
            File tanque = new File("Poo.dat");
            try {
                tanque.createNewFile();
                FileOutputStream canoOut = new FileOutputStream(tanque);
                GZIPInputStream compactador = new GZIPInputStream(canoOut);

            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        repaint();
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCenario = tTabuleiro;
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        coordenadaLabel = new javax.swing.JLabel();
        clickLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCC0204 - Xadrez");
        setResizable(false);

        jPanelCenario.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanelCenario.setMinimumSize(new java.awt.Dimension(800, 800));
        jPanelCenario.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanelCenario.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanelCenarioLayout = new javax.swing.GroupLayout(jPanelCenario);
        jPanelCenario.setLayout(jPanelCenarioLayout);
        jPanelCenarioLayout.setHorizontalGroup(
                jPanelCenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));
        jPanelCenarioLayout.setVerticalGroup(
                jPanelCenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));

        jLabel2.setText("Coordenada:");

        jLabel3.setText("click:");

        coordenadaLabel.setText("10");

        clickLabel.setText("quadrante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanelCenario, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        219, Short.MAX_VALUE)
                                                                .addComponent(clickLabel)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(coordenadaLabel,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(293, 293, 293)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanelCenario, javax.swing.GroupLayout.PREFERRED_SIZE, 597,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(clickLabel)
                                                .addComponent(coordenadaLabel)))
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clickLabel;
    private javax.swing.JLabel coordenadaLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelCenario;
    // End of variables declaration//GEN-END:variables

}
