import java.util.Date;

public class TestePagamento {
    public static void main(String[] args) {
        String nomeCliente = "João da Silva";
        double valorPagamento = 150.00;
        Date dataPagamento = new Date(); // Usando a data e hora atual

        ComprovantePagamento comprovante = new ComprovantePagamento(nomeCliente, valorPagamento, dataPagamento);
        comprovante.imprimirComprovante();
    }
}