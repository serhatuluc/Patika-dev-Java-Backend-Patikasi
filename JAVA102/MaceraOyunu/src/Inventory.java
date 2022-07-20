import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inventory {
    private Weapon weapon;
    private Armour armour;
    private ArrayList<String> needs = new ArrayList<String>();

    public Inventory() {
        this.weapon = new Weapon("Yumruk",-1,0,0);
        this.armour = new Armour(-1,"Paçavra",0,0);
    }

    public ArrayList<String> getNeeds() {
        return needs;
    }

    public void setNeeds(String need) {
        this.needs.add(need);
    }
    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
