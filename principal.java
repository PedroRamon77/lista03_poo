
public class principal {

	public static void main(String[] args) {
		/* Programa 01
		Pessoa p1 = new Pessoa();
		
		p1.cadastrarPessoa("Lucas", 18);
		
		p1.imprimirIdade();
		p1.fazAniversario();
		p1.imprimirIdade();
		p1.fazAniversario();
		p1.imprimirIdade();
		*/

		/*Programa 02
		Porta p = new Porta();

		p.cadastrarPorta("Azul",1.80,1,0.25);
		
		p.imprimirPorta();
		p.abrir();
		p.estaAberta();
		p.fechar();
		p.estaAberta();
		p.pintarPorta("vermelha");
		p.imprimirPorta();
		*/

		/*Programna 03
		Casa cs = new Casa();
		Porta pt1 = new Porta();
		Porta pt2 = new Porta(); 
		Porta pt3 = new Porta(); 

		pt1.cadastrarPorta("Azul",1.80,1,0.25);
		pt2.cadastrarPorta("Amarela",1.80,0.8,0.25);
		pt3.cadastrarPorta("Preta",1.80,0.8,0.25);

		cs.cadastrarCasa("Bege",pt1,pt2,pt3);
		cs.imprimirCasa();
		cs.pintarCasa("Ciano");
		cs.imprimirCasa();

		cs.quantasPortasEstaoAbertas();
		pt1.abrir();
		pt3.abrir();
		pt2.fechar();
		cs.quantasPortasEstaoAbertas();*/

		Cliente c = new Cliente();
		Carro car = new Carro(); 
		Locacao loc = new Locacao();

		c.cadastrarCliente("Laura Castelli","02879632144","889963622514");
		car.cadastrarCarro("PNB25","Cinza",2023,"Flex",4,0,"Civic","Honda");
		
		loc.c=carro;
		loc.cliente=c;
		loc.valor = 2500;
		loc.dataLocacao = LocalDateTime.of(2023,10,15,8,0);
		loc.dataDevolucao= LocalDateTime.of(2023,10,25,12,0);
		
		loc.imprimirLocacao();


	}

}
