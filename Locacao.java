import java.time.LocalDateTime;

public class Locacao{
    Carro c;
    LocalDateTime dataLocacao;
    LocalDateTime dataDevolucao;
    double valor;
    Cliente cliente;

    publicvoid imprimirLocacao(){
        System.out.println("*** Locacao de Veiculo ***");
        System.out.println("Modelo: "+this.c.modelo);
        System.out.println("Placa: "+this.c.placa);
        System.out.println("Cor: "+this.c.cor);
        System.out.println("Ano: "+this.c.ano);
        System.out.println("Cliente: "+this.cliente);
        System.out.println("Data de Locacao: "+this.dataLocacao);
        System.out.println("Data de Devolucao: "+this.dataDevolucao);
        System.out.println("Valor a pagar: "+this.valor);
    }

}