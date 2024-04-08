package OO5Sobrecarga;

public class Operacao {
    private int nroFatorial = 0;

    private int nroMinuendo = 0;
    private int nroSubtraendo = 0;
    private int nroGenerico1 = 0;
    private int nroGenerico2 = 0;
    public int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }
    public void setMinuendo(int numero){
        this.nroMinuendo = numero;
    }
    public void setSubtraendo(int numero) {
        this.nroSubtraendo = numero;
    }
    public int subtracao() {
        return nroMinuendo - nroSubtraendo;
    }
    public void setFatorial( int numero) {
        this.nroFatorial = numero;
    }
    private

    static public string mensagemEstatica() {
        return "sou um meto estático, Diferente de dinãmico, não preciso ser instanciado! Bem vindo aperte ENTER para continuar!";
    }
}