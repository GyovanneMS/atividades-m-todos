import java.util.Scanner;

class Areas{
    public static double quadrado (double l){
        return(Math.pow(l, 2));
    }
    public static double retangulo (double base, double h){
        return(base * h);
    }
    public static double circulo (double raio){
        return(3.14 * Math.pow(raio, 2));
    }
    public static double tNormal(double base, double h){
        return(base * h / 2);
    }
    public static double tCirculoEx(double a, double b, double c, double raio){
        return((a * b * c) / (4 * raio));
    }
    public static double tCirculoIn(double raio, double p){
        return(raio * p);
    }
    public static double grau(double lado1, double lado2, double grau){
        return(lado1 * lado2 * grau / 2);
    }
    public static double tSemip(double p, double a, double b, double c){
        return(Math.sqrt(p * (p-a) * (p-b) * (p-c)));
    }
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        while(true){
            System.out.println("Qual a figura geometrica que sera calculada?");
            String figura = ler.next();
            double resul = 0;

            if(figura.equals("quadrado")){
                System.out.print("Lado: ");
                double lado = ler.nextDouble();
                resul = quadrado(lado);
                System.out.println(resul);
            }
            if(figura.equals("retangulo")){
                System.out.print("Base: ");
                double base = ler.nextDouble();
                System.out.print("Altura: ");
                double h = ler.nextDouble();
                resul = retangulo(base, h);
                System.out.println(resul);
            }
            if(figura.equals("circulo")){
                System.out.print("Raio: ");
                double raio = ler.nextDouble();
                resul = circulo(raio);
                System.out.println(resul);
            }
            if(figura.equals("triangulo")){
                while(true){
                    System.out.print("Qual calculo deseja?\n ");
                    System.out.print("O normal [s/n]\n");
                    String resp = ler.next();
                    if(resp.equals("s")){
                        System.out.print("Base: ");
                        double base = ler.nextDouble();
                        System.out.print("Altura: ");
                        double h = ler.nextDouble();
                        resul = tNormal(base, h);
                        System.out.println(resul);
                        break;
                    }
                    System.out.print("O dentro de um circulo? [s/n]\n");
                    resp = ler.next();
                    if(resp.equals("s")){
                        System.out.print("Lado1: ");
                        double l1 = ler.nextDouble();
                        System.out.print("Lado2: ");
                        double l2 = ler.nextDouble();
                        System.out.print("Lado3: ");
                        double l3 = ler.nextDouble();c
                        System.out.print("Raio: ");
                        double grau = ler.nextDouble();
                        resul = tCirculoEx(l1,l2,l3,raio);
                        System.out.println(resul);
                        break;
                    }
                    System.out.print("O com um circulo dentro? [s/n]\n");
                    resp = ler.next();
                    if(resp.equals("s")){
                        System.out.print("Perimetro: ");
                        double p = ler.nextDouble();
                        System.out.print("Raio: ");
                        double raio = ler.nextDouble();
                        resul = tCirculoIn(raio, p);
                        System.out.println(resul);
                        break;
                    }
                    System.out.print("O com seno? [s/n]\n");
                    resp = ler.next();
                    if(resp.equals("s")){
                        System.out.print("Lado1: ");
                        double l1 = ler.nextDouble();
                        System.out.print("Lado2: ");
                        double l2 = ler.nextDouble();
                        System.out.print("Grau do Seno: ");
                        double grau = ler.nextDouble();
                        resul = grau(l1,l2,grau);
                        System.out.println(resul);
                        break;
                    }
                    System.out.print("O semiperímetro? [s/n]\n");
                    resp = ler.next();
                    if(resp.equals("s")){
                        System.out.print("Semiperimetro: ");
                        double p = ler.nextDouble();
                        System.out.print("Lado1: ");
                        double l1 = ler.nextDouble();
                        System.out.print("Lado2: ");
                        double l2 = ler.nextDouble();
                        System.out.print("lado3: ");
                        double l3 = ler.nextDouble();
                        resul = tCirculoEx(p, l1, l2, l3);
                        System.out.println(resul);
                        break;
                    }
                    System.out.print("Nenhuma das alternativas foi assinaladas, repitir? [s/n]\n");
                    resp = ler.next();
                    if(!resp.equals("s")){
                        System.exit(0);
                    }
                System.out.print("repetir?[s/n]");
                String sn = ler.next();
                if(!sn.equals("s")){
                    break;
                }
                }
            }
        }
    }
}