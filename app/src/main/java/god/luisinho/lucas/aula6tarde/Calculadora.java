package god.luisinho.lucas.aula6tarde;

/**
 * @author Lukinha god do trabajo e seu humilde servo luisinho
 * @since 06/12/2016 - 13:54
 * @version 1.0
 */

public class Calculadora {

    //variáveis
    private String nome;
    private double num1;
    private double num2;

    //construtor
    public Calculadora() {
    }//fecha construtor vazio

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //calculos
    public double somar(){
        return num1 + num2;
    }//fecha somar

    @Override
    public String toString() {
        return "Nome: "+nome
                +"\nNúmero 1: "+num1
                +"\nNúmero 2: "+num2
                +"\nSoma: "+somar();
    }//fecha toString
}//fecha classe
