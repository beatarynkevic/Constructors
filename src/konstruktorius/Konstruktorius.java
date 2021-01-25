package konstruktorius;

public class Konstruktorius {

    public static void main(String[] args) {
        K1 k = new K1();
        K2 kk = new K2();
        K3 kkk = new K3();
        Object o = kkk; //bet kas gali buti 
        
        kk.labas(); //iskvieciam metoda
        kk.labas(" lalala"); //overloading?
        kk.labas(8);
        
        
        System.out.println(kkk.getR());
        System.out.println("pabaiga");
        
        Puodukas p = new Puodukas(300);
        System.out.println(p);
    }
    
}
