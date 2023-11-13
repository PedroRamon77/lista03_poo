
public class Porta {
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	public void cadastrarPorta(String cor,double dimensaoX,double dimensaoY,double dimensaoZ) {
		this.cor=cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}
	public void abrir() {
		this.aberta = true;
	}
	public void fechar() {
		this.aberta = false;
	}
	public void pintarPorta(String cor){
		this.cor=cor;
		System.out.println("Porta foi pintada com sucesso!");
	}
	public void estaAberta() {
		if(this.aberta==false) {
			System.out.println("Porta esta FECHADA!");
		}else {
			System.out.println("Porta esta ABERTA!");}
	}
	public void imprimirPorta(){
		System.out.println("Cor: "+this.cor);
		System.out.println("Dimensao X: "+this.dimensaoX);
		System.out.println("Dimensao Y: "+this.dimensaoY);
		System.out.println("Dimensao Z: "+this.dimensaoZ);
	}
}
