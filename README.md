
# Bill-Pugh-Singleton-Counter


Esse projeto foi realizado a pedido do professor Fabio Lucio Meira, no mesmo foi solicitado o uso do Design Pattern Singleton e o uso de Multi-Threads

Como implementação decidi utilizar uma lógica/modificação do mesmo padrão, cujo o único propósito é evitar Race Condition na instância da classe, o mesmo poderia simplemente ser substituído pela keyword ```synchronized```, porém a implementação foi aplicada buscando performance, visto que usar uma classe estática dentro de outra garante graças ao mecanismo da JVM que a mesma será acessada apenas por 1 thread na sua criação. Ou seja, não precisaremos travar repetidamento o método getCounter em toda criação de Thread, evitando gargalo e perda de performance.




## Demonstração

![Saído no terminal](images/250508_22h07m51s_screenshot.png)





## Como Rodar

Você pode rodar o bytecode compilado diretamente ultilizando o comando:

```bash
  java Main
```

No diretório:

```bash
  out/production/singleton/
```

Ou exportar e rodar pela sua IDE de preferência.
## Referência

 - [https://refactoring.guru/pt-br/design-patterns/singleton](https://refactoring.guru/pt-br/design-patterns/singleton)
 - [https://www.w3schools.com/java/java_threads.asp](https://www.w3schools.com/java/java_threads.asp)
 - [https://docs.oracle.com/javase/tutorial/essential/concurrency/](https://docs.oracle.com/javase/tutorial/essential/concurrency/)
 - [https://medium.com/@ajay.kushwaha/bill-pugh-singleton-design-c117d75b8825](https://medium.com/@ajay.kushwaha/bill-pugh-singleton-design-c117d75b8825)
 - [https://www.baeldung.com/java-bill-pugh-singleton-implementation](https://www.baeldung.com/java-bill-pugh-singleton-implementation)


## Autores

- [@PhAr4ujo](https://www.github.com/PhAr4ujo)

