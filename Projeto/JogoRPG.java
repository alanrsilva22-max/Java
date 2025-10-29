package Projeto;

    import java.util.Random;
import java.util.Scanner;

public class JogoRPG {

    static final int MaxHero = 3;
    static String[][] hero = new String[MaxHero][3];
    static double[] xp = new double[MaxHero];
    static int totalHero = 0;
    static boolean logado = false;
    static String heroAtual = "";
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static int sort(int vi, int vf) {
        return random.nextInt(vf - vi + 1) + vi;
    }

    public static void cadastrarHerois() {
        if (totalHero >= MaxHero) {
            System.out.println("Máximo de heróis atingido!");
        } else {
            System.out.print("O nome de seu herói é: ");
            hero[totalHero][0] = sc.nextLine();
            System.out.print("Digite sua senha: ");
            hero[totalHero][1] = sc.nextLine();
            xp[totalHero] = 0;
            totalHero++;
            System.out.println("Herói cadastrado com sucesso!");
        }
    }

    public static boolean login() {
        String nome, senha;

        for (int tentativas = 1; tentativas <= 3; tentativas++) {
            System.out.print("Qual seu login: ");
            nome = sc.nextLine();
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();

            for (int i = 0; i < totalHero; i++) {
                if (hero[i][0].equals(nome) && hero[i][1].equals(senha)) {
                    heroAtual = nome;
                    logado = true;
                    System.out.println("Login efetuado com sucesso!");
                    return true;
                }
            }

            if (tentativas < 3) {
                System.out.println("Herói ou senha incorretos.");
                if (tentativas == 2) {
                    System.out.println("Atenção!! Resta apenas uma tentativa!!");
                }
            }
        }
        System.out.println("Número máximo de tentativas atingido. Encerrando login.");
        return false;
    }

    public static int encontrarIndiceHero(String nome) {
        for (int i = 0; i < totalHero; i++) {
            if (hero[i][0].equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public static double menuTreino() {
        int indice = encontrarIndiceHero(heroAtual);
        if (indice == -1) {
            System.out.println("Erro: herói não encontrado.");
            return 0;
        }

        int opcao;
        do {
            System.out.println("\nTipo de treino:");
            System.out.println("1 - Físico 💪");
            System.out.println("2 - Mana 🧠");
            System.out.println("3 - Resistência 🛡️");
            System.out.println("4 - Retornar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    int sorteado = sort(0, 60);
                    System.out.println("Você realizou o treino e recebeu " + sorteado + " de XP");
                    xp[indice] += sorteado;
                }
                case 2 -> {
                    int sorteado = sort(0, 40);
                    System.out.println("Você realizou o treino e recebeu " + sorteado + " de XP");
                    xp[indice] += sorteado;
                }
                case 3 -> {
                    int sorteado = sort(0, 70);
                    System.out.println("Você realizou o treino e recebeu " + sorteado + " de XP");
                    xp[indice] += sorteado;
                }
                case 4 -> System.out.println("Saindo do treinamento...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
        return xp[indice];
    }

    public static int gerenciaXpBatalha(int qtdXP) {
        int indice = encontrarIndiceHero(heroAtual);
        if (indice == -1) {
            System.out.println("Erro: herói não encontrado.");
            return 0;
        }
        xp[indice] += qtdXP;
        if (xp[indice] <= 0) {
            System.out.println("Sua vida chegou a zero 💀💀💀");
            xp[indice] = 0;
        }
        return (int) xp[indice];
    }

    public static int gerenciaXpLoja(int qtdXP) {
        int indice = encontrarIndiceHero(heroAtual);
        if (indice == -1) {
            System.out.println("Erro: herói não encontrado.");
            return 0;
        }
        xp[indice] += qtdXP;
        if (xp[indice] <= 0) {
            System.out.println("💲Pontos insuficientes, vá treinar ou atacar vilas para conseguir mais pontos💲");
            xp[indice] = 0;
        }
        return (int) xp[indice];
    }

    public static double menuBatalha() {
        int indice = encontrarIndiceHero(heroAtual);
        if (indice == -1) {
            System.out.println("Erro: herói não encontrado.");
            return 0;
        }

        int opcao;
        do {
            System.out.println("\nAonde você quer atacar:");
            System.out.println("1 - Caverna Goblin ⚔️");
            System.out.println("2 - Vila Kobold ⚔️");
            System.out.println("3 - Aldeia Orc ⚔️");
            System.out.println("4 - Recuar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            int sorteado;
            switch (opcao) {
                case 1 -> {
                    sorteado = sort(-20, 50);
                    System.out.println("Você atacou e recebeu " + sorteado + " de XP");
                    gerenciaXpBatalha(sorteado);
                }
                case 2 -> {
                    sorteado = sort(-30, 60);
                    System.out.println("Você atacou e recebeu " + sorteado + " de XP");
                    gerenciaXpBatalha(sorteado);
                }
                case 3 -> {
                    sorteado = sort(-50, 50);
                    System.out.println("Você atacou e recebeu " + sorteado + " de XP");
                    gerenciaXpBatalha(sorteado);
                }
                case 4 -> System.out.println("Saindo da batalha...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
        return xp[indice];
    }

    public static double exibirQtdXp() {
        int indice = encontrarIndiceHero(heroAtual);
        if (indice == -1) {
            System.out.println("Erro: usuário não encontrado.");
            return 0;
        }
        System.out.println("Seu saldo atual é: " + xp[indice]);
        return xp[indice];
    }

    public static double menuLoja() {
        int indice = encontrarIndiceHero(heroAtual);
        if (indice == -1) {
            System.out.println("Erro: herói não encontrado.");
            return 0;
        }

        int opcao;
        do {
            System.out.println("\nLoja:");
            System.out.println("1 - Espada 🗡️ (1600 XP)");
            System.out.println("2 - Arco 🏹 (1200 XP)");
            System.out.println("3 - Escudo 🛡️ (1500 XP)");
            System.out.println("4 - Sair da loja");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Você comprou uma espada velha!");
                    gerenciaXpLoja(-1600);
                }
                case 2 -> {
                    System.out.println("Você comprou um arco surrado!");
                    gerenciaXpLoja(-1200);
                }
                case 3 -> {
                    System.out.println("Você comprou um escudo rachado!");
                    gerenciaXpLoja(-1500);
                }
                case 4 -> System.out.println("Saindo da loja...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        return 0;
    }

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== Bem-vindo à versão beta 0.0.1 do jogo ===");
            System.out.println("1 - Cadastrar herói 👑");
            System.out.println("2 - Fazer login");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrarHerois();
                case 2 -> {
                    if (login()) {
                        int opcao2;
                        do {
                            System.out.println("\n=== O que deseja fazer? ===");
                            System.out.println("1 - Treinar 💪");
                            System.out.println("2 - Atacar ⚔️");
                            System.out.println("3 - Ver XP ✨");
                            System.out.println("4 - Loja 💸");
                            System.out.println("5 - Sair");
                            System.out.print("Escolha uma opção: ");
                            opcao2 = sc.nextInt();
                            sc.nextLine();

                            switch (opcao2) {
                                case 1 -> menuTreino();
                                case 2 -> menuBatalha();
                                case 3 -> exibirQtdXp();
                                case 4 -> menuLoja();
                                case 5 -> {
                                    System.out.println("Saindo...");
                                    logado = false;
                                }
                                default -> System.out.println("Opção inválida.");
                            }
                        } while (logado);
                    }
                }
                case 3 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }
}

