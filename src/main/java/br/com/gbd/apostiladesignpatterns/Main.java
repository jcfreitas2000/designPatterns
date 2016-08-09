package br.com.gbd.apostiladesignpatterns;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 10:55:37
    Arquivo: main
 */
public class Main {

    /*
    PADRÕES DE CRIAÇÃO
    FactoryMethod: Encapsular a escolha da classe concreta a ser utilizada na criação de objetos de um determinado tipo.
    AbstractFactory: Encapsular a escolha das classes concretas a serem utilizadas na criação dos objetos de diversas famílias.
    Builder: Separar o processo de construção de um objeto de sua representação e permitir a sua criação passo-a-passo. Diferentes tipos de objetos podem ser criados com implementações distintas de cada passo.
    Prototype: Possibilitar a criação de novos objetos a partir da cópia de objetos existentes.
    Singleton: Permitir a criação de uma única instância de uma classe e fornecer um modo para recuperá-la.
    Multiton: Permitir a criação de uma quantidade limitada de instâncias de determinada classe e fornecer um modo para recuperá-las.
    ObjectPool: Possibilitar o reaproveitamento de objetos.
     */
 /*
    PADRÕES ESTRUTURAIS
    Adapter: Permitir que um objeto seja substituído por outro que, apesar de realizar a mesma tarefa, possui uma interface diferente.
    Bridge: Separar uma abstração de sua representação, de forma que ambos possam variar e produzir tipos de objetos diferentes.
    Composite: Agrupar objetos que fazem parte de uma relação parte-todo de forma a tratá-los sem distinção.
    Decorator: Adicionar funcionalidade a um objeto dinamicamente.
    Facade: Prover uma interface simpliﬁcada para a utilização de várias interfaces de um subsistema.
    FrontController: Centralizar todas as requisições a umaa plicação Web.
    Flyweight: Compartilhar, de forma eﬁciente, objetos que são usados em grande quantidade.
    Proxy: Controlar as chamadas a umo bjeto através de outro objeto de mesma interface.
     */
 /*
    PADRÕES COMPORTAMENTAIS
    Command: Controlar as chamadas a um determinado componente, modelando cada requisição como um objeto. Permitir que as operações possam ser desfeitas, enﬁleiradas ou registradas.
    Iterator: Fornecer um modo eﬁciente para percorrer sequencialmente os elementos de uma coleção, sem que a estrutura interna da coleção seja exposta.
    Mediator: Diminuir a quantidade de “ligações” entre objetos introduzindo um mediador, através do qual toda comunicação entre os objetos será realizada.
    Observer: Deﬁnir um mecanismo eﬁciente para reagir às alterações realizadas em determinados objetos.
    State: Alterar o comportamento de um determinado objeto de acordo com o estado no qual ele se encontra.
    Strategy: Permitir de maneira simples a variação dos algoritmos utilizados na resolução de um determinado problema.
    TemplateMethod: Deﬁnir a ordem na qual determinados passos devem ser realizados na resolução de um problema e permitir que esses passos possam ser realizados de formas diferentes de acordocomasituação.
    Visitor: Permitir atualizações especíﬁcas em uma coleção de objetos de acordo com o tipo particular de cada objeto atualizado.
     */
    public static void main(String[] args) {
        FactoryMethod.testa();
        AbstractFactory.testa();
        Builder.testaGeradorDeBoletos();
        Prototype.testaPrototype();
        Multion.testaMultion();
        ObjectPool.testaObjectPool();
        Adapter.testaAdapter();
        Bridge.testaBridge();
        Composicao.testaComposicao();
        Decorator.testaDecorator();
        Facade.testaFacade();
        Flyweight.testaFlyweight();
        Proxy.testaProxy();
        Command.testaCommand();
        Mediator.testaMediator();
        Observer.testaObserver();
        State.testaState();
        Strategy.testaStrategy();
        TemplateMethod.testaTemplateMethod();
        Visitor.testaVisitor();
    }
}
