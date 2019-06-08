Padrões de projeto são alternativas para que o desenvolvedor consiga escrever código com responsabilidades mais bem definidas, com um baixo acoplamento, e que evolua de maneira natural. Características essas que não são encontrados em sistemas procedurais, que tipicamente apresentam código complexo, cheio de ifs, e que fazem muita coisa, tornando a manutenção custosa.

Códigos que fazem bom uso de OO evoluem geralmente não pela adição de mais um if, mas sim pela criação de mais uma estratégia, mais um observador, mais um estado, e assim por diante.

Padrões de projeto no fim apenas fazem bom uso da orientação a objetos, e seus conceitos e mecânismos, como encapsulamento, abstrações, interfaces, polimorfismo, e etc.

# Strategy
O padrão Strategy é muito útil quando temos um conjunto de algoritmos similares, e precisamos alternar entre eles em diferentes pedaços da aplicação.

O Strategy nos oferece uma maneira flexível para escrever diversos algoritmos diferentes, e de passar esses algoritmos para classes clientes que precisam deles. Esses clientes desconhecem qual é o algoritmo "real" que está sendo executado, e apenas mandam o algoritmo rodar. Isso faz com que o código da classe cliente fique bastante desacoplado das implementações concretas de algoritmos, possibilitando assim com que esse cliente consiga trabalhar com N diferentes algoritmos sem precisar alterar o seu código.

# Chain of Responsibility
O padrão Chain of Responsibility cai como uma luva quando temos uma lista de comandos a serem executados de acordo com algum cenário em específico, e sabemos também qual o próximo cenário que deve ser validado, caso o anterior não satisfaça a condição.

Nesses casos, o Chain of Responsibility nos possibilita a separação de responsabilidades em classes pequenas e enxutas, e ainda provê uma maneira flexível e desacoplada de juntar esses comportamentos novamente.

# Template Method
Quando temos diferentes algoritmos que possuem estruturas parecidas, o Template Method é uma boa solução. Com ele, conseguimos definir, em um nível mais macro, a estrutura do algoritmo e deixar "buracos", que serão implementados de maneira diferente por cada uma das implementações específicas.

Dessa forma, reutilizamos ao invés de repetirmos código, e facilitamos possíveis evoluções, tanto do algoritmo em sua estrutura macro, quanto dos detalhes do algoritmo, já que cada classe tem sua responsabilidade bem separada.

# Decorator
Sempre que percebemos que temos comportamentos que podem ser compostos por comportamentos de outras classes envolvidas em uma mesma hierarquia, como foi o caso dos impostos, que podem ser composto por outros impostos. O Decorator introduz a flexibilidade na composição desses comportamentos, bastando escolher no momento da instanciação, quais instancias serão utilizadas para realizar o trabalho.

# State
A principal situação que faz emergir o Design Pattern State é a necessidade de implementação de uma máquina de estados. Geralmente, o controle das possíveis transições são vários e complexos, fazendo com que a implementação não seja simples. O State auxilia a manter o controle dos estados simples e organizados através da criação de classes que representem cada estado e saiba controlar as transições.

# Builder
Sempre que tivermos um objeto complexo de ser criado, que possui diversos atributos, ou que possui uma lógica de criação complicada, podemos esconder tudo isso em um Builder.

Além de centralizar o código de criação e facilitar a manutenção, ainda facilitamos a vida das classes que precisam criar essa classe complexa, afinal a interface do Builder tende a ser mais clara e fácil de ser usada.

Geralmente usamos um builder quando precisamos passar diversas informações para a lógica que monta o objeto. No caso da Nota Fiscal, passamos nome, itens, etc.

# Observer
Quando o acoplamento da nossa classe está crescendo, ou quando temos diversas ações diferentes a serem executadas após um determinado processo, podemos implementar o Observer.

Ele permite que diversas ações sejam executadas de forma transparente à classe principal, reduzindo o acoplamento entre essas ações, facilitando a manutenção e evolução do código.

# Factory
Usamos uma fábrica quando temos que isolar o processo de criação de um objeto em um único lugar. Essa fábrica pode descobrir como criar o objeto dentro dela própria, mas geralmente ela não precisa de muitas informações para criar o objeto.

Uma Factory instancia uma classe que é importante/complexa, e seu processo de criação deve ser isolado.

# Flyweight
Um Flyweight serve para quando temos muitas instâncias do mesmo objeto andando pelo sistema, e precisamos economizar. Para tal, o Flyweight faz uso de uma fábrica modificada, que guarda essas instâncias.

A diferença é que o Flyweight garante que existam apenas uma única instância de vários elementos. É um "singleton maior".

# Memento
O Memento é um padrão de projeto que nos ajuda a salvar e restaurar estados de objetos.
Um possível problema deste padrão de projeto é a quantidade de memória que ele pode ocupar, afinal estamos guardando muitas instâncias de objetos que podem ser pesados.

# Interpreter
Quando temos expressões que devem ser avaliadas, e a transformamos em uma estrutura de dados, e depois fazemos com que a própria árvore se avalie, damos o nome de Interpreter.

O padrão é bastante útil quando temos que implementar interpretadores para DSLs, ou coisas similares. É um padrão bem complicado, mas bastante interessante.

# Visitor
Quando temos uma árvore, e precisamos navegar nessa árvore de maneira organizada, podemos usar um Visitor.
É comum inclusive que o código faça sempre referência a uma interface de Visitor, e não de uma classe concreta. Assim, conseguimos trocar facilmente o visitor que visitará a árvore

# Bridge
A ideia da Bridge é justamente ser uma ponte em dois mundos/sistemas. Abstrair a comunicação com um serviço de terceiros.

# Adapter
Quando temos um conjunto de classes legadas, que achamos que seu uso vai sujar o novo sistema, criamos um "adaptador" que facilita sua utilização. O nome desse padrão de projetos é Adapter.
A ideia do Adapter é esconder alguma "sujeira", ou adaptar algo que é diferente e não bate com o sistema atual.
Ele visa adaptar um conjunto de classes que já existem, para uma outra interface, que é a requerida pelo outro sistema.

# Command
Facilita a criação de comandos. Usamos ele quando temos que separar os comandos que serão executados do objeto que ele pertence. Um bom exemplo disso é o uso de filas de trabalho.
A ideia do Command é abstrair um comando que deve ser executado, pois não é possível executá-lo naquele momento (pois precisamos por em uma fila ou coisa do tipo).

# Facade
Uma façade serve como uma frente única para os serviços disponibilizados por um ou mais sub-sistemas, provendo uma maneira mais simples para o seu consumo.
Como essa classe provê acesso a todos os outros sub-sistemas, é bem comum também que não haja mais de uma instância dessa classe espalhada pelo sistema
O Façade cria uma interface amigável para que clientes consigam consumir sub-sistemas (ou serviços)..
É bastante popular, seu uso deve ser feito com cautela. 
Uma Façade tende a ser muito acoplada, e ter uma interface gorda. Façades menores podem até ser úteis, mas também devem ser usadas com parcimônia.

# Singleton
Ele faz com que só exista uma única instância da classe em todo o sistema!
É bastante popular, seu uso deve ser feito com cautela. Quando mal utilizado, acaba por permitir ao usuário a utilização de variáveis globais (que é uma coisa que a programação procedural já mostrou que é problemático).
