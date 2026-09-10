# Exercício 5(Resposta)
O `scanner` é uma classe que pertence ao pacote do `java.util`, e para utliza-lo é necessario fazer uma instancia para o fluxo de de entrada padrão, no caso, usando o `(System.in)` no construtor. Dessa forma será possível que programa leia o que for digitado pelo usuario. o `scanner` também possui métodos para ler diferentes tipos de dados, por exemplo: `nextInt()`, `nextFloat()`, `nextLine()`, etc.

Sobre o `System.out.printf` é util por possibilitar intercalar de valores em strings de texto, usando o indicador `%`. Temos:
- `%d`:para valores inteiros(int, long),
- `%f`:para valores reais(double e float),
- `%s`:para textos(string),
- `%n`:quebra a linha assim como o `\n`.
  
Um dos usos dessa classe, é voltado para a formatação de valores `double` onde usando o indicador `%.Nf`(N sendo qualquer numero inteiro, 2 por exemplo), o valor expresso ao ser imprimido irá apresentadas apenas a quantidade de casas decimais estipuladas no indicador (nesse caso 2 casas decimais).

Exemplo de código usando essas classes:


```java
import java.util.Scanner;

void main() {

  Scanner scanner = new Scanner(System.in);

  System.out.print("Digite o preço do produto (ex: 45,90 ou 45.90 conforme seu sistema): ");
    
  double preco = scanner.nextDouble();

  System.out.print("Digite a porcentagem de desconto (ex: 15): ");
  double desconto = scanner.nextDouble();

  double valorFinal = preco - (preco * (desconto / 100.0));

  System.out.printf("%nPreço original: R$ %.2f%n", preco);
  System.out.printf("Desconto aplicado: %.1f%%%n", desconto);
  System.out.printf("Preço final com desconto: R$ %.2f%n", valorFinal);

  scanner.close();
}
```

# Exercicio 6(Resposta)
No código original há dois erros principais, um de sintaxe e outro de lógica.

- O primeiro problema está na assinatura do `main`, mais em especifico,  o parâmetro declarado nele `(String args)`. Para um ponto entrada padrão em java, é exigido que seja drclarado um vetor/array string `(String[])`. Declarar uma string simples pode causar problemas de reconhecimento do método como ponto de entrada pelo JVM.

- O segundo erro está na lógica do while, que tem como condição eternamente verdadeira `(contador <=)=5)`, já que o contador começa com valor 0, porém, não há nenhum incremento para o valor do contador, ou seja, será impresso valor 0 infinitamente.

- Há outro problema na linha: `System.out.println("Contador: " + contador)`, que não apresenta o sinal `;` no final. E também não há o `scanner.close()` no final do código para fechar o scanner.

Código corrigido:
```java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        // O contador é incrementado a cada iteração para evitar o loop infinito
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++; // Incrementa o valor de contador em 1
        }

        scanner.close(); 
    }
}
```
