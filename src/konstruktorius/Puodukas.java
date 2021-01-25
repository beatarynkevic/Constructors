package konstruktorius;

public class Puodukas {
    private char spalva;
    private int turis;
    private int kiekis;
    
    public Puodukas(char spalva, int turis) {
        //super(); visuose konstruktoriuose JAVA automatu iskviecia superi
        this.spalva = spalva;
        this.turis = turis;
        this.kiekis = 0;
    }
    public Puodukas(int turis) {
        this.spalva = 'b';
        this.turis = turis;
        this.kiekis = 0;
    }
    public Puodukas(char spalva) {
        this(spalva, 150); //kvieciu salia esanti konstruktoriu
//        this.spalva = spalva;
//        this.turis = 150;
//        this.kiekis = 0;
    }
    public Puodukas() {
        this('b'); //kvieciu salia esanti konstruktoriu
    }
}
