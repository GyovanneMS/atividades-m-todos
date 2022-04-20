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
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.print("Escolha um número: ");
        double n1 = ler.nextDouble();
        System.out.print("Escolha outro número: ");
        double n2 = ler.nextDouble();

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