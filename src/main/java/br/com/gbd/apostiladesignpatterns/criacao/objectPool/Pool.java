package br.com.gbd.apostiladesignpatterns.criacao.objectPool;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 15:12:28
    Arquivo: Pool
 */
public interface Pool<T> {

    T acquire();

    void release(T t);
}
