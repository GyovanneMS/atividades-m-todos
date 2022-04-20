import java.util.Scanner;

class Ativ{
    public static double somar(double n1, double n2){
        return(n1 + n2);
    }
    public static double subtrair(double n1, double n2){
        return(n1 - n2);
    }
    public static double multiplicar(double n1, double n2){
        return(n1 * n2);
    }
    public static double dividir(double n1, double n2){
    if (n2 == 0){
        return 0;
    }
    return(n1 / n2);
    }
    public static void exibir(){
        
    }
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        double n1 = exibir("Escolha um número: ");
        double n2 = exibir("Escolha outro número: ");

        double so = somar(n1, n2);
        double su = subtrair(n1, n2);
        double mu = multiplicar(n1, n2);
        double di = dividir(n1, n2);

        System.out.println(n1 + " + " + n2 + " = " + so);
        System.out.println(n1 + " - " + n2 + " = " + su);
        System.out.println(n1 + " * " + n2 + " = " + mu);
        if(n2 == 0){
            System.out.println("Divisão impossível de ser feita");
        }
        else{
        System.out.println(n1 + " / " + n2 + " = " + di);
        }
    }
}