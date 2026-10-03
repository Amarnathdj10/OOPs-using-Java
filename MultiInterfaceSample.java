interface OutfieldPlayer{
    void sprint();
}

interface PenaltyTaker{
    void takePenalty();
}

interface Captain{
    void motivateTeam();
}

class StarStriker implements OutfieldPlayer, PenaltyTaker, Captain{

    public String name;

    public StarStriker(String name){
        this.name = name;
    }

    @Override 
    public void sprint(){
        System.out.println(this.name + " sprints down the wing");
    }

    @Override 
    public void takePenalty(){
        System.out.println(this.name + " takes a calm and cool penalty");
    }

    @Override 
    public void motivateTeam(){
        System.out.println(this.name + " motivates the team from the front");
    }
}

class Goalkeeper implements Captain{

    public String name;

    public Goalkeeper(String name){
        this.name = name;
    }

    @Override 
    public void motivateTeam(){
        System.out.println(this.name + " motivates the team from the back");
    }
}

public class MultiInterfaceSample{

    public static void main(String[] args) {
        
        StarStriker mbappe = new StarStriker("Mbappe");
        Goalkeeper buffon = new Goalkeeper("Buffon");

        mbappe.sprint();
        buffon.motivateTeam();
        mbappe.motivateTeam();
    }
}