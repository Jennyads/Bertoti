<h4>Diagrama de Classe para projeto de aplicacação de Design Patterns - Observer</h4>

![alt text](https://github.com/Jennyads/Bertoti/blob/main/Engenharia%20de%20Software%20III/Imagens/diagrama_classe_observer.png)

O padrão de projeto Observer é um padrão comportamental que estabelece uma relação de dependência entre objetos, de modo que quando o estado de um objeto é alterado, todos os seus dependentes são notificados e atualizados automaticamente.

No padrão Observer, existem dois componentes principais: o objeto observado (subject) e os observadores (observers). O objeto observado mantém uma lista de observadores registrados e notifica cada observador quando ocorre uma mudança em seu estado.

Os observadores são interfaces ou classes que implementam uma interface comum. Essa interface define um método de atualização que é chamado pelo objeto observado quando ocorre uma mudança. Cada observador pode então decidir como reagir à notificação e atualizar seu próprio estado de acordo.

Quando ocorre uma mudança no objeto observado, ele percorre a lista de observadores registrados e chama o método de atualização em cada observador, passando os dados relevantes. Dessa forma, os observadores são notificados e podem atualizar seu estado de acordo com a mudança ocorrida no objeto observado.

O padrão Observer permite uma comunicação eficiente e desacoplada entre objetos, onde os objetos observadores podem ser adicionados ou removidos dinamicamente do objeto observado. Isso promove a extensibilidade e flexibilidade do código, permitindo que diferentes objetos observadores reajam de maneiras diferentes a um evento de mudança.

Em resumo, o padrão Observer estabelece uma relação de dependência entre um objeto observado e um ou mais observadores. Quando ocorre uma mudança no objeto observado, os observadores são notificados e podem atualizar seu estado de acordo. Isso permite uma comunicação desacoplada e flexível entre objetos, promovendo a extensibilidade do código.
