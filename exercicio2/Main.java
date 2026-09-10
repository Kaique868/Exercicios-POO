import java.util.Scanner;

void main(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Informe um numero: ");
    int num = scanner.nextInt();

    if (num%3 == 0 && num%5 == 0) {
        System.out.printf("multiplo de 3 e 5\n");
    }

    else if (num%3 == 0){
        System.out.printf("multiplo de 3\n");
    }
    else if (num%5 == 0) {
        System.out.printf("multiplo de 5\n");
    }

    else{
        System.out.printf("Não é multiplo de 3 nem de 5\n");
    }
    scanner.close();
}
