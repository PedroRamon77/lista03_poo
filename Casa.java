
public class Casa {
	String cor;
    Porta porta1 = new Porta();
    Porta porta2 = new Porta();
    Porta porta3 = new Porta();

    public void cadastrarCasa(String cor,Porta porta1,Porta porta2,Porta porta3){
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }
    public void pintarCasa(String cor){
        this.cor = cor;
        System.out.println("A casa foi pintada com sucesso!");
    }
    public void quantasPortasEstaoAbertas(){
        int portasAberta = 0;
        if(porta1.estaAberta() == true){
            portasAberta = portasAberta+1;
        }
        if(porta2.estaAberta() == true){
            portasAberta = portasAberta+1;
        }
        if(porta3.estaAberta() == true){
            portasAberta = portasAberta+1;
        }
        System.out.println("Quantidade de portas abertas: "+portasAberta);
    }
    public void imprimirCasa(){
        System.out.println("*** Casa ***");
        System.out.println("Cor: "+this.cor);
        System.out.println("Porta 1: "+this.imprimirPorta);
        System.out.println("Porta 2: "+this.imprimirPorta);
        System.out.println("Porta 3: "+this.imprimirPorta);
    }
}