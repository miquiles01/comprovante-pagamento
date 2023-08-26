import java.text.SimpleDateFormat;
import java.util.Date;

class ComprovantePagamento {
    private String nomeCliente;
    private double valor;
    private Date dataPagamento;

    public ComprovantePagamento(String nomeCliente, double valor, Date dataPagamento) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
    }

    public void imprimirComprovante() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Comprovante de Pagamento");
        System.out.println("-----------------------");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Valor: R$" + valor);
        System.out.println("Data: " + dateFormat.format(dataPagamento));
        System.out.println("Pagamento concluído com sucesso!");
    }
}


