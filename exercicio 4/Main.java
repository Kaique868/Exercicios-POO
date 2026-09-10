import java.util.Scanner;

void main(){
    Scanner scanner = new Scanner(System.in);
    int numeros[] = new int[5];

    for(int i = 0; i <5; i++) {
        System.out.print("digite um número:\n");
        numeros[i] = scanner.nextInt();
    }
    System.out.print("-----Resultado-----\n");

    for (int i=0; i<5; i++) {
        for (int j = 0; j < numeros[i]; j++) {
            System.out.printf("*");
        }
        System.out.println();
    }

    scanner.close();
}
