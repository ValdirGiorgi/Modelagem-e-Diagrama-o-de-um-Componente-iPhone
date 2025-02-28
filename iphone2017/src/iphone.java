import java.util.Scanner;

public class iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public static void main(String[] args) {
        iphone meuIphone = new iphone();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Selecione uma funcionalidade:");
            System.out.println("1. Tocar música");
            System.out.println("2. Pausar música");
            System.out.println("3. Selecionar música");
            System.out.println("4. Ligar");
            System.out.println("5. Atender");
            System.out.println("6. Iniciar correio de voz");
            System.out.println("7. Exibir página");
            System.out.println("8. Adicionar nova aba");
            System.out.println("9. Atualizar página");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    meuIphone.tocar();
                    break;
                case 2:
                    meuIphone.pausar();
                    break;
                case 3:
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    meuIphone.selecionarMusica(musica);
                    break;
                case 4:
                    System.out.print("Digite o número: ");
                    String numero = scanner.nextLine();
                    meuIphone.ligar(numero);
                    break;
                case 5:
                    meuIphone.atender();
                    break;
                case 6:
                    meuIphone.iniciarCorreioVoz();
                    break;
                case 7:
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    meuIphone.exibirPagina(url);
                    break;
                case 8:
                    meuIphone.adicionarNovaAba();
                    break;
                case 9:
                    meuIphone.atualizarPagina();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
