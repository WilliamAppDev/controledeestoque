package controledeestoque;


import java.util.Scanner;

public class VendaReposicaoEstoque {
    public static void main(String[] args) {
        Peca1[] itens = new Peca1[3];
        itens[0] = new RoupaPMG(0, "(1)Camiseta", new int[]{10, 12, 14});
        itens[1] = new RoupaPMG(1, "(2)Calça", new int[]{30, 32, 34});
        itens[2] = new RoupaPMG(2, "(3)Regata", new int[]{36, 38, 40});

        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Exibir itens disponíveis");
            System.out.println("2 - Vender item");
            System.out.println("3 - Reposicionar estoque");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    for (Peca1 item : itens) {
                        if (item != null) {
                            System.out.println(item.getDescricaoEIndice());
                        }
                    }
                    break;

                case 2:
                    int indice;
                    int tamanho;

                    System.out.print("Digite o índice da peça: ");
                    indice = scanner.nextInt();
                    System.out.print("Digite o tamanho da peça: ");
                    tamanho = scanner.nextInt();

                    if (itens[indice] != null && itens[indice] instanceof RoupaPMG) {
                        RoupaPMG roupa = (RoupaPMG) itens[indice];
                        if (roupa.verificarDisponibilidade(tamanho)) {
                            roupa.vender(tamanho);
                            System.out.println("Venda efetuada com sucesso!");
                        } else {
                            System.out.println("Não há unidades disponíveis no tamanho escolhido.");
                        }
                    } else {
                        System.out.println("Índice inválido ou item não é uma roupa.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o índice da peça: ");
                    indice = scanner.nextInt();
                    System.out.print("Digite a quantidade a reposicionar: ");
                    int quantidade = scanner.nextInt();

                    if (itens[indice] != null && itens[indice] instanceof RoupaPMG) {
                        RoupaPMG roupa = (RoupaPMG) itens[indice];
                        roupa.reposicionar(quantidade);
                        System.out.println("Reposição efetuada com sucesso!");
                    } else {
                        System.out.println("Índice inválido ou item não é uma roupa.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }
}