package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.comportamental.command.AumentaVolumeComando;
import br.com.gbd.apostiladesignpatterns.comportamental.command.DiminuiVolumeComando;
import br.com.gbd.apostiladesignpatterns.comportamental.command.ListaDeComandos;
import br.com.gbd.apostiladesignpatterns.comportamental.command.Player;
import br.com.gbd.apostiladesignpatterns.comportamental.command.TocaMusicaComando;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 13:24:05
    Arquivo: Command
*/

public class Command {

    public static void testaCommand(){
        Player player = new Player();
        ListaDeComandos lstComandos = new ListaDeComandos();
        
        lstComandos.adiciona(new TocaMusicaComando(player, "musica1.mp3"));
        lstComandos.adiciona(new AumentaVolumeComando(player, 3));
        lstComandos.adiciona(new TocaMusicaComando(player, "musica2.mp3"));
        lstComandos.adiciona(new DiminuiVolumeComando(player, 3));
        lstComandos.adiciona(new TocaMusicaComando(player, "musica3.mp3"));
        
        lstComandos.executa();
    }
}
