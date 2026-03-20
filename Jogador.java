public class Jogador extends Elemento
{
    // Atributos
    private Item[] itens = new Item[4]();

    // Construtor
    public Jogador(int tipo, Item[] itens, boolean estado) {
        Elemento(tipo, estado);
        setItens(itens);
    }

    // Getters and Setters
    public Item[] getItens(){
        return this.itens;
    }

    public void setItens(){
        if //
    }

    // Métodos
    public void usarItem(Jogador[] jogadores, int id) {}
}