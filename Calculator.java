public class Calculator{

    public static void main (String args[]){
        int valorDoCarro = 1000;
        int duracaoDoEmprestimo = 3;
        int taxaDeJuros= 5;
        int valorDaEntrada = 2000;
         if(duracaoDoEmprestimo <=0 || taxaDeJuros <=0){
            System.out.println("Erro! você deve fazer emprestimo de um carro válido");
         }
         else if (valorDaEntrada>=valorDoCarro){
            System.out.println("O carro pode ser pago interegralmente");
         }else{
            int saldoRestante = valorDoCarro-valorDaEntrada;
            int numeroDeMeses = duracaoDoEmprestimo*12;
            int saldoMensal = saldoRestante/numeroDeMeses;
            int juros = saldoMensal*taxaDeJuros/100;
            int pagamentoMensal = saldoMensal+juros;
            System.out.println(pagamentoMensal);


         }
    }
}