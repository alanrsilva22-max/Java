package TimeFutebol;

public class TimeDeFutebol {
    String nomeDoTime;
    Jogador[] jogadores = new Jogador[11];
    int vagasOcupadas = 0;
    public TimeDeFutebol(String nome, String posi) {
        this.nomeDoTime = nomeDoTime;
    }
    public void contratarJogador(Jogador novoJogador){
        if(vagasOcupadas < jogadores.length){
            jogadores[vagasOcupadas] = novoJogador;
            vagasOcupadas++;
            System.out.println("O jogador " + novoJogador.nome + " foi contratado! ");
        }else{
            System.out.println("Não há vagas no time.");
        }
    }
    public void exibirEscalacao(){
        System.out.println(" ----- ESCALAÇÃO DO TIME ----- ");
        for(int i = 0; i < vagasOcupadas; i++){
            System.out.printf("%d - nome %s | posicao %s \n", i+1, jogadores[i].nome, jogadores[i].posicao);
        }
    }
}
