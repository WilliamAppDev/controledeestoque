package controledeestoque;

class RoupaPMG extends Peca1 {
    private int[] tamanhos;

    public RoupaPMG(int indice, String descricao, int[] tamanhos) {
        super(indice, descricao);
        this.tamanhos = tamanhos;
    }

    public int[] getTamanhos() {
        return tamanhos;
    }

    public boolean isTamanhoDisponivel(int tamanho) {
        for (int tam : tamanhos) {
            if (tam == tamanho) {
                return true;
            }
        }
        return false;
    }

    public void venda(int tamanho) {
        for (int i = 0; i < tamanhos.length; i++) {
            if (tamanhos[i] == tamanho) {
                tamanhos[i] = -1;
                break;
            }
        }
    }

    public void reposicaoEstoque() {
        for (int i = 0; i < tamanhos.length; i++) {
            if (tamanhos[i] == -1) {
                tamanhos[i] = 1; // Valor temporário, deveria ser o tamanho real
            }
        }
    }

    public String getDescricaoEIndice() {
		return descricao;

    }

	@Override
	public void venda() {
		// TODO Auto-generated method stub
		
	}

	public void reposicionar(int quantidade) {
		// TODO Auto-generated method stub
		
	}

	public boolean verificarDisponibilidade1(int tamanho) {
		// TODO Auto-generated method stub
		return false;
	}

	public void vender(int tamanho) {
		// TODO Auto-generated method stub
		
	}

	public boolean verificarDisponibilidade(int tamanho) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getDescricaoEIndice11() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getDescricaoEIndice1() {
		// TODO Auto-generated method stub
		return null;
	}
}