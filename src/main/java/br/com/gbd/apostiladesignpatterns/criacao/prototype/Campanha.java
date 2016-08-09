package br.com.gbd.apostiladesignpatterns.criacao.prototype;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 12:21:25
    Arquivo: Campanha
*/

public class Campanha implements Prototype<Campanha>{

    private String nome;
    private Calendar vencimento;
    private Set<String> palavrasChave;

    public Campanha(String nome, Calendar vencimento, Set<String> palavrasChave) {
        this.nome = nome;
        this.vencimento = vencimento;
        this.palavrasChave = palavrasChave;
    }

    public String getNome() {
        return nome;
    }

    public Calendar getVencimento() {
        return vencimento;
    }

    public Set<String> getPalavrasChave() {
        return palavrasChave;
    }
    
    @Override
    public Campanha clone() {
        String nome = "Cópia da campanha: " + this.nome;
        Calendar vencimento = (Calendar) this.vencimento.clone();
        Set<String> palavrasChave = new HashSet<>(this.palavrasChave);
        Campanha campanha = new Campanha(nome, vencimento, palavrasChave);
        
        return campanha;
    }
    
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("--------------------------");
        buffer.append("\n");
        buffer.append("Nome da Campanha: " + this.nome);
        buffer.append("\n");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String format = sdf.format(this.vencimento.getTime());
        buffer.append("vencimento: " + format);
        buffer.append("\n");
        
        buffer.append("Palavras-chave: \n");
        for(String aux : this.palavrasChave){
            buffer.append(" - " + aux);
            buffer.append("\n");
        }
        
        buffer.append("---------------------------");
        buffer.append("\n");
        
        return buffer.toString();
    }
}
