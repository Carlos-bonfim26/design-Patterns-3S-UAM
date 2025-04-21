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
    // o if identifica qual forma o cliente quer e retorna a classe certa para instanciar o objeto desejado
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
 //criação da fábrica verde
        AbstractFactory greenFactory = FactoryProdutor.getFactory("Verde");
       //criação do quadrado verde, e o desenhando pelo um método;
         greenFactory.getSquare(5).draw();

    }
    
}
```
