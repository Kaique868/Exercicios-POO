import java.util.Scanner;

void main(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Informe o nome do aluno: ");
    String nome = scanner.nextLine();

    System.out.print("Informe a primeira nota: ");
    double nota1= scanner.nextDouble();
    System.out.print("Informe a segunda nota: ");
    double nota2= scanner.nextDouble();
    System.out.print("Informe a terceira nota: ");
    double nota3= scanner.nextDouble();

    int peso1 = 1;
    int peso2 = 1;
    int peso3 = 2;

    double somaProdutos= (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
    double somaPesos = peso1 + peso2 + peso3;
    double mediaFinal = somaProdutos/somaPesos;

    if (mediaFinal>= 7){
        System.out.printf("O aluno %s, atingiu a media: %.2f, Aprovado\n", nome , mediaFinal);
    }
    else{
        System.out.printf("O aluno %s, atingiu a media: %.2f, Não passou\n", nome , mediaFinal);
    }

    scanner.close();

}