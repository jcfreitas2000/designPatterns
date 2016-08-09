package br.com.gbd.apostiladesignpatterns.comportamental.command;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 12:33:56
    Arquivo: AumentaVolumeComando
*/

public class AumentaVolumeComando implements Comando{
    private Player player;
    private int levels;

    public AumentaVolumeComando(Player player, int levels) {
        this.player = player;
        this.levels = levels;
    }
    
    @Override
    public void executa() {
        this.player.increaseVol(this.levels);
    }
    
}
