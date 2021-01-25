package konstruktorius;

public class K2 extends K1 {
    
    private String vardas;
    
    public K2(String vardas){ //pirmoji komanda sio konstruktoriaus iskvietimas K1 konstruktoriu
        this.vardas = vardas;
    }
    
    public K2(){
        //super();
        this(" anonymous"); //iskviecia K2 konstruktoriu su stringu
    }
    
    public void labas() {
        System.out.println("Labas"  + this.vardas);
    }
    public void labas(String kreipinys) {       //overloading?
        System.out.println("Labas"  + kreipinys + this.vardas);
    }
    public void labas(int skaicius) {
        System.out.println("Labas"  + this.vardas +" "+ skaicius);
    }
}
