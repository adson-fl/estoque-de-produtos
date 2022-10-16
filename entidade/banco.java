package entidade;

public class banco {

	public String nome;
	public double preço;
	public int quantidade;

	public double totaldovalorestoc() {
		return (preço * quantidade);

	}

	public void addproduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerproduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
				+ ",preço do produto $ "
				+ String.format("%.2f", preço)
				+ ", quantidade "
				+ quantidade
				+ " o tota total do estoque é de:"
				+String.format("%.2f", totaldovalorestoc());
	}
}
