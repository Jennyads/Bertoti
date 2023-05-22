<h4>Diagrama de Classe para projeto de aplicacação de Design Patterns - Composite</h4>

![alt text](https://github.com/Jennyads/Bertoti/blob/main/Engenharia%20de%20Software%20III/Imagens/diagrama_classe_composite.png)



O padrão de projeto Composite é um padrão estrutural que permite tratar objetos individuais e composições de objetos de maneira uniforme. Ele organiza os objetos em uma estrutura de árvore hierárquica, onde os objetos individuais e os grupos de objetos são tratados da mesma maneira.

No padrão Composite, é definida uma interface comum que representa tanto os objetos individuais quanto os grupos de objetos. Cada objeto implementa essa interface, o que permite que eles sejam tratados de forma uniforme. Os grupos de objetos (chamados de composites) contêm referências para outros objetos individuais e/ou composites, formando uma estrutura em árvore.

Os composites possuem operações para adicionar, remover e acessar os objetos filhos, enquanto os objetos individuais implementam essas operações de maneira vazia, já que não têm filhos. Dessa forma, é possível tratar recursivamente a estrutura composta, percorrendo e executando operações em todos os objetos da árvore, independentemente de serem objetos individuais ou composites.

O padrão Composite proporciona uma maneira flexível de tratar objetos em estruturas hierárquicas, permitindo que os clientes manipulem tanto objetos individuais quanto composições de forma transparente. Ele simplifica o código cliente, pois não é necessário distinguir entre objetos individuais e composites ao interagir com a estrutura.

Em resumo, o padrão Composite permite tratar objetos individuais e grupos de objetos de maneira uniforme através de uma estrutura de árvore hierárquica. Isso proporciona flexibilidade, simplicidade e transparência na manipulação de objetos em estruturas compostas.
