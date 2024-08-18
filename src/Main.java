public class Main {
    public static void main(String[] args) {


        Maiusculo maiusculo = new Maiusculo();
        System.out.println("\t"+maiusculo.transformar());
        Invert invert = new Invert();
        System.out.println("\t"+invert.inverter());
        Array array = new Array();
        array.mostrar();
        Palindromo palindromo = new Palindromo();
        palindromo.vericar();
        Media media = new Media();
        media.nota();
    }
}
//Exercício 1: Converter para Maiúsculas
// Escreva um programa que converta todos os caracteres de uma string fornecida pelo usuário para maiúsculas.
//Exercício 3: Array de Inteiros**
//Crie um programa que leia 5 números inteiros do usuário e armazene-os em um array. Em seguida, imprima todos os números armazenados no array.
//Exercício 4: Verificação de Palíndromo**
//Crie um programa que solicite ao usuário uma palavra e verifique se a palavra é um palíndromo (uma palavra que se lê da mesma forma de trás para frente).
//Exercício 5: Média de Notas**
//Solicite ao usuário que entre com o número de provas que ele fez. Em seguida, peça para ele inserir as notas de todas as provas. Calcule e imprima a média.