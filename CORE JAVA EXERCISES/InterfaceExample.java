interface Playable { void play(); }

class Guitar implements Playable { public void play() { System.out.println("Strum guitar"); } }
class Piano implements Playable { public void play() { System.out.println("Play piano"); } }

public class InterfaceExample {
    public static void main(String[] args) {
        Playable g = new Guitar();
        Playable p = new Piano();
        g.play(); p.play();
    }
}
