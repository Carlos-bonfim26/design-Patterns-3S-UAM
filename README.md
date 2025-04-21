<img 
    align="left" 
    alt="Java" 
    title="Java"
    width="30px" 
    style="padding-right: 10px;" 
    src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" 
/>
# Design Patterns

## o que são?
Para entender o que design patters você precisa saber o que é padrões de design, resumidamente, sabe quando você está codando e tem um dejavu de tipo?, eu já fiz isso antes,  provavelmente há um padrão de projeto aí, já que na área do desenvolvimento é comum você refazer o mesmo código várias vezes.

Aí que entra o design pattern que é uma solução documentada e extremamente abstrata para um problema conhecido, sendo meio que uma receita de bola para um problema, e ele te dá os benéficios de reutilização de código, facilidade na expansão do código, vocabulário padrão, sendo muito mais fácil comunicar o problema e etc, mas tendo como o seu maior problema na maioria dos designers patterns a complexidade do código que acaba aumentando.

## tipos de designers patterns
existem 23 padrões de design patterns documentados, sendo os padrões de criação, estrutura e comportamento.

## padrões de criação
Os padrões de criação separam o "como" um objeto é criado do "resto do sistema", assim quando você alterar algo na forma de criação desse objeto não é neessário alterar algo no resto do sistema, respeitando o principil de aberto e fechado.
Os tipos de padrões de criação são:
* Factory Method
* Abstract Factory
* Builder
* Prototype
* Singleton

## Padrões Estruturais
Os padrões de estrutura servem para juntar diferentes partes do sistema de forma organizada, onde eles usam herança para "misturar" comportamentos e caracteristicas de classes diferentes, com isso você pode pegar duas classes separadas e fazer que eles funcionem trabalhando em conjunto, útil para mexer com várias classes de bibliotecas diferentes e quando você quer fazer elas trabalharem juntas como se fossem do mesmo sistema.
Os tipos de padrões de criação são: 
* Class Adapter
* Object Adapter
* Bridge
* Composite
* Decorator
* Facade
* FlyWeight
* Proxy

## Padrões comportamentais 
Os padrões comportamentais não descrevem apenas padrões de objetos ou classes, mas também os padrões de comunicação entre eles, onde ele faz que os objetos e classes conversem entre si, em vez de ter a preocupação de quem instancia quem e o quem faz o que primeiro, o foco será na relação entre os objetos, fazendo um "Bate papo" entre as classes e um fluxo de controle mais fácil de ser mantido, por exemplo: uma presa tem o pessoal do T.I, do RH e o Comercial, o padrão de comportamento trabalha como um organizador da conversa para definir as regras e a forma que cada setor conversa com o outro, evitando chamadas de qualquer jeito e a bagunça na execução. Assim os padrões evitam um código bagunçado e dependente de outras classes, trás a independência dos objetos entre eles mesmos e facilita a expansão e comunicação entre as classes de maneira mais centralizada e controlada.
Os tipos de padrões de criação são: 
* Interpreter
* Template Method
* Chain of Responsibility
* Command
* Iterator
* Mediator
* Memento 
* Observer
* State
* Strategy
* Visitor

## Factory Method 

### O que é?
O Factory Method é o único padrão de criação para classes, e o funcionamento dele é desta forma, é definida uma interface para criar os osbjetos, mas as subclasses que implementam essa interface que seram instanciadas, tendo uma classe apenas para retornar qual classe será chamada por via de algum/alguns paramêtros
### Explicando o projeto
Nesse projeto existem 3 formas possíveis de você instanciar, o circulo, o retangulo e quadrado, apenas a dizendo qual você quer, sem precisar chamar de fato a classe Circle para chamar um circulo, isso acontece por que todas as formas são subclasses de Shape, e por causa da ShapeFactory que com o seu método de getShape() retorna a forma que o úsuario quer, escondendo a sua forma de criação bruta

``` bash
public class ShapeFactory {
    # o if identifica qual forma o cliente quer e retorna a classe certa para instanciar o objeto desejado
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else {
            return null;
        }
    }
}
    
```
a classe Main para ser visualizado como funciona a instanciação do projeto
``` bash
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape shape1 = shapeFactory.getShape("circle");
        Shape shape2 = shapeFactory.getShape("rectangle");
        Shape shape3 = shapeFactory.getShape("square");
        
        shape1.draw();
        System.out.println("");
        shape2.draw();
        System.out.println("");
        shape3.draw();
    }
    
}
```
## Abstract Factory 

### O que é?
Abstract Factory é um dos Design Patters de Criação, sendo um criador de fábricas, já que seu propósito é instanciar objetos sem ter que chamar o construtor concreto, com você podendo criar um objeto apenas com um método e um passar de parâmetro.


