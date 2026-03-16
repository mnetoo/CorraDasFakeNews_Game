public class Tabuleiro
{
    //Atributos
    private Posicao[] setorNormal;
    private Posicao[] setorRestrito;
    private Posicao[][] posicaoJogador;
    private Posicao[][] posicaoItens;
    private Posicao[][] posicaoFakeNews;

    // Construtor
    public Tabuleiro() {}

    // Getters
    // Setters

    // Métodos
    public void moverJogador(Jogador[] jogadores, int id, int novo_x, int novo_y) {}
    public void posicionarItens(Item[] itens) {}
    public void posicionarFakeNews( FakeNews[] fakeNews) {}
}