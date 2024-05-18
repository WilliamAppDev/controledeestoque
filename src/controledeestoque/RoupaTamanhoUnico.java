package controledeestoque;

class RoupaTamanhoUnico extends Peca1 {
    private int tamanho;

    public RoupaTamanhoUnico(String descricao, int quantidade, int tamanho, double preco) {
        super(descricao, quantidade, 0, 100, preco);
        this.tamanho = tamanho;
    }

    @Override
    public void venda() {
        System.out.println("Venda de " + descricao + ".");
        int quantidade = 0;
		quantidade--;
    }

	@Override
	public void reposicaoEstoque() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescricaoEIndice11() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getDescricaoEIndice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getDescricaoEIndice1() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}