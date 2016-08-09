package br.com.gbd.apostiladesignpatterns.estrutural.flyweight;

import java.util.HashMap;
import java.util.Map;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 09:03:40
    Arquivo: TemaFlyweightFactory
*/

public class TemaFlyweightFactory {
    private static Map<Class<? extends TemaFlyweight>, TemaFlyweight> temas = new HashMap<>();
    public static final Class<TemaAsterisco> ASTERISCCO = TemaAsterisco.class;
    public static final Class<TemaHifen> HIFEN = TemaHifen.class;
    public static final Class<TemaGBD> GBD = TemaGBD.class;
    
    public static TemaFlyweight getTema(Class<? extends TemaFlyweight> clazz){
        if(!temas.containsKey(clazz)){
            try{
                temas.put(clazz, clazz.newInstance());
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        
        return temas.get(clazz);
    }
}
