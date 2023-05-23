//Crie um algoritmo que receba a altura e peso do usuário, calcule seu IMC e exiba seu valor.
//        OBS:  Fórmula: IMC = peso/ (altura x altura).

import java.text.DecimalFormat;

public class AlgoritmoImc {
    public  static  void main(String[] args){

    double altura = 1.56;
    double peso = 65.5;

    double calculoImc = peso / (altura * altura);

    DecimalFormat formatador = new DecimalFormat("0.00");


    System.out.println("O cálculo final do IMC é: " + calculoImc);

    }
}
