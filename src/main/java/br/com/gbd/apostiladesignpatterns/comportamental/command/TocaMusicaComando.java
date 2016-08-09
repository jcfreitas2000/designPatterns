package br.com.gbd.apostiladesignpatterns.comportamental.command;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 12:31:09
    Arquivo: TocaMusicaComando
*/

public class TocaMusicaComando implements Comando{
    private Player player;
    private String file;
    
    public TocaMusicaComando(Player player, String file){
        this.player = player;
        this.file = file;
    }

    @Override
    public void executa() {
        try {
            this.player.play(this.file);
        } catch (InterruptedException ex) {
            Logger.getLogger(TocaMusicaComando.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
