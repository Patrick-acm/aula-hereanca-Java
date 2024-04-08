package 0055obrecarga;

import java.util.scanner;

public class Calculadora {

   public static void main(String[] args){


     
    Scanner teclado = new Scanner(System.in);
    System.ou.println("digite a operação;\n"
                     +"1-adição dois valores inteiros\n"
                     +"2-subtração\n"
                     +"3-multiplicação\n"
                     +"4-divisão\n"
                     +"5-exponeciação\n" 
                     +"6-fatorial\n"
                     +"7-adição três valores\n"
                     +"8-adição doi valores texto\n")
    int tipo = teclado.nextInt();
    System.out.println("digite o valor 1:");
    int valor1 = teclado.nextInt();
    int valor2 = 0;
    if (tipo !=6) {
        System.out.println("Digite o valor 2:");
        valor2 = teclado.nextInt();
    }
    teclado.close();

    Operacao operacao = new Operacao ();

    switch(tipo) {
        case 1 System.out.println("Adição 2 valores inteiros="+operacao.soma(valor1, valor2)); break;

        case 2 : operacao.setMinuendo(valor1);
        operacao.setsubtraendo(valor2);
        System.out.println("subtração="=operacao.subtracao());
        break;

        case 3 : operacao.setnumerogenerico1(valor1);
                  operacao.setnumerogenerico2(valor2);
        System.out.println("Multiplicação="+(valor1*valor2));
        break;

        case 4 :  operacao.setnumerogenerico1(valor1);
                  operacao.setnumerogenerico2(valor2);
        System.out.println("divisão="+(valor1/valor2));
        break;

        case 5 : System.outprintln("exponenciação="); break;

        case 6 : opracao.setFatorial(valor1);
        System.out.println("fatorial="+operacao.getFatorial());
        break;

        case 7 : System.out.println("adição 3 valores="+operacao.soma(valor1, valor2, 78)); break;
        case 8 : System.out.println("adição 2 valores="+operacao.soma(integer.toString(valor1), integer.toString(valor2))); break;
        default : System.out.println("Operção inválida");
    }
   }
}