import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Informe um numero inteiro: ");
    int num = scanner.nextInt();

    if (num < 2) {
        System.out.printf("não há números primos neste intervalo\n");
    }

    else {
        for (int i = 2; i <= num; i++) {
            if (ehPrimo(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    scanner.close();
}

    boolean ehPrimo(int numero){
        for (int j = 2; j *j <= numero; j++){
            if(numero % j == 0){
                return false;
            }
        }
        return true;
    }

