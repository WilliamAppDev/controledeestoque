package controledeestoque;

abstract class Acessorio extends Peca1 {
    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo, double preco) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo, preco);
    }
}