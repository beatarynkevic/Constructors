package konstruktorius;

public class K3 extends K2 {
     //jeigu bent viena konstruktoriu aprasem aukstesneje klaseje
    double r;
    
    public K3() {
        //super(); bus savybe vardas is K2
        r = Math.random();
    }
    
    public double getR() {
        return r;
    }
    
    public void labas(boolean arTikrai) {
        if (arTikrai) {
        
    }
        System.out.println("pakeitem labas");
    }
}
