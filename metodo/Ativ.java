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
    public static void exibir(double n1, char op, double n2, double resultado){
        System.out.println(n1 + " " + op + " " + n2 + " = " + resultado);
    }
    public static double receber(String frase){
        Scanner ler = new Scanner(System.in);
        System.out.print(frase);
        double numero = ler.nextDouble();
        return numero;
    }
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        double n1 = receber("Escolha um número: ");
        double n2 = receber("Escolha outro número: ");

        double so = somar(n1, n2);
        double su = subtrair(n1, n2);
        double mu = multiplicar(n1, n2);
        double di = dividir(n1, n2);

        exibir(n1,'+',n2,so);
        exibir(n1,'-',n2,su);
        exibir(n1,'*',n2,mu);
        if(n2 == 0){
            System.out.println("Divisão impossível de ser feita");
        }
        else{
        exibir(n1,'/',n2,di);
        }
    }
}