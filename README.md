<!-- # Abstract Factory 
<img 
    align="left" 
    alt="Java" 
    title="Java"
    width="30px" 
    style="padding-right: 10px;" 
    src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" 
/>


## O que é?
Abstract Factory é um dos Design Patters de Criação, sendo um criador de fábricas, já que seu propósito é instanciar objetos sem ter que chamar o construtor concreto, com você podendo criar um objeto apenas com um método e um passar de parâmetro.


## Explicando o projeto
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
``` -->
