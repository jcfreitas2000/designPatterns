package br.com.gbd.apostiladesignpatterns.comportamental.command;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 12:35:15
    Arquivo: DiminuiVolumeComando
*/

public class DiminuiVolumeComando implements Comando{

    private Player player;
    private int levels;

    public DiminuiVolumeComando(Player player, int levels) {
        this.player = player;
        this.levels = levels;
    }

    @Override
    public void executa() {
        this.player.decreaseVol(levels);
    }
}
