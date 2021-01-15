package ec.edu.epn.tdd.calculator;

public class Main {
    public static void main(String[] args){
    Calculator c = new Calculator();
        int suma = c.addition(10,4);
        int resta = c.subtraction(10,4);
        System.out.println("la suma final es: "+suma+" .\nla resta final es: "+resta);
    }
}
