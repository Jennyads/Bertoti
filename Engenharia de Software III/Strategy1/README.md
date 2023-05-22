
<h4>Diagrama de Classe para projeto de aplicacação de Design Patterns - Strategy I</h4>

![alt text](https://github.com/Jennyads/Bertoti/blob/main/Engenharia%20de%20Software%20III/Imagens/diagrama_classe_strategy.png)




O padrão de projeto Strategy é um padrão comportamental que permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis. Ele permite que o algoritmo varie independentemente dos clientes que o utilizam.

No padrão Strategy, é definida uma interface comum que representa uma estratégia genérica. As diferentes implementações dessa interface representam as estratégias específicas, cada uma com sua própria implementação de um algoritmo. O contexto, que é responsável por executar o algoritmo, recebe uma instância da estratégia desejada e delega a execução para essa estratégia.

Dessa forma, o padrão Strategy promove a flexibilidade e a extensibilidade do código, permitindo que novas estratégias sejam adicionadas facilmente sem alterar o código existente. Além disso, ele também promove o princípio da separação de responsabilidades, uma vez que o algoritmo é isolado em classes separadas, facilitando a manutenção e evolução do sistema.

Em resumo, o padrão Strategy permite a definição de diferentes algoritmos encapsulados em classes separadas, tornando-os intercambiáveis através de uma interface comum. Isso proporciona maior flexibilidade, extensibilidade e manutenibilidade ao código.
