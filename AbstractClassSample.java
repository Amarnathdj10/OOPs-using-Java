abstract class FootballPlayer{

    public String name;

    public FootballPlayer(String name){
        this.name = name;
    }

    public abstract void takeShot();

    public void pass(){

        System.out.println(this.name + " passes the ball");
    }
}

class Striker extends FootballPlayer{

    public Striker(String name){
        super(name);
    }

    @Override
    public void takeShot(){

        System.out.println(this.name + " takes a clean shot into the bottom corner");
    }
}

class Defender extends FootballPlayer{

    public Defender(String name){
        super(name);
    }

    @Override 
    public void takeShot(){

        System.out.println(this.name + " takes an awkward shot into the stands");
    }
}

public class AbstractClassSample {
    public static void main(String[] args) {

        FootballPlayer mbappe = new Striker("Mbappe");
        FootballPlayer vanDijk = new Defender("Van Dijk");

        mbappe.takeShot();
        vanDijk.takeShot();
    }
}   