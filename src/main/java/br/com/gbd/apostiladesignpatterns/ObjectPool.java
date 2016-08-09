package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.criacao.objectPool.Funcionario;
import br.com.gbd.apostiladesignpatterns.criacao.objectPool.FuncionarioPool;
import br.com.gbd.apostiladesignpatterns.criacao.objectPool.Pool;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 15:19:38
    Arquivo: ObjectPool
*/

public class ObjectPool {

    public static void testaObjectPool(){
        Pool<Funcionario> funcPool = new FuncionarioPool();
        Funcionario funcionario = funcPool.acquire();
        funcPool.release(new Funcionario("Matheus"));
        while (funcionario != null) {
            System.out.println(funcionario.getNome());
            funcionario = funcPool.acquire();
        }
    }
}
