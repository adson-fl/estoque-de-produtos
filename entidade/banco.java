package entidade;

public class banco {

	public String nome;
	public double pre�o;
	public int quantidade;

	public double totaldovalorestoc() {
		return (pre�o * quantidade);

	}

	public void addproduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerproduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
				+ ",pre�o do produto $ "
				+ String.format("%.2f", pre�o)
				+ ", quantidade "
				+ quantidade
				+ " o tota total do estoque � de:"
				+String.format("%.2f", totaldovalorestoc());
	}
}