### Explicando o projeto
Existem 3 fábricas, Verde, Vermelho e Azul, e elas tem o poder de criar formas, Quadrado, Círculo, Retângulo e Trapézio, mas para criar isso você não necessita instanciar várias classes, mas apenas criar uma fábrica colocando sua cor como parâmetro e depois chamar a forma que você quer para poder criá-lá, e tal fábrica só fabricará formas da sua cor, caso queira outra cor, criará outra fábrica.

```bash

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 #criação da fábrica verde
        AbstractFactory greenFactory = FactoryProdutor.getFactory("Verde");
       //criação do quadrado verde, e o desenhando pelo um método;
         greenFactory.getSquare(5).draw();

    }
    
}
```
## Builder

### O que é?
O Builder é um metódo que leva ao literal o principio de responsabilidade única, onde uma classe só pode ter uma responsabilidade, ele é usado para a criação de objetos complexos de forma passo a passo, sem ter que encher uma classe de metodos e atributos, e sim quebrando ela em classes menores para aumentar a abstração e facilidade para extensão do código e reutilização.
### Explicando o projeto
nesse projeto nós temos uma lanchonete e as opções de lanche vegano e lanche de frango, mas para definir o lanche se define a carne, a bebida, tem o metodo de aparecer os items, o preço, para isso cada função foi dividida em diferentes classes que herdam e implementam outras para poder montar os lanches mas fazendo que algumas funções não dependem de outras e também deixando que objetos sejam criados apenas por um método
```bash
public class BuilderPatternDemo {
    public static void main(String[] args) {
    #criação do lanche
        MealBuilder mealBuilder = new MealBuilder();
        # escolha da opção se será veganoou não
        Meal vegMeal = mealBuilder.prepareVegMeal();
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        
        System.out.println("Veg Meal");
        vegMeal.showItems();
        #metodo que chama o valor do lanche
        System.out.println("Total Cost: " + vegMeal.getCost());
        
        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
```
## Prototype

### O que é?
O prototype faz uma clonagem de objetos, pense assim, plants vs zumbis, praticamente todos os zumbis padrões são iguais, e você pode até instanciar um novo zumbi toda vez que ser preciso, mas isso é demorado e custoso para a mémoria da sua maquina, deixando a aplicação muita pesada, faz muito mais sentido você clonar esse zumbi, assim toda vez que você chamar ele, você apenas chamando o clonando.
### Explicando o projeto
Na pasta PrototypePatternDemo temos esse código, onde temos as formas que podem ser chamada diversas vezes com o mesmo ID, vá lá e teste
```bash
# biblioteca do próprio java para ser importata
import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap 
            = new Hashtable<>();
    # metodo para fazer a clonagem
    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    
    public static void loadCache() {
        Circle circle = new Circle();
        # set de ID, isso permitirá que nós vermos que a maquina apenas clonou um novo objeto, e não criou outro
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);
        
        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(),square);
        }
}
```
## Singleton

### O que é?
Garante que uma classe seja chamada só uma vez e fornece um ponto de acesso global para a mesma, pode servir para conexões de banco de dados que são instanciados só uma vez e que para leitura podem ser acessado por todos, e você pode colocar no singleton uma forma atômica que quando um ter acesso a algo outro não poder usar, que nem em um banco, enquanto um edita, o outro apenas pode visualizar, assim que funciona o singleton, apelidado de variável global refinada.
### Explicando o projeto

```bash
# ele é um objeto final pq também não pode ser herdado, e a instance é static porque só pode ser chamado na main
public final class  SingletonObject {
    private static SingletonObject instance;
    
    private SingletonObject(){
        
    }
    # primeiro verifica se a instancia já foi chamada uma vez antes de instanciar pela primeira(e última) vez.
    public static SingletonObject getInstance(){
        if(instance == null){
            instance = new SingletonObject();
        }
        return instance;
    }
    
    public void showMessage(){
        System.out.println("Single object "+ this);
    }
}
```
## Adapter 

### O que é?
O Adapter é literalmente um adaptador, ele converte interfaces de classes para outras classes, para que seja possível classes em conjunto mesmo que sejam incompátiveis, fazendo um trabalho parecido com de um T que conseque fazer vários tipos de tomadas se encaixarem.
### Explicando o projeto
esse projeto você tem a opção de escolher escutar uma música por mp4 ou vic apenas retornando o seu tipo
```bash
public class MediaAdapter implements MediaPlayer{
  private  AdvanceMediaPlayer advanceplayer;

  #via paramêtro esse código define se vai ser criado um VicPlayer ou Mp4Player e também a chamada do método para ser tocado a música escolhida pelo cliente
    
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vic")){
            advanceplayer = new VicPlayer();
        } else if(audioType.equalsIgnoreCase("mp4")){
            advanceplayer = new Mp4Player();
        }
    }
    
     @Override
    public void play(String audioType, String fileName) {
         if(audioType.equalsIgnoreCase("vic")){
            advanceplayer.playVic(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")){
            advanceplayer.playMP4(fileName);
        }
    }
}

```