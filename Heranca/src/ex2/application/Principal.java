package ex2.application;

import ex2.entitites.*;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figura figura;
        System.out.println("Forneça uma opção: \n" +
                "1 - Retangulo \n" +
                "2 - Quadrado \n" +
                "3 - Triangulo \n" +
                "4 - Circulo \n" +
                "5 - Sair");
        while(sc.hasNext()){
            int opcao = sc.nextInt();
            //clearBuffer(sc);
            if(opcao == 1){
                retangulo();
            }else{
                if(opcao == 2){
                    quadrado();
                }else{
                    if(opcao == 3){
                        triangulo();
                    }else{
                        if(opcao == 4){
                            circulo();
                        }else{
                            if(opcao == 5){
                                System.out.println("O programa será finalizado...");
                                break;
                            }
                        }
                    }
                }
            }
        }

    }

    private static void retangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você escolheu Retangulo");
        System.out.println("Insira os dados da figura retângulo: ");
        System.out.println("Insira o lado 1: ");
        Double lado1 = sc.nextDouble();
        System.out.println("Insira o lado 2: ");
        Double lado2 = sc.nextDouble();
        System.out.println("Insira a cor da figura: ");
        String cor = sc.next();
        Retangulo retangulo = new Retangulo(lado1, lado2, cor);
        System.out.println(retangulo.toString());
        clearBuffer(sc);
        sc.close();
    }

    private static void quadrado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você escolheu Quadrado");
        System.out.println("Insira os dados da figura quadrado: ");
        System.out.println("Insira o lado: ");
        Double lado1 = sc.nextDouble();
        System.out.println("Insira a cor da figura: ");
        String cor = sc.next();
        Retangulo quadrado = new Quadrado(lado1, cor);
        System.out.println(quadrado.toString());
        clearBuffer(sc);
        sc.close();
    }

    private static void triangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você escolheu Triângulo");
        System.out.println("Insira os dados da figura triângulo: ");
        System.out.println("Insira a base: ");
        double base = sc.nextDouble();
        System.out.println("Insira a altura: ");
        double altura = sc.nextDouble();
        System.out.println("Insira a cor do triângulo: ");
        String cor = sc.next();
        Figura figura = new Triangulo(base, altura, cor);
        System.out.println(figura);
        sc.close();
    }

    private static void circulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você escolheu Circulo");
        System.out.println("Insira os dados da figura circulo: ");
        System.out.println("Insira o raio: ");
        double raio = sc.nextDouble();
        System.out.println("Insira a cor do circulo: ");
        String cor = sc.next();
        Figura figura = new Circulo(raio, cor);
        System.out.println(figura);
        sc.close();
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}
