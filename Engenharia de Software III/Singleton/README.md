<h4>Diagrama de Classe para projeto de aplicacação de Design Patterns - Singleton</h4>

![alt text](https://github.com/Jennyads/Bertoti/blob/main/Engenharia%20de%20Software%20III/Imagens/diagrama_classe_singleton.png)

O padrão de projeto Singleton é um padrão de criação que garante a existência de apenas uma única instância de uma determinada classe em todo o sistema. Ele restringe a criação de objetos de uma classe a um único objeto, fornecendo um ponto de acesso global para essa instância única.

No padrão Singleton, a classe possui um construtor privado, o que impede a criação de instâncias diretamente por outros objetos. Em vez disso, a própria classe possui um método estático que controla a criação e o acesso à única instância. Esse método verifica se a instância já foi criada e a retorna, ou cria uma nova instância caso ainda não exista.

Uma vez que apenas uma instância é criada, as chamadas subsequentes ao método estático retornam sempre a mesma instância, garantindo que haja apenas uma única instância da classe em todo o sistema. Isso é especialmente útil em situações em que é necessário compartilhar um objeto único em vários componentes ou quando o objeto em questão é custoso em termos de recursos computacionais.

O padrão Singleton é amplamente utilizado em cenários em que é necessário controlar e garantir que exista apenas uma única instância de uma classe. Ele oferece um ponto de acesso global e único para essa instância, permitindo que outros objetos acessem facilmente o objeto singleton.

No entanto, é importante ter cuidado ao usar o padrão Singleton, pois ele pode tornar o código mais acoplado e dificultar a realização de testes unitários. Além disso, é necessário considerar questões relacionadas à concorrência em ambientes multithreaded, para garantir que a criação e o acesso ao singleton sejam thread-safe.

Em resumo, o padrão Singleton garante a existência de apenas uma única instância de uma classe em todo o sistema. Ele fornece um ponto de acesso global para essa instância única, controlando a criação e o acesso através de um método estático na própria classe. O Singleton é amplamente utilizado em cenários em que é necessário compartilhar um objeto único entre vários componentes.
