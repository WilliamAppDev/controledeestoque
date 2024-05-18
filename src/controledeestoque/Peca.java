package controledeestoque;

abstract class Peca1 {
    private int indice;
    protected String descricao;

    public Peca1(int indice, String descricao) {
        this.indice = indice;
        this.descricao = descricao;
    }

    public Peca1(String descricao2, int quantidade, int estoqueMinimo, int estoqueMaximo, double preco) {
		// TODO Auto-generated constructor stub
	}

	public void Peca11(int indice2, String descricao2) {
		// TODO Auto-generated constructor stub
	}

	public void Peca(int indice2, String descricao2) {
		// TODO Auto-generated constructor stub
	}

	public int getIndice() {
        return indice;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract void venda();
    public abstract void reposicaoEstoque();
    public abstract String getDescricaoEIndice11();

	protected abstract String getDescricaoEIndice();

	protected abstract String getDescricaoEIndice1();
}